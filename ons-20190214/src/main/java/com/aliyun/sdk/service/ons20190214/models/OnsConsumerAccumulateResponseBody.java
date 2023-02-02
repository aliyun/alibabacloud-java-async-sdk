// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerAccumulateResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerAccumulateResponseBody</p>
 */
public class OnsConsumerAccumulateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsConsumerAccumulateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerAccumulateResponseBody create() {
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
         * The information about message accumulation of topics to which the consumer group subscribes.
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

        public OnsConsumerAccumulateResponseBody build() {
            return new OnsConsumerAccumulateResponseBody(this);
        } 

    } 

    public static class DetailInTopicDo extends TeaModel {
        @NameInMap("DelayTime")
        private Long delayTime;

        @NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("TotalDiff")
        private Long totalDiff;

        private DetailInTopicDo(Builder builder) {
            this.delayTime = builder.delayTime;
            this.lastTimestamp = builder.lastTimestamp;
            this.topic = builder.topic;
            this.totalDiff = builder.totalDiff;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInTopicDo create() {
            return builder().build();
        }

        /**
         * @return delayTime
         */
        public Long getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return lastTimestamp
         */
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return totalDiff
         */
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public static final class Builder {
            private Long delayTime; 
            private Long lastTimestamp; 
            private String topic; 
            private Long totalDiff; 

            /**
             * The maximum latency of message consumption in the topic.
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * The point in time when the latest consumed message in the topic was produced.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * The name of the topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The number of accumulated messages in the topic.
             */
            public Builder totalDiff(Long totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            public DetailInTopicDo build() {
                return new DetailInTopicDo(this);
            } 

        } 

    }
    public static class DetailInTopicList extends TeaModel {
        @NameInMap("DetailInTopicDo")
        private java.util.List < DetailInTopicDo> detailInTopicDo;

        private DetailInTopicList(Builder builder) {
            this.detailInTopicDo = builder.detailInTopicDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInTopicList create() {
            return builder().build();
        }

        /**
         * @return detailInTopicDo
         */
        public java.util.List < DetailInTopicDo> getDetailInTopicDo() {
            return this.detailInTopicDo;
        }

        public static final class Builder {
            private java.util.List < DetailInTopicDo> detailInTopicDo; 

            /**
             * DetailInTopicDo.
             */
            public Builder detailInTopicDo(java.util.List < DetailInTopicDo> detailInTopicDo) {
                this.detailInTopicDo = detailInTopicDo;
                return this;
            }

            public DetailInTopicList build() {
                return new DetailInTopicList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ConsumeTps")
        private Float consumeTps;

        @NameInMap("DelayTime")
        private Long delayTime;

        @NameInMap("DetailInTopicList")
        private DetailInTopicList detailInTopicList;

        @NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("TotalDiff")
        private Long totalDiff;

        private Data(Builder builder) {
            this.consumeTps = builder.consumeTps;
            this.delayTime = builder.delayTime;
            this.detailInTopicList = builder.detailInTopicList;
            this.lastTimestamp = builder.lastTimestamp;
            this.online = builder.online;
            this.totalDiff = builder.totalDiff;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumeTps
         */
        public Float getConsumeTps() {
            return this.consumeTps;
        }

        /**
         * @return delayTime
         */
        public Long getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return detailInTopicList
         */
        public DetailInTopicList getDetailInTopicList() {
            return this.detailInTopicList;
        }

        /**
         * @return lastTimestamp
         */
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return totalDiff
         */
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public static final class Builder {
            private Float consumeTps; 
            private Long delayTime; 
            private DetailInTopicList detailInTopicList; 
            private Long lastTimestamp; 
            private Boolean online; 
            private Long totalDiff; 

            /**
             * The transactions per second (TPS) for message consumption performed by consumers in the group.
             */
            public Builder consumeTps(Float consumeTps) {
                this.consumeTps = consumeTps;
                return this;
            }

            /**
             * The consumption latency.
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * The information about each topic to which the consumer group subscribes. If the **Detail** parameter in the request is set to **false**, the value of this parameter is empty.
             */
            public Builder detailInTopicList(DetailInTopicList detailInTopicList) {
                this.detailInTopicList = detailInTopicList;
                return this;
            }

            /**
             * The point in time when the latest message that was consumed by a consumer in the consumer group was produced.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * Indicates whether the consumer group is online. The group is online if one of the consumers in the group is online. Valid values:
             * <p>
             * 
             * *   **true**: The consumer group is online.
             * *   **false**: The consumer group is offline.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * The total number of accumulated messages in all topics to which the consumer group subscribes.
             */
            public Builder totalDiff(Long totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
