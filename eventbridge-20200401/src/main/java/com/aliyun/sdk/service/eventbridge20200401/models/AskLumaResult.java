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
 * {@link AskLumaResult} extends {@link TeaModel}
 *
 * <p>AskLumaResult</p>
 */
public class AskLumaResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClarificationNeeded")
    private Boolean clarificationNeeded;

    @com.aliyun.core.annotation.NameInMap("ClarificationQuestion")
    private String clarificationQuestion;

    @com.aliyun.core.annotation.NameInMap("Constraints")
    private Constraints constraints;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("IsError")
    private Boolean isError;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StorageTruncated")
    private Boolean storageTruncated;

    private AskLumaResult(Builder builder) {
        this.clarificationNeeded = builder.clarificationNeeded;
        this.clarificationQuestion = builder.clarificationQuestion;
        this.constraints = builder.constraints;
        this.content = builder.content;
        this.conversationId = builder.conversationId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.isError = builder.isError;
        this.messageId = builder.messageId;
        this.status = builder.status;
        this.storageTruncated = builder.storageTruncated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AskLumaResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return constraints
     */
    public Constraints getConstraints() {
        return this.constraints;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storageTruncated
     */
    public Boolean getStorageTruncated() {
        return this.storageTruncated;
    }

    public static final class Builder {
        private Boolean clarificationNeeded; 
        private String clarificationQuestion; 
        private Constraints constraints; 
        private Content content; 
        private String conversationId; 
        private String errorCode; 
        private String errorMessage; 
        private Boolean isError; 
        private String messageId; 
        private String status; 
        private Boolean storageTruncated; 

        private Builder() {
        } 

        private Builder(AskLumaResult model) {
            this.clarificationNeeded = model.clarificationNeeded;
            this.clarificationQuestion = model.clarificationQuestion;
            this.constraints = model.constraints;
            this.content = model.content;
            this.conversationId = model.conversationId;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.isError = model.isError;
            this.messageId = model.messageId;
            this.status = model.status;
            this.storageTruncated = model.storageTruncated;
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
         * Constraints.
         */
        public Builder constraints(Constraints constraints) {
            this.constraints = constraints;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StorageTruncated.
         */
        public Builder storageTruncated(Boolean storageTruncated) {
            this.storageTruncated = storageTruncated;
            return this;
        }

        public AskLumaResult build() {
            return new AskLumaResult(this);
        } 

    } 

}
