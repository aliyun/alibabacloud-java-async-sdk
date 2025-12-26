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
 * {@link KnowledgeBase} extends {@link TeaModel}
 *
 * <p>KnowledgeBase</p>
 */
public class KnowledgeBase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("AutoUpdateConfig")
    private AutoUpdateConfig autoUpdateConfig;

    @com.aliyun.core.annotation.NameInMap("ChunkConfig")
    private ChunkConfig chunkConfig;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EmbeddingConfig")
    private EmbeddingConfig embeddingConfig;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("IndexColumnConfig")
    private IndexColumnConfig indexColumnConfig;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseType")
    private String knowledgeBaseType;

    @com.aliyun.core.annotation.NameInMap("MetaDataConfig")
    private MetaDataConfig metaDataConfig;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OutputDir")
    private String outputDir;

    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    private String runtimeId;

    @com.aliyun.core.annotation.NameInMap("VectorDBConfig")
    private VectorDBConfig vectorDBConfig;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private KnowledgeBase(Builder builder) {
        this.accessibility = builder.accessibility;
        this.autoUpdateConfig = builder.autoUpdateConfig;
        this.chunkConfig = builder.chunkConfig;
        this.creator = builder.creator;
        this.dataSources = builder.dataSources;
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.embeddingConfig = builder.embeddingConfig;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.indexColumnConfig = builder.indexColumnConfig;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseType = builder.knowledgeBaseType;
        this.metaDataConfig = builder.metaDataConfig;
        this.name = builder.name;
        this.outputDir = builder.outputDir;
        this.runtimeId = builder.runtimeId;
        this.vectorDBConfig = builder.vectorDBConfig;
        this.versionName = builder.versionName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBase create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return autoUpdateConfig
     */
    public AutoUpdateConfig getAutoUpdateConfig() {
        return this.autoUpdateConfig;
    }

    /**
     * @return chunkConfig
     */
    public ChunkConfig getChunkConfig() {
        return this.chunkConfig;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return embeddingConfig
     */
    public EmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return indexColumnConfig
     */
    public IndexColumnConfig getIndexColumnConfig() {
        return this.indexColumnConfig;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeBaseType
     */
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    /**
     * @return metaDataConfig
     */
    public MetaDataConfig getMetaDataConfig() {
        return this.metaDataConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputDir
     */
    public String getOutputDir() {
        return this.outputDir;
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * @return vectorDBConfig
     */
    public VectorDBConfig getVectorDBConfig() {
        return this.vectorDBConfig;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private AutoUpdateConfig autoUpdateConfig; 
        private ChunkConfig chunkConfig; 
        private String creator; 
        private java.util.List<DataSources> dataSources; 
        private String datasetId; 
        private String description; 
        private EmbeddingConfig embeddingConfig; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private IndexColumnConfig indexColumnConfig; 
        private String knowledgeBaseId; 
        private String knowledgeBaseType; 
        private MetaDataConfig metaDataConfig; 
        private String name; 
        private String outputDir; 
        private String runtimeId; 
        private VectorDBConfig vectorDBConfig; 
        private String versionName; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(KnowledgeBase model) {
            this.accessibility = model.accessibility;
            this.autoUpdateConfig = model.autoUpdateConfig;
            this.chunkConfig = model.chunkConfig;
            this.creator = model.creator;
            this.dataSources = model.dataSources;
            this.datasetId = model.datasetId;
            this.description = model.description;
            this.embeddingConfig = model.embeddingConfig;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.indexColumnConfig = model.indexColumnConfig;
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.knowledgeBaseType = model.knowledgeBaseType;
            this.metaDataConfig = model.metaDataConfig;
            this.name = model.name;
            this.outputDir = model.outputDir;
            this.runtimeId = model.runtimeId;
            this.vectorDBConfig = model.vectorDBConfig;
            this.versionName = model.versionName;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * AutoUpdateConfig.
         */
        public Builder autoUpdateConfig(AutoUpdateConfig autoUpdateConfig) {
            this.autoUpdateConfig = autoUpdateConfig;
            return this;
        }

        /**
         * ChunkConfig.
         */
        public Builder chunkConfig(ChunkConfig chunkConfig) {
            this.chunkConfig = chunkConfig;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * DataSources.
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EmbeddingConfig.
         */
        public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
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
         * IndexColumnConfig.
         */
        public Builder indexColumnConfig(IndexColumnConfig indexColumnConfig) {
            this.indexColumnConfig = indexColumnConfig;
            return this;
        }

        /**
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * KnowledgeBaseType.
         */
        public Builder knowledgeBaseType(String knowledgeBaseType) {
            this.knowledgeBaseType = knowledgeBaseType;
            return this;
        }

        /**
         * MetaDataConfig.
         */
        public Builder metaDataConfig(MetaDataConfig metaDataConfig) {
            this.metaDataConfig = metaDataConfig;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OutputDir.
         */
        public Builder outputDir(String outputDir) {
            this.outputDir = outputDir;
            return this;
        }

        /**
         * RuntimeId.
         */
        public Builder runtimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * VectorDBConfig.
         */
        public Builder vectorDBConfig(VectorDBConfig vectorDBConfig) {
            this.vectorDBConfig = vectorDBConfig;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public KnowledgeBase build() {
            return new KnowledgeBase(this);
        } 

    } 

    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
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
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class AutoUpdateConfigEmbeddingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchSize")
        private Integer batchSize;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
        private Integer concurrency;

        private AutoUpdateConfigEmbeddingConfig(Builder builder) {
            this.batchSize = builder.batchSize;
            this.concurrency = builder.concurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoUpdateConfigEmbeddingConfig create() {
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

            private Builder(AutoUpdateConfigEmbeddingConfig model) {
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

            public AutoUpdateConfigEmbeddingConfig build() {
                return new AutoUpdateConfigEmbeddingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class AutoUpdateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsSpecs")
        private java.util.List<EcsSpecs> ecsSpecs;

        @com.aliyun.core.annotation.NameInMap("EmbeddingConfig")
        private AutoUpdateConfigEmbeddingConfig embeddingConfig;

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

        /**
         * @return ecsSpecs
         */
        public java.util.List<EcsSpecs> getEcsSpecs() {
            return this.ecsSpecs;
        }

        /**
         * @return embeddingConfig
         */
        public AutoUpdateConfigEmbeddingConfig getEmbeddingConfig() {
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
            private AutoUpdateConfigEmbeddingConfig embeddingConfig; 
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
            public Builder embeddingConfig(AutoUpdateConfigEmbeddingConfig embeddingConfig) {
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

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class ChunkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChunkDuration")
        private Integer chunkDuration;

        @com.aliyun.core.annotation.NameInMap("ChunkOverlap")
        private Integer chunkOverlap;

        @com.aliyun.core.annotation.NameInMap("ChunkSize")
        private Integer chunkSize;

        @com.aliyun.core.annotation.NameInMap("ChunkStrategy")
        private String chunkStrategy;

        private ChunkConfig(Builder builder) {
            this.chunkDuration = builder.chunkDuration;
            this.chunkOverlap = builder.chunkOverlap;
            this.chunkSize = builder.chunkSize;
            this.chunkStrategy = builder.chunkStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkConfig create() {
            return builder().build();
        }

        /**
         * @return chunkDuration
         */
        public Integer getChunkDuration() {
            return this.chunkDuration;
        }

        /**
         * @return chunkOverlap
         */
        public Integer getChunkOverlap() {
            return this.chunkOverlap;
        }

        /**
         * @return chunkSize
         */
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        /**
         * @return chunkStrategy
         */
        public String getChunkStrategy() {
            return this.chunkStrategy;
        }

        public static final class Builder {
            private Integer chunkDuration; 
            private Integer chunkOverlap; 
            private Integer chunkSize; 
            private String chunkStrategy; 

            private Builder() {
            } 

            private Builder(ChunkConfig model) {
                this.chunkDuration = model.chunkDuration;
                this.chunkOverlap = model.chunkOverlap;
                this.chunkSize = model.chunkSize;
                this.chunkStrategy = model.chunkStrategy;
            } 

            /**
             * <p>分块时长</p>
             */
            public Builder chunkDuration(Integer chunkDuration) {
                this.chunkDuration = chunkDuration;
                return this;
            }

            /**
             * <p>分块重叠大小</p>
             */
            public Builder chunkOverlap(Integer chunkOverlap) {
                this.chunkOverlap = chunkOverlap;
                return this;
            }

            /**
             * <p>分块大小</p>
             */
            public Builder chunkSize(Integer chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * <p>分块策略</p>
             */
            public Builder chunkStrategy(String chunkStrategy) {
                this.chunkStrategy = chunkStrategy;
                return this;
            }

            public ChunkConfig build() {
                return new ChunkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private DataSources(Builder builder) {
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String uri; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.uri = model.uri;
            } 

            /**
             * <p>统一资源识别码</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class EmbeddingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        private EmbeddingConfig(Builder builder) {
            this.connectionId = builder.connectionId;
            this.connectionName = builder.connectionName;
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbeddingConfig create() {
            return builder().build();
        }

        /**
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        public static final class Builder {
            private String connectionId; 
            private String connectionName; 
            private String model; 

            private Builder() {
            } 

            private Builder(EmbeddingConfig model) {
                this.connectionId = model.connectionId;
                this.connectionName = model.connectionName;
                this.model = model.model;
            } 

            /**
             * <p>Embedding连接ID</p>
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>Embedding连接名称</p>
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * <p>模型</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            public EmbeddingConfig build() {
                return new EmbeddingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class ColumnDefinitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private ColumnDefinitions(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnDefinitions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String key; 

            private Builder() {
            } 

            private Builder(ColumnDefinitions model) {
                this.key = model.key;
            } 

            /**
             * <p>列Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public ColumnDefinitions build() {
                return new ColumnDefinitions(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class ContentColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private ContentColumns(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentColumns create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String key; 

            private Builder() {
            } 

            private Builder(ContentColumns model) {
                this.key = model.key;
            } 

            /**
             * <p>列Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public ContentColumns build() {
                return new ContentColumns(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class EmbeddingColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private EmbeddingColumns(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbeddingColumns create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String key; 

            private Builder() {
            } 

            private Builder(EmbeddingColumns model) {
                this.key = model.key;
            } 

            /**
             * <p>列Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public EmbeddingColumns build() {
                return new EmbeddingColumns(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class IndexColumnConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnDefinitions")
        private java.util.List<ColumnDefinitions> columnDefinitions;

        @com.aliyun.core.annotation.NameInMap("ContentColumns")
        private java.util.List<ContentColumns> contentColumns;

        @com.aliyun.core.annotation.NameInMap("EmbeddingColumns")
        private java.util.List<EmbeddingColumns> embeddingColumns;

        private IndexColumnConfig(Builder builder) {
            this.columnDefinitions = builder.columnDefinitions;
            this.contentColumns = builder.contentColumns;
            this.embeddingColumns = builder.embeddingColumns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexColumnConfig create() {
            return builder().build();
        }

        /**
         * @return columnDefinitions
         */
        public java.util.List<ColumnDefinitions> getColumnDefinitions() {
            return this.columnDefinitions;
        }

        /**
         * @return contentColumns
         */
        public java.util.List<ContentColumns> getContentColumns() {
            return this.contentColumns;
        }

        /**
         * @return embeddingColumns
         */
        public java.util.List<EmbeddingColumns> getEmbeddingColumns() {
            return this.embeddingColumns;
        }

        public static final class Builder {
            private java.util.List<ColumnDefinitions> columnDefinitions; 
            private java.util.List<ContentColumns> contentColumns; 
            private java.util.List<EmbeddingColumns> embeddingColumns; 

            private Builder() {
            } 

            private Builder(IndexColumnConfig model) {
                this.columnDefinitions = model.columnDefinitions;
                this.contentColumns = model.contentColumns;
                this.embeddingColumns = model.embeddingColumns;
            } 

            /**
             * <p>所有列名</p>
             */
            public Builder columnDefinitions(java.util.List<ColumnDefinitions> columnDefinitions) {
                this.columnDefinitions = columnDefinitions;
                return this;
            }

            /**
             * <p>内容检索列</p>
             */
            public Builder contentColumns(java.util.List<ContentColumns> contentColumns) {
                this.contentColumns = contentColumns;
                return this;
            }

            /**
             * <p>Embedding列</p>
             */
            public Builder embeddingColumns(java.util.List<EmbeddingColumns> embeddingColumns) {
                this.embeddingColumns = embeddingColumns;
                return this;
            }

            public IndexColumnConfig build() {
                return new IndexColumnConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class CustomMetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ReferenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("ValueCount")
        private Integer valueCount;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private CustomMetaData(Builder builder) {
            this.key = builder.key;
            this.referenceCount = builder.referenceCount;
            this.valueCount = builder.valueCount;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomMetaData create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        /**
         * @return valueCount
         */
        public Integer getValueCount() {
            return this.valueCount;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String key; 
            private Integer referenceCount; 
            private Integer valueCount; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(CustomMetaData model) {
                this.key = model.key;
                this.referenceCount = model.referenceCount;
                this.valueCount = model.valueCount;
                this.valueType = model.valueType;
            } 

            /**
             * <p>元数据Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>引用次数</p>
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * <p>值的个数</p>
             */
            public Builder valueCount(Integer valueCount) {
                this.valueCount = valueCount;
                return this;
            }

            /**
             * <p>元数据Value类型</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public CustomMetaData build() {
                return new CustomMetaData(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class MetaDataConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomMetaData")
        private java.util.List<CustomMetaData> customMetaData;

        private MetaDataConfig(Builder builder) {
            this.customMetaData = builder.customMetaData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaDataConfig create() {
            return builder().build();
        }

        /**
         * @return customMetaData
         */
        public java.util.List<CustomMetaData> getCustomMetaData() {
            return this.customMetaData;
        }

        public static final class Builder {
            private java.util.List<CustomMetaData> customMetaData; 

            private Builder() {
            } 

            private Builder(MetaDataConfig model) {
                this.customMetaData = model.customMetaData;
            } 

            /**
             * <p>自定义元数据</p>
             */
            public Builder customMetaData(java.util.List<CustomMetaData> customMetaData) {
                this.customMetaData = customMetaData;
                return this;
            }

            public MetaDataConfig build() {
                return new MetaDataConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class VectorDBConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CollectionName")
        private String collectionName;

        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("VectorDBType")
        private String vectorDBType;

        private VectorDBConfig(Builder builder) {
            this.collectionName = builder.collectionName;
            this.connectionId = builder.connectionId;
            this.connectionName = builder.connectionName;
            this.vectorDBType = builder.vectorDBType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorDBConfig create() {
            return builder().build();
        }

        /**
         * @return collectionName
         */
        public String getCollectionName() {
            return this.collectionName;
        }

        /**
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return vectorDBType
         */
        public String getVectorDBType() {
            return this.vectorDBType;
        }

        public static final class Builder {
            private String collectionName; 
            private String connectionId; 
            private String connectionName; 
            private String vectorDBType; 

            private Builder() {
            } 

            private Builder(VectorDBConfig model) {
                this.collectionName = model.collectionName;
                this.connectionId = model.connectionId;
                this.connectionName = model.connectionName;
                this.vectorDBType = model.vectorDBType;
            } 

            /**
             * <p>Collectioin名称</p>
             */
            public Builder collectionName(String collectionName) {
                this.collectionName = collectionName;
                return this;
            }

            /**
             * <p>Embedding连接ID</p>
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>VectorDB连接名称</p>
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * <p>VectorDB类型</p>
             */
            public Builder vectorDBType(String vectorDBType) {
                this.vectorDBType = vectorDBType;
                return this;
            }

            public VectorDBConfig build() {
                return new VectorDBConfig(this);
            } 

        } 

    }
}
