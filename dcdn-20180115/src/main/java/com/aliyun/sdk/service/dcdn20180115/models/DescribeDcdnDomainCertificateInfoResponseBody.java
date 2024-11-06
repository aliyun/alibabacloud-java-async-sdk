// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainCertificateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainCertificateInfoResponseBody</p>
 */
public class DescribeDcdnDomainCertificateInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertInfos")
    private CertInfos certInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainCertificateInfoResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainCertificateInfoResponseBody create() {
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
         * <p>The information about the certificate.</p>
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5C1E43DC-9E51-4771-82C0-7D5ECEB547A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainCertificateInfoResponseBody build() {
            return new DescribeDcdnDomainCertificateInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainCertificateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainCertificateInfoResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("SSLProtocol")
        private String SSLProtocol;

        @com.aliyun.core.annotation.NameInMap("SSLPub")
        private String SSLPub;

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
            this.certType = builder.certType;
            this.domainName = builder.domainName;
            this.SSLProtocol = builder.SSLProtocol;
            this.SSLPub = builder.SSLPub;
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
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return SSLProtocol
         */
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        /**
         * @return SSLPub
         */
        public String getSSLPub() {
            return this.SSLPub;
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
            private String certType; 
            private String domainName; 
            private String SSLProtocol; 
            private String SSLPub; 
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
             * <p>The time at which the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-06-03T22:03:39Z</p>
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>9002448</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The validity period of the certificate. Unit: <strong>months</strong> or <strong>years</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3 months</p>
             */
            public Builder certLife(String certLife) {
                this.certLife = certLife;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
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
             * <p>The type of the certificate.</p>
             * <ul>
             * <li><strong>cas</strong>: a certificate that is purchased by using Certificates Management Service</li>
             * <li><strong>upload</strong>: a custom certificate that you upload</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cas</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The status of HTTPS. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder SSLProtocol(String SSLProtocol) {
                this.SSLProtocol = SSLProtocol;
                return this;
            }

            /**
             * <p>The public key of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder SSLPub(String SSLPub) {
                this.SSLPub = SSLPub;
                return this;
            }

            /**
             * <p>The status of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>success</strong>: The certificate has taken effect.</li>
             * <li><strong>checking</strong>: The system is checking whether the domain name is using Dynamic Route for CDN (DCDN).</li>
             * <li><strong>cname_error</strong>: The domain name is not using DCDN.</li>
             * <li><strong>domain_invalid</strong>: The domain name contains invalid characters.</li>
             * <li><strong>unsupport_wildcard</strong>: The wildcard domain name is not supported.</li>
             * <li><strong>applying</strong>: Certificate application is in progress.</li>
             * <li><strong>get_token_timeout</strong>: The certificate application request has timed out.</li>
             * <li><strong>check_token_timeout</strong>: The verification has timed out.</li>
             * <li><strong>get_cert_timeout</strong>: The request to obtain the certificate has timed out.</li>
             * <li><strong>failed</strong>: The certificate application request failed.</li>
             * </ul>
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
     * {@link DescribeDcdnDomainCertificateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainCertificateInfoResponseBody</p>
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
