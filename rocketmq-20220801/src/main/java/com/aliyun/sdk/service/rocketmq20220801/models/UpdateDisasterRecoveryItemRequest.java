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
 * {@link UpdateDisasterRecoveryItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateDisasterRecoveryItemRequest</p>
 */
public class UpdateDisasterRecoveryItemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long planId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("itemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long itemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topics")
    private java.util.List<Topics> topics;

    private UpdateDisasterRecoveryItemRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.itemId = builder.itemId;
        this.topics = builder.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDisasterRecoveryItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return topics
     */
    public java.util.List<Topics> getTopics() {
        return this.topics;
    }

    public static final class Builder extends Request.Builder<UpdateDisasterRecoveryItemRequest, Builder> {
        private Long planId; 
        private Long itemId; 
        private java.util.List<Topics> topics; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDisasterRecoveryItemRequest request) {
            super(request);
            this.planId = request.planId;
            this.itemId = request.itemId;
            this.topics = request.topics;
        } 

        /**
         * <p>The ID of the global message backup plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1300000016</p>
         */
        public Builder planId(Long planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>The ID of the topic mapping.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100070284</p>
         */
        public Builder itemId(Long itemId) {
            this.putPathParameter("itemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>The topics involved in the topic mapping.</p>
         */
        public Builder topics(java.util.List<Topics> topics) {
            this.putBodyParameter("topics", topics);
            this.topics = topics;
            return this;
        }

        @Override
        public UpdateDisasterRecoveryItemRequest build() {
            return new UpdateDisasterRecoveryItemRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDisasterRecoveryItemRequest} extends {@link TeaModel}
     *
     * <p>UpdateDisasterRecoveryItemRequest</p>
     */
    public static class Topics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("deliveryOrderType")
        private String deliveryOrderType;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private Topics(Builder builder) {
            this.consumerGroupId = builder.consumerGroupId;
            this.deliveryOrderType = builder.deliveryOrderType;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topics create() {
            return builder().build();
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return deliveryOrderType
         */
        public String getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String consumerGroupId; 
            private String deliveryOrderType; 
            private String instanceId; 
            private String instanceType; 
            private String regionId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Topics model) {
                this.consumerGroupId = model.consumerGroupId;
                this.deliveryOrderType = model.deliveryOrderType;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.regionId = model.regionId;
                this.topicName = model.topicName;
            } 

            /**
             * <p>The ID of the consumer group. If you use the two-way backup mode, you must specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_xxx</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The method used to deliver messages to the destination instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Concurrently: concurrent delivery</li>
             * <li>Orderly: ordered delivery</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Concurrently</p>
             */
            public Builder deliveryOrderType(String deliveryOrderType) {
                this.deliveryOrderType = deliveryOrderType;
                return this;
            }

            /**
             * <p>The instance ID. If you set instanceType to EXTERNAL_ROCKETMQ, the system automatically generates an ID for the instance. You can obtain the ID by querying the global message backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-em93y94xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li>ALIYUN_ROCKETMQ: ApsaraMQ for RocketMQ instance</li>
             * <li>EXTERNAL_ROCKETMQ: open source RocketMQ cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_ROCKETMQ</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The topic name. You must specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Topic_xxx</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Topics build() {
                return new Topics(this);
            } 

        } 

    }
}
