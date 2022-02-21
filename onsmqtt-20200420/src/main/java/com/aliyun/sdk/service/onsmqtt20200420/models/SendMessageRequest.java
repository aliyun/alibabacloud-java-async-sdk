// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mqttTopic = builder.mqttTopic;
        this.payload = builder.payload;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private String instanceId; 
        private String mqttTopic; 
        private String payload; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.mqttTopic = response.mqttTopic;
            this.payload = response.payload;
            this.regionId = response.regionId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

}
