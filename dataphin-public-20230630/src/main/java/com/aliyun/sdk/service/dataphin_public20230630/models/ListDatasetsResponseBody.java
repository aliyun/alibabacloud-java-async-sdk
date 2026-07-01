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
 * {@link ListDatasetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetsResponseBody</p>
 */
public class ListDatasetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDatasetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDatasetsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDatasetsResponseBody build() {
            return new ListDatasetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
     */
    public static class OwnerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private OwnerList(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerList create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(OwnerList model) {
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public OwnerList build() {
                return new OwnerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
             * <p>instance</p>
             */
            public Builder dimension(Long dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>multimodal-embedding-v1</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
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
             * <p>7128268454335680</p>
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
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
     */
    public static class DataVersionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileStorageConfig")
        private FileStorageConfig fileStorageConfig;

        @com.aliyun.core.annotation.NameInMap("MetadataStorageConfig")
        private MetadataStorageConfig metadataStorageConfig;

        @com.aliyun.core.annotation.NameInMap("RealtimeMetaTableConfig")
        private RealtimeMetaTableConfig realtimeMetaTableConfig;

        @com.aliyun.core.annotation.NameInMap("VersionDescription")
        private String versionDescription;

        private DataVersionConfig(Builder builder) {
            this.fileStorageConfig = builder.fileStorageConfig;
            this.metadataStorageConfig = builder.metadataStorageConfig;
            this.realtimeMetaTableConfig = builder.realtimeMetaTableConfig;
            this.versionDescription = builder.versionDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataVersionConfig create() {
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

            private Builder(DataVersionConfig model) {
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

            public DataVersionConfig build() {
                return new DataVersionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
     */
    public static class VersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DataVersionConfig")
        private DataVersionConfig dataVersionConfig;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private Long datasetId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private VersionList(Builder builder) {
            this.creator = builder.creator;
            this.dataVersionConfig = builder.dataVersionConfig;
            this.datasetId = builder.datasetId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionList create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataVersionConfig
         */
        public DataVersionConfig getDataVersionConfig() {
            return this.dataVersionConfig;
        }

        /**
         * @return datasetId
         */
        public Long getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String creator; 
            private DataVersionConfig dataVersionConfig; 
            private Long datasetId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String version; 

            private Builder() {
            } 

            private Builder(VersionList model) {
                this.creator = model.creator;
                this.dataVersionConfig = model.dataVersionConfig;
                this.datasetId = model.datasetId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.version = model.version;
            } 

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DataVersionConfig.
             */
            public Builder dataVersionConfig(DataVersionConfig dataVersionConfig) {
                this.dataVersionConfig = dataVersionConfig;
                return this;
            }

            /**
             * DatasetId.
             */
            public Builder datasetId(Long datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionList build() {
                return new VersionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("DataCellId")
        private String dataCellId;

        @com.aliyun.core.annotation.NameInMap("DataCellName")
        private String dataCellName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LockOwner")
        private String lockOwner;

        @com.aliyun.core.annotation.NameInMap("LockOwnerName")
        private String lockOwnerName;

        @com.aliyun.core.annotation.NameInMap("MetadataStorageType")
        private String metadataStorageType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerList")
        private java.util.List<OwnerList> ownerList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VersionList")
        private java.util.List<VersionList> versionList;

        private ResultData(Builder builder) {
            this.contentType = builder.contentType;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.dataCellId = builder.dataCellId;
            this.dataCellName = builder.dataCellName;
            this.description = builder.description;
            this.directory = builder.directory;
            this.fileId = builder.fileId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lockOwner = builder.lockOwner;
            this.lockOwnerName = builder.lockOwnerName;
            this.metadataStorageType = builder.metadataStorageType;
            this.name = builder.name;
            this.ownerList = builder.ownerList;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.scenario = builder.scenario;
            this.storageType = builder.storageType;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
            this.versionList = builder.versionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return dataCellId
         */
        public String getDataCellId() {
            return this.dataCellId;
        }

        /**
         * @return dataCellName
         */
        public String getDataCellName() {
            return this.dataCellName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lockOwner
         */
        public String getLockOwner() {
            return this.lockOwner;
        }

        /**
         * @return lockOwnerName
         */
        public String getLockOwnerName() {
            return this.lockOwnerName;
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
         * @return ownerList
         */
        public java.util.List<OwnerList> getOwnerList() {
            return this.ownerList;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
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
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return versionList
         */
        public java.util.List<VersionList> getVersionList() {
            return this.versionList;
        }

        public static final class Builder {
            private String contentType; 
            private String creator; 
            private String creatorName; 
            private String dataCellId; 
            private String dataCellName; 
            private String description; 
            private String directory; 
            private Long fileId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String lockOwner; 
            private String lockOwnerName; 
            private String metadataStorageType; 
            private String name; 
            private java.util.List<OwnerList> ownerList; 
            private Long projectId; 
            private String projectName; 
            private String scenario; 
            private String storageType; 
            private Long tenantId; 
            private String type; 
            private java.util.List<VersionList> versionList; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.contentType = model.contentType;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.dataCellId = model.dataCellId;
                this.dataCellName = model.dataCellName;
                this.description = model.description;
                this.directory = model.directory;
                this.fileId = model.fileId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.lockOwner = model.lockOwner;
                this.lockOwnerName = model.lockOwnerName;
                this.metadataStorageType = model.metadataStorageType;
                this.name = model.name;
                this.ownerList = model.ownerList;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.scenario = model.scenario;
                this.storageType = model.storageType;
                this.tenantId = model.tenantId;
                this.type = model.type;
                this.versionList = model.versionList;
            } 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
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
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
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
             * DataCellName.
             */
            public Builder dataCellName(String dataCellName) {
                this.dataCellName = dataCellName;
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
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LockOwner.
             */
            public Builder lockOwner(String lockOwner) {
                this.lockOwner = lockOwner;
                return this;
            }

            /**
             * LockOwnerName.
             */
            public Builder lockOwnerName(String lockOwnerName) {
                this.lockOwnerName = lockOwnerName;
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
             * 
             * <strong>example:</strong>
             * <p>happen_time</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerList.
             */
            public Builder ownerList(java.util.List<OwnerList> ownerList) {
                this.ownerList = ownerList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7128268454335680</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * Scenario.
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
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
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
             * VersionList.
             */
            public Builder versionList(java.util.List<VersionList> versionList) {
                this.versionList = versionList;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("ResultData")
        private java.util.List<ResultData> resultData;

        private PageResult(Builder builder) {
            this.count = builder.count;
            this.resultData = builder.resultData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return resultData
         */
        public java.util.List<ResultData> getResultData() {
            return this.resultData;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List<ResultData> resultData; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.count = model.count;
                this.resultData = model.resultData;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * ResultData.
             */
            public Builder resultData(java.util.List<ResultData> resultData) {
                this.resultData = resultData;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
