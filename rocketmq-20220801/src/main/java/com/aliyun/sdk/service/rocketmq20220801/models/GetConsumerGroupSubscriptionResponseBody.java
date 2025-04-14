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
 * {@link GetConsumerGroupSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerGroupSubscriptionResponseBody</p>
 */
public class GetConsumerGroupSubscriptionResponseBody extends TeaModel {
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

        private Builder(GetConsumerGroupSubscriptionResponseBody model) {
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
         * <p>Instance.NotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
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
         * <p>The response code.</p>
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
         * <p>Parameter instanceId is mandatory for this action .</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>157DF7D4-53FB-58C6-BEBC-A9400E7EF68A</p>
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

        public GetConsumerGroupSubscriptionResponseBody build() {
            return new GetConsumerGroupSubscriptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumerGroupSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerGroupSubscriptionResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ConnectionDTO model) {
                this.clientId = model.clientId;
                this.egressIp = model.egressIp;
                this.hostname = model.hostname;
                this.language = model.language;
                this.messageModel = model.messageModel;
                this.version = model.version;
            } 

            /**
             * <p>The client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.50.191@19908#-2093249153#1534215565#40385215750900</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The public IP address of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder egressIp(String egressIp) {
                this.egressIp = egressIp;
                return this;
            }

            /**
             * <p>The host name.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The language used by the client.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The consumption mode of the consumer group. Valid values:</p>
             * <ul>
             * <li>BROADCASTING: broadcasting consumption</li>
             * <li>CLUSTERING: clustering consumption</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BROADCASTING</p>
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * <p>The client version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
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
    /**
     * 
     * {@link GetConsumerGroupSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerGroupSubscriptionResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SubscriptionDTO model) {
                this.consumerGroupId = model.consumerGroupId;
                this.filterExpression = model.filterExpression;
                this.filterExpressionType = model.filterExpressionType;
                this.messageModel = model.messageModel;
                this.subscriptionStatus = model.subscriptionStatus;
                this.topicName = model.topicName;
            } 

            /**
             * <p>The consumer group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_inspector_group</p>
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
             * <p>The type of the filter expression. Valid values:</p>
             * <ul>
             * <li>SQL: filters messages by using SQL expressions.</li>
             * <li>TAG: filters messages by using tags.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UNSPECIFIED</p>
             */
            public Builder filterExpressionType(String filterExpressionType) {
                this.filterExpressionType = filterExpressionType;
                return this;
            }

            /**
             * <p>The consumption mode of the consumer group. Valid values:</p>
             * <ul>
             * <li>BROADCASTING: broadcasting consumption</li>
             * <li>CLUSTERING: clustering consumption</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BROADCASTING</p>
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * <p>The subscription status. Valid values:</p>
             * <ul>
             * <li>ONLINE: The consumer group is online. If the consumer group contains multiple consumers, this value is returned if at least one of the consumers is online.</li>
             * <li>OFFLINE: The consumer group is offline. If the consumer group contains multiple consumers, this value is returned only if all consumers are offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder subscriptionStatus(String subscriptionStatus) {
                this.subscriptionStatus = subscriptionStatus;
                return this;
            }

            /**
             * <p>The topic to which the consumer group subscribes.</p>
             * 
             * <strong>example:</strong>
             * <p>Topic_normal_inspector</p>
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
    /**
     * 
     * {@link GetConsumerGroupSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerGroupSubscriptionResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.connectionDTO = model.connectionDTO;
                this.subscriptionDTO = model.subscriptionDTO;
            } 

            /**
             * <p>The connection details.</p>
             */
            public Builder connectionDTO(ConnectionDTO connectionDTO) {
                this.connectionDTO = connectionDTO;
                return this;
            }

            /**
             * <p>The subscription details.</p>
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
