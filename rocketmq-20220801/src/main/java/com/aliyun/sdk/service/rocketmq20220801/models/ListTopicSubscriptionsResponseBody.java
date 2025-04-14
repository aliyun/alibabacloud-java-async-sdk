// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListTopicSubscriptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTopicSubscriptionsResponseBody</p>
 */
public class ListTopicSubscriptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

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

    private ListTopicSubscriptionsResponseBody(Builder builder) {
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

    public static ListTopicSubscriptionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTopicSubscriptionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingInstanceId</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance cannot be found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>92A9BE4E-B794-50C8-979C-0456E4D32943</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public ListTopicSubscriptionsResponseBody build() {
            return new ListTopicSubscriptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTopicSubscriptionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTopicSubscriptionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consistency")
        private String consistency;

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

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private Data(Builder builder) {
            this.consistency = builder.consistency;
            this.consumerGroupId = builder.consumerGroupId;
            this.filterExpression = builder.filterExpression;
            this.filterExpressionType = builder.filterExpressionType;
            this.messageModel = builder.messageModel;
            this.subscriptionStatus = builder.subscriptionStatus;
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
        public String getConsistency() {
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
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String consistency; 
            private String consumerGroupId; 
            private String filterExpression; 
            private String filterExpressionType; 
            private String messageModel; 
            private String subscriptionStatus; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consistency = model.consistency;
                this.consumerGroupId = model.consumerGroupId;
                this.filterExpression = model.filterExpression;
                this.filterExpressionType = model.filterExpressionType;
                this.messageModel = model.messageModel;
                this.subscriptionStatus = model.subscriptionStatus;
                this.topicName = model.topicName;
            } 

            /**
             * <p>Indicates whether message consumption is consistent. Valid values:</p>
             * <ul>
             * <li>false: Unconsumed messages exist in the consumer group.</li>
             * <li>true: No unconsumed message exists in the consumer group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder consistency(String consistency) {
                this.consistency = consistency;
                return this;
            }

            /**
             * <p>The consumer group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CID-TEST</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The filter expression.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder filterExpression(String filterExpression) {
                this.filterExpression = filterExpression;
                return this;
            }

            /**
             * <p>The type of the filter expression. Valid values: SQL, TAG, and UNSPECIFIED. The value SQL indicates that messages are filtered by using SQL expressions. The value TAG indicates that messages are filtered by using tags. The value UNSPECIFIED indicates that no filter expression type is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder filterExpressionType(String filterExpressionType) {
                this.filterExpressionType = filterExpressionType;
                return this;
            }

            /**
             * <p>The consumption mode. Valid values: BROADCASTING and CLUSTERING.</p>
             * 
             * <strong>example:</strong>
             * <p>BROADCASTING</p>
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * <p>The subscription status. Valid values: ONLINE and OFFLINE.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder subscriptionStatus(String subscriptionStatus) {
                this.subscriptionStatus = subscriptionStatus;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_test</p>
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
