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
 * {@link BatchPubRequest} extends {@link RequestModel}
 *
 * <p>BatchPubRequest</p>
 */
public class BatchPubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorrelationData")
    private String correlationData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> deviceName;

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
    @com.aliyun.core.annotation.NameInMap("ResponseTopicTemplateName")
    private String responseTopicTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retained")
    private Boolean retained;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicShortName")
    private String topicShortName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicTemplateName")
    private String topicTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserProp")
    private java.util.List<UserProp> userProp;

    private BatchPubRequest(Builder builder) {
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
        this.responseTopicTemplateName = builder.responseTopicTemplateName;
        this.retained = builder.retained;
        this.topicShortName = builder.topicShortName;
        this.topicTemplateName = builder.topicTemplateName;
        this.userProp = builder.userProp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchPubRequest create() {
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
    public java.util.List<String> getDeviceName() {
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
     * @return responseTopicTemplateName
     */
    public String getResponseTopicTemplateName() {
        return this.responseTopicTemplateName;
    }

    /**
     * @return retained
     */
    public Boolean getRetained() {
        return this.retained;
    }

    /**
     * @return topicShortName
     */
    public String getTopicShortName() {
        return this.topicShortName;
    }

    /**
     * @return topicTemplateName
     */
    public String getTopicTemplateName() {
        return this.topicTemplateName;
    }

    /**
     * @return userProp
     */
    public java.util.List<UserProp> getUserProp() {
        return this.userProp;
    }

    public static final class Builder extends Request.Builder<BatchPubRequest, Builder> {
        private String contentType; 
        private String correlationData; 
        private java.util.List<String> deviceName; 
        private String iotInstanceId; 
        private String messageContent; 
        private Long messageExpiryInterval; 
        private Integer payloadFormatIndicator; 
        private String productKey; 
        private Integer qos; 
        private String responseTopicTemplateName; 
        private Boolean retained; 
        private String topicShortName; 
        private String topicTemplateName; 
        private java.util.List<UserProp> userProp; 

        private Builder() {
            super();
        } 

        private Builder(BatchPubRequest request) {
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
            this.responseTopicTemplateName = request.responseTopicTemplateName;
            this.retained = request.retained;
            this.topicShortName = request.topicShortName;
            this.topicTemplateName = request.topicTemplateName;
            this.userProp = request.userProp;
        } 

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * CorrelationData.
         */
        public Builder correlationData(String correlationData) {
            this.putQueryParameter("CorrelationData", correlationData);
            this.correlationData = correlationData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>newdevice1</p>
         */
        public Builder deviceName(java.util.List<String> deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
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
         * <p>This parameter is required.</p>
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
         * PayloadFormatIndicator.
         */
        public Builder payloadFormatIndicator(Integer payloadFormatIndicator) {
            this.putQueryParameter("PayloadFormatIndicator", payloadFormatIndicator);
            this.payloadFormatIndicator = payloadFormatIndicator;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
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
         * <li><strong>1</strong>: The message is published at least once.</li>
         * </ul>
         * <p>Default value: <strong>0</strong>.</p>
         * <blockquote>
         * <p> IoT Platform stores QoS 1 messages for up to 7 days. IoT Platform does not store QoS 0 messages.</p>
         * </blockquote>
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
         * ResponseTopicTemplateName.
         */
        public Builder responseTopicTemplateName(String responseTopicTemplateName) {
            this.putQueryParameter("ResponseTopicTemplateName", responseTopicTemplateName);
            this.responseTopicTemplateName = responseTopicTemplateName;
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
         * <p>The suffix of the custom topic.</p>
         * <p>A custom topic is in the following format: <code>/${productKey}/${deviceName}/user/${TopicShortName}</code>. ${TopicShortName} specifies the suffix.</p>
         * <blockquote>
         * <p> You must specify the Subscribe permission, or Publish and Subscribe permissions for the topic. Make sure that all devices subscribe to the topic.</p>
         * </blockquote>
         * <p>You can use the following methods to view custom topics:</p>
         * <ul>
         * <li>On the <strong>Topic Categories</strong> tab of the Product Details page, view the custom topics of the product.</li>
         * <li>On the <strong>Topic List</strong> tab of the Device Details page, view the custom topics to which the device has subscribed.</li>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/69647.html">QueryProductTopic</a> operation to query the custom topics of the product.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        public Builder topicShortName(String topicShortName) {
            this.putQueryParameter("TopicShortName", topicShortName);
            this.topicShortName = topicShortName;
            return this;
        }

        /**
         * TopicTemplateName.
         */
        public Builder topicTemplateName(String topicTemplateName) {
            this.putQueryParameter("TopicTemplateName", topicTemplateName);
            this.topicTemplateName = topicTemplateName;
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
        public BatchPubRequest build() {
            return new BatchPubRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchPubRequest} extends {@link TeaModel}
     *
     * <p>BatchPubRequest</p>
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

            public UserProp build() {
                return new UserProp(this);
            } 

        } 

    }
}
