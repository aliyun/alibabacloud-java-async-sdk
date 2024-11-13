// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserExecutionLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserExecutionLogsResponseBody</p>
 */
public class ListUserExecutionLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutionLogs")
    private java.util.List < ExecutionLogs> executionLogs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserExecutionLogsResponseBody(Builder builder) {
        this.executionLogs = builder.executionLogs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserExecutionLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return executionLogs
     */
    public java.util.List < ExecutionLogs> getExecutionLogs() {
        return this.executionLogs;
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
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * ExecutionLogs.
         */
        public Builder executionLogs(java.util.List < ExecutionLogs> executionLogs) {
            this.executionLogs = executionLogs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserExecutionLogsResponseBody build() {
            return new ListUserExecutionLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserExecutionLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserExecutionLogsResponseBody</p>
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
             * LogType.
             */
            public Builder logType(String logType) {
                this.logType = logType;
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
             * TaskExecutionId.
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * Timestamp.
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
