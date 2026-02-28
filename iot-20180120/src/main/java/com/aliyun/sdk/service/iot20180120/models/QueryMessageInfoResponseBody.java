// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryMessageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessageInfoResponseBody</p>
 */
public class QueryMessageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private Message message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMessageInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageInfoResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return message
     */
    public Message getMessage() {
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
        private String errorMessage; 
        private Message message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryMessageInfoResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(Message message) {
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMessageInfoResponseBody build() {
            return new QueryMessageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMessageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMessageInfoResponseBody</p>
     */
    public static class MqttProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MqttProperties(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MqttProperties create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(MqttProperties model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MqttProperties build() {
                return new MqttProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMessageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMessageInfoResponseBody</p>
     */
    public static class UserProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private UserProperties(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProperties create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(UserProperties model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UserProperties build() {
                return new UserProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMessageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMessageInfoResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenerateTime")
        private Long generateTime;

        @com.aliyun.core.annotation.NameInMap("MessageContent")
        private String messageContent;

        @com.aliyun.core.annotation.NameInMap("MqttProperties")
        private java.util.List<MqttProperties> mqttProperties;

        @com.aliyun.core.annotation.NameInMap("TopicFullName")
        private String topicFullName;

        @com.aliyun.core.annotation.NameInMap("TransformedMessageContent")
        private String transformedMessageContent;

        @com.aliyun.core.annotation.NameInMap("TransformedTopicFullName")
        private String transformedTopicFullName;

        @com.aliyun.core.annotation.NameInMap("UniMsgId")
        private String uniMsgId;

        @com.aliyun.core.annotation.NameInMap("UserProperties")
        private java.util.List<UserProperties> userProperties;

        private Message(Builder builder) {
            this.generateTime = builder.generateTime;
            this.messageContent = builder.messageContent;
            this.mqttProperties = builder.mqttProperties;
            this.topicFullName = builder.topicFullName;
            this.transformedMessageContent = builder.transformedMessageContent;
            this.transformedTopicFullName = builder.transformedTopicFullName;
            this.uniMsgId = builder.uniMsgId;
            this.userProperties = builder.userProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return generateTime
         */
        public Long getGenerateTime() {
            return this.generateTime;
        }

        /**
         * @return messageContent
         */
        public String getMessageContent() {
            return this.messageContent;
        }

        /**
         * @return mqttProperties
         */
        public java.util.List<MqttProperties> getMqttProperties() {
            return this.mqttProperties;
        }

        /**
         * @return topicFullName
         */
        public String getTopicFullName() {
            return this.topicFullName;
        }

        /**
         * @return transformedMessageContent
         */
        public String getTransformedMessageContent() {
            return this.transformedMessageContent;
        }

        /**
         * @return transformedTopicFullName
         */
        public String getTransformedTopicFullName() {
            return this.transformedTopicFullName;
        }

        /**
         * @return uniMsgId
         */
        public String getUniMsgId() {
            return this.uniMsgId;
        }

        /**
         * @return userProperties
         */
        public java.util.List<UserProperties> getUserProperties() {
            return this.userProperties;
        }

        public static final class Builder {
            private Long generateTime; 
            private String messageContent; 
            private java.util.List<MqttProperties> mqttProperties; 
            private String topicFullName; 
            private String transformedMessageContent; 
            private String transformedTopicFullName; 
            private String uniMsgId; 
            private java.util.List<UserProperties> userProperties; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.generateTime = model.generateTime;
                this.messageContent = model.messageContent;
                this.mqttProperties = model.mqttProperties;
                this.topicFullName = model.topicFullName;
                this.transformedMessageContent = model.transformedMessageContent;
                this.transformedTopicFullName = model.transformedTopicFullName;
                this.uniMsgId = model.uniMsgId;
                this.userProperties = model.userProperties;
            } 

            /**
             * GenerateTime.
             */
            public Builder generateTime(Long generateTime) {
                this.generateTime = generateTime;
                return this;
            }

            /**
             * MessageContent.
             */
            public Builder messageContent(String messageContent) {
                this.messageContent = messageContent;
                return this;
            }

            /**
             * MqttProperties.
             */
            public Builder mqttProperties(java.util.List<MqttProperties> mqttProperties) {
                this.mqttProperties = mqttProperties;
                return this;
            }

            /**
             * TopicFullName.
             */
            public Builder topicFullName(String topicFullName) {
                this.topicFullName = topicFullName;
                return this;
            }

            /**
             * TransformedMessageContent.
             */
            public Builder transformedMessageContent(String transformedMessageContent) {
                this.transformedMessageContent = transformedMessageContent;
                return this;
            }

            /**
             * TransformedTopicFullName.
             */
            public Builder transformedTopicFullName(String transformedTopicFullName) {
                this.transformedTopicFullName = transformedTopicFullName;
                return this;
            }

            /**
             * UniMsgId.
             */
            public Builder uniMsgId(String uniMsgId) {
                this.uniMsgId = uniMsgId;
                return this;
            }

            /**
             * UserProperties.
             */
            public Builder userProperties(java.util.List<UserProperties> userProperties) {
                this.userProperties = userProperties;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
}
