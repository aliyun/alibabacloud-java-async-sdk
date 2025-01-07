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
         * <p>The number of domain names that trigger security alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder alarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of the domain names that have security risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }

        /**
         * <p>The total number of domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        public Builder totalDomainCount(Integer totalDomainCount) {
            this.totalDomainCount = totalDomainCount;
            return this;
        }

        /**
         * <p>The number of the domain names that have vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
