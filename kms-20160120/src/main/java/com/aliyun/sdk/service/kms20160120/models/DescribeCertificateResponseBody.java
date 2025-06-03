// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
    private java.util.List<String> subjectAlternativeNames;

    @com.aliyun.core.annotation.NameInMap("SubjectKeyIdentifier")
    private String subjectKeyIdentifier;

    @com.aliyun.core.annotation.NameInMap("SubjectPublicKey")
    private String subjectPublicKey;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getSubjectAlternativeNames() {
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
    public java.util.Map<String, ?> getTags() {
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
        private java.util.List<String> subjectAlternativeNames; 
        private String subjectKeyIdentifier; 
        private String subjectPublicKey; 
        private java.util.Map<String, ?> tags; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(DescribeCertificateResponseBody model) {
            this.arn = model.arn;
            this.certificateId = model.certificateId;
            this.createdAt = model.createdAt;
            this.exportablePrivateKey = model.exportablePrivateKey;
            this.issuer = model.issuer;
            this.keySpec = model.keySpec;
            this.notAfter = model.notAfter;
            this.notBefore = model.notBefore;
            this.requestId = model.requestId;
            this.serial = model.serial;
            this.signatureAlgorithm = model.signatureAlgorithm;
            this.status = model.status;
            this.subject = model.subject;
            this.subjectAlternativeNames = model.subjectAlternativeNames;
            this.subjectKeyIdentifier = model.subjectKeyIdentifier;
            this.subjectPublicKey = model.subjectPublicKey;
            this.tags = model.tags;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:159498693826****:certificate/9a28de48-8d8b-484d-a766-dec4****&quot;</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The ID of the certificate. The ID must be globally unique in Certificates Manager.</p>
         * 
         * <strong>example:</strong>
         * <p>9a28de48-8d8b-484d-a766-dec4****</p>
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The time when the certificate was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13T03:05:03Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Indicates whether the private key of the certificate can be exported for use. Valid values:</p>
         * <ul>
         * <li>true: The private key of the certificate can be exported for use. This is the default value.</li>
         * <li>false: The private key of the certificate cannot be exported for use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder exportablePrivateKey(Boolean exportablePrivateKey) {
            this.exportablePrivateKey = exportablePrivateKey;
            return this;
        }

        /**
         * <p>The certificate issuer in the distinguished name (DN) format.</p>
         * 
         * <strong>example:</strong>
         * <p>CN=testCA,OU=kms,O=aliyun,C=CN</p>
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>The type of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        public Builder keySpec(String keySpec) {
            this.keySpec = keySpec;
            return this;
        }

        /**
         * <p>The end of the validity period of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-13T03:09:00Z</p>
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * <p>The beginning of the validity period of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13T03:09:00Z</p>
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>edb671a3-c5a1-4ebe-a1de-d748b640bdf2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder serial(String serial) {
            this.serial = serial;
            return this;
        }

        /**
         * <p>The signature algorithm of the certificate. Valid values:</p>
         * <ul>
         * <li>RSA2048-SHA256</li>
         * <li>ECDSA-SHA256</li>
         * <li>SM2-SM3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECDSA-SHA256</p>
         */
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li>PENDING: The certificate is to be imported.</li>
         * <li>ACTIVE: The certificate is enabled.</li>
         * <li>INACTIVE: The certificate is disabled.</li>
         * <li>REVOKED: The certificate is revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The subject of the certificate, which is in the DN format.</p>
         * 
         * <strong>example:</strong>
         * <p>CN=userName,OU=aliyun,O=aliyun,C=CN</p>
         */
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * <p>The alias of the certificate subject.</p>
         * <p>A domain name list is supported. A maximum of 10 domain names are supported.</p>
         */
        public Builder subjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * <p>The public key identifier of the certificate subject.</p>
         * 
         * <strong>example:</strong>
         * <p>79 36 26 DE 9F F5 15 E3 56 DC ****</p>
         */
        public Builder subjectKeyIdentifier(String subjectKeyIdentifier) {
            this.subjectKeyIdentifier = subjectKeyIdentifier;
            return this;
        }

        /**
         * <p>The public key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PUBLIC KEY----- MIIBIjA -----END PUBLIC KEY-----</p>
         */
        public Builder subjectPublicKey(String subjectPublicKey) {
            this.subjectPublicKey = subjectPublicKey;
            return this;
        }

        /**
         * <p>The tag of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The time when the certificate was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T06:10:13Z</p>
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
