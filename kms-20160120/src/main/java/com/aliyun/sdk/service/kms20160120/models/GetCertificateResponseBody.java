// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertificateResponseBody</p>
 */
public class GetCertificateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    private String certificate;

    @NameInMap("CertificateChain")
    private String certificateChain;

    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("Csr")
    private String csr;

    @NameInMap("RequestId")
    private String requestId;

    private GetCertificateResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.certificateChain = builder.certificateChain;
        this.certificateId = builder.certificateId;
        this.csr = builder.csr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateResponseBody create() {
        return builder().build();
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

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certificate; 
        private String certificateChain; 
        private String certificateId; 
        private String csr; 
        private String requestId; 

        /**
         * Certificate.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * CertificateChain.
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * Csr.
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCertificateResponseBody build() {
            return new GetCertificateResponseBody(this);
        } 

    } 

}
