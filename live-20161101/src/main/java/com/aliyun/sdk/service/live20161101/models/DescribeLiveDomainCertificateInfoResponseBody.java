// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainCertificateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainCertificateInfoResponseBody</p>
 */
public class DescribeLiveDomainCertificateInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertInfos")
    private CertInfos certInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainCertificateInfoResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainCertificateInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveDomainCertificateInfoResponseBody model) {
            this.certInfos = model.certInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The certificate information.</p>
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5C1E43DC-9E51-4771-82C0-7D5ECEB547A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainCertificateInfoResponseBody build() {
            return new DescribeLiveDomainCertificateInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainCertificateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainCertificateInfoResponseBody</p>
     */
    public static class CertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertDomainName")
        private String certDomainName;

        @com.aliyun.core.annotation.NameInMap("CertExpireTime")
        private String certExpireTime;

        @com.aliyun.core.annotation.NameInMap("CertLife")
        private String certLife;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertOrg")
        private String certOrg;

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
            this.certLife = builder.certLife;
            this.certName = builder.certName;
            this.certOrg = builder.certOrg;
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
            private String certLife; 
            private String certName; 
            private String certOrg; 
            private String certType; 
            private String domainName; 
            private String SSLProtocol; 
            private String SSLPub; 
            private String status; 

            private Builder() {
            } 

            private Builder(CertInfo model) {
                this.certDomainName = model.certDomainName;
                this.certExpireTime = model.certExpireTime;
                this.certLife = model.certLife;
                this.certName = model.certName;
                this.certOrg = model.certOrg;
                this.certType = model.certType;
                this.domainName = model.domainName;
                this.SSLProtocol = model.SSLProtocol;
                this.SSLPub = model.SSLPub;
                this.status = model.status;
            } 

            /**
             * <p>The streaming domain or ingest domain that matches the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder certDomainName(String certDomainName) {
                this.certDomainName = certDomainName;
                return this;
            }

            /**
             * <p>The expiration time of the certificate. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-06-03T22:03:39Z</p>
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * <p>The validity period of the certificate.</p>
             * <ul>
             * <li>If the validity period is greater than 12 months, XX years XX months is displayed. For example, 2 years 3 months indicates that the validity period is 2 years and 3 months.</li>
             * <li>If the validity period is less than 12 months, XX months is displayed. For example, 3 months indicates that the validity period is 3 months.</li>
             * </ul>
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
             * <p>Cert-****</p>
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
             * <p>The type of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>free</strong>: a free certificate (for testing)</li>
             * <li><strong>cas</strong>: a certificate that is purchased from Certificate Management Service</li>
             * <li><strong>upload</strong>: a custom certificate that you uploaded</li>
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
             * <p>The streaming domain or ingest domain.</p>
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
             * <li><strong>on</strong>: HTTPS is enabled.</li>
             * <li><strong>off</strong>: HTTPS is disabled.</li>
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
             * <p>yourSSLPub</p>
             */
            public Builder SSLPub(String SSLPub) {
                this.SSLPub = SSLPub;
                return this;
            }

            /**
             * <p>The status of the free certificate that is used for testing. Valid values:</p>
             * <ul>
             * <li><strong>success</strong>: The certificate is effective.</li>
             * <li><strong>checking</strong>: The system is checking whether the domain name is mapped to the CNAME that is assigned by ApsaraVideo Live.</li>
             * <li><strong>cname_error</strong>: The domain name is not mapped to the CNAME that is assigned by ApsaraVideo Live.</li>
             * <li><strong>domain_invalid</strong>: The domain name contains invalid characters.</li>
             * <li><strong>unsupport_wildcard</strong>: The domain name is a wildcard domain name, which is not supported.</li>
             * <li><strong>applying</strong>: The certificate is in the application progress.</li>
             * <li><strong>failed</strong>: The application for the certificate failed.</li>
             * </ul>
             * <blockquote>
             * <p> The <strong>Status</strong> parameter is valid only if the certificate is a free certificate for testing. If the certificate is not a free certificate for testing, an empty value is returned.</p>
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
     * {@link DescribeLiveDomainCertificateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainCertificateInfoResponseBody</p>
     */
    public static class CertInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertInfo")
        private java.util.List<CertInfo> certInfo;

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
        public java.util.List<CertInfo> getCertInfo() {
            return this.certInfo;
        }

        public static final class Builder {
            private java.util.List<CertInfo> certInfo; 

            private Builder() {
            } 

            private Builder(CertInfos model) {
                this.certInfo = model.certInfo;
            } 

            /**
             * CertInfo.
             */
            public Builder certInfo(java.util.List<CertInfo> certInfo) {
                this.certInfo = certInfo;
                return this;
            }

            public CertInfos build() {
                return new CertInfos(this);
            } 

        } 

    }
}
