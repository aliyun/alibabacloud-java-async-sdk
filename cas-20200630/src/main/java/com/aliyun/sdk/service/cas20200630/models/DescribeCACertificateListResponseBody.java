// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCACertificateListResponseBody</p>
 */
public class DescribeCACertificateListResponseBody extends TeaModel {
    @NameInMap("CertificateList")
    private java.util.List < CertificateList> certificateList;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowSize")
    private Integer showSize;

    @NameInMap("TotalCount")
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

    /**
     * @return certificateList
     */
    public java.util.List < CertificateList> getCertificateList() {
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
        private java.util.List < CertificateList> certificateList; 
        private Integer currentPage; 
        private Integer pageCount; 
        private String requestId; 
        private Integer showSize; 
        private Integer totalCount; 

        /**
         * An array that consists of the details about the CA certificate.
         */
        public Builder certificateList(java.util.List < CertificateList> certificateList) {
            this.certificateList = certificateList;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of returned pages.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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
         * The number of CA certificates returned per page.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * The total number of root CA certificates and intermediate CA certificates that are returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCACertificateListResponseBody build() {
            return new DescribeCACertificateListResponseBody(this);
        } 

    } 

    public static class CertificateList extends TeaModel {
        @NameInMap("AfterDate")
        private Long afterDate;

        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("BeforeDate")
        private Long beforeDate;

        @NameInMap("CertificateType")
        private String certificateType;

        @NameInMap("CommonName")
        private String commonName;

        @NameInMap("CountryCode")
        private String countryCode;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("KeySize")
        private Integer keySize;

        @NameInMap("Locality")
        private String locality;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("Organization")
        private String organization;

        @NameInMap("OrganizationUnit")
        private String organizationUnit;

        @NameInMap("ParentIdentifier")
        private String parentIdentifier;

        @NameInMap("Sans")
        private String sans;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Sha2")
        private String sha2;

        @NameInMap("SignAlgorithm")
        private String signAlgorithm;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubjectDN")
        private String subjectDN;

        @NameInMap("X509Certificate")
        private String x509Certificate;

        @NameInMap("Years")
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

            /**
             * The expiration date of the CA certificate. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * The encryption algorithm of the CA certificate. Valid values:
             * <p>
             * 
             * *   **RSA**: the Rivest-Shamir-Adleman (RSA) algorithm.
             * *   **ECC**: the elliptic curve cryptography (ECC) algorithm.
             * *   **SM2**: the SM2 algorithm, which is developed and approved by the State Cryptography Administration of China.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * The issuance date of the CA certificate. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * The type of the CA certificate. Valid values:
             * <p>
             * 
             * *   **ROOT**: root CA certificate
             * *   **SUB_ROOT**: intermediate CA certificate
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * The common name or abbreviation of the organization that is associated with the CA certificate.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The code of the country in which the organization is located.
             * <p>
             * 
             * For more information about country codes, see the **"Country codes"** section of the [Manage company profiles](~~198289~~) topic.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * The unique identifier of the CA certificate.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * The key length of the CA certificate.
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * The name of the city in which the organization is located.
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * The MD5 fingerprint of the CA certificate.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * The name of the organization that is associated with the CA certificate.
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * The name of the department or branch in the organization that is associated with the CA certificate.
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * The unique identifier of the root CA certificate from which the CA certificate is issued.
             * <p>
             * 
             * >  This parameter is returned only if the value of the **CertificateType** parameter is **SUB_ROOT**. The value SUB_ROOT indicates an intermediate CA certificate.
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * The serial number of the CA certificate.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The SHA-256 fingerprint of the CA certificate.
             */
            public Builder sha2(String sha2) {
                this.sha2 = sha2;
                return this;
            }

            /**
             * The signature algorithm of the CA certificate.
             */
            public Builder signAlgorithm(String signAlgorithm) {
                this.signAlgorithm = signAlgorithm;
                return this;
            }

            /**
             * The name of the province, municipality, or autonomous region in which the organization is located.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The status of the CA certificate. Valid values:
             * <p>
             * 
             * *   **ISSUE**: The CA certificate is issued.
             * *   **REVOKE**: The CA certificate is revoked.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The Distinguished Name (DN) attribute of the CA certificate, which indicates the user information of the certificate. The DN attribute contains the following information:
             * <p>
             * 
             * *   **C**: the country code in which the organization is located
             * *   **O**: the name of the organization
             * *   **OU**: the name of the department or branch in the organization
             * *   **L**: the name of the city in which the organization is located
             * 
             * <props="china">- **ST**: the name of the province, municipality, or autonomous region in which the organization is located</props> <props="intl">- **ST**: the name of the province or state in which the organization is located</props>
             * 
             * *   **CN**: the common name or abbreviation of the organization
             */
            public Builder subjectDN(String subjectDN) {
                this.subjectDN = subjectDN;
                return this;
            }

            /**
             * The content of the CA certificate.
             */
            public Builder x509Certificate(String x509Certificate) {
                this.x509Certificate = x509Certificate;
                return this;
            }

            /**
             * The validity period of the CA certificate. Unit: years.
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
