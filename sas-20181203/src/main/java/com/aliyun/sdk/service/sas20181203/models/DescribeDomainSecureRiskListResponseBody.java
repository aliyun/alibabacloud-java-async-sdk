// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeDomainSecureRiskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecureRiskListResponseBody</p>
 */
public class DescribeDomainSecureRiskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NoSslCount")
    private Integer noSslCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskCount")
    private Integer riskCount;

    @com.aliyun.core.annotation.NameInMap("RiskList")
    private java.util.List<RiskList> riskList;

    private DescribeDomainSecureRiskListResponseBody(Builder builder) {
        this.noSslCount = builder.noSslCount;
        this.requestId = builder.requestId;
        this.riskCount = builder.riskCount;
        this.riskList = builder.riskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSecureRiskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return noSslCount
     */
    public Integer getNoSslCount() {
        return this.noSslCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskCount
     */
    public Integer getRiskCount() {
        return this.riskCount;
    }

    /**
     * @return riskList
     */
    public java.util.List<RiskList> getRiskList() {
        return this.riskList;
    }

    public static final class Builder {
        private Integer noSslCount; 
        private String requestId; 
        private Integer riskCount; 
        private java.util.List<RiskList> riskList; 

        private Builder() {
        } 

        private Builder(DescribeDomainSecureRiskListResponseBody model) {
            this.noSslCount = model.noSslCount;
            this.requestId = model.requestId;
            this.riskCount = model.riskCount;
            this.riskList = model.riskList;
        } 

        /**
         * <p>The number of the websites for which no certificates are installed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder noSslCount(Integer noSslCount) {
            this.noSslCount = noSslCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }

        /**
         * <p>The risks.</p>
         */
        public Builder riskList(java.util.List<RiskList> riskList) {
            this.riskList = riskList;
            return this;
        }

        public DescribeDomainSecureRiskListResponseBody build() {
            return new DescribeDomainSecureRiskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainSecureRiskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainSecureRiskListResponseBody</p>
     */
    public static class RiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("SslBrand")
        private String sslBrand;

        @com.aliyun.core.annotation.NameInMap("SslStatus")
        private Integer sslStatus;

        @com.aliyun.core.annotation.NameInMap("UuidList")
        private java.util.List<String> uuidList;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        private RiskList(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.domain = builder.domain;
            this.sslBrand = builder.sslBrand;
            this.sslStatus = builder.sslStatus;
            this.uuidList = builder.uuidList;
            this.vulCount = builder.vulCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskList create() {
            return builder().build();
        }

        /**
         * @return alarmCount
         */
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return sslBrand
         */
        public String getSslBrand() {
            return this.sslBrand;
        }

        /**
         * @return sslStatus
         */
        public Integer getSslStatus() {
            return this.sslStatus;
        }

        /**
         * @return uuidList
         */
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        public static final class Builder {
            private Integer alarmCount; 
            private String domain; 
            private String sslBrand; 
            private Integer sslStatus; 
            private java.util.List<String> uuidList; 
            private Integer vulCount; 

            private Builder() {
            } 

            private Builder(RiskList model) {
                this.alarmCount = model.alarmCount;
                this.domain = model.domain;
                this.sslBrand = model.sslBrand;
                this.sslStatus = model.sslStatus;
                this.uuidList = model.uuidList;
                this.vulCount = model.vulCount;
            } 

            /**
             * <p>The number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The issuer of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>globalsign</p>
             */
            public Builder sslBrand(String sslBrand) {
                this.sslBrand = sslBrand;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is configured. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sslStatus(Integer sslStatus) {
                this.sslStatus = sslStatus;
                return this;
            }

            /**
             * <p>The UUIDs of the backend servers of the website.</p>
             */
            public Builder uuidList(java.util.List<String> uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            /**
             * <p>The number of vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            public RiskList build() {
                return new RiskList(this);
            } 

        } 

    }
}
