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
 * {@link CreateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceRequest</p>
 */
public class CreateDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoBuildIndex")
    private Boolean autoBuildIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("saroConfig")
    private SaroConfig saroConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateDataSourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.autoBuildIndex = builder.autoBuildIndex;
        this.config = builder.config;
        this.domain = builder.domain;
        this.name = builder.name;
        this.saroConfig = builder.saroConfig;
        this.type = builder.type;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceRequest create() {
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

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {
        private String instanceId; 
        private Boolean autoBuildIndex; 
        private Config config; 
        private String domain; 
        private String name; 
        private SaroConfig saroConfig; 
        private String type; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.autoBuildIndex = request.autoBuildIndex;
            this.config = request.config;
            this.domain = request.domain;
            this.name = request.name;
            this.saroConfig = request.saroConfig;
            this.type = request.type;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7e22rgfyb01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically rebuild the index.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoBuildIndex(Boolean autoBuildIndex) {
            this.putBodyParameter("autoBuildIndex", autoBuildIndex);
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }

        /**
         * <p>The configuration information.</p>
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
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
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_test_api</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The configurations of the SARO data source.</p>
         */
        public Builder saroConfig(SaroConfig saroConfig) {
            this.putBodyParameter("saroConfig", saroConfig);
            this.saroConfig = saroConfig;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values: odps, oss, and swift.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. This parameter is only used to check whether the data source is valid. Valid values: true and false.</p>
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
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
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
             * <p>opensearch</p>
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
             * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis-ops</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The path of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>/opensearch/search</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * <p>The partition in the MaxCompute table.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20220713</p>
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
             * <p>kubenest</p>
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
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
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
             * <p>The namespace of the SARO data source.</p>
             * 
             * <strong>example:</strong>
             * <p>igraph-cn-x0r3e3abe02</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the SARO table.</p>
             * 
             * <strong>example:</strong>
             * <p>index_hdfs</p>
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
}
