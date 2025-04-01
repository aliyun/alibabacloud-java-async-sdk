// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeCloudbenchTaskConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudbenchTaskConfigResponseBody</p>
 */
public class DescribeCloudbenchTaskConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeCloudbenchTaskConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudbenchTaskConfigResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeCloudbenchTaskConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCloudbenchTaskConfigResponseBody build() {
            return new DescribeCloudbenchTaskConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudbenchTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudbenchTaskConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveFolder")
        private String archiveFolder;

        @com.aliyun.core.annotation.NameInMap("BenchCmd")
        private String benchCmd;

        @com.aliyun.core.annotation.NameInMap("ClientJarPath")
        private String clientJarPath;

        @com.aliyun.core.annotation.NameInMap("JarOnOss")
        private String jarOnOss;

        @com.aliyun.core.annotation.NameInMap("LoadCmd")
        private String loadCmd;

        @com.aliyun.core.annotation.NameInMap("MetaFileName")
        private String metaFileName;

        @com.aliyun.core.annotation.NameInMap("MetaFileOnOss")
        private String metaFileOnOss;

        @com.aliyun.core.annotation.NameInMap("MetaFilePath")
        private String metaFilePath;

        @com.aliyun.core.annotation.NameInMap("ParseCmd")
        private String parseCmd;

        @com.aliyun.core.annotation.NameInMap("ParseFilePath")
        private String parseFilePath;

        @com.aliyun.core.annotation.NameInMap("RocksDbPath")
        private String rocksDbPath;

        @com.aliyun.core.annotation.NameInMap("SqlFileName")
        private String sqlFileName;

        @com.aliyun.core.annotation.NameInMap("SqlFileOnOss")
        private String sqlFileOnOss;

        @com.aliyun.core.annotation.NameInMap("SqlFilePath")
        private String sqlFilePath;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WorkDir")
        private String workDir;

        private Data(Builder builder) {
            this.archiveFolder = builder.archiveFolder;
            this.benchCmd = builder.benchCmd;
            this.clientJarPath = builder.clientJarPath;
            this.jarOnOss = builder.jarOnOss;
            this.loadCmd = builder.loadCmd;
            this.metaFileName = builder.metaFileName;
            this.metaFileOnOss = builder.metaFileOnOss;
            this.metaFilePath = builder.metaFilePath;
            this.parseCmd = builder.parseCmd;
            this.parseFilePath = builder.parseFilePath;
            this.rocksDbPath = builder.rocksDbPath;
            this.sqlFileName = builder.sqlFileName;
            this.sqlFileOnOss = builder.sqlFileOnOss;
            this.sqlFilePath = builder.sqlFilePath;
            this.taskId = builder.taskId;
            this.userId = builder.userId;
            this.workDir = builder.workDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return archiveFolder
         */
        public String getArchiveFolder() {
            return this.archiveFolder;
        }

        /**
         * @return benchCmd
         */
        public String getBenchCmd() {
            return this.benchCmd;
        }

        /**
         * @return clientJarPath
         */
        public String getClientJarPath() {
            return this.clientJarPath;
        }

        /**
         * @return jarOnOss
         */
        public String getJarOnOss() {
            return this.jarOnOss;
        }

        /**
         * @return loadCmd
         */
        public String getLoadCmd() {
            return this.loadCmd;
        }

        /**
         * @return metaFileName
         */
        public String getMetaFileName() {
            return this.metaFileName;
        }

        /**
         * @return metaFileOnOss
         */
        public String getMetaFileOnOss() {
            return this.metaFileOnOss;
        }

        /**
         * @return metaFilePath
         */
        public String getMetaFilePath() {
            return this.metaFilePath;
        }

        /**
         * @return parseCmd
         */
        public String getParseCmd() {
            return this.parseCmd;
        }

        /**
         * @return parseFilePath
         */
        public String getParseFilePath() {
            return this.parseFilePath;
        }

        /**
         * @return rocksDbPath
         */
        public String getRocksDbPath() {
            return this.rocksDbPath;
        }

        /**
         * @return sqlFileName
         */
        public String getSqlFileName() {
            return this.sqlFileName;
        }

        /**
         * @return sqlFileOnOss
         */
        public String getSqlFileOnOss() {
            return this.sqlFileOnOss;
        }

        /**
         * @return sqlFilePath
         */
        public String getSqlFilePath() {
            return this.sqlFilePath;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workDir
         */
        public String getWorkDir() {
            return this.workDir;
        }

        public static final class Builder {
            private String archiveFolder; 
            private String benchCmd; 
            private String clientJarPath; 
            private String jarOnOss; 
            private String loadCmd; 
            private String metaFileName; 
            private String metaFileOnOss; 
            private String metaFilePath; 
            private String parseCmd; 
            private String parseFilePath; 
            private String rocksDbPath; 
            private String sqlFileName; 
            private String sqlFileOnOss; 
            private String sqlFilePath; 
            private String taskId; 
            private String userId; 
            private String workDir; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.archiveFolder = model.archiveFolder;
                this.benchCmd = model.benchCmd;
                this.clientJarPath = model.clientJarPath;
                this.jarOnOss = model.jarOnOss;
                this.loadCmd = model.loadCmd;
                this.metaFileName = model.metaFileName;
                this.metaFileOnOss = model.metaFileOnOss;
                this.metaFilePath = model.metaFilePath;
                this.parseCmd = model.parseCmd;
                this.parseFilePath = model.parseFilePath;
                this.rocksDbPath = model.rocksDbPath;
                this.sqlFileName = model.sqlFileName;
                this.sqlFileOnOss = model.sqlFileOnOss;
                this.sqlFilePath = model.sqlFilePath;
                this.taskId = model.taskId;
                this.userId = model.userId;
                this.workDir = model.workDir;
            } 

            /**
             * <p>The path in which the files are archived.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/das/cloudbench/archive-sqls/</p>
             */
            public Builder archiveFolder(String archiveFolder) {
                this.archiveFolder = archiveFolder;
                return this;
            }

            /**
             * <p>The command that was run to start the stress testing task.</p>
             * 
             * <strong>example:</strong>
             * <p>java -jar /tmp/das/cloudbench/CloudBenchClient.jar --bench --rocksdb /tmp/das/cloudbench/rocksdb --meta /tmp/das/cloudbench/cl-1621353601000-360****.meta --task_name 2777bba9-a836-49e6-9f70-1c3822fc9239 --result_file /tmp/das/cloudbench/null.result --user cloudb**** --pwd &quot;cloudbench@<strong><strong>&quot; --host rm-bp1j5f8s5x26kq79216</strong></strong>.mysql.rds.aliyuncs.com --port 3306 --charset utf8mb4 --interval 1 --bench_time 3600 --rate_factor 1.0 --start_time 1621353601 --rt &gt; /tmp/das/cloudbench/null.log</p>
             */
            public Builder benchCmd(String benchCmd) {
                this.benchCmd = benchCmd;
                return this;
            }

            /**
             * <p>The path to the JAR file that is used for stress testing.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/das/cloudbench/CloudBenchClient.jar</p>
             */
            public Builder clientJarPath(String clientJarPath) {
                this.clientJarPath = clientJarPath;
                return this;
            }

            /**
             * <p>The path to the JAR file that is stored in OSS. The JAR file is used for stress testing.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cloudbench-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/CloudBenchClient.jar?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&Expires=1622441372&Signature=28p%2BCe4tNHpr9VPOcHc3Si9iOb">https://cloudbench-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/CloudBenchClient.jar?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&amp;Expires=1622441372&amp;Signature=28p%2BCe4tNHpr9VPOcHc3Si9iOb</a>****</p>
             */
            public Builder jarOnOss(String jarOnOss) {
                this.jarOnOss = jarOnOss;
                return this;
            }

            /**
             * <p>The command that was run to preload the file that stores the analysis result of full SQL statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>java -jar /tmp/das/cloudbench/CloudBenchClient.jar --load --out /tmp/das/cloudbench/cl-1621353601000-360****.sc --meta /tmp/das/cloudbench/cl-1621353601000-360****.meta --task_name 2777bba9-<strong><strong>-49e6-9f70-1c3822fc</strong></strong> --rocksdb /tmp/das/cloudbench/rocksdb</p>
             */
            public Builder loadCmd(String loadCmd) {
                this.loadCmd = loadCmd;
                return this;
            }

            /**
             * <p>The name of the metadata file.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-1621353601000-360****.meta</p>
             */
            public Builder metaFileName(String metaFileName) {
                this.metaFileName = metaFileName;
                return this;
            }

            /**
             * <p>The name of the metadata file stored in Object Storage Service (OSS).</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;<a href="https://cb-rm-bp1w9g06h560l****.oss-cn-hangzhou.aliyuncs.com/cl-1621353601000-360****.meta?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&Expires=1622441372&Signature=Qsehg3tzeA57M%2BIixAbWPWAtvl">https://cb-rm-bp1w9g06h560l****.oss-cn-hangzhou.aliyuncs.com/cl-1621353601000-360****.meta?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&amp;Expires=1622441372&amp;Signature=Qsehg3tzeA57M%2BIixAbWPWAtvl</a>****</p>
             */
            public Builder metaFileOnOss(String metaFileOnOss) {
                this.metaFileOnOss = metaFileOnOss;
                return this;
            }

            /**
             * <p>The path to the metadata file.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/das/cloudbench/cl-1621353601000-360****.meta</p>
             */
            public Builder metaFilePath(String metaFilePath) {
                this.metaFilePath = metaFilePath;
                return this;
            }

            /**
             * <p>The command that was run to parse the file that stores the analysis result of full SQL statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>cd /tmp/das/cloudbench &amp;&amp; java -jar CloudBenchClient.jar --parse --threads 32 --file /tmp/das/cloudbench/2777bba9-a836-49e6-9f70-1c3822fc9239.archiveSql --meta /tmp/das/cloudbench/cl-1621353601000-360****.meta --out /tmp/das/cloudbench/cl-1621353601000-360****.sc --parent_patmp/das/cloudbench --source RDS --h /thost rm-bp1j5f8s5x266****.mysql.rds.aliyuncs.com --port 3306 --user cloudb**** --pwd &quot;cloudbench@****&quot; --cutSqlLen 8192 --db_black_list=information_schema,test,unknow,null</p>
             */
            public Builder parseCmd(String parseCmd) {
                this.parseCmd = parseCmd;
                return this;
            }

            /**
             * <p>The path to the file that is parsed. The file stores the analysis result of full SQL statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/das/cloudbench/2777bba9-a836-49e6-9f70-1c3822fc****.archiveSql</p>
             */
            public Builder parseFilePath(String parseFilePath) {
                this.parseFilePath = parseFilePath;
                return this;
            }

            /**
             * <p>The location where the RocksDB storage system is deployed in the stress testing client.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/das/cloudbench/rocksdb</p>
             */
            public Builder rocksDbPath(String rocksDbPath) {
                this.rocksDbPath = rocksDbPath;
                return this;
            }

            /**
             * <p>The name of the file that stores the analysis result of full SQL statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-1621353601000-360****.sc</p>
             */
            public Builder sqlFileName(String sqlFileName) {
                this.sqlFileName = sqlFileName;
                return this;
            }

            /**
             * <p>The name of the file that stores the analysis result of full SQL statistics and that is stored in OSS.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cb-rm-bp1w9g06h560l****.oss-cn-hangzhou.aliyuncs.com/cl-1621353601000-360****.sc?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&Expires=1622441372&Signature=LYMADwo%2BRrJeqR3e4d8OlIkVmw">https://cb-rm-bp1w9g06h560l****.oss-cn-hangzhou.aliyuncs.com/cl-1621353601000-360****.sc?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&amp;Expires=1622441372&amp;Signature=LYMADwo%2BRrJeqR3e4d8OlIkVmw</a>****</p>
             */
            public Builder sqlFileOnOss(String sqlFileOnOss) {
                this.sqlFileOnOss = sqlFileOnOss;
                return this;
            }

            /**
             * <p>The path to the file that stores the analysis result of full SQL statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/das/cloudbench/cl-1621353601000-360****.sc</p>
             */
            public Builder sqlFilePath(String sqlFilePath) {
                this.sqlFilePath = sqlFilePath;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e5cec704-0518-430f-8263-76f4dcds****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1091411816252****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The path of the temporary directory that is generated for stress testing.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/bench/</p>
             */
            public Builder workDir(String workDir) {
                this.workDir = workDir;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
