// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueueAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueueAttributesResponseBody</p>
 */
public class GetQueueAttributesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
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

        public GetQueueAttributesResponseBody build() {
            return new GetQueueAttributesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActiveMessages")
        private Long activeMessages;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DelayMessages")
        private Long delayMessages;

        @NameInMap("DelaySeconds")
        private Long delaySeconds;

        @NameInMap("InactiveMessages")
        private Long inactiveMessages;

        @NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @NameInMap("LoggingEnabled")
        private Boolean loggingEnabled;

        @NameInMap("MaximumMessageSize")
        private Long maximumMessageSize;

        @NameInMap("MessageRetentionPeriod")
        private Long messageRetentionPeriod;

        @NameInMap("PollingWaitSeconds")
        private Long pollingWaitSeconds;

        @NameInMap("QueueInternalUrl")
        private String queueInternalUrl;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("QueueUrl")
        private String queueUrl;

        @NameInMap("VisibilityTimeout")
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
            this.queueInternalUrl = builder.queueInternalUrl;
            this.queueName = builder.queueName;
            this.queueUrl = builder.queueUrl;
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
         * @return queueInternalUrl
         */
        public String getQueueInternalUrl() {
            return this.queueInternalUrl;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return queueUrl
         */
        public String getQueueUrl() {
            return this.queueUrl;
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
            private String queueInternalUrl; 
            private String queueName; 
            private String queueUrl; 
            private Long visibilityTimeout; 

            /**
             * ActiveMessages.
             */
            public Builder activeMessages(Long activeMessages) {
                this.activeMessages = activeMessages;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DelayMessages.
             */
            public Builder delayMessages(Long delayMessages) {
                this.delayMessages = delayMessages;
                return this;
            }

            /**
             * DelaySeconds.
             */
            public Builder delaySeconds(Long delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * InactiveMessages.
             */
            public Builder inactiveMessages(Long inactiveMessages) {
                this.inactiveMessages = inactiveMessages;
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
             * MaximumMessageSize.
             */
            public Builder maximumMessageSize(Long maximumMessageSize) {
                this.maximumMessageSize = maximumMessageSize;
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
             * PollingWaitSeconds.
             */
            public Builder pollingWaitSeconds(Long pollingWaitSeconds) {
                this.pollingWaitSeconds = pollingWaitSeconds;
                return this;
            }

            /**
             * QueueInternalUrl.
             */
            public Builder queueInternalUrl(String queueInternalUrl) {
                this.queueInternalUrl = queueInternalUrl;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * QueueUrl.
             */
            public Builder queueUrl(String queueUrl) {
                this.queueUrl = queueUrl;
                return this;
            }

            /**
             * VisibilityTimeout.
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
