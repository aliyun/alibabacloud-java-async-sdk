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
 * {@link ListCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertificatesResponseBody</p>
 */
public class ListCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateList")
    private java.util.List<CertificateList> certificateList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCertificatesResponseBody(Builder builder) {
        this.certificateList = builder.certificateList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificatesResponseBody create() {
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
        private String requestId; 
        private Integer showSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCertificatesResponseBody model) {
            this.certificateList = model.certificateList;
            this.currentPage = model.currentPage;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * CertificateList.
         */
        public Builder certificateList(java.util.List<CertificateList> certificateList) {
            this.certificateList = certificateList;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertificatesResponseBody build() {
            return new ListCertificatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertificatesResponseBody</p>
     */
    public static class CertificateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CertificateSource")
        private String certificateSource;

        @com.aliyun.core.annotation.NameInMap("CertificateStatus")
        private String certificateStatus;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

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

        @com.aliyun.core.annotation.NameInMap("Serial")
        private String serial;

        @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
        private java.util.List<String> subjectAlternativeNames;

        @com.aliyun.core.annotation.NameInMap("UsingProductList")
        private java.util.List<String> usingProductList;

        private CertificateList(Builder builder) {
            this.algorithm = builder.algorithm;
            this.certIdentifier = builder.certIdentifier;
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.certificateSource = builder.certificateSource;
            this.certificateStatus = builder.certificateStatus;
            this.commonName = builder.commonName;
            this.domain = builder.domain;
            this.existPrivateKey = builder.existPrivateKey;
            this.fingerPrint = builder.fingerPrint;
            this.instanceId = builder.instanceId;
            this.issuer = builder.issuer;
            this.keySize = builder.keySize;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.serial = builder.serial;
            this.subjectAlternativeNames = builder.subjectAlternativeNames;
            this.usingProductList = builder.usingProductList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateList create() {
            return builder().build();
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
         * @return certificateId
         */
        public String getCertificateId() {
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
         * @return usingProductList
         */
        public java.util.List<String> getUsingProductList() {
            return this.usingProductList;
        }

        public static final class Builder {
            private String algorithm; 
            private String certIdentifier; 
            private String certificateId; 
            private String certificateName; 
            private String certificateSource; 
            private String certificateStatus; 
            private String commonName; 
            private String domain; 
            private Boolean existPrivateKey; 
            private String fingerPrint; 
            private String instanceId; 
            private String issuer; 
            private Integer keySize; 
            private Long notAfter; 
            private Long notBefore; 
            private String serial; 
            private java.util.List<String> subjectAlternativeNames; 
            private java.util.List<String> usingProductList; 

            private Builder() {
            } 

            private Builder(CertificateList model) {
                this.algorithm = model.algorithm;
                this.certIdentifier = model.certIdentifier;
                this.certificateId = model.certificateId;
                this.certificateName = model.certificateName;
                this.certificateSource = model.certificateSource;
                this.certificateStatus = model.certificateStatus;
                this.commonName = model.commonName;
                this.domain = model.domain;
                this.existPrivateKey = model.existPrivateKey;
                this.fingerPrint = model.fingerPrint;
                this.instanceId = model.instanceId;
                this.issuer = model.issuer;
                this.keySize = model.keySize;
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
                this.serial = model.serial;
                this.subjectAlternativeNames = model.subjectAlternativeNames;
                this.usingProductList = model.usingProductList;
            } 

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * CertIdentifier.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * CertificateId.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * CertificateName.
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * CertificateSource.
             */
            public Builder certificateSource(String certificateSource) {
                this.certificateSource = certificateSource;
                return this;
            }

            /**
             * CertificateStatus.
             */
            public Builder certificateStatus(String certificateStatus) {
                this.certificateStatus = certificateStatus;
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * ExistPrivateKey.
             */
            public Builder existPrivateKey(Boolean existPrivateKey) {
                this.existPrivateKey = existPrivateKey;
                return this;
            }

            /**
             * FingerPrint.
             */
            public Builder fingerPrint(String fingerPrint) {
                this.fingerPrint = fingerPrint;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
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
             * NotAfter.
             */
            public Builder notAfter(Long notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * NotBefore.
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * Serial.
             */
            public Builder serial(String serial) {
                this.serial = serial;
                return this;
            }

            /**
             * SubjectAlternativeNames.
             */
            public Builder subjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
                this.subjectAlternativeNames = subjectAlternativeNames;
                return this;
            }

            /**
             * UsingProductList.
             */
            public Builder usingProductList(java.util.List<String> usingProductList) {
                this.usingProductList = usingProductList;
                return this;
            }

            public CertificateList build() {
                return new CertificateList(this);
            } 

        } 

    }
}
