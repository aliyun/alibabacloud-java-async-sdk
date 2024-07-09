// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServerCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServerCertificateResponseBody</p>
 */
public class CreateServerCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateChain")
    private String certificateChain;

    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.NameInMap("X509Certificate")
    private String x509Certificate;

    private CreateServerCertificateResponseBody(Builder builder) {
        this.certificateChain = builder.certificateChain;
        this.identifier = builder.identifier;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServerCertificateResponseBody create() {
        return builder().build();
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

    /**
     * @return x509Certificate
     */
    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public static final class Builder {
        private String certificateChain; 
        private String identifier; 
        private String requestId; 
        private String serialNumber; 
        private String x509Certificate; 

        /**
         * The certificate chain of the server certificate.
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * The unique identifier of the server certificate.
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

        /**
         * The serial number of the server certificate.
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * The content of the server certificate.
         */
        public Builder x509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }

        public CreateServerCertificateResponseBody build() {
            return new CreateServerCertificateResponseBody(this);
        } 

    } 

}
