// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterCaCertificateRequest} extends {@link RequestModel}
 *
 * <p>RegisterCaCertificateRequest</p>
 */
public class RegisterCaCertificateRequest extends Request {
    @Query
    @NameInMap("CaContent")
    @Validation(required = true)
    private String caContent;

    @Query
    @NameInMap("CaName")
    @Validation(required = true)
    private String caName;

    @Query
    @NameInMap("MqttInstanceId")
    @Validation(required = true)
    private String mqttInstanceId;

    @Query
    @NameInMap("VerificationContent")
    @Validation(required = true)
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
         * CaContent.
         */
        public Builder caContent(String caContent) {
            this.putQueryParameter("CaContent", caContent);
            this.caContent = caContent;
            return this;
        }

        /**
         * CaName.
         */
        public Builder caName(String caName) {
            this.putQueryParameter("CaName", caName);
            this.caName = caName;
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

        /**
         * VerificationContent.
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
