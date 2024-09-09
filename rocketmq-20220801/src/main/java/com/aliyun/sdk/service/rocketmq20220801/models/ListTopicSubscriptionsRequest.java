// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTopicSubscriptionsRequest} extends {@link RequestModel}
 *
 * <p>ListTopicSubscriptionsRequest</p>
 */
public class ListTopicSubscriptionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private ListTopicSubscriptionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTopicSubscriptionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListTopicSubscriptionsRequest, Builder> {
        private String instanceId; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(ListTopicSubscriptionsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
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
         * The name of the topic on the ApsaraMQ for RocketMQ instance.
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public ListTopicSubscriptionsRequest build() {
            return new ListTopicSubscriptionsRequest(this);
        } 

    } 

}
