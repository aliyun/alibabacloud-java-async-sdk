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
 * {@link SendWorkItemMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendWorkItemMessageResponseBody</p>
 */
public class SendWorkItemMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("userMessageId")
    private String userMessageId;

    @com.aliyun.core.annotation.NameInMap("workItemId")
    private String workItemId;

    private SendWorkItemMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.userMessageId = builder.userMessageId;
        this.workItemId = builder.workItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendWorkItemMessageResponseBody create() {
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

    /**
     * @return workItemId
     */
    public String getWorkItemId() {
        return this.workItemId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String messageId; 
        private String requestId; 
        private String sessionId; 
        private String userMessageId; 
        private String workItemId; 

        private Builder() {
        } 

        private Builder(SendWorkItemMessageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.messageId = model.messageId;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.userMessageId = model.userMessageId;
            this.workItemId = model.workItemId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success. Other values indicate backend error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error description. This parameter is empty if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the assistant message. The reply is generated asynchronously in the background.</p>
         * 
         * <strong>example:</strong>
         * <p>23456789-abcd-4ef0-8123-456789abcdef</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the existing topic session.</p>
         * 
         * <strong>example:</strong>
         * <p>01234567-89ab-4def-8123-456789abcdef</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The ID of the user message.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-9abc-4def-8123-456789abcdef</p>
         */
        public Builder userMessageId(String userMessageId) {
            this.userMessageId = userMessageId;
            return this;
        }

        /**
         * <p>The work item ID in the request. If only conversationId is specified, a compatible ID in the legacy-topic:<conversationId> format is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>wi_0123456789abcdef0123456789abcdef</p>
         */
        public Builder workItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }

        public SendWorkItemMessageResponseBody build() {
            return new SendWorkItemMessageResponseBody(this);
        } 

    } 

}
