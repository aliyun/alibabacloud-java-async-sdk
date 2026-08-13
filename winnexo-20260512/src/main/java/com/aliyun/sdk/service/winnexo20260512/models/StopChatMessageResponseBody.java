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
 * {@link StopChatMessageResponseBody} extends {@link TeaModel}
 *
 * <p>StopChatMessageResponseBody</p>
 */
public class StopChatMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("finishReason")
    private String finishReason;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("partialContent")
    private String partialContent;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private StopChatMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.finishReason = builder.finishReason;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.partialContent = builder.partialContent;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopChatMessageResponseBody create() {
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
     * @return finishReason
     */
    public String getFinishReason() {
        return this.finishReason;
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
     * @return partialContent
     */
    public String getPartialContent() {
        return this.partialContent;
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
        private String code; 
        private String finishReason; 
        private String message; 
        private String messageId; 
        private String partialContent; 
        private String requestId; 
        private String sessionId; 
        private String status; 

        private Builder() {
        } 

        private Builder(StopChatMessageResponseBody model) {
            this.code = model.code;
            this.finishReason = model.finishReason;
            this.message = model.message;
            this.messageId = model.messageId;
            this.partialContent = model.partialContent;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.status = model.status;
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
         * <p>结束原因</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder finishReason(String finishReason) {
            this.finishReason = finishReason;
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
         * <p>助手消息ID，由 sendAsyncChatMessage 返回；不属于当前租户时返回 404</p>
         * 
         * <strong>example:</strong>
         * <p>exampleMessageId</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>已生成的部分内容</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder partialContent(String partialContent) {
            this.partialContent = partialContent;
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
         * <p>会话 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSessionId</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>消息最终状态</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public StopChatMessageResponseBody build() {
            return new StopChatMessageResponseBody(this);
        } 

    } 

}
