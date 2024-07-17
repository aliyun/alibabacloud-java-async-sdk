// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.Map < String, java.util.Map<String, ?>> cluster;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusterConfigName")
    private String clusterConfigName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map < String, ConfigValue > config;

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
    public java.util.Map < String, java.util.Map<String, ?>> getCluster() {
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
    public java.util.Map < String, ConfigValue > getConfig() {
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
        private java.util.Map < String, java.util.Map<String, ?>> cluster; 
        private String clusterConfigName; 
        private java.util.Map < String, ConfigValue > config; 
        private String content; 
        private String dataSource; 
        private DataSourceInfo dataSourceInfo; 
        private String description; 
        private String domain; 
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
            this.mergeParallelNum = request.mergeParallelNum;
            this.partition = request.partition;
            this.pushMode = request.pushMode;
            this.dryRun = request.dryRun;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The index name.
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * The maximum number of full indexes that can be concurrently built.
         */
        public Builder buildParallelNum(Integer buildParallelNum) {
            this.putBodyParameter("buildParallelNum", buildParallelNum);
            this.buildParallelNum = buildParallelNum;
            return this;
        }

        /**
         * The cluster information.
         */
        public Builder cluster(java.util.Map < String, java.util.Map<String, ?>> cluster) {
            this.putBodyParameter("cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * The name of the configuration file.
         */
        public Builder clusterConfigName(String clusterConfigName) {
            this.putBodyParameter("clusterConfigName", clusterConfigName);
            this.clusterConfigName = clusterConfigName;
            return this;
        }

        /**
         * The information about the offline configuration.
         */
        public Builder config(java.util.Map < String, ConfigValue > config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * The file content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder dataSource(String dataSource) {
            this.putBodyParameter("dataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * The information about the data source, which is required for the new version of OpenSearch Vector Search Edition.
         */
        public Builder dataSourceInfo(DataSourceInfo dataSourceInfo) {
            this.putBodyParameter("dataSourceInfo", dataSourceInfo);
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }

        /**
         * The description of the data source.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the data center in which the data source is deployed.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The maximum number of full indexes that can be concurrently merged.
         */
        public Builder mergeParallelNum(Integer mergeParallelNum) {
            this.putBodyParameter("mergeParallelNum", mergeParallelNum);
            this.mergeParallelNum = mergeParallelNum;
            return this;
        }

        /**
         * The number of shards.
         */
        public Builder partition(Integer partition) {
            this.putBodyParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * The push mode of the configuration. By default, only the configuration is pushed.
         */
        public Builder pushMode(String pushMode) {
            this.putBodyParameter("pushMode", pushMode);
            this.pushMode = pushMode;
            return this;
        }

        /**
         * Specifies whether to check the validity of input parameters. Default value: false.
         * <p>
         * 
         * Valid values:
         * 
         * *   **true**: checks only the validity of input parameters.
         * *   **false**: checks the validity of input parameters and creates an attribution configuration.
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

    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("accessSecret")
        private String accessSecret;

        @com.aliyun.core.annotation.NameInMap("bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

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

        private Config(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessSecret = builder.accessSecret;
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.namespace = builder.namespace;
            this.ossPath = builder.ossPath;
            this.partition = builder.partition;
            this.path = builder.path;
            this.project = builder.project;
            this.table = builder.table;
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
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
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

        public static final class Builder {
            private String accessKey; 
            private String accessSecret; 
            private String bucket; 
            private String endpoint; 
            private String namespace; 
            private String ossPath; 
            private String partition; 
            private String path; 
            private String project; 
            private String table; 

            /**
             * The AccessKey ID of the MaxCompute data source.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * The AccessKey secret of the MaxCompute data source.
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * The name of the OSS bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The endpoint of the MaxCompute data source.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The namespace. This parameter is applicable to the SARO data source used in the intranet of Alibaba Group.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The Object Storage Service (OSS) path.
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * The partition in the MaxCompute table. Example: ds=20180102.
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The file path in the Apsara File Storage for HDFS file system.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The name of the MaxCompute project that is used as the data source.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The name of the MaxCompute table that is used as the data source.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
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
             * The namespace to which the SARO data source belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The name of the SARO table.
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
            private Integer processParallelNum; 
            private Integer processPartitionCount; 
            private SaroConfig saroConfig; 
            private String type; 

            /**
             * Specifies whether to enable the automatic full indexing feature.
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * The reindexing method. Valid values: api: API data source. indexRecover: data recovery by using indexing.
             */
            public Builder buildMode(String buildMode) {
                this.buildMode = buildMode;
                return this;
            }

            /**
             * The configurations of the MaxCompute data source.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * The start timestamp from which incremental data is retrieved.
             */
            public Builder dataTimeSec(Integer dataTimeSec) {
                this.dataTimeSec = dataTimeSec;
                return this;
            }

            /**
             * The offline deployment name of the data source.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The ID of the index version from which data is restored.
             */
            public Builder generation(Long generation) {
                this.generation = generation;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The maximum number of full indexes that can be concurrently processed.
             */
            public Builder processParallelNum(Integer processParallelNum) {
                this.processParallelNum = processParallelNum;
                return this;
            }

            /**
             * The number of resources used for data update.
             */
            public Builder processPartitionCount(Integer processPartitionCount) {
                this.processPartitionCount = processPartitionCount;
                return this;
            }

            /**
             * The configurations of the SARO data source.
             */
            public Builder saroConfig(SaroConfig saroConfig) {
                this.saroConfig = saroConfig;
                return this;
            }

            /**
             * The type of the data source. Valid values: odps, swift, saro, oss, and unKnow.
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
