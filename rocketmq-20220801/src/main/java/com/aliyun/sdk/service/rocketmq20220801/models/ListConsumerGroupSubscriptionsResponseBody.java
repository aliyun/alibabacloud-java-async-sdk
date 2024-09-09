// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConsumerGroupSubscriptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConsumerGroupSubscriptionsResponseBody</p>
 */
public class ListConsumerGroupSubscriptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListConsumerGroupSubscriptionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumerGroupSubscriptionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message.
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListConsumerGroupSubscriptionsResponseBody build() {
            return new ListConsumerGroupSubscriptionsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consistency")
        private Boolean consistency;

        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("filterExpression")
        private String filterExpression;

        @com.aliyun.core.annotation.NameInMap("filterExpressionType")
        private String filterExpressionType;

        @com.aliyun.core.annotation.NameInMap("messageModel")
        private String messageModel;

        @com.aliyun.core.annotation.NameInMap("subscriptionStatus")
        private String subscriptionStatus;

        @com.aliyun.core.annotation.NameInMap("topicCreated")
        private Boolean topicCreated;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private Data(Builder builder) {
            this.consistency = builder.consistency;
            this.consumerGroupId = builder.consumerGroupId;
            this.filterExpression = builder.filterExpression;
            this.filterExpressionType = builder.filterExpressionType;
            this.messageModel = builder.messageModel;
            this.subscriptionStatus = builder.subscriptionStatus;
            this.topicCreated = builder.topicCreated;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consistency
         */
        public Boolean getConsistency() {
            return this.consistency;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return filterExpression
         */
        public String getFilterExpression() {
            return this.filterExpression;
        }

        /**
         * @return filterExpressionType
         */
        public String getFilterExpressionType() {
            return this.filterExpressionType;
        }

        /**
         * @return messageModel
         */
        public String getMessageModel() {
            return this.messageModel;
        }

        /**
         * @return subscriptionStatus
         */
        public String getSubscriptionStatus() {
            return this.subscriptionStatus;
        }

        /**
         * @return topicCreated
         */
        public Boolean getTopicCreated() {
            return this.topicCreated;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Boolean consistency; 
            private String consumerGroupId; 
            private String filterExpression; 
            private String filterExpressionType; 
            private String messageModel; 
            private String subscriptionStatus; 
            private Boolean topicCreated; 
            private String topicName; 

            /**
             * Indicates whether message consumption is consistent. Valid values:
             * <p>
             * 
             * *   false: Unconsumed messages exist in the consumer group.
             * *   true: No unconsumed message exists in the consumer group.
             */
            public Builder consistency(Boolean consistency) {
                this.consistency = consistency;
                return this;
            }

            /**
             * The ID of the consumer group.
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * The filter expression.
             */
            public Builder filterExpression(String filterExpression) {
                this.filterExpression = filterExpression;
                return this;
            }

            /**
             * The type of the filter expression. Valid values:
             * <p>
             * 
             * *   SQL: filters messages by using SQL expressions.
             * *   TAG: filters messages by using tags.
             */
            public Builder filterExpressionType(String filterExpressionType) {
                this.filterExpressionType = filterExpressionType;
                return this;
            }

            /**
             * The consumption mode of the consumer group. Valid values:
             * <p>
             * 
             * *   BROADCASTING: broadcasting consumption
             * *   CLUSTERING: clustering consumption
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * The subscription status. Valid values:
             * <p>
             * 
             * *   ONLINE: The consumer group is online. If the consumer group contains multiple consumers, this value is returned as long as one of the consumers is online.
             * *   OFFLINE: The consumer group is offline. If the consumer group contains multiple consumers, this value is returned only if all consumers are offline.
             */
            public Builder subscriptionStatus(String subscriptionStatus) {
                this.subscriptionStatus = subscriptionStatus;
                return this;
            }

            /**
             * Indicates whether the topic is created.
             */
            public Builder topicCreated(Boolean topicCreated) {
                this.topicCreated = topicCreated;
                return this;
            }

            /**
             * The topic to which the consumer group subscribes.
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
