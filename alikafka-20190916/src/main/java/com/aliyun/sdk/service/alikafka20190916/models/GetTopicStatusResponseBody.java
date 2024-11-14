// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTopicStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicStatusResponseBody</p>
 */
public class GetTopicStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicStatus")
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
         * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E475C7E2-8C35-46EF-BE7D-5D2A9F5D****</p>
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

        /**
         * <p>The status information about messages in the topic.</p>
         */
        public Builder topicStatus(TopicStatus topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }

        public GetTopicStatusResponseBody build() {
            return new GetTopicStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTopicStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicStatusResponseBody</p>
     */
    public static class OffsetTable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastUpdateTimestamp")
        private Long lastUpdateTimestamp;

        @com.aliyun.core.annotation.NameInMap("MaxOffset")
        private Long maxOffset;

        @com.aliyun.core.annotation.NameInMap("MinOffset")
        private Long minOffset;

        @com.aliyun.core.annotation.NameInMap("Partition")
        private Integer partition;

        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * <p>The last time when the partition was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1566470063547</p>
             */
            public Builder lastUpdateTimestamp(Long lastUpdateTimestamp) {
                this.lastUpdateTimestamp = lastUpdateTimestamp;
                return this;
            }

            /**
             * <p>The latest offset in the partition of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>76</p>
             */
            public Builder maxOffset(Long maxOffset) {
                this.maxOffset = maxOffset;
                return this;
            }

            /**
             * <p>The earliest offset in the partition of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minOffset(Long minOffset) {
                this.minOffset = minOffset;
                return this;
            }

            /**
             * <p>The ID of the partition.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The name of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>testkafka</p>
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
    /**
     * 
     * {@link GetTopicStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicStatusResponseBody</p>
     */
    public static class TopicStatusOffsetTable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OffsetTable")
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
    /**
     * 
     * {@link GetTopicStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicStatusResponseBody</p>
     */
    public static class TopicStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @com.aliyun.core.annotation.NameInMap("OffsetTable")
        private TopicStatusOffsetTable offsetTable;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The time when the last consumed message was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1566470063575</p>
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * <p>The information about offsets in the topic.</p>
             */
            public Builder offsetTable(TopicStatusOffsetTable offsetTable) {
                this.offsetTable = offsetTable;
                return this;
            }

            /**
             * <p>The number of messages in the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>423</p>
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
