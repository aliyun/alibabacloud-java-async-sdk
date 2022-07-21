// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceConfig} extends {@link TeaModel}
 *
 * <p>ResourceConfig</p>
 */
public class ResourceConfig extends TeaModel {
    @NameInMap("CPU")
    private String CPU;

    @NameInMap("GPU")
    private String GPU;

    @NameInMap("GPUType")
    private String GPUType;

    @NameInMap("Memory")
    private String memory;

    @NameInMap("SharedMemory")
    private String sharedMemory;

    private ResourceConfig(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.GPUType = builder.GPUType;
        this.memory = builder.memory;
        this.sharedMemory = builder.sharedMemory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceConfig create() {
        return builder().build();
    }

    /**
     * @return CPU
     */
    public String getCPU() {
        return this.CPU;
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
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return sharedMemory
     */
    public String getSharedMemory() {
        return this.sharedMemory;
    }

    public static final class Builder {
        private String CPU; 
        private String GPU; 
        private String GPUType; 
        private String memory; 
        private String sharedMemory; 

        /**
         * CPU核心数
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * GPU核心数
         */
        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        /**
         * 显卡类型
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * 内存容量
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * 共享内存容量
         */
        public Builder sharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }

        public ResourceConfig build() {
            return new ResourceConfig(this);
        } 

    } 

}
