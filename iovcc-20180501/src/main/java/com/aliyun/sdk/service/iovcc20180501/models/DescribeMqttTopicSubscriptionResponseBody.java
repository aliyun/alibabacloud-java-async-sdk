// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMqttTopicSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMqttTopicSubscriptionResponseBody</p>
 */
public class DescribeMqttTopicSubscriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Subscription")
    private Subscription subscription;

    private DescribeMqttTopicSubscriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subscription = builder.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMqttTopicSubscriptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscription
     */
    public Subscription getSubscription() {
        return this.subscription;
    }

    public static final class Builder {
        private String requestId; 
        private Subscription subscription; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Subscription.
         */
        public Builder subscription(Subscription subscription) {
            this.subscription = subscription;
            return this;
        }

        public DescribeMqttTopicSubscriptionResponseBody build() {
            return new DescribeMqttTopicSubscriptionResponseBody(this);
        } 

    } 

    public static class Subscription extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Topic")
        private String topic;

        private Subscription(Builder builder) {
            this.count = builder.count;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscription create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Integer count; 
            private String topic; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Subscription build() {
                return new Subscription(this);
            } 

        } 

    }
}
