// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConsumerGroupSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>DeleteConsumerGroupSubscriptionRequest</p>
 */
public class DeleteConsumerGroupSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("topicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private DeleteConsumerGroupSubscriptionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
        this.filterExpression = builder.filterExpression;
        this.filterType = builder.filterType;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConsumerGroupSubscriptionRequest create() {
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
     * @return filterExpression
     */
    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * @return filterType
     */
    public String getFilterType() {
        return this.filterType;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<DeleteConsumerGroupSubscriptionRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 
        private String filterExpression; 
        private String filterType; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConsumerGroupSubscriptionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
            this.filterExpression = request.filterExpression;
            this.filterType = request.filterType;
            this.topicName = request.topicName;
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
         * consumerGroupId.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * filterExpression.
         */
        public Builder filterExpression(String filterExpression) {
            this.putQueryParameter("filterExpression", filterExpression);
            this.filterExpression = filterExpression;
            return this;
        }

        /**
         * filterType.
         */
        public Builder filterType(String filterType) {
            this.putQueryParameter("filterType", filterType);
            this.filterType = filterType;
            return this;
        }

        /**
         * topicName.
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public DeleteConsumerGroupSubscriptionRequest build() {
            return new DeleteConsumerGroupSubscriptionRequest(this);
        } 

    } 

}
