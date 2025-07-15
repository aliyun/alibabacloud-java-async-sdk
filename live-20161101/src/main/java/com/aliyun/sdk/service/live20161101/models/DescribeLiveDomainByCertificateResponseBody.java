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
 * {@link DescribeLiveDomainByCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainByCertificateResponseBody</p>
 */
public class DescribeLiveDomainByCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertInfos")
    private CertInfos certInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainByCertificateResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainByCertificateResponseBody create() {
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

        private Builder(DescribeLiveDomainByCertificateResponseBody model) {
            this.certInfos = model.certInfos;
            this.requestId = model.requestId;
        } 

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

        public DescribeLiveDomainByCertificateResponseBody build() {
            return new DescribeLiveDomainByCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainByCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainByCertificateResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CertInfo model) {
                this.certCaIsLegacy = model.certCaIsLegacy;
                this.certExpireTime = model.certExpireTime;
                this.certExpired = model.certExpired;
                this.certStartTime = model.certStartTime;
                this.certSubjectCommonName = model.certSubjectCommonName;
                this.certType = model.certType;
                this.domainList = model.domainList;
                this.domainNames = model.domainNames;
                this.issuer = model.issuer;
            } 

            /**
             * <p>Indicates whether the SSL certificate is obsolete. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
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
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
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
             * <p>The effective time of the certificate.</p>
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
             * <p>owner</p>
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
             * <p>The list of domain names. If a value is returned, the value matches the SSL certificate. Multiple domain names are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>example.com,aliyundoc.com</p>
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * <p>The domain names (DNS fields) that match the SSL certificate. Multiple domain names are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com,aliyundoc.com</p>
             */
            public Builder domainNames(String domainNames) {
                this.domainNames = domainNames;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the SSL certificate.</p>
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
     * {@link DescribeLiveDomainByCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainByCertificateResponseBody</p>
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
