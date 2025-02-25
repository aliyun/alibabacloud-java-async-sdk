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

        /**
         * <p>An array that consists of the certificates.</p>
         */
        public Builder certList(java.util.List<CertList> certList) {
            this.certList = certList;
            return this;
        }

        /**
         * <p>The page number of the returned page. Default value: 1.</p>
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
         * <p>The number of entries returned per page. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
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
             * <p>The expiration time of the certificate. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634283958000</p>
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The issuance time of the certificate. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665819958000</p>
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>证书的类型 。取值：</p>
             * <ul>
             * <li><strong>CA</strong>：表示CA证书。</li>
             * <li><strong>CERT</strong>：表示签发的证书。</li>
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
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.alibaba.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>Indicates whether the certificate contains a private key. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The domain names that are bound to the certificate. Multiple domain names are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>*.alibaba.com,aliyun.alibaba.com</p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The source of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>upload</strong>: uploaded certificate</li>
             * <li><strong>aliyun</strong>: Alibaba Cloud certificate</li>
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
             * <p>The ID of the certificate repository.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder whId(Long whId) {
                this.whId = whId;
                return this;
            }

            /**
             * <p>The instance ID of the certificate repository.</p>
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
