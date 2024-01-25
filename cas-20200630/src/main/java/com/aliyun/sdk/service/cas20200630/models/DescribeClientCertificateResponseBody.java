// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientCertificateResponseBody</p>
 */
public class DescribeClientCertificateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    private Certificate certificate;

    @NameInMap("RequestId")
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

        /**
         * The details about the client certificate or the server certificate.
         */
        public Builder certificate(Certificate certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientCertificateResponseBody build() {
            return new DescribeClientCertificateResponseBody(this);
        } 

    } 

    public static class Certificate extends TeaModel {
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

        @NameInMap("Days")
        private Integer days;

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

        private Certificate(Builder builder) {
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
             * The expiration date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder afterDate(Long afterDate) {
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
             * The issuance date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * The type of the certificate. Valid values:
             * <p>
             * 
             * *   **CLIENT**: client certificate
             * *   **SERVER**: server certificate
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
             * The validity period of the certificate. Unit: days.
             */
            public Builder days(Integer days) {
                this.days = days;
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
             * The unique identifier of the intermediate certificate from which the client certificate is issued.
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * The subject alternative name (SAN) extension of the certificate. The value indicates additional information, including the additional domain names or IP addresses that are associated with the certificate.
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
             * The status of the certificate. Valid values:
             * <p>
             * 
             * *   **ISSUE**: issued
             * *   **REVOKE**: revoked
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

            /**
             * The content of the certificate.
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
