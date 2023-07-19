// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EcsSpec} extends {@link TeaModel}
 *
 * <p>EcsSpec</p>
 */
public class EcsSpec extends TeaModel {
    @NameInMap("AcceleratorType")
    private String acceleratorType;

    @NameInMap("Cpu")
    private Integer cpu;

    @NameInMap("Gpu")
    private Integer gpu;

    @NameInMap("GpuType")
    private String gpuType;

    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("IsAvailable")
    private Boolean isAvailable;

    @NameInMap("Memory")
    private Integer memory;

    private EcsSpec(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.gpuType = builder.gpuType;
        this.instanceType = builder.instanceType;
        this.isAvailable = builder.isAvailable;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EcsSpec create() {
        return builder().build();
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
     * @return gpu
     */
    public Integer getGpu() {
        return this.gpu;
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isAvailable
     */
    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    public static final class Builder {
        private String acceleratorType; 
        private Integer cpu; 
        private Integer gpu; 
        private String gpuType; 
        private String instanceType; 
        private Boolean isAvailable; 
        private Integer memory; 

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
         * Gpu.
         */
        public Builder gpu(Integer gpu) {
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * IsAvailable.
         */
        public Builder isAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        public EcsSpec build() {
            return new EcsSpec(this);
        } 

    } 

}
