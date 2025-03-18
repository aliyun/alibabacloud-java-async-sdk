// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetQueueAttributesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06273500-249F-5863-121D-74D51123****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQueueAttributesResponseBody build() {
            return new GetQueueAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQueueAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueueAttributesResponseBody</p>
     */
    public static class DlqPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadLetterTargetQueue")
        private String deadLetterTargetQueue;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MaxReceiveCount")
        private String maxReceiveCount;

        private DlqPolicy(Builder builder) {
            this.deadLetterTargetQueue = builder.deadLetterTargetQueue;
            this.enabled = builder.enabled;
            this.maxReceiveCount = builder.maxReceiveCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlqPolicy create() {
            return builder().build();
        }

        /**
         * @return deadLetterTargetQueue
         */
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxReceiveCount
         */
        public String getMaxReceiveCount() {
            return this.maxReceiveCount;
        }

        public static final class Builder {
            private String deadLetterTargetQueue; 
            private Boolean enabled; 
            private String maxReceiveCount; 

            private Builder() {
            } 

            private Builder(DlqPolicy model) {
                this.deadLetterTargetQueue = model.deadLetterTargetQueue;
                this.enabled = model.enabled;
                this.maxReceiveCount = model.maxReceiveCount;
            } 

            /**
             * <p>The queue to which dead-letter messages are delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>deadLetterTargetQueue</p>
             */
            public Builder deadLetterTargetQueue(String deadLetterTargetQueue) {
                this.deadLetterTargetQueue = deadLetterTargetQueue;
                return this;
            }

            /**
             * <p>Specifies whether to enable the dead-letter message delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxReceiveCount(String maxReceiveCount) {
                this.maxReceiveCount = maxReceiveCount;
                return this;
            }

            public DlqPolicy build() {
                return new DlqPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQueueAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueueAttributesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link GetQueueAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueueAttributesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveMessages")
        private Long activeMessages;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DelayMessages")
        private Long delayMessages;

        @com.aliyun.core.annotation.NameInMap("DelaySeconds")
        private Long delaySeconds;

        @com.aliyun.core.annotation.NameInMap("DlqPolicy")
        private DlqPolicy dlqPolicy;

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
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VisibilityTimeout")
        private Long visibilityTimeout;

        private Data(Builder builder) {
            this.activeMessages = builder.activeMessages;
            this.createTime = builder.createTime;
            this.delayMessages = builder.delayMessages;
            this.delaySeconds = builder.delaySeconds;
            this.dlqPolicy = builder.dlqPolicy;
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
         * @return dlqPolicy
         */
        public DlqPolicy getDlqPolicy() {
            return this.dlqPolicy;
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
        public java.util.List<Tags> getTags() {
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
            private DlqPolicy dlqPolicy; 
            private Long inactiveMessages; 
            private Long lastModifyTime; 
            private Boolean loggingEnabled; 
            private Long maximumMessageSize; 
            private Long messageRetentionPeriod; 
            private Long pollingWaitSeconds; 
            private String queueName; 
            private java.util.List<Tags> tags; 
            private Long visibilityTimeout; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeMessages = model.activeMessages;
                this.createTime = model.createTime;
                this.delayMessages = model.delayMessages;
                this.delaySeconds = model.delaySeconds;
                this.dlqPolicy = model.dlqPolicy;
                this.inactiveMessages = model.inactiveMessages;
                this.lastModifyTime = model.lastModifyTime;
                this.loggingEnabled = model.loggingEnabled;
                this.maximumMessageSize = model.maximumMessageSize;
                this.messageRetentionPeriod = model.messageRetentionPeriod;
                this.pollingWaitSeconds = model.pollingWaitSeconds;
                this.queueName = model.queueName;
                this.tags = model.tags;
                this.visibilityTimeout = model.visibilityTimeout;
            } 

            /**
             * <p>The total number of messages that are in the Active state in the queue. The value is an approximate value. Default value: 0. We recommend that you do not use the return value and that you call CloudMonitor API operations to query the metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder activeMessages(Long activeMessages) {
                this.activeMessages = activeMessages;
                return this;
            }

            /**
             * <p>The time when the queue was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1250700999</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The total number of messages that are in the Delayed state in the queue. The value is an approximate value. Default value: 0. We recommend that you do not use the return value and that you call CloudMonitor API operations to query the metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delayMessages(Long delayMessages) {
                this.delayMessages = delayMessages;
                return this;
            }

            /**
             * <p>The period after which all messages sent to the queue are consumed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder delaySeconds(Long delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * <p>The dead-letter queue policy.</p>
             */
            public Builder dlqPolicy(DlqPolicy dlqPolicy) {
                this.dlqPolicy = dlqPolicy;
                return this;
            }

            /**
             * <p>The total number of messages that are in the Inactive state in the queue. The value is an approximate value. Default value: 0. We recommend that you do not use the return value and that you call CloudMonitor API operations to query the metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inactiveMessages(Long inactiveMessages) {
                this.inactiveMessages = inactiveMessages;
                return this;
            }

            /**
             * <p>The time when the queue was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1250700999</p>
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>Indicates whether the logging feature is enabled. Valid values:</p>
             * <ul>
             * <li>True</li>
             * <li>False</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder loggingEnabled(Boolean loggingEnabled) {
                this.loggingEnabled = loggingEnabled;
                return this;
            }

            /**
             * <p>The maximum length of the message that is sent to the queue. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
             */
            public Builder maximumMessageSize(Long maximumMessageSize) {
                this.maximumMessageSize = maximumMessageSize;
                return this;
            }

            /**
             * <p>The maximum duration for which a message is retained in the queue. After the specified retention period ends, the message is deleted regardless of whether the message is received. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
             */
            public Builder messageRetentionPeriod(Long messageRetentionPeriod) {
                this.messageRetentionPeriod = messageRetentionPeriod;
                return this;
            }

            /**
             * <p>The maximum duration for which long polling requests are held after the ReceiveMessage operation is called. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pollingWaitSeconds(Long pollingWaitSeconds) {
                this.pollingWaitSeconds = pollingWaitSeconds;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The tag.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The duration for which a message stays in the Inactive state after the message is received from the queue. Valid values: 1 to 43200. Unit: seconds. Default value: 30.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
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
