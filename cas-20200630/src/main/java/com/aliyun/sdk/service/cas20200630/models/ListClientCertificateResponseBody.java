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
 * {@link ListClientCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientCertificateResponseBody</p>
 */
public class ListClientCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateList")
    private java.util.List<CertificateList> certificateList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListClientCertificateResponseBody(Builder builder) {
        this.certificateList = builder.certificateList;
        this.currentPage = builder.currentPage;
        this.pageCount = builder.pageCount;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateList
     */
    public java.util.List<CertificateList> getCertificateList() {
        return this.certificateList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CertificateList> certificateList; 
        private Integer currentPage; 
        private Integer pageCount; 
        private String requestId; 
        private Integer showSize; 
        private Long totalCount; 

        /**
         * <p>An array that consists of the details about all client certificates and server certificates.</p>
         */
        public Builder certificateList(java.util.List<CertificateList> certificateList) {
            this.certificateList = certificateList;
            return this;
        }

        /**
         * <p>The page number of the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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

        /**
         * <p>The number of certificates that are returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The number of client certificates and server certificates that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClientCertificateResponseBody build() {
            return new ListClientCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClientCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientCertificateResponseBody</p>
     */
    public static class CertificateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private Long afterDate;

        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private Long beforeDate;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("Days")
        private Integer days;

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

        private CertificateList(Builder builder) {
            this.afterDate = builder.afterDate;
            this.algorithm = builder.algorithm;
            this.beforeDate = builder.beforeDate;
            this.certificateType = builder.certificateType;
            this.commonName = builder.commonName;
            this.countryCode = builder.countryCode;
            this.days = builder.days;
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
         * @return beforeDate
         */
        public Long getBeforeDate() {
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
         * @return days
         */
        public Integer getDays() {
            return this.days;
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

        public static final class Builder {
            private Long afterDate; 
            private String algorithm; 
            private Long beforeDate; 
            private String certificateType; 
            private String commonName; 
            private String countryCode; 
            private Integer days; 
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
             * <p>The type of the encryption algorithm of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>RSA</strong>: the Rivest-Shamir-Adleman (RSA) algorithm.</li>
             * <li><strong>ECC</strong>: the elliptic curve cryptography (ECC) algorithm.</li>
             * <li><strong>SM2</strong>: the SM2 algorithm, which is developed and approved by the State Cryptography Administration of China.</li>
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
             * <p>The type of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>CLIENT</strong>: client certificate</li>
             * <li><strong>SERVER</strong>: server certificate</li>
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
             * <p>aliyundoc.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The code of the country in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
             * <p>For more information about country codes, see the <strong>&quot;Country codes&quot;</strong> section of the <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
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
             * <p>The name of the city in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
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
             * <p>The name of the organization. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Computing Co., Ltd.</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * <p>The name of the department in the organization. The organization is associated with the intermediate certificate authority (CA) certificate from which the certificate is issued.</p>
             * 
             * <strong>example:</strong>
             * <p>Security</p>
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * <p>The unique identifier of the intermediate certificate from which the client certificate is issued.</p>
             * 
             * <strong>example:</strong>
             * <p>160ae6bb538d538c70c01f81dcf2****</p>
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * <p>The subject alternative name (SAN) extension of the certificate. The value indicates additional information, including the additional domain names or IP addresses that are associated with the certificate.</p>
             * <p>The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that corresponds to a SAN extension. A SAN extension struct contains the following parameters:</p>
             * <ul>
             * <li><p><strong>Type</strong>: the type of the extension. Data type: integer. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: an email address</li>
             * <li><strong>2</strong>: a domain name</li>
             * <li><strong>6</strong>: a Uniform Resource Identifier (URI)</li>
             * <li><strong>7</strong>: an IP address</li>
             * </ul>
             * </li>
             * <li><p><strong>Value</strong>: the value of the extension. Data type: string.</p>
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
             * <p>The name of the province, municipality, or autonomous region in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
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
             * <li><strong>ISSUE</strong>: issued</li>
             * <li><strong>REVOKE</strong>: revoked</li>
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
             * <p>The distinguished name (DN) extension of the certificate, which indicates the user of the certificate. The DN extension includes the following information:</p>
             * <ul>
             * <li><strong>C</strong>: the country</li>
             * <li><strong>O</strong>: the organization</li>
             * <li><strong>OU</strong>: the department</li>
             * <li><strong>L</strong>: the city</li>
             * <li><strong>ST</strong>: the province, municipality, or autonomous region</li>
             * <li><strong>CN</strong>: the common name</li>
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

            public CertificateList build() {
                return new CertificateList(this);
            } 

        } 

    }
}
