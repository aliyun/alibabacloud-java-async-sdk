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
 * {@link InactivateCaCertificateRequest} extends {@link RequestModel}
 *
 * <p>InactivateCaCertificateRequest</p>
 */
public class InactivateCaCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    private InactivateCaCertificateRequest(Builder builder) {
        super(builder);
        this.mqttInstanceId = builder.mqttInstanceId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InactivateCaCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<InactivateCaCertificateRequest, Builder> {
        private String mqttInstanceId; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(InactivateCaCertificateRequest request) {
            super(request);
            this.mqttInstanceId = request.mqttInstanceId;
            this.sn = request.sn;
        } 

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance to which the CA certificate is bound.</p>
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

        /**
         * <p>The serial number of the CA certificate that you want to deregister. The serial number is the unique identifier of a CA certificate.</p>
         * <p>The serial number of a CA certificate cannot exceed 128 bytes in size.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>007269004887******</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public InactivateCaCertificateRequest build() {
            return new InactivateCaCertificateRequest(this);
        } 

    } 

}
