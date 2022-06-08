// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePrivateKeyDecryptRequest} extends {@link RequestModel}
 *
 * <p>CertificatePrivateKeyDecryptRequest</p>
 */
public class CertificatePrivateKeyDecryptRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    @Query
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
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
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * CiphertextBlob.
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
