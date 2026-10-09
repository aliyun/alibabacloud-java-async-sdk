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
 * {@link DescribeClientCertificateForSerialNumberResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientCertificateForSerialNumberResponseBody</p>
 */
public class DescribeClientCertificateForSerialNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateList")
    private java.util.List<CertificateList> certificateList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClientCertificateForSerialNumberResponseBody(Builder builder) {
        this.certificateList = builder.certificateList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientCertificateForSerialNumberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateList
     */
    public java.util.List<CertificateList> getCertificateList() {
        return this.certificateList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CertificateList> certificateList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClientCertificateForSerialNumberResponseBody model) {
            this.certificateList = model.certificateList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the client certificates or server certificates.</p>
         */
        public Builder certificateList(java.util.List<CertificateList> certificateList) {
            this.certificateList = certificateList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientCertificateForSerialNumberResponseBody build() {
            return new DescribeClientCertificateForSerialNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientCertificateForSerialNumberResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientCertificateForSerialNumberResponseBody</p>
     */
    public static class CertificateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private String afterDate;

        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private String beforeDate;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

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

        @com.aliyun.core.annotation.NameInMap("X509Certificate")
        private String x509Certificate;

        @com.aliyun.core.annotation.NameInMap("Years")
        private Integer years;

        private CertificateList(Builder builder) {
            this.afterDate = builder.afterDate;
            this.algorithm = builder.algorithm;
            this.beforeDate = builder.beforeDate;
            this.certificateType = builder.certificateType;
            this.commonName = builder.commonName;
            this.countryCode = builder.countryCode;
            this.identifier = builder.identifier;
            this.keySize = builder.keySize;
            this.locality = builder.locality;
            this.md5 = builder.md5;
            this.organization = builder.organization;
            this.organizationUnit = builder.organizationUnit;
            this.parentIdentifier = builder.parentIdentifier;
            this.sans = builder.sans;
            this.serialNumber = builder.serialNumber;
            this.sha2 = builder.sha2;
            this.signAlgorithm = builder.signAlgorithm;
            this.state = builder.state;
            this.status = builder.status;
            this.subjectDN = builder.subjectDN;
            this.x509Certificate = builder.x509Certificate;
            this.years = builder.years;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateList create() {
            return builder().build();
        }

        /**
         * @return afterDate
         */
        public String getAfterDate() {
            return this.afterDate;
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return beforeDate
         */
        public String getBeforeDate() {
            return this.beforeDate;
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
         * @return x509Certificate
         */
        public String getX509Certificate() {
            return this.x509Certificate;
        }

        /**
         * @return years
         */
        public Integer getYears() {
            return this.years;
        }

        public static final class Builder {
            private String afterDate; 
            private String algorithm; 
            private String beforeDate; 
            private String certificateType; 
            private String commonName; 
            private String countryCode; 
            private String identifier; 
            private Integer keySize; 
            private String locality; 
            private String md5; 
            private String organization; 
            private String organizationUnit; 
            private String parentIdentifier; 
            private String sans; 
            private String serialNumber; 
            private String sha2; 
            private String signAlgorithm; 
            private String state; 
            private String status; 
            private String subjectDN; 
            private String x509Certificate; 
            private Integer years; 

            private Builder() {
            } 

            private Builder(CertificateList model) {
                this.afterDate = model.afterDate;
                this.algorithm = model.algorithm;
                this.beforeDate = model.beforeDate;
                this.certificateType = model.certificateType;
                this.commonName = model.commonName;
                this.countryCode = model.countryCode;
                this.identifier = model.identifier;
                this.keySize = model.keySize;
                this.locality = model.locality;
                this.md5 = model.md5;
                this.organization = model.organization;
                this.organizationUnit = model.organizationUnit;
                this.parentIdentifier = model.parentIdentifier;
                this.sans = model.sans;
                this.serialNumber = model.serialNumber;
                this.sha2 = model.sha2;
                this.signAlgorithm = model.signAlgorithm;
                this.state = model.state;
                this.status = model.status;
                this.subjectDN = model.subjectDN;
                this.x509Certificate = model.x509Certificate;
                this.years = model.years;
            } 

            /**
             * <p>The expiration date of the certificate. The format is YYYY-MM-DD.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-23T16:15Z</p>
             */
            public Builder afterDate(String afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The encryption algorithm type of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>RSA</strong>: RSA algorithm.</li>
             * <li><strong>ECC</strong>: ECC algorithm.</li>
             * <li><strong>SM2</strong>: SM2 algorithm.</li>
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
             * <p>The issuance date of the certificate. The format is YYYY-MM-DD.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-28T16:15Z</p>
             */
            public Builder beforeDate(String beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>The type of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>SUB_ROOT</p>
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
             * <p>The code of the country where the organization associated with the subordinate CA certificate that issued this certificate is located.</p>
             * <p>For more information about country codes, see the <strong>International codes</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company information</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
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
             * <p>The name of the city where the organization associated with the subordinate CA certificate that issued this certificate is located.</p>
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
             * <p>The name of the organization associated with the subordinate CA certificate that issued this certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Computing Co., Ltd</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * <p>The name of the department in the organization associated with the subordinate CA certificate that issued this certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Security</p>
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * <p>If this parameter is not empty, the client certificate is issued by Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>1a83bcbb89e562885e40aa0108f5****</p>
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * <p>The Subject Alternative Name (SAN) extension of the certificate, which indicates other domain names or IP addresses associated with the certificate.</p>
             * <p>This parameter is represented as a string converted from a JSON array. Each element in the JSON array is a structure that corresponds to a SAN extension. Each SAN extension structure contains the following parameters:</p>
             * <ul>
             * <li><strong>Type</strong>: An Integer value that indicates the type of the extension. Valid values:<ul>
             * <li><strong>1</strong>: an email address.</li>
             * <li><strong>2</strong>: a domain name.</li>
             * <li><strong>6</strong>: a Uniform Resource Identifier (URI).</li>
             * <li><strong>7</strong>: an IP address.</li>
             * </ul>
             * </li>
             * <li><strong>Value</strong>: A String value that indicates the content of the extension.</li>
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
             * <p>084bde9cd233f0ddae33adc438cfbbbd****</p>
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
             * <p>&lt;props=&quot;china&quot;&gt;The name of the province, municipality, or autonomous region where the organization associated with the subordinate CA certificate that issued this certificate is located.
             * &lt;props=&quot;intl&quot;&gt;The name of the province or state where the organization associated with the subordinate CA certificate that issued this certificate is located.</p>
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
             * <li><strong>ISSUE</strong>: issued.</li>
             * <li><strong>REVOKE</strong>: revoked.</li>
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
             * <p>The distinguished name (DN) attribute of the certificate, which indicates the subject of the certificate. The DN contains the following information:</p>
             * <ul>
             * <li><strong>C</strong>: The country.</li>
             * <li><strong>O</strong>: The organization.</li>
             * <li><strong>OU</strong>: The department.</li>
             * <li><strong>L</strong>: The city.
             * &lt;props=&quot;china&quot;&gt;- <strong>ST</strong>: The province, municipality, or autonomous region.
             * &lt;props=&quot;intl&quot;&gt;- <strong>ST</strong>: The province or state.</li>
             * <li><strong>CN</strong>: The common name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>C=CN,O=Alibaba Cloud Computing Co., Ltd.,OU=Security,L=Hangzhou,ST=Zhejiang,CN=Aliyun</p>
             */
            public Builder subjectDN(String subjectDN) {
                this.subjectDN = subjectDN;
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

            /**
             * <p>The validity period of the certificate. Unit: years.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder years(Integer years) {
                this.years = years;
                return this;
            }

            public CertificateList build() {
                return new CertificateList(this);
            } 

        } 

    }
}
