// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InactivateDeviceCertificateRequest} extends {@link RequestModel}
 *
 * <p>InactivateDeviceCertificateRequest</p>
 */
public class InactivateDeviceCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttInstanceId;

    private InactivateDeviceCertificateRequest(Builder builder) {
        super(builder);
        this.caSn = builder.caSn;
        this.deviceSn = builder.deviceSn;
        this.mqttInstanceId = builder.mqttInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InactivateDeviceCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caSn
     */
    public String getCaSn() {
        return this.caSn;
    }

    /**
     * @return deviceSn
     */
    public String getDeviceSn() {
        return this.deviceSn;
    }

    /**
     * @return mqttInstanceId
     */
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public static final class Builder extends Request.Builder<InactivateDeviceCertificateRequest, Builder> {
        private String caSn; 
        private String deviceSn; 
        private String mqttInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(InactivateDeviceCertificateRequest request) {
            super(request);
            this.caSn = request.caSn;
            this.deviceSn = request.deviceSn;
            this.mqttInstanceId = request.mqttInstanceId;
        } 

        /**
         * CaSn.
         */
        public Builder caSn(String caSn) {
            this.putQueryParameter("CaSn", caSn);
            this.caSn = caSn;
            return this;
        }

        /**
         * DeviceSn.
         */
        public Builder deviceSn(String deviceSn) {
            this.putQueryParameter("DeviceSn", deviceSn);
            this.deviceSn = deviceSn;
            return this;
        }

        /**
         * MqttInstanceId.
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.putQueryParameter("MqttInstanceId", mqttInstanceId);
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        @Override
        public InactivateDeviceCertificateRequest build() {
            return new InactivateDeviceCertificateRequest(this);
        } 

    } 

}
