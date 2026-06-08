// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AskLumaLogEntry} extends {@link TeaModel}
 *
 * <p>AskLumaLogEntry</p>
 */
public class AskLumaLogEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.NameInMap("ClarificationNeeded")
    private Boolean clarificationNeeded;

    @com.aliyun.core.annotation.NameInMap("ClarificationQuestion")
    private String clarificationQuestion;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("DurationMs")
    private Long durationMs;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("IsError")
    private Boolean isError;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Question")
    private String question;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private AskLumaLogEntry(Builder builder) {
        this.agentName = builder.agentName;
        this.clarificationNeeded = builder.clarificationNeeded;
        this.clarificationQuestion = builder.clarificationQuestion;
        this.content = builder.content;
        this.conversationId = builder.conversationId;
        this.createdAt = builder.createdAt;
        this.durationMs = builder.durationMs;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.isError = builder.isError;
        this.messageId = builder.messageId;
        this.question = builder.question;
        this.source = builder.source;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AskLumaLogEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return clarificationNeeded
     */
    public Boolean getClarificationNeeded() {
        return this.clarificationNeeded;
    }

    /**
     * @return clarificationQuestion
     */
    public String getClarificationQuestion() {
        return this.clarificationQuestion;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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
     * @return isError
     */
    public Boolean getIsError() {
        return this.isError;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String agentName; 
        private Boolean clarificationNeeded; 
        private String clarificationQuestion; 
        private Content content; 
        private String conversationId; 
        private String createdAt; 
        private Long durationMs; 
        private String errorCode; 
        private String errorMessage; 
        private Boolean isError; 
        private String messageId; 
        private String question; 
        private String source; 
        private String status; 

        private Builder() {
        } 

        private Builder(AskLumaLogEntry model) {
            this.agentName = model.agentName;
            this.clarificationNeeded = model.clarificationNeeded;
            this.clarificationQuestion = model.clarificationQuestion;
            this.content = model.content;
            this.conversationId = model.conversationId;
            this.createdAt = model.createdAt;
            this.durationMs = model.durationMs;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.isError = model.isError;
            this.messageId = model.messageId;
            this.question = model.question;
            this.source = model.source;
            this.status = model.status;
        } 

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.agentName = agentName;
            return this;
        }

        /**
         * ClarificationNeeded.
         */
        public Builder clarificationNeeded(Boolean clarificationNeeded) {
            this.clarificationNeeded = clarificationNeeded;
            return this;
        }

        /**
         * ClarificationQuestion.
         */
        public Builder clarificationQuestion(String clarificationQuestion) {
            this.clarificationQuestion = clarificationQuestion;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * IsError.
         */
        public Builder isError(Boolean isError) {
            this.isError = isError;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(String question) {
            this.question = question;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AskLumaLogEntry build() {
            return new AskLumaLogEntry(this);
        } 

    } 

}
