// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListExecutionLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionLogsResponseBody</p>
 */
public class ListExecutionLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutionLogs")
    private java.util.List<ExecutionLogs> executionLogs;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListExecutionLogsResponseBody(Builder builder) {
        this.executionLogs = builder.executionLogs;
        this.isTruncated = builder.isTruncated;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return executionLogs
     */
    public java.util.List<ExecutionLogs> getExecutionLogs() {
        return this.executionLogs;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
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

    public static final class Builder {
        private java.util.List<ExecutionLogs> executionLogs; 
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The logs of the execution.</p>
         */
        public Builder executionLogs(java.util.List<ExecutionLogs> executionLogs) {
            this.executionLogs = executionLogs;
            return this;
        }

        /**
         * <p>Indicates whether the log is truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>gAAAAABdpsGWjX8dJ-a6dl_pvoS7AFxNHSNJKHLCAJJ0ylgA53nWW5V4HTEZKCYTaEPNOrxFir4z43UTOjE150cFr8AGTifA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExecutionLogsResponseBody build() {
            return new ListExecutionLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutionLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutionLogsResponseBody</p>
     */
    public static class ExecutionLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("TaskExecutionId")
        private String taskExecutionId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private ExecutionLogs(Builder builder) {
            this.logType = builder.logType;
            this.message = builder.message;
            this.taskExecutionId = builder.taskExecutionId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionLogs create() {
            return builder().build();
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return taskExecutionId
         */
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String logType; 
            private String message; 
            private String taskExecutionId; 
            private String timestamp; 

            /**
             * <p>The log type.</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The details of the task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>The task CheckDiskCategory completed.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The task execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-1234567zxcvb.t0010</p>
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * <p>The timestamp when the task was run.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-24T:02:29:07Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public ExecutionLogs build() {
                return new ExecutionLogs(this);
            } 

        } 

    }
}
