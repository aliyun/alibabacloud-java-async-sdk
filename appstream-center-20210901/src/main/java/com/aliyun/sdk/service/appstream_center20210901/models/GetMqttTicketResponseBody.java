// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetMqttTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetMqttTicketResponseBody</p>
 */
public class GetMqttTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ExpireTimeStamp")
    private String expireTimeStamp;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MqttEndpoint")
    private String mqttEndpoint;

    @com.aliyun.core.annotation.NameInMap("MqttGroupId")
    private String mqttGroupId;

    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    private String mqttInstanceId;

    @com.aliyun.core.annotation.NameInMap("MqttPassword")
    private String mqttPassword;

    @com.aliyun.core.annotation.NameInMap("MqttUsername")
    private String mqttUsername;

    @com.aliyun.core.annotation.NameInMap("MqttVPCEndpoint")
    private String mqttVPCEndpoint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TopicList")
    private String topicList;

    private GetMqttTicketResponseBody(Builder builder) {
        this.code = builder.code;
        this.expireTimeStamp = builder.expireTimeStamp;
        this.message = builder.message;
        this.mqttEndpoint = builder.mqttEndpoint;
        this.mqttGroupId = builder.mqttGroupId;
        this.mqttInstanceId = builder.mqttInstanceId;
        this.mqttPassword = builder.mqttPassword;
        this.mqttUsername = builder.mqttUsername;
        this.mqttVPCEndpoint = builder.mqttVPCEndpoint;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topicList = builder.topicList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMqttTicketResponseBody create() {
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
     * @return expireTimeStamp
     */
    public String getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return mqttEndpoint
     */
    public String getMqttEndpoint() {
        return this.mqttEndpoint;
    }

    /**
     * @return mqttGroupId
     */
    public String getMqttGroupId() {
        return this.mqttGroupId;
    }

    /**
     * @return mqttInstanceId
     */
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    /**
     * @return mqttPassword
     */
    public String getMqttPassword() {
        return this.mqttPassword;
    }

    /**
     * @return mqttUsername
     */
    public String getMqttUsername() {
        return this.mqttUsername;
    }

    /**
     * @return mqttVPCEndpoint
     */
    public String getMqttVPCEndpoint() {
        return this.mqttVPCEndpoint;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return topicList
     */
    public String getTopicList() {
        return this.topicList;
    }

    public static final class Builder {
        private String code; 
        private String expireTimeStamp; 
        private String message; 
        private String mqttEndpoint; 
        private String mqttGroupId; 
        private String mqttInstanceId; 
        private String mqttPassword; 
        private String mqttUsername; 
        private String mqttVPCEndpoint; 
        private String requestId; 
        private String success; 
        private String topicList; 

        private Builder() {
        } 

        private Builder(GetMqttTicketResponseBody model) {
            this.code = model.code;
            this.expireTimeStamp = model.expireTimeStamp;
            this.message = model.message;
            this.mqttEndpoint = model.mqttEndpoint;
            this.mqttGroupId = model.mqttGroupId;
            this.mqttInstanceId = model.mqttInstanceId;
            this.mqttPassword = model.mqttPassword;
            this.mqttUsername = model.mqttUsername;
            this.mqttVPCEndpoint = model.mqttVPCEndpoint;
            this.requestId = model.requestId;
            this.success = model.success;
            this.topicList = model.topicList;
        } 

        /**
         * <p>The error code returned when the request fails. For example, <code>Client.Forbidden</code> indicates that the client is forbidden from establishing a connection.</p>
         * 
         * <strong>example:</strong>
         * <p>Client.Forbidden</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The expiration time of the MQTT connection password. It is returned as a string representing a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1794278400000</p>
         */
        public Builder expireTimeStamp(String expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }

        /**
         * <p>The error message returned when the request fails, which corresponds to the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Client forbidden connect</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The access endpoint for the MQTT client. Use the endpoint returned by this operation to establish a connection.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt.example.com</p>
         */
        public Builder mqttEndpoint(String mqttEndpoint) {
            this.mqttEndpoint = mqttEndpoint;
            return this;
        }

        /**
         * <p>The MQTT group ID, used to concatenate the MQTT ClientId.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_EXAMPLE</p>
         */
        public Builder mqttGroupId(String mqttGroupId) {
            this.mqttGroupId = mqttGroupId;
            return this;
        }

        /**
         * <p>The MQTT instance ID, used for token authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-7mz2****</p>
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        /**
         * <p>The password used to establish an MQTT connection. It consists of publish and subscribe tokens in the format of <code>W|PublishToken|R|SubscribeToken</code>. Use the complete password returned by the operation. The desensitized examples in the documentation cannot be used for connections.</p>
         * 
         * <strong>example:</strong>
         * <p>W|pubTokenExample****|R|subTokenExample****</p>
         */
        public Builder mqttPassword(String mqttPassword) {
            this.mqttPassword = mqttPassword;
            return this;
        }

        /**
         * <p>The username used to establish an MQTT connection. The format is <code>Token|AccessKeyId|InstanceId</code>. AccessKeyId and InstanceId are identifiers used by the server to generate credentials. Use the complete username returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Token|LTAI5tExample****|post-cn-7mz2****</p>
         */
        public Builder mqttUsername(String mqttUsername) {
            this.mqttUsername = mqttUsername;
            return this;
        }

        /**
         * <p>The VPC access endpoint for MQTT, used by clients that meet the VPC network access requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-vpc.example.com</p>
         */
        public Builder mqttVPCEndpoint(String mqttVPCEndpoint) {
            this.mqttVPCEndpoint = mqttVPCEndpoint;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B9E3F7B2-5B13-4A7B-8C36-6D1B0A8F0000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. <code>true</code> indicates success, and <code>false</code> indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The topic list. Each list element contains <code>topic</code> (the topic name), <code>type</code> (the topic type), and <code>permission</code> (the permission). The list returned by this operation includes topics for publishing, tenant subscription, device subscription, and system subscription. The publish permission is <code>W</code>, and the subscribe permission is <code>R</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;topic&quot;:&quot;pub/550e8400-e29b-41d4-a716-446655440000&quot;,&quot;type&quot;:&quot;pub&quot;,&quot;permission&quot;:&quot;W&quot;},{&quot;topic&quot;:&quot;sub/ten/123456789012****&quot;,&quot;type&quot;:&quot;sub-ten&quot;,&quot;permission&quot;:&quot;R&quot;},{&quot;topic&quot;:&quot;sub/uuid/550e8400-e29b-41d4-a716-446655440000&quot;,&quot;type&quot;:&quot;sub-uuid&quot;,&quot;permission&quot;:&quot;R&quot;},{&quot;topic&quot;:&quot;sub/sys&quot;,&quot;type&quot;:&quot;sub-sys&quot;,&quot;permission&quot;:&quot;R&quot;}]</p>
         */
        public Builder topicList(String topicList) {
            this.topicList = topicList;
            return this;
        }

        public GetMqttTicketResponseBody build() {
            return new GetMqttTicketResponseBody(this);
        } 

    } 

}
