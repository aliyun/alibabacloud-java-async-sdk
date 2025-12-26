// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
    @com.aliyun.core.annotation.NameInMap("CPU")
    private Integer CPU;

    @com.aliyun.core.annotation.NameInMap("Driver")
    private String driver;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private Integer GPU;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("PodCount")
    private Integer podCount;

    @com.aliyun.core.annotation.NameInMap("SharedMemory")
    private Integer sharedMemory;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private EcsSpec(Builder builder) {
        this.CPU = builder.CPU;
        this.driver = builder.driver;
        this.GPU = builder.GPU;
        this.GPUType = builder.GPUType;
        this.instanceType = builder.instanceType;
        this.memory = builder.memory;
        this.podCount = builder.podCount;
        this.sharedMemory = builder.sharedMemory;
        this.type = builder.type;
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
     * @return CPU
     */
    public Integer getCPU() {
        return this.CPU;
    }

    /**
     * @return driver
     */
    public String getDriver() {
        return this.driver;
    }

    /**
     * @return GPU
     */
    public Integer getGPU() {
        return this.GPU;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return podCount
     */
    public Integer getPodCount() {
        return this.podCount;
    }

    /**
     * @return sharedMemory
     */
    public Integer getSharedMemory() {
        return this.sharedMemory;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer CPU; 
        private String driver; 
        private Integer GPU; 
        private String GPUType; 
        private String instanceType; 
        private Integer memory; 
        private Integer podCount; 
        private Integer sharedMemory; 
        private String type; 

        private Builder() {
        } 

        private Builder(EcsSpec model) {
            this.CPU = model.CPU;
            this.driver = model.driver;
            this.GPU = model.GPU;
            this.GPUType = model.GPUType;
            this.instanceType = model.instanceType;
            this.memory = model.memory;
            this.podCount = model.podCount;
            this.sharedMemory = model.sharedMemory;
            this.type = model.type;
        } 

        /**
         * <p>CPU核数</p>
         */
        public Builder CPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * <p>驱动版本</p>
         */
        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * <p>GPU卡数</p>
         */
        public Builder GPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }

        /**
         * <p>GPU类型</p>
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * <p>机型名称</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>内存大小</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>副本数量</p>
         */
        public Builder podCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }

        /**
         * <p>共享内存容量</p>
         */
        public Builder sharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }

        /**
         * <p>节点类型</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public EcsSpec build() {
            return new EcsSpec(this);
        } 

    } 

}
