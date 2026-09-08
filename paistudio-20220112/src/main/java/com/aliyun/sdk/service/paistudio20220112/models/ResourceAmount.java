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
 * {@link ResourceAmount} extends {@link TeaModel}
 *
 * <p>ResourceAmount</p>
 */
public class ResourceAmount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("GPUMemory")
    private String GPUMemory;

    @com.aliyun.core.annotation.NameInMap("GPUMemoryBytes")
    private Long GPUMemoryBytes;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    private ResourceAmount(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.GPUMemory = builder.GPUMemory;
        this.GPUMemoryBytes = builder.GPUMemoryBytes;
        this.GPUType = builder.GPUType;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceAmount create() {
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
     * @return GPUMemory
     */
    public String getGPUMemory() {
        return this.GPUMemory;
    }

    /**
     * @return GPUMemoryBytes
     */
    public Long getGPUMemoryBytes() {
        return this.GPUMemoryBytes;
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

    public static final class Builder {
        private String CPU; 
        private String GPU; 
        private String GPUMemory; 
        private Long GPUMemoryBytes; 
        private String GPUType; 
        private String memory; 

        private Builder() {
        } 

        private Builder(ResourceAmount model) {
            this.CPU = model.CPU;
            this.GPU = model.GPU;
            this.GPUMemory = model.GPUMemory;
            this.GPUMemoryBytes = model.GPUMemoryBytes;
            this.GPUType = model.GPUType;
            this.memory = model.memory;
        } 

        /**
         * <p>Total CPU</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * <p>Total GPU cards</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
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
         * GPUMemoryBytes.
         */
        public Builder GPUMemoryBytes(Long GPUMemoryBytes) {
            this.GPUMemoryBytes = GPUMemoryBytes;
            return this;
        }

        /**
         * <p>GPU card type</p>
         * 
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * <p>Total memory</p>
         * 
         * <strong>example:</strong>
         * <p>100Gi</p>
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public ResourceAmount build() {
            return new ResourceAmount(this);
        } 

    } 

}
