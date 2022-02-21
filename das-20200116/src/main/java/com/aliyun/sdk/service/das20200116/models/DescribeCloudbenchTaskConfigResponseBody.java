// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudbenchTaskConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudbenchTaskConfigResponseBody</p>
 */
public class DescribeCloudbenchTaskConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("ArchiveFolder")
        private String archiveFolder;

        @NameInMap("BenchCmd")
        private String benchCmd;

        @NameInMap("ClientJarPath")
        private String clientJarPath;

        @NameInMap("JarOnOss")
        private String jarOnOss;

        @NameInMap("LoadCmd")
        private String loadCmd;

        @NameInMap("MetaFileName")
        private String metaFileName;

        @NameInMap("MetaFileOnOss")
        private String metaFileOnOss;

        @NameInMap("MetaFilePath")
        private String metaFilePath;

        @NameInMap("ParseCmd")
        private String parseCmd;

        @NameInMap("ParseFilePath")
        private String parseFilePath;

        @NameInMap("RocksDbPath")
        private String rocksDbPath;

        @NameInMap("SqlFileName")
        private String sqlFileName;

        @NameInMap("SqlFileOnOss")
        private String sqlFileOnOss;

        @NameInMap("SqlFilePath")
        private String sqlFilePath;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("WorkDir")
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
             * ArchiveFolder.
             */
            public Builder archiveFolder(String archiveFolder) {
                this.archiveFolder = archiveFolder;
                return this;
            }

            /**
             * BenchCmd.
             */
            public Builder benchCmd(String benchCmd) {
                this.benchCmd = benchCmd;
                return this;
            }

            /**
             * ClientJarPath.
             */
            public Builder clientJarPath(String clientJarPath) {
                this.clientJarPath = clientJarPath;
                return this;
            }

            /**
             * JarOnOss.
             */
            public Builder jarOnOss(String jarOnOss) {
                this.jarOnOss = jarOnOss;
                return this;
            }

            /**
             * LoadCmd.
             */
            public Builder loadCmd(String loadCmd) {
                this.loadCmd = loadCmd;
                return this;
            }

            /**
             * MetaFileName.
             */
            public Builder metaFileName(String metaFileName) {
                this.metaFileName = metaFileName;
                return this;
            }

            /**
             * MetaFileOnOss.
             */
            public Builder metaFileOnOss(String metaFileOnOss) {
                this.metaFileOnOss = metaFileOnOss;
                return this;
            }

            /**
             * MetaFilePath.
             */
            public Builder metaFilePath(String metaFilePath) {
                this.metaFilePath = metaFilePath;
                return this;
            }

            /**
             * ParseCmd.
             */
            public Builder parseCmd(String parseCmd) {
                this.parseCmd = parseCmd;
                return this;
            }

            /**
             * ParseFilePath.
             */
            public Builder parseFilePath(String parseFilePath) {
                this.parseFilePath = parseFilePath;
                return this;
            }

            /**
             * RocksDbPath.
             */
            public Builder rocksDbPath(String rocksDbPath) {
                this.rocksDbPath = rocksDbPath;
                return this;
            }

            /**
             * SqlFileName.
             */
            public Builder sqlFileName(String sqlFileName) {
                this.sqlFileName = sqlFileName;
                return this;
            }

            /**
             * SqlFileOnOss.
             */
            public Builder sqlFileOnOss(String sqlFileOnOss) {
                this.sqlFileOnOss = sqlFileOnOss;
                return this;
            }

            /**
             * SqlFilePath.
             */
            public Builder sqlFilePath(String sqlFilePath) {
                this.sqlFilePath = sqlFilePath;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WorkDir.
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
