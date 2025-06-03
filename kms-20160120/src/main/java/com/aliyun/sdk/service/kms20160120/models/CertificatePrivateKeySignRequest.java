// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link CertificatePrivateKeySignRequest} extends {@link RequestModel}
 *
 * <p>CertificatePrivateKeySignRequest</p>
 */
public class CertificatePrivateKeySignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageType;

    private CertificatePrivateKeySignRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certificateId = builder.certificateId;
        this.message = builder.message;
        this.messageType = builder.messageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePrivateKeySignRequest create() {
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

    public static final class Builder extends Request.Builder<CertificatePrivateKeySignRequest, Builder> {
        private String algorithm; 
        private String certificateId; 
        private String message; 
        private String messageType; 

        private Builder() {
            super();
        } 

        private Builder(CertificatePrivateKeySignRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certificateId = request.certificateId;
            this.message = request.message;
            this.messageType = request.messageType;
        } 

        /**
         * <p>The signature algorithm. Valid values:</p>
         * <ul>
         * <li><p>RSA_PKCS1_SHA_256</p>
         * </li>
         * <li><p>RSA_PSS_SHA_256</p>
         * </li>
         * <li><p>ECDSA_SHA_256</p>
         * </li>
         * <li><p>SM2DSA</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The SM2DSA signature algorithm is supported only in regions where managed hardware security modules (HSMs) are used in mainland China. For more information, see <a href="https://help.aliyun.com/document_detail/125803.html">Managed HSM overview</a>.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECDSA_SHA_256</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The ID of the certificate. The ID must be globally unique in Certificates Manager.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-12345678****</p>
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The data to be signed.</p>
         * <p>The value is encoded in Base64. For example, if the hexadecimal data that you want to sign is <code>[0x31, 0x32, 0x33, 0x34]</code>, the Base64-encoded data is <code>MTIzNA==</code>.</p>
         * <p>If the MessageType parameter is set to RAW, the size of the data must be less than or equal to 4 KB.</p>
         * <p>If the size of the data is greater than 4 KB, you can set the MessageType parameter to DIGEST and set the Message parameter to the digest of the data. The digest is also called hash value. You can compute the digest of the data on an on-premises machine. Certificates Manager uses the digest that you compute in your own certificate application system. The message digest algorithm that you use must match the specified signature algorithm. Comply with the following mapping between signature algorithms and message digest algorithms:</p>
         * <ul>
         * <li>If the signature algorithm is RSA_PKCS1_SHA_256, RSA_PSS_SHA_256, or ECDSA_SHA_256, the message digest algorithm must be SHA-256.</li>
         * <li>If the signature algorithm is SM2DSA, the message digest algorithm must be SM3.</li>
         * </ul>
         * <blockquote>
         * <p> If the key type of the certificate is EC_SM2 and the MessageType parameter is set to DIGEST, the value of the Message parameter is <code>e</code> that is described in GB/T 32918.2-2016 6.1.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>The type of the message. Valid values:</p>
         * <ul>
         * <li>RAW: the raw data. This is the default value.</li>
         * <li>DIGEST: the message digest (hash value) of the raw data.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RAW</p>
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        @Override
        public CertificatePrivateKeySignRequest build() {
            return new CertificatePrivateKeySignRequest(this);
        } 

    } 

}
