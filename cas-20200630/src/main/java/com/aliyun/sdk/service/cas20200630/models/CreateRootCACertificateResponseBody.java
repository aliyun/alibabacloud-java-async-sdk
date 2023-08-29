// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRootCACertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRootCACertificateResponseBody</p>
 */
public class CreateRootCACertificateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    private String certificate;

    @NameInMap("CertificateChain")
    private String certificateChain;

    @NameInMap("Identifier")
    private String identifier;

    @NameInMap("RequestId")
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
         * The name of the city in which the organization is located. The value can contain letters.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * RSA_2048
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
         * Zhejiang
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
