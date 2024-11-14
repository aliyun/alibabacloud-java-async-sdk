// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMessageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessageResponseBody</p>
 */
public class QueryMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MessageList")
    private java.util.List < MessageList> messageList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The messages.</p>
         */
        public Builder messageList(java.util.List < MessageList> messageList) {
            this.messageList = messageList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABA4A7FD-E10F-45C7-9774-A5236015****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMessageResponseBody build() {
            return new QueryMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMessageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMessageResponseBody</p>
     */
    public static class MessageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checksum")
        private Long checksum;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyTruncated")
        private Boolean keyTruncated;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Long offset;

        @com.aliyun.core.annotation.NameInMap("Partition")
        private Long partition;

        @com.aliyun.core.annotation.NameInMap("SerializedKeySize")
        private Integer serializedKeySize;

        @com.aliyun.core.annotation.NameInMap("SerializedValueSize")
        private Integer serializedValueSize;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TimestampType")
        private String timestampType;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("TruncatedKeySize")
        private Integer truncatedKeySize;

        @com.aliyun.core.annotation.NameInMap("TruncatedValueSize")
        private Integer truncatedValueSize;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueTruncated")
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
             * <p>The check value of the chaincode.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder checksum(Long checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * <p>The message key.</p>
             * 
             * <strong>example:</strong>
             * <p>this is key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Indicates whether the key is truncated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder keyTruncated(Boolean keyTruncated) {
                this.keyTruncated = keyTruncated;
                return this;
            }

            /**
             * <p>The consumer offset of the partition.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder offset(Long offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The partition ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder partition(Long partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The size of the key after serialization. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder serializedKeySize(Integer serializedKeySize) {
                this.serializedKeySize = serializedKeySize;
                return this;
            }

            /**
             * <p>The size of the value after serialization. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder serializedValueSize(Integer serializedValueSize) {
                this.serializedValueSize = serializedValueSize;
                return this;
            }

            /**
             * <p>The time when the message was created. The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1705482172640</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The time type.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateTime</p>
             */
            public Builder timestampType(String timestampType) {
                this.timestampType = timestampType;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>dqc_test2</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The truncated size of the message key. Unit: bytes.</p>
             * <blockquote>
             * <p> A maximum of 1 KB of content can be displayed for each message. Content that exceeds 1 KB is automatically truncated. For more information, see <a href="https://help.aliyun.com/document_detail/113172.html">Query messages</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder truncatedKeySize(Integer truncatedKeySize) {
                this.truncatedKeySize = truncatedKeySize;
                return this;
            }

            /**
             * <p>The truncated size of the message value. Unit: bytes.</p>
             * <blockquote>
             * <p> A maximum of 1 KB of content can be displayed for each message. Content that exceeds 1 KB is automatically truncated. For more information, see <a href="https://help.aliyun.com/document_detail/113172.html">Query messages</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder truncatedValueSize(Integer truncatedValueSize) {
                this.truncatedValueSize = truncatedValueSize;
                return this;
            }

            /**
             * <p>The message value.</p>
             * 
             * <strong>example:</strong>
             * <p>Welcome to Ali kafka</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>Indicates whether the value is truncated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
