// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRevokeCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ListRevokeCertificateResponseBody</p>
 */
public class ListRevokeCertificateResponseBody extends TeaModel {
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
    private Long totalCount;

    private ListRevokeCertificateResponseBody(Builder builder) {
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

    public static ListRevokeCertificateResponseBody create() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CertificateList> certificateList; 
        private Integer currentPage; 
        private Integer pageCount; 
        private String requestId; 
        private Integer showSize; 
        private Long totalCount; 

        /**
         * An array that consists of the details about the revoked client certificates or server certificates.
         */
        public Builder certificateList(java.util.List < CertificateList> certificateList) {
            this.certificateList = certificateList;
            return this;
        }

        /**
         * The page number of the current page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The total number of pages returned.
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
         * The number of revoked certificates that are returned per page.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * The total number of revoked client certificates and server certificates that are returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRevokeCertificateResponseBody build() {
            return new ListRevokeCertificateResponseBody(this);
        } 

    } 

    public static class CertificateList extends TeaModel {
        @NameInMap("AfterDate")
        private String afterDate;

        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("BeforeDate")
        private String beforeDate;

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

        @NameInMap("RevokeDate")
        private String revokeDate;

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
            this.revokeDate = builder.revokeDate;
            this.sans = builder.sans;
            this.serialNumber = builder.serialNumber;
            this.sha2 = builder.sha2;
            this.signAlgorithm = builder.signAlgorithm;
            this.state = builder.state;
            this.status = builder.status;
            this.subjectDN = builder.subjectDN;
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
         * @return revokeDate
         */
        public String getRevokeDate() {
            return this.revokeDate;
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
            private String revokeDate; 
            private String sans; 
            private String serialNumber; 
            private String sha2; 
            private String signAlgorithm; 
            private String state; 
            private String status; 
            private String subjectDN; 

            /**
             * The expiration date of the certificate. The date is in the `yyyy-MM-ddT00:00Z` format. For example, the value `2021-12-31T00:00Z` indicates December 31, 2021.
             */
            public Builder afterDate(String afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * The type of the encryption algorithm of the certificate. Valid values:
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
             * The issuance date of the certificate. The date is in the `yyyy-MM-ddT00:00Z` format. For example, the value `2021-01-01T00:00Z` indicates January 1, 2021.
             */
            public Builder beforeDate(String beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * The type of the certificate.
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * The common name of the certificate.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The code of the country in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.
             * <p>
             * 
             * For more information about country codes, see the **"Country codes"** section of the [Manage company profiles](~~198289~~) topic.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * The unique identifier of the certificate.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * The key length of the certificate.
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * The name of the city in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * The MD5 fingerprint of the certificate.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * The name of the organization. The organization is associated with the intermediate certificate from which the certificate is issued.
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * The name of the department in the organization. The organization is associated with the intermediate certificate authority (CA) certificate from which the certificate is issued.
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * The identifier of the root certificate.
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * The date on which the certificate was revoked. The value is in the `yyyy-MM-ddT00:00Z` format. For example, the value `2021-09-01T00:00Z` indicates September 1, 2021.
             */
            public Builder revokeDate(String revokeDate) {
                this.revokeDate = revokeDate;
                return this;
            }

            /**
             * The subject alternative name (SAN) extension of the certificate.
             * <p>
             * 
             * The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that corresponds to a SAN extension. A SAN extension struct contains the following parameters:
             * 
             * *   **Type**: the type of the extension. Data type: integer. Valid values:
             * 
             *     *   **1**: an email address
             *     *   **2**: a domain name
             *     *   **6**: a Uniform Resource Identifier (URI)
             *     *   **7**: an IP address
             * 
             * *   **Value**: the value of the extension. Data type: string.
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * The serial number of the certificate.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The SHA-256 fingerprint of the certificate.
             */
            public Builder sha2(String sha2) {
                this.sha2 = sha2;
                return this;
            }

            /**
             * The signature algorithm of the certificate.
             */
            public Builder signAlgorithm(String signAlgorithm) {
                this.signAlgorithm = signAlgorithm;
                return this;
            }

            /**
             * The name of the province, municipality, or autonomous region in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The distinguished name (DN) extension of the certificate, which indicates the user of the certificate. The DN extension includes the following information:
             * <p>
             * 
             * *   **C**: the country
             * *   **O**: the organization
             * *   **OU**: the department
             * *   **L**: the city
             * *   **ST**: the province, municipality, or autonomous region
             * *   **CN**: the common name
             */
            public Builder subjectDN(String subjectDN) {
                this.subjectDN = subjectDN;
                return this;
            }

            public CertificateList build() {
                return new CertificateList(this);
            } 

        } 

    }
}
