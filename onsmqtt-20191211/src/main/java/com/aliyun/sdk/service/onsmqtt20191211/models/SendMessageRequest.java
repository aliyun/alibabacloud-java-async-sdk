// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20191211.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageRequest} extends {@link RequestModel}
 *
 * <p>SendMessageRequest</p>
 */
public class SendMessageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MqttTopic")
    @Validation(required = true)
    private String mqttTopic;

    @Query
    @NameInMap("Payload")
    @Validation(required = true)
    private String payload;

    @Query
    @NameInMap("ReceiptId")
    private String receiptId;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.mqttTopic = builder.mqttTopic;
        this.payload = builder.payload;
        this.receiptId = builder.receiptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mqttTopic
     */
    public String getMqttTopic() {
        return this.mqttTopic;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return receiptId
     */
    public String getReceiptId() {
        return this.receiptId;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String mqttTopic; 
        private String payload; 
        private String receiptId; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.mqttTopic = request.mqttTopic;
            this.payload = request.payload;
            this.receiptId = request.receiptId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MqttTopic.
         */
        public Builder mqttTopic(String mqttTopic) {
            this.putQueryParameter("MqttTopic", mqttTopic);
            this.mqttTopic = mqttTopic;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(String payload) {
            this.putQueryParameter("Payload", payload);
            this.payload = payload;
            return this;
        }

        /**
         * ReceiptId.
         */
        public Builder receiptId(String receiptId) {
            this.putQueryParameter("ReceiptId", receiptId);
            this.receiptId = receiptId;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

}
