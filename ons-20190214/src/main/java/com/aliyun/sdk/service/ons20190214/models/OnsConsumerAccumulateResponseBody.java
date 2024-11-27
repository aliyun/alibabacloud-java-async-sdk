// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsConsumerAccumulateResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerAccumulateResponseBody</p>
 */
public class OnsConsumerAccumulateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The message accumulation information about topics to which the specified consumer subscribes.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CE817BFF-B389-43CD-9419-95011AC9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsConsumerAccumulateResponseBody build() {
            return new OnsConsumerAccumulateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsConsumerAccumulateResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerAccumulateResponseBody</p>
     */
    public static class DetailInTopicDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Long delayTime;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("TotalDiff")
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
             * <p>The maximum latency of message consumption in the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * <p>The point in time when the latest consumed message in the topic was produced.</p>
             * 
             * <strong>example:</strong>
             * <p>1566231000000</p>
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-mq-topic</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The number of accumulated messages in the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link OnsConsumerAccumulateResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerAccumulateResponseBody</p>
     */
    public static class DetailInTopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailInTopicDo")
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
    /**
     * 
     * {@link OnsConsumerAccumulateResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerAccumulateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeTps")
        private Float consumeTps;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Long delayTime;

        @com.aliyun.core.annotation.NameInMap("DetailInTopicList")
        private DetailInTopicList detailInTopicList;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("TotalDiff")
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
             * <p>The transactions per second (TPS) for message consumption performed by consumers in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder consumeTps(Float consumeTps) {
                this.consumeTps = consumeTps;
                return this;
            }

            /**
             * <p>The consumption latency.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * <p>The information about each topic to which the consumer group subscribes. If the <strong>Detail</strong> parameter in the request is set to <strong>false</strong>, the value of this parameter is empty.</p>
             */
            public Builder detailInTopicList(DetailInTopicList detailInTopicList) {
                this.detailInTopicList = detailInTopicList;
                return this;
            }

            /**
             * <p>The point in time when the latest message consumed by a consumer in the consumer group was produced.</p>
             * 
             * <strong>example:</strong>
             * <p>1566231000000</p>
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>Indicates whether the consumer group is online. The consumer group is online if one of the consumers in the group is online. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The consumer group is online.</li>
             * <li><strong>false</strong>: The consumer group is offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The total number of accumulated messages in all topics to which the consumer group subscribes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
