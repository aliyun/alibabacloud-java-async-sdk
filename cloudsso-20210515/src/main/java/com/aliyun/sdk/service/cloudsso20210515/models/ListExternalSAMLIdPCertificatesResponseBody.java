// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExternalSAMLIdPCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExternalSAMLIdPCertificatesResponseBody</p>
 */
public class ListExternalSAMLIdPCertificatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SAMLIdPCertificates")
    private java.util.List < SAMLIdPCertificates> SAMLIdPCertificates;

    @NameInMap("TotalCounts")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SAMLIdPCertificates.
         */
        public Builder SAMLIdPCertificates(java.util.List < SAMLIdPCertificates> SAMLIdPCertificates) {
            this.SAMLIdPCertificates = SAMLIdPCertificates;
            return this;
        }

        /**
         * TotalCounts.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListExternalSAMLIdPCertificatesResponseBody build() {
            return new ListExternalSAMLIdPCertificatesResponseBody(this);
        } 

    } 

    public static class SAMLIdPCertificates extends TeaModel {
        @NameInMap("CertificateId")
        private String certificateId;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("NotAfter")
        private String notAfter;

        @NameInMap("NotBefore")
        private String notBefore;

        @NameInMap("PublicKey")
        private String publicKey;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("SignatureAlgorithm")
        private String signatureAlgorithm;

        @NameInMap("Subject")
        private String subject;

        @NameInMap("Version")
        private Integer version;

        @NameInMap("X509Certificate")
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
             * CertificateId.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * NotAfter.
             */
            public Builder notAfter(String notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * NotBefore.
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * PublicKey.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * SignatureAlgorithm.
             */
            public Builder signatureAlgorithm(String signatureAlgorithm) {
                this.signatureAlgorithm = signatureAlgorithm;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * X509Certificate.
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
