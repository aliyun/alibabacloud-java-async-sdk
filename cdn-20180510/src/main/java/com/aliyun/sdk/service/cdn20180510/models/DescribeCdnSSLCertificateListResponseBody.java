// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnSSLCertificateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnSSLCertificateListResponseBody</p>
 */
public class DescribeCdnSSLCertificateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateListModel")
    private CertificateListModel certificateListModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnSSLCertificateListResponseBody(Builder builder) {
        this.certificateListModel = builder.certificateListModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnSSLCertificateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateListModel
     */
    public CertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CertificateListModel certificateListModel; 
        private String requestId; 

        /**
         * <p>The list of certificates.</p>
         */
        public Builder certificateListModel(CertificateListModel certificateListModel) {
            this.certificateListModel = certificateListModel;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E9D3257A-1B7C-414C-90C1-8D07AC47BCAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnSSLCertificateListResponseBody build() {
            return new DescribeCdnSSLCertificateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnSSLCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnSSLCertificateListResponseBody</p>
     */
    public static class Cert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertId")
        private Long certId;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertRegion")
        private String certRegion;

        @com.aliyun.core.annotation.NameInMap("Common")
        private String common;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        private Cert(Builder builder) {
            this.certId = builder.certId;
            this.certName = builder.certName;
            this.certRegion = builder.certRegion;
            this.common = builder.common;
            this.fingerprint = builder.fingerprint;
            this.issuer = builder.issuer;
            this.lastTime = builder.lastTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cert create() {
            return builder().build();
        }

        /**
         * @return certId
         */
        public Long getCertId() {
            return this.certId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certRegion
         */
        public String getCertRegion() {
            return this.certRegion;
        }

        /**
         * @return common
         */
        public String getCommon() {
            return this.common;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        public static final class Builder {
            private Long certId; 
            private String certName; 
            private String certRegion; 
            private String common; 
            private String fingerprint; 
            private String issuer; 
            private Long lastTime; 

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>9128192</p>
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>yourCertName</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The region ID of the certificate. Valid values: <strong>cn-hangzhou</strong> and <strong>ap-southeast-1</strong>. Default value: <strong>cn-hangzhou</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder certRegion(String certRegion) {
                this.certRegion = certRegion;
                return this;
            }

            /**
             * <p>The Common Name (CN) attribute of the certificate. In most cases, the CN is a domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder common(String common) {
                this.common = common;
                return this;
            }

            /**
             * <p>The fingerprint of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>933c6ddee95c9c41a40f9f50493d82be03ad87bf</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>yourCertIssuer</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The time when the certificate was last modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679896965</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            public Cert build() {
                return new Cert(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnSSLCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnSSLCertificateListResponseBody</p>
     */
    public static class CertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cert")
        private java.util.List < Cert> cert;

        private CertList(Builder builder) {
            this.cert = builder.cert;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertList create() {
            return builder().build();
        }

        /**
         * @return cert
         */
        public java.util.List < Cert> getCert() {
            return this.cert;
        }

        public static final class Builder {
            private java.util.List < Cert> cert; 

            /**
             * Cert.
             */
            public Builder cert(java.util.List < Cert> cert) {
                this.cert = cert;
                return this;
            }

            public CertList build() {
                return new CertList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnSSLCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnSSLCertificateListResponseBody</p>
     */
    public static class CertificateListModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertList")
        private CertList certList;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        private CertificateListModel(Builder builder) {
            this.certList = builder.certList;
            this.count = builder.count;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateListModel create() {
            return builder().build();
        }

        /**
         * @return certList
         */
        public CertList getCertList() {
            return this.certList;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private CertList certList; 
            private Integer count; 
            private Long pageNumber; 
            private Long pageSize; 

            /**
             * <p>Details about each certificate.</p>
             */
            public Builder certList(CertList certList) {
                this.certList = certList;
                return this;
            }

            /**
             * <p>The number of certificates.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number. Pages start from page 1. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Valid values: an integer from 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public CertificateListModel build() {
                return new CertificateListModel(this);
            } 

        } 

    }
}
