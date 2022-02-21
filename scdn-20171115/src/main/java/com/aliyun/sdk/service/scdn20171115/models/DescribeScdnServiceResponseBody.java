// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnServiceResponseBody</p>
 */
public class DescribeScdnServiceResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    private String bandwidth;

    @NameInMap("BandwidthValue")
    private String bandwidthValue;

    @NameInMap("CcProtection")
    private String ccProtection;

    @NameInMap("CcProtectionValue")
    private String ccProtectionValue;

    @NameInMap("ChangingAffectTime")
    private String changingAffectTime;

    @NameInMap("ChangingChargeType")
    private String changingChargeType;

    @NameInMap("CurrentBandwidth")
    private String currentBandwidth;

    @NameInMap("CurrentBandwidthValue")
    private String currentBandwidthValue;

    @NameInMap("CurrentCcProtection")
    private String currentCcProtection;

    @NameInMap("CurrentCcProtectionValue")
    private String currentCcProtectionValue;

    @NameInMap("CurrentDDoSBasic")
    private String currentDDoSBasic;

    @NameInMap("CurrentDDoSBasicValue")
    private String currentDDoSBasicValue;

    @NameInMap("CurrentDomainCount")
    private String currentDomainCount;

    @NameInMap("CurrentDomainCountValue")
    private String currentDomainCountValue;

    @NameInMap("CurrentElasticProtection")
    private String currentElasticProtection;

    @NameInMap("CurrentElasticProtectionValue")
    private String currentElasticProtectionValue;

    @NameInMap("CurrentProtectType")
    private String currentProtectType;

    @NameInMap("CurrentProtectTypeValue")
    private String currentProtectTypeValue;

    @NameInMap("DDoSBasic")
    private String DDoSBasic;

    @NameInMap("DDoSBasicValue")
    private String DDoSBasicValue;

    @NameInMap("DomainCount")
    private String domainCount;

    @NameInMap("DomainCountValue")
    private String domainCountValue;

    @NameInMap("ElasticProtection")
    private String elasticProtection;

    @NameInMap("ElasticProtectionValue")
    private String elasticProtectionValue;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @NameInMap("OpenTime")
    private String openTime;

    @NameInMap("OperationLocks")
    private OperationLocks operationLocks;

    @NameInMap("PriceType")
    private String priceType;

    @NameInMap("PricingCycle")
    private String pricingCycle;

    @NameInMap("ProtectType")
    private String protectType;

    @NameInMap("ProtectTypeValue")
    private String protectTypeValue;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeScdnServiceResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.bandwidthValue = builder.bandwidthValue;
        this.ccProtection = builder.ccProtection;
        this.ccProtectionValue = builder.ccProtectionValue;
        this.changingAffectTime = builder.changingAffectTime;
        this.changingChargeType = builder.changingChargeType;
        this.currentBandwidth = builder.currentBandwidth;
        this.currentBandwidthValue = builder.currentBandwidthValue;
        this.currentCcProtection = builder.currentCcProtection;
        this.currentCcProtectionValue = builder.currentCcProtectionValue;
        this.currentDDoSBasic = builder.currentDDoSBasic;
        this.currentDDoSBasicValue = builder.currentDDoSBasicValue;
        this.currentDomainCount = builder.currentDomainCount;
        this.currentDomainCountValue = builder.currentDomainCountValue;
        this.currentElasticProtection = builder.currentElasticProtection;
        this.currentElasticProtectionValue = builder.currentElasticProtectionValue;
        this.currentProtectType = builder.currentProtectType;
        this.currentProtectTypeValue = builder.currentProtectTypeValue;
        this.DDoSBasic = builder.DDoSBasic;
        this.DDoSBasicValue = builder.DDoSBasicValue;
        this.domainCount = builder.domainCount;
        this.domainCountValue = builder.domainCountValue;
        this.elasticProtection = builder.elasticProtection;
        this.elasticProtectionValue = builder.elasticProtectionValue;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.internetChargeType = builder.internetChargeType;
        this.openTime = builder.openTime;
        this.operationLocks = builder.operationLocks;
        this.priceType = builder.priceType;
        this.pricingCycle = builder.pricingCycle;
        this.protectType = builder.protectType;
        this.protectTypeValue = builder.protectTypeValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthValue
     */
    public String getBandwidthValue() {
        return this.bandwidthValue;
    }

    /**
     * @return ccProtection
     */
    public String getCcProtection() {
        return this.ccProtection;
    }

    /**
     * @return ccProtectionValue
     */
    public String getCcProtectionValue() {
        return this.ccProtectionValue;
    }

    /**
     * @return changingAffectTime
     */
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    /**
     * @return changingChargeType
     */
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    /**
     * @return currentBandwidth
     */
    public String getCurrentBandwidth() {
        return this.currentBandwidth;
    }

    /**
     * @return currentBandwidthValue
     */
    public String getCurrentBandwidthValue() {
        return this.currentBandwidthValue;
    }

    /**
     * @return currentCcProtection
     */
    public String getCurrentCcProtection() {
        return this.currentCcProtection;
    }

    /**
     * @return currentCcProtectionValue
     */
    public String getCurrentCcProtectionValue() {
        return this.currentCcProtectionValue;
    }

    /**
     * @return currentDDoSBasic
     */
    public String getCurrentDDoSBasic() {
        return this.currentDDoSBasic;
    }

    /**
     * @return currentDDoSBasicValue
     */
    public String getCurrentDDoSBasicValue() {
        return this.currentDDoSBasicValue;
    }

    /**
     * @return currentDomainCount
     */
    public String getCurrentDomainCount() {
        return this.currentDomainCount;
    }

    /**
     * @return currentDomainCountValue
     */
    public String getCurrentDomainCountValue() {
        return this.currentDomainCountValue;
    }

    /**
     * @return currentElasticProtection
     */
    public String getCurrentElasticProtection() {
        return this.currentElasticProtection;
    }

    /**
     * @return currentElasticProtectionValue
     */
    public String getCurrentElasticProtectionValue() {
        return this.currentElasticProtectionValue;
    }

    /**
     * @return currentProtectType
     */
    public String getCurrentProtectType() {
        return this.currentProtectType;
    }

    /**
     * @return currentProtectTypeValue
     */
    public String getCurrentProtectTypeValue() {
        return this.currentProtectTypeValue;
    }

    /**
     * @return DDoSBasic
     */
    public String getDDoSBasic() {
        return this.DDoSBasic;
    }

    /**
     * @return DDoSBasicValue
     */
    public String getDDoSBasicValue() {
        return this.DDoSBasicValue;
    }

    /**
     * @return domainCount
     */
    public String getDomainCount() {
        return this.domainCount;
    }

    /**
     * @return domainCountValue
     */
    public String getDomainCountValue() {
        return this.domainCountValue;
    }

    /**
     * @return elasticProtection
     */
    public String getElasticProtection() {
        return this.elasticProtection;
    }

    /**
     * @return elasticProtectionValue
     */
    public String getElasticProtectionValue() {
        return this.elasticProtectionValue;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return openTime
     */
    public String getOpenTime() {
        return this.openTime;
    }

    /**
     * @return operationLocks
     */
    public OperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    /**
     * @return priceType
     */
    public String getPriceType() {
        return this.priceType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return protectType
     */
    public String getProtectType() {
        return this.protectType;
    }

    /**
     * @return protectTypeValue
     */
    public String getProtectTypeValue() {
        return this.protectTypeValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bandwidth; 
        private String bandwidthValue; 
        private String ccProtection; 
        private String ccProtectionValue; 
        private String changingAffectTime; 
        private String changingChargeType; 
        private String currentBandwidth; 
        private String currentBandwidthValue; 
        private String currentCcProtection; 
        private String currentCcProtectionValue; 
        private String currentDDoSBasic; 
        private String currentDDoSBasicValue; 
        private String currentDomainCount; 
        private String currentDomainCountValue; 
        private String currentElasticProtection; 
        private String currentElasticProtectionValue; 
        private String currentProtectType; 
        private String currentProtectTypeValue; 
        private String DDoSBasic; 
        private String DDoSBasicValue; 
        private String domainCount; 
        private String domainCountValue; 
        private String elasticProtection; 
        private String elasticProtectionValue; 
        private String endTime; 
        private String instanceId; 
        private String internetChargeType; 
        private String openTime; 
        private OperationLocks operationLocks; 
        private String priceType; 
        private String pricingCycle; 
        private String protectType; 
        private String protectTypeValue; 
        private String requestId; 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * BandwidthValue.
         */
        public Builder bandwidthValue(String bandwidthValue) {
            this.bandwidthValue = bandwidthValue;
            return this;
        }

        /**
         * CcProtection.
         */
        public Builder ccProtection(String ccProtection) {
            this.ccProtection = ccProtection;
            return this;
        }

        /**
         * CcProtectionValue.
         */
        public Builder ccProtectionValue(String ccProtectionValue) {
            this.ccProtectionValue = ccProtectionValue;
            return this;
        }

        /**
         * ChangingAffectTime.
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * ChangingChargeType.
         */
        public Builder changingChargeType(String changingChargeType) {
            this.changingChargeType = changingChargeType;
            return this;
        }

        /**
         * CurrentBandwidth.
         */
        public Builder currentBandwidth(String currentBandwidth) {
            this.currentBandwidth = currentBandwidth;
            return this;
        }

        /**
         * CurrentBandwidthValue.
         */
        public Builder currentBandwidthValue(String currentBandwidthValue) {
            this.currentBandwidthValue = currentBandwidthValue;
            return this;
        }

        /**
         * CurrentCcProtection.
         */
        public Builder currentCcProtection(String currentCcProtection) {
            this.currentCcProtection = currentCcProtection;
            return this;
        }

        /**
         * CurrentCcProtectionValue.
         */
        public Builder currentCcProtectionValue(String currentCcProtectionValue) {
            this.currentCcProtectionValue = currentCcProtectionValue;
            return this;
        }

        /**
         * CurrentDDoSBasic.
         */
        public Builder currentDDoSBasic(String currentDDoSBasic) {
            this.currentDDoSBasic = currentDDoSBasic;
            return this;
        }

        /**
         * CurrentDDoSBasicValue.
         */
        public Builder currentDDoSBasicValue(String currentDDoSBasicValue) {
            this.currentDDoSBasicValue = currentDDoSBasicValue;
            return this;
        }

        /**
         * CurrentDomainCount.
         */
        public Builder currentDomainCount(String currentDomainCount) {
            this.currentDomainCount = currentDomainCount;
            return this;
        }

        /**
         * CurrentDomainCountValue.
         */
        public Builder currentDomainCountValue(String currentDomainCountValue) {
            this.currentDomainCountValue = currentDomainCountValue;
            return this;
        }

        /**
         * CurrentElasticProtection.
         */
        public Builder currentElasticProtection(String currentElasticProtection) {
            this.currentElasticProtection = currentElasticProtection;
            return this;
        }

        /**
         * CurrentElasticProtectionValue.
         */
        public Builder currentElasticProtectionValue(String currentElasticProtectionValue) {
            this.currentElasticProtectionValue = currentElasticProtectionValue;
            return this;
        }

        /**
         * CurrentProtectType.
         */
        public Builder currentProtectType(String currentProtectType) {
            this.currentProtectType = currentProtectType;
            return this;
        }

        /**
         * CurrentProtectTypeValue.
         */
        public Builder currentProtectTypeValue(String currentProtectTypeValue) {
            this.currentProtectTypeValue = currentProtectTypeValue;
            return this;
        }

        /**
         * DDoSBasic.
         */
        public Builder DDoSBasic(String DDoSBasic) {
            this.DDoSBasic = DDoSBasic;
            return this;
        }

        /**
         * DDoSBasicValue.
         */
        public Builder DDoSBasicValue(String DDoSBasicValue) {
            this.DDoSBasicValue = DDoSBasicValue;
            return this;
        }

        /**
         * DomainCount.
         */
        public Builder domainCount(String domainCount) {
            this.domainCount = domainCount;
            return this;
        }

        /**
         * DomainCountValue.
         */
        public Builder domainCountValue(String domainCountValue) {
            this.domainCountValue = domainCountValue;
            return this;
        }

        /**
         * ElasticProtection.
         */
        public Builder elasticProtection(String elasticProtection) {
            this.elasticProtection = elasticProtection;
            return this;
        }

        /**
         * ElasticProtectionValue.
         */
        public Builder elasticProtectionValue(String elasticProtectionValue) {
            this.elasticProtectionValue = elasticProtectionValue;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * OpenTime.
         */
        public Builder openTime(String openTime) {
            this.openTime = openTime;
            return this;
        }

        /**
         * OperationLocks.
         */
        public Builder operationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }

        /**
         * PriceType.
         */
        public Builder priceType(String priceType) {
            this.priceType = priceType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * ProtectType.
         */
        public Builder protectType(String protectType) {
            this.protectType = protectType;
            return this;
        }

        /**
         * ProtectTypeValue.
         */
        public Builder protectTypeValue(String protectTypeValue) {
            this.protectTypeValue = protectTypeValue;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScdnServiceResponseBody build() {
            return new DescribeScdnServiceResponseBody(this);
        } 

    } 

    public static class LockReason extends TeaModel {
        @NameInMap("LockReason")
        private String lockReason;

        private LockReason(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockReason create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public LockReason build() {
                return new LockReason(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @NameInMap("LockReason")
        private java.util.List < LockReason> lockReason;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public java.util.List < LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List < LockReason> lockReason; 

            /**
             * LockReason.
             */
            public Builder lockReason(java.util.List < LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
}
