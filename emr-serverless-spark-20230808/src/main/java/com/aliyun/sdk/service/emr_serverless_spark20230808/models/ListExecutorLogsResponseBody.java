// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListExecutorLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutorLogsResponseBody</p>
 */
public class ListExecutorLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListExecutorLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutorLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logs
     */
    public java.util.List<Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Logs> logs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListExecutorLogsResponseBody model) {
            this.logs = model.logs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The retrieved logs, sorted in contextual order. If no contextual logs are found based on the specified starting log, this parameter is empty.</p>
         */
        public Builder logs(java.util.List<Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The maximum number of results returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. This value is null when there are no more results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count of log files.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExecutorLogsResponseBody build() {
            return new ListExecutorLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutorLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorLogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("logName")
        private String logName;

        @com.aliyun.core.annotation.NameInMap("logType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private Logs(Builder builder) {
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.logName = builder.logName;
            this.logType = builder.logType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return logName
         */
        public String getLogName() {
            return this.logName;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String fileName; 
            private Long fileSize; 
            private String logName; 
            private String logType; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.logName = model.logName;
                this.logType = model.logType;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The full path of the log file.</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The size of the file, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>6383327</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The log name.</p>
             * 
             * <strong>example:</strong>
             * <p>log4j.log</p>
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * <p>The log type.</p>
             * 
             * <strong>example:</strong>
             * <p>log4j</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The time the log file was last updated, as a Unix timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1745390462</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
