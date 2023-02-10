// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PubRequest} extends {@link RequestModel}
 *
 * <p>PubRequest</p>
 */
public class PubRequest extends Request {
    @Query
    @NameInMap("ContentType")
    private String contentType;

    @Query
    @NameInMap("CorrelationData")
    private String correlationData;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("MessageContent")
    @Validation(required = true)
    private String messageContent;

    @Query
    @NameInMap("PayloadFormatIndicator")
    private Integer payloadFormatIndicator;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("Qos")
    private Integer qos;

    @Query
    @NameInMap("ResponseTopic")
    private String responseTopic;

    @Query
    @NameInMap("TopicFullName")
    @Validation(required = true)
    private String topicFullName;

    @Query
    @NameInMap("UserProp")
    private java.util.List < UserProp> userProp;

    private PubRequest(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
        this.correlationData = builder.correlationData;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.messageContent = builder.messageContent;
        this.payloadFormatIndicator = builder.payloadFormatIndicator;
        this.productKey = builder.productKey;
        this.qos = builder.qos;
        this.responseTopic = builder.responseTopic;
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
     * @return topicFullName
     */
    public String getTopicFullName() {
        return this.topicFullName;
    }

    /**
     * @return userProp
     */
    public java.util.List < UserProp> getUserProp() {
        return this.userProp;
    }

    public static final class Builder extends Request.Builder<PubRequest, Builder> {
        private String contentType; 
        private String correlationData; 
        private String deviceName; 
        private String iotInstanceId; 
        private String messageContent; 
        private Integer payloadFormatIndicator; 
        private String productKey; 
        private Integer qos; 
        private String responseTopic; 
        private String topicFullName; 
        private java.util.List < UserProp> userProp; 

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
            this.payloadFormatIndicator = request.payloadFormatIndicator;
            this.productKey = request.productKey;
            this.qos = request.qos;
            this.responseTopic = request.responseTopic;
            this.topicFullName = request.topicFullName;
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
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * MessageContent.
         */
        public Builder messageContent(String messageContent) {
            this.putBodyParameter("MessageContent", messageContent);
            this.messageContent = messageContent;
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
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * Qos.
         */
        public Builder qos(Integer qos) {
            this.putQueryParameter("Qos", qos);
            this.qos = qos;
            return this;
        }

        /**
         * ResponseTopic.
         */
        public Builder responseTopic(String responseTopic) {
            this.putQueryParameter("ResponseTopic", responseTopic);
            this.responseTopic = responseTopic;
            return this;
        }

        /**
         * TopicFullName.
         */
        public Builder topicFullName(String topicFullName) {
            this.putQueryParameter("TopicFullName", topicFullName);
            this.topicFullName = topicFullName;
            return this;
        }

        /**
         * UserProp.
         */
        public Builder userProp(java.util.List < UserProp> userProp) {
            this.putQueryParameter("UserProp", userProp);
            this.userProp = userProp;
            return this;
        }

        @Override
        public PubRequest build() {
            return new PubRequest(this);
        } 

    } 

    public static class UserProp extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
