// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link GetDeviceCertificateRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceCertificateRequest</p>
 */
public class GetDeviceCertificateRequest extends Request {
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

    private GetDeviceCertificateRequest(Builder builder) {
        super(builder);
        this.caSn = builder.caSn;
        this.deviceSn = builder.deviceSn;
        this.mqttInstanceId = builder.mqttInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<GetDeviceCertificateRequest, Builder> {
        private String caSn; 
        private String deviceSn; 
        private String mqttInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceCertificateRequest request) {
            super(request);
            this.caSn = request.caSn;
            this.deviceSn = request.deviceSn;
            this.mqttInstanceId = request.mqttInstanceId;
        } 

        /**
         * <p>The SN serial number of the CA certificate to which the device certificate to be queried belongs, used to uniquely identify a CA certificate. Value range: no more than 128 bytes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>007269004887******</p>
         */
        public Builder caSn(String caSn) {
            this.putQueryParameter("CaSn", caSn);
            this.caSn = caSn;
            return this;
        }

        /**
         * <p>The SN serial number of the device certificate to be queried, used to uniquely identify a device certificate. Value range: no more than 128 bytes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>356217374433******</p>
         */
        public Builder deviceSn(String deviceSn) {
            this.putQueryParameter("DeviceSn", deviceSn);
            this.deviceSn = deviceSn;
            return this;
        }

        /**
         * <p>The instance ID to which the device certificate is bound, i.e., the instance ID of the Cloud Message Queue MQTT version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-7mz2d******</p>
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.putQueryParameter("MqttInstanceId", mqttInstanceId);
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        @Override
        public GetDeviceCertificateRequest build() {
            return new GetDeviceCertificateRequest(this);
        } 

    } 

}
