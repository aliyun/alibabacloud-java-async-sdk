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
 * {@link DescribeCACertificateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCACertificateListResponseBody</p>
 */
public class DescribeCACertificateListResponseBody extends TeaModel {
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
    private Integer totalCount;

    private DescribeCACertificateListResponseBody(Builder builder) {
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

    public static DescribeCACertificateListResponseBody create() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CertificateList> certificateList; 
        private Integer currentPage; 
        private Integer pageCount; 
        private String requestId; 
        private Integer showSize; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCACertificateListResponseBody model) {
            this.certificateList = model.certificateList;
            this.currentPage = model.currentPage;
            this.pageCount = model.pageCount;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details about the CA certificates.</p>
         */
        public Builder certificateList(java.util.List<CertificateList> certificateList) {
            this.certificateList = certificateList;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of returned pages.</p>
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
         * <p>The number of CA certificates returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of root CA certificates and intermediate CA certificates that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCACertificateListResponseBody build() {
            return new DescribeCACertificateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCACertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCACertificateListResponseBody</p>
     */
    public static class CertificateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private Long afterDate;

        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private Long beforeDate;

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
            this.alias = builder.alias;
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
         * @return alias
         */
        public String getAlias() {
            return this.alias;
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
            private Long afterDate; 
            private String algorithm; 
            private String alias; 
            private Long beforeDate; 
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
                this.alias = model.alias;
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
             * <p>The expiration date of the CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665819958000</p>
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The encryption algorithm of the CA certificate. Valid values:</p>
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
             * <p>The alias of the CA.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun_CA</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The issuance date of the CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634283958000</p>
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>The type of the CA certificate. Valid values:</p>
             * <ul>
             * <li><strong>ROOT</strong>: a root CA certificate.</li>
             * <li><strong>SUB_ROOT</strong>: an intermediate CA certificate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUB_ROOT</p>
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * <p>The common name or abbreviation of the organization that is associated with the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The code of the country in which the organization is located.</p>
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
             * <p>The unique identifier of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>160ae6bb538d538c70c01f81dcf2****</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The key length of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * <p>The name of the city in which the organization is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * <p>The MD5 fingerprint of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>160ae6bb538d538c70c01f81dcf2****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The name of the organization that is associated with the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Computing Co., Ltd.</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * <p>The name of the department or branch in the organization that is associated with the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Security</p>
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * <p>The unique identifier of the root CA certificate from which the CA certificate is issued.</p>
             * <blockquote>
             * <p> This parameter is returned only if the value of the <strong>CertificateType</strong> parameter is <strong>SUB_ROOT</strong>. The value SUB_ROOT indicates an intermediate CA certificate.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1a83bcbb89e562885e40aa0108f5****</p>
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The serial number of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>70e3b2566d92805173767869727fb92e****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The SHA-256 fingerprint of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>14dcc8afc7578e1fcec36d658f7e20de18f6957bbac42b373a66bc9de4e9****</p>
             */
            public Builder sha2(String sha2) {
                this.sha2 = sha2;
                return this;
            }

            /**
             * <p>The signature algorithm of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>SHA256WITHRSA</p>
             */
            public Builder signAlgorithm(String signAlgorithm) {
                this.signAlgorithm = signAlgorithm;
                return this;
            }

            /**
             * <p>The name of the province, municipality, or autonomous region in which the organization is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The status of the CA certificate. Valid values:</p>
             * <ul>
             * <li><strong>ISSUE</strong>: The CA certificate is issued.</li>
             * <li><strong>REVOKE</strong>: The CA certificate is revoked.</li>
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
             * <p>The Distinguished Name (DN) attribute of the CA certificate, which indicates the user information of the certificate. The DN attribute contains the following information:</p>
             * <ul>
             * <li><strong>C</strong>: the code of the country in which the organization is located.</li>
             * <li><strong>O</strong>: the name of the organization.</li>
             * <li><strong>OU</strong>: the name of the department or branch in the organization.</li>
             * <li><strong>L</strong>: the name of the city in which the organization is located.</li>
             * <li><strong>CN</strong>: the common name or abbreviation of the organization.</li>
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
             * <p>The content of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE----- …… -----END CERTIFICATE-----</p>
             */
            public Builder x509Certificate(String x509Certificate) {
                this.x509Certificate = x509Certificate;
                return this;
            }

            /**
             * <p>The validity period of the CA certificate. Unit: years.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
