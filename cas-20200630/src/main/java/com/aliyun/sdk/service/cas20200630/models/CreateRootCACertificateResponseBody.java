// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRootCACertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRootCACertificateResponseBody</p>
 */
public class CreateRootCACertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.NameInMap("CertificateChain")
    private String certificateChain;

    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRootCACertificateResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.certificateChain = builder.certificateChain;
        this.identifier = builder.identifier;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRootCACertificateResponseBody create() {
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
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
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
        private String identifier; 
        private String requestId; 

        /**
         * The root CA certificate in the PEM format.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * The certificate chain of the root CA certificate.
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * The unique identifier of the root CA certificate.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRootCACertificateResponseBody build() {
            return new CreateRootCACertificateResponseBody(this);
        } 

    } 

}
