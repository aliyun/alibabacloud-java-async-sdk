// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnHttpsDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnHttpsDomainListResponseBody</p>
 */
public class DescribeCdnHttpsDomainListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertInfos")
    private CertInfos certInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCdnHttpsDomainListResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnHttpsDomainListResponseBody create() {
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
         * The information about the certificate.
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

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCdnHttpsDomainListResponseBody build() {
            return new DescribeCdnHttpsDomainListResponseBody(this);
        } 

    } 

    public static class CertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertCommonName")
        private String certCommonName;

        @com.aliyun.core.annotation.NameInMap("CertExpireTime")
        private String certExpireTime;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertStartTime")
        private String certStartTime;

        @com.aliyun.core.annotation.NameInMap("CertStatus")
        private String certStatus;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("CertUpdateTime")
        private String certUpdateTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
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
             * The returned primary domain name of the certificate.
             */
            public Builder certCommonName(String certCommonName) {
                this.certCommonName = certCommonName;
                return this;
            }

            /**
             * The time at which the certificate expires.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
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
             * The time at which the certificate became effective.
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * The status of the certificate.
             * <p>
             * 
             * *   **ok**: The certificate is working as expected.
             * *   **mismatch**: The certificate does not match the specified domain name.
             * *   **expired**: The certificate has expired.
             * *   **expire_soon**: The certificate will expire soon.
             */
            public Builder certStatus(String certStatus) {
                this.certStatus = certStatus;
                return this;
            }

            /**
             * The type of the certificate.
             * <p>
             * 
             * *   **free**: a free certificate.
             * *   **cas**: a certificate that is purchased from Alibaba Cloud SSL Certificates Service.
             * *   **upload**: a certificate that is uploaded by the user.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * The time at which the certificate was updated.
             */
            public Builder certUpdateTime(String certUpdateTime) {
                this.certUpdateTime = certUpdateTime;
                return this;
            }

            /**
             * The accelerated domain name.
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
