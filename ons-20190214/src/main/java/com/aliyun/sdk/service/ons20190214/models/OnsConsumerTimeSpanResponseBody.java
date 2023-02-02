// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerTimeSpanResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerTimeSpanResponseBody</p>
 */
public class OnsConsumerTimeSpanResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsConsumerTimeSpanResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerTimeSpanResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The query results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsConsumerTimeSpanResponseBody build() {
            return new OnsConsumerTimeSpanResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ConsumeTimeStamp")
        private Long consumeTimeStamp;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaxTimeStamp")
        private Long maxTimeStamp;

        @NameInMap("MinTimeStamp")
        private Long minTimeStamp;

        @NameInMap("Topic")
        private String topic;

        private Data(Builder builder) {
            this.consumeTimeStamp = builder.consumeTimeStamp;
            this.instanceId = builder.instanceId;
            this.maxTimeStamp = builder.maxTimeStamp;
            this.minTimeStamp = builder.minTimeStamp;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumeTimeStamp
         */
        public Long getConsumeTimeStamp() {
            return this.consumeTimeStamp;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxTimeStamp
         */
        public Long getMaxTimeStamp() {
            return this.maxTimeStamp;
        }

        /**
         * @return minTimeStamp
         */
        public Long getMinTimeStamp() {
            return this.minTimeStamp;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Long consumeTimeStamp; 
            private String instanceId; 
            private Long maxTimeStamp; 
            private Long minTimeStamp; 
            private String topic; 

            /**
             * The most recent point in time when a message in the topic was consumed by the customer group.
             */
            public Builder consumeTimeStamp(Long consumeTimeStamp) {
                this.consumeTimeStamp = consumeTimeStamp;
                return this;
            }

            /**
             * The ID of the instance to which the consumer group belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The earliest point in time when a message was published to the topic.
             */
            public Builder maxTimeStamp(Long maxTimeStamp) {
                this.maxTimeStamp = maxTimeStamp;
                return this;
            }

            /**
             * The most recent point in time when a message was published to the topic.
             */
            public Builder minTimeStamp(Long minTimeStamp) {
                this.minTimeStamp = minTimeStamp;
                return this;
            }

            /**
             * The name of the topic that you want to query.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
