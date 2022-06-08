// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadCertificateRequest} extends {@link RequestModel}
 *
 * <p>UploadCertificateRequest</p>
 */
public class UploadCertificateRequest extends Request {
    @Query
    @NameInMap("Certificate")
    @Validation(required = true)
    private String certificate;

    @Query
    @NameInMap("CertificateChain")
    private String certificateChain;

    @Query
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    private UploadCertificateRequest(Builder builder) {
        super(builder);
        this.certificate = builder.certificate;
        this.certificateChain = builder.certificateChain;
        this.certificateId = builder.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return certificateChain
     */
    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    public static final class Builder extends Request.Builder<UploadCertificateRequest, Builder> {
        private String certificate; 
        private String certificateChain; 
        private String certificateId; 

        private Builder() {
            super();
        } 

        private Builder(UploadCertificateRequest request) {
            super(request);
            this.certificate = request.certificate;
            this.certificateChain = request.certificateChain;
            this.certificateId = request.certificateId;
        } 

        /**
         * Certificate.
         */
        public Builder certificate(String certificate) {
            this.putQueryParameter("Certificate", certificate);
            this.certificate = certificate;
            return this;
        }

        /**
         * CertificateChain.
         */
        public Builder certificateChain(String certificateChain) {
            this.putQueryParameter("CertificateChain", certificateChain);
            this.certificateChain = certificateChain;
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

        @Override
        public UploadCertificateRequest build() {
            return new UploadCertificateRequest(this);
        } 

    } 

}
