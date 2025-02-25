// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListExternalSAMLIdPCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExternalSAMLIdPCertificatesResponseBody</p>
 */
public class ListExternalSAMLIdPCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLIdPCertificates")
    private java.util.List < SAMLIdPCertificates> SAMLIdPCertificates;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
    private Integer totalCounts;

    private ListExternalSAMLIdPCertificatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SAMLIdPCertificates = builder.SAMLIdPCertificates;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExternalSAMLIdPCertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SAMLIdPCertificates
     */
    public java.util.List < SAMLIdPCertificates> getSAMLIdPCertificates() {
        return this.SAMLIdPCertificates;
    }

    /**
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SAMLIdPCertificates> SAMLIdPCertificates; 
        private Integer totalCounts; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>400979BC-92EC-58B9-B47C-6913BD56A6FD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SAML signing certificates.</p>
         */
        public Builder SAMLIdPCertificates(java.util.List < SAMLIdPCertificates> SAMLIdPCertificates) {
            this.SAMLIdPCertificates = SAMLIdPCertificates;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListExternalSAMLIdPCertificatesResponseBody build() {
            return new ListExternalSAMLIdPCertificatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExternalSAMLIdPCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExternalSAMLIdPCertificatesResponseBody</p>
     */
    public static class SAMLIdPCertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private String notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private String notBefore;

        @com.aliyun.core.annotation.NameInMap("PublicKey")
        private String publicKey;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("SignatureAlgorithm")
        private String signatureAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("X509Certificate")
        private String x509Certificate;

        private SAMLIdPCertificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.issuer = builder.issuer;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.publicKey = builder.publicKey;
            this.serialNumber = builder.serialNumber;
            this.signatureAlgorithm = builder.signatureAlgorithm;
            this.subject = builder.subject;
            this.version = builder.version;
            this.x509Certificate = builder.x509Certificate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLIdPCertificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return notAfter
         */
        public String getNotAfter() {
            return this.notAfter;
        }

        /**
         * @return notBefore
         */
        public String getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return signatureAlgorithm
         */
        public String getSignatureAlgorithm() {
            return this.signatureAlgorithm;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return x509Certificate
         */
        public String getX509Certificate() {
            return this.x509Certificate;
        }

        public static final class Builder {
            private String certificateId; 
            private String issuer; 
            private String notAfter; 
            private String notBefore; 
            private String publicKey; 
            private String serialNumber; 
            private String signatureAlgorithm; 
            private String subject; 
            private Integer version; 
            private String x509Certificate; 

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>idp-c-00dt9gnl7fmjaw9c****</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The issuer of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.840.113549.1.9.1=#160d696e666f406f6b74612e63****,CN=dev-xxxxxx,OU=SSOProvider,O=Okta,L=San Francisco,ST=California,C=US</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The time when the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2030-06-23T07:04:37Z</p>
             */
            public Builder notAfter(String notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>The time when the certificate was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-23T07:03:37Z</p>
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The public key of the certificate. The value of this parameter is in the PEM format and is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>MIIBIjANBgkqhkiG****</p>
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * <p>The serial number of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>159289587****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The signature algorithm of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>SHA256withRSA</p>
             */
            public Builder signatureAlgorithm(String signatureAlgorithm) {
                this.signatureAlgorithm = signatureAlgorithm;
                return this;
            }

            /**
             * <p>The subject of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.840.113549.1.9.1=#160d696e666f406f6b74612e63****,CN=dev-xxxxxx,OU=SSOProvider,O=Okta,L=San Francisco,ST=California,C=US</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The version of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The X.509 certificate in the PEM format.</p>
             * 
             * <strong>example:</strong>
             * <p>MIIDpDCCAoygAwIBAgIG****</p>
             */
            public Builder x509Certificate(String x509Certificate) {
                this.x509Certificate = x509Certificate;
                return this;
            }

            public SAMLIdPCertificates build() {
                return new SAMLIdPCertificates(this);
            } 

        } 

    }
}
