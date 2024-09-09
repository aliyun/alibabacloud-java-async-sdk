// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsumerGroupSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerGroupSubscriptionResponseBody</p>
 */
public class GetConsumerGroupSubscriptionResponseBody extends TeaModel {
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

    private GetConsumerGroupSubscriptionResponseBody(Builder builder) {
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

    public static GetConsumerGroupSubscriptionResponseBody create() {
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
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * dynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * dynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConsumerGroupSubscriptionResponseBody build() {
            return new GetConsumerGroupSubscriptionResponseBody(this);
        } 

    } 

    public static class ConnectionDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("egressIp")
        private String egressIp;

        @com.aliyun.core.annotation.NameInMap("hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("messageModel")
        private String messageModel;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private ConnectionDTO(Builder builder) {
            this.clientId = builder.clientId;
            this.egressIp = builder.egressIp;
            this.hostname = builder.hostname;
            this.language = builder.language;
            this.messageModel = builder.messageModel;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionDTO create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return egressIp
         */
        public String getEgressIp() {
            return this.egressIp;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return messageModel
         */
        public String getMessageModel() {
            return this.messageModel;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String clientId; 
            private String egressIp; 
            private String hostname; 
            private String language; 
            private String messageModel; 
            private String version; 

            /**
             * clientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * egressIp.
             */
            public Builder egressIp(String egressIp) {
                this.egressIp = egressIp;
                return this;
            }

            /**
             * hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * messageModel.
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ConnectionDTO build() {
                return new ConnectionDTO(this);
            } 

        } 

    }
    public static class SubscriptionDTO extends TeaModel {
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

        private SubscriptionDTO(Builder builder) {
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

        public static SubscriptionDTO create() {
            return builder().build();
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
            private String consumerGroupId; 
            private String filterExpression; 
            private String filterExpressionType; 
            private String messageModel; 
            private String subscriptionStatus; 
            private String topicName; 

            /**
             * consumerGroupId.
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * filterExpression.
             */
            public Builder filterExpression(String filterExpression) {
                this.filterExpression = filterExpression;
                return this;
            }

            /**
             * filterExpressionType.
             */
            public Builder filterExpressionType(String filterExpressionType) {
                this.filterExpressionType = filterExpressionType;
                return this;
            }

            /**
             * messageModel.
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * subscriptionStatus.
             */
            public Builder subscriptionStatus(String subscriptionStatus) {
                this.subscriptionStatus = subscriptionStatus;
                return this;
            }

            /**
             * topicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public SubscriptionDTO build() {
                return new SubscriptionDTO(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connectionDTO")
        private ConnectionDTO connectionDTO;

        @com.aliyun.core.annotation.NameInMap("subscriptionDTO")
        private SubscriptionDTO subscriptionDTO;

        private Data(Builder builder) {
            this.connectionDTO = builder.connectionDTO;
            this.subscriptionDTO = builder.subscriptionDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectionDTO
         */
        public ConnectionDTO getConnectionDTO() {
            return this.connectionDTO;
        }

        /**
         * @return subscriptionDTO
         */
        public SubscriptionDTO getSubscriptionDTO() {
            return this.subscriptionDTO;
        }

        public static final class Builder {
            private ConnectionDTO connectionDTO; 
            private SubscriptionDTO subscriptionDTO; 

            /**
             * connectionDTO.
             */
            public Builder connectionDTO(ConnectionDTO connectionDTO) {
                this.connectionDTO = connectionDTO;
                return this;
            }

            /**
             * subscriptionDTO.
             */
            public Builder subscriptionDTO(SubscriptionDTO subscriptionDTO) {
                this.subscriptionDTO = subscriptionDTO;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
