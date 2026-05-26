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
 * {@link SetSAMLIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>SetSAMLIdentityProviderResponseBody</p>
 */
public class SetSAMLIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSOIdentityProviderConfiguration")
    private SSOIdentityProviderConfiguration SSOIdentityProviderConfiguration;

    private SetSAMLIdentityProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SSOIdentityProviderConfiguration = builder.SSOIdentityProviderConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSAMLIdentityProviderResponseBody create() {
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
     * @return SSOIdentityProviderConfiguration
     */
    public SSOIdentityProviderConfiguration getSSOIdentityProviderConfiguration() {
        return this.SSOIdentityProviderConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private SSOIdentityProviderConfiguration SSOIdentityProviderConfiguration; 

        private Builder() {
        } 

        private Builder(SetSAMLIdentityProviderResponseBody model) {
            this.requestId = model.requestId;
            this.SSOIdentityProviderConfiguration = model.SSOIdentityProviderConfiguration;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SSOIdentityProviderConfiguration.
         */
        public Builder SSOIdentityProviderConfiguration(SSOIdentityProviderConfiguration SSOIdentityProviderConfiguration) {
            this.SSOIdentityProviderConfiguration = SSOIdentityProviderConfiguration;
            return this;
        }

        public SetSAMLIdentityProviderResponseBody build() {
            return new SetSAMLIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetSAMLIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>SetSAMLIdentityProviderResponseBody</p>
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
    /**
     * 
     * {@link SetSAMLIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>SetSAMLIdentityProviderResponseBody</p>
     */
    public static class SSOIdentityProviderConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("JITProvisionStatus")
        private String JITProvisionStatus;

        @com.aliyun.core.annotation.NameInMap("JITUpdateStatus")
        private String JITUpdateStatus;

        @com.aliyun.core.annotation.NameInMap("LoginURL")
        private String loginURL;

        @com.aliyun.core.annotation.NameInMap("SAMLBindingType")
        private String SAMLBindingType;

        @com.aliyun.core.annotation.NameInMap("SSOStatus")
        private String SSOStatus;

        @com.aliyun.core.annotation.NameInMap("X509Certificates")
        private java.util.List<X509Certificates> x509Certificates;

        private SSOIdentityProviderConfiguration(Builder builder) {
            this.entityId = builder.entityId;
            this.JITProvisionStatus = builder.JITProvisionStatus;
            this.JITUpdateStatus = builder.JITUpdateStatus;
            this.loginURL = builder.loginURL;
            this.SAMLBindingType = builder.SAMLBindingType;
            this.SSOStatus = builder.SSOStatus;
            this.x509Certificates = builder.x509Certificates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SSOIdentityProviderConfiguration create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return JITProvisionStatus
         */
        public String getJITProvisionStatus() {
            return this.JITProvisionStatus;
        }

        /**
         * @return JITUpdateStatus
         */
        public String getJITUpdateStatus() {
            return this.JITUpdateStatus;
        }

        /**
         * @return loginURL
         */
        public String getLoginURL() {
            return this.loginURL;
        }

        /**
         * @return SAMLBindingType
         */
        public String getSAMLBindingType() {
            return this.SAMLBindingType;
        }

        /**
         * @return SSOStatus
         */
        public String getSSOStatus() {
            return this.SSOStatus;
        }

        /**
         * @return x509Certificates
         */
        public java.util.List<X509Certificates> getX509Certificates() {
            return this.x509Certificates;
        }

        public static final class Builder {
            private String entityId; 
            private String JITProvisionStatus; 
            private String JITUpdateStatus; 
            private String loginURL; 
            private String SAMLBindingType; 
            private String SSOStatus; 
            private java.util.List<X509Certificates> x509Certificates; 

            private Builder() {
            } 

            private Builder(SSOIdentityProviderConfiguration model) {
                this.entityId = model.entityId;
                this.JITProvisionStatus = model.JITProvisionStatus;
                this.JITUpdateStatus = model.JITUpdateStatus;
                this.loginURL = model.loginURL;
                this.SAMLBindingType = model.SAMLBindingType;
                this.SSOStatus = model.SSOStatus;
                this.x509Certificates = model.x509Certificates;
            } 

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * JITProvisionStatus.
             */
            public Builder JITProvisionStatus(String JITProvisionStatus) {
                this.JITProvisionStatus = JITProvisionStatus;
                return this;
            }

            /**
             * JITUpdateStatus.
             */
            public Builder JITUpdateStatus(String JITUpdateStatus) {
                this.JITUpdateStatus = JITUpdateStatus;
                return this;
            }

            /**
             * LoginURL.
             */
            public Builder loginURL(String loginURL) {
                this.loginURL = loginURL;
                return this;
            }

            /**
             * SAMLBindingType.
             */
            public Builder SAMLBindingType(String SAMLBindingType) {
                this.SAMLBindingType = SAMLBindingType;
                return this;
            }

            /**
             * SSOStatus.
             */
            public Builder SSOStatus(String SSOStatus) {
                this.SSOStatus = SSOStatus;
                return this;
            }

            /**
             * X509Certificates.
             */
            public Builder x509Certificates(java.util.List<X509Certificates> x509Certificates) {
                this.x509Certificates = x509Certificates;
                return this;
            }

            public SSOIdentityProviderConfiguration build() {
                return new SSOIdentityProviderConfiguration(this);
            } 

        } 

    }
}
