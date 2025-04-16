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
 * {@link NodeType} extends {@link TeaModel}
 *
 * <p>NodeType</p>
 */
public class NodeType extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("GPUMemory")
    private String GPUMemory;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    private NodeType(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.GPUMemory = builder.GPUMemory;
        this.GPUType = builder.GPUType;
        this.memory = builder.memory;
        this.nodeType = builder.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeType create() {
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
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    public static final class Builder {
        private String acceleratorType; 
        private String CPU; 
        private String GPU; 
        private String GPUMemory; 
        private String GPUType; 
        private String memory; 
        private String nodeType; 

        private Builder() {
        } 

        private Builder(NodeType model) {
            this.acceleratorType = model.acceleratorType;
            this.CPU = model.CPU;
            this.GPU = model.GPU;
            this.GPUMemory = model.GPUMemory;
            this.GPUType = model.GPUType;
            this.memory = model.memory;
            this.nodeType = model.nodeType;
        } 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
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
         * Memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public NodeType build() {
            return new NodeType(this);
        } 

    } 

}
