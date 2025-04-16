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
 * {@link DescribeSavingsPlanEstimationRequest} extends {@link RequestModel}
 *
 * <p>DescribeSavingsPlanEstimationRequest</p>
 */
public class DescribeSavingsPlanEstimationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EstimationResource")
    private String estimationResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeScope")
    private String instanceTypeScope;

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
    private String resourceId;

    private DescribeSavingsPlanEstimationRequest(Builder builder) {
        super(builder);
        this.estimationResource = builder.estimationResource;
        this.instanceTypeScope = builder.instanceTypeScope;
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

    public static DescribeSavingsPlanEstimationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return estimationResource
     */
    public String getEstimationResource() {
        return this.estimationResource;
    }

    /**
     * @return instanceTypeScope
     */
    public String getInstanceTypeScope() {
        return this.instanceTypeScope;
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
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<DescribeSavingsPlanEstimationRequest, Builder> {
        private String estimationResource; 
        private String instanceTypeScope; 
        private String offeringType; 
        private String period; 
        private String periodUnit; 
        private String planType; 
        private String regionId; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSavingsPlanEstimationRequest request) {
            super(request);
            this.estimationResource = request.estimationResource;
            this.instanceTypeScope = request.instanceTypeScope;
            this.offeringType = request.offeringType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.planType = request.planType;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
        } 

        /**
         * EstimationResource.
         */
        public Builder estimationResource(String estimationResource) {
            this.putQueryParameter("EstimationResource", estimationResource);
            this.estimationResource = estimationResource;
            return this;
        }

        /**
         * InstanceTypeScope.
         */
        public Builder instanceTypeScope(String instanceTypeScope) {
            this.putQueryParameter("InstanceTypeScope", instanceTypeScope);
            this.instanceTypeScope = instanceTypeScope;
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
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public DescribeSavingsPlanEstimationRequest build() {
            return new DescribeSavingsPlanEstimationRequest(this);
        } 

    } 

}
