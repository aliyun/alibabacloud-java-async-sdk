// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchPubRequest} extends {@link RequestModel}
 *
 * <p>BatchPubRequest</p>
 */
public class BatchPubRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    @Validation(required = true)
    private java.util.List < String > deviceName;

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
    @NameInMap("TopicShortName")
    @Validation(required = true)
    private String topicShortName;

    private BatchPubRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.messageContent = builder.messageContent;
        this.productKey = builder.productKey;
        this.qos = builder.qos;
        this.topicShortName = builder.topicShortName;
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
     * @return deviceName
     */
    public java.util.List < String > getDeviceName() {
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
     * @return topicShortName
     */
    public String getTopicShortName() {
        return this.topicShortName;
    }

    public static final class Builder extends Request.Builder<BatchPubRequest, Builder> {
        private java.util.List < String > deviceName; 
        private String iotInstanceId; 
        private String messageContent; 
        private String productKey; 
        private Integer qos; 
        private String topicShortName; 

        private Builder() {
            super();
        } 

        private Builder(BatchPubRequest response) {
            super(response);
            this.deviceName = response.deviceName;
            this.iotInstanceId = response.iotInstanceId;
            this.messageContent = response.messageContent;
            this.productKey = response.productKey;
            this.qos = response.qos;
            this.topicShortName = response.topicShortName;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(java.util.List < String > deviceName) {
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
         * TopicShortName.
         */
        public Builder topicShortName(String topicShortName) {
            this.putQueryParameter("TopicShortName", topicShortName);
            this.topicShortName = topicShortName;
            return this;
        }

        @Override
        public BatchPubRequest build() {
            return new BatchPubRequest(this);
        } 

    } 

}
