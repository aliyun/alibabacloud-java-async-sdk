// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicStatusResponseBody</p>
 */
public class GetTopicStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TopicStatus")
    private TopicStatus topicStatus;

    private GetTopicStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topicStatus = builder.topicStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    /**
     * @return topicStatus
     */
    public TopicStatus getTopicStatus() {
        return this.topicStatus;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TopicStatus topicStatus; 

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
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

        /**
         * The status information about messages in the topic.
         */
        public Builder topicStatus(TopicStatus topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }

        public GetTopicStatusResponseBody build() {
            return new GetTopicStatusResponseBody(this);
        } 

    } 

    public static class OffsetTable extends TeaModel {
        @NameInMap("LastUpdateTimestamp")
        private Long lastUpdateTimestamp;

        @NameInMap("MaxOffset")
        private Long maxOffset;

        @NameInMap("MinOffset")
        private Long minOffset;

        @NameInMap("Partition")
        private Integer partition;

        @NameInMap("Topic")
        private String topic;

        private OffsetTable(Builder builder) {
            this.lastUpdateTimestamp = builder.lastUpdateTimestamp;
            this.maxOffset = builder.maxOffset;
            this.minOffset = builder.minOffset;
            this.partition = builder.partition;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OffsetTable create() {
            return builder().build();
        }

        /**
         * @return lastUpdateTimestamp
         */
        public Long getLastUpdateTimestamp() {
            return this.lastUpdateTimestamp;
        }

        /**
         * @return maxOffset
         */
        public Long getMaxOffset() {
            return this.maxOffset;
        }

        /**
         * @return minOffset
         */
        public Long getMinOffset() {
            return this.minOffset;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Long lastUpdateTimestamp; 
            private Long maxOffset; 
            private Long minOffset; 
            private Integer partition; 
            private String topic; 

            /**
             * The last time when the partition was modified.
             */
            public Builder lastUpdateTimestamp(Long lastUpdateTimestamp) {
                this.lastUpdateTimestamp = lastUpdateTimestamp;
                return this;
            }

            /**
             * The latest offset in the partition of the topic.
             */
            public Builder maxOffset(Long maxOffset) {
                this.maxOffset = maxOffset;
                return this;
            }

            /**
             * The earliest offset in the partition of the topic.
             */
            public Builder minOffset(Long minOffset) {
                this.minOffset = minOffset;
                return this;
            }

            /**
             * The ID of the partition.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The name of the topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public OffsetTable build() {
                return new OffsetTable(this);
            } 

        } 

    }
    public static class TopicStatusOffsetTable extends TeaModel {
        @NameInMap("OffsetTable")
        private java.util.List < OffsetTable> offsetTable;

        private TopicStatusOffsetTable(Builder builder) {
            this.offsetTable = builder.offsetTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicStatusOffsetTable create() {
            return builder().build();
        }

        /**
         * @return offsetTable
         */
        public java.util.List < OffsetTable> getOffsetTable() {
            return this.offsetTable;
        }

        public static final class Builder {
            private java.util.List < OffsetTable> offsetTable; 

            /**
             * OffsetTable.
             */
            public Builder offsetTable(java.util.List < OffsetTable> offsetTable) {
                this.offsetTable = offsetTable;
                return this;
            }

            public TopicStatusOffsetTable build() {
                return new TopicStatusOffsetTable(this);
            } 

        } 

    }
    public static class TopicStatus extends TeaModel {
        @NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @NameInMap("OffsetTable")
        private TopicStatusOffsetTable offsetTable;

        @NameInMap("TotalCount")
        private Long totalCount;

        private TopicStatus(Builder builder) {
            this.lastTimeStamp = builder.lastTimeStamp;
            this.offsetTable = builder.offsetTable;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicStatus create() {
            return builder().build();
        }

        /**
         * @return lastTimeStamp
         */
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        /**
         * @return offsetTable
         */
        public TopicStatusOffsetTable getOffsetTable() {
            return this.offsetTable;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long lastTimeStamp; 
            private TopicStatusOffsetTable offsetTable; 
            private Long totalCount; 

            /**
             * The time when the last consumed message was generated.
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * The information about offsets in the topic.
             */
            public Builder offsetTable(TopicStatusOffsetTable offsetTable) {
                this.offsetTable = offsetTable;
                return this;
            }

            /**
             * The number of messages in the topic.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public TopicStatus build() {
                return new TopicStatus(this);
            } 

        } 

    }
}
