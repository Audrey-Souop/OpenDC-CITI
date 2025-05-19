/*
 * Copyright (c) 2025 AtLarge Research
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

package org.opendc.compute.simulator.scheduler.weights

import org.opendc.compute.simulator.service.HostView
import org.opendc.compute.simulator.service.ServiceTask

/**
 * A [HostWeigher] that weighs the hosts based on their CPU utilization.
 *
 * @param multiplier Weight adjustment factor.
 */
public class CpuUtilizationWeigher(override val multiplier: Double = 1.0) : HostWeigher {
    // calculates the weight based on the CPU utilization of the host.
    override fun getWeight(
        host: HostView,
        task: ServiceTask,
    ): Double {
        // Normalize CPU utilization (assuming it is a value between 0 and 1, where 0 is 0% and 1 is 100%)
        val cpuUtilization = host.cpuUtilization
        // The weight is derived by subtracting the CPU utilization from 1.0 to invert the value (lower utilization results in higher weight)
        // The result is then multiplied by the multiplier which can be used to adjust the weight.
        return (1.0 - cpuUtilization) * multiplier
    }

    override fun toString(): String = "CpuUtilizationWeigher"
}
