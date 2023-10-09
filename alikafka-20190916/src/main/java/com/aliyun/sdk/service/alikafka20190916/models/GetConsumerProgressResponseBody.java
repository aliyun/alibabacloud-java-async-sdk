// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerProgressResponseBody</p>
 */
public class GetConsumerProgressResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ConsumerProgress")
    private ConsumerProgress consumerProgress;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetConsumerProgressResponseBody(Builder builder) {
        this.code = builder.code;
        this.consumerProgress = builder.consumerProgress;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerProgressResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return consumerProgress
     */
    public ConsumerProgress getConsumerProgress() {
        return this.consumerProgress;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private ConsumerProgress consumerProgress; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The consumption status of the consumer group.
         */
        public Builder consumerProgress(ConsumerProgress consumerProgress) {
            this.consumerProgress = consumerProgress;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConsumerProgressResponseBody build() {
            return new GetConsumerProgressResponseBody(this);
        } 

    } 

    public static class OffsetList extends TeaModel {
        @NameInMap("BrokerOffset")
        private Long brokerOffset;

        @NameInMap("ConsumerOffset")
        private Long consumerOffset;

        @NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @NameInMap("Partition")
        private Integer partition;

        private OffsetList(Builder builder) {
            this.brokerOffset = builder.brokerOffset;
            this.consumerOffset = builder.consumerOffset;
            this.lastTimestamp = builder.lastTimestamp;
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OffsetList create() {
            return builder().build();
        }

        /**
         * @return brokerOffset
         */
        public Long getBrokerOffset() {
            return this.brokerOffset;
        }

        /**
         * @return consumerOffset
         */
        public Long getConsumerOffset() {
            return this.consumerOffset;
        }

        /**
         * @return lastTimestamp
         */
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private Long brokerOffset; 
            private Long consumerOffset; 
            private Long lastTimestamp; 
            private Integer partition; 

            /**
             * The latest offset in the partition of the topic.
             */
            public Builder brokerOffset(Long brokerOffset) {
                this.brokerOffset = brokerOffset;
                return this;
            }

            /**
             * The consumer offset in the partition of the topic.
             */
            public Builder consumerOffset(Long consumerOffset) {
                this.consumerOffset = consumerOffset;
                return this;
            }

            /**
             * The time when the last consumed message in the partition was generated.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * The ID of the partition.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            public OffsetList build() {
                return new OffsetList(this);
            } 

        } 

    }
    public static class TopicListOffsetList extends TeaModel {
        @NameInMap("OffsetList")
        private java.util.List < OffsetList> offsetList;

        private TopicListOffsetList(Builder builder) {
            this.offsetList = builder.offsetList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicListOffsetList create() {
            return builder().build();
        }

        /**
         * @return offsetList
         */
        public java.util.List < OffsetList> getOffsetList() {
            return this.offsetList;
        }

        public static final class Builder {
            private java.util.List < OffsetList> offsetList; 

            /**
             * OffsetList.
             */
            public Builder offsetList(java.util.List < OffsetList> offsetList) {
                this.offsetList = offsetList;
                return this;
            }

            public TopicListOffsetList build() {
                return new TopicListOffsetList(this);
            } 

        } 

    }
    public static class TopicList extends TeaModel {
        @NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @NameInMap("OffsetList")
        private TopicListOffsetList offsetList;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("TotalDiff")
        private Long totalDiff;

        private TopicList(Builder builder) {
            this.lastTimestamp = builder.lastTimestamp;
            this.offsetList = builder.offsetList;
            this.topic = builder.topic;
            this.totalDiff = builder.totalDiff;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicList create() {
            return builder().build();
        }

        /**
         * @return lastTimestamp
         */
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return offsetList
         */
        public TopicListOffsetList getOffsetList() {
            return this.offsetList;
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
            private Long lastTimestamp; 
            private TopicListOffsetList offsetList; 
            private String topic; 
            private Long totalDiff; 

            /**
             * The time when the last consumed message in the topic was generated.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * The information about offsets in the topic.
             */
            public Builder offsetList(TopicListOffsetList offsetList) {
                this.offsetList = offsetList;
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
             * The number of messages that were not consumed in the topic. This is also known as the number of accumulated messages in the topic.
             */
            public Builder totalDiff(Long totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            public TopicList build() {
                return new TopicList(this);
            } 

        } 

    }
    public static class ConsumerProgressTopicList extends TeaModel {
        @NameInMap("TopicList")
        private java.util.List < TopicList> topicList;

        private ConsumerProgressTopicList(Builder builder) {
            this.topicList = builder.topicList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerProgressTopicList create() {
            return builder().build();
        }

        /**
         * @return topicList
         */
        public java.util.List < TopicList> getTopicList() {
            return this.topicList;
        }

        public static final class Builder {
            private java.util.List < TopicList> topicList; 

            /**
             * TopicList.
             */
            public Builder topicList(java.util.List < TopicList> topicList) {
                this.topicList = topicList;
                return this;
            }

            public ConsumerProgressTopicList build() {
                return new ConsumerProgressTopicList(this);
            } 

        } 

    }
    public static class ConsumerProgress extends TeaModel {
        @NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @NameInMap("TopicList")
        private ConsumerProgressTopicList topicList;

        @NameInMap("TotalDiff")
        private Long totalDiff;

        private ConsumerProgress(Builder builder) {
            this.lastTimestamp = builder.lastTimestamp;
            this.topicList = builder.topicList;
            this.totalDiff = builder.totalDiff;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerProgress create() {
            return builder().build();
        }

        /**
         * @return lastTimestamp
         */
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return topicList
         */
        public ConsumerProgressTopicList getTopicList() {
            return this.topicList;
        }

        /**
         * @return totalDiff
         */
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public static final class Builder {
            private Long lastTimestamp; 
            private ConsumerProgressTopicList topicList; 
            private Long totalDiff; 

            /**
             * The time when the last message consumed by the consumer group was generated.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * The consumption progress of each topic to which the consumer group is subscribed.
             */
            public Builder topicList(ConsumerProgressTopicList topicList) {
                this.topicList = topicList;
                return this;
            }

            /**
             * The number of messages that were not consumed in all topics. This is also known as the number of accumulated messages in all topics.
             */
            public Builder totalDiff(Long totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            public ConsumerProgress build() {
                return new ConsumerProgress(this);
            } 

        } 

    }
}
