// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomCertificateResponseBody</p>
 */
public class CreateCustomCertificateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    private String certificate;

    @NameInMap("CertificateChain")
    private String certificateChain;

    @NameInMap("Identifier")
    private String identifier;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SerialNumber")
    private String serialNumber;

    private CreateCustomCertificateResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.certificateChain = builder.certificateChain;
        this.identifier = builder.identifier;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomCertificateResponseBody create() {
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

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder {
        private String certificate; 
        private String certificateChain; 
        private String identifier; 
        private String requestId; 
        private String serialNumber; 

        /**
         * The content of the certificate. This parameter is returned only if Immediately is set to 1 or 2.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * The certificate chain of the certificate. This parameter is returned only if Immediately is set to 2.
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * The unique identifier of the certificate.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The serial number of the certificate. This parameter is returned only if Immediately is set to 1 or 2.
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public CreateCustomCertificateResponseBody build() {
            return new CreateCustomCertificateResponseBody(this);
        } 

    } 

}
