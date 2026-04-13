// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
 * {@link CreateChatResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChatResponseBody</p>
 */
public class CreateChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private ChatDetail answer;

    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateChatResponseBody(Builder builder) {
        this.answer = builder.answer;
        this.chatId = builder.chatId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public ChatDetail getAnswer() {
        return this.answer;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
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
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private ChatDetail answer; 
        private String chatId; 
        private String errorCode; 
        private String errorMessage; 
        private String gmtCreateTime; 
        private String requestId; 
        private String sessionId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateChatResponseBody model) {
            this.answer = model.answer;
            this.chatId = model.chatId;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.gmtCreateTime = model.gmtCreateTime;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.status = model.status;
        } 

        /**
         * Answer.
         */
        public Builder answer(ChatDetail answer) {
            this.answer = answer;
            return this;
        }

        /**
         * ChatId.
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
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
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateChatResponseBody build() {
            return new CreateChatResponseBody(this);
        } 

    } 

}
