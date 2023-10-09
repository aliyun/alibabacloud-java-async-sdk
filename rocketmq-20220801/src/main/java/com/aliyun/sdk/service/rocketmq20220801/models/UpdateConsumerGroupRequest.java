// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateConsumerGroupRequest</p>
 */
public class UpdateConsumerGroupRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("consumerGroupId")
    @Validation(required = true)
    private String consumerGroupId;

    @Body
    @NameInMap("consumeRetryPolicy")
    @Validation(required = true)
    private ConsumeRetryPolicy consumeRetryPolicy;

    @Body
    @NameInMap("deliveryOrderType")
    @Validation(required = true)
    private String deliveryOrderType;

    @Body
    @NameInMap("remark")
    private String remark;

    private UpdateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
        this.consumeRetryPolicy = builder.consumeRetryPolicy;
        this.deliveryOrderType = builder.deliveryOrderType;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConsumerGroupRequest create() {
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateConsumerGroupRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 
        private ConsumeRetryPolicy consumeRetryPolicy; 
        private String deliveryOrderType; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConsumerGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
            this.consumeRetryPolicy = request.consumeRetryPolicy;
            this.deliveryOrderType = request.deliveryOrderType;
            this.remark = request.remark;
        } 

        /**
         * The ID of the instance to which the consumer group belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the consumer group.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * The new consumption retry policy that you want to configure for the consumer group. For more information, see [Consumption retry](~~440356~~).
         */
        public Builder consumeRetryPolicy(ConsumeRetryPolicy consumeRetryPolicy) {
            this.putBodyParameter("consumeRetryPolicy", consumeRetryPolicy);
            this.consumeRetryPolicy = consumeRetryPolicy;
            return this;
        }

        /**
         * The new message delivery order of the consumer group.
         * <p>
         * 
         * Valid values:
         * 
         * *   Concurrently: concurrent delivery
         * *   Orderly: ordered delivery
         */
        public Builder deliveryOrderType(String deliveryOrderType) {
            this.putBodyParameter("deliveryOrderType", deliveryOrderType);
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }

        /**
         * The new remarks on the consumer group.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateConsumerGroupRequest build() {
            return new UpdateConsumerGroupRequest(this);
        } 

    } 

    public static class ConsumeRetryPolicy extends TeaModel {
        @NameInMap("deadLetterTargetTopic")
        private String deadLetterTargetTopic;

        @NameInMap("maxRetryTimes")
        private Integer maxRetryTimes;

        @NameInMap("retryPolicy")
        @Validation(required = true)
        private String retryPolicy;

        private ConsumeRetryPolicy(Builder builder) {
            this.deadLetterTargetTopic = builder.deadLetterTargetTopic;
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
            private Integer maxRetryTimes; 
            private String retryPolicy; 

            /**
             * The dead-letter topic.
             * <p>
             * 
             * If a consumer still fails to consume a message after the message is retried for a specified number of times, the message is delivered to a dead-letter topic for subsequent business recovery or troubleshooting. For more information, see [Consumption retry and dead-letter messages](~~440356~~).
             */
            public Builder deadLetterTargetTopic(String deadLetterTargetTopic) {
                this.deadLetterTargetTopic = deadLetterTargetTopic;
                return this;
            }

            /**
             * The maximum number of retries.
             */
            public Builder maxRetryTimes(Integer maxRetryTimes) {
                this.maxRetryTimes = maxRetryTimes;
                return this;
            }

            /**
             * The retry policy. For more information, see [Message retry](~~440356~~).
             * <p>
             * 
             * Valid values:
             * 
             * *   FixedRetryPolicy: Failed messages are retried at a fixed interval.
             * *   DefaultRetryPolicy: Failed messages are retried at incremental intervals as the number of retries increases.
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
