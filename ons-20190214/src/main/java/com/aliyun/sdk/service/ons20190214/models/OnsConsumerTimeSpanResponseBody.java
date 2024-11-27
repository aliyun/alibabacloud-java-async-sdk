// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsConsumerTimeSpanResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerTimeSpanResponseBody</p>
 */
public class OnsConsumerTimeSpanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A07E3902-B92E-44A6-B6C5-6AA111111****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsConsumerTimeSpanResponseBody build() {
            return new OnsConsumerTimeSpanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsConsumerTimeSpanResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerTimeSpanResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeTimeStamp")
        private Long consumeTimeStamp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaxTimeStamp")
        private Long maxTimeStamp;

        @com.aliyun.core.annotation.NameInMap("MinTimeStamp")
        private Long minTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * <p>The most recent point in time when a message in the topic was consumed by the customer group.</p>
             * 
             * <strong>example:</strong>
             * <p>1570761026400</p>
             */
            public Builder consumeTimeStamp(Long consumeTimeStamp) {
                this.consumeTimeStamp = consumeTimeStamp;
                return this;
            }

            /**
             * <p>The ID of the instance to which the consumer group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_111111111111_DOxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The point in time when the earliest stored message was published to the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>1570761026804</p>
             */
            public Builder maxTimeStamp(Long maxTimeStamp) {
                this.maxTimeStamp = maxTimeStamp;
                return this;
            }

            /**
             * <p>The point in time when the most recently stored message was published to the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>1570701231122</p>
             */
            public Builder minTimeStamp(Long minTimeStamp) {
                this.minTimeStamp = minTimeStamp;
                return this;
            }

            /**
             * <p>The name of the topic that you want to query.</p>
             * 
             * <strong>example:</strong>
             * <p>test-mq_topic</p>
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
