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
 * {@link DescribeClientCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientCertificateResponseBody</p>
 */
public class DescribeClientCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private Certificate certificate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClientCertificateResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificate
     */
    public Certificate getCertificate() {
        return this.certificate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Certificate certificate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClientCertificateResponseBody model) {
            this.certificate = model.certificate;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the client certificate or server-side certificate.</p>
         */
        public Builder certificate(Certificate certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientCertificateResponseBody build() {
            return new DescribeClientCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientCertificateResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;tag\&quot;:\&quot;PROPERTY_TYPE\&quot;,\&quot;values\&quot;:[]}]</p>
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
    /**
     * 
     * {@link DescribeClientCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientCertificateResponseBody</p>
     */
    public static class Certificate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private Long afterDate;

        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private Long beforeDate;

        @com.aliyun.core.annotation.NameInMap("CertChain")
        private String certChain;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("CustomIdentifier")
        private String customIdentifier;

        @com.aliyun.core.annotation.NameInMap("Days")
        private Integer days;

        @com.aliyun.core.annotation.NameInMap("FullAlgorithm")
        private String fullAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("KeySize")
        private Integer keySize;

        @com.aliyun.core.annotation.NameInMap("Locality")
        private String locality;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Organization")
        private String organization;

        @com.aliyun.core.annotation.NameInMap("OrganizationUnit")
        private String organizationUnit;

        @com.aliyun.core.annotation.NameInMap("ParentIdentifier")
        private String parentIdentifier;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private String sans;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Sha2")
        private String sha2;

        @com.aliyun.core.annotation.NameInMap("SignAlgorithm")
        private String signAlgorithm;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubjectDN")
        private String subjectDN;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UploadFlag")
        private Integer uploadFlag;

        @com.aliyun.core.annotation.NameInMap("X509Certificate")
        private String x509Certificate;

        private Certificate(Builder builder) {
            this.afterDate = builder.afterDate;
            this.algorithm = builder.algorithm;
            this.aliasName = builder.aliasName;
            this.beforeDate = builder.beforeDate;
            this.certChain = builder.certChain;
            this.certificateType = builder.certificateType;
            this.commonName = builder.commonName;
            this.countryCode = builder.countryCode;
            this.customIdentifier = builder.customIdentifier;
            this.days = builder.days;
            this.fullAlgorithm = builder.fullAlgorithm;
            this.id = builder.id;
            this.identifier = builder.identifier;
            this.keySize = builder.keySize;
            this.locality = builder.locality;
            this.md5 = builder.md5;
            this.organization = builder.organization;
            this.organizationUnit = builder.organizationUnit;
            this.parentIdentifier = builder.parentIdentifier;
            this.resourceGroupId = builder.resourceGroupId;
            this.sans = builder.sans;
            this.serialNumber = builder.serialNumber;
            this.sha2 = builder.sha2;
            this.signAlgorithm = builder.signAlgorithm;
            this.state = builder.state;
            this.status = builder.status;
            this.subjectDN = builder.subjectDN;
            this.tags = builder.tags;
            this.uploadFlag = builder.uploadFlag;
            this.x509Certificate = builder.x509Certificate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificate create() {
            return builder().build();
        }

        /**
         * @return afterDate
         */
        public Long getAfterDate() {
            return this.afterDate;
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return beforeDate
         */
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        /**
         * @return certChain
         */
        public String getCertChain() {
            return this.certChain;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return customIdentifier
         */
        public String getCustomIdentifier() {
            return this.customIdentifier;
        }

        /**
         * @return days
         */
        public Integer getDays() {
            return this.days;
        }

        /**
         * @return fullAlgorithm
         */
        public String getFullAlgorithm() {
            return this.fullAlgorithm;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return keySize
         */
        public Integer getKeySize() {
            return this.keySize;
        }

        /**
         * @return locality
         */
        public String getLocality() {
            return this.locality;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return organization
         */
        public String getOrganization() {
            return this.organization;
        }

        /**
         * @return organizationUnit
         */
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        /**
         * @return parentIdentifier
         */
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sans
         */
        public String getSans() {
            return this.sans;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return sha2
         */
        public String getSha2() {
            return this.sha2;
        }

        /**
         * @return signAlgorithm
         */
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subjectDN
         */
        public String getSubjectDN() {
            return this.subjectDN;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return uploadFlag
         */
        public Integer getUploadFlag() {
            return this.uploadFlag;
        }

        /**
         * @return x509Certificate
         */
        public String getX509Certificate() {
            return this.x509Certificate;
        }

        public static final class Builder {
            private Long afterDate; 
            private String algorithm; 
            private String aliasName; 
            private Long beforeDate; 
            private String certChain; 
            private String certificateType; 
            private String commonName; 
            private String countryCode; 
            private String customIdentifier; 
            private Integer days; 
            private String fullAlgorithm; 
            private Long id; 
            private String identifier; 
            private Integer keySize; 
            private String locality; 
            private String md5; 
            private String organization; 
            private String organizationUnit; 
            private String parentIdentifier; 
            private String resourceGroupId; 
            private String sans; 
            private String serialNumber; 
            private String sha2; 
            private String signAlgorithm; 
            private String state; 
            private String status; 
            private String subjectDN; 
            private java.util.List<Tags> tags; 
            private Integer uploadFlag; 
            private String x509Certificate; 

            private Builder() {
            } 

            private Builder(Certificate model) {
                this.afterDate = model.afterDate;
                this.algorithm = model.algorithm;
                this.aliasName = model.aliasName;
                this.beforeDate = model.beforeDate;
                this.certChain = model.certChain;
                this.certificateType = model.certificateType;
                this.commonName = model.commonName;
                this.countryCode = model.countryCode;
                this.customIdentifier = model.customIdentifier;
                this.days = model.days;
                this.fullAlgorithm = model.fullAlgorithm;
                this.id = model.id;
                this.identifier = model.identifier;
                this.keySize = model.keySize;
                this.locality = model.locality;
                this.md5 = model.md5;
                this.organization = model.organization;
                this.organizationUnit = model.organizationUnit;
                this.parentIdentifier = model.parentIdentifier;
                this.resourceGroupId = model.resourceGroupId;
                this.sans = model.sans;
                this.serialNumber = model.serialNumber;
                this.sha2 = model.sha2;
                this.signAlgorithm = model.signAlgorithm;
                this.state = model.state;
                this.status = model.status;
                this.subjectDN = model.subjectDN;
                this.tags = model.tags;
                this.uploadFlag = model.uploadFlag;
                this.x509Certificate = model.x509Certificate;
            } 

            /**
             * <p>The expiration date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665819958000</p>
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The type of the encryption algorithm. Valid values:</p>
             * <ul>
             * <li><p><strong>RSA</strong>: the RSA algorithm.</p>
             * </li>
             * <li><p><strong>ECC</strong>: the ECC algorithm.</p>
             * </li>
             * <li><p><strong>SM2</strong>: the SM2 algorithm.</p>
             * </li>
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
             * <p>The alias of the issued certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>rsa_root_2048</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The issuance date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634283958000</p>
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>The complete certificate chain.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----
             * cert
             * -----END CERTIFICATE-----
             * -----BEGIN CERTIFICATE-----
             * subCA
             * -----END CERTIFICATE-----
             * -----BEGIN CERTIFICATE-----
             * rootCA
             * -----END CERTIFICATE-----</p>
             */
            public Builder certChain(String certChain) {
                this.certChain = certChain;
                return this;
            }

            /**
             * <p>The type of the certificate. Valid values:</p>
             * <ul>
             * <li><p><strong>CLIENT</strong>: a client certificate.</p>
             * </li>
             * <li><p><strong>SERVER</strong>: a server-side certificate.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SERVER</p>
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * <p>The common name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The country code of the subject organization.</p>
             * <p>For more information about country codes, see the <strong>International codes</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * <p>The custom identifier, which is a unique key.</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong>3a32d96883a6650e672ea0276</strong></em>*</p>
             */
            public Builder customIdentifier(String customIdentifier) {
                this.customIdentifier = customIdentifier;
                return this;
            }

            /**
             * <p>The validity period of the certificate. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>365</p>
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            /**
             * <p>The algorithm and its length.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA_2048</p>
             */
            public Builder fullAlgorithm(String fullAlgorithm) {
                this.fullAlgorithm = fullAlgorithm;
                return this;
            }

            /**
             * <p>The ID of the data source to which the certificate order belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1137354</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The unique identifier of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>d3b95700998e47afc4d95f886579****</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The key length of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * <p>The city where the subject organization is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * <p>The MD5 fingerprint of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>d3b95700998e47afc4d95f886579****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The organization associated with the certificate of the issuing subordinate CA.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * <p>The organizational unit of the certificate subject.</p>
             * 
             * <strong>example:</strong>
             * <p>Security</p>
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * <p>The unique identifier of the subordinate CA certificate that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>160ae6bb538d538c70c01f81dcf2****</p>
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the certificate belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxllajdpw3fi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The Subject Alternative Name (SAN) extension of the certificate. The SAN extension indicates other domain names or IP addresses that are associated with the certificate.</p>
             * <p>This parameter is a string that is converted from a JSON array. Each element in the JSON array is a struct that corresponds to a SAN extension. Each SAN extension struct contains the following parameters:</p>
             * <ul>
             * <li><p><strong>Type</strong>: The type of the extension. This parameter is of the Integer type. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: an email address.</p>
             * </li>
             * <li><p><strong>2</strong>: a domain name.</p>
             * </li>
             * <li><p><strong>6</strong>: a Uniform Resource Identifier (URI).</p>
             * </li>
             * <li><p><strong>7</strong>: an IP address.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p><strong>Value</strong>: The content of the extension. This parameter is of the String type.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[ {&quot;Type&quot;: 7, &quot;Value&quot;: &quot;192.0.XX.XX&quot;}, {&quot;Type&quot;: 2, &quot;Value&quot;: &quot;<a href="http://www.aliyundoc.com%22%7D">www.aliyundoc.com&quot;}</a>, ]</p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The serial number of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>62b2b943a32d96883a6650e672ea0276****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The SHA-256 fingerprint of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>14dcc8afc7578e1fcec36d658f7e20de18f6957bbac42b373a66bc9de4e9****</p>
             */
            public Builder sha2(String sha2) {
                this.sha2 = sha2;
                return this;
            }

            /**
             * <p>The signature algorithm of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>SHA256WITHRSA</p>
             */
            public Builder signAlgorithm(String signAlgorithm) {
                this.signAlgorithm = signAlgorithm;
                return this;
            }

            /**
             * <p>The state or province where the subject organization is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The status of the certificate. Valid values:</p>
             * <ul>
             * <li><p><strong>ISSUE</strong>: The certificate is issued.</p>
             * </li>
             * <li><p><strong>REVOKE</strong>: The certificate is revoked.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ISSUE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subject Distinguished Name (DN) of the certificate. This value is composed of the following fields:</p>
             * <ul>
             * <li><p><strong>C</strong>: Country.</p>
             * </li>
             * <li><p><strong>O</strong>: Organization.</p>
             * </li>
             * <li><p><strong>OU</strong>: Organizational unit.</p>
             * </li>
             * <li><p><strong>CN</strong>: Common name.</p>
             * </li>
             * </ul>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li><strong>ST</strong>: The province, municipality, or autonomous region.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <ul>
             * <li><p><strong>ST</strong>: Province or state.</p>
             * </li>
             * <li><p><strong>CN</strong>: Common name.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>C=CN,O=Aliyun,OU=Security,L=Hangzhou,ST=Zhejiang,CN=Aliyun</p>
             */
            public Builder subjectDN(String subjectDN) {
                this.subjectDN = subjectDN;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             * 
             * <strong>example:</strong>
             * <p>mtls</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is synchronized to Digital Certificate Management Service.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder uploadFlag(Integer uploadFlag) {
                this.uploadFlag = uploadFlag;
                return this;
            }

            /**
             * <p>The content of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----  ...... -----END CERTIFICATE-----</p>
             */
            public Builder x509Certificate(String x509Certificate) {
                this.x509Certificate = x509Certificate;
                return this;
            }

            public Certificate build() {
                return new Certificate(this);
            } 

        } 

    }
}
