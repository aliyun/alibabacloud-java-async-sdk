// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifySendMessageRequest} extends {@link RequestModel}
 *
 * <p>VerifySendMessageRequest</p>
 */
public class VerifySendMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageKey")
    private String messageKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageTag")
    private String messageTag;

    private VerifySendMessageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
        this.message = builder.message;
        this.messageKey = builder.messageKey;
        this.messageTag = builder.messageTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifySendMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageKey
     */
    public String getMessageKey() {
        return this.messageKey;
    }

    /**
     * @return messageTag
     */
    public String getMessageTag() {
        return this.messageTag;
    }

    public static final class Builder extends Request.Builder<VerifySendMessageRequest, Builder> {
        private String instanceId; 
        private String topicName; 
        private String message; 
        private String messageKey; 
        private String messageTag; 

        private Builder() {
            super();
        } 

        private Builder(VerifySendMessageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
            this.message = request.message;
            this.messageKey = request.messageKey;
            this.messageTag = request.messageTag;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * topicName.
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.putBodyParameter("message", message);
            this.message = message;
            return this;
        }

        /**
         * messageKey.
         */
        public Builder messageKey(String messageKey) {
            this.putBodyParameter("messageKey", messageKey);
            this.messageKey = messageKey;
            return this;
        }

        /**
         * messageTag.
         */
        public Builder messageTag(String messageTag) {
            this.putBodyParameter("messageTag", messageTag);
            this.messageTag = messageTag;
            return this;
        }

        @Override
        public VerifySendMessageRequest build() {
            return new VerifySendMessageRequest(this);
        } 

    } 

}
