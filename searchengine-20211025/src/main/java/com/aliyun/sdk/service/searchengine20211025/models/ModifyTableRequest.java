// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ModifyTableRequest} extends {@link RequestModel}
 *
 * <p>ModifyTableRequest</p>
 */
public class ModifyTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataProcessConfig")
    private java.util.List<DataProcessConfig> dataProcessConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fieldSchema")
    private java.util.Map<String, String> fieldSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("partitionCount")
    private Integer partitionCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("primaryKey")
    private String primaryKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rawSchema")
    private String rawSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vectorIndex")
    private java.util.List<VectorIndex> vectorIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private ModifyTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tableName = builder.tableName;
        this.dataProcessConfig = builder.dataProcessConfig;
        this.dataSource = builder.dataSource;
        this.fieldSchema = builder.fieldSchema;
        this.partitionCount = builder.partitionCount;
        this.primaryKey = builder.primaryKey;
        this.rawSchema = builder.rawSchema;
        this.vectorIndex = builder.vectorIndex;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return dataProcessConfig
     */
    public java.util.List<DataProcessConfig> getDataProcessConfig() {
        return this.dataProcessConfig;
    }

    /**
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @return fieldSchema
     */
    public java.util.Map<String, String> getFieldSchema() {
        return this.fieldSchema;
    }

    /**
     * @return partitionCount
     */
    public Integer getPartitionCount() {
        return this.partitionCount;
    }

    /**
     * @return primaryKey
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return rawSchema
     */
    public String getRawSchema() {
        return this.rawSchema;
    }

    /**
     * @return vectorIndex
     */
    public java.util.List<VectorIndex> getVectorIndex() {
        return this.vectorIndex;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<ModifyTableRequest, Builder> {
        private String instanceId; 
        private String tableName; 
        private java.util.List<DataProcessConfig> dataProcessConfig; 
        private DataSource dataSource; 
        private java.util.Map<String, String> fieldSchema; 
        private Integer partitionCount; 
        private String primaryKey; 
        private String rawSchema; 
        private java.util.List<VectorIndex> vectorIndex; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.tableName = request.tableName;
            this.dataProcessConfig = request.dataProcessConfig;
            this.dataSource = request.dataSource;
            this.fieldSchema = request.fieldSchema;
            this.partitionCount = request.partitionCount;
            this.primaryKey = request.primaryKey;
            this.rawSchema = request.rawSchema;
            this.vectorIndex = request.vectorIndex;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-tl32n3iu801</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>index_hdfs</p>
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The configurations about field processing.</p>
         */
        public Builder dataProcessConfig(java.util.List<DataProcessConfig> dataProcessConfig) {
            this.putBodyParameter("dataProcessConfig", dataProcessConfig);
            this.dataProcessConfig = dataProcessConfig;
            return this;
        }

        /**
         * <p>The configurations of the data source.</p>
         */
        public Builder dataSource(DataSource dataSource) {
            this.putBodyParameter("dataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The fields.</p>
         */
        public Builder fieldSchema(java.util.Map<String, String> fieldSchema) {
            this.putBodyParameter("fieldSchema", fieldSchema);
            this.fieldSchema = fieldSchema;
            return this;
        }

        /**
         * <p>The number of data shards.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder partitionCount(Integer partitionCount) {
            this.putBodyParameter("partitionCount", partitionCount);
            this.partitionCount = partitionCount;
            return this;
        }

        /**
         * <p>The primary key field.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder primaryKey(String primaryKey) {
            this.putBodyParameter("primaryKey", primaryKey);
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * <p>The instance schema. If this parameter is specified, the parameters about the index are not required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder rawSchema(String rawSchema) {
            this.putBodyParameter("rawSchema", rawSchema);
            this.rawSchema = rawSchema;
            return this;
        }

        /**
         * <p>The index schema.</p>
         */
        public Builder vectorIndex(java.util.List<VectorIndex> vectorIndex) {
            this.putBodyParameter("vectorIndex", vectorIndex);
            this.vectorIndex = vectorIndex;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. The system only checks the validity of the data source. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public ModifyTableRequest build() {
            return new ModifyTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTableRequest} extends {@link TeaModel}
     *
     * <p>ModifyTableRequest</p>
     */
    public static class SrcFieldConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ossBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("ossEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private SrcFieldConfig(Builder builder) {
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcFieldConfig create() {
            return builder().build();
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String ossBucket; 
            private String ossEndpoint; 
            private String uid; 

            private Builder() {
            } 

            private Builder(SrcFieldConfig model) {
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.uid = model.uid;
            } 

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The OSS endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>uid</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public SrcFieldConfig build() {
                return new SrcFieldConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTableRequest} extends {@link TeaModel}
     *
     * <p>ModifyTableRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("srcFieldConfig")
        private SrcFieldConfig srcFieldConfig;

        @com.aliyun.core.annotation.NameInMap("vectorModal")
        private String vectorModal;

        @com.aliyun.core.annotation.NameInMap("vectorModel")
        private String vectorModel;

        private Params(Builder builder) {
            this.srcFieldConfig = builder.srcFieldConfig;
            this.vectorModal = builder.vectorModal;
            this.vectorModel = builder.vectorModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return srcFieldConfig
         */
        public SrcFieldConfig getSrcFieldConfig() {
            return this.srcFieldConfig;
        }

        /**
         * @return vectorModal
         */
        public String getVectorModal() {
            return this.vectorModal;
        }

        /**
         * @return vectorModel
         */
        public String getVectorModel() {
            return this.vectorModel;
        }

        public static final class Builder {
            private SrcFieldConfig srcFieldConfig; 
            private String vectorModal; 
            private String vectorModel; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.srcFieldConfig = model.srcFieldConfig;
                this.vectorModal = model.vectorModal;
                this.vectorModel = model.vectorModel;
            } 

            /**
             * <p>The source of the data to be vectorized.</p>
             */
            public Builder srcFieldConfig(SrcFieldConfig srcFieldConfig) {
                this.srcFieldConfig = srcFieldConfig;
                return this;
            }

            /**
             * <p>The data type.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder vectorModal(String vectorModal) {
                this.vectorModal = vectorModal;
                return this;
            }

            /**
             * <p>The vectorization model.</p>
             * 
             * <strong>example:</strong>
             * <p>clip</p>
             */
            public Builder vectorModel(String vectorModel) {
                this.vectorModel = vectorModel;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTableRequest} extends {@link TeaModel}
     *
     * <p>ModifyTableRequest</p>
     */
    public static class DataProcessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dstField")
        private String dstField;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("params")
        private Params params;

        @com.aliyun.core.annotation.NameInMap("srcField")
        private String srcField;

        private DataProcessConfig(Builder builder) {
            this.dstField = builder.dstField;
            this.operator = builder.operator;
            this.params = builder.params;
            this.srcField = builder.srcField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataProcessConfig create() {
            return builder().build();
        }

        /**
         * @return dstField
         */
        public String getDstField() {
            return this.dstField;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return params
         */
        public Params getParams() {
            return this.params;
        }

        /**
         * @return srcField
         */
        public String getSrcField() {
            return this.srcField;
        }

        public static final class Builder {
            private String dstField; 
            private String operator; 
            private Params params; 
            private String srcField; 

            private Builder() {
            } 

            private Builder(DataProcessConfig model) {
                this.dstField = model.dstField;
                this.operator = model.operator;
                this.params = model.params;
                this.srcField = model.srcField;
            } 

            /**
             * <p>The destination field.</p>
             * 
             * <strong>example:</strong>
             * <p>source_image_vector</p>
             */
            public Builder dstField(String dstField) {
                this.dstField = dstField;
                return this;
            }

            /**
             * <p>The method used to process the field. Valid values: copy and vectorize. A value of copy specifies that the value of the source field is copied to the destination field. A value of vectorize specifies that the value of the source field is vectorized by a vectorization model and the output vector is stored in the destination field.</p>
             * 
             * <strong>example:</strong>
             * <p>vectorize</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The information about the model.</p>
             */
            public Builder params(Params params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The source field.</p>
             * 
             * <strong>example:</strong>
             * <p>source_image</p>
             */
            public Builder srcField(String srcField) {
                this.srcField = srcField;
                return this;
            }

            public DataProcessConfig build() {
                return new DataProcessConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTableRequest} extends {@link TeaModel}
     *
     * <p>ModifyTableRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("accessSecret")
        private String accessSecret;

        @com.aliyun.core.annotation.NameInMap("bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ossPath")
        private String ossPath;

        @com.aliyun.core.annotation.NameInMap("partition")
        private String partition;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("table")
        private String table;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        private Config(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessSecret = builder.accessSecret;
            this.bucket = builder.bucket;
            this.catalog = builder.catalog;
            this.database = builder.database;
            this.endpoint = builder.endpoint;
            this.ossPath = builder.ossPath;
            this.partition = builder.partition;
            this.project = builder.project;
            this.table = builder.table;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessSecret
         */
        public String getAccessSecret() {
            return this.accessSecret;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessSecret; 
            private String bucket; 
            private String catalog; 
            private String database; 
            private String endpoint; 
            private String ossPath; 
            private String partition; 
            private String project; 
            private String table; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.accessKey = model.accessKey;
                this.accessSecret = model.accessSecret;
                this.bucket = model.bucket;
                this.catalog = model.catalog;
                this.database = model.database;
                this.endpoint = model.endpoint;
                this.ossPath = model.ossPath;
                this.partition = model.partition;
                this.project = model.project;
                this.table = model.table;
                this.tag = model.tag;
            } 

            /**
             * <p>The AccessKey ID of the MaxCompute data source.</p>
             * 
             * <strong>example:</strong>
             * <p>AK</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The AccessKey secret of the MaxCompute data source.</p>
             * 
             * <strong>example:</strong>
             * <p>AS</p>
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>antsys-shujiang-osstest</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The endpoint of the MaxCompute data source.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The path of the Object Storage Service (OSS) object.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://opensearch</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * <p>The partition in the MaxCompute table.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20231220</p>
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project that is used as the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>yw_dw_rpt</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The name of the MaxCompute table that is used as the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>behavior</p>
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTableRequest} extends {@link TeaModel}
     *
     * <p>ModifyTableRequest</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoBuildIndex")
        private Boolean autoBuildIndex;

        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("dataTimeSec")
        private Integer dataTimeSec;

        private DataSource(Builder builder) {
            this.autoBuildIndex = builder.autoBuildIndex;
            this.config = builder.config;
            this.dataTimeSec = builder.dataTimeSec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return autoBuildIndex
         */
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return dataTimeSec
         */
        public Integer getDataTimeSec() {
            return this.dataTimeSec;
        }

        public static final class Builder {
            private Boolean autoBuildIndex; 
            private Config config; 
            private Integer dataTimeSec; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.autoBuildIndex = model.autoBuildIndex;
                this.config = model.config;
                this.dataTimeSec = model.dataTimeSec;
            } 

            /**
             * <p>Specifies whether to automatically rebuild the index.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * <p>The configurations of the data source.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The start timestamp from which incremental data is retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p>1715160176</p>
             */
            public Builder dataTimeSec(Integer dataTimeSec) {
                this.dataTimeSec = dataTimeSec;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTableRequest} extends {@link TeaModel}
     *
     * <p>ModifyTableRequest</p>
     */
    public static class AdvanceParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("buildIndexParams")
        private String buildIndexParams;

        @com.aliyun.core.annotation.NameInMap("linearBuildThreshold")
        private String linearBuildThreshold;

        @com.aliyun.core.annotation.NameInMap("minScanDocCnt")
        private String minScanDocCnt;

        @com.aliyun.core.annotation.NameInMap("searchIndexParams")
        private String searchIndexParams;

        private AdvanceParams(Builder builder) {
            this.buildIndexParams = builder.buildIndexParams;
            this.linearBuildThreshold = builder.linearBuildThreshold;
            this.minScanDocCnt = builder.minScanDocCnt;
            this.searchIndexParams = builder.searchIndexParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceParams create() {
            return builder().build();
        }

        /**
         * @return buildIndexParams
         */
        public String getBuildIndexParams() {
            return this.buildIndexParams;
        }

        /**
         * @return linearBuildThreshold
         */
        public String getLinearBuildThreshold() {
            return this.linearBuildThreshold;
        }

        /**
         * @return minScanDocCnt
         */
        public String getMinScanDocCnt() {
            return this.minScanDocCnt;
        }

        /**
         * @return searchIndexParams
         */
        public String getSearchIndexParams() {
            return this.searchIndexParams;
        }

        public static final class Builder {
            private String buildIndexParams; 
            private String linearBuildThreshold; 
            private String minScanDocCnt; 
            private String searchIndexParams; 

            private Builder() {
            } 

            private Builder(AdvanceParams model) {
                this.buildIndexParams = model.buildIndexParams;
                this.linearBuildThreshold = model.linearBuildThreshold;
                this.minScanDocCnt = model.minScanDocCnt;
                this.searchIndexParams = model.searchIndexParams;
            } 

            /**
             * <p>The index building parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder buildIndexParams(String buildIndexParams) {
                this.buildIndexParams = buildIndexParams;
                return this;
            }

            /**
             * <p>The threshold for linear building.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder linearBuildThreshold(String linearBuildThreshold) {
                this.linearBuildThreshold = linearBuildThreshold;
                return this;
            }

            /**
             * <p>The minimum number of retrieved candidate sets.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder minScanDocCnt(String minScanDocCnt) {
                this.minScanDocCnt = minScanDocCnt;
                return this;
            }

            /**
             * <p>The index retrieval parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder searchIndexParams(String searchIndexParams) {
                this.searchIndexParams = searchIndexParams;
                return this;
            }

            public AdvanceParams build() {
                return new AdvanceParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTableRequest} extends {@link TeaModel}
     *
     * <p>ModifyTableRequest</p>
     */
    public static class VectorIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("advanceParams")
        private AdvanceParams advanceParams;

        @com.aliyun.core.annotation.NameInMap("dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("distanceType")
        private String distanceType;

        @com.aliyun.core.annotation.NameInMap("indexName")
        private String indexName;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("sparseIndexField")
        private String sparseIndexField;

        @com.aliyun.core.annotation.NameInMap("sparseValueField")
        private String sparseValueField;

        @com.aliyun.core.annotation.NameInMap("vectorField")
        private String vectorField;

        @com.aliyun.core.annotation.NameInMap("vectorIndexType")
        private String vectorIndexType;

        private VectorIndex(Builder builder) {
            this.advanceParams = builder.advanceParams;
            this.dimension = builder.dimension;
            this.distanceType = builder.distanceType;
            this.indexName = builder.indexName;
            this.namespace = builder.namespace;
            this.sparseIndexField = builder.sparseIndexField;
            this.sparseValueField = builder.sparseValueField;
            this.vectorField = builder.vectorField;
            this.vectorIndexType = builder.vectorIndexType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorIndex create() {
            return builder().build();
        }

        /**
         * @return advanceParams
         */
        public AdvanceParams getAdvanceParams() {
            return this.advanceParams;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return distanceType
         */
        public String getDistanceType() {
            return this.distanceType;
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return sparseIndexField
         */
        public String getSparseIndexField() {
            return this.sparseIndexField;
        }

        /**
         * @return sparseValueField
         */
        public String getSparseValueField() {
            return this.sparseValueField;
        }

        /**
         * @return vectorField
         */
        public String getVectorField() {
            return this.vectorField;
        }

        /**
         * @return vectorIndexType
         */
        public String getVectorIndexType() {
            return this.vectorIndexType;
        }

        public static final class Builder {
            private AdvanceParams advanceParams; 
            private String dimension; 
            private String distanceType; 
            private String indexName; 
            private String namespace; 
            private String sparseIndexField; 
            private String sparseValueField; 
            private String vectorField; 
            private String vectorIndexType; 

            private Builder() {
            } 

            private Builder(VectorIndex model) {
                this.advanceParams = model.advanceParams;
                this.dimension = model.dimension;
                this.distanceType = model.distanceType;
                this.indexName = model.indexName;
                this.namespace = model.namespace;
                this.sparseIndexField = model.sparseIndexField;
                this.sparseValueField = model.sparseValueField;
                this.vectorField = model.vectorField;
                this.vectorIndexType = model.vectorIndexType;
            } 

            /**
             * <p>The configurations of the index schema.</p>
             */
            public Builder advanceParams(AdvanceParams advanceParams) {
                this.advanceParams = advanceParams;
                return this;
            }

            /**
             * <p>The dimension of the vector.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The distance type.</p>
             * 
             * <strong>example:</strong>
             * <p>SquaredEuclidean</p>
             */
            public Builder distanceType(String distanceType) {
                this.distanceType = distanceType;
                return this;
            }

            /**
             * <p>The name of the index schema.</p>
             * 
             * <strong>example:</strong>
             * <p>test_api</p>
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * <p>The namespace field.</p>
             * 
             * <strong>example:</strong>
             * <p>namespace</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The field that stores the indexes of the elements in sparse vectors.</p>
             * 
             * <strong>example:</strong>
             * <p>sparse_indices</p>
             */
            public Builder sparseIndexField(String sparseIndexField) {
                this.sparseIndexField = sparseIndexField;
                return this;
            }

            /**
             * <p>The field that stores the elements in sparse vectors.</p>
             * 
             * <strong>example:</strong>
             * <p>sparse_values</p>
             */
            public Builder sparseValueField(String sparseValueField) {
                this.sparseValueField = sparseValueField;
                return this;
            }

            /**
             * <p>The vector field.</p>
             * 
             * <strong>example:</strong>
             * <p>source_image_vector</p>
             */
            public Builder vectorField(String vectorField) {
                this.vectorField = vectorField;
                return this;
            }

            /**
             * <p>The vector retrieval algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>Qc</p>
             */
            public Builder vectorIndexType(String vectorIndexType) {
                this.vectorIndexType = vectorIndexType;
                return this;
            }

            public VectorIndex build() {
                return new VectorIndex(this);
            } 

        } 

    }
}
