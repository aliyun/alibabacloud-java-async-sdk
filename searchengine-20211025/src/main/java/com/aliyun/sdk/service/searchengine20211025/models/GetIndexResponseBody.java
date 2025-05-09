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
 * {@link GetIndexResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndexResponseBody</p>
 */
public class GetIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetIndexResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexResponseBody create() {
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

        private Builder(GetIndexResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4FB0325E-8C37-5525-96AC-0333523170A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The index information.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetIndexResponseBody build() {
            return new GetIndexResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIndexResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexResponseBody</p>
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
             * <p>ha3test-oss</p>
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
             * <p>TEST_dump_demo_sj_na61hunbu2_share_holo</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) path.</p>
             * 
             * <strong>example:</strong>
             * <p>/test_opensearch/sift_oss_test.data</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * <p>The partition in the MaxCompute table. Example: ds=20180102.</p>
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
             * <p><a href="http://test_opensearch/sift_oss_test.data">http://test_opensearch/sift_oss_test.data</a></p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project that is used as the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>tisplus_dev</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The name of the MaxCompute table that is used as the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>dump_odps_demo</p>
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
     * {@link GetIndexResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexResponseBody</p>
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
             * <p>TEST_dump_demo_sj_na61hunbu2_share_holo</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the SARO table.</p>
             * 
             * <strong>example:</strong>
             * <p>llm</p>
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
     * {@link GetIndexResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexResponseBody</p>
     */
    public static class DataSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoBuildIndex")
        private Boolean autoBuildIndex;

        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

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
            private String domain; 
            private String name; 
            private Integer processParallelNum; 
            private Integer processPartitionCount; 
            private SaroConfig saroConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataSourceInfo model) {
                this.autoBuildIndex = model.autoBuildIndex;
                this.config = model.config;
                this.domain = model.domain;
                this.name = model.name;
                this.processParallelNum = model.processParallelNum;
                this.processPartitionCount = model.processPartitionCount;
                this.saroConfig = model.saroConfig;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the automatic full indexing feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * <p>The configuration of MaxCompute data sources.</p>
             */
            public Builder config(Config config) {
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
             * <p>2</p>
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
    /**
     * 
     * {@link GetIndexResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fullPathName")
        private String fullPathName;

        @com.aliyun.core.annotation.NameInMap("isDir")
        private Boolean isDir;

        @com.aliyun.core.annotation.NameInMap("isTemplate")
        private Boolean isTemplate;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Files(Builder builder) {
            this.fullPathName = builder.fullPathName;
            this.isDir = builder.isDir;
            this.isTemplate = builder.isTemplate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fullPathName
         */
        public String getFullPathName() {
            return this.fullPathName;
        }

        /**
         * @return isDir
         */
        public Boolean getIsDir() {
            return this.isDir;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String fullPathName; 
            private Boolean isDir; 
            private Boolean isTemplate; 
            private String name; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.fullPathName = model.fullPathName;
                this.isDir = model.isDir;
                this.isTemplate = model.isTemplate;
                this.name = model.name;
            } 

            /**
             * <p>The full path of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder fullPathName(String fullPathName) {
                this.fullPathName = fullPathName;
                return this;
            }

            /**
             * <p>Indicates whether the file is a directory.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isDir(Boolean isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * <p>Indicates whether the file is a template.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>qrs.json</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIndexResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("versionId")
        private Integer versionId;

        private Versions(Builder builder) {
            this.desc = builder.desc;
            this.files = builder.files;
            this.name = builder.name;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionId
         */
        public Integer getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List<Files> files; 
            private String name; 
            private String status; 
            private Long updateTime; 
            private Integer versionId; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.desc = model.desc;
                this.files = model.files;
                this.name = model.name;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The description of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>close alarm, by 3.9.2 hotfix workflow</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The information about the files.</p>
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-7pp2ngv4s02_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the index version. Valid values:</p>
             * <ul>
             * <li>NEW: The index version is created.</li>
             * <li>PUBLISH: The index version is normal.</li>
             * <li>IN_USE: The index version is in use.</li>
             * <li>NOT_USE: The index version is not used.</li>
             * <li>STOP_USE: The index version is being stopped.</li>
             * <li>RESTORE_USE: The index version is being restored.</li>
             * <li>FAIL: The index version failed to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the index version was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionId(Integer versionId) {
                this.versionId = versionId;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIndexResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private java.util.Map<String, ResultClusterValue> cluster;

        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.Map<String, java.util.Map<String, ?>> config;

        @com.aliyun.core.annotation.NameInMap("configWhenBuild")
        private java.util.Map<String, java.util.Map<String, ?>> configWhenBuild;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dataSource")
        private String dataSource;

        @com.aliyun.core.annotation.NameInMap("dataSourceInfo")
        private DataSourceInfo dataSourceInfo;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("extend")
        private java.util.Map<String, java.util.List<String>> extend;

        @com.aliyun.core.annotation.NameInMap("fullUpdateTime")
        private String fullUpdateTime;

        @com.aliyun.core.annotation.NameInMap("fullVersion")
        private Long fullVersion;

        @com.aliyun.core.annotation.NameInMap("incUpdateTime")
        private String incUpdateTime;

        @com.aliyun.core.annotation.NameInMap("indexSize")
        private Long indexSize;

        @com.aliyun.core.annotation.NameInMap("indexStatus")
        private String indexStatus;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("partition")
        private Integer partition;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List<Versions> versions;

        private Result(Builder builder) {
            this.cluster = builder.cluster;
            this.config = builder.config;
            this.configWhenBuild = builder.configWhenBuild;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.dataSource = builder.dataSource;
            this.dataSourceInfo = builder.dataSourceInfo;
            this.description = builder.description;
            this.domain = builder.domain;
            this.extend = builder.extend;
            this.fullUpdateTime = builder.fullUpdateTime;
            this.fullVersion = builder.fullVersion;
            this.incUpdateTime = builder.incUpdateTime;
            this.indexSize = builder.indexSize;
            this.indexStatus = builder.indexStatus;
            this.name = builder.name;
            this.partition = builder.partition;
            this.updateTime = builder.updateTime;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public java.util.Map<String, ResultClusterValue> getCluster() {
            return this.cluster;
        }

        /**
         * @return config
         */
        public java.util.Map<String, java.util.Map<String, ?>> getConfig() {
            return this.config;
        }

        /**
         * @return configWhenBuild
         */
        public java.util.Map<String, java.util.Map<String, ?>> getConfigWhenBuild() {
            return this.configWhenBuild;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
        public java.util.Map<String, java.util.List<String>> getExtend() {
            return this.extend;
        }

        /**
         * @return fullUpdateTime
         */
        public String getFullUpdateTime() {
            return this.fullUpdateTime;
        }

        /**
         * @return fullVersion
         */
        public Long getFullVersion() {
            return this.fullVersion;
        }

        /**
         * @return incUpdateTime
         */
        public String getIncUpdateTime() {
            return this.incUpdateTime;
        }

        /**
         * @return indexSize
         */
        public Long getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return indexStatus
         */
        public String getIndexStatus() {
            return this.indexStatus;
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versions
         */
        public java.util.List<Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private java.util.Map<String, ResultClusterValue> cluster; 
            private java.util.Map<String, java.util.Map<String, ?>> config; 
            private java.util.Map<String, java.util.Map<String, ?>> configWhenBuild; 
            private String content; 
            private String createTime; 
            private String dataSource; 
            private DataSourceInfo dataSourceInfo; 
            private String description; 
            private String domain; 
            private java.util.Map<String, java.util.List<String>> extend; 
            private String fullUpdateTime; 
            private Long fullVersion; 
            private String incUpdateTime; 
            private Long indexSize; 
            private String indexStatus; 
            private String name; 
            private Integer partition; 
            private String updateTime; 
            private java.util.List<Versions> versions; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cluster = model.cluster;
                this.config = model.config;
                this.configWhenBuild = model.configWhenBuild;
                this.content = model.content;
                this.createTime = model.createTime;
                this.dataSource = model.dataSource;
                this.dataSourceInfo = model.dataSourceInfo;
                this.description = model.description;
                this.domain = model.domain;
                this.extend = model.extend;
                this.fullUpdateTime = model.fullUpdateTime;
                this.fullVersion = model.fullVersion;
                this.incUpdateTime = model.incUpdateTime;
                this.indexSize = model.indexSize;
                this.indexStatus = model.indexStatus;
                this.name = model.name;
                this.partition = model.partition;
                this.updateTime = model.updateTime;
                this.versions = model.versions;
            } 

            /**
             * <p>The cluster information.</p>
             */
            public Builder cluster(java.util.Map<String, ResultClusterValue> cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The configuration information.</p>
             */
            public Builder config(java.util.Map<String, java.util.Map<String, ?>> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The configuration that takes effect next time.</p>
             */
            public Builder configWhenBuild(java.util.Map<String, java.util.Map<String, ?>> configWhenBuild) {
                this.configWhenBuild = configWhenBuild;
                return this;
            }

            /**
             * <p>The file content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;summarys&quot;:{&quot;parameter&quot;:{&quot;file_compressor&quot;:&quot;zstd&quot;},&quot;summary_fields&quot;:[&quot;id&quot;]},&quot;file_compress&quot;:[{&quot;name&quot;:&quot;file_compressor&quot;,&quot;type&quot;:&quot;zstd&quot;},{&quot;name&quot;:&quot;no_compressor&quot;,&quot;type&quot;:&quot;&quot;}],&quot;indexs&quot;:[{&quot;index_fields&quot;:&quot;name&quot;,&quot;index_name&quot;:&quot;ids&quot;,&quot;index_type&quot;:&quot;STRING&quot;},{&quot;has_primary_key_attribute&quot;:true,&quot;index_fields&quot;:&quot;id&quot;,&quot;is_primary_key_sorted&quot;:false,&quot;index_name&quot;:&quot;id&quot;,&quot;index_type&quot;:&quot;PRIMARYKEY64&quot;}],&quot;attributes&quot;:[{&quot;file_compress&quot;:&quot;no_compressor&quot;,&quot;field_name&quot;:&quot;id&quot;}],&quot;fields&quot;:[{&quot;user_defined_param&quot;:{},&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;id&quot;},{&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;name&quot;}],&quot;table_name&quot;:&quot;api&quot;}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-tl32nd2nq01_00</p>
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The information about the data source.</p>
             */
            public Builder dataSourceInfo(DataSourceInfo dataSourceInfo) {
                this.dataSourceInfo = dataSourceInfo;
                return this;
            }

            /**
             * <p>The description of the index version.</p>
             * 
             * <strong>example:</strong>
             * <p>test index</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The deployment name of the index.</p>
             * 
             * <strong>example:</strong>
             * <p>sz_vpc_domain_1</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Extended information</p>
             */
            public Builder extend(java.util.Map<String, java.util.List<String>> extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The time when full data in the index was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-20 08:52:54</p>
             */
            public Builder fullUpdateTime(String fullUpdateTime) {
                this.fullUpdateTime = fullUpdateTime;
                return this;
            }

            /**
             * <p>The data version.</p>
             * 
             * <strong>example:</strong>
             * <p>1688523414</p>
             */
            public Builder fullVersion(Long fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * <p>The time when incremental data in the index was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-20 08:52:54</p>
             */
            public Builder incUpdateTime(String incUpdateTime) {
                this.incUpdateTime = incUpdateTime;
                return this;
            }

            /**
             * <p>The index size.</p>
             * 
             * <strong>example:</strong>
             * <p>4689</p>
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * <p>The status of the index version. Valid values:</p>
             * <ul>
             * <li>NEW: The index version is created.</li>
             * <li>PUBLISH: The index version is normal.</li>
             * <li>IN_USE: The index version is in use.</li>
             * <li>NOT_USE: The index version is not used.</li>
             * <li>STOP_USE: The index version is being stopped.</li>
             * <li>RESTORE_USE: The index version is being restored.</li>
             * <li>FAIL: The index version failed to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_USE</p>
             */
            public Builder indexStatus(String indexStatus) {
                this.indexStatus = indexStatus;
                return this;
            }

            /**
             * <p>The index name.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of shards.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The time when the index version was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The information about the versions.</p>
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
