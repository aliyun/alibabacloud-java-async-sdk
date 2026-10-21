// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CancelCopilotTurnResponseBody} extends {@link TeaModel}
 *
 * <p>CancelCopilotTurnResponseBody</p>
 */
public class CancelCopilotTurnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiVersion")
    private String apiVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Turn")
    private Turn turn;

    private CancelCopilotTurnResponseBody(Builder builder) {
        this.apiVersion = builder.apiVersion;
        this.requestId = builder.requestId;
        this.turn = builder.turn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCopilotTurnResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return turn
     */
    public Turn getTurn() {
        return this.turn;
    }

    public static final class Builder {
        private String apiVersion; 
        private String requestId; 
        private Turn turn; 

        private Builder() {
        } 

        private Builder(CancelCopilotTurnResponseBody model) {
            this.apiVersion = model.apiVersion;
            this.requestId = model.requestId;
            this.turn = model.turn;
        } 

        /**
         * <p>The API version number. The value is 1.0.0.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.2</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security operations Agent conversation turn.</p>
         */
        public Builder turn(Turn turn) {
            this.turn = turn;
            return this;
        }

        public CancelCopilotTurnResponseBody build() {
            return new CancelCopilotTurnResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CancelCopilotTurnResponseBody} extends {@link TeaModel}
     *
     * <p>CancelCopilotTurnResponseBody</p>
     */
    public static class Turn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientMessageId")
        private String clientMessageId;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private Long feedback;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("ReasoningTokens")
        private Long reasoningTokens;

        @com.aliyun.core.annotation.NameInMap("RetryAllowed")
        private Boolean retryAllowed;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TurnId")
        private String turnId;

        private Turn(Builder builder) {
            this.clientMessageId = builder.clientMessageId;
            this.conversationId = builder.conversationId;
            this.createdAt = builder.createdAt;
            this.feedback = builder.feedback;
            this.inputTokens = builder.inputTokens;
            this.modelId = builder.modelId;
            this.outputTokens = builder.outputTokens;
            this.reasoningTokens = builder.reasoningTokens;
            this.retryAllowed = builder.retryAllowed;
            this.status = builder.status;
            this.turnId = builder.turnId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Turn create() {
            return builder().build();
        }

        /**
         * @return clientMessageId
         */
        public String getClientMessageId() {
            return this.clientMessageId;
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return feedback
         */
        public Long getFeedback() {
            return this.feedback;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return reasoningTokens
         */
        public Long getReasoningTokens() {
            return this.reasoningTokens;
        }

        /**
         * @return retryAllowed
         */
        public Boolean getRetryAllowed() {
            return this.retryAllowed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return turnId
         */
        public String getTurnId() {
            return this.turnId;
        }

        public static final class Builder {
            private String clientMessageId; 
            private String conversationId; 
            private String createdAt; 
            private Long feedback; 
            private Long inputTokens; 
            private String modelId; 
            private Long outputTokens; 
            private Long reasoningTokens; 
            private Boolean retryAllowed; 
            private String status; 
            private String turnId; 

            private Builder() {
            } 

            private Builder(Turn model) {
                this.clientMessageId = model.clientMessageId;
                this.conversationId = model.conversationId;
                this.createdAt = model.createdAt;
                this.feedback = model.feedback;
                this.inputTokens = model.inputTokens;
                this.modelId = model.modelId;
                this.outputTokens = model.outputTokens;
                this.reasoningTokens = model.reasoningTokens;
                this.retryAllowed = model.retryAllowed;
                this.status = model.status;
                this.turnId = model.turnId;
            } 

            /**
             * <p>The client message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>366932fb-9a83-4a2d-94dd-c925b35f****</p>
             */
            public Builder clientMessageId(String clientMessageId) {
                this.clientMessageId = clientMessageId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The creation time. The time follows the ISO 8601 standard in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-23T02:13:49Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The conversation feedback information.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder feedback(Long feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * <p>The number of tokens used for input.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>model-****</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The number of tokens used for output.</p>
             * 
             * <strong>example:</strong>
             * <p>856</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The number of reasoning tokens used on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>420</p>
             */
            public Builder reasoningTokens(Long reasoningTokens) {
                this.reasoningTokens = reasoningTokens;
                return this;
            }

            /**
             * <p>Indicates whether a retry is allowed.</p>
             */
            public Builder retryAllowed(Boolean retryAllowed) {
                this.retryAllowed = retryAllowed;
                return this;
            }

            /**
             * <p>The status of the conversation turn.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            public Turn build() {
                return new Turn(this);
            } 

        } 

    }
}
