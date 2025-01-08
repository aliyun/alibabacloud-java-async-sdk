// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListDownloadJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDownloadJobsResponseBody</p>
 */
public class ListDownloadJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListDownloadJobsResponseBody(Builder builder) {
        this.count = builder.count;
        this.results = builder.results;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDownloadJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<Results> results; 
        private Integer total; 

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The log download tasks.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDownloadJobsResponseBody build() {
            return new ListDownloadJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDownloadJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownloadJobsResponseBody</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("compressionType")
        private String compressionType;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("roleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Sink(Builder builder) {
            this.bucket = builder.bucket;
            this.compressionType = builder.compressionType;
            this.contentType = builder.contentType;
            this.prefix = builder.prefix;
            this.roleArn = builder.roleArn;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sink create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return compressionType
         */
        public String getCompressionType() {
            return this.compressionType;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bucket; 
            private String compressionType; 
            private String contentType; 
            private String prefix; 
            private String roleArn; 
            private String type; 

            /**
             * <p>对象存储桶</p>
             * 
             * <strong>example:</strong>
             * <p>ali-test-oss-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>压缩格式</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder compressionType(String compressionType) {
                this.compressionType = compressionType;
                return this;
            }

            /**
             * <p>下载文件格式</p>
             * 
             * <strong>example:</strong>
             * <p>csv</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * <p>下载使用roleArn</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456:role/aliyunlogimportossrole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Sink build() {
                return new Sink(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownloadJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownloadJobsResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowInComplete")
        private String allowInComplete;

        @com.aliyun.core.annotation.NameInMap("fromTime")
        private Long fromTime;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("powerSql")
        private Boolean powerSql;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("sink")
        private Sink sink;

        @com.aliyun.core.annotation.NameInMap("toTime")
        private Long toTime;

        private Configuration(Builder builder) {
            this.allowInComplete = builder.allowInComplete;
            this.fromTime = builder.fromTime;
            this.logstore = builder.logstore;
            this.powerSql = builder.powerSql;
            this.query = builder.query;
            this.sink = builder.sink;
            this.toTime = builder.toTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return allowInComplete
         */
        public String getAllowInComplete() {
            return this.allowInComplete;
        }

        /**
         * @return fromTime
         */
        public Long getFromTime() {
            return this.fromTime;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return powerSql
         */
        public Boolean getPowerSql() {
            return this.powerSql;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return sink
         */
        public Sink getSink() {
            return this.sink;
        }

        /**
         * @return toTime
         */
        public Long getToTime() {
            return this.toTime;
        }

        public static final class Builder {
            private String allowInComplete; 
            private Long fromTime; 
            private String logstore; 
            private Boolean powerSql; 
            private String query; 
            private Sink sink; 
            private Long toTime; 

            /**
             * allowInComplete.
             */
            public Builder allowInComplete(String allowInComplete) {
                this.allowInComplete = allowInComplete;
                return this;
            }

            /**
             * <p>起点时间戳（精确到秒）</p>
             * 
             * <strong>example:</strong>
             * <p>1722409260</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * <p>源logstore</p>
             * 
             * <strong>example:</strong>
             * <p>ali-test-logstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>是否启用powerSql</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder powerSql(Boolean powerSql) {
                this.powerSql = powerSql;
                return this;
            }

            /**
             * <p>查询语句</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>| select *</li>
             * </ul>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>导出配置</p>
             */
            public Builder sink(Sink sink) {
                this.sink = sink;
                return this;
            }

            /**
             * <p>结束时间戳（精确到秒）</p>
             * 
             * <strong>example:</strong>
             * <p>1722411060</p>
             */
            public Builder toTime(Long toTime) {
                this.toTime = toTime;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownloadJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownloadJobsResponseBody</p>
     */
    public static class ExecutionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkSum")
        private String checkSum;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("executeTime")
        private Long executeTime;

        @com.aliyun.core.annotation.NameInMap("filePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("logCount")
        private Long logCount;

        @com.aliyun.core.annotation.NameInMap("notice")
        private String notice;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Long progress;

        private ExecutionDetails(Builder builder) {
            this.checkSum = builder.checkSum;
            this.errorMessage = builder.errorMessage;
            this.executeTime = builder.executeTime;
            this.filePath = builder.filePath;
            this.fileSize = builder.fileSize;
            this.logCount = builder.logCount;
            this.notice = builder.notice;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionDetails create() {
            return builder().build();
        }

        /**
         * @return checkSum
         */
        public String getCheckSum() {
            return this.checkSum;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return logCount
         */
        public Long getLogCount() {
            return this.logCount;
        }

        /**
         * @return notice
         */
        public String getNotice() {
            return this.notice;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String checkSum; 
            private String errorMessage; 
            private Long executeTime; 
            private String filePath; 
            private Long fileSize; 
            private Long logCount; 
            private String notice; 
            private Long progress; 

            /**
             * checkSum.
             */
            public Builder checkSum(String checkSum) {
                this.checkSum = checkSum;
                return this;
            }

            /**
             * <p>下载错误信息</p>
             * 
             * <strong>example:</strong>
             * <p>timeout</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>下载执行时间</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>下载结果链接</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sls-downloaded-xxxx.csv.gzip?Expiresxxx">https://sls-downloaded-xxxx.csv.gzip?Expiresxxx</a></p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>下载文件大小</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>下载日志条数</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder logCount(Long logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * notice.
             */
            public Builder notice(String notice) {
                this.notice = notice;
                return this;
            }

            /**
             * <p>下载进度</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            public ExecutionDetails build() {
                return new ExecutionDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownloadJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownloadJobsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("executionDetails")
        private ExecutionDetails executionDetails;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Results(Builder builder) {
            this.configuration = builder.configuration;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.executionDetails = builder.executionDetails;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return executionDetails
         */
        public ExecutionDetails getExecutionDetails() {
            return this.executionDetails;
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

        public static final class Builder {
            private Configuration configuration; 
            private String createTime; 
            private String description; 
            private String displayName; 
            private ExecutionDetails executionDetails; 
            private String name; 
            private String status; 

            /**
             * <p>下载配置</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
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
             * <p>任务描述</p>
             * 
             * <strong>example:</strong>
             * <p>a download job</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>任务显示名称</p>
             * 
             * <strong>example:</strong>
             * <p>download-123</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>任务执行细节</p>
             */
            public Builder executionDetails(ExecutionDetails executionDetails) {
                this.executionDetails = executionDetails;
                return this;
            }

            /**
             * <p>代表资源名称的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>download-123</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
