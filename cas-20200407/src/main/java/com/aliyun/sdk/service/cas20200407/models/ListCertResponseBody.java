// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCertResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertResponseBody</p>
 */
public class ListCertResponseBody extends TeaModel {
    @NameInMap("CertList")
    private java.util.List < CertList> certList;

    @NameInMap("CurrentPage")
    private Long currentPage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowSize")
    private Long showSize;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListCertResponseBody(Builder builder) {
        this.certList = builder.certList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertResponseBody create() {
        return builder().build();
    }

    /**
     * @return certList
     */
    public java.util.List < CertList> getCertList() {
        return this.certList;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
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
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CertList> certList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        /**
         * An array that consists of the certificates.
         */
        public Builder certList(java.util.List < CertList> certList) {
            this.certList = certList;
            return this;
        }

        /**
         * The page number of the returned page. Default value: 1.
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
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
         * The number of entries returned per page. Default value: 50.
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertResponseBody build() {
            return new ListCertResponseBody(this);
        } 

    } 

    public static class CertList extends TeaModel {
        @NameInMap("AfterDate")
        private Long afterDate;

        @NameInMap("BeforeDate")
        private Long beforeDate;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("CommonName")
        private String commonName;

        @NameInMap("ExistPrivateKey")
        private Boolean existPrivateKey;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("Sans")
        private String sans;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("WhId")
        private Long whId;

        @NameInMap("WhInstanceId")
        private String whInstanceId;

        private CertList(Builder builder) {
            this.afterDate = builder.afterDate;
            this.beforeDate = builder.beforeDate;
            this.certType = builder.certType;
            this.commonName = builder.commonName;
            this.existPrivateKey = builder.existPrivateKey;
            this.identifier = builder.identifier;
            this.issuer = builder.issuer;
            this.sans = builder.sans;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.whId = builder.whId;
            this.whInstanceId = builder.whInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertList create() {
            return builder().build();
        }

        /**
         * @return afterDate
         */
        public Long getAfterDate() {
            return this.afterDate;
        }

        /**
         * @return beforeDate
         */
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return existPrivateKey
         */
        public Boolean getExistPrivateKey() {
            return this.existPrivateKey;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return sans
         */
        public String getSans() {
            return this.sans;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return whId
         */
        public Long getWhId() {
            return this.whId;
        }

        /**
         * @return whInstanceId
         */
        public String getWhInstanceId() {
            return this.whInstanceId;
        }

        public static final class Builder {
            private Long afterDate; 
            private Long beforeDate; 
            private String certType; 
            private String commonName; 
            private Boolean existPrivateKey; 
            private String identifier; 
            private String issuer; 
            private String sans; 
            private String sourceType; 
            private String status; 
            private Long whId; 
            private String whInstanceId; 

            /**
             * The expiration time of the certificate. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * The issuance time of the certificate. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * The type of the certificate.
             * <p>
             * 
             * *   **CA**: the CA certificate.
             * *   **CERT**: a issued certificate.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * Indicates whether the certificate contains a private key. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder existPrivateKey(Boolean existPrivateKey) {
                this.existPrivateKey = existPrivateKey;
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
             * The issuer of the certificate.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * The domain names that are bound to the certificate. Multiple domain names are separated by commas.
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * The source of the certificate. Valid values:
             * <p>
             * 
             * *   **upload**: uploaded certificate
             * *   **aliyun**: Alibaba Cloud certificate
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
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
             * The ID of the certificate repository.
             */
            public Builder whId(Long whId) {
                this.whId = whId;
                return this;
            }

            /**
             * The instance ID of the certificate repository.
             */
            public Builder whInstanceId(String whInstanceId) {
                this.whInstanceId = whInstanceId;
                return this;
            }

            public CertList build() {
                return new CertList(this);
            } 

        } 

    }
}
