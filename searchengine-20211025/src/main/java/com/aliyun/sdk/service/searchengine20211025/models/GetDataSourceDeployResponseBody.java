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
 * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSourceDeployResponseBody</p>
 */
public class GetDataSourceDeployResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetDataSourceDeployResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceDeployResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetDataSourceDeployResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDataSourceDeployResponseBody build() {
            return new GetDataSourceDeployResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Hdfs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private Hdfs(Builder builder) {
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hdfs create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String path; 

            private Builder() {
            } 

            private Builder(Hdfs model) {
                this.path = model.path;
            } 

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Hdfs build() {
                return new Hdfs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Odps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("partitions")
        private java.util.Map<String, String> partitions;

        private Odps(Builder builder) {
            this.partitions = builder.partitions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Odps create() {
            return builder().build();
        }

        /**
         * @return partitions
         */
        public java.util.Map<String, String> getPartitions() {
            return this.partitions;
        }

        public static final class Builder {
            private java.util.Map<String, String> partitions; 

            private Builder() {
            } 

            private Builder(Odps model) {
                this.partitions = model.partitions;
            } 

            /**
             * partitions.
             */
            public Builder partitions(java.util.Map<String, String> partitions) {
                this.partitions = partitions;
                return this;
            }

            public Odps build() {
                return new Odps(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Oss extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private Oss(Builder builder) {
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oss create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String path; 

            private Builder() {
            } 

            private Builder(Oss model) {
                this.path = model.path;
            } 

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Oss build() {
                return new Oss(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Saro extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Saro(Builder builder) {
            this.path = builder.path;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Saro create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String path; 
            private String version; 

            private Builder() {
            } 

            private Builder(Saro model) {
                this.path = model.path;
                this.version = model.version;
            } 

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Saro build() {
                return new Saro(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Extend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hdfs")
        private Hdfs hdfs;

        @com.aliyun.core.annotation.NameInMap("odps")
        private Odps odps;

        @com.aliyun.core.annotation.NameInMap("oss")
        private Oss oss;

        @com.aliyun.core.annotation.NameInMap("saro")
        private Saro saro;

        private Extend(Builder builder) {
            this.hdfs = builder.hdfs;
            this.odps = builder.odps;
            this.oss = builder.oss;
            this.saro = builder.saro;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extend create() {
            return builder().build();
        }

        /**
         * @return hdfs
         */
        public Hdfs getHdfs() {
            return this.hdfs;
        }

        /**
         * @return odps
         */
        public Odps getOdps() {
            return this.odps;
        }

        /**
         * @return oss
         */
        public Oss getOss() {
            return this.oss;
        }

        /**
         * @return saro
         */
        public Saro getSaro() {
            return this.saro;
        }

        public static final class Builder {
            private Hdfs hdfs; 
            private Odps odps; 
            private Oss oss; 
            private Saro saro; 

            private Builder() {
            } 

            private Builder(Extend model) {
                this.hdfs = model.hdfs;
                this.odps = model.odps;
                this.oss = model.oss;
                this.saro = model.saro;
            } 

            /**
             * hdfs.
             */
            public Builder hdfs(Hdfs hdfs) {
                this.hdfs = hdfs;
                return this;
            }

            /**
             * odps.
             */
            public Builder odps(Odps odps) {
                this.odps = odps;
                return this;
            }

            /**
             * oss.
             */
            public Builder oss(Oss oss) {
                this.oss = oss;
                return this;
            }

            /**
             * saro.
             */
            public Builder saro(Saro saro) {
                this.saro = saro;
                return this;
            }

            public Extend build() {
                return new Extend(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Processor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("resource")
        private String resource;

        private Processor(Builder builder) {
            this.args = builder.args;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processor create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private String args; 
            private String resource; 

            private Builder() {
            } 

            private Builder(Processor model) {
                this.args = model.args;
                this.resource = model.resource;
            } 

            /**
             * <p>The startup parameters of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The resource information.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public Processor build() {
                return new Processor(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Storage extends TeaModel {
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

        private Storage(Builder builder) {
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

        public static Storage create() {
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

            private Builder(Storage model) {
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
             * <p>ak</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The AccessKey secret of the MaxCompute data source.</p>
             * 
             * <strong>example:</strong>
             * <p>as</p>
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>antsys-miniapp-chongwen-static</p>
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
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) path.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://opensearch</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * <p>The partition in the MaxCompute table. Example: ds=20180102.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20220926</p>
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
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * table.
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

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Swift extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("zk")
        private String zk;

        private Swift(Builder builder) {
            this.topic = builder.topic;
            this.zk = builder.zk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Swift create() {
            return builder().build();
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return zk
         */
        public String getZk() {
            return this.zk;
        }

        public static final class Builder {
            private String topic; 
            private String zk; 

            private Builder() {
            } 

            private Builder(Swift model) {
                this.topic = model.topic;
                this.zk = model.zk;
            } 

            /**
             * <p>The topic.</p>
             * 
             * <strong>example:</strong>
             * <p>topic</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>zk</p>
             * 
             * <strong>example:</strong>
             * <p>zk</p>
             */
            public Builder zk(String zk) {
                this.zk = zk;
                return this;
            }

            public Swift build() {
                return new Swift(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceDeployResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoBuildIndex")
        private Boolean autoBuildIndex;

        @com.aliyun.core.annotation.NameInMap("extend")
        private Extend extend;

        @com.aliyun.core.annotation.NameInMap("processor")
        private Processor processor;

        @com.aliyun.core.annotation.NameInMap("storage")
        private Storage storage;

        @com.aliyun.core.annotation.NameInMap("swift")
        private Swift swift;

        private Result(Builder builder) {
            this.autoBuildIndex = builder.autoBuildIndex;
            this.extend = builder.extend;
            this.processor = builder.processor;
            this.storage = builder.storage;
            this.swift = builder.swift;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return autoBuildIndex
         */
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        /**
         * @return extend
         */
        public Extend getExtend() {
            return this.extend;
        }

        /**
         * @return processor
         */
        public Processor getProcessor() {
            return this.processor;
        }

        /**
         * @return storage
         */
        public Storage getStorage() {
            return this.storage;
        }

        /**
         * @return swift
         */
        public Swift getSwift() {
            return this.swift;
        }

        public static final class Builder {
            private Boolean autoBuildIndex; 
            private Extend extend; 
            private Processor processor; 
            private Storage storage; 
            private Swift swift; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.autoBuildIndex = model.autoBuildIndex;
                this.extend = model.extend;
                this.processor = model.processor;
                this.storage = model.storage;
                this.swift = model.swift;
            } 

            /**
             * autoBuildIndex.
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * extend.
             */
            public Builder extend(Extend extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The parameters of the process.</p>
             */
            public Builder processor(Processor processor) {
                this.processor = processor;
                return this;
            }

            /**
             * <p>The information about the data source.</p>
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The information about the incremental data source Swift.</p>
             */
            public Builder swift(Swift swift) {
                this.swift = swift;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
