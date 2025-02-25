// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePrivateKeyDecryptRequest} extends {@link RequestModel}
 *
 * <p>CertificatePrivateKeyDecryptRequest</p>
 */
public class CertificatePrivateKeyDecryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ciphertextBlob;

    private CertificatePrivateKeyDecryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certificateId = builder.certificateId;
        this.ciphertextBlob = builder.ciphertextBlob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePrivateKeyDecryptRequest create() {
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
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public static final class Builder extends Request.Builder<CertificatePrivateKeyDecryptRequest, Builder> {
        private String algorithm; 
        private String certificateId; 
        private String ciphertextBlob; 

        private Builder() {
            super();
        } 

        private Builder(CertificatePrivateKeyDecryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certificateId = request.certificateId;
            this.ciphertextBlob = request.ciphertextBlob;
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
         * > The SM2PKE encryption algorithm is supported only in regions in mainland China. In these regions, managed hardware security modules (HSMs) are used. For more information, see [Managed HSM overview](~~125803~~).
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
         * The data that you want to decrypt.
         * <p>
         * 
         * The value is encoded in Base64.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        @Override
        public CertificatePrivateKeyDecryptRequest build() {
            return new CertificatePrivateKeyDecryptRequest(this);
        } 

    } 

}
