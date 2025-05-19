/*
 * Copyright (c) 2022 AtLarge Research
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.opendc.compute.simulator.service;

import org.opendc.compute.simulator.host.SimHost;
import org.opendc.compute.simulator.telemetry.HostCpuStats;

/**
 * A view of a {@link SimHost} as seen from the {@link ComputeService}.
 */
public class HostView {
    private final SimHost host;
    int instanceCount;
    long availableMemory;
    int provisionedCores;
    double cpuCapacity;
    // double cpuUtilization;

    /**
     * Scheduler bookkeeping
     * Use by schedulers which use a priority queue data structure
     * to keep track of the order of hosts to scheduler tasks on.
     * {@link MemorizingScheduler} for example.
     * MemorizingScheduler has an array of lists
     * The 0th index of the array has a list of hosts with 0 tasks,
     * 1st index of the array has hosts with 1 task, and so on.
     * The priorityIndex points to the index of this the list this host
     * belongs to in the array.
     * The listIndex is the position of this host in the list.
     */
    public int priorityIndex;

    public int listIndex;

    /**
     * Construct a {@link HostView} instance.
     *
     * @param host The host to create a view of.
     */
    public HostView(SimHost host) {
        this.host = host;
        this.availableMemory = host.getModel().memoryCapacity();
        this.cpuCapacity = host.getModel().cpuCapacity();
        // this.cpuUtilization = host.getCpuStats().idleTime();

    }

    /**
     * The {@link SimHost} this is a view of.
     */
    public SimHost getHost() {
        return host;
    }

    /**
     * Return the number of instances on this host.
     */
    public int getInstanceCount() {
        return instanceCount;
    }

    /**
     * Return the available memory of the host.
     */
    public long getAvailableMemory() {
        return availableMemory;
    }

    /**
     * Return the provisioned cores on the host.
     */
    public int getProvisionedCores() {
        return provisionedCores;
    }

    public double getCpuCapacity() {
        return cpuCapacity;
    }

    /**
     * Return the CPU utilization of the host.
     * CPU utilization is typically represented as a ratio of the current CPU supply to the CPU limit.
     */
    /**
     * Get the current CPU utilization of the host.
     * @return The CPU utilization as a ratio between 0 and 1
     */
    public double getCpuUtilization() {
        HostCpuStats stats = host.getCpuStats();
        return stats.utilization();
    }
    //    public double getCpuUtilization() {
    //        return cpuUtilization;
    //    }

    @Override
    public String toString() {
        return "HostView[host=" + host + "]";
    }
}
