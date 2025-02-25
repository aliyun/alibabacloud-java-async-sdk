// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificateResponseBody</p>
 */
public class DescribeCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("ExportablePrivateKey")
    private Boolean exportablePrivateKey;

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("KeySpec")
    private String keySpec;

    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private String notAfter;

    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private String notBefore;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Serial")
    private String serial;

    @com.aliyun.core.annotation.NameInMap("SignatureAlgorithm")
    private String signatureAlgorithm;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Subject")
    private String subject;

    @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
    private java.util.List < String > subjectAlternativeNames;

    @com.aliyun.core.annotation.NameInMap("SubjectKeyIdentifier")
    private String subjectKeyIdentifier;

    @com.aliyun.core.annotation.NameInMap("SubjectPublicKey")
    private String subjectPublicKey;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    private DescribeCertificateResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.certificateId = builder.certificateId;
        this.createdAt = builder.createdAt;
        this.exportablePrivateKey = builder.exportablePrivateKey;
        this.issuer = builder.issuer;
        this.keySpec = builder.keySpec;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.requestId = builder.requestId;
        this.serial = builder.serial;
        this.signatureAlgorithm = builder.signatureAlgorithm;
        this.status = builder.status;
        this.subject = builder.subject;
        this.subjectAlternativeNames = builder.subjectAlternativeNames;
        this.subjectKeyIdentifier = builder.subjectKeyIdentifier;
        this.subjectPublicKey = builder.subjectPublicKey;
        this.tags = builder.tags;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return exportablePrivateKey
     */
    public Boolean getExportablePrivateKey() {
        return this.exportablePrivateKey;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serial
     */
    public String getSerial() {
        return this.serial;
    }

    /**
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return subjectAlternativeNames
     */
    public java.util.List < String > getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * @return subjectKeyIdentifier
     */
    public String getSubjectKeyIdentifier() {
        return this.subjectKeyIdentifier;
    }

    /**
     * @return subjectPublicKey
     */
    public String getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String arn; 
        private String certificateId; 
        private String createdAt; 
        private Boolean exportablePrivateKey; 
        private String issuer; 
        private String keySpec; 
        private String notAfter; 
        private String notBefore; 
        private String requestId; 
        private String serial; 
        private String signatureAlgorithm; 
        private String status; 
        private String subject; 
        private java.util.List < String > subjectAlternativeNames; 
        private String subjectKeyIdentifier; 
        private String subjectPublicKey; 
        private java.util.Map < String, ? > tags; 
        private String updatedAt; 

        /**
         * The Alibaba Cloud Resource Name (ARN) of the certificate.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * The ID of the certificate. The ID must be globally unique in Certificates Manager.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The time when the certificate was created.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Indicates whether the private key of the certificate can be exported for use. Valid values:
         * <p>
         * 
         * *   true: The private key of the certificate can be exported for use. This is the default value.
         * *   false: The private key of the certificate cannot be exported for use.
         */
        public Builder exportablePrivateKey(Boolean exportablePrivateKey) {
            this.exportablePrivateKey = exportablePrivateKey;
            return this;
        }

        /**
         * The certificate issuer in the distinguished name (DN) format.
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * The type of the key.
         */
        public Builder keySpec(String keySpec) {
            this.keySpec = keySpec;
            return this;
        }

        /**
         * The end of the validity period of the certificate.
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * The beginning of the validity period of the certificate.
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The serial number of the certificate.
         */
        public Builder serial(String serial) {
            this.serial = serial;
            return this;
        }

        /**
         * The signature algorithm of the certificate. Valid values:
         * <p>
         * 
         * *   RSA2048-SHA256
         * *   ECDSA-SHA256
         * *   SM2-SM3
         */
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        /**
         * The status of the certificate. Valid values:
         * <p>
         * 
         * *   PENDING: The certificate is to be imported.
         * *   ACTIVE: The certificate is enabled.
         * *   INACTIVE: The certificate is disabled.
         * *   REVOKED: The certificate is revoked.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The subject of the certificate, which is in the DN format.
         */
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * The alias of the certificate subject.
         * <p>
         * 
         * A domain name list is supported. A maximum of 10 domain names are supported.
         */
        public Builder subjectAlternativeNames(java.util.List < String > subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * The public key identifier of the certificate subject.
         */
        public Builder subjectKeyIdentifier(String subjectKeyIdentifier) {
            this.subjectKeyIdentifier = subjectKeyIdentifier;
            return this;
        }

        /**
         * The public key of the certificate.
         */
        public Builder subjectPublicKey(String subjectPublicKey) {
            this.subjectPublicKey = subjectPublicKey;
            return this;
        }

        /**
         * The tag of the certificate.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The time when the certificate was updated.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public DescribeCertificateResponseBody build() {
            return new DescribeCertificateResponseBody(this);
        } 

    } 

}
