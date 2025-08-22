// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Node} extends {@link TeaModel}
 *
 * <p>Node</p>
 */
public class Node extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.NameInMap("AllocatableCPU")
    private String allocatableCPU;

    @com.aliyun.core.annotation.NameInMap("AllocatableMemory")
    private String allocatableMemory;

    @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
    private String availabilityZone;

    @com.aliyun.core.annotation.NameInMap("BoundQuotas")
    private java.util.List<QuotaIdName> boundQuotas;

    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("GPUMemory")
    private String GPUMemory;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtExpiredTime")
    private String gmtExpiredTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("HyperZone")
    private String hyperZone;

    @com.aliyun.core.annotation.NameInMap("IsBound")
    private Boolean isBound;

    @com.aliyun.core.annotation.NameInMap("LimitCPU")
    private String limitCPU;

    @com.aliyun.core.annotation.NameInMap("LimitGPU")
    private String limitGPU;

    @com.aliyun.core.annotation.NameInMap("LimitMemory")
    private String limitMemory;

    @com.aliyun.core.annotation.NameInMap("MachineGroupId")
    private String machineGroupId;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("NodeStatus")
    private String nodeStatus;

    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private String orderStatus;

    @com.aliyun.core.annotation.NameInMap("PodNum")
    private Long podNum;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RequestCPU")
    private String requestCPU;

    @com.aliyun.core.annotation.NameInMap("RequestGPU")
    private String requestGPU;

    @com.aliyun.core.annotation.NameInMap("RequestMemory")
    private String requestMemory;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @com.aliyun.core.annotation.NameInMap("SystemReservedCPU")
    private String systemReservedCPU;

    @com.aliyun.core.annotation.NameInMap("SystemReservedMemory")
    private String systemReservedMemory;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<UserInfo> users;

    @com.aliyun.core.annotation.NameInMap("WorkloadNum")
    private Long workloadNum;

    private Node(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.allocatableCPU = builder.allocatableCPU;
        this.allocatableMemory = builder.allocatableMemory;
        this.availabilityZone = builder.availabilityZone;
        this.boundQuotas = builder.boundQuotas;
        this.CPU = builder.CPU;
        this.creatorId = builder.creatorId;
        this.GPU = builder.GPU;
        this.GPUMemory = builder.GPUMemory;
        this.GPUType = builder.GPUType;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtExpiredTime = builder.gmtExpiredTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.hyperZone = builder.hyperZone;
        this.isBound = builder.isBound;
        this.limitCPU = builder.limitCPU;
        this.limitGPU = builder.limitGPU;
        this.limitMemory = builder.limitMemory;
        this.machineGroupId = builder.machineGroupId;
        this.memory = builder.memory;
        this.nodeName = builder.nodeName;
        this.nodeStatus = builder.nodeStatus;
        this.nodeType = builder.nodeType;
        this.orderStatus = builder.orderStatus;
        this.podNum = builder.podNum;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestCPU = builder.requestCPU;
        this.requestGPU = builder.requestGPU;
        this.requestMemory = builder.requestMemory;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceGroupName = builder.resourceGroupName;
        this.systemReservedCPU = builder.systemReservedCPU;
        this.systemReservedMemory = builder.systemReservedMemory;
        this.users = builder.users;
        this.workloadNum = builder.workloadNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Node create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return allocatableCPU
     */
    public String getAllocatableCPU() {
        return this.allocatableCPU;
    }

    /**
     * @return allocatableMemory
     */
    public String getAllocatableMemory() {
        return this.allocatableMemory;
    }

    /**
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * @return boundQuotas
     */
    public java.util.List<QuotaIdName> getBoundQuotas() {
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
     * @return GPUMemory
     */
    public String getGPUMemory() {
        return this.GPUMemory;
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
     * @return hyperZone
     */
    public String getHyperZone() {
        return this.hyperZone;
    }

    /**
     * @return isBound
     */
    public Boolean getIsBound() {
        return this.isBound;
    }

    /**
     * @return limitCPU
     */
    public String getLimitCPU() {
        return this.limitCPU;
    }

    /**
     * @return limitGPU
     */
    public String getLimitGPU() {
        return this.limitGPU;
    }

    /**
     * @return limitMemory
     */
    public String getLimitMemory() {
        return this.limitMemory;
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
     * @return podNum
     */
    public Long getPodNum() {
        return this.podNum;
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
     * @return requestCPU
     */
    public String getRequestCPU() {
        return this.requestCPU;
    }

    /**
     * @return requestGPU
     */
    public String getRequestGPU() {
        return this.requestGPU;
    }

    /**
     * @return requestMemory
     */
    public String getRequestMemory() {
        return this.requestMemory;
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

    /**
     * @return systemReservedCPU
     */
    public String getSystemReservedCPU() {
        return this.systemReservedCPU;
    }

    /**
     * @return systemReservedMemory
     */
    public String getSystemReservedMemory() {
        return this.systemReservedMemory;
    }

    /**
     * @return users
     */
    public java.util.List<UserInfo> getUsers() {
        return this.users;
    }

    /**
     * @return workloadNum
     */
    public Long getWorkloadNum() {
        return this.workloadNum;
    }

    public static final class Builder {
        private String acceleratorType; 
        private String allocatableCPU; 
        private String allocatableMemory; 
        private String availabilityZone; 
        private java.util.List<QuotaIdName> boundQuotas; 
        private String CPU; 
        private String creatorId; 
        private String GPU; 
        private String GPUMemory; 
        private String GPUType; 
        private String gmtCreateTime; 
        private String gmtExpiredTime; 
        private String gmtModifiedTime; 
        private String hyperZone; 
        private Boolean isBound; 
        private String limitCPU; 
        private String limitGPU; 
        private String limitMemory; 
        private String machineGroupId; 
        private String memory; 
        private String nodeName; 
        private String nodeStatus; 
        private String nodeType; 
        private String orderStatus; 
        private Long podNum; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestCPU; 
        private String requestGPU; 
        private String requestMemory; 
        private String resourceGroupId; 
        private String resourceGroupName; 
        private String systemReservedCPU; 
        private String systemReservedMemory; 
        private java.util.List<UserInfo> users; 
        private Long workloadNum; 

        private Builder() {
        } 

        private Builder(Node model) {
            this.acceleratorType = model.acceleratorType;
            this.allocatableCPU = model.allocatableCPU;
            this.allocatableMemory = model.allocatableMemory;
            this.availabilityZone = model.availabilityZone;
            this.boundQuotas = model.boundQuotas;
            this.CPU = model.CPU;
            this.creatorId = model.creatorId;
            this.GPU = model.GPU;
            this.GPUMemory = model.GPUMemory;
            this.GPUType = model.GPUType;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtExpiredTime = model.gmtExpiredTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.hyperZone = model.hyperZone;
            this.isBound = model.isBound;
            this.limitCPU = model.limitCPU;
            this.limitGPU = model.limitGPU;
            this.limitMemory = model.limitMemory;
            this.machineGroupId = model.machineGroupId;
            this.memory = model.memory;
            this.nodeName = model.nodeName;
            this.nodeStatus = model.nodeStatus;
            this.nodeType = model.nodeType;
            this.orderStatus = model.orderStatus;
            this.podNum = model.podNum;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.requestCPU = model.requestCPU;
            this.requestGPU = model.requestGPU;
            this.requestMemory = model.requestMemory;
            this.resourceGroupId = model.resourceGroupId;
            this.resourceGroupName = model.resourceGroupName;
            this.systemReservedCPU = model.systemReservedCPU;
            this.systemReservedMemory = model.systemReservedMemory;
            this.users = model.users;
            this.workloadNum = model.workloadNum;
        } 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * AllocatableCPU.
         */
        public Builder allocatableCPU(String allocatableCPU) {
            this.allocatableCPU = allocatableCPU;
            return this;
        }

        /**
         * AllocatableMemory.
         */
        public Builder allocatableMemory(String allocatableMemory) {
            this.allocatableMemory = allocatableMemory;
            return this;
        }

        /**
         * AvailabilityZone.
         */
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * BoundQuotas.
         */
        public Builder boundQuotas(java.util.List<QuotaIdName> boundQuotas) {
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
         * GPUMemory.
         */
        public Builder GPUMemory(String GPUMemory) {
            this.GPUMemory = GPUMemory;
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
         * HyperZone.
         */
        public Builder hyperZone(String hyperZone) {
            this.hyperZone = hyperZone;
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
         * LimitCPU.
         */
        public Builder limitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }

        /**
         * LimitGPU.
         */
        public Builder limitGPU(String limitGPU) {
            this.limitGPU = limitGPU;
            return this;
        }

        /**
         * LimitMemory.
         */
        public Builder limitMemory(String limitMemory) {
            this.limitMemory = limitMemory;
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
         * PodNum.
         */
        public Builder podNum(Long podNum) {
            this.podNum = podNum;
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
         * RequestCPU.
         */
        public Builder requestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }

        /**
         * RequestGPU.
         */
        public Builder requestGPU(String requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }

        /**
         * RequestMemory.
         */
        public Builder requestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
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

        /**
         * SystemReservedCPU.
         */
        public Builder systemReservedCPU(String systemReservedCPU) {
            this.systemReservedCPU = systemReservedCPU;
            return this;
        }

        /**
         * SystemReservedMemory.
         */
        public Builder systemReservedMemory(String systemReservedMemory) {
            this.systemReservedMemory = systemReservedMemory;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List<UserInfo> users) {
            this.users = users;
            return this;
        }

        /**
         * WorkloadNum.
         */
        public Builder workloadNum(Long workloadNum) {
            this.workloadNum = workloadNum;
            return this;
        }

        public Node build() {
            return new Node(this);
        } 

    } 

}
