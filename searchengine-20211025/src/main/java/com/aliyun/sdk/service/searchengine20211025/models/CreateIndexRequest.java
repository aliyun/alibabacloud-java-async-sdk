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
 * {@link CreateIndexRequest} extends {@link RequestModel}
 *
 * <p>CreateIndexRequest</p>
 */
public class CreateIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buildParallelNum")
    private Integer buildParallelNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSource")
    private String dataSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceInfo")
    private DataSourceInfo dataSourceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extend")
    private java.util.Map<String, ?> extend;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mergeParallelNum")
    private Integer mergeParallelNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("partition")
    private Integer partition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.buildParallelNum = builder.buildParallelNum;
        this.content = builder.content;
        this.dataSource = builder.dataSource;
        this.dataSourceInfo = builder.dataSourceInfo;
        this.domain = builder.domain;
        this.extend = builder.extend;
        this.mergeParallelNum = builder.mergeParallelNum;
        this.name = builder.name;
        this.partition = builder.partition;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIndexRequest create() {
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
     * @return buildParallelNum
     */
    public Integer getBuildParallelNum() {
        return this.buildParallelNum;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return dataSourceInfo
     */
    public DataSourceInfo getDataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return extend
     */
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    /**
     * @return mergeParallelNum
     */
    public Integer getMergeParallelNum() {
        return this.mergeParallelNum;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return partition
     */
    public Integer getPartition() {
        return this.partition;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateIndexRequest, Builder> {
        private String instanceId; 
        private Integer buildParallelNum; 
        private String content; 
        private String dataSource; 
        private DataSourceInfo dataSourceInfo; 
        private String domain; 
        private java.util.Map<String, ?> extend; 
        private Integer mergeParallelNum; 
        private String name; 
        private Integer partition; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.buildParallelNum = request.buildParallelNum;
            this.content = request.content;
            this.dataSource = request.dataSource;
            this.dataSourceInfo = request.dataSourceInfo;
            this.domain = request.domain;
            this.extend = request.extend;
            this.mergeParallelNum = request.mergeParallelNum;
            this.name = request.name;
            this.partition = request.partition;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ppr7901</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum number of full indexes that can be concurrently built.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder buildParallelNum(Integer buildParallelNum) {
            this.putBodyParameter("buildParallelNum", buildParallelNum);
            this.buildParallelNum = buildParallelNum;
            return this;
        }

        /**
         * <p>The index schema.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;summarys&quot;:{&quot;summary_fields&quot;:[&quot;id&quot;]},&quot;indexs&quot;:[{&quot;index_name&quot;:&quot;index_id&quot;,&quot;index_type&quot;:&quot;PRIMARYKEY64&quot;,&quot;index_fields&quot;:&quot;id&quot;,&quot;has_primary_key_attribute&quot;:true,&quot;is_primary_key_sorted&quot;:false}],&quot;attributes&quot;:[&quot;id&quot;],&quot;fields&quot;:[{&quot;field_name&quot;:&quot;id&quot;,&quot;field_type&quot;:&quot;UINT16&quot;}],&quot;table_name&quot;:&quot;index_2&quot;}</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder dataSource(String dataSource) {
            this.putBodyParameter("dataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The information about the data source. This parameter is required for an OpenSearch Vector Search Edition instance of the new version.</p>
         */
        public Builder dataSourceInfo(DataSourceInfo dataSourceInfo) {
            this.putBodyParameter("dataSourceInfo", dataSourceInfo);
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }

        /**
         * <p>The data center in which the data source is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        public Builder domain(String domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The extended content of the field configuration. key specifies the vector field and the field that requires embedding.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;vector&quot;:
         *         [
         *             &quot;source_image_vector&quot;
         *         ],
         *         &quot;embeding&quot;:
         *         [
         *             &quot;source_image&quot;
         *         ],
         *         &quot;description&quot;:
         *         []
         *     }</p>
         */
        public Builder extend(java.util.Map<String, ?> extend) {
            this.putBodyParameter("extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The maximum number of full indexes that can be concurrently merged.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder mergeParallelNum(Integer mergeParallelNum) {
            this.putBodyParameter("mergeParallelNum", mergeParallelNum);
            this.mergeParallelNum = mergeParallelNum;
            return this;
        }

        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-zvp2qr1sk01_qrs</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of data shards.</p>
         * 
         * <strong>example:</strong>
         * <p>20211202</p>
         */
        public Builder partition(Integer partition) {
            this.putBodyParameter("partition", partition);
            this.partition = partition;
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
        public CreateIndexRequest build() {
            return new CreateIndexRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIndexRequest} extends {@link TeaModel}
     *
     * <p>CreateIndexRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ossPath")
        private String ossPath;

        @com.aliyun.core.annotation.NameInMap("partition")
        private String partition;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

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
            this.format = builder.format;
            this.namespace = builder.namespace;
            this.ossPath = builder.ossPath;
            this.partition = builder.partition;
            this.path = builder.path;
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
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
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
         * @return path
         */
        public String getPath() {
            return this.path;
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
            private String format; 
            private String namespace; 
            private String ossPath; 
            private String partition; 
            private String path; 
            private String project; 
            private String table; 
            private String tag; 

            /**
             * <p>The AccessKey ID of the MaxCompute data source.</p>
             * 
             * <strong>example:</strong>
             * <p>L***p</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The AccessKey secret of the MaxCompute data source.</p>
             * 
             * <strong>example:</strong>
             * <p>5**9a6</p>
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket</p>
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
             * <p>The endpoint of the MaxCompute or Object Storage Service (OSS) data source.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oss-cn-hangzhou.aliyuncs.com">https://oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The namespace name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-namespace</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The path of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>/opensearch/oss.json</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * <p>The partition in the MaxCompute table. This parameter is required if type is set to odps.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20230114</p>
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The path of the Apsara File Storage for HDFS data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test-hdfs-path</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project that is used as the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>bbt_algo_pai</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>bbt_rec_swing_u2i2i_score_be_v1</p>
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
     * {@link CreateIndexRequest} extends {@link TeaModel}
     *
     * <p>CreateIndexRequest</p>
     */
    public static class SaroConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        private SaroConfig(Builder builder) {
            this.namespace = builder.namespace;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaroConfig create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String namespace; 
            private String tableName; 

            /**
             * <p>The namespace of the SARO data source.</p>
             * 
             * <strong>example:</strong>
             * <p>flink-test-fjx-default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the SARO table.</p>
             * 
             * <strong>example:</strong>
             * <p>device_event_shy_summary_</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public SaroConfig build() {
                return new SaroConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIndexRequest} extends {@link TeaModel}
     *
     * <p>CreateIndexRequest</p>
     */
    public static class DataSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoBuildIndex")
        private Boolean autoBuildIndex;

        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("dataTimeSec")
        private Integer dataTimeSec;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("processParallelNum")
        private Integer processParallelNum;

        @com.aliyun.core.annotation.NameInMap("processPartitionCount")
        private Integer processPartitionCount;

        @com.aliyun.core.annotation.NameInMap("saroConfig")
        private SaroConfig saroConfig;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DataSourceInfo(Builder builder) {
            this.autoBuildIndex = builder.autoBuildIndex;
            this.config = builder.config;
            this.dataTimeSec = builder.dataTimeSec;
            this.domain = builder.domain;
            this.name = builder.name;
            this.processParallelNum = builder.processParallelNum;
            this.processPartitionCount = builder.processPartitionCount;
            this.saroConfig = builder.saroConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceInfo create() {
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

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return processParallelNum
         */
        public Integer getProcessParallelNum() {
            return this.processParallelNum;
        }

        /**
         * @return processPartitionCount
         */
        public Integer getProcessPartitionCount() {
            return this.processPartitionCount;
        }

        /**
         * @return saroConfig
         */
        public SaroConfig getSaroConfig() {
            return this.saroConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean autoBuildIndex; 
            private Config config; 
            private Integer dataTimeSec; 
            private String domain; 
            private String name; 
            private Integer processParallelNum; 
            private Integer processPartitionCount; 
            private SaroConfig saroConfig; 
            private String type; 

            /**
             * <p>Specifies whether to enable automatic full indexing.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * <p>The information about the MaxCompute data source.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The start timestamp from which incremental data is retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p>1709715164</p>
             */
            public Builder dataTimeSec(Integer dataTimeSec) {
                this.dataTimeSec = dataTimeSec;
                return this;
            }

            /**
             * <p>The data center in which the data source is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_hz_domain_1</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-35t3n1yuj0d_index_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The maximum number of full indexes that can be concurrently processed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder processParallelNum(Integer processParallelNum) {
                this.processParallelNum = processParallelNum;
                return this;
            }

            /**
             * <p>The number of resources used for data update.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder processPartitionCount(Integer processPartitionCount) {
                this.processPartitionCount = processPartitionCount;
                return this;
            }

            /**
             * <p>The configurations of the SARO data source.</p>
             */
            public Builder saroConfig(SaroConfig saroConfig) {
                this.saroConfig = saroConfig;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>odps</li>
             * <li>swift</li>
             * <li>saro</li>
             * <li>oss</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSourceInfo build() {
                return new DataSourceInfo(this);
            } 

        } 

    }
}
