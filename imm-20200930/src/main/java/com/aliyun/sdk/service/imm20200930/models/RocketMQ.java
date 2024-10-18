// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RocketMQ} extends {@link TeaModel}
 *
 * <p>RocketMQ</p>
 */
public class RocketMQ extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    private RocketMQ(Builder builder) {
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RocketMQ create() {
        return builder().build();
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

    public static final class Builder {
        private String instanceId; 
        private String topicName; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        public RocketMQ build() {
            return new RocketMQ(this);
        } 

    } 

}
