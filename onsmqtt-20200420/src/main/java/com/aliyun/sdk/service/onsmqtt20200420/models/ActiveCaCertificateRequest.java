// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActiveCaCertificateRequest} extends {@link RequestModel}
 *
 * <p>ActiveCaCertificateRequest</p>
 */
public class ActiveCaCertificateRequest extends Request {
    @Query
    @NameInMap("MqttInstanceId")
    @Validation(required = true)
    private String mqttInstanceId;

    @Query
    @NameInMap("Sn")
    @Validation(required = true)
    private String sn;

    private ActiveCaCertificateRequest(Builder builder) {
        super(builder);
        this.mqttInstanceId = builder.mqttInstanceId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveCaCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mqttInstanceId
     */
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder extends Request.Builder<ActiveCaCertificateRequest, Builder> {
        private String mqttInstanceId; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(ActiveCaCertificateRequest request) {
            super(request);
            this.mqttInstanceId = request.mqttInstanceId;
            this.sn = request.sn;
        } 

        /**
         * MqttInstanceId.
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.putQueryParameter("MqttInstanceId", mqttInstanceId);
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        /**
         * Sn.
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public ActiveCaCertificateRequest build() {
            return new ActiveCaCertificateRequest(this);
        } 

    } 

}
