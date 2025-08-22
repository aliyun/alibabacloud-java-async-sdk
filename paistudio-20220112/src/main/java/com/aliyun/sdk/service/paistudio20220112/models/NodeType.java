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

    @com.aliyun.core.annotation.NameInMap("AllocatableCPU")
    private String allocatableCPU;

    @com.aliyun.core.annotation.NameInMap("AllocatableMemory")
    private String allocatableMemory;

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

    @com.aliyun.core.annotation.NameInMap("SystemReservedCPU")
    private String systemReservedCPU;

    @com.aliyun.core.annotation.NameInMap("SystemReservedMemory")
    private String systemReservedMemory;

    private NodeType(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.allocatableCPU = builder.allocatableCPU;
        this.allocatableMemory = builder.allocatableMemory;
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.GPUMemory = builder.GPUMemory;
        this.GPUType = builder.GPUType;
        this.memory = builder.memory;
        this.nodeType = builder.nodeType;
        this.systemReservedCPU = builder.systemReservedCPU;
        this.systemReservedMemory = builder.systemReservedMemory;
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

    public static final class Builder {
        private String acceleratorType; 
        private String allocatableCPU; 
        private String allocatableMemory; 
        private String CPU; 
        private String GPU; 
        private String GPUMemory; 
        private String GPUType; 
        private String memory; 
        private String nodeType; 
        private String systemReservedCPU; 
        private String systemReservedMemory; 

        private Builder() {
        } 

        private Builder(NodeType model) {
            this.acceleratorType = model.acceleratorType;
            this.allocatableCPU = model.allocatableCPU;
            this.allocatableMemory = model.allocatableMemory;
            this.CPU = model.CPU;
            this.GPU = model.GPU;
            this.GPUMemory = model.GPUMemory;
            this.GPUType = model.GPUType;
            this.memory = model.memory;
            this.nodeType = model.nodeType;
            this.systemReservedCPU = model.systemReservedCPU;
            this.systemReservedMemory = model.systemReservedMemory;
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

        public NodeType build() {
            return new NodeType(this);
        } 

    } 

}
