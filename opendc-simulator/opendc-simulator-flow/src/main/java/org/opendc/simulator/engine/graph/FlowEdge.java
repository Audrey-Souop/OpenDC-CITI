/*
 * Copyright (c) 2024 AtLarge Research
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

package org.opendc.simulator.engine.graph;

/**
 * An edge that connects two FlowStages.
 * A connection between FlowStages always consist of a FlowStage that demands
 * something, and a FlowStage that Delivers something
 * For instance, this could be the connection between a workload, and its machine
 */
public class FlowEdge {
    private FlowConsumer consumer;
    private FlowSupplier supplier;

    private int consumerIndex = -1;
    private int supplierIndex = -1;

    private double demand = 0.0;
    private double supply = 0.0;

    private double capacity;

    public enum NodeType {
        CONSUMING,
        SUPPLYING
    }

    public FlowEdge(FlowConsumer consumer, FlowSupplier supplier) {
        if (!(consumer instanceof FlowNode)) {
            throw new IllegalArgumentException("Flow consumer is not a FlowNode");
        }
        if (!(supplier instanceof FlowNode)) {
            throw new IllegalArgumentException("Flow consumer is not a FlowNode");
        }

        this.consumer = consumer;
        this.supplier = supplier;

        this.capacity = supplier.getCapacity();

        this.consumer.addSupplierEdge(this);
        this.supplier.addConsumerEdge(this);
    }

    public void close() {
        if (this.consumer != null) {
            this.consumer.removeSupplierEdge(this);
            this.consumer = null;
        }

        if (this.supplier != null) {
            this.supplier.removeConsumerEdge(this);
            this.supplier = null;
        }
    }

    /**
     * Close the edge of the specified node type.
     *
     * @param nodeType The type of connected node that is being closed.
     */
    public void close(NodeType nodeType) {
        if (nodeType == NodeType.CONSUMING) {
            this.consumer = null;
            this.supplier.removeConsumerEdge(this);
            this.supplier = null;
        }
        if (nodeType == NodeType.SUPPLYING) {
            this.supplier = null;
            this.consumer.removeSupplierEdge(this);
            this.consumer = null;
        }
    }

    public FlowConsumer getConsumer() {
        return consumer;
    }

    public FlowSupplier getSupplier() {
        return supplier;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDemand() {
        return this.demand;
    }

    public double getSupply() {
        return this.supply;
    }

    public int getConsumerIndex() {
        return consumerIndex;
    }

    public void setConsumerIndex(int consumerIndex) {
        this.consumerIndex = consumerIndex;
    }

    public int getSupplierIndex() {
        return supplierIndex;
    }

    public void setSupplierIndex(int supplierIndex) {
        this.supplierIndex = supplierIndex;
    }

    /**
     * Push new demand from the Consumer to the Supplier
     */
    public void pushDemand(double newDemand, boolean forceThrough) {
        if ((newDemand == this.demand) && !forceThrough) {
            return;
        }

        this.demand = newDemand;
        this.supplier.handleIncomingDemand(this, newDemand);
    }

    /**
     * Push new demand from the Consumer to the Supplier
     */
    public void pushDemand(double newDemand) {
        this.pushDemand(newDemand, false);
    }

    /**
     * Push new supply from the Supplier to the Consumer
     */
    public void pushSupply(double newSupply, boolean forceThrough) {
        if ((newSupply == this.supply) && !forceThrough) {
            return;
        }

        this.supply = newSupply;
        this.consumer.handleIncomingSupply(this, newSupply);
    }

    /**
     * Push new supply from the Supplier to the Consumer
     */
    public void pushSupply(double newSupply) {
        this.pushSupply(newSupply, false);
    }
}
