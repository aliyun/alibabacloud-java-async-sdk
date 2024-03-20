// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIndexRequest} extends {@link RequestModel}
 *
 * <p>CreateIndexRequest</p>
 */
public class CreateIndexRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("content")
    private String content;

    @Body
    @NameInMap("dataSource")
    private String dataSource;

    @Body
    @NameInMap("dataSourceInfo")
    private DataSourceInfo dataSourceInfo;

    @Body
    @NameInMap("domain")
    private String domain;

    @Body
    @NameInMap("extend")
    private java.util.Map < String, ? > extend;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("partition")
    private Integer partition;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private CreateIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.content = builder.content;
        this.dataSource = builder.dataSource;
        this.dataSourceInfo = builder.dataSourceInfo;
        this.domain = builder.domain;
        this.extend = builder.extend;
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
    public java.util.Map < String, ? > getExtend() {
        return this.extend;
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
        private String content; 
        private String dataSource; 
        private DataSourceInfo dataSourceInfo; 
        private String domain; 
        private java.util.Map < String, ? > extend; 
        private String name; 
        private Integer partition; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.content = request.content;
            this.dataSource = request.dataSource;
            this.dataSourceInfo = request.dataSourceInfo;
            this.domain = request.domain;
            this.extend = request.extend;
            this.name = request.name;
            this.partition = request.partition;
            this.dryRun = request.dryRun;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The content of the index.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * The data source type. Valid values: odps, mns, flink, and streaming. This parameter can be ignored.
         */
        public Builder dataSource(String dataSource) {
            this.putBodyParameter("dataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * 数据源相关信息 （向量检索版新版本必填）
         */
        public Builder dataSourceInfo(DataSourceInfo dataSourceInfo) {
            this.putBodyParameter("dataSourceInfo", dataSourceInfo);
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }

        /**
         * The data center where the data source is deployed.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * 字段配置的扩展的内容
         * <p>
         * key: 向量字段(vector)、
         * 需embeding字段(embeding)
         */
        public Builder extend(java.util.Map < String, ? > extend) {
            this.putBodyParameter("extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * The name of the index.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The data partition.
         */
        public Builder partition(Integer partition) {
            this.putBodyParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * 是否dryRun创建（仅校验数据源是否合法）。取值：-true 是 -false 否
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

    public static class Config extends TeaModel {
        @NameInMap("accessKey")
        private String accessKey;

        @NameInMap("accessSecret")
        private String accessSecret;

        @NameInMap("bucket")
        private String bucket;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("ossPath")
        private String ossPath;

        @NameInMap("partition")
        private String partition;

        @NameInMap("path")
        private String path;

        @NameInMap("project")
        private String project;

        @NameInMap("table")
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
             * odps数据源ak
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * odps数据源ak secret
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * odps数据源的endpoint, oss数据源的endpoint
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ossPath.
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * 数据源为odps时必填
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * odps数据源项目名称
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * 表名称
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
        @NameInMap("namespace")
        private String namespace;

        @NameInMap("tableName")
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
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * tableName.
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
        @NameInMap("autoBuildIndex")
        private Boolean autoBuildIndex;

        @NameInMap("config")
        private Config config;

        @NameInMap("dataTimeSec")
        private Integer dataTimeSec;

        @NameInMap("domain")
        private String domain;

        @NameInMap("name")
        private String name;

        @NameInMap("processPartitionCount")
        private Integer processPartitionCount;

        @NameInMap("saroConfig")
        private SaroConfig saroConfig;

        @NameInMap("type")
        private String type;

        private DataSourceInfo(Builder builder) {
            this.autoBuildIndex = builder.autoBuildIndex;
            this.config = builder.config;
            this.dataTimeSec = builder.dataTimeSec;
            this.domain = builder.domain;
            this.name = builder.name;
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
            private Integer processPartitionCount; 
            private SaroConfig saroConfig; 
            private String type; 

            /**
             * 是否开启自动全量
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * odps相关
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * dataTimeSec.
             */
            public Builder dataTimeSec(Integer dataTimeSec) {
                this.dataTimeSec = dataTimeSec;
                return this;
            }

            /**
             * The data center where the data source is deployed.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The name of the index.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 数据更新资源数
             */
            public Builder processPartitionCount(Integer processPartitionCount) {
                this.processPartitionCount = processPartitionCount;
                return this;
            }

            /**
             * saroConfig.
             */
            public Builder saroConfig(SaroConfig saroConfig) {
                this.saroConfig = saroConfig;
                return this;
            }

            /**
             * 数据源类型
             * <p>
             * odps
             * swift
             * saro
             * oss
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
