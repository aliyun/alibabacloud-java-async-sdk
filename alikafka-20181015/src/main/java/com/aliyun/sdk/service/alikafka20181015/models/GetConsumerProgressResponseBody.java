// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20181015.models;

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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ConsumerProgress.
         */
        public Builder consumerProgress(ConsumerProgress consumerProgress) {
            this.consumerProgress = consumerProgress;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
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

        /**
         * Success.
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

            private Builder() {
            } 

            private Builder(OffsetList model) {
                this.brokerOffset = model.brokerOffset;
                this.consumerOffset = model.consumerOffset;
                this.lastTimestamp = model.lastTimestamp;
                this.partition = model.partition;
            } 

            /**
             * BrokerOffset.
             */
            public Builder brokerOffset(Long brokerOffset) {
                this.brokerOffset = brokerOffset;
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

        @com.aliyun.core.annotation.NameInMap("TopicList")
        private ConsumerProgressTopicList topicList;

        @com.aliyun.core.annotation.NameInMap("TotalDiff")
        private Long totalDiff;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private ConsumerProgress(Builder builder) {
            this.lastTimestamp = builder.lastTimestamp;
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
            private ConsumerProgressTopicList topicList; 
            private Long totalDiff; 
            private String state; 

            private Builder() {
            } 

            private Builder(ConsumerProgress model) {
                this.lastTimestamp = model.lastTimestamp;
                this.topicList = model.topicList;
                this.totalDiff = model.totalDiff;
                this.state = model.state;
            } 

            /**
             * LastTimestamp.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
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
             * TotalDiff.
             */
            public Builder totalDiff(Long totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            /**
             * state.
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
