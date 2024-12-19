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
 * {@link CreateSavingsPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateSavingsPlanRequest</p>
 */
public class CreateSavingsPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommittedAmount")
    private String committedAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilyGroup")
    private String instanceTypeFamilyGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfferingType")
    private String offeringType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanType")
    private String planType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private java.util.List<String> resourceId;

    private CreateSavingsPlanRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.committedAmount = builder.committedAmount;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.instanceTypeFamilyGroup = builder.instanceTypeFamilyGroup;
        this.offeringType = builder.offeringType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.planType = builder.planType;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSavingsPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return committedAmount
     */
    public String getCommittedAmount() {
        return this.committedAmount;
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
    public String getPeriod() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<CreateSavingsPlanRequest, Builder> {
        private String chargeType; 
        private String committedAmount; 
        private String instanceTypeFamily; 
        private String instanceTypeFamilyGroup; 
        private String offeringType; 
        private String period; 
        private String periodUnit; 
        private String planType; 
        private String regionId; 
        private java.util.List<String> resourceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSavingsPlanRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.committedAmount = request.committedAmount;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.instanceTypeFamilyGroup = request.instanceTypeFamilyGroup;
            this.offeringType = request.offeringType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.planType = request.planType;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
        } 

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * CommittedAmount.
         */
        public Builder committedAmount(String committedAmount) {
            this.putQueryParameter("CommittedAmount", committedAmount);
            this.committedAmount = committedAmount;
            return this;
        }

        /**
         * InstanceTypeFamily.
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * InstanceTypeFamilyGroup.
         */
        public Builder instanceTypeFamilyGroup(String instanceTypeFamilyGroup) {
            this.putQueryParameter("InstanceTypeFamilyGroup", instanceTypeFamilyGroup);
            this.instanceTypeFamilyGroup = instanceTypeFamilyGroup;
            return this;
        }

        /**
         * OfferingType.
         */
        public Builder offeringType(String offeringType) {
            this.putQueryParameter("OfferingType", offeringType);
            this.offeringType = offeringType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PlanType.
         */
        public Builder planType(String planType) {
            this.putQueryParameter("PlanType", planType);
            this.planType = planType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public CreateSavingsPlanRequest build() {
            return new CreateSavingsPlanRequest(this);
        } 

    } 

}
