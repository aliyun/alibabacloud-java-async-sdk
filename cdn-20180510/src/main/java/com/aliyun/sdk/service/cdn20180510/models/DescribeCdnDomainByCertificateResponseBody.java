// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainByCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainByCertificateResponseBody</p>
 */
public class DescribeCdnDomainByCertificateResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    private CertInfos certInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCdnDomainByCertificateResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainByCertificateResponseBody create() {
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
         * CertInfos.
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDomainByCertificateResponseBody build() {
            return new DescribeCdnDomainByCertificateResponseBody(this);
        } 

    } 

    public static class CertInfo extends TeaModel {
        @NameInMap("CertCaIsLegacy")
        private String certCaIsLegacy;

        @NameInMap("CertExpireTime")
        private String certExpireTime;

        @NameInMap("CertExpired")
        private String certExpired;

        @NameInMap("CertStartTime")
        private String certStartTime;

        @NameInMap("CertSubjectCommonName")
        private String certSubjectCommonName;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("DomainList")
        private String domainList;

        @NameInMap("DomainNames")
        private String domainNames;

        @NameInMap("Issuer")
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
             * CertCaIsLegacy.
             */
            public Builder certCaIsLegacy(String certCaIsLegacy) {
                this.certCaIsLegacy = certCaIsLegacy;
                return this;
            }

            /**
             * CertExpireTime.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * CertExpired.
             */
            public Builder certExpired(String certExpired) {
                this.certExpired = certExpired;
                return this;
            }

            /**
             * CertStartTime.
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * CertSubjectCommonName.
             */
            public Builder certSubjectCommonName(String certSubjectCommonName) {
                this.certSubjectCommonName = certSubjectCommonName;
                return this;
            }

            /**
             * CertType.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * DomainList.
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * DomainNames.
             */
            public Builder domainNames(String domainNames) {
                this.domainNames = domainNames;
                return this;
            }

            /**
             * Issuer.
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
