// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSecureStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecureStatisticsResponseBody</p>
 */
public class DescribeDomainSecureStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmCount")
    private Integer alarmCount;

    @com.aliyun.core.annotation.NameInMap("NoSslCount")
    private Integer noSslCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskCount")
    private Integer riskCount;

    @com.aliyun.core.annotation.NameInMap("TotalDomainCount")
    private Integer totalDomainCount;

    @com.aliyun.core.annotation.NameInMap("VulCount")
    private Integer vulCount;

    private DescribeDomainSecureStatisticsResponseBody(Builder builder) {
        this.alarmCount = builder.alarmCount;
        this.noSslCount = builder.noSslCount;
        this.requestId = builder.requestId;
        this.riskCount = builder.riskCount;
        this.totalDomainCount = builder.totalDomainCount;
        this.vulCount = builder.vulCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSecureStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmCount
     */
    public Integer getAlarmCount() {
        return this.alarmCount;
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
     * @return totalDomainCount
     */
    public Integer getTotalDomainCount() {
        return this.totalDomainCount;
    }

    /**
     * @return vulCount
     */
    public Integer getVulCount() {
        return this.vulCount;
    }

    public static final class Builder {
        private Integer alarmCount; 
        private Integer noSslCount; 
        private String requestId; 
        private Integer riskCount; 
        private Integer totalDomainCount; 
        private Integer vulCount; 

        /**
         * AlarmCount.
         */
        public Builder alarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }

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
         * TotalDomainCount.
         */
        public Builder totalDomainCount(Integer totalDomainCount) {
            this.totalDomainCount = totalDomainCount;
            return this;
        }

        /**
         * VulCount.
         */
        public Builder vulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }

        public DescribeDomainSecureStatisticsResponseBody build() {
            return new DescribeDomainSecureStatisticsResponseBody(this);
        } 

    } 

}
