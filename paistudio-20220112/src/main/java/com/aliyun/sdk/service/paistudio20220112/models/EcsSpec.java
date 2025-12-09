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
 * {@link EcsSpec} extends {@link TeaModel}
 *
 * <p>EcsSpec</p>
 */
public class EcsSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("EcsImageId")
    private String ecsImageId;

    @com.aliyun.core.annotation.NameInMap("EriQuantity")
    private Integer eriQuantity;

    @com.aliyun.core.annotation.NameInMap("Gpu")
    private Integer gpu;

    @com.aliyun.core.annotation.NameInMap("GpuGUSpec")
    private String gpuGUSpec;

    @com.aliyun.core.annotation.NameInMap("GpuMemory")
    private Integer gpuMemory;

    @com.aliyun.core.annotation.NameInMap("GpuType")
    private String gpuType;

    @com.aliyun.core.annotation.NameInMap("GpuTypeAlias")
    private String gpuTypeAlias;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("MachineModel")
    private String machineModel;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("NetworkMode")
    private String networkMode;

    @com.aliyun.core.annotation.NameInMap("PlannedCpu")
    private Integer plannedCpu;

    @com.aliyun.core.annotation.NameInMap("PlannedMemory")
    private Integer plannedMemory;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("SupportGPUShare")
    private Boolean supportGPUShare;

    @com.aliyun.core.annotation.NameInMap("SupportRDMA")
    private Boolean supportRDMA;

    @com.aliyun.core.annotation.NameInMap("SupportSetNetworkCardIndex")
    private Boolean supportSetNetworkCardIndex;

    private EcsSpec(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.cpu = builder.cpu;
        this.ecsImageId = builder.ecsImageId;
        this.eriQuantity = builder.eriQuantity;
        this.gpu = builder.gpu;
        this.gpuGUSpec = builder.gpuGUSpec;
        this.gpuMemory = builder.gpuMemory;
        this.gpuType = builder.gpuType;
        this.gpuTypeAlias = builder.gpuTypeAlias;
        this.instanceType = builder.instanceType;
        this.machineModel = builder.machineModel;
        this.memory = builder.memory;
        this.networkMode = builder.networkMode;
        this.plannedCpu = builder.plannedCpu;
        this.plannedMemory = builder.plannedMemory;
        this.resourceType = builder.resourceType;
        this.supportGPUShare = builder.supportGPUShare;
        this.supportRDMA = builder.supportRDMA;
        this.supportSetNetworkCardIndex = builder.supportSetNetworkCardIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EcsSpec create() {
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
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return ecsImageId
     */
    public String getEcsImageId() {
        return this.ecsImageId;
    }

    /**
     * @return eriQuantity
     */
    public Integer getEriQuantity() {
        return this.eriQuantity;
    }

    /**
     * @return gpu
     */
    public Integer getGpu() {
        return this.gpu;
    }

    /**
     * @return gpuGUSpec
     */
    public String getGpuGUSpec() {
        return this.gpuGUSpec;
    }

    /**
     * @return gpuMemory
     */
    public Integer getGpuMemory() {
        return this.gpuMemory;
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return gpuTypeAlias
     */
    public String getGpuTypeAlias() {
        return this.gpuTypeAlias;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return machineModel
     */
    public String getMachineModel() {
        return this.machineModel;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return networkMode
     */
    public String getNetworkMode() {
        return this.networkMode;
    }

    /**
     * @return plannedCpu
     */
    public Integer getPlannedCpu() {
        return this.plannedCpu;
    }

    /**
     * @return plannedMemory
     */
    public Integer getPlannedMemory() {
        return this.plannedMemory;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return supportGPUShare
     */
    public Boolean getSupportGPUShare() {
        return this.supportGPUShare;
    }

    /**
     * @return supportRDMA
     */
    public Boolean getSupportRDMA() {
        return this.supportRDMA;
    }

    /**
     * @return supportSetNetworkCardIndex
     */
    public Boolean getSupportSetNetworkCardIndex() {
        return this.supportSetNetworkCardIndex;
    }

    public static final class Builder {
        private String acceleratorType; 
        private Integer cpu; 
        private String ecsImageId; 
        private Integer eriQuantity; 
        private Integer gpu; 
        private String gpuGUSpec; 
        private Integer gpuMemory; 
        private String gpuType; 
        private String gpuTypeAlias; 
        private String instanceType; 
        private String machineModel; 
        private Integer memory; 
        private String networkMode; 
        private Integer plannedCpu; 
        private Integer plannedMemory; 
        private String resourceType; 
        private Boolean supportGPUShare; 
        private Boolean supportRDMA; 
        private Boolean supportSetNetworkCardIndex; 

        private Builder() {
        } 

        private Builder(EcsSpec model) {
            this.acceleratorType = model.acceleratorType;
            this.cpu = model.cpu;
            this.ecsImageId = model.ecsImageId;
            this.eriQuantity = model.eriQuantity;
            this.gpu = model.gpu;
            this.gpuGUSpec = model.gpuGUSpec;
            this.gpuMemory = model.gpuMemory;
            this.gpuType = model.gpuType;
            this.gpuTypeAlias = model.gpuTypeAlias;
            this.instanceType = model.instanceType;
            this.machineModel = model.machineModel;
            this.memory = model.memory;
            this.networkMode = model.networkMode;
            this.plannedCpu = model.plannedCpu;
            this.plannedMemory = model.plannedMemory;
            this.resourceType = model.resourceType;
            this.supportGPUShare = model.supportGPUShare;
            this.supportRDMA = model.supportRDMA;
            this.supportSetNetworkCardIndex = model.supportSetNetworkCardIndex;
        } 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * EcsImageId.
         */
        public Builder ecsImageId(String ecsImageId) {
            this.ecsImageId = ecsImageId;
            return this;
        }

        /**
         * EriQuantity.
         */
        public Builder eriQuantity(Integer eriQuantity) {
            this.eriQuantity = eriQuantity;
            return this;
        }

        /**
         * Gpu.
         */
        public Builder gpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * GpuGUSpec.
         */
        public Builder gpuGUSpec(String gpuGUSpec) {
            this.gpuGUSpec = gpuGUSpec;
            return this;
        }

        /**
         * GpuMemory.
         */
        public Builder gpuMemory(Integer gpuMemory) {
            this.gpuMemory = gpuMemory;
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
         * GpuTypeAlias.
         */
        public Builder gpuTypeAlias(String gpuTypeAlias) {
            this.gpuTypeAlias = gpuTypeAlias;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * MachineModel.
         */
        public Builder machineModel(String machineModel) {
            this.machineModel = machineModel;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * NetworkMode.
         */
        public Builder networkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        /**
         * PlannedCpu.
         */
        public Builder plannedCpu(Integer plannedCpu) {
            this.plannedCpu = plannedCpu;
            return this;
        }

        /**
         * PlannedMemory.
         */
        public Builder plannedMemory(Integer plannedMemory) {
            this.plannedMemory = plannedMemory;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SupportGPUShare.
         */
        public Builder supportGPUShare(Boolean supportGPUShare) {
            this.supportGPUShare = supportGPUShare;
            return this;
        }

        /**
         * SupportRDMA.
         */
        public Builder supportRDMA(Boolean supportRDMA) {
            this.supportRDMA = supportRDMA;
            return this;
        }

        /**
         * SupportSetNetworkCardIndex.
         */
        public Builder supportSetNetworkCardIndex(Boolean supportSetNetworkCardIndex) {
            this.supportSetNetworkCardIndex = supportSetNetworkCardIndex;
            return this;
        }

        public EcsSpec build() {
            return new EcsSpec(this);
        } 

    } 

}
