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
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li><p>RSAES_OAEP_SHA_1</p>
         * </li>
         * <li><p>RSAES_OAEP_SHA_256</p>
         * </li>
         * <li><p>SM2PKE</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The SM2PKE encryption algorithm is supported only in regions in mainland China. In these regions, managed hardware security modules (HSMs) are used. For more information, see <a href="https://help.aliyun.com/document_detail/125803.html">Managed HSM overview</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSAES_OAEP_SHA_256</p>
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
         * <p>The data that you want to decrypt.</p>
         * <p>The value is encoded in Base64.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</p>
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
