// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetConsumerProgressResponseBody model) {
            this.code = model.code;
            this.consumerProgress = model.consumerProgress;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The consumption status.</p>
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
         * <p>Indicates whether the call was successful.</p>
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

            private Builder() {
            } 

            private Builder(RebalanceInfoList model) {
                this.generation = model.generation;
                this.groupId = model.groupId;
                this.lastRebalanceTimestamp = model.lastRebalanceTimestamp;
                this.reason = model.reason;
                this.rebalanceSuccess = model.rebalanceSuccess;
                this.rebalanceTimeConsuming = model.rebalanceTimeConsuming;
            } 

            /**
             * Generation.
             */
            public Builder generation(Long generation) {
                this.generation = generation;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * LastRebalanceTimestamp.
             */
            public Builder lastRebalanceTimestamp(Long lastRebalanceTimestamp) {
                this.lastRebalanceTimestamp = lastRebalanceTimestamp;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * RebalanceSuccess.
             */
            public Builder rebalanceSuccess(Boolean rebalanceSuccess) {
                this.rebalanceSuccess = rebalanceSuccess;
                return this;
            }

            /**
             * RebalanceTimeConsuming.
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
        private java.util.List<RebalanceInfoList> rebalanceInfoList;

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
        public java.util.List<RebalanceInfoList> getRebalanceInfoList() {
            return this.rebalanceInfoList;
        }

        public static final class Builder {
            private java.util.List<RebalanceInfoList> rebalanceInfoList; 

            private Builder() {
            } 

            private Builder(ConsumerProgressRebalanceInfoList model) {
                this.rebalanceInfoList = model.rebalanceInfoList;
            } 

            /**
             * RebalanceInfoList.
             */
            public Builder rebalanceInfoList(java.util.List<RebalanceInfoList> rebalanceInfoList) {
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
        @com.aliyun.core.annotation.NameInMap("Accumulate")
        private Long accumulate;

        @com.aliyun.core.annotation.NameInMap("BrokerOffset")
        private Long brokerOffset;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ConsumerOffset")
        private Long consumerOffset;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("Partition")
        private Integer partition;

        private OffsetList(Builder builder) {
            this.accumulate = builder.accumulate;
            this.brokerOffset = builder.brokerOffset;
            this.clientId = builder.clientId;
            this.clientIp = builder.clientIp;
            this.consumerOffset = builder.consumerOffset;
            this.lastTimestamp = builder.lastTimestamp;
            this.memberId = builder.memberId;
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OffsetList create() {
            return builder().build();
        }

        /**
         * @return accumulate
         */
        public Long getAccumulate() {
            return this.accumulate;
        }

        /**
         * @return brokerOffset
         */
        public Long getBrokerOffset() {
            return this.brokerOffset;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
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
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private Long accumulate; 
            private Long brokerOffset; 
            private String clientId; 
            private String clientIp; 
            private Long consumerOffset; 
            private Long lastTimestamp; 
            private String memberId; 
            private Integer partition; 

            private Builder() {
            } 

            private Builder(OffsetList model) {
                this.accumulate = model.accumulate;
                this.brokerOffset = model.brokerOffset;
                this.clientId = model.clientId;
                this.clientIp = model.clientIp;
                this.consumerOffset = model.consumerOffset;
                this.lastTimestamp = model.lastTimestamp;
                this.memberId = model.memberId;
                this.partition = model.partition;
            } 

            /**
             * Accumulate.
             */
            public Builder accumulate(Long accumulate) {
                this.accumulate = accumulate;
                return this;
            }

            /**
             * BrokerOffset.
             */
            public Builder brokerOffset(Long brokerOffset) {
                this.brokerOffset = brokerOffset;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * ConsumerOffset.
             */
            public Builder consumerOffset(Long consumerOffset) {
                this.consumerOffset = consumerOffset;
                return this;
            }

            /**
             * LastTimestamp.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * Partition.
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
        private java.util.List<OffsetList> offsetList;

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
        public java.util.List<OffsetList> getOffsetList() {
            return this.offsetList;
        }

        public static final class Builder {
            private java.util.List<OffsetList> offsetList; 

            private Builder() {
            } 

            private Builder(TopicListOffsetList model) {
                this.offsetList = model.offsetList;
            } 

            /**
             * OffsetList.
             */
            public Builder offsetList(java.util.List<OffsetList> offsetList) {
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

            private Builder() {
            } 

            private Builder(TopicList model) {
                this.lastTimestamp = model.lastTimestamp;
                this.offsetList = model.offsetList;
                this.topic = model.topic;
                this.totalDiff = model.totalDiff;
            } 

            /**
             * LastTimestamp.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * OffsetList.
             */
            public Builder offsetList(TopicListOffsetList offsetList) {
                this.offsetList = offsetList;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * TotalDiff.
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
        private java.util.List<TopicList> topicList;

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
        public java.util.List<TopicList> getTopicList() {
            return this.topicList;
        }

        public static final class Builder {
            private java.util.List<TopicList> topicList; 

            private Builder() {
            } 

            private Builder(ConsumerProgressTopicList model) {
                this.topicList = model.topicList;
            } 

            /**
             * TopicList.
             */
            public Builder topicList(java.util.List<TopicList> topicList) {
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

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private ConsumerProgress(Builder builder) {
            this.lastTimestamp = builder.lastTimestamp;
            this.rebalanceInfoList = builder.rebalanceInfoList;
            this.topicList = builder.topicList;
            this.totalDiff = builder.totalDiff;
            this.state = builder.state;
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

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long lastTimestamp; 
            private ConsumerProgressRebalanceInfoList rebalanceInfoList; 
            private ConsumerProgressTopicList topicList; 
            private Long totalDiff; 
            private String state; 

            private Builder() {
            } 

            private Builder(ConsumerProgress model) {
                this.lastTimestamp = model.lastTimestamp;
                this.rebalanceInfoList = model.rebalanceInfoList;
                this.topicList = model.topicList;
                this.totalDiff = model.totalDiff;
                this.state = model.state;
            } 

            /**
             * <p>The maximum storage time of the message data corresponding to all consumer offsets of the consumer group.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is not supported for all topic types in serverless instances or for topics of the local storage type in reserved instances. The value is uniformly returned as -1.</li>
             * <li>For topics of the cloud storage type in reserved instances, the creation timestamp of the corresponding message is returned only after a consumer group created through the console or API operations submits a consumer offset. If the corresponding message does not have a creation timestamp, -1 is returned.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1566874931649</p>
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * RebalanceInfoList.
             */
            public Builder rebalanceInfoList(ConsumerProgressRebalanceInfoList rebalanceInfoList) {
                this.rebalanceInfoList = rebalanceInfoList;
                return this;
            }

            /**
             * TopicList.
             */
            public Builder topicList(ConsumerProgressTopicList topicList) {
                this.topicList = topicList;
                return this;
            }

            /**
             * <p>The total number of unconsumed messages for all topics, which is the message accumulation.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalDiff(Long totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            /**
             * <p>The consumption status of the consumer group. Valid values:</p>
             * <ul>
             * <li>UNKNOWN</li>
             * <li>PREPARING_REBALANCE</li>
             * <li>COMPLETING_REBALANCE</li>
             * <li>STABLE</li>
             * <li>DEAD</li>
             * <li>EMPTY</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STABLE</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public ConsumerProgress build() {
                return new ConsumerProgress(this);
            } 

        } 

    }
}
