// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information, including the error codes and the number of entries that are returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCloudbenchTaskConfigResponseBody build() {
            return new DescribeCloudbenchTaskConfigResponseBody(this);
        } 

    } 

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

            /**
             * The path in which the files are archived.
             */
            public Builder archiveFolder(String archiveFolder) {
                this.archiveFolder = archiveFolder;
                return this;
            }

            /**
             * The command that was run to start the stress testing task.
             */
            public Builder benchCmd(String benchCmd) {
                this.benchCmd = benchCmd;
                return this;
            }

            /**
             * The path to the JAR file that is used for stress testing.
             */
            public Builder clientJarPath(String clientJarPath) {
                this.clientJarPath = clientJarPath;
                return this;
            }

            /**
             * The path to the JAR file that is stored in OSS. The JAR file is used for stress testing.
             */
            public Builder jarOnOss(String jarOnOss) {
                this.jarOnOss = jarOnOss;
                return this;
            }

            /**
             * The command that was run to preload the file that stores the analysis result of full SQL statistics.
             */
            public Builder loadCmd(String loadCmd) {
                this.loadCmd = loadCmd;
                return this;
            }

            /**
             * The name of the metadata file.
             */
            public Builder metaFileName(String metaFileName) {
                this.metaFileName = metaFileName;
                return this;
            }

            /**
             * The name of the metadata file stored in Object Storage Service (OSS).
             */
            public Builder metaFileOnOss(String metaFileOnOss) {
                this.metaFileOnOss = metaFileOnOss;
                return this;
            }

            /**
             * The path to the metadata file.
             */
            public Builder metaFilePath(String metaFilePath) {
                this.metaFilePath = metaFilePath;
                return this;
            }

            /**
             * The command that was run to parse the file that stores the analysis result of full SQL statistics.
             */
            public Builder parseCmd(String parseCmd) {
                this.parseCmd = parseCmd;
                return this;
            }

            /**
             * The path to the file that is parsed. The file stores the analysis result of full SQL statistics.
             */
            public Builder parseFilePath(String parseFilePath) {
                this.parseFilePath = parseFilePath;
                return this;
            }

            /**
             * The location where the RocksDB storage system is deployed in the stress testing client.
             */
            public Builder rocksDbPath(String rocksDbPath) {
                this.rocksDbPath = rocksDbPath;
                return this;
            }

            /**
             * The name of the file that stores the analysis result of full SQL statistics.
             */
            public Builder sqlFileName(String sqlFileName) {
                this.sqlFileName = sqlFileName;
                return this;
            }

            /**
             * The name of the file that stores the analysis result of full SQL statistics and that is stored in OSS.
             */
            public Builder sqlFileOnOss(String sqlFileOnOss) {
                this.sqlFileOnOss = sqlFileOnOss;
                return this;
            }

            /**
             * The path to the file that stores the analysis result of full SQL statistics.
             */
            public Builder sqlFilePath(String sqlFilePath) {
                this.sqlFilePath = sqlFilePath;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The Alibaba Cloud account ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The path of the temporary directory that is generated for stress testing.
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
