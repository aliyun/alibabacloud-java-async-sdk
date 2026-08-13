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
 * {@link StreamChatMessageRequest} extends {@link RequestModel}
 *
 * <p>StreamChatMessageRequest</p>
 */
public class StreamChatMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("messageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lastEventId")
    private String lastEventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private StreamChatMessageRequest(Builder builder) {
        super(builder);
        this.messageId = builder.messageId;
        this.lastEventId = builder.lastEventId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StreamChatMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return lastEventId
     */
    public String getLastEventId() {
        return this.lastEventId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<StreamChatMessageRequest, Builder> {
        private String messageId; 
        private String lastEventId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(StreamChatMessageRequest request) {
            super(request);
            this.messageId = request.messageId;
            this.lastEventId = request.lastEventId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>助手消息ID，由 sendAsyncChatMessage 返回；不属于当前租户时返回 404</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleMessageId</p>
         */
        public Builder messageId(String messageId) {
            this.putPathParameter("messageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>上次接收到的 SSE event id，用于断线续推；不传则从头全量回放</p>
         * 
         * <strong>example:</strong>
         * <p>5-1683456789012</p>
         */
        public Builder lastEventId(String lastEventId) {
            this.putQueryParameter("lastEventId", lastEventId);
            this.lastEventId = lastEventId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public StreamChatMessageRequest build() {
            return new StreamChatMessageRequest(this);
        } 

    } 

}
