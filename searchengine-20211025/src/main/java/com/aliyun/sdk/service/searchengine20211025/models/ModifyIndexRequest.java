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
 * {@link ModifyIndexRequest} extends {@link RequestModel}
 *
 * <p>ModifyIndexRequest</p>
 */
public class ModifyIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("indexName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buildParallelNum")
    private Integer buildParallelNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster")
    private java.util.Map<String, java.util.Map<String, ?>> cluster;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusterConfigName")
    private String clusterConfigName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, ConfigValue> config;

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
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("partition")
    private Integer partition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pushMode")
    private String pushMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private ModifyIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexName = builder.indexName;
        this.buildParallelNum = builder.buildParallelNum;
        this.cluster = builder.cluster;
        this.clusterConfigName = builder.clusterConfigName;
        this.config = builder.config;
        this.content = builder.content;
        this.dataSource = builder.dataSource;
        this.dataSourceInfo = builder.dataSourceInfo;
        this.description = builder.description;
        this.domain = builder.domain;
        this.extend = builder.extend;
        this.mergeParallelNum = builder.mergeParallelNum;
        this.partition = builder.partition;
        this.pushMode = builder.pushMode;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIndexRequest create() {
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
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return buildParallelNum
     */
    public Integer getBuildParallelNum() {
        return this.buildParallelNum;
    }

    /**
     * @return cluster
     */
    public java.util.Map<String, java.util.Map<String, ?>> getCluster() {
        return this.cluster;
    }

    /**
     * @return clusterConfigName
     */
    public String getClusterConfigName() {
        return this.clusterConfigName;
    }

    /**
     * @return config
     */
    public java.util.Map<String, ConfigValue> getConfig() {
        return this.config;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return partition
     */
    public Integer getPartition() {
        return this.partition;
    }

    /**
     * @return pushMode
     */
    public String getPushMode() {
        return this.pushMode;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<ModifyIndexRequest, Builder> {
        private String instanceId; 
        private String indexName; 
        private Integer buildParallelNum; 
        private java.util.Map<String, java.util.Map<String, ?>> cluster; 
        private String clusterConfigName; 
        private java.util.Map<String, ConfigValue> config; 
        private String content; 
        private String dataSource; 
        private DataSourceInfo dataSourceInfo; 
        private String description; 
        private String domain; 
        private java.util.Map<String, ?> extend; 
        private Integer mergeParallelNum; 
        private Integer partition; 
        private String pushMode; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexName = request.indexName;
            this.buildParallelNum = request.buildParallelNum;
            this.cluster = request.cluster;
            this.clusterConfigName = request.clusterConfigName;
            this.config = request.config;
            this.content = request.content;
            this.dataSource = request.dataSource;
            this.dataSourceInfo = request.dataSourceInfo;
            this.description = request.description;
            this.domain = request.domain;
            this.extend = request.extend;
            this.mergeParallelNum = request.mergeParallelNum;
            this.partition = request.partition;
            this.pushMode = request.pushMode;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rq6610a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The index name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_api</p>
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
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
         * <p>The cluster information.</p>
         */
        public Builder cluster(java.util.Map<String, java.util.Map<String, ?>> cluster) {
            this.putBodyParameter("cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The name of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-35t3r02iq03@ha-cn-35t3r02iq03_test_api@hz_pre_vpc_domain_1@test_api@index_config_v1</p>
         */
        public Builder clusterConfigName(String clusterConfigName) {
            this.putBodyParameter("clusterConfigName", clusterConfigName);
            this.clusterConfigName = clusterConfigName;
            return this;
        }

        /**
         * <p>The information about the offline configuration.</p>
         */
        public Builder config(java.util.Map<String, ConfigValue> config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The file content.</p>
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
         * <p>ha-cn-35t3n1yuj0d_index_1</p>
         */
        public Builder dataSource(String dataSource) {
            this.putBodyParameter("dataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The information about the data source, which is required for the new version of OpenSearch Vector Search Edition.</p>
         */
        public Builder dataSourceInfo(DataSourceInfo dataSourceInfo) {
            this.putBodyParameter("dataSourceInfo", dataSourceInfo);
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the data center in which the data source is deployed.</p>
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
         * extend.
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
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder partition(Integer partition) {
            this.putBodyParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * <p>The push mode of the configuration. By default, only the configuration is pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>PUSH_ONLY</p>
         */
        public Builder pushMode(String pushMode) {
            this.putBodyParameter("pushMode", pushMode);
            this.pushMode = pushMode;
            return this;
        }

        /**
         * <p>Specifies whether to check the validity of input parameters. Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: checks only the validity of input parameters.</li>
         * <li><strong>false</strong>: checks the validity of input parameters and creates an attribution configuration.</li>
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
        public ModifyIndexRequest build() {
            return new ModifyIndexRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyIndexRequest} extends {@link TeaModel}
     *
     * <p>ModifyIndexRequest</p>
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

            private Builder() {
            } 

            private Builder(Config model) {
                this.accessKey = model.accessKey;
                this.accessSecret = model.accessSecret;
                this.bucket = model.bucket;
                this.catalog = model.catalog;
                this.database = model.database;
                this.endpoint = model.endpoint;
                this.format = model.format;
                this.namespace = model.namespace;
                this.ossPath = model.ossPath;
                this.partition = model.partition;
                this.path = model.path;
                this.project = model.project;
                this.table = model.table;
                this.tag = model.tag;
            } 

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
             * format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The namespace. This parameter is applicable to the SARO data source used in the intranet of Alibaba Group.</p>
             * 
             * <strong>example:</strong>
             * <p>test-namespace</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) path.</p>
             * 
             * <strong>example:</strong>
             * <p>/opensearch/oss.json</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * <p>The partition in the MaxCompute table. Example: ds=20180102.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20230114</p>
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The file path in the Apsara File Storage for HDFS file system.</p>
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
             * <p>The name of the MaxCompute table that is used as the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>item</p>
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
     * {@link ModifyIndexRequest} extends {@link TeaModel}
     *
     * <p>ModifyIndexRequest</p>
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

            private Builder() {
            } 

            private Builder(SaroConfig model) {
                this.namespace = model.namespace;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The namespace to which the SARO data source belongs.</p>
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
     * {@link ModifyIndexRequest} extends {@link TeaModel}
     *
     * <p>ModifyIndexRequest</p>
     */
    public static class DataSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoBuildIndex")
        private Boolean autoBuildIndex;

        @com.aliyun.core.annotation.NameInMap("buildMode")
        private String buildMode;

        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("dataTimeSec")
        private Integer dataTimeSec;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("generation")
        private Long generation;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ossDataPath")
        private String ossDataPath;

        @com.aliyun.core.annotation.NameInMap("partition")
        private String partition;

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
            this.buildMode = builder.buildMode;
            this.config = builder.config;
            this.dataTimeSec = builder.dataTimeSec;
            this.domain = builder.domain;
            this.generation = builder.generation;
            this.name = builder.name;
            this.ossDataPath = builder.ossDataPath;
            this.partition = builder.partition;
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
         * @return buildMode
         */
        public String getBuildMode() {
            return this.buildMode;
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
         * @return generation
         */
        public Long getGeneration() {
            return this.generation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossDataPath
         */
        public String getOssDataPath() {
            return this.ossDataPath;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
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
            private String buildMode; 
            private Config config; 
            private Integer dataTimeSec; 
            private String domain; 
            private Long generation; 
            private String name; 
            private String ossDataPath; 
            private String partition; 
            private Integer processParallelNum; 
            private Integer processPartitionCount; 
            private SaroConfig saroConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataSourceInfo model) {
                this.autoBuildIndex = model.autoBuildIndex;
                this.buildMode = model.buildMode;
                this.config = model.config;
                this.dataTimeSec = model.dataTimeSec;
                this.domain = model.domain;
                this.generation = model.generation;
                this.name = model.name;
                this.ossDataPath = model.ossDataPath;
                this.partition = model.partition;
                this.processParallelNum = model.processParallelNum;
                this.processPartitionCount = model.processPartitionCount;
                this.saroConfig = model.saroConfig;
                this.type = model.type;
            } 

            /**
             * <p>Specifies whether to enable the automatic full indexing feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * <p>The reindexing method. Valid values: api: API data source. indexRecover: data recovery by using indexing.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
             */
            public Builder buildMode(String buildMode) {
                this.buildMode = buildMode;
                return this;
            }

            /**
             * <p>The configurations of the MaxCompute data source.</p>
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
             * <p>The offline deployment name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_hz_domain_1</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the index version from which data is restored.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder generation(Long generation) {
                this.generation = generation;
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
             * ossDataPath.
             */
            public Builder ossDataPath(String ossDataPath) {
                this.ossDataPath = ossDataPath;
                return this;
            }

            /**
             * <p>The partition in the MaxCompute table. Example: ds=20180102.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20230114</p>
             */
            public Builder partition(String partition) {
                this.partition = partition;
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
             * <p>The type of the data source. Valid values: odps, swift, saro, oss, and unKnow.</p>
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
