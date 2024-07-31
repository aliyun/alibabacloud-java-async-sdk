// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueueAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueueAttributesResponseBody</p>
 */
public class GetQueueAttributesResponseBody extends TeaModel {
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

    private GetQueueAttributesResponseBody(Builder builder) {
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

    public static GetQueueAttributesResponseBody create() {
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
         * The response code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The response status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQueueAttributesResponseBody build() {
            return new GetQueueAttributesResponseBody(this);
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
        @com.aliyun.core.annotation.NameInMap("ActiveMessages")
        private Long activeMessages;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DelayMessages")
        private Long delayMessages;

        @com.aliyun.core.annotation.NameInMap("DelaySeconds")
        private Long delaySeconds;

        @com.aliyun.core.annotation.NameInMap("InactiveMessages")
        private Long inactiveMessages;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("LoggingEnabled")
        private Boolean loggingEnabled;

        @com.aliyun.core.annotation.NameInMap("MaximumMessageSize")
        private Long maximumMessageSize;

        @com.aliyun.core.annotation.NameInMap("MessageRetentionPeriod")
        private Long messageRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("PollingWaitSeconds")
        private Long pollingWaitSeconds;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VisibilityTimeout")
        private Long visibilityTimeout;

        private Data(Builder builder) {
            this.activeMessages = builder.activeMessages;
            this.createTime = builder.createTime;
            this.delayMessages = builder.delayMessages;
            this.delaySeconds = builder.delaySeconds;
            this.inactiveMessages = builder.inactiveMessages;
            this.lastModifyTime = builder.lastModifyTime;
            this.loggingEnabled = builder.loggingEnabled;
            this.maximumMessageSize = builder.maximumMessageSize;
            this.messageRetentionPeriod = builder.messageRetentionPeriod;
            this.pollingWaitSeconds = builder.pollingWaitSeconds;
            this.queueName = builder.queueName;
            this.tags = builder.tags;
            this.visibilityTimeout = builder.visibilityTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeMessages
         */
        public Long getActiveMessages() {
            return this.activeMessages;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delayMessages
         */
        public Long getDelayMessages() {
            return this.delayMessages;
        }

        /**
         * @return delaySeconds
         */
        public Long getDelaySeconds() {
            return this.delaySeconds;
        }

        /**
         * @return inactiveMessages
         */
        public Long getInactiveMessages() {
            return this.inactiveMessages;
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
         * @return maximumMessageSize
         */
        public Long getMaximumMessageSize() {
            return this.maximumMessageSize;
        }

        /**
         * @return messageRetentionPeriod
         */
        public Long getMessageRetentionPeriod() {
            return this.messageRetentionPeriod;
        }

        /**
         * @return pollingWaitSeconds
         */
        public Long getPollingWaitSeconds() {
            return this.pollingWaitSeconds;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return visibilityTimeout
         */
        public Long getVisibilityTimeout() {
            return this.visibilityTimeout;
        }

        public static final class Builder {
            private Long activeMessages; 
            private Long createTime; 
            private Long delayMessages; 
            private Long delaySeconds; 
            private Long inactiveMessages; 
            private Long lastModifyTime; 
            private Boolean loggingEnabled; 
            private Long maximumMessageSize; 
            private Long messageRetentionPeriod; 
            private Long pollingWaitSeconds; 
            private String queueName; 
            private java.util.List < Tags> tags; 
            private Long visibilityTimeout; 

            /**
             * The total number of messages that are in the Active state in the queue. The value is an approximate number.
             */
            public Builder activeMessages(Long activeMessages) {
                this.activeMessages = activeMessages;
                return this;
            }

            /**
             * The time when the queue was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The total number of the messages that are in the Delayed state in the queue. The value is an approximate number.
             */
            public Builder delayMessages(Long delayMessages) {
                this.delayMessages = delayMessages;
                return this;
            }

            /**
             * The period after which all messages sent to the queue are consumed. Unit: seconds.
             */
            public Builder delaySeconds(Long delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * The total number of the messages that are in the Inactive state in the queue. The value is an approximate number.
             */
            public Builder inactiveMessages(Long inactiveMessages) {
                this.inactiveMessages = inactiveMessages;
                return this;
            }

            /**
             * The time when the queue was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * Indicates whether the logging feature is enabled. Valid values:
             * <p>
             * 
             * *   True
             * *   False
             */
            public Builder loggingEnabled(Boolean loggingEnabled) {
                this.loggingEnabled = loggingEnabled;
                return this;
            }

            /**
             * The maximum length of the message that is sent to the queue. Unit: bytes.
             */
            public Builder maximumMessageSize(Long maximumMessageSize) {
                this.maximumMessageSize = maximumMessageSize;
                return this;
            }

            /**
             * The maximum duration for which a message is retained in the queue. After the specified retention period ends, the message is deleted regardless of whether the message is received. Unit: seconds.
             */
            public Builder messageRetentionPeriod(Long messageRetentionPeriod) {
                this.messageRetentionPeriod = messageRetentionPeriod;
                return this;
            }

            /**
             * The maximum duration for which long polling requests are held after the ReceiveMessage operation is called. Unit: seconds.
             */
            public Builder pollingWaitSeconds(Long pollingWaitSeconds) {
                this.pollingWaitSeconds = pollingWaitSeconds;
                return this;
            }

            /**
             * The name of the queue.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
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
             * The duration for which a message stays in the Inactive state after the message is received from the queue. Valid values: 1 to 43200. Unit: seconds. Default value: 30.
             */
            public Builder visibilityTimeout(Long visibilityTimeout) {
                this.visibilityTimeout = visibilityTimeout;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
