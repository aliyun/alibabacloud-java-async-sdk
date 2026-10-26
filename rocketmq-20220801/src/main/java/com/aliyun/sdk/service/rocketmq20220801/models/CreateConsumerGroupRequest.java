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
 * {@link CreateConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerGroupRequest</p>
 */
public class CreateConsumerGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("consumeRetryPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConsumeRetryPolicy consumeRetryPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deliveryOrderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryOrderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exclusive")
    private Boolean exclusive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxReceiveTps")
    private Long maxReceiveTps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageModel")
    private String messageModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topicName")
    private String topicName;

    private CreateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
        this.consumeRetryPolicy = builder.consumeRetryPolicy;
        this.deliveryOrderType = builder.deliveryOrderType;
        this.exclusive = builder.exclusive;
        this.maxReceiveTps = builder.maxReceiveTps;
        this.messageModel = builder.messageModel;
        this.remark = builder.remark;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerGroupRequest create() {
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
     * @return consumeRetryPolicy
     */
    public ConsumeRetryPolicy getConsumeRetryPolicy() {
        return this.consumeRetryPolicy;
    }

    /**
     * @return deliveryOrderType
     */
    public String getDeliveryOrderType() {
        return this.deliveryOrderType;
    }

    /**
     * @return exclusive
     */
    public Boolean getExclusive() {
        return this.exclusive;
    }

    /**
     * @return maxReceiveTps
     */
    public Long getMaxReceiveTps() {
        return this.maxReceiveTps;
    }

    /**
     * @return messageModel
     */
    public String getMessageModel() {
        return this.messageModel;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<CreateConsumerGroupRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 
        private ConsumeRetryPolicy consumeRetryPolicy; 
        private String deliveryOrderType; 
        private Boolean exclusive; 
        private Long maxReceiveTps; 
        private String messageModel; 
        private String remark; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
            this.consumeRetryPolicy = request.consumeRetryPolicy;
            this.deliveryOrderType = request.deliveryOrderType;
            this.exclusive = request.exclusive;
            this.maxReceiveTps = request.maxReceiveTps;
            this.messageModel = request.messageModel;
            this.remark = request.remark;
            this.topicName = request.topicName;
        } 

        /**
         * <p>The instance ID of the instance to which the consumer group to be created belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the consumer group to be created. Used as the identity of the consumer group, which is globally unique.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Character restrictions: letters a<del>z or A</del>Z, digits 0~9, underscores (_), and hyphens (-).</li>
         * <li>Length restrictions: 1 to 60 characters.</li>
         * </ul>
         * <p>For reserved word restrictions, see <a href="https://help.aliyun.com/document_detail/440347.html">Parameter limits</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_groupId</p>
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * <p>The consumption retry policy of the consumer group to be created. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry</a>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder consumeRetryPolicy(ConsumeRetryPolicy consumeRetryPolicy) {
            this.putBodyParameter("consumeRetryPolicy", consumeRetryPolicy);
            this.consumeRetryPolicy = consumeRetryPolicy;
            return this;
        }

        /**
         * <p>The delivery order type of the consumer group to be created.</p>
         * <p>Valid parameter values:</p>
         * <ul>
         * <li>Concurrently: concurrent delivery</li>
         * <li>Orderly: ordered delivery</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Concurrently</p>
         */
        public Builder deliveryOrderType(String deliveryOrderType) {
            this.putBodyParameter("deliveryOrderType", deliveryOrderType);
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }

        /**
         * <p>Specifies whether to enable exclusive subscription, which means a LiteTopic can only be subscribed to by one consumer. Set to true to enable or false to shutdown.</p>
         */
        public Builder exclusive(Boolean exclusive) {
            this.putBodyParameter("exclusive", exclusive);
            this.exclusive = exclusive;
            return this;
        }

        /**
         * <p>The maximum TPS for consuming messages.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxReceiveTps(Long maxReceiveTps) {
            this.putBodyParameter("maxReceiveTps", maxReceiveTps);
            this.maxReceiveTps = maxReceiveTps;
            return this;
        }

        /**
         * <p>The subscribe pattern for consumers:</p>
         * <ul>
         * <li>CLUSTERING: clustering consumption pattern. All consumers in the ConsumerGroup share the same subscription.</li>
         * <li>LITE_SELECTIVE: lightweight consumption pattern. Consumers in the ConsumerGroup can have different subscriptions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LITE_SELECTIVE</p>
         */
        public Builder messageModel(String messageModel) {
            this.putBodyParameter("messageModel", messageModel);
            this.messageModel = messageModel;
            return this;
        }

        /**
         * <p>The remarks for the consumer group to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the remark for test.</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The name of the lite-type topic to subscribe to when using the LITE_SELECTIVE consumption pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>liteTopicTest</p>
         */
        public Builder topicName(String topicName) {
            this.putBodyParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public CreateConsumerGroupRequest build() {
            return new CreateConsumerGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateConsumerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateConsumerGroupRequest</p>
     */
    public static class ConsumeRetryPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deadLetterTargetTopic")
        private String deadLetterTargetTopic;

        @com.aliyun.core.annotation.NameInMap("fixedIntervalRetryTime")
        private Integer fixedIntervalRetryTime;

        @com.aliyun.core.annotation.NameInMap("maxRetryTimes")
        private Integer maxRetryTimes;

        @com.aliyun.core.annotation.NameInMap("retryPolicy")
        @com.aliyun.core.annotation.Validation(required = true)
        private String retryPolicy;

        private ConsumeRetryPolicy(Builder builder) {
            this.deadLetterTargetTopic = builder.deadLetterTargetTopic;
            this.fixedIntervalRetryTime = builder.fixedIntervalRetryTime;
            this.maxRetryTimes = builder.maxRetryTimes;
            this.retryPolicy = builder.retryPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumeRetryPolicy create() {
            return builder().build();
        }

        /**
         * @return deadLetterTargetTopic
         */
        public String getDeadLetterTargetTopic() {
            return this.deadLetterTargetTopic;
        }

        /**
         * @return fixedIntervalRetryTime
         */
        public Integer getFixedIntervalRetryTime() {
            return this.fixedIntervalRetryTime;
        }

        /**
         * @return maxRetryTimes
         */
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        /**
         * @return retryPolicy
         */
        public String getRetryPolicy() {
            return this.retryPolicy;
        }

        public static final class Builder {
            private String deadLetterTargetTopic; 
            private Integer fixedIntervalRetryTime; 
            private Integer maxRetryTimes; 
            private String retryPolicy; 

            private Builder() {
            } 

            private Builder(ConsumeRetryPolicy model) {
                this.deadLetterTargetTopic = model.deadLetterTargetTopic;
                this.fixedIntervalRetryTime = model.fixedIntervalRetryTime;
                this.maxRetryTimes = model.maxRetryTimes;
                this.retryPolicy = model.retryPolicy;
            } 

            /**
             * <p>The dead-letter topic.</p>
             * <p>If a consumer fails to consume a message and the message still failed after retries, the message is delivered to the dead-letter topic for subsequent business recovery or backtracking. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry and dead-letter messages</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>DLQ_mqtest</p>
             */
            public Builder deadLetterTargetTopic(String deadLetterTargetTopic) {
                this.deadLetterTargetTopic = deadLetterTargetTopic;
                return this;
            }

            /**
             * <p>The fixed retry interval, in seconds. This parameter takes effect when the retry policy is set to FixedRetryPolicy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Concurrent delivery: 10 to 1800</li>
             * <li>Ordered delivery: 1 to 600</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fixedIntervalRetryTime(Integer fixedIntervalRetryTime) {
                this.fixedIntervalRetryTime = fixedIntervalRetryTime;
                return this;
            }

            /**
             * <p>The maximum number of retry attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxRetryTimes(Integer maxRetryTimes) {
                this.maxRetryTimes = maxRetryTimes;
                return this;
            }

            /**
             * <p>The retry policy type. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Message retry</a>.</p>
             * <p>Valid parameter values:</p>
             * <ul>
             * <li>FixedRetryPolicy: fixed-interval retry, supported only for ordered delivery</li>
             * <li>DefaultRetryPolicy: progressive backoff retry, supported only for concurrent delivery</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DefaultRetryPolicy</p>
             */
            public Builder retryPolicy(String retryPolicy) {
                this.retryPolicy = retryPolicy;
                return this;
            }

            public ConsumeRetryPolicy build() {
                return new ConsumeRetryPolicy(this);
            } 

        } 

    }
}
