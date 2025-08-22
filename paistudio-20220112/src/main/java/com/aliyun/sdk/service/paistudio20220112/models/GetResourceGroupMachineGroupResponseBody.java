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
 * {@link GetResourceGroupMachineGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupMachineGroupResponseBody</p>
 */
public class GetResourceGroupMachineGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocatableCpu")
    private String allocatableCpu;

    @com.aliyun.core.annotation.NameInMap("AllocatableMemory")
    private String allocatableMemory;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private String cpu;

    @com.aliyun.core.annotation.NameInMap("DefaultDriver")
    private String defaultDriver;

    @com.aliyun.core.annotation.NameInMap("EcsCount")
    private Long ecsCount;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtExpiredTime")
    private String gmtExpiredTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtStartedTime")
    private String gmtStartedTime;

    @com.aliyun.core.annotation.NameInMap("Gpu")
    private String gpu;

    @com.aliyun.core.annotation.NameInMap("GpuType")
    private String gpuType;

    @com.aliyun.core.annotation.NameInMap("MachineGroupID")
    private String machineGroupID;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    private String paymentDuration;

    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportedDrivers")
    private java.util.List<String> supportedDrivers;

    @com.aliyun.core.annotation.NameInMap("SystemReservedCpu")
    private String systemReservedCpu;

    @com.aliyun.core.annotation.NameInMap("SystemReservedMemory")
    private String systemReservedMemory;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private GetResourceGroupMachineGroupResponseBody(Builder builder) {
        this.allocatableCpu = builder.allocatableCpu;
        this.allocatableMemory = builder.allocatableMemory;
        this.cpu = builder.cpu;
        this.defaultDriver = builder.defaultDriver;
        this.ecsCount = builder.ecsCount;
        this.ecsSpec = builder.ecsSpec;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtExpiredTime = builder.gmtExpiredTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtStartedTime = builder.gmtStartedTime;
        this.gpu = builder.gpu;
        this.gpuType = builder.gpuType;
        this.machineGroupID = builder.machineGroupID;
        this.memory = builder.memory;
        this.name = builder.name;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.requestId = builder.requestId;
        this.resourceGroupID = builder.resourceGroupID;
        this.status = builder.status;
        this.supportedDrivers = builder.supportedDrivers;
        this.systemReservedCpu = builder.systemReservedCpu;
        this.systemReservedMemory = builder.systemReservedMemory;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupMachineGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocatableCpu
     */
    public String getAllocatableCpu() {
        return this.allocatableCpu;
    }

    /**
     * @return allocatableMemory
     */
    public String getAllocatableMemory() {
        return this.allocatableMemory;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return defaultDriver
     */
    public String getDefaultDriver() {
        return this.defaultDriver;
    }

    /**
     * @return ecsCount
     */
    public Long getEcsCount() {
        return this.ecsCount;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return gmtCreatedTime
     */
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
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
     * @return gmtStartedTime
     */
    public String getGmtStartedTime() {
        return this.gmtStartedTime;
    }

    /**
     * @return gpu
     */
    public String getGpu() {
        return this.gpu;
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return machineGroupID
     */
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return paymentDuration
     */
    public String getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportedDrivers
     */
    public java.util.List<String> getSupportedDrivers() {
        return this.supportedDrivers;
    }

    /**
     * @return systemReservedCpu
     */
    public String getSystemReservedCpu() {
        return this.systemReservedCpu;
    }

    /**
     * @return systemReservedMemory
     */
    public String getSystemReservedMemory() {
        return this.systemReservedMemory;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String allocatableCpu; 
        private String allocatableMemory; 
        private String cpu; 
        private String defaultDriver; 
        private Long ecsCount; 
        private String ecsSpec; 
        private String gmtCreatedTime; 
        private String gmtExpiredTime; 
        private String gmtModifiedTime; 
        private String gmtStartedTime; 
        private String gpu; 
        private String gpuType; 
        private String machineGroupID; 
        private String memory; 
        private String name; 
        private String paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String requestId; 
        private String resourceGroupID; 
        private String status; 
        private java.util.List<String> supportedDrivers; 
        private String systemReservedCpu; 
        private String systemReservedMemory; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(GetResourceGroupMachineGroupResponseBody model) {
            this.allocatableCpu = model.allocatableCpu;
            this.allocatableMemory = model.allocatableMemory;
            this.cpu = model.cpu;
            this.defaultDriver = model.defaultDriver;
            this.ecsCount = model.ecsCount;
            this.ecsSpec = model.ecsSpec;
            this.gmtCreatedTime = model.gmtCreatedTime;
            this.gmtExpiredTime = model.gmtExpiredTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.gmtStartedTime = model.gmtStartedTime;
            this.gpu = model.gpu;
            this.gpuType = model.gpuType;
            this.machineGroupID = model.machineGroupID;
            this.memory = model.memory;
            this.name = model.name;
            this.paymentDuration = model.paymentDuration;
            this.paymentDurationUnit = model.paymentDurationUnit;
            this.paymentType = model.paymentType;
            this.requestId = model.requestId;
            this.resourceGroupID = model.resourceGroupID;
            this.status = model.status;
            this.supportedDrivers = model.supportedDrivers;
            this.systemReservedCpu = model.systemReservedCpu;
            this.systemReservedMemory = model.systemReservedMemory;
            this.tags = model.tags;
        } 

        /**
         * AllocatableCpu.
         */
        public Builder allocatableCpu(String allocatableCpu) {
            this.allocatableCpu = allocatableCpu;
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
         * Cpu.
         */
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * DefaultDriver.
         */
        public Builder defaultDriver(String defaultDriver) {
            this.defaultDriver = defaultDriver;
            return this;
        }

        /**
         * EcsCount.
         */
        public Builder ecsCount(Long ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }

        /**
         * EcsSpec.
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * GmtCreatedTime.
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
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
         * GmtStartedTime.
         */
        public Builder gmtStartedTime(String gmtStartedTime) {
            this.gmtStartedTime = gmtStartedTime;
            return this;
        }

        /**
         * Gpu.
         */
        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * GpuType.
         */
        public Builder gpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }

        /**
         * MachineGroupID.
         */
        public Builder machineGroupID(String machineGroupID) {
            this.machineGroupID = machineGroupID;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PaymentDuration.
         */
        public Builder paymentDuration(String paymentDuration) {
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * PaymentDurationUnit.
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SupportedDrivers.
         */
        public Builder supportedDrivers(java.util.List<String> supportedDrivers) {
            this.supportedDrivers = supportedDrivers;
            return this;
        }

        /**
         * SystemReservedCpu.
         */
        public Builder systemReservedCpu(String systemReservedCpu) {
            this.systemReservedCpu = systemReservedCpu;
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
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetResourceGroupMachineGroupResponseBody build() {
            return new GetResourceGroupMachineGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceGroupMachineGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupMachineGroupResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
