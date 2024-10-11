// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodDomainCertificateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainCertificateInfoResponseBody</p>
 */
public class DescribeVodDomainCertificateInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertInfos")
    private CertInfos certInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainCertificateInfoResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainCertificateInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return certInfos
     */
    public CertInfos getCertInfos() {
        return this.certInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CertInfos certInfos; 
        private String requestId; 

        /**
         * <p>The certificate information.</p>
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5C1E43DC-9E51-4771-****-7D5ECEB547A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainCertificateInfoResponseBody build() {
            return new DescribeVodDomainCertificateInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainCertificateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainCertificateInfoResponseBody</p>
     */
    public static class CertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertDomainName")
        private String certDomainName;

        @com.aliyun.core.annotation.NameInMap("CertExpireTime")
        private String certExpireTime;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertLife")
        private String certLife;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertOrg")
        private String certOrg;

        @com.aliyun.core.annotation.NameInMap("CertRegion")
        private String certRegion;

        @com.aliyun.core.annotation.NameInMap("CertStartTime")
        private String certStartTime;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("CertUpdateTime")
        private String certUpdateTime;

        @com.aliyun.core.annotation.NameInMap("DomainCnameStatus")
        private String domainCnameStatus;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ServerCertificate")
        private String serverCertificate;

        @com.aliyun.core.annotation.NameInMap("ServerCertificateStatus")
        private String serverCertificateStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CertInfo(Builder builder) {
            this.certDomainName = builder.certDomainName;
            this.certExpireTime = builder.certExpireTime;
            this.certId = builder.certId;
            this.certLife = builder.certLife;
            this.certName = builder.certName;
            this.certOrg = builder.certOrg;
            this.certRegion = builder.certRegion;
            this.certStartTime = builder.certStartTime;
            this.certType = builder.certType;
            this.certUpdateTime = builder.certUpdateTime;
            this.domainCnameStatus = builder.domainCnameStatus;
            this.domainName = builder.domainName;
            this.serverCertificate = builder.serverCertificate;
            this.serverCertificateStatus = builder.serverCertificateStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
        }

        /**
         * @return certDomainName
         */
        public String getCertDomainName() {
            return this.certDomainName;
        }

        /**
         * @return certExpireTime
         */
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return certLife
         */
        public String getCertLife() {
            return this.certLife;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certOrg
         */
        public String getCertOrg() {
            return this.certOrg;
        }

        /**
         * @return certRegion
         */
        public String getCertRegion() {
            return this.certRegion;
        }

        /**
         * @return certStartTime
         */
        public String getCertStartTime() {
            return this.certStartTime;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return certUpdateTime
         */
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        /**
         * @return domainCnameStatus
         */
        public String getDomainCnameStatus() {
            return this.domainCnameStatus;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return serverCertificate
         */
        public String getServerCertificate() {
            return this.serverCertificate;
        }

        /**
         * @return serverCertificateStatus
         */
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String certDomainName; 
            private String certExpireTime; 
            private String certId; 
            private String certLife; 
            private String certName; 
            private String certOrg; 
            private String certRegion; 
            private String certStartTime; 
            private String certType; 
            private String certUpdateTime; 
            private String domainCnameStatus; 
            private String domainName; 
            private String serverCertificate; 
            private String serverCertificateStatus; 
            private String status; 

            /**
             * <p>The domain name that matches the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder certDomainName(String certDomainName) {
                this.certDomainName = certDomainName;
                return this;
            }

            /**
             * <p>The time at which the certificate expires. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-06-03T13:03:39Z</p>
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>13227737-cn-hangzhou</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The validity period of the certificate. Unit: months or years.</p>
             * 
             * <strong>example:</strong>
             * <p>3 months</p>
             */
            public Builder certLife(String certLife) {
                this.certLife = certLife;
                return this;
            }

            /**
             * <p>The certificate name.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-example.com</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Let&quot;s Encrypt</p>
             */
            public Builder certOrg(String certOrg) {
                this.certOrg = certOrg;
                return this;
            }

            /**
             * <p>The region where the certificate is used.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder certRegion(String certRegion) {
                this.certRegion = certRegion;
                return this;
            }

            /**
             * <p>The time when the certificate became effective.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-26T20:23:38Z</p>
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * <p>The type of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>free</strong>: a free certificate.</li>
             * <li><strong>cas</strong>: a certificate that is purchased from Certificate Management Service.</li>
             * <li><strong>upload</strong>: a user-uploaded certificate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>free</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>The time at which the certificate was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-26T20:23:38Z</p>
             */
            public Builder certUpdateTime(String certUpdateTime) {
                this.certUpdateTime = certUpdateTime;
                return this;
            }

            /**
             * <p>The CNAME status of the domain name.</p>
             * <ul>
             * <li><strong>ok</strong>: The domain name points to the CNAME assigned by Alibaba Cloud CDN.</li>
             * <li><strong>cname_error</strong>: An error occurred and the domain name cannot point to the CNAME.</li>
             * <li><strong>op_domain_cname_error</strong> : An error occurred to the CNAME of the top-level domain. The domain name cannot point to the CNAME.</li>
             * <li><strong>unsupport_wildcard</strong>: The wildcard domain name is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder domainCnameStatus(String domainCnameStatus) {
                this.domainCnameStatus = domainCnameStatus;
                return this;
            }

            /**
             * <p>The accelerated domain name whose ICP filing status you want to update.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The public key of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder serverCertificate(String serverCertificate) {
                this.serverCertificate = serverCertificate;
                return this;
            }

            /**
             * <p>The status of the SSL certificate.</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>checking</p>
             */
            public Builder serverCertificateStatus(String serverCertificateStatus) {
                this.serverCertificateStatus = serverCertificateStatus;
                return this;
            }

            /**
             * <p>The status of the certificate.</p>
             * <ul>
             * <li><strong>success</strong>: The certificate is in effect.</li>
             * <li><strong>checking</strong>: The system is checking whether the domain name is added to ApsaraVideo VOD.</li>
             * <li><strong>cname_error</strong>: The domain name is not added to ApsaraVideo VOD.</li>
             * <li><strong>domain_invalid</strong>: The domain name contains invalid characters.</li>
             * <li><strong>unsupport_wildcard</strong>: The domain name is a wildcard domain name. Wildcard domain names are not supported.</li>
             * <li><strong>applying</strong>: The certificate application is in progress.</li>
             * <li><strong>failed</strong>: The certificate application failed.</li>
             * </ul>
             * <blockquote>
             * <p> A value is returned for this parameter only when you set <code>CertType</code> to <code>free</code>. Otherwise, an empty value is returned for this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainCertificateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainCertificateInfoResponseBody</p>
     */
    public static class CertInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertInfo")
        private java.util.List < CertInfo> certInfo;

        private CertInfos(Builder builder) {
            this.certInfo = builder.certInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfos create() {
            return builder().build();
        }

        /**
         * @return certInfo
         */
        public java.util.List < CertInfo> getCertInfo() {
            return this.certInfo;
        }

        public static final class Builder {
            private java.util.List < CertInfo> certInfo; 

            /**
             * CertInfo.
             */
            public Builder certInfo(java.util.List < CertInfo> certInfo) {
                this.certInfo = certInfo;
                return this;
            }

            public CertInfos build() {
                return new CertInfos(this);
            } 

        } 

    }
}
