// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < RiskList> riskList;

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
    public java.util.List < RiskList> getRiskList() {
        return this.riskList;
    }

    public static final class Builder {
        private Integer noSslCount; 
        private String requestId; 
        private Integer riskCount; 
        private java.util.List < RiskList> riskList; 

        /**
         * NoSslCount.
         */
        public Builder noSslCount(Integer noSslCount) {
            this.noSslCount = noSslCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskCount.
         */
        public Builder riskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }

        /**
         * RiskList.
         */
        public Builder riskList(java.util.List < RiskList> riskList) {
            this.riskList = riskList;
            return this;
        }

        public DescribeDomainSecureRiskListResponseBody build() {
            return new DescribeDomainSecureRiskListResponseBody(this);
        } 

    } 

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
        private java.util.List < String > uuidList;

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
        public java.util.List < String > getUuidList() {
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
            private java.util.List < String > uuidList; 
            private Integer vulCount; 

            /**
             * AlarmCount.
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * SslBrand.
             */
            public Builder sslBrand(String sslBrand) {
                this.sslBrand = sslBrand;
                return this;
            }

            /**
             * SslStatus.
             */
            public Builder sslStatus(Integer sslStatus) {
                this.sslStatus = sslStatus;
                return this;
            }

            /**
             * UuidList.
             */
            public Builder uuidList(java.util.List < String > uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            /**
             * VulCount.
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
