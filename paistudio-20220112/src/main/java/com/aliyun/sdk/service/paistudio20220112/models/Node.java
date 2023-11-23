// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Node} extends {@link TeaModel}
 *
 * <p>Node</p>
 */
public class Node extends TeaModel {
    @NameInMap("AcceleratorType")
    private String acceleratorType;

    @NameInMap("BoundQuotas")
    private java.util.List < QuotaIdName > boundQuotas;

    @NameInMap("CPU")
    private String CPU;

    @NameInMap("CreatorId")
    private String creatorId;

    @NameInMap("GPU")
    private String GPU;

    @NameInMap("GPUType")
    private String GPUType;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtExpiredTime")
    private String gmtExpiredTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("IsBound")
    private Boolean isBound;

    @NameInMap("MachineGroupId")
    private String machineGroupId;

    @NameInMap("Memory")
    private String memory;

    @NameInMap("NodeName")
    private String nodeName;

    @NameInMap("NodeStatus")
    private String nodeStatus;

    @NameInMap("NodeType")
    private String nodeType;

    @NameInMap("OrderStatus")
    private String orderStatus;

    @NameInMap("ReasonCode")
    private String reasonCode;

    @NameInMap("ReasonMessage")
    private String reasonMessage;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ResourceGroupName")
    private String resourceGroupName;

    private Node(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.boundQuotas = builder.boundQuotas;
        this.CPU = builder.CPU;
        this.creatorId = builder.creatorId;
        this.GPU = builder.GPU;
        this.GPUType = builder.GPUType;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtExpiredTime = builder.gmtExpiredTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.isBound = builder.isBound;
        this.machineGroupId = builder.machineGroupId;
        this.memory = builder.memory;
        this.nodeName = builder.nodeName;
        this.nodeStatus = builder.nodeStatus;
        this.nodeType = builder.nodeType;
        this.orderStatus = builder.orderStatus;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Node create() {
        return builder().build();
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return boundQuotas
     */
    public java.util.List < QuotaIdName > getBoundQuotas() {
        return this.boundQuotas;
    }

    /**
     * @return CPU
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return GPU
     */
    public String getGPU() {
        return this.GPU;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtExpiredTime
     */
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return isBound
     */
    public Boolean getIsBound() {
        return this.isBound;
    }

    /**
     * @return machineGroupId
     */
    public String getMachineGroupId() {
        return this.machineGroupId;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return nodeStatus
     */
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder {
        private String acceleratorType; 
        private java.util.List < QuotaIdName > boundQuotas; 
        private String CPU; 
        private String creatorId; 
        private String GPU; 
        private String GPUType; 
        private String gmtCreateTime; 
        private String gmtExpiredTime; 
        private String gmtModifiedTime; 
        private Boolean isBound; 
        private String machineGroupId; 
        private String memory; 
        private String nodeName; 
        private String nodeStatus; 
        private String nodeType; 
        private String orderStatus; 
        private String reasonCode; 
        private String reasonMessage; 
        private String resourceGroupId; 
        private String resourceGroupName; 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * BoundQuotas.
         */
        public Builder boundQuotas(java.util.List < QuotaIdName > boundQuotas) {
            this.boundQuotas = boundQuotas;
            return this;
        }

        /**
         * CPU.
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * GPU.
         */
        public Builder GPU(String GPU) {
            this.GPU = GPU;
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
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtExpiredTime.
         */
        public Builder gmtExpiredTime(String gmtExpiredTime) {
            this.gmtExpiredTime = gmtExpiredTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * IsBound.
         */
        public Builder isBound(Boolean isBound) {
            this.isBound = isBound;
            return this;
        }

        /**
         * MachineGroupId.
         */
        public Builder machineGroupId(String machineGroupId) {
            this.machineGroupId = machineGroupId;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * NodeStatus.
         */
        public Builder nodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
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
         * OrderStatus.
         */
        public Builder orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Node build() {
            return new Node(this);
        } 

    } 

}
