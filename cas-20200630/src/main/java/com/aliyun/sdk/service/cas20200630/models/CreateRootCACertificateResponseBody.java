// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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

        private Builder() {
        } 

        private Builder(CreateRootCACertificateResponseBody model) {
            this.certificate = model.certificate;
            this.certificateChain = model.certificateChain;
            this.identifier = model.identifier;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The root CA certificate in the PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----</p>
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The certificate chain of the root CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n</p>
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * <p>The unique identifier of the root CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1a83bcbb89e562885e40aa0108f5****</p>
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6D9B4C5F-7140-5B41-924C-329181DC00C1</p>
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
