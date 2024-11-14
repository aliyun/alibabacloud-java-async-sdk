// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerProgressResponseBody</p>
 */
public class GetConsumerProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("ConsumerProgress")
    private ConsumerProgress consumerProgress;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The returned HTTP status code. If the request is successful, 200 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The consumer progress of the consumer group.</p>
         */
        public Builder consumerProgress(ConsumerProgress consumerProgress) {
            this.consumerProgress = consumerProgress;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>252820E1-A2E6-45F2-B4C9-1056B8CE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConsumerProgressResponseBody build() {
            return new GetConsumerProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerProgressResponseBody</p>
     */
    public static class RebalanceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Generation")
        private Long generation;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("LastRebalanceTimestamp")
        private Long lastRebalanceTimestamp;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RebalanceSuccess")
        private Boolean rebalanceSuccess;

        @com.aliyun.core.annotation.NameInMap("RebalanceTimeConsuming")
        private Long rebalanceTimeConsuming;

        private RebalanceInfoList(Builder builder) {
            this.generation = builder.generation;
            this.groupId = builder.groupId;
            this.lastRebalanceTimestamp = builder.lastRebalanceTimestamp;
            this.reason = builder.reason;
            this.rebalanceSuccess = builder.rebalanceSuccess;
            this.rebalanceTimeConsuming = builder.rebalanceTimeConsuming;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RebalanceInfoList create() {
            return builder().build();
        }

        /**
         * @return generation
         */
        public Long getGeneration() {
            return this.generation;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return lastRebalanceTimestamp
         */
        public Long getLastRebalanceTimestamp() {
            return this.lastRebalanceTimestamp;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return rebalanceSuccess
         */
        public Boolean getRebalanceSuccess() {
            return this.rebalanceSuccess;
        }

        /**
         * @return rebalanceTimeConsuming
         */
        public Long getRebalanceTimeConsuming() {
            return this.rebalanceTimeConsuming;
        }

        public static final class Builder {
            private Long generation; 
            private String groupId; 
            private Long lastRebalanceTimestamp; 
            private String reason; 
            private Boolean rebalanceSuccess; 
            private Long rebalanceTimeConsuming; 

            /**
             * <p>The number of rebalances.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder generation(Long generation) {
                this.generation = generation;
                return this;
            }

            /**
             * <p>The group ID of the subscriber.</p>
             * 
             * <strong>example:</strong>
             * <p>falcon-uat</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The time when the last rebalance occurred. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1709199270</p>
             */
            public Builder lastRebalanceTimestamp(Long lastRebalanceTimestamp) {
                this.lastRebalanceTimestamp = lastRebalanceTimestamp;
                return this;
            }

            /**
             * <p>The cause of the rebalance.</p>
             * 
             * <strong>example:</strong>
             * <p>removing member consumer-1-cd14eb9c-379b-4b8e-9bbd-76f147f8536f on LeaveGroup</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Indicates whether new members are added to the consumer group in the rebalance.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder rebalanceSuccess(Boolean rebalanceSuccess) {
                this.rebalanceSuccess = rebalanceSuccess;
                return this;
            }

            /**
             * <p>The duration of the rebalance. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rebalanceTimeConsuming(Long rebalanceTimeConsuming) {
                this.rebalanceTimeConsuming = rebalanceTimeConsuming;
                return this;
            }

            public RebalanceInfoList build() {
                return new RebalanceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerProgressResponseBody</p>
     */
    public static class ConsumerProgressRebalanceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RebalanceInfoList")
        private java.util.List < RebalanceInfoList> rebalanceInfoList;

        private ConsumerProgressRebalanceInfoList(Builder builder) {
            this.rebalanceInfoList = builder.rebalanceInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerProgressRebalanceInfoList create() {
            return builder().build();
        }

        /**
         * @return rebalanceInfoList
         */
        public java.util.List < RebalanceInfoList> getRebalanceInfoList() {
            return this.rebalanceInfoList;
        }

        public static final class Builder {
            private java.util.List < RebalanceInfoList> rebalanceInfoList; 

            /**
             * RebalanceInfoList.
             */
            public Builder rebalanceInfoList(java.util.List < RebalanceInfoList> rebalanceInfoList) {
                this.rebalanceInfoList = rebalanceInfoList;
                return this;
            }

            public ConsumerProgressRebalanceInfoList build() {
                return new ConsumerProgressRebalanceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerProgressResponseBody</p>
     */
    public static class OffsetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrokerOffset")
        private Long brokerOffset;

        @com.aliyun.core.annotation.NameInMap("ConsumerOffset")
        private Long consumerOffset;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Partition")
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
             * <p>The latest offset in the partition of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder brokerOffset(Long brokerOffset) {
                this.brokerOffset = brokerOffset;
                return this;
            }

            /**
             * <p>The consumer offset in the partition of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder consumerOffset(Long consumerOffset) {
                this.consumerOffset = consumerOffset;
                return this;
            }

            /**
             * <p>The time when the last consumed message in the partition was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1566874931649</p>
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The partition ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerProgressResponseBody</p>
     */
    public static class TopicListOffsetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OffsetList")
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
    /**
     * 
     * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerProgressResponseBody</p>
     */
    public static class TopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("OffsetList")
        private TopicListOffsetList offsetList;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("TotalDiff")
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
             * <p>The time when the last consumed message in the topic was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1566874931649</p>
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The consumer offsets.</p>
             */
            public Builder offsetList(TopicListOffsetList offsetList) {
                this.offsetList = offsetList;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>kafka-test</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The number of unconsumed messages in the topic to which the consumer group subscribes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerProgressResponseBody</p>
     */
    public static class ConsumerProgressTopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopicList")
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
    /**
     * 
     * {@link GetConsumerProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerProgressResponseBody</p>
     */
    public static class ConsumerProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("RebalanceInfoList")
        private ConsumerProgressRebalanceInfoList rebalanceInfoList;

        @com.aliyun.core.annotation.NameInMap("TopicList")
        private ConsumerProgressTopicList topicList;

        @com.aliyun.core.annotation.NameInMap("TotalDiff")
        private Long totalDiff;

        private ConsumerProgress(Builder builder) {
            this.lastTimestamp = builder.lastTimestamp;
            this.rebalanceInfoList = builder.rebalanceInfoList;
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
         * @return rebalanceInfoList
         */
        public ConsumerProgressRebalanceInfoList getRebalanceInfoList() {
            return this.rebalanceInfoList;
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
            private ConsumerProgressRebalanceInfoList rebalanceInfoList; 
            private ConsumerProgressTopicList topicList; 
            private Long totalDiff; 

            /**
             * <p>The time when the last message consumed by the consumer group was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1566874931671</p>
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The details of rebalances in the consumer group.</p>
             */
            public Builder rebalanceInfoList(ConsumerProgressRebalanceInfoList rebalanceInfoList) {
                this.rebalanceInfoList = rebalanceInfoList;
                return this;
            }

            /**
             * <p>The consumer progress of each topic to which the consumer group subscribes.</p>
             */
            public Builder topicList(ConsumerProgressTopicList topicList) {
                this.topicList = topicList;
                return this;
            }

            /**
             * <p>The total number of unconsumed messages in all topics to which the consumer group subscribes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
