// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSubscriptionAttributesRequest} extends {@link RequestModel}
 *
 * <p>SetSubscriptionAttributesRequest</p>
 */
public class SetSubscriptionAttributesRequest extends Request {
    @Query
    @NameInMap("NotifyStrategy")
    private String notifyStrategy;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubscriptionName")
    @Validation(required = true)
    private String subscriptionName;

    @Query
    @NameInMap("TopicName")
    @Validation(required = true)
    private String topicName;

    private SetSubscriptionAttributesRequest(Builder builder) {
        super(builder);
        this.notifyStrategy = builder.notifyStrategy;
        this.regionId = builder.regionId;
        this.subscriptionName = builder.subscriptionName;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSubscriptionAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notifyStrategy
     */
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<SetSubscriptionAttributesRequest, Builder> {
        private String notifyStrategy; 
        private String regionId; 
        private String subscriptionName; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(SetSubscriptionAttributesRequest request) {
            super(request);
            this.notifyStrategy = request.notifyStrategy;
            this.regionId = request.regionId;
            this.subscriptionName = request.subscriptionName;
            this.topicName = request.topicName;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public SetSubscriptionAttributesRequest build() {
            return new SetSubscriptionAttributesRequest(this);
        } 

    } 

}
