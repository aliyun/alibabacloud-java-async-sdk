// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificateResponseBody</p>
 */
public class DescribeCertificateResponseBody extends TeaModel {
    @NameInMap("Arn")
    private String arn;

    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("CreatedAt")
    private String createdAt;

    @NameInMap("ExportablePrivateKey")
    private Boolean exportablePrivateKey;

    @NameInMap("Issuer")
    private String issuer;

    @NameInMap("KeySpec")
    private String keySpec;

    @NameInMap("NotAfter")
    private String notAfter;

    @NameInMap("NotBefore")
    private String notBefore;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Serial")
    private String serial;

    @NameInMap("SignatureAlgorithm")
    private String signatureAlgorithm;

    @NameInMap("Status")
    private String status;

    @NameInMap("Subject")
    private String subject;

    @NameInMap("SubjectAlternativeNames")
    private java.util.List < String > subjectAlternativeNames;

    @NameInMap("SubjectKeyIdentifier")
    private String subjectKeyIdentifier;

    @NameInMap("SubjectPublicKey")
    private String subjectPublicKey;

    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @NameInMap("UpdatedAt")
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
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * ExportablePrivateKey.
         */
        public Builder exportablePrivateKey(Boolean exportablePrivateKey) {
            this.exportablePrivateKey = exportablePrivateKey;
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
         * KeySpec.
         */
        public Builder keySpec(String keySpec) {
            this.keySpec = keySpec;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Serial.
         */
        public Builder serial(String serial) {
            this.serial = serial;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * SubjectAlternativeNames.
         */
        public Builder subjectAlternativeNames(java.util.List < String > subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * SubjectKeyIdentifier.
         */
        public Builder subjectKeyIdentifier(String subjectKeyIdentifier) {
            this.subjectKeyIdentifier = subjectKeyIdentifier;
            return this;
        }

        /**
         * SubjectPublicKey.
         */
        public Builder subjectPublicKey(String subjectPublicKey) {
            this.subjectPublicKey = subjectPublicKey;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * UpdatedAt.
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
