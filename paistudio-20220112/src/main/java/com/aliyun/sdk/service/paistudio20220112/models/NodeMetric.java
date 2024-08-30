// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeMetric} extends {@link TeaModel}
 *
 * <p>NodeMetric</p>
 */
public class NodeMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List < Metric > metrics;

    @com.aliyun.core.annotation.NameInMap("NodeID")
    private String nodeID;

    private NodeMetric(Builder builder) {
        this.GPUType = builder.GPUType;
        this.metrics = builder.metrics;
        this.nodeID = builder.nodeID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeMetric create() {
        return builder().build();
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return metrics
     */
    public java.util.List < Metric > getMetrics() {
        return this.metrics;
    }

    /**
     * @return nodeID
     */
    public String getNodeID() {
        return this.nodeID;
    }

    public static final class Builder {
        private String GPUType; 
        private java.util.List < Metric > metrics; 
        private String nodeID; 

        /**
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List < Metric > metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * NodeID.
         */
        public Builder nodeID(String nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public NodeMetric build() {
            return new NodeMetric(this);
        } 

    } 

}
