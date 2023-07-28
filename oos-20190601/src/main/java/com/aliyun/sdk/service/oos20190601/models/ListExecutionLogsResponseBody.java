// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionLogsResponseBody</p>
 */
public class ListExecutionLogsResponseBody extends TeaModel {
    @NameInMap("ExecutionLogs")
    private java.util.List < ExecutionLogs> executionLogs;

    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
    public java.util.List < ExecutionLogs> getExecutionLogs() {
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
        private java.util.List < ExecutionLogs> executionLogs; 
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * The execution logs.
         */
        public Builder executionLogs(java.util.List < ExecutionLogs> executionLogs) {
            this.executionLogs = executionLogs;
            return this;
        }

        /**
         * Indicates whether the log is truncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExecutionLogsResponseBody build() {
            return new ListExecutionLogsResponseBody(this);
        } 

    } 

    public static class ExecutionLogs extends TeaModel {
        @NameInMap("LogType")
        private String logType;

        @NameInMap("Message")
        private String message;

        @NameInMap("TaskExecutionId")
        private String taskExecutionId;

        @NameInMap("Timestamp")
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
             * The type of the log.
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * The details of the task execution.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The execution ID of the task.
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * The timestamp when the task was run.
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
