// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscriptionAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionAttributesResponseBody</p>
 */
public class GetSubscriptionAttributesResponseBody extends TeaModel {
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

    private GetSubscriptionAttributesResponseBody(Builder builder) {
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

    public static GetSubscriptionAttributesResponseBody create() {
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

        public GetSubscriptionAttributesResponseBody build() {
            return new GetSubscriptionAttributesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("FilterTag")
        private String filterTag;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("NotifyContentFormat")
        private String notifyContentFormat;

        @com.aliyun.core.annotation.NameInMap("NotifyStrategy")
        private String notifyStrategy;

        @com.aliyun.core.annotation.NameInMap("SubscriptionName")
        private String subscriptionName;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("TopicOwner")
        private String topicOwner;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.endpoint = builder.endpoint;
            this.filterTag = builder.filterTag;
            this.lastModifyTime = builder.lastModifyTime;
            this.notifyContentFormat = builder.notifyContentFormat;
            this.notifyStrategy = builder.notifyStrategy;
            this.subscriptionName = builder.subscriptionName;
            this.topicName = builder.topicName;
            this.topicOwner = builder.topicOwner;
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
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return filterTag
         */
        public String getFilterTag() {
            return this.filterTag;
        }

        /**
         * @return lastModifyTime
         */
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return notifyContentFormat
         */
        public String getNotifyContentFormat() {
            return this.notifyContentFormat;
        }

        /**
         * @return notifyStrategy
         */
        public String getNotifyStrategy() {
            return this.notifyStrategy;
        }

        /**
         * @return subscriptionName
         */
        public String getSubscriptionName() {
            return this.subscriptionName;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return topicOwner
         */
        public String getTopicOwner() {
            return this.topicOwner;
        }

        public static final class Builder {
            private Long createTime; 
            private String endpoint; 
            private String filterTag; 
            private Long lastModifyTime; 
            private String notifyContentFormat; 
            private String notifyStrategy; 
            private String subscriptionName; 
            private String topicName; 
            private String topicOwner; 

            /**
             * The time when the subscription was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The endpoint to which the messages are pushed.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The tag that is used to filter messages. Only the messages that are attached with the specified tag can be pushed.
             */
            public Builder filterTag(String filterTag) {
                this.filterTag = filterTag;
                return this;
            }

            /**
             * The time when the subscription was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * The content format of the messages that are pushed to the endpoint. Valid values:
             * <p>
             * 
             * *   XML
             * *   JSON
             * *   SIMPLIFIED
             */
            public Builder notifyContentFormat(String notifyContentFormat) {
                this.notifyContentFormat = notifyContentFormat;
                return this;
            }

            /**
             * The retry policy that is applied if an error occurs when Message Service (MNS) pushes messages to the endpoint. Valid values:
             * <p>
             * 
             * *   BACKOFF_RETRY
             * *   EXPONENTIAL_DECAY_RETRY
             */
            public Builder notifyStrategy(String notifyStrategy) {
                this.notifyStrategy = notifyStrategy;
                return this;
            }

            /**
             * The name of the subscription.
             */
            public Builder subscriptionName(String subscriptionName) {
                this.subscriptionName = subscriptionName;
                return this;
            }

            /**
             * The name of the topic.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * The Alibaba Cloud account ID of the topic owner.
             */
            public Builder topicOwner(String topicOwner) {
                this.topicOwner = topicOwner;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
