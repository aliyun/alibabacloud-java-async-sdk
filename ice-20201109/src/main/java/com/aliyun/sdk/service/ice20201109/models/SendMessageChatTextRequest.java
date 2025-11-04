// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SendMessageChatTextRequest} extends {@link RequestModel}
 *
 * <p>SendMessageChatTextRequest</p>
 */
public class SendMessageChatTextRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedArchiving")
    private Boolean needArchiving;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private SendMessageChatTextRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
        this.mode = builder.mode;
        this.needArchiving = builder.needArchiving;
        this.receiverId = builder.receiverId;
        this.sessionId = builder.sessionId;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageChatTextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return needArchiving
     */
    public Boolean getNeedArchiving() {
        return this.needArchiving;
    }

    /**
     * @return receiverId
     */
    public String getReceiverId() {
        return this.receiverId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SendMessageChatTextRequest, Builder> {
        private String AIAgentId; 
        private String mode; 
        private Boolean needArchiving; 
        private String receiverId; 
        private String sessionId; 
        private String text; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageChatTextRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
            this.mode = request.mode;
            this.needArchiving = request.needArchiving;
            this.receiverId = request.receiverId;
            this.sessionId = request.sessionId;
            this.text = request.text;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the AI agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        /**
         * <p>The mode of message sending. Valid values:</p>
         * <ul>
         * <li>online</li>
         * <li>offline</li>
         * </ul>
         * <p>Default value: offline.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>Specifies whether to archive chat records. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needArchiving(Boolean needArchiving) {
            this.putQueryParameter("NeedArchiving", needArchiving);
            this.needArchiving = needArchiving;
            return this;
        }

        /**
         * <p>The ID of the user who receives the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60000042053</p>
         */
        public Builder receiverId(String receiverId) {
            this.putQueryParameter("ReceiverId", receiverId);
            this.receiverId = receiverId;
            return this;
        }

        /**
         * <p>The ID of the session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f27f9b9be28642a88e18****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The content of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>The type of the message. Valid values:</p>
         * <ul>
         * <li>announcement: notification.</li>
         * <li>custom: custom message.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>announcement</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SendMessageChatTextRequest build() {
            return new SendMessageChatTextRequest(this);
        } 

    } 

}
