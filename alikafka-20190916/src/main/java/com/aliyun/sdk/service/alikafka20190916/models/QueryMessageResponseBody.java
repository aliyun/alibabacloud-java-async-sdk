// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMessageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessageResponseBody</p>
 */
public class QueryMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("MessageList")
    private java.util.List < MessageList> messageList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.messageList = builder.messageList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageResponseBody create() {
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
     * @return messageList
     */
    public java.util.List < MessageList> getMessageList() {
        return this.messageList;
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
        private String message; 
        private java.util.List < MessageList> messageList; 
        private String requestId; 
        private Boolean success; 

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
         * MessageList.
         */
        public Builder messageList(java.util.List < MessageList> messageList) {
            this.messageList = messageList;
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

        public QueryMessageResponseBody build() {
            return new QueryMessageResponseBody(this);
        } 

    } 

    public static class MessageList extends TeaModel {
        @NameInMap("Checksum")
        private Long checksum;

        @NameInMap("Key")
        private String key;

        @NameInMap("KeyTruncated")
        private Boolean keyTruncated;

        @NameInMap("Offset")
        private Long offset;

        @NameInMap("Partition")
        private Long partition;

        @NameInMap("SerializedKeySize")
        private Integer serializedKeySize;

        @NameInMap("SerializedValueSize")
        private Integer serializedValueSize;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("TimestampType")
        private String timestampType;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("TruncatedKeySize")
        private Integer truncatedKeySize;

        @NameInMap("TruncatedValueSize")
        private Integer truncatedValueSize;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueTruncated")
        private Boolean valueTruncated;

        private MessageList(Builder builder) {
            this.checksum = builder.checksum;
            this.key = builder.key;
            this.keyTruncated = builder.keyTruncated;
            this.offset = builder.offset;
            this.partition = builder.partition;
            this.serializedKeySize = builder.serializedKeySize;
            this.serializedValueSize = builder.serializedValueSize;
            this.timestamp = builder.timestamp;
            this.timestampType = builder.timestampType;
            this.topic = builder.topic;
            this.truncatedKeySize = builder.truncatedKeySize;
            this.truncatedValueSize = builder.truncatedValueSize;
            this.value = builder.value;
            this.valueTruncated = builder.valueTruncated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageList create() {
            return builder().build();
        }

        /**
         * @return checksum
         */
        public Long getChecksum() {
            return this.checksum;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyTruncated
         */
        public Boolean getKeyTruncated() {
            return this.keyTruncated;
        }

        /**
         * @return offset
         */
        public Long getOffset() {
            return this.offset;
        }

        /**
         * @return partition
         */
        public Long getPartition() {
            return this.partition;
        }

        /**
         * @return serializedKeySize
         */
        public Integer getSerializedKeySize() {
            return this.serializedKeySize;
        }

        /**
         * @return serializedValueSize
         */
        public Integer getSerializedValueSize() {
            return this.serializedValueSize;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return timestampType
         */
        public String getTimestampType() {
            return this.timestampType;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return truncatedKeySize
         */
        public Integer getTruncatedKeySize() {
            return this.truncatedKeySize;
        }

        /**
         * @return truncatedValueSize
         */
        public Integer getTruncatedValueSize() {
            return this.truncatedValueSize;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueTruncated
         */
        public Boolean getValueTruncated() {
            return this.valueTruncated;
        }

        public static final class Builder {
            private Long checksum; 
            private String key; 
            private Boolean keyTruncated; 
            private Long offset; 
            private Long partition; 
            private Integer serializedKeySize; 
            private Integer serializedValueSize; 
            private Long timestamp; 
            private String timestampType; 
            private String topic; 
            private Integer truncatedKeySize; 
            private Integer truncatedValueSize; 
            private String value; 
            private Boolean valueTruncated; 

            /**
             * Checksum.
             */
            public Builder checksum(Long checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * KeyTruncated.
             */
            public Builder keyTruncated(Boolean keyTruncated) {
                this.keyTruncated = keyTruncated;
                return this;
            }

            /**
             * Offset.
             */
            public Builder offset(Long offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Partition.
             */
            public Builder partition(Long partition) {
                this.partition = partition;
                return this;
            }

            /**
             * SerializedKeySize.
             */
            public Builder serializedKeySize(Integer serializedKeySize) {
                this.serializedKeySize = serializedKeySize;
                return this;
            }

            /**
             * SerializedValueSize.
             */
            public Builder serializedValueSize(Integer serializedValueSize) {
                this.serializedValueSize = serializedValueSize;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TimestampType.
             */
            public Builder timestampType(String timestampType) {
                this.timestampType = timestampType;
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
             * TruncatedKeySize.
             */
            public Builder truncatedKeySize(Integer truncatedKeySize) {
                this.truncatedKeySize = truncatedKeySize;
                return this;
            }

            /**
             * TruncatedValueSize.
             */
            public Builder truncatedValueSize(Integer truncatedValueSize) {
                this.truncatedValueSize = truncatedValueSize;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueTruncated.
             */
            public Builder valueTruncated(Boolean valueTruncated) {
                this.valueTruncated = valueTruncated;
                return this;
            }

            public MessageList build() {
                return new MessageList(this);
            } 

        } 

    }
}
