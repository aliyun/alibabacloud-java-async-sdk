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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("topicName")
    private String topicName;

    private ListConsumerGroupSubscriptionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
        this.topicName = builder.topicName;
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

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<ListConsumerGroupSubscriptionsRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(ListConsumerGroupSubscriptionsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
            this.topicName = request.topicName;
        } 

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-tl32wwz1r05</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the consumer group whose subscriptions you want to query.</p>
         * <p>If you do not configure this parameter, the subscriptions of all consumer groups on the specified instance are queried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PRINT_RETRY_CONSUMER</p>
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * <p>The topic name. If you do not specify this parameter, all subscriptions of the consumer group are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_test</p>
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public ListConsumerGroupSubscriptionsRequest build() {
            return new ListConsumerGroupSubscriptionsRequest(this);
        } 

    } 

}
