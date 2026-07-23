// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ChatConversationResponseBody} extends {@link TeaModel}
 *
 * <p>ChatConversationResponseBody</p>
 */
public class ChatConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("Func")
    private String func;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillName")
    private String skillName;

    private ChatConversationResponseBody(Builder builder) {
        this.answer = builder.answer;
        this.callId = builder.callId;
        this.conversationId = builder.conversationId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.event = builder.event;
        this.func = builder.func;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatConversationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
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
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return func
     */
    public String getFunc() {
        return this.func;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    public static final class Builder {
        private String answer; 
        private String callId; 
        private String conversationId; 
        private String errorCode; 
        private String errorMessage; 
        private String event; 
        private String func; 
        private String gmtCreateTime; 
        private String messageId; 
        private String requestId; 
        private String skillName; 

        private Builder() {
        } 

        private Builder(ChatConversationResponseBody model) {
            this.answer = model.answer;
            this.callId = model.callId;
            this.conversationId = model.conversationId;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.event = model.event;
            this.func = model.func;
            this.gmtCreateTime = model.gmtCreateTime;
            this.messageId = model.messageId;
            this.requestId = model.requestId;
            this.skillName = model.skillName;
        } 

        /**
         * Answer.
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.callId = callId;
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
         * Event.
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * Func.
         */
        public Builder func(String func) {
            this.func = func;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SkillName.
         */
        public Builder skillName(String skillName) {
            this.skillName = skillName;
            return this;
        }

        public ChatConversationResponseBody build() {
            return new ChatConversationResponseBody(this);
        } 

    } 

}
