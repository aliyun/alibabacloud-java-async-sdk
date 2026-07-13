// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetInstanceAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceAsyncTaskResponseBody</p>
 */
public class GetInstanceAsyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetInstanceAsyncTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceAsyncTaskResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetInstanceAsyncTaskResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>SUCCESS</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * <p>success</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetInstanceAsyncTaskResponseBody build() {
            return new GetInstanceAsyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceAsyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceAsyncTaskResponseBody</p>
     */
    public static class RecoveryMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OccurredAt")
        private String occurredAt;

        @com.aliyun.core.annotation.NameInMap("RecoverySuggestion")
        private String recoverySuggestion;

        @com.aliyun.core.annotation.NameInMap("Retryable")
        private Boolean retryable;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RecoveryMessage(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.occurredAt = builder.occurredAt;
            this.recoverySuggestion = builder.recoverySuggestion;
            this.retryable = builder.retryable;
            this.source = builder.source;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecoveryMessage create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return occurredAt
         */
        public String getOccurredAt() {
            return this.occurredAt;
        }

        /**
         * @return recoverySuggestion
         */
        public String getRecoverySuggestion() {
            return this.recoverySuggestion;
        }

        /**
         * @return retryable
         */
        public Boolean getRetryable() {
            return this.retryable;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String occurredAt; 
            private String recoverySuggestion; 
            private Boolean retryable; 
            private String source; 
            private String type; 

            private Builder() {
            } 

            private Builder(RecoveryMessage model) {
                this.code = model.code;
                this.message = model.message;
                this.occurredAt = model.occurredAt;
                this.recoverySuggestion = model.recoverySuggestion;
                this.retryable = model.retryable;
                this.source = model.source;
                this.type = model.type;
            } 

            /**
             * <p>SUCCESS</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>success</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * OccurredAt.
             */
            public Builder occurredAt(String occurredAt) {
                this.occurredAt = occurredAt;
                return this;
            }

            /**
             * RecoverySuggestion.
             */
            public Builder recoverySuggestion(String recoverySuggestion) {
                this.recoverySuggestion = recoverySuggestion;
                return this;
            }

            /**
             * Retryable.
             */
            public Builder retryable(Boolean retryable) {
                this.retryable = retryable;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecoveryMessage build() {
                return new RecoveryMessage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceAsyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceAsyncTaskResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentStep")
        private String currentStep;

        @com.aliyun.core.annotation.NameInMap("RecoveryMessage")
        private RecoveryMessage recoveryMessage;

        @com.aliyun.core.annotation.NameInMap("TaskCode")
        private String taskCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("WaitingForUserAction")
        private Boolean waitingForUserAction;

        private Items(Builder builder) {
            this.currentStep = builder.currentStep;
            this.recoveryMessage = builder.recoveryMessage;
            this.taskCode = builder.taskCode;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.waitingForUserAction = builder.waitingForUserAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return currentStep
         */
        public String getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return recoveryMessage
         */
        public RecoveryMessage getRecoveryMessage() {
            return this.recoveryMessage;
        }

        /**
         * @return taskCode
         */
        public String getTaskCode() {
            return this.taskCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return waitingForUserAction
         */
        public Boolean getWaitingForUserAction() {
            return this.waitingForUserAction;
        }

        public static final class Builder {
            private String currentStep; 
            private RecoveryMessage recoveryMessage; 
            private String taskCode; 
            private String taskId; 
            private String taskStatus; 
            private Boolean waitingForUserAction; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.currentStep = model.currentStep;
                this.recoveryMessage = model.recoveryMessage;
                this.taskCode = model.taskCode;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.waitingForUserAction = model.waitingForUserAction;
            } 

            /**
             * CurrentStep.
             */
            public Builder currentStep(String currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * RecoveryMessage.
             */
            public Builder recoveryMessage(RecoveryMessage recoveryMessage) {
                this.recoveryMessage = recoveryMessage;
                return this;
            }

            /**
             * TaskCode.
             */
            public Builder taskCode(String taskCode) {
                this.taskCode = taskCode;
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
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * WaitingForUserAction.
             */
            public Builder waitingForUserAction(Boolean waitingForUserAction) {
                this.waitingForUserAction = waitingForUserAction;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
