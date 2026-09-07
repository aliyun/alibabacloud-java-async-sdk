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
 * {@link ListCertResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertResponseBody</p>
 */
public class ListCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertList")
    private java.util.List<CertList> certList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certList
     */
    public java.util.List<CertList> getCertList() {
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
        private java.util.List<CertList> certList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCertResponseBody model) {
            this.certList = model.certList;
            this.currentPage = model.currentPage;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of certificates.</p>
         */
        public Builder certList(java.util.List<CertList> certList) {
            this.certList = certList;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
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
         * <p>The page size. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertResponseBody build() {
            return new ListCertResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCertResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertResponseBody</p>
     */
    public static class CertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private Long afterDate;

        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private Long beforeDate;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("ExistPrivateKey")
        private Boolean existPrivateKey;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private String sans;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        private String serialNo;

        @com.aliyun.core.annotation.NameInMap("SignAlgorithm")
        private String signAlgorithm;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WhId")
        private Long whId;

        @com.aliyun.core.annotation.NameInMap("WhInstanceId")
        private String whInstanceId;

        private CertList(Builder builder) {
            this.afterDate = builder.afterDate;
            this.algorithm = builder.algorithm;
            this.beforeDate = builder.beforeDate;
            this.certType = builder.certType;
            this.commonName = builder.commonName;
            this.existPrivateKey = builder.existPrivateKey;
            this.identifier = builder.identifier;
            this.issuer = builder.issuer;
            this.sans = builder.sans;
            this.serialNo = builder.serialNo;
            this.signAlgorithm = builder.signAlgorithm;
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
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        /**
         * @return signAlgorithm
         */
        public String getSignAlgorithm() {
            return this.signAlgorithm;
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
            private String algorithm; 
            private Long beforeDate; 
            private String certType; 
            private String commonName; 
            private Boolean existPrivateKey; 
            private String identifier; 
            private String issuer; 
            private String sans; 
            private String serialNo; 
            private String signAlgorithm; 
            private String sourceType; 
            private String status; 
            private Long whId; 
            private String whInstanceId; 

            private Builder() {
            } 

            private Builder(CertList model) {
                this.afterDate = model.afterDate;
                this.algorithm = model.algorithm;
                this.beforeDate = model.beforeDate;
                this.certType = model.certType;
                this.commonName = model.commonName;
                this.existPrivateKey = model.existPrivateKey;
                this.identifier = model.identifier;
                this.issuer = model.issuer;
                this.sans = model.sans;
                this.serialNo = model.serialNo;
                this.signAlgorithm = model.signAlgorithm;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.whId = model.whId;
                this.whInstanceId = model.whInstanceId;
            } 

            /**
             * <p>The expiration date of the certificate. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634283958000</p>
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The encryption algorithm of the certificate. Valid values:</p>
             * <ul>
             * <li><p><strong>RSA</strong>: the RSA algorithm</p>
             * </li>
             * <li><p><strong>ECC</strong>: the ECC algorithm</p>
             * </li>
             * <li><p><strong>SM2</strong>: the SM2 algorithm</p>
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
             * <p>The start date of the certificate\&quot;s validity period. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665819958000</p>
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>The type of the certificate. Valid values:</p>
             * <ul>
             * <li><p><strong>CA</strong>: a Certificate Authority (CA) certificate</p>
             * </li>
             * <li><p><strong>CERT</strong>: an issued certificate</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CERT</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>The common name of the certificate. This is typically the primary domain name associated with the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.alibaba.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>Indicates whether a private key is available for the certificate. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong></p>
             * </li>
             * <li><p><strong>false</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder existPrivateKey(Boolean existPrivateKey) {
                this.existPrivateKey = existPrivateKey;
                return this;
            }

            /**
             * <p>The unique identifier of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>14dcc8afc7578e</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The issuer of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>mySSL</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The Subject Alternative Names (SANs) associated with the certificate. Multiple domain names are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>*.alibaba.com,aliyun.alibaba.com</p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The serial number of the certificate. This parameter is returned only if the <code>OrderType</code> request parameter is set to <code>CERT</code> or <code>UPLOAD</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>038abf4c27c33a7c11ad6658124135b52180</p>
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
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
             * <p>The source of the certificate. Valid values:</p>
             * <ul>
             * <li><p><strong>upload</strong>: The certificate is uploaded.</p>
             * </li>
             * <li><p><strong>aliyun</strong>: The certificate is from Alibaba Cloud.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
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
             * <p>The warehouse ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder whId(Long whId) {
                this.whId = whId;
                return this;
            }

            /**
             * <p>The warehouse instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test_whInstanceId</p>
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
