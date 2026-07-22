// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeScheduledTaskExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScheduledTaskExecutionsResponseBody</p>
 */
public class DescribeScheduledTaskExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Executions")
    private java.util.List<Executions> executions;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScheduledTaskExecutionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.executions = builder.executions;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduledTaskExecutionsResponseBody create() {
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
     * @return executions
     */
    public java.util.List<Executions> getExecutions() {
        return this.executions;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private java.util.List<Executions> executions; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeScheduledTaskExecutionsResponseBody model) {
            this.code = model.code;
            this.executions = model.executions;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Executions.
         */
        public Builder executions(java.util.List<Executions> executions) {
            this.executions = executions;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScheduledTaskExecutionsResponseBody build() {
            return new DescribeScheduledTaskExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScheduledTaskExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScheduledTaskExecutionsResponseBody</p>
     */
    public static class Executions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedAt")
        private String completedAt;

        @com.aliyun.core.annotation.NameInMap("ConfigSnapshot")
        private String configSnapshot;

        @com.aliyun.core.annotation.NameInMap("DurationMs")
        private Long durationMs;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("ScheduledId")
        private String scheduledId;

        @com.aliyun.core.annotation.NameInMap("StartedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Executions(Builder builder) {
            this.completedAt = builder.completedAt;
            this.configSnapshot = builder.configSnapshot;
            this.durationMs = builder.durationMs;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
            this.output = builder.output;
            this.scheduledId = builder.scheduledId;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executions create() {
            return builder().build();
        }

        /**
         * @return completedAt
         */
        public String getCompletedAt() {
            return this.completedAt;
        }

        /**
         * @return configSnapshot
         */
        public String getConfigSnapshot() {
            return this.configSnapshot;
        }

        /**
         * @return durationMs
         */
        public Long getDurationMs() {
            return this.durationMs;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return scheduledId
         */
        public String getScheduledId() {
            return this.scheduledId;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String completedAt; 
            private String configSnapshot; 
            private Long durationMs; 
            private String errorCode; 
            private String errorMessage; 
            private String instanceId; 
            private String output; 
            private String scheduledId; 
            private String startedAt; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Executions model) {
                this.completedAt = model.completedAt;
                this.configSnapshot = model.configSnapshot;
                this.durationMs = model.durationMs;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.instanceId = model.instanceId;
                this.output = model.output;
                this.scheduledId = model.scheduledId;
                this.startedAt = model.startedAt;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * CompletedAt.
             */
            public Builder completedAt(String completedAt) {
                this.completedAt = completedAt;
                return this;
            }

            /**
             * ConfigSnapshot.
             */
            public Builder configSnapshot(String configSnapshot) {
                this.configSnapshot = configSnapshot;
                return this;
            }

            /**
             * DurationMs.
             */
            public Builder durationMs(Long durationMs) {
                this.durationMs = durationMs;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * ScheduledId.
             */
            public Builder scheduledId(String scheduledId) {
                this.scheduledId = scheduledId;
                return this;
            }

            /**
             * StartedAt.
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
}
