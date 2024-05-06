// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyRequest} extends {@link RequestModel}
 *
 * <p>VerifyRequest</p>
 */
public class VerifyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signatureValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SigningAlgorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signingAlgorithm;

    private VerifyRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.signatureValue = builder.signatureValue;
        this.signingAlgorithm = builder.signingAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return signatureValue
     */
    public String getSignatureValue() {
        return this.signatureValue;
    }

    /**
     * @return signingAlgorithm
     */
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    public static final class Builder extends Request.Builder<VerifyRequest, Builder> {
        private String certIdentifier; 
        private String message; 
        private String messageType; 
        private String signatureValue; 
        private String signingAlgorithm; 

        private Builder() {
            super();
        } 

        private Builder(VerifyRequest request) {
            super(request);
            this.certIdentifier = request.certIdentifier;
            this.message = request.message;
            this.messageType = request.messageType;
            this.signatureValue = request.signatureValue;
            this.signingAlgorithm = request.signingAlgorithm;
        } 

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * MessageType.
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * SignatureValue.
         */
        public Builder signatureValue(String signatureValue) {
            this.putQueryParameter("SignatureValue", signatureValue);
            this.signatureValue = signatureValue;
            return this;
        }

        /**
         * SigningAlgorithm.
         */
        public Builder signingAlgorithm(String signingAlgorithm) {
            this.putQueryParameter("SigningAlgorithm", signingAlgorithm);
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }

        @Override
        public VerifyRequest build() {
            return new VerifyRequest(this);
        } 

    } 

}
