// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeRequest} extends {@link RequestModel}
 *
 * <p>SubscribeRequest</p>
 */
public class SubscribeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTag")
    private String messageTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyContentFormat")
    private String notifyContentFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyStrategy")
    private String notifyStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private SubscribeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpoint = builder.endpoint;
        this.messageTag = builder.messageTag;
        this.notifyContentFormat = builder.notifyContentFormat;
        this.notifyStrategy = builder.notifyStrategy;
        this.pushType = builder.pushType;
        this.subscriptionName = builder.subscriptionName;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return messageTag
     */
    public String getMessageTag() {
        return this.messageTag;
    }

    /**
     * @return notifyContentFormat
     */
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    /**
     * @return notifyStrategy
     */
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return pushType
     */
    public String getPushType() {
        return this.pushType;
    }

    /**
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<SubscribeRequest, Builder> {
        private String regionId; 
        private String endpoint; 
        private String messageTag; 
        private String notifyContentFormat; 
        private String notifyStrategy; 
        private String pushType; 
        private String subscriptionName; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpoint = request.endpoint;
            this.messageTag = request.messageTag;
            this.notifyContentFormat = request.notifyContentFormat;
            this.notifyStrategy = request.notifyStrategy;
            this.pushType = request.pushType;
            this.subscriptionName = request.subscriptionName;
            this.topicName = request.topicName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * MessageTag.
         */
        public Builder messageTag(String messageTag) {
            this.putQueryParameter("MessageTag", messageTag);
            this.messageTag = messageTag;
            return this;
        }

        /**
         * NotifyContentFormat.
         */
        public Builder notifyContentFormat(String notifyContentFormat) {
            this.putQueryParameter("NotifyContentFormat", notifyContentFormat);
            this.notifyContentFormat = notifyContentFormat;
            return this;
        }

        /**
         * NotifyStrategy.
         */
        public Builder notifyStrategy(String notifyStrategy) {
            this.putQueryParameter("NotifyStrategy", notifyStrategy);
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * PushType.
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * SubscriptionName.
         */
        public Builder subscriptionName(String subscriptionName) {
            this.putQueryParameter("SubscriptionName", subscriptionName);
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public SubscribeRequest build() {
            return new SubscribeRequest(this);
        } 

    } 

}
