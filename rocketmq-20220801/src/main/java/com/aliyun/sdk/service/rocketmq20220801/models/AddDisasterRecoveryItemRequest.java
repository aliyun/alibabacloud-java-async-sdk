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
 * {@link AddDisasterRecoveryItemRequest} extends {@link RequestModel}
 *
 * <p>AddDisasterRecoveryItemRequest</p>
 */
public class AddDisasterRecoveryItemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long planId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topics")
    private java.util.List<Topics> topics;

    private AddDisasterRecoveryItemRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.topics = builder.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDisasterRecoveryItemRequest create() {
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
     * @return topics
     */
    public java.util.List<Topics> getTopics() {
        return this.topics;
    }

    public static final class Builder extends Request.Builder<AddDisasterRecoveryItemRequest, Builder> {
        private Long planId; 
        private java.util.List<Topics> topics; 

        private Builder() {
            super();
        } 

        private Builder(AddDisasterRecoveryItemRequest request) {
            super(request);
            this.planId = request.planId;
            this.topics = request.topics;
        } 

        /**
         * <p>Backup plan ID</p>
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
         * <p>Topics included in the backup mapping. Required.</p>
         */
        public Builder topics(java.util.List<Topics> topics) {
            this.putBodyParameter("topics", topics);
            this.topics = topics;
            return this;
        }

        @Override
        public AddDisasterRecoveryItemRequest build() {
            return new AddDisasterRecoveryItemRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDisasterRecoveryItemRequest} extends {@link TeaModel}
     *
     * <p>AddDisasterRecoveryItemRequest</p>
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
             * <p>Consumer group ID, required for ACTIVE_ACTIVE bidirectional backup</p>
             * 
             * <strong>example:</strong>
             * <p>GID_xxx</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The order in which messages are delivered to the target instance. The parameter values ​​are as follows:</p>
             * <ul>
             * <li>Concurrently: concurrent delivery</li>
             * <li>Orderly: sequential delivery</li>
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
             * <p>Instance ID, an instance ID will be automatically generated when <code>instanceType</code> is <code>EXTERNAL_ROCKETMQ</code>, and it can be obtained by querying the backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-em93y94xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance type</p>
             * <ul>
             * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
             * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
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
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Disaster recovery topic name, required</p>
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
