// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>F5E8DF64-7175-4186-9B06-F002C0BBD0C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCdnHttpsDomainListResponseBody build() {
            return new DescribeCdnHttpsDomainListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnHttpsDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnHttpsDomainListResponseBody</p>
     */
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
             * <p>The returned primary domain name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>example.org</p>
             */
            public Builder certCommonName(String certCommonName) {
                this.certCommonName = certCommonName;
                return this;
            }

            /**
             * <p>The time at which the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-26 14:45:09</p>
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The time at which the certificate became effective.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-26 14:45:09</p>
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * <p>The status of the certificate.</p>
             * <ul>
             * <li><strong>ok</strong>: The certificate is working as expected.</li>
             * <li><strong>mismatch</strong>: The certificate does not match the specified domain name.</li>
             * <li><strong>expired</strong>: The certificate has expired.</li>
             * <li><strong>expire_soon</strong>: The certificate will expire soon.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mismatch</p>
             */
            public Builder certStatus(String certStatus) {
                this.certStatus = certStatus;
                return this;
            }

            /**
             * <p>The type of the certificate.</p>
             * <ul>
             * <li><strong>free</strong>: a free certificate.</li>
             * <li><strong>cas</strong>: a certificate that is purchased from Alibaba Cloud SSL Certificates Service.</li>
             * <li><strong>upload</strong>: a certificate that is uploaded by the user.</li>
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
             * <p>2019-01-08 18:33:16</p>
             */
            public Builder certUpdateTime(String certUpdateTime) {
                this.certUpdateTime = certUpdateTime;
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

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnHttpsDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnHttpsDomainListResponseBody</p>
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
