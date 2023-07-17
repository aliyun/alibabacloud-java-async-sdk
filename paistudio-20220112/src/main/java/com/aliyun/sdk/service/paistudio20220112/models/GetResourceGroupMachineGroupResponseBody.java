// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupMachineGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupMachineGroupResponseBody</p>
 */
public class GetResourceGroupMachineGroupResponseBody extends TeaModel {
    @NameInMap("Cpu")
    private String cpu;

    @NameInMap("EcsCount")
    private Long ecsCount;

    @NameInMap("EcsSpec")
    private String ecsSpec;

    @NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @NameInMap("GmtExpiredTime")
    private String gmtExpiredTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("GmtStartedTime")
    private String gmtStartedTime;

    @NameInMap("Gpu")
    private String gpu;

    @NameInMap("GpuType")
    private String gpuType;

    @NameInMap("MachineGroupID")
    private String machineGroupID;

    @NameInMap("Memory")
    private String memory;

    @NameInMap("PaymentDuration")
    private String paymentDuration;

    @NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @NameInMap("PaymentType")
    private String paymentType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @NameInMap("Status")
    private String status;

    private GetResourceGroupMachineGroupResponseBody(Builder builder) {
        this.cpu = builder.cpu;
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
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.requestId = builder.requestId;
        this.resourceGroupID = builder.resourceGroupID;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupMachineGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
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

    public static final class Builder {
        private String cpu; 
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
        private String paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String requestId; 
        private String resourceGroupID; 
        private String status; 

        /**
         * Cpu.
         */
        public Builder cpu(String cpu) {
            this.cpu = cpu;
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

        public GetResourceGroupMachineGroupResponseBody build() {
            return new GetResourceGroupMachineGroupResponseBody(this);
        } 

    } 

}
