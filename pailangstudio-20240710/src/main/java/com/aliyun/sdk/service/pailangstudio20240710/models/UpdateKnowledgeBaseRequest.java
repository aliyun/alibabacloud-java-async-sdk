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
 * {@link UpdateKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeBaseRequest</p>
 */
public class UpdateKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoUpdateConfig")
    private AutoUpdateConfig autoUpdateConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BindRuntime")
    private Boolean bindRuntime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaDataConfig")
    private MetaDataConfig metaDataConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    private String runtimeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.autoUpdateConfig = builder.autoUpdateConfig;
        this.bindRuntime = builder.bindRuntime;
        this.description = builder.description;
        this.metaDataConfig = builder.metaDataConfig;
        this.runtimeId = builder.runtimeId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return autoUpdateConfig
     */
    public AutoUpdateConfig getAutoUpdateConfig() {
        return this.autoUpdateConfig;
    }

    /**
     * @return bindRuntime
     */
    public Boolean getBindRuntime() {
        return this.bindRuntime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metaDataConfig
     */
    public MetaDataConfig getMetaDataConfig() {
        return this.metaDataConfig;
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeBaseRequest, Builder> {
        private String knowledgeBaseId; 
        private AutoUpdateConfig autoUpdateConfig; 
        private Boolean bindRuntime; 
        private String description; 
        private MetaDataConfig metaDataConfig; 
        private String runtimeId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeBaseRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.autoUpdateConfig = request.autoUpdateConfig;
            this.bindRuntime = request.bindRuntime;
            this.description = request.description;
            this.metaDataConfig = request.metaDataConfig;
            this.runtimeId = request.runtimeId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Knowledge Base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-nacr******sxd2</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>Knowledge Base Automatic Update Configuration.</p>
         */
        public Builder autoUpdateConfig(AutoUpdateConfig autoUpdateConfig) {
            this.putBodyParameter("AutoUpdateConfig", autoUpdateConfig);
            this.autoUpdateConfig = autoUpdateConfig;
            return this;
        }

        /**
         * <p>Whether to bind at runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder bindRuntime(Boolean bindRuntime) {
            this.putBodyParameter("BindRuntime", bindRuntime);
            this.bindRuntime = bindRuntime;
            return this;
        }

        /**
         * <p>Knowledge base description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of the knowledge base.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Metadata Configuration.</p>
         */
        public Builder metaDataConfig(MetaDataConfig metaDataConfig) {
            this.putBodyParameter("MetaDataConfig", metaDataConfig);
            this.metaDataConfig = metaDataConfig;
            return this;
        }

        /**
         * <p>Runtime ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rtime-231x****tmo4</p>
         */
        public Builder runtimeId(String runtimeId) {
            this.putBodyParameter("RuntimeId", runtimeId);
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>285773</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateKnowledgeBaseRequest build() {
            return new UpdateKnowledgeBaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
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
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>Driver Version.</p>
             * 
             * <strong>example:</strong>
             * <p>550.127.08</p>
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * <p>The number of GPU cards.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder GPU(Integer GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>The GPU Class.</p>
             * 
             * <strong>example:</strong>
             * <p>V100</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>Model name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Memory size, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>Shared memory capacity, in units of GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder sharedMemory(Integer sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            /**
             * <p>Node type. Possible values are Head and Worker.</p>
             * 
             * <strong>example:</strong>
             * <p>Worker</p>
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
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
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
             * <p>Index batch size. Documentation and structured data type Knowledge Base are effective.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>Index concurrency. Image and Video Type Knowledge Base is valid.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
     */
    public static class AutoUpdateConfig extends TeaModel {
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
             * <p>Run Resource Configuration List Documentation and structured knowledge base contain only one element and the <strong>Type</strong> is Worker. images and videos knowledge base contain two elements and the <strong>Types</strong> are Head and Worker.</p>
             */
            public Builder ecsSpecs(java.util.List<EcsSpecs> ecsSpecs) {
                this.ecsSpecs = ecsSpecs;
                return this;
            }

            /**
             * <p>Vector Index Configuration.</p>
             */
            public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
                this.embeddingConfig = embeddingConfig;
                return this;
            }

            /**
             * <p>Maximum task running time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder maxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
                this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
                return this;
            }

            /**
             * <p>Resource Group ID. Empty or public-cluster indicates public resource.</p>
             * 
             * <strong>example:</strong>
             * <p>quota89**76</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Knowledge Base Automatic Update Switch Status</p>
             * <ul>
             * <li>Enable: Turn on automatic updates.</li>
             * <li>Disable: Turn off automatic updates.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>User VPC Configuration.</p>
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
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
     */
    public static class CustomMetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private CustomMetaData(Builder builder) {
            this.key = builder.key;
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
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String key; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(CustomMetaData model) {
                this.key = model.key;
                this.valueType = model.valueType;
            } 

            /**
             * <p>Metadata Field Name.</p>
             * 
             * <strong>example:</strong>
             * <p>author</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Metadata Field Type Currently, only the String class type is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
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
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
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
             * <p>Custom metadata.</p>
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
}
