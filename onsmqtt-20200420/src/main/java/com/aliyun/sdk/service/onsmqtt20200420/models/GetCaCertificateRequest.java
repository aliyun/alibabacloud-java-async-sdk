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
 * {@link GetCaCertificateRequest} extends {@link RequestModel}
 *
 * <p>GetCaCertificateRequest</p>
 */
public class GetCaCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    private GetCaCertificateRequest(Builder builder) {
        super(builder);
        this.mqttInstanceId = builder.mqttInstanceId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCaCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<GetCaCertificateRequest, Builder> {
        private String mqttInstanceId; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(GetCaCertificateRequest request) {
            super(request);
            this.mqttInstanceId = request.mqttInstanceId;
            this.sn = request.sn;
        } 

        /**
         * <p>The instance ID bound to the CA certificate, which is the instance ID of the MQTT version of the cloud message queue.</p>
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
         * <p>The SN serial number of the CA certificate to be queried, used to uniquely identify a CA certificate.</p>
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
        public GetCaCertificateRequest build() {
            return new GetCaCertificateRequest(this);
        } 

    } 

}
