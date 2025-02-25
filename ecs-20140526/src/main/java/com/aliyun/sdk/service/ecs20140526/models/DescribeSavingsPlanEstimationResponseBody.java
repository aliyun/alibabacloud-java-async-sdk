// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeSavingsPlanEstimationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlanEstimationResponseBody</p>
 */
public class DescribeSavingsPlanEstimationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommittedAmount")
    private String committedAmount;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilyGroup")
    private String instanceTypeFamilyGroup;

    @com.aliyun.core.annotation.NameInMap("OfferingType")
    private String offeringType;

    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.NameInMap("PlanType")
    private String planType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private DescribeSavingsPlanEstimationResponseBody(Builder builder) {
        this.committedAmount = builder.committedAmount;
        this.currency = builder.currency;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.instanceTypeFamilyGroup = builder.instanceTypeFamilyGroup;
        this.offeringType = builder.offeringType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.planType = builder.planType;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlanEstimationResponseBody create() {
        return builder().build();
    }

    /**
     * @return committedAmount
     */
    public String getCommittedAmount() {
        return this.committedAmount;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return instanceTypeFamilyGroup
     */
    public String getInstanceTypeFamilyGroup() {
        return this.instanceTypeFamilyGroup;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return planType
     */
    public String getPlanType() {
        return this.planType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder {
        private String committedAmount; 
        private String currency; 
        private String instanceTypeFamily; 
        private String instanceTypeFamilyGroup; 
        private String offeringType; 
        private Integer period; 
        private String periodUnit; 
        private String planType; 
        private String requestId; 
        private String resourceId; 

        /**
         * CommittedAmount.
         */
        public Builder committedAmount(String committedAmount) {
            this.committedAmount = committedAmount;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * InstanceTypeFamily.
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * InstanceTypeFamilyGroup.
         */
        public Builder instanceTypeFamilyGroup(String instanceTypeFamilyGroup) {
            this.instanceTypeFamilyGroup = instanceTypeFamilyGroup;
            return this;
        }

        /**
         * OfferingType.
         */
        public Builder offeringType(String offeringType) {
            this.offeringType = offeringType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PlanType.
         */
        public Builder planType(String planType) {
            this.planType = planType;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public DescribeSavingsPlanEstimationResponseBody build() {
            return new DescribeSavingsPlanEstimationResponseBody(this);
        } 

    } 

}
