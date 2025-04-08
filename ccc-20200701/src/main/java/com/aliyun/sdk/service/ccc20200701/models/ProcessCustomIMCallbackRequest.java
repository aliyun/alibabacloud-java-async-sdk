// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ProcessCustomIMCallbackRequest} extends {@link RequestModel}
 *
 * <p>ProcessCustomIMCallbackRequest</p>
 */
public class ProcessCustomIMCallbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessChannelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SenderAvatarMediaId")
    private String senderAvatarMediaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SenderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String senderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SenderName")
    private String senderName;

    private ProcessCustomIMCallbackRequest(Builder builder) {
        super(builder);
        this.accessChannelId = builder.accessChannelId;
        this.conversationId = builder.conversationId;
        this.instanceId = builder.instanceId;
        this.messageContent = builder.messageContent;
        this.requestId = builder.requestId;
        this.senderAvatarMediaId = builder.senderAvatarMediaId;
        this.senderId = builder.senderId;
        this.senderName = builder.senderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessCustomIMCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessChannelId
     */
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return messageContent
     */
    public String getMessageContent() {
        return this.messageContent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return senderAvatarMediaId
     */
    public String getSenderAvatarMediaId() {
        return this.senderAvatarMediaId;
    }

    /**
     * @return senderId
     */
    public String getSenderId() {
        return this.senderId;
    }

    /**
     * @return senderName
     */
    public String getSenderName() {
        return this.senderName;
    }

    public static final class Builder extends Request.Builder<ProcessCustomIMCallbackRequest, Builder> {
        private String accessChannelId; 
        private String conversationId; 
        private String instanceId; 
        private String messageContent; 
        private String requestId; 
        private String senderAvatarMediaId; 
        private String senderId; 
        private String senderName; 

        private Builder() {
            super();
        } 

        private Builder(ProcessCustomIMCallbackRequest request) {
            super(request);
            this.accessChannelId = request.accessChannelId;
            this.conversationId = request.conversationId;
            this.instanceId = request.instanceId;
            this.messageContent = request.messageContent;
            this.requestId = request.requestId;
            this.senderAvatarMediaId = request.senderAvatarMediaId;
            this.senderId = request.senderId;
            this.senderName = request.senderName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cf584733-<em><strong>-</strong></em>-9699-cb77aa3b7aa6</p>
         */
        public Builder accessChannelId(String accessChannelId) {
            this.putBodyParameter("AccessChannelId", accessChannelId);
            this.accessChannelId = accessChannelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d165de4f-9851-445e-9535-66ebfa72fa51</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder messageContent(String messageContent) {
            this.putBodyParameter("MessageContent", messageContent);
            this.messageContent = messageContent;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SenderAvatarMediaId.
         */
        public Builder senderAvatarMediaId(String senderAvatarMediaId) {
            this.putBodyParameter("SenderAvatarMediaId", senderAvatarMediaId);
            this.senderAvatarMediaId = senderAvatarMediaId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>63061274befd6b545aab4c83</p>
         */
        public Builder senderId(String senderId) {
            this.putBodyParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * SenderName.
         */
        public Builder senderName(String senderName) {
            this.putBodyParameter("SenderName", senderName);
            this.senderName = senderName;
            return this;
        }

        @Override
        public ProcessCustomIMCallbackRequest build() {
            return new ProcessCustomIMCallbackRequest(this);
        } 

    } 

}
