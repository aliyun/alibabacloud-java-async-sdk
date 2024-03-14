// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMqttConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMqttConfigResponseBody</p>
 */
public class DescribeMqttConfigResponseBody extends TeaModel {
    @NameInMap("AuthType")
    private String authType;

    @NameInMap("BrokerUrl")
    private String brokerUrl;

    @NameInMap("Code")
    private String code;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("InternalBrokerUrl")
    private String internalBrokerUrl;

    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @NameInMap("Message")
    private String message;

    @NameInMap("MqttInstanceId")
    private String mqttInstanceId;

    @NameInMap("Password")
    private String password;

    @NameInMap("PublishTopic")
    private String publishTopic;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubscribeTopic")
    private String subscribeTopic;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Username")
    private String username;

    private DescribeMqttConfigResponseBody(Builder builder) {
        this.authType = builder.authType;
        this.brokerUrl = builder.brokerUrl;
        this.code = builder.code;
        this.groupId = builder.groupId;
        this.internalBrokerUrl = builder.internalBrokerUrl;
        this.isEnabled = builder.isEnabled;
        this.message = builder.message;
        this.mqttInstanceId = builder.mqttInstanceId;
        this.password = builder.password;
        this.publishTopic = builder.publishTopic;
        this.requestId = builder.requestId;
        this.subscribeTopic = builder.subscribeTopic;
        this.success = builder.success;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMqttConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return brokerUrl
     */
    public String getBrokerUrl() {
        return this.brokerUrl;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return internalBrokerUrl
     */
    public String getInternalBrokerUrl() {
        return this.internalBrokerUrl;
    }

    /**
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return mqttInstanceId
     */
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return publishTopic
     */
    public String getPublishTopic() {
        return this.publishTopic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscribeTopic
     */
    public String getSubscribeTopic() {
        return this.subscribeTopic;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private String authType; 
        private String brokerUrl; 
        private String code; 
        private String groupId; 
        private String internalBrokerUrl; 
        private Boolean isEnabled; 
        private String message; 
        private String mqttInstanceId; 
        private String password; 
        private String publishTopic; 
        private String requestId; 
        private String subscribeTopic; 
        private Boolean success; 
        private String username; 

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * BrokerUrl.
         */
        public Builder brokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * InternalBrokerUrl.
         */
        public Builder internalBrokerUrl(String internalBrokerUrl) {
            this.internalBrokerUrl = internalBrokerUrl;
            return this;
        }

        /**
         * IsEnabled.
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
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
         * MqttInstanceId.
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * PublishTopic.
         */
        public Builder publishTopic(String publishTopic) {
            this.publishTopic = publishTopic;
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
         * SubscribeTopic.
         */
        public Builder subscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public DescribeMqttConfigResponseBody build() {
            return new DescribeMqttConfigResponseBody(this);
        } 

    } 

}
