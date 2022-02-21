// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMqttMessageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMqttMessageResponseBody</p>
 */
public class DescribeMqttMessageResponseBody extends TeaModel {
    @NameInMap("Message")
    private Message message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMqttMessageResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMqttMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Message message; 
        private String requestId; 

        /**
         * Message.
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMqttMessageResponseBody build() {
            return new DescribeMqttMessageResponseBody(this);
        } 

    } 

    public static class Message extends TeaModel {
        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("Mid")
        private String mid;

        @NameInMap("Payload")
        private String payload;

        @NameInMap("QoS")
        private Integer qoS;

        @NameInMap("Time")
        private Long time;

        @NameInMap("Topic")
        private String topic;

        private Message(Builder builder) {
            this.appKey = builder.appKey;
            this.mid = builder.mid;
            this.payload = builder.payload;
            this.qoS = builder.qoS;
            this.time = builder.time;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return mid
         */
        public String getMid() {
            return this.mid;
        }

        /**
         * @return payload
         */
        public String getPayload() {
            return this.payload;
        }

        /**
         * @return qoS
         */
        public Integer getQoS() {
            return this.qoS;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String appKey; 
            private String mid; 
            private String payload; 
            private Integer qoS; 
            private Long time; 
            private String topic; 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * Mid.
             */
            public Builder mid(String mid) {
                this.mid = mid;
                return this;
            }

            /**
             * Payload.
             */
            public Builder payload(String payload) {
                this.payload = payload;
                return this;
            }

            /**
             * QoS.
             */
            public Builder qoS(Integer qoS) {
                this.qoS = qoS;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
}
