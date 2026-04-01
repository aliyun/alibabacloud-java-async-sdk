// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
    @com.aliyun.core.annotation.NameInMap("deliveryTimeStamp")
    private Long deliveryTimeStamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("liteTopicName")
    private String liteTopicName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageGroup")
    private String messageGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageKey")
    private String messageKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageTag")
    private String messageTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userProperties")
    private java.util.Map<String, ?> userProperties;

    private VerifySendMessageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
        this.deliveryTimeStamp = builder.deliveryTimeStamp;
        this.liteTopicName = builder.liteTopicName;
        this.message = builder.message;
        this.messageGroup = builder.messageGroup;
        this.messageKey = builder.messageKey;
        this.messageTag = builder.messageTag;
        this.userProperties = builder.userProperties;
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
     * @return deliveryTimeStamp
     */
    public Long getDeliveryTimeStamp() {
        return this.deliveryTimeStamp;
    }

    /**
     * @return liteTopicName
     */
    public String getLiteTopicName() {
        return this.liteTopicName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageGroup
     */
    public String getMessageGroup() {
        return this.messageGroup;
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

    /**
     * @return userProperties
     */
    public java.util.Map<String, ?> getUserProperties() {
        return this.userProperties;
    }

    public static final class Builder extends Request.Builder<VerifySendMessageRequest, Builder> {
        private String instanceId; 
        private String topicName; 
        private Long deliveryTimeStamp; 
        private String liteTopicName; 
        private String message; 
        private String messageGroup; 
        private String messageKey; 
        private String messageTag; 
        private java.util.Map<String, ?> userProperties; 

        private Builder() {
            super();
        } 

        private Builder(VerifySendMessageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
            this.deliveryTimeStamp = request.deliveryTimeStamp;
            this.liteTopicName = request.liteTopicName;
            this.message = request.message;
            this.messageGroup = request.messageGroup;
            this.messageKey = request.messageKey;
            this.messageTag = request.messageTag;
            this.userProperties = request.userProperties;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-wwo32kqfm10</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The topic name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>card_status_topic</p>
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        /**
         * deliveryTimeStamp.
         */
        public Builder deliveryTimeStamp(Long deliveryTimeStamp) {
            this.putBodyParameter("deliveryTimeStamp", deliveryTimeStamp);
            this.deliveryTimeStamp = deliveryTimeStamp;
            return this;
        }

        /**
         * liteTopicName.
         */
        public Builder liteTopicName(String liteTopicName) {
            this.putBodyParameter("liteTopicName", liteTopicName);
            this.liteTopicName = liteTopicName;
            return this;
        }

        /**
         * <p>The message body.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.putBodyParameter("message", message);
            this.message = message;
            return this;
        }

        /**
         * messageGroup.
         */
        public Builder messageGroup(String messageGroup) {
            this.putBodyParameter("messageGroup", messageGroup);
            this.messageGroup = messageGroup;
            return this;
        }

        /**
         * <p>The message key.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder messageKey(String messageKey) {
            this.putBodyParameter("messageKey", messageKey);
            this.messageKey = messageKey;
            return this;
        }

        /**
         * <p>The message tag.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder messageTag(String messageTag) {
            this.putBodyParameter("messageTag", messageTag);
            this.messageTag = messageTag;
            return this;
        }

        /**
         * userProperties.
         */
        public Builder userProperties(java.util.Map<String, ?> userProperties) {
            this.putBodyParameter("userProperties", userProperties);
            this.userProperties = userProperties;
            return this;
        }

        @Override
        public VerifySendMessageRequest build() {
            return new VerifySendMessageRequest(this);
        } 

    } 

}
