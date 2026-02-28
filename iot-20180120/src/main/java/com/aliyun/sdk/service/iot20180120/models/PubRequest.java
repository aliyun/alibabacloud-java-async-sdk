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
 * {@link PubRequest} extends {@link RequestModel}
 *
 * <p>PubRequest</p>
 */
public class PubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorrelationData")
    private String correlationData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageExpiryInterval")
    private Long messageExpiryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayloadFormatIndicator")
    private Integer payloadFormatIndicator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qos")
    private Integer qos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseTopic")
    private String responseTopic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retained")
    private Boolean retained;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicAlias")
    private Integer topicAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicFullName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicFullName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserProp")
    private java.util.List<UserProp> userProp;

    private PubRequest(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
        this.correlationData = builder.correlationData;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.messageContent = builder.messageContent;
        this.messageExpiryInterval = builder.messageExpiryInterval;
        this.payloadFormatIndicator = builder.payloadFormatIndicator;
        this.productKey = builder.productKey;
        this.qos = builder.qos;
        this.responseTopic = builder.responseTopic;
        this.retained = builder.retained;
        this.topicAlias = builder.topicAlias;
        this.topicFullName = builder.topicFullName;
        this.userProp = builder.userProp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PubRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return correlationData
     */
    public String getCorrelationData() {
        return this.correlationData;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return messageContent
     */
    public String getMessageContent() {
        return this.messageContent;
    }

    /**
     * @return messageExpiryInterval
     */
    public Long getMessageExpiryInterval() {
        return this.messageExpiryInterval;
    }

    /**
     * @return payloadFormatIndicator
     */
    public Integer getPayloadFormatIndicator() {
        return this.payloadFormatIndicator;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return qos
     */
    public Integer getQos() {
        return this.qos;
    }

    /**
     * @return responseTopic
     */
    public String getResponseTopic() {
        return this.responseTopic;
    }

    /**
     * @return retained
     */
    public Boolean getRetained() {
        return this.retained;
    }

    /**
     * @return topicAlias
     */
    public Integer getTopicAlias() {
        return this.topicAlias;
    }

    /**
     * @return topicFullName
     */
    public String getTopicFullName() {
        return this.topicFullName;
    }

    /**
     * @return userProp
     */
    public java.util.List<UserProp> getUserProp() {
        return this.userProp;
    }

    public static final class Builder extends Request.Builder<PubRequest, Builder> {
        private String contentType; 
        private String correlationData; 
        private String deviceName; 
        private String iotInstanceId; 
        private String messageContent; 
        private Long messageExpiryInterval; 
        private Integer payloadFormatIndicator; 
        private String productKey; 
        private Integer qos; 
        private String responseTopic; 
        private Boolean retained; 
        private Integer topicAlias; 
        private String topicFullName; 
        private java.util.List<UserProp> userProp; 

        private Builder() {
            super();
        } 

        private Builder(PubRequest request) {
            super(request);
            this.contentType = request.contentType;
            this.correlationData = request.correlationData;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.messageContent = request.messageContent;
            this.messageExpiryInterval = request.messageExpiryInterval;
            this.payloadFormatIndicator = request.payloadFormatIndicator;
            this.productKey = request.productKey;
            this.qos = request.qos;
            this.responseTopic = request.responseTopic;
            this.retained = request.retained;
            this.topicAlias = request.topicAlias;
            this.topicFullName = request.topicFullName;
            this.userProp = request.userProp;
        } 

        /**
         * <p>The content type of the message when you use MQTT 5.0 for communication.</p>
         * <p>The content type is usually MIME, such as text or plain********.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The related data in the request/response communication mode when you use MQTT 5.0. You can specify this parameter as needed.</p>
         * <p>A message recipient can process the request based on the data.</p>
         * <blockquote>
         * <p> You must convert the related data into binary data and perform Base64 encoding to generate a value of the string type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aGVsbG8****</p>
         */
        public Builder correlationData(String correlationData) {
            this.putQueryParameter("CorrelationData", correlationData);
            this.correlationData = correlationData;
            return this;
        }

        /**
         * <p>The name of the MQTT cloud gateway.</p>
         * <blockquote>
         * <p>When you publish a message to an MQTT cloud gateway, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>device1</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The ID of the instance. You can obtain the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page or the instance ID is not displayed in the IoT Platform console, ignore this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The body of the message that you want to publish.</p>
         * <p>To generate a message body, you must convert the raw message into binary data and perform Base64 encoding.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ0ZXN0IjoidGFzayBwdWIgYnJvYWRjYXN0In0=</p>
         */
        public Builder messageContent(String messageContent) {
            this.putBodyParameter("MessageContent", messageContent);
            this.messageContent = messageContent;
            return this;
        }

        /**
         * MessageExpiryInterval.
         */
        public Builder messageExpiryInterval(Long messageExpiryInterval) {
            this.putQueryParameter("MessageExpiryInterval", messageExpiryInterval);
            this.messageExpiryInterval = messageExpiryInterval;
            return this;
        }

        /**
         * <p>The payload identifier of the message when you use MQTT 5.0 for communication. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The message is unknown byte data.</li>
         * <li><strong>1</strong>: The payload of the message is UTF-8 encoded character data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder payloadFormatIndicator(Integer payloadFormatIndicator) {
            this.putQueryParameter("PayloadFormatIndicator", payloadFormatIndicator);
            this.payloadFormatIndicator = payloadFormatIndicator;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device that receives the message belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1Q5XoY****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The quality of service (QoS) level of the message. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The message is published at most once.</li>
         * <li><strong>1</strong>: The message is published at least once. If a PUBACK response is not returned after you publish a QoS 1 message, the message is pushed to the device again when the device reconnects to IoT Platform.</li>
         * </ul>
         * <p>Default value: <strong>0</strong>.</p>
         * <p>For more information about message communication, see <a href="https://help.aliyun.com/document_detail/30527.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder qos(Integer qos) {
            this.putQueryParameter("Qos", qos);
            this.qos = qos;
            return this;
        }

        /**
         * <p>The response topic in the request/response communication mode when you use MQTT 5.0. For more information, see <a href="https://help.aliyun.com/document_detail/30540.html">MQTT 5.0</a>.</p>
         */
        public Builder responseTopic(String responseTopic) {
            this.putQueryParameter("ResponseTopic", responseTopic);
            this.responseTopic = responseTopic;
            return this;
        }

        /**
         * Retained.
         */
        public Builder retained(Boolean retained) {
            this.putQueryParameter("Retained", retained);
            this.retained = retained;
            return this;
        }

        /**
         * TopicAlias.
         */
        public Builder topicAlias(Integer topicAlias) {
            this.putQueryParameter("TopicAlias", topicAlias);
            this.topicAlias = topicAlias;
            return this;
        }

        /**
         * <p>The custom topic for the device that receives the message.</p>
         * <ul>
         * <li>Topic format: <code>/${productKey}/${deviceName}/user/${TopicShortName}</code>.</li>
         * <li>You must specify the <strong>Subscribe</strong> permission, or <strong>Publish and Subscribe</strong> permissions for the topic.</li>
         * </ul>
         * <blockquote>
         * <p>Make sure that the device subscribes to the topic before you call the Pub operation. Otherwise, the device cannot receive the message.</p>
         * </blockquote>
         * <p>You can view the custom topics of a product on the <strong>Topic Categories</strong> tab of the <strong>Product Details</strong> page, or by calling the <a href="https://help.aliyun.com/document_detail/69647.html">QueryProductTopic</a> operation. You can view the topics to which the device subscribes on the <strong>Topic List</strong> tab of the <strong>Device Details</strong> page.</p>
         * <p>This parameter is required.</p>
         */
        public Builder topicFullName(String topicFullName) {
            this.putQueryParameter("TopicFullName", topicFullName);
            this.topicFullName = topicFullName;
            return this;
        }

        /**
         * UserProp.
         */
        public Builder userProp(java.util.List<UserProp> userProp) {
            this.putQueryParameter("UserProp", userProp);
            this.userProp = userProp;
            return this;
        }

        @Override
        public PubRequest build() {
            return new PubRequest(this);
        } 

    } 

    /**
     * 
     * {@link PubRequest} extends {@link TeaModel}
     *
     * <p>PubRequest</p>
     */
    public static class UserProp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private UserProp(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProp create() {
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

            private Builder(UserProp model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The custom property key that is specified when you use MQTT 5.0 for communication.</p>
             * <p>This parameter must be used together with the <strong>UserProp.N.Value</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The custom property value that is specified when you use MQTT 5.0 for communication.</p>
             * <p>This parameter must be used together with the <strong>UserProp.N.Key</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UserProp build() {
                return new UserProp(this);
            } 

        } 

    }
}
