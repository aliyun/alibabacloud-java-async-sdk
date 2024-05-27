// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicAttributesResponseBody</p>
 */
public class GetTopicAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTopicAttributesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTopicAttributesResponseBody build() {
            return new GetTopicAttributesResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("LoggingEnabled")
        private Boolean loggingEnabled;

        @com.aliyun.core.annotation.NameInMap("MaxMessageSize")
        private Long maxMessageSize;

        @com.aliyun.core.annotation.NameInMap("MessageCount")
        private Long messageCount;

        @com.aliyun.core.annotation.NameInMap("MessageRetentionPeriod")
        private Long messageRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.loggingEnabled = builder.loggingEnabled;
            this.maxMessageSize = builder.maxMessageSize;
            this.messageCount = builder.messageCount;
            this.messageRetentionPeriod = builder.messageRetentionPeriod;
            this.tags = builder.tags;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastModifyTime
         */
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return loggingEnabled
         */
        public Boolean getLoggingEnabled() {
            return this.loggingEnabled;
        }

        /**
         * @return maxMessageSize
         */
        public Long getMaxMessageSize() {
            return this.maxMessageSize;
        }

        /**
         * @return messageCount
         */
        public Long getMessageCount() {
            return this.messageCount;
        }

        /**
         * @return messageRetentionPeriod
         */
        public Long getMessageRetentionPeriod() {
            return this.messageRetentionPeriod;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Long createTime; 
            private Long lastModifyTime; 
            private Boolean loggingEnabled; 
            private Long maxMessageSize; 
            private Long messageCount; 
            private Long messageRetentionPeriod; 
            private java.util.List < Tags> tags; 
            private String topicName; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * LoggingEnabled.
             */
            public Builder loggingEnabled(Boolean loggingEnabled) {
                this.loggingEnabled = loggingEnabled;
                return this;
            }

            /**
             * MaxMessageSize.
             */
            public Builder maxMessageSize(Long maxMessageSize) {
                this.maxMessageSize = maxMessageSize;
                return this;
            }

            /**
             * MessageCount.
             */
            public Builder messageCount(Long messageCount) {
                this.messageCount = messageCount;
                return this;
            }

            /**
             * MessageRetentionPeriod.
             */
            public Builder messageRetentionPeriod(Long messageRetentionPeriod) {
                this.messageRetentionPeriod = messageRetentionPeriod;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
