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

        private Builder() {
        } 

        private Builder(GetTopicStatusResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.topicStatus = model.topicStatus;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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

        /**
         * TopicStatus.
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

            private Builder() {
            } 

            private Builder(OffsetTable model) {
                this.lastUpdateTimestamp = model.lastUpdateTimestamp;
                this.maxOffset = model.maxOffset;
                this.minOffset = model.minOffset;
                this.partition = model.partition;
                this.topic = model.topic;
            } 

            /**
             * LastUpdateTimestamp.
             */
            public Builder lastUpdateTimestamp(Long lastUpdateTimestamp) {
                this.lastUpdateTimestamp = lastUpdateTimestamp;
                return this;
            }

            /**
             * MaxOffset.
             */
            public Builder maxOffset(Long maxOffset) {
                this.maxOffset = maxOffset;
                return this;
            }

            /**
             * MinOffset.
             */
            public Builder minOffset(Long minOffset) {
                this.minOffset = minOffset;
                return this;
            }

            /**
             * Partition.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * Topic.
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
        private java.util.List<OffsetTable> offsetTable;

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
        public java.util.List<OffsetTable> getOffsetTable() {
            return this.offsetTable;
        }

        public static final class Builder {
            private java.util.List<OffsetTable> offsetTable; 

            private Builder() {
            } 

            private Builder(TopicStatusOffsetTable model) {
                this.offsetTable = model.offsetTable;
            } 

            /**
             * OffsetTable.
             */
            public Builder offsetTable(java.util.List<OffsetTable> offsetTable) {
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

            private Builder() {
            } 

            private Builder(TopicStatus model) {
                this.lastTimeStamp = model.lastTimeStamp;
                this.offsetTable = model.offsetTable;
                this.totalCount = model.totalCount;
            } 

            /**
             * LastTimeStamp.
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * OffsetTable.
             */
            public Builder offsetTable(TopicStatusOffsetTable offsetTable) {
                this.offsetTable = offsetTable;
                return this;
            }

            /**
             * TotalCount.
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
