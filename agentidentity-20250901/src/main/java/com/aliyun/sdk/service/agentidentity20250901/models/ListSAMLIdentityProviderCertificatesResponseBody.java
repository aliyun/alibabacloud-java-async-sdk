// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListSAMLIdentityProviderCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSAMLIdentityProviderCertificatesResponseBody</p>
 */
public class ListSAMLIdentityProviderCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("X509Certificates")
    private java.util.List<X509Certificates> x509Certificates;

    private ListSAMLIdentityProviderCertificatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.x509Certificates = builder.x509Certificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSAMLIdentityProviderCertificatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return x509Certificates
     */
    public java.util.List<X509Certificates> getX509Certificates() {
        return this.x509Certificates;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<X509Certificates> x509Certificates; 

        private Builder() {
        } 

        private Builder(ListSAMLIdentityProviderCertificatesResponseBody model) {
            this.requestId = model.requestId;
            this.x509Certificates = model.x509Certificates;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * X509Certificates.
         */
        public Builder x509Certificates(java.util.List<X509Certificates> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }

        public ListSAMLIdentityProviderCertificatesResponseBody build() {
            return new ListSAMLIdentityProviderCertificatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSAMLIdentityProviderCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSAMLIdentityProviderCertificatesResponseBody</p>
     */
    public static class X509Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("X509Certificate")
        private String x509Certificate;

        private X509Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.x509Certificate = builder.x509Certificate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static X509Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return x509Certificate
         */
        public String getX509Certificate() {
            return this.x509Certificate;
        }

        public static final class Builder {
            private String certificateId; 
            private String x509Certificate; 

            private Builder() {
            } 

            private Builder(X509Certificates model) {
                this.certificateId = model.certificateId;
                this.x509Certificate = model.x509Certificate;
            } 

            /**
             * CertificateId.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * X509Certificate.
             */
            public Builder x509Certificate(String x509Certificate) {
                this.x509Certificate = x509Certificate;
                return this;
            }

            public X509Certificates build() {
                return new X509Certificates(this);
            } 

        } 

    }
}
