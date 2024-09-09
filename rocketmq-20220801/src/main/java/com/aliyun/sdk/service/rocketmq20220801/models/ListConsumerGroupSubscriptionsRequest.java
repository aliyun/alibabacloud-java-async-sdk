// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConsumerGroupSubscriptionsRequest} extends {@link RequestModel}
 *
 * <p>ListConsumerGroupSubscriptionsRequest</p>
 */
public class ListConsumerGroupSubscriptionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupId;

    private ListConsumerGroupSubscriptionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumerGroupSubscriptionsRequest create() {
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
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public static final class Builder extends Request.Builder<ListConsumerGroupSubscriptionsRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListConsumerGroupSubscriptionsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
        } 

        /**
         * The ID of the ApsaraMQ for RocketMQ instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the consumer group whose subscriptions you want to query.
         * <p>
         * 
         * If you do not configure this parameter, the subscriptions of all consumer groups on the specified instance are queried.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        @Override
        public ListConsumerGroupSubscriptionsRequest build() {
            return new ListConsumerGroupSubscriptionsRequest(this);
        } 

    } 

}
