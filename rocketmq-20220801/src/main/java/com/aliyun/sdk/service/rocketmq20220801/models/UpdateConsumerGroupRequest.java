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
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 消费组ID
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * 消费重试策略
         */
        public Builder consumeRetryPolicy(ConsumeRetryPolicy consumeRetryPolicy) {
            this.putBodyParameter("consumeRetryPolicy", consumeRetryPolicy);
            this.consumeRetryPolicy = consumeRetryPolicy;
            return this;
        }

        /**
         * 投递顺序性
         */
        public Builder deliveryOrderType(String deliveryOrderType) {
            this.putBodyParameter("deliveryOrderType", deliveryOrderType);
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }

        /**
         * 备注
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
             * deadLetterTargetTopic.
             */
            public Builder deadLetterTargetTopic(String deadLetterTargetTopic) {
                this.deadLetterTargetTopic = deadLetterTargetTopic;
                return this;
            }

            /**
             * 最大重试次数
             */
            public Builder maxRetryTimes(Integer maxRetryTimes) {
                this.maxRetryTimes = maxRetryTimes;
                return this;
            }

            /**
             * 重试策略类型
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
