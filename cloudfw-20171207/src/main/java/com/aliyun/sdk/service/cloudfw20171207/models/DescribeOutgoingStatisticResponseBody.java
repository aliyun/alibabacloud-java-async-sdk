// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeOutgoingStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingStatisticResponseBody</p>
 */
public class DescribeOutgoingStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IgnoreAssetCount")
    private Integer ignoreAssetCount;

    @com.aliyun.core.annotation.NameInMap("IgnoreDomainCount")
    private Integer ignoreDomainCount;

    @com.aliyun.core.annotation.NameInMap("IgnoreDstIPCount")
    private Integer ignoreDstIPCount;

    @com.aliyun.core.annotation.NameInMap("PrivateRiskAssetCount")
    private Long privateRiskAssetCount;

    @com.aliyun.core.annotation.NameInMap("PrivateTotalAssetCount")
    private Long privateTotalAssetCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskAssetCount")
    private Integer riskAssetCount;

    @com.aliyun.core.annotation.NameInMap("RiskDomainCount")
    private Integer riskDomainCount;

    @com.aliyun.core.annotation.NameInMap("RiskDstIPCount")
    private Integer riskDstIPCount;

    @com.aliyun.core.annotation.NameInMap("SubscribeAssetCount")
    private Integer subscribeAssetCount;

    @com.aliyun.core.annotation.NameInMap("SubscribeDomainCount")
    private Integer subscribeDomainCount;

    @com.aliyun.core.annotation.NameInMap("SubscribeDstIPCount")
    private Integer subscribeDstIPCount;

    @com.aliyun.core.annotation.NameInMap("TotalAssetCount")
    private Integer totalAssetCount;

    @com.aliyun.core.annotation.NameInMap("TotalDomainCount")
    private Integer totalDomainCount;

    @com.aliyun.core.annotation.NameInMap("TotalDstIPCount")
    private Integer totalDstIPCount;

    @com.aliyun.core.annotation.NameInMap("TotalProtocolCount")
    private Integer totalProtocolCount;

    @com.aliyun.core.annotation.NameInMap("UncoveredAclDomain")
    private Integer uncoveredAclDomain;

    @com.aliyun.core.annotation.NameInMap("UncoveredAclDstIP")
    private Integer uncoveredAclDstIP;

    @com.aliyun.core.annotation.NameInMap("UnknownProtocolRadio")
    private String unknownProtocolRadio;

    private DescribeOutgoingStatisticResponseBody(Builder builder) {
        this.ignoreAssetCount = builder.ignoreAssetCount;
        this.ignoreDomainCount = builder.ignoreDomainCount;
        this.ignoreDstIPCount = builder.ignoreDstIPCount;
        this.privateRiskAssetCount = builder.privateRiskAssetCount;
        this.privateTotalAssetCount = builder.privateTotalAssetCount;
        this.requestId = builder.requestId;
        this.riskAssetCount = builder.riskAssetCount;
        this.riskDomainCount = builder.riskDomainCount;
        this.riskDstIPCount = builder.riskDstIPCount;
        this.subscribeAssetCount = builder.subscribeAssetCount;
        this.subscribeDomainCount = builder.subscribeDomainCount;
        this.subscribeDstIPCount = builder.subscribeDstIPCount;
        this.totalAssetCount = builder.totalAssetCount;
        this.totalDomainCount = builder.totalDomainCount;
        this.totalDstIPCount = builder.totalDstIPCount;
        this.totalProtocolCount = builder.totalProtocolCount;
        this.uncoveredAclDomain = builder.uncoveredAclDomain;
        this.uncoveredAclDstIP = builder.uncoveredAclDstIP;
        this.unknownProtocolRadio = builder.unknownProtocolRadio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ignoreAssetCount
     */
    public Integer getIgnoreAssetCount() {
        return this.ignoreAssetCount;
    }

    /**
     * @return ignoreDomainCount
     */
    public Integer getIgnoreDomainCount() {
        return this.ignoreDomainCount;
    }

    /**
     * @return ignoreDstIPCount
     */
    public Integer getIgnoreDstIPCount() {
        return this.ignoreDstIPCount;
    }

    /**
     * @return privateRiskAssetCount
     */
    public Long getPrivateRiskAssetCount() {
        return this.privateRiskAssetCount;
    }

    /**
     * @return privateTotalAssetCount
     */
    public Long getPrivateTotalAssetCount() {
        return this.privateTotalAssetCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskAssetCount
     */
    public Integer getRiskAssetCount() {
        return this.riskAssetCount;
    }

    /**
     * @return riskDomainCount
     */
    public Integer getRiskDomainCount() {
        return this.riskDomainCount;
    }

    /**
     * @return riskDstIPCount
     */
    public Integer getRiskDstIPCount() {
        return this.riskDstIPCount;
    }

    /**
     * @return subscribeAssetCount
     */
    public Integer getSubscribeAssetCount() {
        return this.subscribeAssetCount;
    }

    /**
     * @return subscribeDomainCount
     */
    public Integer getSubscribeDomainCount() {
        return this.subscribeDomainCount;
    }

    /**
     * @return subscribeDstIPCount
     */
    public Integer getSubscribeDstIPCount() {
        return this.subscribeDstIPCount;
    }

    /**
     * @return totalAssetCount
     */
    public Integer getTotalAssetCount() {
        return this.totalAssetCount;
    }

    /**
     * @return totalDomainCount
     */
    public Integer getTotalDomainCount() {
        return this.totalDomainCount;
    }

    /**
     * @return totalDstIPCount
     */
    public Integer getTotalDstIPCount() {
        return this.totalDstIPCount;
    }

    /**
     * @return totalProtocolCount
     */
    public Integer getTotalProtocolCount() {
        return this.totalProtocolCount;
    }

    /**
     * @return uncoveredAclDomain
     */
    public Integer getUncoveredAclDomain() {
        return this.uncoveredAclDomain;
    }

    /**
     * @return uncoveredAclDstIP
     */
    public Integer getUncoveredAclDstIP() {
        return this.uncoveredAclDstIP;
    }

    /**
     * @return unknownProtocolRadio
     */
    public String getUnknownProtocolRadio() {
        return this.unknownProtocolRadio;
    }

    public static final class Builder {
        private Integer ignoreAssetCount; 
        private Integer ignoreDomainCount; 
        private Integer ignoreDstIPCount; 
        private Long privateRiskAssetCount; 
        private Long privateTotalAssetCount; 
        private String requestId; 
        private Integer riskAssetCount; 
        private Integer riskDomainCount; 
        private Integer riskDstIPCount; 
        private Integer subscribeAssetCount; 
        private Integer subscribeDomainCount; 
        private Integer subscribeDstIPCount; 
        private Integer totalAssetCount; 
        private Integer totalDomainCount; 
        private Integer totalDstIPCount; 
        private Integer totalProtocolCount; 
        private Integer uncoveredAclDomain; 
        private Integer uncoveredAclDstIP; 
        private String unknownProtocolRadio; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingStatisticResponseBody model) {
            this.ignoreAssetCount = model.ignoreAssetCount;
            this.ignoreDomainCount = model.ignoreDomainCount;
            this.ignoreDstIPCount = model.ignoreDstIPCount;
            this.privateRiskAssetCount = model.privateRiskAssetCount;
            this.privateTotalAssetCount = model.privateTotalAssetCount;
            this.requestId = model.requestId;
            this.riskAssetCount = model.riskAssetCount;
            this.riskDomainCount = model.riskDomainCount;
            this.riskDstIPCount = model.riskDstIPCount;
            this.subscribeAssetCount = model.subscribeAssetCount;
            this.subscribeDomainCount = model.subscribeDomainCount;
            this.subscribeDstIPCount = model.subscribeDstIPCount;
            this.totalAssetCount = model.totalAssetCount;
            this.totalDomainCount = model.totalDomainCount;
            this.totalDstIPCount = model.totalDstIPCount;
            this.totalProtocolCount = model.totalProtocolCount;
            this.uncoveredAclDomain = model.uncoveredAclDomain;
            this.uncoveredAclDstIP = model.uncoveredAclDstIP;
            this.unknownProtocolRadio = model.unknownProtocolRadio;
        } 

        /**
         * IgnoreAssetCount.
         */
        public Builder ignoreAssetCount(Integer ignoreAssetCount) {
            this.ignoreAssetCount = ignoreAssetCount;
            return this;
        }

        /**
         * IgnoreDomainCount.
         */
        public Builder ignoreDomainCount(Integer ignoreDomainCount) {
            this.ignoreDomainCount = ignoreDomainCount;
            return this;
        }

        /**
         * IgnoreDstIPCount.
         */
        public Builder ignoreDstIPCount(Integer ignoreDstIPCount) {
            this.ignoreDstIPCount = ignoreDstIPCount;
            return this;
        }

        /**
         * PrivateRiskAssetCount.
         */
        public Builder privateRiskAssetCount(Long privateRiskAssetCount) {
            this.privateRiskAssetCount = privateRiskAssetCount;
            return this;
        }

        /**
         * PrivateTotalAssetCount.
         */
        public Builder privateTotalAssetCount(Long privateTotalAssetCount) {
            this.privateTotalAssetCount = privateTotalAssetCount;
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
         * RiskAssetCount.
         */
        public Builder riskAssetCount(Integer riskAssetCount) {
            this.riskAssetCount = riskAssetCount;
            return this;
        }

        /**
         * RiskDomainCount.
         */
        public Builder riskDomainCount(Integer riskDomainCount) {
            this.riskDomainCount = riskDomainCount;
            return this;
        }

        /**
         * RiskDstIPCount.
         */
        public Builder riskDstIPCount(Integer riskDstIPCount) {
            this.riskDstIPCount = riskDstIPCount;
            return this;
        }

        /**
         * SubscribeAssetCount.
         */
        public Builder subscribeAssetCount(Integer subscribeAssetCount) {
            this.subscribeAssetCount = subscribeAssetCount;
            return this;
        }

        /**
         * SubscribeDomainCount.
         */
        public Builder subscribeDomainCount(Integer subscribeDomainCount) {
            this.subscribeDomainCount = subscribeDomainCount;
            return this;
        }

        /**
         * SubscribeDstIPCount.
         */
        public Builder subscribeDstIPCount(Integer subscribeDstIPCount) {
            this.subscribeDstIPCount = subscribeDstIPCount;
            return this;
        }

        /**
         * TotalAssetCount.
         */
        public Builder totalAssetCount(Integer totalAssetCount) {
            this.totalAssetCount = totalAssetCount;
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
         * TotalDstIPCount.
         */
        public Builder totalDstIPCount(Integer totalDstIPCount) {
            this.totalDstIPCount = totalDstIPCount;
            return this;
        }

        /**
         * TotalProtocolCount.
         */
        public Builder totalProtocolCount(Integer totalProtocolCount) {
            this.totalProtocolCount = totalProtocolCount;
            return this;
        }

        /**
         * UncoveredAclDomain.
         */
        public Builder uncoveredAclDomain(Integer uncoveredAclDomain) {
            this.uncoveredAclDomain = uncoveredAclDomain;
            return this;
        }

        /**
         * UncoveredAclDstIP.
         */
        public Builder uncoveredAclDstIP(Integer uncoveredAclDstIP) {
            this.uncoveredAclDstIP = uncoveredAclDstIP;
            return this;
        }

        /**
         * UnknownProtocolRadio.
         */
        public Builder unknownProtocolRadio(String unknownProtocolRadio) {
            this.unknownProtocolRadio = unknownProtocolRadio;
            return this;
        }

        public DescribeOutgoingStatisticResponseBody build() {
            return new DescribeOutgoingStatisticResponseBody(this);
        } 

    } 

}
