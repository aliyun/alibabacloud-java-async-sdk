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

    private SendAsyncChatMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
        this.sessionCreated = builder.sessionCreated;
        this.sessionId = builder.sessionId;
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

    public static final class Builder {
        private String code; 
        private String message; 
        private String messageId; 
        private String requestId; 
        private Boolean sessionCreated; 
        private String sessionId; 

        private Builder() {
        } 

        private Builder(SendAsyncChatMessageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.messageId = model.messageId;
            this.requestId = model.requestId;
            this.sessionCreated = model.sessionCreated;
            this.sessionId = model.sessionId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>助手消息ID；用于随后调用 streamChatMessage 订阅生成结果</p>
         * 
         * <strong>example:</strong>
         * <p>3cf84d92-f273-4bb7-ab3c-52646d25ec30</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>本次调用是否新建了会话</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sessionCreated(Boolean sessionCreated) {
            this.sessionCreated = sessionCreated;
            return this;
        }

        /**
         * <p>会话ID；续写会话时与入参一致，新建会话时为服务端生成值</p>
         * 
         * <strong>example:</strong>
         * <p>bd772dcc-afab-44ad-9fb8-bca716726201</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public SendAsyncChatMessageResponseBody build() {
            return new SendAsyncChatMessageResponseBody(this);
        } 

    } 

}
