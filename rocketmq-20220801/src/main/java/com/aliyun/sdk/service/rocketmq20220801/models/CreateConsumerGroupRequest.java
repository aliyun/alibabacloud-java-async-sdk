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
    @com.aliyun.core.annotation.NameInMap("maxReceiveTps")
    private Long maxReceiveTps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private CreateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
        this.consumeRetryPolicy = builder.consumeRetryPolicy;
        this.deliveryOrderType = builder.deliveryOrderType;
        this.maxReceiveTps = builder.maxReceiveTps;
        this.remark = builder.remark;
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
     * @return maxReceiveTps
     */
    public Long getMaxReceiveTps() {
        return this.maxReceiveTps;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<CreateConsumerGroupRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 
        private ConsumeRetryPolicy consumeRetryPolicy; 
        private String deliveryOrderType; 
        private Long maxReceiveTps; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
            this.consumeRetryPolicy = request.consumeRetryPolicy;
            this.deliveryOrderType = request.deliveryOrderType;
            this.maxReceiveTps = request.maxReceiveTps;
            this.remark = request.remark;
        } 

        /**
         * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
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
         * <p>The result data that is returned.</p>
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
         * <p>consume retry policy</p>
         * <p>This parameter is required.</p>
         */
        public Builder consumeRetryPolicy(ConsumeRetryPolicy consumeRetryPolicy) {
            this.putBodyParameter("consumeRetryPolicy", consumeRetryPolicy);
            this.consumeRetryPolicy = consumeRetryPolicy;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
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
         * <p>Maximum received message tps</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder maxReceiveTps(Long maxReceiveTps) {
            this.putBodyParameter("maxReceiveTps", maxReceiveTps);
            this.maxReceiveTps = maxReceiveTps;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the remark for test.</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
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

        @com.aliyun.core.annotation.NameInMap("maxRetryTimes")
        private Integer maxRetryTimes;

        @com.aliyun.core.annotation.NameInMap("retryPolicy")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(ConsumeRetryPolicy model) {
                this.deadLetterTargetTopic = model.deadLetterTargetTopic;
                this.maxRetryTimes = model.maxRetryTimes;
                this.retryPolicy = model.retryPolicy;
            } 

            /**
             * <p>The dead-letter topic.</p>
             * <p>If a consumer still fails to consume a message after the message is retried for a specified number of times, the message is delivered to a dead-letter topic for subsequent business recovery or troubleshooting. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry and dead-letter messages</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>DLQ_mqtest</p>
             */
            public Builder deadLetterTargetTopic(String deadLetterTargetTopic) {
                this.deadLetterTargetTopic = deadLetterTargetTopic;
                return this;
            }

            /**
             * <p>The maximum number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxRetryTimes(Integer maxRetryTimes) {
                this.maxRetryTimes = maxRetryTimes;
                return this;
            }

            /**
             * <p>The retry policy. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Message retry</a>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>FixedRetryPolicy: Failed messages are retried at a fixed interval.</li>
             * <li>DefaultRetryPolicy: Failed messages are retried at incremental intervals as the number of retries increases.</li>
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
