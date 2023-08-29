// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnHttpsDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnHttpsDomainListResponseBody</p>
 */
public class DescribeDcdnHttpsDomainListResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    private CertInfos certInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDcdnHttpsDomainListResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnHttpsDomainListResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CertInfos certInfos; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The time when the certificate became effective.
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * The returned primary domain name of the certificate.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1 to 500**. Default value: **20**.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnHttpsDomainListResponseBody build() {
            return new DescribeDcdnHttpsDomainListResponseBody(this);
        } 

    } 

    public static class CertInfo extends TeaModel {
        @NameInMap("CertCommonName")
        private String certCommonName;

        @NameInMap("CertExpireTime")
        private String certExpireTime;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("CertStartTime")
        private String certStartTime;

        @NameInMap("CertStatus")
        private String certStatus;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("CertUpdateTime")
        private String certUpdateTime;

        @NameInMap("DomainName")
        private String domainName;

        private CertInfo(Builder builder) {
            this.certCommonName = builder.certCommonName;
            this.certExpireTime = builder.certExpireTime;
            this.certName = builder.certName;
            this.certStartTime = builder.certStartTime;
            this.certStatus = builder.certStatus;
            this.certType = builder.certType;
            this.certUpdateTime = builder.certUpdateTime;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
        }

        /**
         * @return certCommonName
         */
        public String getCertCommonName() {
            return this.certCommonName;
        }

        /**
         * @return certExpireTime
         */
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certStartTime
         */
        public String getCertStartTime() {
            return this.certStartTime;
        }

        /**
         * @return certStatus
         */
        public String getCertStatus() {
            return this.certStatus;
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
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String certCommonName; 
            private String certExpireTime; 
            private String certName; 
            private String certStartTime; 
            private String certStatus; 
            private String certType; 
            private String certUpdateTime; 
            private String domainName; 

            /**
             * The certificate information about the domain name.
             */
            public Builder certCommonName(String certCommonName) {
                this.certCommonName = certCommonName;
                return this;
            }

            /**
             * The name of the certificate.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * The accelerated domain name for which the certificate information was queried.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The time when the certificate expires.
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * The number of pages to return. Valid values: **1 to 100000**.
             */
            public Builder certStatus(String certStatus) {
                this.certStatus = certStatus;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **DescribeDcdnHttpsDomainList**.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * The keyword used for search.
             */
            public Builder certUpdateTime(String certUpdateTime) {
                this.certUpdateTime = certUpdateTime;
                return this;
            }

            /**
             * The time when the certificate was updated.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
