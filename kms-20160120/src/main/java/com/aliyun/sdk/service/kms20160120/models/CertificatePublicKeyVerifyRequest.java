// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePublicKeyVerifyRequest} extends {@link RequestModel}
 *
 * <p>CertificatePublicKeyVerifyRequest</p>
 */
public class CertificatePublicKeyVerifyRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    @Query
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Query
    @NameInMap("MessageType")
    @Validation(required = true)
    private String messageType;

    @Query
    @NameInMap("SignatureValue")
    @Validation(required = true)
    private String signatureValue;

    private CertificatePublicKeyVerifyRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certificateId = builder.certificateId;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.signatureValue = builder.signatureValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePublicKeyVerifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
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

    public static final class Builder extends Request.Builder<CertificatePublicKeyVerifyRequest, Builder> {
        private String algorithm; 
        private String certificateId; 
        private String message; 
        private String messageType; 
        private String signatureValue; 

        private Builder() {
            super();
        } 

        private Builder(CertificatePublicKeyVerifyRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certificateId = request.certificateId;
            this.message = request.message;
            this.messageType = request.messageType;
            this.signatureValue = request.signatureValue;
        } 

        /**
         * The signature algorithm. Valid values:
         * <p>
         * 
         * *   RSA_PKCS1\_SHA\_256
         * 
         * *   RSA_PSS_SHA\_256
         * 
         * *   ECDSA_SHA\_256
         * 
         * *   SM2DSA
         * 
         * > The SM2DSA signature algorithm is supported only in regions where managed hardware security modules (HSMs) are used in the Chinese mainland. For more information, see [Managed HSM overview](~~125803~~).
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The ID of the certificate. The ID must be globally unique in Certificates Manager.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The raw data that is signed.
         * <p>
         * 
         * The value is encoded in Base64. For example, if the raw data in the hexadecimal format is `[0x31, 0x32, 0x33, 0x34]`, set this parameter to the Base64-encoded value `MTIzNA==`.
         * 
         * If the MessageType parameter is set to RAW, the size of the data must be less than or equal to 4 KB.
         * 
         * If the size of the data is greater than 4 KB, you can set the MessageType parameter to DIGEST and set the Message parameter to the digest of the data. The digest is also called hash value. You can compute the digest of the data on an on-premises device. Certificates Manager uses the digest that you compute in your own certificate application system. The message digest algorithm that you use must match the specified signature algorithm. Comply with the following mapping between signature algorithms and message digest algorithms:
         * 
         * *   If the signature algorithm is RSA_PKCS1\_SHA\_256, RSA_PSS_SHA\_256, or ECDSA_SHA\_256, the message digest algorithm must be SHA-256.
         * *   If the signature algorithm is SM2DSA, the message digest algorithm must be SM3.
         * 
         * >  If the key type of the certificate is EC_SM2 and the MessageType parameter is set to DIGEST, the value of the Message parameter is `e` that is described in GB/T 32918.2-2016 6.1.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * The type of the message. Valid values:
         * <p>
         * 
         * *   RAW: the raw data. This is the default value.
         * *   DIGEST: the message digest (hash value) of the raw data.
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * The signature value.
         * <p>
         * 
         * The value is encoded in Base64.
         */
        public Builder signatureValue(String signatureValue) {
            this.putQueryParameter("SignatureValue", signatureValue);
            this.signatureValue = signatureValue;
            return this;
        }

        @Override
        public CertificatePublicKeyVerifyRequest build() {
            return new CertificatePublicKeyVerifyRequest(this);
        } 

    } 

}
