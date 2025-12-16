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
         * CertificateList.
         */
        public Builder certificateList(java.util.List<CertificateList> certificateList) {
            this.certificateList = certificateList;
            return this;
        }

        /**
         * RequestId.
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
             * AfterDate.
             */
            public Builder afterDate(String afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * BeforeDate.
             */
            public Builder beforeDate(String beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * CertificateType.
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * KeySize.
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * Locality.
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * Organization.
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * OrganizationUnit.
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * ParentIdentifier.
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * Sans.
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Sha2.
             */
            public Builder sha2(String sha2) {
                this.sha2 = sha2;
                return this;
            }

            /**
             * SignAlgorithm.
             */
            public Builder signAlgorithm(String signAlgorithm) {
                this.signAlgorithm = signAlgorithm;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
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
             * SubjectDN.
             */
            public Builder subjectDN(String subjectDN) {
                this.subjectDN = subjectDN;
                return this;
            }

            /**
             * X509Certificate.
             */
            public Builder x509Certificate(String x509Certificate) {
                this.x509Certificate = x509Certificate;
                return this;
            }

            /**
             * Years.
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
