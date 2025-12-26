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
 * {@link CreateKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseRequest</p>
 */
public class CreateKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChunkConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private ChunkConfig chunkConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSources")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmbeddingConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private EmbeddingConfig embeddingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IndexColumnConfig")
    private IndexColumnConfig indexColumnConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaDataConfig")
    private MetaDataConfig metaDataConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputDir")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputDir;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    private String runtimeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VectorDBConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private VectorDBConfig vectorDBConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.chunkConfig = builder.chunkConfig;
        this.dataSources = builder.dataSources;
        this.description = builder.description;
        this.embeddingConfig = builder.embeddingConfig;
        this.indexColumnConfig = builder.indexColumnConfig;
        this.knowledgeBaseType = builder.knowledgeBaseType;
        this.metaDataConfig = builder.metaDataConfig;
        this.name = builder.name;
        this.outputDir = builder.outputDir;
        this.runtimeId = builder.runtimeId;
        this.vectorDBConfig = builder.vectorDBConfig;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
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
     * @return chunkConfig
     */
    public ChunkConfig getChunkConfig() {
        return this.chunkConfig;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
        return this.dataSources;
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
     * @return indexColumnConfig
     */
    public IndexColumnConfig getIndexColumnConfig() {
        return this.indexColumnConfig;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseRequest, Builder> {
        private String accessibility; 
        private ChunkConfig chunkConfig; 
        private java.util.List<DataSources> dataSources; 
        private String description; 
        private EmbeddingConfig embeddingConfig; 
        private IndexColumnConfig indexColumnConfig; 
        private String knowledgeBaseType; 
        private MetaDataConfig metaDataConfig; 
        private String name; 
        private String outputDir; 
        private String runtimeId; 
        private VectorDBConfig vectorDBConfig; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.chunkConfig = request.chunkConfig;
            this.dataSources = request.dataSources;
            this.description = request.description;
            this.embeddingConfig = request.embeddingConfig;
            this.indexColumnConfig = request.indexColumnConfig;
            this.knowledgeBaseType = request.knowledgeBaseType;
            this.metaDataConfig = request.metaDataConfig;
            this.name = request.name;
            this.outputDir = request.outputDir;
            this.runtimeId = request.runtimeId;
            this.vectorDBConfig = request.vectorDBConfig;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder chunkConfig(ChunkConfig chunkConfig) {
            this.putBodyParameter("ChunkConfig", chunkConfig);
            this.chunkConfig = chunkConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.putBodyParameter("DataSources", dataSources);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
            this.putBodyParameter("EmbeddingConfig", embeddingConfig);
            this.embeddingConfig = embeddingConfig;
            return this;
        }

        /**
         * IndexColumnConfig.
         */
        public Builder indexColumnConfig(IndexColumnConfig indexColumnConfig) {
            this.putBodyParameter("IndexColumnConfig", indexColumnConfig);
            this.indexColumnConfig = indexColumnConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        public Builder knowledgeBaseType(String knowledgeBaseType) {
            this.putBodyParameter("KnowledgeBaseType", knowledgeBaseType);
            this.knowledgeBaseType = knowledgeBaseType;
            return this;
        }

        /**
         * MetaDataConfig.
         */
        public Builder metaDataConfig(MetaDataConfig metaDataConfig) {
            this.putBodyParameter("MetaDataConfig", metaDataConfig);
            this.metaDataConfig = metaDataConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/langstudio/output/</p>
         */
        public Builder outputDir(String outputDir) {
            this.putBodyParameter("OutputDir", outputDir);
            this.outputDir = outputDir;
            return this;
        }

        /**
         * RuntimeId.
         */
        public Builder runtimeId(String runtimeId) {
            this.putBodyParameter("RuntimeId", runtimeId);
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vectorDBConfig(VectorDBConfig vectorDBConfig) {
            this.putBodyParameter("VectorDBConfig", vectorDBConfig);
            this.vectorDBConfig = vectorDBConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateKnowledgeBaseRequest build() {
            return new CreateKnowledgeBaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder chunkDuration(Integer chunkDuration) {
                this.chunkDuration = chunkDuration;
                return this;
            }

            /**
             * <p>分块重叠大小</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder chunkOverlap(Integer chunkOverlap) {
                this.chunkOverlap = chunkOverlap;
                return this;
            }

            /**
             * <p>分块大小</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder chunkSize(Integer chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * <p>分块策略</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/langstudio/source/</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
     */
    public static class EmbeddingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("Model")
        @com.aliyun.core.annotation.Validation(required = true)
        private String model;

        private EmbeddingConfig(Builder builder) {
            this.connectionId = builder.connectionId;
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
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        public static final class Builder {
            private String connectionId; 
            private String model; 

            private Builder() {
            } 

            private Builder(EmbeddingConfig model) {
                this.connectionId = model.connectionId;
                this.model = model.model;
            } 

            /**
             * <p>Embedding连接ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>conn-r3o7******38bh</p>
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>模型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>text-embedding-v4</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
             * 
             * <strong>example:</strong>
             * <p>column1</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
             * 
             * <strong>example:</strong>
             * <p>column1</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
             * 
             * <strong>example:</strong>
             * <p>column1</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
             * <p>元数据Key</p>
             * 
             * <strong>example:</strong>
             * <p>author</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>元数据Value类型</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
     */
    public static class VectorDBConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CollectionName")
        private String collectionName;

        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("VectorDBType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vectorDBType;

        private VectorDBConfig(Builder builder) {
            this.collectionName = builder.collectionName;
            this.connectionId = builder.connectionId;
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
         * @return vectorDBType
         */
        public String getVectorDBType() {
            return this.vectorDBType;
        }

        public static final class Builder {
            private String collectionName; 
            private String connectionId; 
            private String vectorDBType; 

            private Builder() {
            } 

            private Builder(VectorDBConfig model) {
                this.collectionName = model.collectionName;
                this.connectionId = model.connectionId;
                this.vectorDBType = model.vectorDBType;
            } 

            /**
             * <p>Collectioin名称</p>
             * 
             * <strong>example:</strong>
             * <p>my_collection</p>
             */
            public Builder collectionName(String collectionName) {
                this.collectionName = collectionName;
                return this;
            }

            /**
             * <p>Embedding连接ID</p>
             * 
             * <strong>example:</strong>
             * <p>conn-7y5y******jja7</p>
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>VectorDB类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Milvus</p>
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
