// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainCertificateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainCertificateInfoResponseBody</p>
 */
public class DescribeVodDomainCertificateInfoResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    private CertInfos certInfos;

    @NameInMap("RequestId")
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
         * The certificate information about the domain name.
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainCertificateInfoResponseBody build() {
            return new DescribeVodDomainCertificateInfoResponseBody(this);
        } 

    } 

    public static class CertInfo extends TeaModel {
        @NameInMap("CertDomainName")
        private String certDomainName;

        @NameInMap("CertExpireTime")
        private String certExpireTime;

        @NameInMap("CertLife")
        private String certLife;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("CertOrg")
        private String certOrg;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ServerCertificateStatus")
        private String serverCertificateStatus;

        @NameInMap("Status")
        private String status;

        private CertInfo(Builder builder) {
            this.certDomainName = builder.certDomainName;
            this.certExpireTime = builder.certExpireTime;
            this.certLife = builder.certLife;
            this.certName = builder.certName;
            this.certOrg = builder.certOrg;
            this.certType = builder.certType;
            this.domainName = builder.domainName;
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
            private String certLife; 
            private String certName; 
            private String certOrg; 
            private String certType; 
            private String domainName; 
            private String serverCertificateStatus; 
            private String status; 

            /**
             * The domain name that matches the certificate.
             */
            public Builder certDomainName(String certDomainName) {
                this.certDomainName = certDomainName;
                return this;
            }

            /**
             * The time at which the certificate expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * The validity period of the certificate. Unit: months or years.
             */
            public Builder certLife(String certLife) {
                this.certLife = certLife;
                return this;
            }

            /**
             * The name of the certificate.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The certificate authority (CA) that issued the certificate.
             */
            public Builder certOrg(String certOrg) {
                this.certOrg = certOrg;
                return this;
            }

            /**
             * The type of the certificate. Valid values:
             * <p>
             * 
             * *   **free**: a free certificate.
             * *   **cas**: a certificate that is purchased from Certificate Management Service.
             * *   **upload**: a user-uploaded certificate.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Indicates whether the SSL certificate is enabled.
             * <p>
             * 
             * *   **on**
             * *   **off**
             */
            public Builder serverCertificateStatus(String serverCertificateStatus) {
                this.serverCertificateStatus = serverCertificateStatus;
                return this;
            }

            /**
             * The status of the certificate. Valid values:
             * <p>
             * 
             * *   **success**: The certificate is in effect.
             * *   **checking**: The system is checking whether the domain name is added to ApsaraVideo VOD.
             * *   **cname_error**: The domain name is not added to ApsaraVideo VOD.
             * *   **domain_invalid**: The domain name contains invalid characters.
             * *   **unsupport_wildcard**: The domain name is a wildcard domain name. Wildcard domain names are not supported.
             * *   **applying**: The certificate application is in progress.
             * *   **failed**: The certificate application failed.
             * 
             * > A value is returned for this parameter only if `free` is returned for `CertType`. If a value other than free is returned for CertType, an empty string is returned for this parameter.
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
    public static class CertInfos extends TeaModel {
        @NameInMap("CertInfo")
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
