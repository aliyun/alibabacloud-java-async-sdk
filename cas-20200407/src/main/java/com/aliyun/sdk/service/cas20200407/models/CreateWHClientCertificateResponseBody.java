// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWHClientCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWHClientCertificateResponseBody</p>
 */
public class CreateWHClientCertificateResponseBody extends TeaModel {
    @NameInMap("CertificateChain")
    private String certificateChain;

    @NameInMap("Identifier")
    private String identifier;

    @NameInMap("ParentX509Certificate")
    private String parentX509Certificate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RootX509Certificate")
    private String rootX509Certificate;

    @NameInMap("X509Certificate")
    private String x509Certificate;

    private CreateWHClientCertificateResponseBody(Builder builder) {
        this.certificateChain = builder.certificateChain;
        this.identifier = builder.identifier;
        this.parentX509Certificate = builder.parentX509Certificate;
        this.requestId = builder.requestId;
        this.rootX509Certificate = builder.rootX509Certificate;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWHClientCertificateResponseBody create() {
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
     * @return parentX509Certificate
     */
    public String getParentX509Certificate() {
        return this.parentX509Certificate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootX509Certificate
     */
    public String getRootX509Certificate() {
        return this.rootX509Certificate;
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
        private String parentX509Certificate; 
        private String requestId; 
        private String rootX509Certificate; 
        private String x509Certificate; 

        /**
         * CertificateChain.
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * ParentX509Certificate.
         */
        public Builder parentX509Certificate(String parentX509Certificate) {
            this.parentX509Certificate = parentX509Certificate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootX509Certificate.
         */
        public Builder rootX509Certificate(String rootX509Certificate) {
            this.rootX509Certificate = rootX509Certificate;
            return this;
        }

        /**
         * X509Certificate.
         */
        public Builder x509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }

        public CreateWHClientCertificateResponseBody build() {
            return new CreateWHClientCertificateResponseBody(this);
        } 

    } 

}
