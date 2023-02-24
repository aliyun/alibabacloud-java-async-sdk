// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePublicKeyEncryptRequest} extends {@link RequestModel}
 *
 * <p>CertificatePublicKeyEncryptRequest</p>
 */
public class CertificatePublicKeyEncryptRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    @Query
    @NameInMap("Plaintext")
    @Validation(required = true)
    private String plaintext;

    private CertificatePublicKeyEncryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certificateId = builder.certificateId;
        this.plaintext = builder.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePublicKeyEncryptRequest create() {
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
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    public static final class Builder extends Request.Builder<CertificatePublicKeyEncryptRequest, Builder> {
        private String algorithm; 
        private String certificateId; 
        private String plaintext; 

        private Builder() {
            super();
        } 

        private Builder(CertificatePublicKeyEncryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certificateId = request.certificateId;
            this.plaintext = request.plaintext;
        } 

        /**
         * The encryption algorithm. Valid values:
         * <p>
         * 
         * *   RSAES_OAEP_SHA\_1
         * 
         * *   RSAES_OAEP_SHA\_256
         * 
         * *   SM2PKE
         * 
         * >The SM2PKE encryption algorithm is supported only in regions in mainland China. In these regions, managed hardware security modules (HSMs) are used. For more information, see [Managed HSM overview](~~125803~~).
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
         * The data that you want to encrypt.
         * <p>
         * 
         * The value is encoded in Base64. For example, if the hexadecimal data that you want to encrypt is `[0x31, 0x32, 0x33, 0x34]`, the Base64-encoded data is `MTIzNA==`.
         * 
         * The size of data that can be encrypted varies based on the encryption algorithm that you use:
         * 
         * *   RSAES_OAEP_SHA\_1: 214 bytes
         * *   RSAES_OAEP_SHA\_256: 190 bytes
         * *   SM2PKE: 6,047 bytes
         * 
         * If the size of data that you want to encrypt exceeds the preceding limits, you can call the [GenerateDataKey](~~28948~~) operation to generate a data key to encrypt the data. Then, call the CertificatePublicKeyEncrypt operation to encrypt the data key.
         */
        public Builder plaintext(String plaintext) {
            this.putQueryParameter("Plaintext", plaintext);
            this.plaintext = plaintext;
            return this;
        }

        @Override
        public CertificatePublicKeyEncryptRequest build() {
            return new CertificatePublicKeyEncryptRequest(this);
        } 

    } 

}
