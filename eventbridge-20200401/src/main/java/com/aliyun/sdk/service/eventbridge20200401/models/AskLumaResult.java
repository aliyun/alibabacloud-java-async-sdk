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

    @com.aliyun.core.annotation.NameInMap("WikiVersion")
    private String wikiVersion;

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
        this.wikiVersion = builder.wikiVersion;
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

    /**
     * @return wikiVersion
     */
    public String getWikiVersion() {
        return this.wikiVersion;
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
        private String wikiVersion; 

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
            this.wikiVersion = model.wikiVersion;
        } 

        /**
         * <p>Indicates whether clarification is needed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder clarificationNeeded(Boolean clarificationNeeded) {
            this.clarificationNeeded = clarificationNeeded;
            return this;
        }

        /**
         * <p>The clarification question text.</p>
         * 
         * <strong>example:</strong>
         * <p>Which database does the employee table you are referring to belong to?</p>
         */
        public Builder clarificationQuestion(String clarificationQuestion) {
            this.clarificationQuestion = clarificationQuestion;
            return this;
        }

        /**
         * <p>The query constraints.</p>
         */
        public Builder constraints(Constraints constraints) {
            this.constraints = constraints;
            return this;
        }

        /**
         * <p>The structured result body.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The conversation ID, used for multi-turn follow-up questions.</p>
         * 
         * <strong>example:</strong>
         * <p>conv_xxx</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ExecutionFailed, Timeout, RateLimited, InternalError, ConversationExpired</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error details.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent with name \&quot;xxx\&quot; not found for account 1186xxx</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Indicates whether an error occurred. A value of false indicates that the query succeeded or a clarification is needed (including empty result sets). A value of true indicates that the execution failed due to a timeout, throttling, or internal error.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isError(Boolean isError) {
            this.isError = isError;
            return this;
        }

        /**
         * <p>The message ID, used for polling with PollAskResult.</p>
         * 
         * <strong>example:</strong>
         * <p>msg_xxx</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The submit status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING, SUCCEEDED, FAILED, TIMEOUT</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the result was truncated because it exceeded the storage limit. This field is returned only for large result sets.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder storageTruncated(Boolean storageTruncated) {
            this.storageTruncated = storageTruncated;
            return this;
        }

        /**
         * <p>The business Wiki version that was actually used for this response. This field is not returned if the agent does not have a Wiki configured.</p>
         * 
         * <strong>example:</strong>
         * <p>eventhouse-multisource-demo-v1</p>
         */
        public Builder wikiVersion(String wikiVersion) {
            this.wikiVersion = wikiVersion;
            return this;
        }

        public AskLumaResult build() {
            return new AskLumaResult(this);
        } 

    } 

}
