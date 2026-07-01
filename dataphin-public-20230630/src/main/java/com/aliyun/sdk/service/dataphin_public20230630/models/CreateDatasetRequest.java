// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7255013756724992</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class FileStorageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DevPath")
        private String devPath;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("ProdPath")
        @com.aliyun.core.annotation.Validation(required = true)
        private String prodPath;

        private FileStorageConfig(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.devPath = builder.devPath;
            this.mountPath = builder.mountPath;
            this.prodPath = builder.prodPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileStorageConfig create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return devPath
         */
        public String getDevPath() {
            return this.devPath;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return prodPath
         */
        public String getProdPath() {
            return this.prodPath;
        }

        public static final class Builder {
            private String dataSourceId; 
            private String dataSourceName; 
            private String devPath; 
            private String mountPath; 
            private String prodPath; 

            private Builder() {
            } 

            private Builder(FileStorageConfig model) {
                this.dataSourceId = model.dataSourceId;
                this.dataSourceName = model.dataSourceName;
                this.devPath = model.devPath;
                this.mountPath = model.mountPath;
                this.prodPath = model.prodPath;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7445343860022804608</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * DevPath.
             */
            public Builder devPath(String devPath) {
                this.devPath = devPath;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/var/run/openresty/cache/corp</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder prodPath(String prodPath) {
                this.prodPath = prodPath;
                return this;
            }

            public FileStorageConfig build() {
                return new FileStorageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class VectorIndexConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dimension;

        @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
        @com.aliyun.core.annotation.Validation(required = true)
        private String embeddingModel;

        @com.aliyun.core.annotation.NameInMap("IndexParams")
        private java.util.Map<String, ?> indexParams;

        @com.aliyun.core.annotation.NameInMap("IndexType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String indexType;

        @com.aliyun.core.annotation.NameInMap("SimilarityType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String similarityType;

        private VectorIndexConfig(Builder builder) {
            this.dimension = builder.dimension;
            this.embeddingModel = builder.embeddingModel;
            this.indexParams = builder.indexParams;
            this.indexType = builder.indexType;
            this.similarityType = builder.similarityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorIndexConfig create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public Long getDimension() {
            return this.dimension;
        }

        /**
         * @return embeddingModel
         */
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        /**
         * @return indexParams
         */
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        /**
         * @return indexType
         */
        public String getIndexType() {
            return this.indexType;
        }

        /**
         * @return similarityType
         */
        public String getSimilarityType() {
            return this.similarityType;
        }

        public static final class Builder {
            private Long dimension; 
            private String embeddingModel; 
            private java.util.Map<String, ?> indexParams; 
            private String indexType; 
            private String similarityType; 

            private Builder() {
            } 

            private Builder(VectorIndexConfig model) {
                this.dimension = model.dimension;
                this.embeddingModel = model.embeddingModel;
                this.indexParams = model.indexParams;
                this.indexType = model.indexType;
                this.similarityType = model.similarityType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>instance:mongodb</p>
             */
            public Builder dimension(Long dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MultiModal-Embedding</p>
             */
            public Builder embeddingModel(String embeddingModel) {
                this.embeddingModel = embeddingModel;
                return this;
            }

            /**
             * IndexParams.
             */
            public Builder indexParams(java.util.Map<String, ?> indexParams) {
                this.indexParams = indexParams;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AUTOINDEX</p>
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>COSINE</p>
             */
            public Builder similarityType(String similarityType) {
                this.similarityType = similarityType;
                return this;
            }

            public VectorIndexConfig build() {
                return new VectorIndexConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ElementType")
        private String elementType;

        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private Boolean pk;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private Boolean url;

        @com.aliyun.core.annotation.NameInMap("VectorIndexConfig")
        private VectorIndexConfig vectorIndexConfig;

        private Columns(Builder builder) {
            this.comment = builder.comment;
            this.elementType = builder.elementType;
            this.maxCapacity = builder.maxCapacity;
            this.name = builder.name;
            this.pk = builder.pk;
            this.type = builder.type;
            this.url = builder.url;
            this.vectorIndexConfig = builder.vectorIndexConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return elementType
         */
        public String getElementType() {
            return this.elementType;
        }

        /**
         * @return maxCapacity
         */
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pk
         */
        public Boolean getPk() {
            return this.pk;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public Boolean getUrl() {
            return this.url;
        }

        /**
         * @return vectorIndexConfig
         */
        public VectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

        public static final class Builder {
            private String comment; 
            private String elementType; 
            private Integer maxCapacity; 
            private String name; 
            private Boolean pk; 
            private String type; 
            private Boolean url; 
            private VectorIndexConfig vectorIndexConfig; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.comment = model.comment;
                this.elementType = model.elementType;
                this.maxCapacity = model.maxCapacity;
                this.name = model.name;
                this.pk = model.pk;
                this.type = model.type;
                this.url = model.url;
                this.vectorIndexConfig = model.vectorIndexConfig;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * ElementType.
             */
            public Builder elementType(String elementType) {
                this.elementType = elementType;
                return this;
            }

            /**
             * MaxCapacity.
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(Boolean pk) {
                this.pk = pk;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>int8</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(Boolean url) {
                this.url = url;
                return this;
            }

            /**
             * VectorIndexConfig.
             */
            public Builder vectorIndexConfig(VectorIndexConfig vectorIndexConfig) {
                this.vectorIndexConfig = vectorIndexConfig;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class TableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        private TableSchema(Builder builder) {
            this.columns = builder.columns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableSchema create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        public static final class Builder {
            private java.util.List<Columns> columns; 

            private Builder() {
            } 

            private Builder(TableSchema model) {
                this.columns = model.columns;
            } 

            /**
             * Columns.
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            public TableSchema build() {
                return new TableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class MetadataStorageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DevSchema")
        private String devSchema;

        @com.aliyun.core.annotation.NameInMap("MetadataStorageMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metadataStorageMode;

        @com.aliyun.core.annotation.NameInMap("MetadataStorageType")
        private String metadataStorageType;

        @com.aliyun.core.annotation.NameInMap("ProdSchema")
        @com.aliyun.core.annotation.Validation(required = true)
        private String prodSchema;

        @com.aliyun.core.annotation.NameInMap("TableName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableSchema")
        private TableSchema tableSchema;

        private MetadataStorageConfig(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.devSchema = builder.devSchema;
            this.metadataStorageMode = builder.metadataStorageMode;
            this.metadataStorageType = builder.metadataStorageType;
            this.prodSchema = builder.prodSchema;
            this.tableName = builder.tableName;
            this.tableSchema = builder.tableSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetadataStorageConfig create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return devSchema
         */
        public String getDevSchema() {
            return this.devSchema;
        }

        /**
         * @return metadataStorageMode
         */
        public String getMetadataStorageMode() {
            return this.metadataStorageMode;
        }

        /**
         * @return metadataStorageType
         */
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        /**
         * @return prodSchema
         */
        public String getProdSchema() {
            return this.prodSchema;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableSchema
         */
        public TableSchema getTableSchema() {
            return this.tableSchema;
        }

        public static final class Builder {
            private String dataSourceId; 
            private String dataSourceName; 
            private String devSchema; 
            private String metadataStorageMode; 
            private String metadataStorageType; 
            private String prodSchema; 
            private String tableName; 
            private TableSchema tableSchema; 

            private Builder() {
            } 

            private Builder(MetadataStorageConfig model) {
                this.dataSourceId = model.dataSourceId;
                this.dataSourceName = model.dataSourceName;
                this.devSchema = model.devSchema;
                this.metadataStorageMode = model.metadataStorageMode;
                this.metadataStorageType = model.metadataStorageType;
                this.prodSchema = model.prodSchema;
                this.tableName = model.tableName;
                this.tableSchema = model.tableSchema;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7429133693081710272</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * DevSchema.
             */
            public Builder devSchema(String devSchema) {
                this.devSchema = devSchema;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder metadataStorageMode(String metadataStorageMode) {
                this.metadataStorageMode = metadataStorageMode;
                return this;
            }

            /**
             * MetadataStorageType.
             */
            public Builder metadataStorageType(String metadataStorageType) {
                this.metadataStorageType = metadataStorageType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder prodSchema(String prodSchema) {
                this.prodSchema = prodSchema;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>s_crm_all_plt_jala_shop</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TableSchema.
             */
            public Builder tableSchema(TableSchema tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            public MetadataStorageConfig build() {
                return new MetadataStorageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class ColumnsVectorIndexConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dimension;

        @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
        @com.aliyun.core.annotation.Validation(required = true)
        private String embeddingModel;

        @com.aliyun.core.annotation.NameInMap("IndexParams")
        private java.util.Map<String, ?> indexParams;

        @com.aliyun.core.annotation.NameInMap("IndexType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String indexType;

        @com.aliyun.core.annotation.NameInMap("SimilarityType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String similarityType;

        private ColumnsVectorIndexConfig(Builder builder) {
            this.dimension = builder.dimension;
            this.embeddingModel = builder.embeddingModel;
            this.indexParams = builder.indexParams;
            this.indexType = builder.indexType;
            this.similarityType = builder.similarityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnsVectorIndexConfig create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public Long getDimension() {
            return this.dimension;
        }

        /**
         * @return embeddingModel
         */
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        /**
         * @return indexParams
         */
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        /**
         * @return indexType
         */
        public String getIndexType() {
            return this.indexType;
        }

        /**
         * @return similarityType
         */
        public String getSimilarityType() {
            return this.similarityType;
        }

        public static final class Builder {
            private Long dimension; 
            private String embeddingModel; 
            private java.util.Map<String, ?> indexParams; 
            private String indexType; 
            private String similarityType; 

            private Builder() {
            } 

            private Builder(ColumnsVectorIndexConfig model) {
                this.dimension = model.dimension;
                this.embeddingModel = model.embeddingModel;
                this.indexParams = model.indexParams;
                this.indexType = model.indexType;
                this.similarityType = model.similarityType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>instance:MySQL.monitor</p>
             */
            public Builder dimension(Long dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MultiModal-Embedding</p>
             */
            public Builder embeddingModel(String embeddingModel) {
                this.embeddingModel = embeddingModel;
                return this;
            }

            /**
             * IndexParams.
             */
            public Builder indexParams(java.util.Map<String, ?> indexParams) {
                this.indexParams = indexParams;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AUTOINDEX</p>
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>COSINE</p>
             */
            public Builder similarityType(String similarityType) {
                this.similarityType = similarityType;
                return this;
            }

            public ColumnsVectorIndexConfig build() {
                return new ColumnsVectorIndexConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class TableSchemaColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ElementType")
        private String elementType;

        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private Boolean pk;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private Boolean url;

        @com.aliyun.core.annotation.NameInMap("VectorIndexConfig")
        private ColumnsVectorIndexConfig vectorIndexConfig;

        private TableSchemaColumns(Builder builder) {
            this.comment = builder.comment;
            this.elementType = builder.elementType;
            this.maxCapacity = builder.maxCapacity;
            this.name = builder.name;
            this.pk = builder.pk;
            this.type = builder.type;
            this.url = builder.url;
            this.vectorIndexConfig = builder.vectorIndexConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableSchemaColumns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return elementType
         */
        public String getElementType() {
            return this.elementType;
        }

        /**
         * @return maxCapacity
         */
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pk
         */
        public Boolean getPk() {
            return this.pk;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public Boolean getUrl() {
            return this.url;
        }

        /**
         * @return vectorIndexConfig
         */
        public ColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

        public static final class Builder {
            private String comment; 
            private String elementType; 
            private Integer maxCapacity; 
            private String name; 
            private Boolean pk; 
            private String type; 
            private Boolean url; 
            private ColumnsVectorIndexConfig vectorIndexConfig; 

            private Builder() {
            } 

            private Builder(TableSchemaColumns model) {
                this.comment = model.comment;
                this.elementType = model.elementType;
                this.maxCapacity = model.maxCapacity;
                this.name = model.name;
                this.pk = model.pk;
                this.type = model.type;
                this.url = model.url;
                this.vectorIndexConfig = model.vectorIndexConfig;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * ElementType.
             */
            public Builder elementType(String elementType) {
                this.elementType = elementType;
                return this;
            }

            /**
             * MaxCapacity.
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>happen_time</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(Boolean pk) {
                this.pk = pk;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>date</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(Boolean url) {
                this.url = url;
                return this;
            }

            /**
             * VectorIndexConfig.
             */
            public Builder vectorIndexConfig(ColumnsVectorIndexConfig vectorIndexConfig) {
                this.vectorIndexConfig = vectorIndexConfig;
                return this;
            }

            public TableSchemaColumns build() {
                return new TableSchemaColumns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class RealtimeMetaTableConfigTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<TableSchemaColumns> columns;

        private RealtimeMetaTableConfigTableSchema(Builder builder) {
            this.columns = builder.columns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeMetaTableConfigTableSchema create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<TableSchemaColumns> getColumns() {
            return this.columns;
        }

        public static final class Builder {
            private java.util.List<TableSchemaColumns> columns; 

            private Builder() {
            } 

            private Builder(RealtimeMetaTableConfigTableSchema model) {
                this.columns = model.columns;
            } 

            /**
             * Columns.
             */
            public Builder columns(java.util.List<TableSchemaColumns> columns) {
                this.columns = columns;
                return this;
            }

            public RealtimeMetaTableConfigTableSchema build() {
                return new RealtimeMetaTableConfigTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class RealtimeMetaTableConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String datasourceType;

        @com.aliyun.core.annotation.NameInMap("MetaTableName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metaTableName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("TableSchema")
        private RealtimeMetaTableConfigTableSchema tableSchema;

        private RealtimeMetaTableConfig(Builder builder) {
            this.datasourceType = builder.datasourceType;
            this.metaTableName = builder.metaTableName;
            this.projectId = builder.projectId;
            this.tableSchema = builder.tableSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeMetaTableConfig create() {
            return builder().build();
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return metaTableName
         */
        public String getMetaTableName() {
            return this.metaTableName;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return tableSchema
         */
        public RealtimeMetaTableConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

        public static final class Builder {
            private String datasourceType; 
            private String metaTableName; 
            private Long projectId; 
            private RealtimeMetaTableConfigTableSchema tableSchema; 

            private Builder() {
            } 

            private Builder(RealtimeMetaTableConfig model) {
                this.datasourceType = model.datasourceType;
                this.metaTableName = model.metaTableName;
                this.projectId = model.projectId;
                this.tableSchema = model.tableSchema;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>KAFKA</p>
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder metaTableName(String metaTableName) {
                this.metaTableName = metaTableName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7256391656294144</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * TableSchema.
             */
            public Builder tableSchema(RealtimeMetaTableConfigTableSchema tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            public RealtimeMetaTableConfig build() {
                return new RealtimeMetaTableConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class VersionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileStorageConfig")
        private FileStorageConfig fileStorageConfig;

        @com.aliyun.core.annotation.NameInMap("MetadataStorageConfig")
        private MetadataStorageConfig metadataStorageConfig;

        @com.aliyun.core.annotation.NameInMap("RealtimeMetaTableConfig")
        private RealtimeMetaTableConfig realtimeMetaTableConfig;

        @com.aliyun.core.annotation.NameInMap("VersionDescription")
        private String versionDescription;

        private VersionConfig(Builder builder) {
            this.fileStorageConfig = builder.fileStorageConfig;
            this.metadataStorageConfig = builder.metadataStorageConfig;
            this.realtimeMetaTableConfig = builder.realtimeMetaTableConfig;
            this.versionDescription = builder.versionDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionConfig create() {
            return builder().build();
        }

        /**
         * @return fileStorageConfig
         */
        public FileStorageConfig getFileStorageConfig() {
            return this.fileStorageConfig;
        }

        /**
         * @return metadataStorageConfig
         */
        public MetadataStorageConfig getMetadataStorageConfig() {
            return this.metadataStorageConfig;
        }

        /**
         * @return realtimeMetaTableConfig
         */
        public RealtimeMetaTableConfig getRealtimeMetaTableConfig() {
            return this.realtimeMetaTableConfig;
        }

        /**
         * @return versionDescription
         */
        public String getVersionDescription() {
            return this.versionDescription;
        }

        public static final class Builder {
            private FileStorageConfig fileStorageConfig; 
            private MetadataStorageConfig metadataStorageConfig; 
            private RealtimeMetaTableConfig realtimeMetaTableConfig; 
            private String versionDescription; 

            private Builder() {
            } 

            private Builder(VersionConfig model) {
                this.fileStorageConfig = model.fileStorageConfig;
                this.metadataStorageConfig = model.metadataStorageConfig;
                this.realtimeMetaTableConfig = model.realtimeMetaTableConfig;
                this.versionDescription = model.versionDescription;
            } 

            /**
             * FileStorageConfig.
             */
            public Builder fileStorageConfig(FileStorageConfig fileStorageConfig) {
                this.fileStorageConfig = fileStorageConfig;
                return this;
            }

            /**
             * MetadataStorageConfig.
             */
            public Builder metadataStorageConfig(MetadataStorageConfig metadataStorageConfig) {
                this.metadataStorageConfig = metadataStorageConfig;
                return this;
            }

            /**
             * RealtimeMetaTableConfig.
             */
            public Builder realtimeMetaTableConfig(RealtimeMetaTableConfig realtimeMetaTableConfig) {
                this.realtimeMetaTableConfig = realtimeMetaTableConfig;
                return this;
            }

            /**
             * VersionDescription.
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            public VersionConfig build() {
                return new VersionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("DataCellId")
        private String dataCellId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DirName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dirName;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("MetadataStorageType")
        private String metadataStorageType;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionConfig")
        private VersionConfig versionConfig;

        private CreateCommand(Builder builder) {
            this.contentType = builder.contentType;
            this.dataCellId = builder.dataCellId;
            this.description = builder.description;
            this.dirName = builder.dirName;
            this.fileId = builder.fileId;
            this.metadataStorageType = builder.metadataStorageType;
            this.name = builder.name;
            this.owner = builder.owner;
            this.scenario = builder.scenario;
            this.storageType = builder.storageType;
            this.type = builder.type;
            this.version = builder.version;
            this.versionConfig = builder.versionConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return dataCellId
         */
        public String getDataCellId() {
            return this.dataCellId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dirName
         */
        public String getDirName() {
            return this.dirName;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return metadataStorageType
         */
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionConfig
         */
        public VersionConfig getVersionConfig() {
            return this.versionConfig;
        }

        public static final class Builder {
            private String contentType; 
            private String dataCellId; 
            private String description; 
            private String dirName; 
            private String fileId; 
            private String metadataStorageType; 
            private String name; 
            private String owner; 
            private String scenario; 
            private String storageType; 
            private String type; 
            private String version; 
            private VersionConfig versionConfig; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.contentType = model.contentType;
                this.dataCellId = model.dataCellId;
                this.description = model.description;
                this.dirName = model.dirName;
                this.fileId = model.fileId;
                this.metadataStorageType = model.metadataStorageType;
                this.name = model.name;
                this.owner = model.owner;
                this.scenario = model.scenario;
                this.storageType = model.storageType;
                this.type = model.type;
                this.version = model.version;
                this.versionConfig = model.versionConfig;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>GENERAL</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * DataCellId.
             */
            public Builder dataCellId(String dataCellId) {
                this.dataCellId = dataCellId;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder dirName(String dirName) {
                this.dirName = dirName;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * MetadataStorageType.
             */
            public Builder metadataStorageType(String metadataStorageType) {
                this.metadataStorageType = metadataStorageType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFLINE</p>
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FILE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VersionConfig.
             */
            public Builder versionConfig(VersionConfig versionConfig) {
                this.versionConfig = versionConfig;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
