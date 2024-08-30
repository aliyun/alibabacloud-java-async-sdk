// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeGPUMetric} extends {@link TeaModel}
 *
 * <p>NodeGPUMetric</p>
 */
public class NodeGPUMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.NameInMap("GPUCount")
    private Integer GPUCount;

    @com.aliyun.core.annotation.NameInMap("GPUMetrics")
    private java.util.List < GPUMetric > GPUMetrics;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("MemoryUtil")
    private Float memoryUtil;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("TotalMemory")
    private Float totalMemory;

    @com.aliyun.core.annotation.NameInMap("UsedMemory")
    private Float usedMemory;

    private NodeGPUMetric(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.GPUCount = builder.GPUCount;
        this.GPUMetrics = builder.GPUMetrics;
        this.GPUType = builder.GPUType;
        this.memoryUtil = builder.memoryUtil;
        this.nodeId = builder.nodeId;
        this.nodeType = builder.nodeType;
        this.totalMemory = builder.totalMemory;
        this.usedMemory = builder.usedMemory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeGPUMetric create() {
        return builder().build();
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return GPUCount
     */
    public Integer getGPUCount() {
        return this.GPUCount;
    }

    /**
     * @return GPUMetrics
     */
    public java.util.List < GPUMetric > getGPUMetrics() {
        return this.GPUMetrics;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return memoryUtil
     */
    public Float getMemoryUtil() {
        return this.memoryUtil;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return totalMemory
     */
    public Float getTotalMemory() {
        return this.totalMemory;
    }

    /**
     * @return usedMemory
     */
    public Float getUsedMemory() {
        return this.usedMemory;
    }

    public static final class Builder {
        private String acceleratorType; 
        private Integer GPUCount; 
        private java.util.List < GPUMetric > GPUMetrics; 
        private String GPUType; 
        private Float memoryUtil; 
        private String nodeId; 
        private String nodeType; 
        private Float totalMemory; 
        private Float usedMemory; 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * GPUCount.
         */
        public Builder GPUCount(Integer GPUCount) {
            this.GPUCount = GPUCount;
            return this;
        }

        /**
         * GPUMetrics.
         */
        public Builder GPUMetrics(java.util.List < GPUMetric > GPUMetrics) {
            this.GPUMetrics = GPUMetrics;
            return this;
        }

        /**
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * MemoryUtil.
         */
        public Builder memoryUtil(Float memoryUtil) {
            this.memoryUtil = memoryUtil;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * TotalMemory.
         */
        public Builder totalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }

        /**
         * UsedMemory.
         */
        public Builder usedMemory(Float usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }

        public NodeGPUMetric build() {
            return new NodeGPUMetric(this);
        } 

    } 

}
