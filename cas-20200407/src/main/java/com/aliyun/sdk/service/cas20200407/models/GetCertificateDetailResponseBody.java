// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertificateDetailResponseBody</p>
 */
public class GetCertificateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("CertificateChainList")
    private java.util.List<CertificateChainList> certificateChainList;

    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private Integer certificateId;

    @com.aliyun.core.annotation.NameInMap("CertificateName")
    private String certificateName;

    @com.aliyun.core.annotation.NameInMap("CertificateSource")
    private String certificateSource;

    @com.aliyun.core.annotation.NameInMap("CertificateStatus")
    private String certificateStatus;

    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("CompanyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("ExistPrivateKey")
    private Boolean existPrivateKey;

    @com.aliyun.core.annotation.NameInMap("FingerPrint")
    private String fingerPrint;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("KeySize")
    private Integer keySize;

    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private Long notAfter;

    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private Long notBefore;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Serial")
    private String serial;

    @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
    private java.util.List<String> subjectAlternativeNames;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("UsingProductList")
    private java.util.List<String> usingProductList;

    private GetCertificateDetailResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.certIdentifier = builder.certIdentifier;
        this.certificateChainList = builder.certificateChainList;
        this.certificateId = builder.certificateId;
        this.certificateName = builder.certificateName;
        this.certificateSource = builder.certificateSource;
        this.certificateStatus = builder.certificateStatus;
        this.commonName = builder.commonName;
        this.companyId = builder.companyId;
        this.contactId = builder.contactId;
        this.csr = builder.csr;
        this.domain = builder.domain;
        this.existPrivateKey = builder.existPrivateKey;
        this.fingerPrint = builder.fingerPrint;
        this.instanceId = builder.instanceId;
        this.issuer = builder.issuer;
        this.keySize = builder.keySize;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.requestId = builder.requestId;
        this.serial = builder.serial;
        this.subjectAlternativeNames = builder.subjectAlternativeNames;
        this.tags = builder.tags;
        this.usingProductList = builder.usingProductList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return certificateChainList
     */
    public java.util.List<CertificateChainList> getCertificateChainList() {
        return this.certificateChainList;
    }

    /**
     * @return certificateId
     */
    public Integer getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return certificateName
     */
    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * @return certificateSource
     */
    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * @return certificateStatus
     */
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return existPrivateKey
     */
    public Boolean getExistPrivateKey() {
        return this.existPrivateKey;
    }

    /**
     * @return fingerPrint
     */
    public String getFingerPrint() {
        return this.fingerPrint;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return keySize
     */
    public Integer getKeySize() {
        return this.keySize;
    }

    /**
     * @return notAfter
     */
    public Long getNotAfter() {
        return this.notAfter;
    }

    /**
     * @return notBefore
     */
    public Long getNotBefore() {
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
     * @return subjectAlternativeNames
     */
    public java.util.List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return usingProductList
     */
    public java.util.List<String> getUsingProductList() {
        return this.usingProductList;
    }

    public static final class Builder {
        private String algorithm; 
        private String certIdentifier; 
        private java.util.List<CertificateChainList> certificateChainList; 
        private Integer certificateId; 
        private String certificateName; 
        private String certificateSource; 
        private String certificateStatus; 
        private String commonName; 
        private Long companyId; 
        private Long contactId; 
        private String csr; 
        private String domain; 
        private Boolean existPrivateKey; 
        private String fingerPrint; 
        private String instanceId; 
        private String issuer; 
        private Integer keySize; 
        private Long notAfter; 
        private Long notBefore; 
        private String requestId; 
        private String serial; 
        private java.util.List<String> subjectAlternativeNames; 
        private java.util.List<Tags> tags; 
        private java.util.List<String> usingProductList; 

        private Builder() {
        } 

        private Builder(GetCertificateDetailResponseBody model) {
            this.algorithm = model.algorithm;
            this.certIdentifier = model.certIdentifier;
            this.certificateChainList = model.certificateChainList;
            this.certificateId = model.certificateId;
            this.certificateName = model.certificateName;
            this.certificateSource = model.certificateSource;
            this.certificateStatus = model.certificateStatus;
            this.commonName = model.commonName;
            this.companyId = model.companyId;
            this.contactId = model.contactId;
            this.csr = model.csr;
            this.domain = model.domain;
            this.existPrivateKey = model.existPrivateKey;
            this.fingerPrint = model.fingerPrint;
            this.instanceId = model.instanceId;
            this.issuer = model.issuer;
            this.keySize = model.keySize;
            this.notAfter = model.notAfter;
            this.notBefore = model.notBefore;
            this.requestId = model.requestId;
            this.serial = model.serial;
            this.subjectAlternativeNames = model.subjectAlternativeNames;
            this.tags = model.tags;
            this.usingProductList = model.usingProductList;
        } 

        /**
         * <p>The certificate algorithm. Valid values:</p>
         * <ul>
         * <li><strong>RSA</strong>: RSA algorithm.</li>
         * <li><strong>ECC</strong>: ECC algorithm.</li>
         * <li><strong>SM2</strong>: SM2 encryption algorithm.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The global certificate ID in the format of certificate ID + &quot;-&quot; + site region ID. This is commonly used across Alibaba Cloud services.
         *   --For the China site, the format is certificate ID + &quot;-cn-hangzhou&quot;.
         * For the China site, the format is certificate ID + &quot;-ap-southeast-1&quot;.
         * For example, if the certificate ID is 123, the CertIdentifier on the China site is &quot;123-cn-hangzhou&quot;, and the CertIdentifier on the China site is &quot;123-ap-southeast-1&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>21912069-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The certificate chain information list.</p>
         */
        public Builder certificateChainList(java.util.List<CertificateChainList> certificateChainList) {
            this.certificateChainList = certificateChainList;
            return this;
        }

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22559621</p>
         */
        public Builder certificateId(Integer certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        /**
         * <p>The certificate source. Valid values:</p>
         * <ul>
         * <li>BUY: purchased certificate.</li>
         * <li>TEST: test certificate.</li>
         * <li>UPLOAD: uploaded certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        public Builder certificateSource(String certificateSource) {
            this.certificateSource = certificateSource;
            return this;
        }

        /**
         * <p>The certificate status. Valid values:</p>
         * <ul>
         * <li><strong>issued</strong>: issued.</li>
         * <li><strong>revoked</strong>: revoked.</li>
         * <li><strong>willExpire</strong>: about to expire.</li>
         * <li><strong>expired</strong>: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>issued</p>
         */
        public Builder certificateStatus(String certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }

        /**
         * <p>The common domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The company information ID associated with the certificate application. This field is empty for DV certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>44211</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>The contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>304066</p>
         */
        public Builder contactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The certificate signing request (CSR) used to issue the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * <p>All domain names contained in the certificate. Multiple domain names are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com,example.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>Indicates whether a private key exists on the backend for the current certificate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder existPrivateKey(Boolean existPrivateKey) {
            this.existPrivateKey = existPrivateKey;
            return this;
        }

        /**
         * <p>The public key fingerprint.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder fingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cas_dv-cn-123</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The entity that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>The key algorithm length.</p>
         * <ul>
         * <li>The RSA algorithm length is typically 2048, 3072, or 4096.</li>
         * <li>The ECC and SM2 algorithm length is typically 256.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder keySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }

        /**
         * <p>The end time of the certificate validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>17326613180000</p>
         */
        public Builder notAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * <p>The start time of the certificate validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>17321613180000</p>
         */
        public Builder notBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The certificate serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder serial(String serial) {
            this.serial = serial;
            return this;
        }

        /**
         * <p>The list of Subject Alternative Names (SANs) of the certificate, returned in array format. This corresponds to the <code>Subject Alternative Name</code> field of the certificate.</p>
         */
        public Builder subjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * <p>The tag list.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The list of cloud services to which the current certificate is deployed.</p>
         */
        public Builder usingProductList(java.util.List<String> usingProductList) {
            this.usingProductList = usingProductList;
            return this;
        }

        public GetCertificateDetailResponseBody build() {
            return new GetCertificateDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCertificateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateDetailResponseBody</p>
     */
    public static class CertificateChainList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private Long notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private Long notBefore;

        @com.aliyun.core.annotation.NameInMap("RemainDay")
        private Integer remainDay;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private CertificateChainList(Builder builder) {
            this.issuer = builder.issuer;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.remainDay = builder.remainDay;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateChainList create() {
            return builder().build();
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
        public Long getNotAfter() {
            return this.notAfter;
        }

        /**
         * @return notBefore
         */
        public Long getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return remainDay
         */
        public Integer getRemainDay() {
            return this.remainDay;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String issuer; 
            private Long notAfter; 
            private Long notBefore; 
            private Integer remainDay; 
            private String subject; 

            private Builder() {
            } 

            private Builder(CertificateChainList model) {
                this.issuer = model.issuer;
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
                this.remainDay = model.remainDay;
                this.subject = model.subject;
            } 

            /**
             * <p>The issuer name in the certificate chain.</p>
             * 
             * <strong>example:</strong>
             * <p>Digicert</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The end time of the certificate validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>17326613180000</p>
             */
            public Builder notAfter(Long notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>The start time of the certificate validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>17321613180000</p>
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The remaining days of the certificate chain validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder remainDay(Integer remainDay) {
                this.remainDay = remainDay;
                return this;
            }

            /**
             * <p>The common name in the certificate chain.</p>
             * 
             * <strong>example:</strong>
             * <p>Digicert</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public CertificateChainList build() {
                return new CertificateChainList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCertificateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateDetailResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
