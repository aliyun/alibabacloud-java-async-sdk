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
 * {@link AutoUpdateConfig} extends {@link TeaModel}
 *
 * <p>AutoUpdateConfig</p>
 */
public class AutoUpdateConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EcsSpecs")
    private java.util.List<EcsSpecs> ecsSpecs;

    @com.aliyun.core.annotation.NameInMap("EmbeddingConfig")
    private EmbeddingConfig embeddingConfig;

    @com.aliyun.core.annotation.NameInMap("MaxRunningTimeInSeconds")
    private Integer maxRunningTimeInSeconds;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    private AutoUpdateConfig(Builder builder) {
        this.ecsSpecs = builder.ecsSpecs;
        this.embeddingConfig = builder.embeddingConfig;
        this.maxRunningTimeInSeconds = builder.maxRunningTimeInSeconds;
        this.resourceId = builder.resourceId;
        this.status = builder.status;
        this.userVpc = builder.userVpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoUpdateConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsSpecs
     */
    public java.util.List<EcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    /**
     * @return embeddingConfig
     */
    public EmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    /**
     * @return maxRunningTimeInSeconds
     */
    public Integer getMaxRunningTimeInSeconds() {
        return this.maxRunningTimeInSeconds;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static final class Builder {
        private java.util.List<EcsSpecs> ecsSpecs; 
        private EmbeddingConfig embeddingConfig; 
        private Integer maxRunningTimeInSeconds; 
        private String resourceId; 
        private String status; 
        private UserVpc userVpc; 

        private Builder() {
        } 

        private Builder(AutoUpdateConfig model) {
            this.ecsSpecs = model.ecsSpecs;
            this.embeddingConfig = model.embeddingConfig;
            this.maxRunningTimeInSeconds = model.maxRunningTimeInSeconds;
            this.resourceId = model.resourceId;
            this.status = model.status;
            this.userVpc = model.userVpc;
        } 

        /**
         * <p>运行资源配置</p>
         */
        public Builder ecsSpecs(java.util.List<EcsSpecs> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }

        /**
         * <p>Embedding配置</p>
         */
        public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }

        /**
         * <p>任务最大运行时间</p>
         */
        public Builder maxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }

        /**
         * <p>资源组ID</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>知识库自动更新状态</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>用户VPC配置</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        public AutoUpdateConfig build() {
            return new AutoUpdateConfig(this);
        } 

    } 

    /**
     * 
     * {@link AutoUpdateConfig} extends {@link TeaModel}
     *
     * <p>AutoUpdateConfig</p>
     */
    public static class EcsSpecs extends TeaModel {
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

        private EcsSpecs(Builder builder) {
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

        public static EcsSpecs create() {
            return builder().build();
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

            private Builder(EcsSpecs model) {
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

            public EcsSpecs build() {
                return new EcsSpecs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutoUpdateConfig} extends {@link TeaModel}
     *
     * <p>AutoUpdateConfig</p>
     */
    public static class EmbeddingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchSize")
        private Integer batchSize;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
        private Integer concurrency;

        private EmbeddingConfig(Builder builder) {
            this.batchSize = builder.batchSize;
            this.concurrency = builder.concurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbeddingConfig create() {
            return builder().build();
        }

        /**
         * @return batchSize
         */
        public Integer getBatchSize() {
            return this.batchSize;
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public static final class Builder {
            private Integer batchSize; 
            private Integer concurrency; 

            private Builder() {
            } 

            private Builder(EmbeddingConfig model) {
                this.batchSize = model.batchSize;
                this.concurrency = model.concurrency;
            } 

            /**
             * <p>Embedding分批大小</p>
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>Embedding并发数</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            public EmbeddingConfig build() {
                return new EmbeddingConfig(this);
            } 

        } 

    }
}
