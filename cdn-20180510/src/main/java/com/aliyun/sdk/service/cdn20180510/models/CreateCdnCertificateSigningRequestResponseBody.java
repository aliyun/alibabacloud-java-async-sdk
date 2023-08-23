// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdnCertificateSigningRequestResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCdnCertificateSigningRequestResponseBody</p>
 */
public class CreateCdnCertificateSigningRequestResponseBody extends TeaModel {
    @NameInMap("CommonName")
    private String commonName;

    @NameInMap("Csr")
    private String csr;

    @NameInMap("PubMd5")
    private String pubMd5;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCdnCertificateSigningRequestResponseBody(Builder builder) {
        this.commonName = builder.commonName;
        this.csr = builder.csr;
        this.pubMd5 = builder.pubMd5;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdnCertificateSigningRequestResponseBody create() {
        return builder().build();
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return pubMd5
     */
    public String getPubMd5() {
        return this.pubMd5;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String commonName; 
        private String csr; 
        private String pubMd5; 
        private String requestId; 

        /**
         * The Common Name of the certificate.
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * The content of the CSR file.
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * The MD5 hash value of the certificate public key.
         */
        public Builder pubMd5(String pubMd5) {
            this.pubMd5 = pubMd5;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCdnCertificateSigningRequestResponseBody build() {
            return new CreateCdnCertificateSigningRequestResponseBody(this);
        } 

    } 

}
