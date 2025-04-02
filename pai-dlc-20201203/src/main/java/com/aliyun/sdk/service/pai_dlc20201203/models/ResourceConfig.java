// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ResourceConfig} extends {@link TeaModel}
 *
 * <p>ResourceConfig</p>
 */
public class ResourceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    @com.aliyun.core.annotation.NameInMap("SharedMemory")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ResourceConfig model) {
            this.CPU = model.CPU;
            this.GPU = model.GPU;
            this.GPUType = model.GPUType;
            this.memory = model.memory;
            this.sharedMemory = model.sharedMemory;
        } 

        /**
         * CPU.
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
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
         * Memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * SharedMemory.
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
