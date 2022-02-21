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

        private Builder(CertificatePublicKeyEncryptRequest response) {
            super(response);
            this.algorithm = response.algorithm;
            this.certificateId = response.certificateId;
            this.plaintext = response.plaintext;
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
         * Plaintext.
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
