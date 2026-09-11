// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SendAsyncChatMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendAsyncChatMessageResponseBody</p>
 */
public class SendAsyncChatMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionCreated")
    private Boolean sessionCreated;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("userMessageId")
    private String userMessageId;

    private SendAsyncChatMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
        this.sessionCreated = builder.sessionCreated;
        this.sessionId = builder.sessionId;
        this.userMessageId = builder.userMessageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendAsyncChatMessageResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return sessionCreated
     */
    public Boolean getSessionCreated() {
        return this.sessionCreated;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return userMessageId
     */
    public String getUserMessageId() {
        return this.userMessageId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String messageId; 
        private String requestId; 
        private Boolean sessionCreated; 
        private String sessionId; 
        private String userMessageId; 

        private Builder() {
        } 

        private Builder(SendAsyncChatMessageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.messageId = model.messageId;
            this.requestId = model.requestId;
            this.sessionCreated = model.sessionCreated;
            this.sessionId = model.sessionId;
            this.userMessageId = model.userMessageId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* or InvalidParameter.*).</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error description. This is empty when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The assistant message ID. Use this ID to call streamChatMessage to subscribe to the generation results.</p>
         * 
         * <strong>example:</strong>
         * <p>3cf84d92-f273-4bb7-ab3c-52646d25ec30</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether a new session was created by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sessionCreated(Boolean sessionCreated) {
            this.sessionCreated = sessionCreated;
            return this;
        }

        /**
         * <p>The session ID. For continued sessions, this matches the input value. For new sessions, this is a server-generated value.</p>
         * 
         * <strong>example:</strong>
         * <p>bd772dcc-afab-44ad-9fb8-bca716726201</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The user message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60756cc6-8c53-4d1f-8db8-b8c09b81a5cb</p>
         */
        public Builder userMessageId(String userMessageId) {
            this.userMessageId = userMessageId;
            return this;
        }

        public SendAsyncChatMessageResponseBody build() {
            return new SendAsyncChatMessageResponseBody(this);
        } 

    } 

}
