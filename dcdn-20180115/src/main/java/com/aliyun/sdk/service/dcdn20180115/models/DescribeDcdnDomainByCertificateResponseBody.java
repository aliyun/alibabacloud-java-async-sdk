// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainByCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainByCertificateResponseBody</p>
 */
public class DescribeDcdnDomainByCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertInfos")
    private CertInfos certInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainByCertificateResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainByCertificateResponseBody create() {
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
         * <p>ASAF2FDS-12SADSA-DDSAE3D-DSADCD4C-CDADS2D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainByCertificateResponseBody build() {
            return new DescribeDcdnDomainByCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainByCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainByCertificateResponseBody</p>
     */
    public static class CertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertCaIsLegacy")
        private String certCaIsLegacy;

        @com.aliyun.core.annotation.NameInMap("CertExpireTime")
        private String certExpireTime;

        @com.aliyun.core.annotation.NameInMap("CertExpired")
        private String certExpired;

        @com.aliyun.core.annotation.NameInMap("CertStartTime")
        private String certStartTime;

        @com.aliyun.core.annotation.NameInMap("CertSubjectCommonName")
        private String certSubjectCommonName;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private String domainList;

        @com.aliyun.core.annotation.NameInMap("DomainNames")
        private String domainNames;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        private CertInfo(Builder builder) {
            this.certCaIsLegacy = builder.certCaIsLegacy;
            this.certExpireTime = builder.certExpireTime;
            this.certExpired = builder.certExpired;
            this.certStartTime = builder.certStartTime;
            this.certSubjectCommonName = builder.certSubjectCommonName;
            this.certType = builder.certType;
            this.domainList = builder.domainList;
            this.domainNames = builder.domainNames;
            this.issuer = builder.issuer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
        }

        /**
         * @return certCaIsLegacy
         */
        public String getCertCaIsLegacy() {
            return this.certCaIsLegacy;
        }

        /**
         * @return certExpireTime
         */
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        /**
         * @return certExpired
         */
        public String getCertExpired() {
            return this.certExpired;
        }

        /**
         * @return certStartTime
         */
        public String getCertStartTime() {
            return this.certStartTime;
        }

        /**
         * @return certSubjectCommonName
         */
        public String getCertSubjectCommonName() {
            return this.certSubjectCommonName;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return domainList
         */
        public String getDomainList() {
            return this.domainList;
        }

        /**
         * @return domainNames
         */
        public String getDomainNames() {
            return this.domainNames;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        public static final class Builder {
            private String certCaIsLegacy; 
            private String certExpireTime; 
            private String certExpired; 
            private String certStartTime; 
            private String certSubjectCommonName; 
            private String certType; 
            private String domainList; 
            private String domainNames; 
            private String issuer; 

            /**
             * <p>Indicates whether the SSL certificate is obsolete. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong>: The SSL certificate is obsolete.</li>
             * <li><strong>no</strong>: The SSL certificate is working as expected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
             */
            public Builder certCaIsLegacy(String certCaIsLegacy) {
                this.certCaIsLegacy = certCaIsLegacy;
                return this;
            }

            /**
             * <p>The time at which the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>Nov 29 00:00:00 2016 GMT</p>
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * <p>Indicates whether the SSL certificate is expired. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong>: The SSL certificate is expired.</li>
             * <li><strong>no</strong>: The SSL certificate is not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
             */
            public Builder certExpired(String certExpired) {
                this.certExpired = certExpired;
                return this;
            }

            /**
             * <p>The time at which the certificate became effective.</p>
             * 
             * <strong>example:</strong>
             * <p>Nov 29 23:59:59 2017 GMT</p>
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * <p>The name of the SSL certificate owner.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder certSubjectCommonName(String certSubjectCommonName) {
                this.certSubjectCommonName = certSubjectCommonName;
                return this;
            }

            /**
             * <p>The type of the certificate. Valid values: <strong>RSA</strong>, <strong>DSA</strong>, and <strong>ECDSA</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>The list of domain names that use the certificate.</p>
             * <p>If one or more domain names are returned, the domain names are matched with the specified certificate. Multiple domain names are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>example.com,example.org</p>
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * <p>The domain names (DNS fields) that match the certificate. Multiple domain names are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com,example.org</p>
             */
            public Builder domainNames(String domainNames) {
                this.domainNames = domainNames;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>C=US, O=Symantec Corporation, OU=Symantec Trust Network, OU=Domain Validated SSL, CN=Symantec Basic DV SSL CA - G1</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainByCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainByCertificateResponseBody</p>
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
