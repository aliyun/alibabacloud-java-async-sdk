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
    @NameInMap("CorrelationData")
    private String correlationData;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("MessageContent")
    @Validation(required = true)
    private String messageContent;

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
        this.correlationData = builder.correlationData;
        this.iotInstanceId = builder.iotInstanceId;
        this.messageContent = builder.messageContent;
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
     * @return correlationData
     */
    public String getCorrelationData() {
        return this.correlationData;
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
        private String correlationData; 
        private String iotInstanceId; 
        private String messageContent; 
        private String productKey; 
        private Integer qos; 
        private String responseTopic; 
        private String topicFullName; 
        private java.util.List < UserProp> userProp; 

        private Builder() {
            super();
        } 

        private Builder(PubRequest response) {
            super(response);
            this.correlationData = response.correlationData;
            this.iotInstanceId = response.iotInstanceId;
            this.messageContent = response.messageContent;
            this.productKey = response.productKey;
            this.qos = response.qos;
            this.responseTopic = response.responseTopic;
            this.topicFullName = response.topicFullName;
            this.userProp = response.userProp;
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
            this.putQueryParameter("MessageContent", messageContent);
            this.messageContent = messageContent;
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
