// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RegisterCaCertificateRequest} extends {@link RequestModel}
 *
 * <p>RegisterCaCertificateRequest</p>
 */
public class RegisterCaCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerificationContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verificationContent;

    private RegisterCaCertificateRequest(Builder builder) {
        super(builder);
        this.caContent = builder.caContent;
        this.caName = builder.caName;
        this.mqttInstanceId = builder.mqttInstanceId;
        this.verificationContent = builder.verificationContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterCaCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caContent
     */
    public String getCaContent() {
        return this.caContent;
    }

    /**
     * @return caName
     */
    public String getCaName() {
        return this.caName;
    }

    /**
     * @return mqttInstanceId
     */
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    /**
     * @return verificationContent
     */
    public String getVerificationContent() {
        return this.verificationContent;
    }

    public static final class Builder extends Request.Builder<RegisterCaCertificateRequest, Builder> {
        private String caContent; 
        private String caName; 
        private String mqttInstanceId; 
        private String verificationContent; 

        private Builder() {
            super();
        } 

        private Builder(RegisterCaCertificateRequest request) {
            super(request);
            this.caContent = request.caContent;
            this.caName = request.caName;
            this.mqttInstanceId = request.mqttInstanceId;
            this.verificationContent = request.verificationContent;
        } 

        /**
         * <p>Content of the CA certificate to be registered.</p>
         * <blockquote>
         * <p>Note that \n in the example represents a new line.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END CERTIFICATE-----</p>
         */
        public Builder caContent(String caContent) {
            this.putQueryParameter("CaContent", caContent);
            this.caContent = caContent;
            return this;
        }

        /**
         * <p>Name of the CA certificate to be registered</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt_ca</p>
         */
        public Builder caName(String caName) {
            this.putQueryParameter("CaName", caName);
            this.caName = caName;
            return this;
        }

        /**
         * <p>The instance ID of the Cloud Message Queue MQTT version. When registering a CA certificate, you need to specify an instance to bind with.</p>
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
         * <p>Content of the verification certificate for the CA certificate to be registered. It is used together with the registration code of the CA certificate to verify that the user possesses the private key of this CA certificate. </p>
         * <blockquote>
         * <p> in the example represents a line break.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIID/DCCAu+Y5sRMpp9tnd+4s******\n-----END CERTIFICATE-----</p>
         */
        public Builder verificationContent(String verificationContent) {
            this.putQueryParameter("VerificationContent", verificationContent);
            this.verificationContent = verificationContent;
            return this;
        }

        @Override
        public RegisterCaCertificateRequest build() {
            return new RegisterCaCertificateRequest(this);
        } 

    } 

}
