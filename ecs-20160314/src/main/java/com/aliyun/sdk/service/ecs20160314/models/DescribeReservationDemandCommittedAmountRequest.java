// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservationDemandCommittedAmountRequest} extends {@link RequestModel}
 *
 * <p>DescribeReservationDemandCommittedAmountRequest</p>
 */
public class DescribeReservationDemandCommittedAmountRequest extends Request {
    @Query
    @NameInMap("DemandPlan")
    private java.util.List < DemandPlan> demandPlan;

    @Query
    @NameInMap("InstanceFamily")
    private String instanceFamily;

    @Query
    @NameInMap("InstanceFamilySet")
    private String instanceFamilySet;

    @Query
    @NameInMap("OfferingType")
    private String offeringType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PlanType")
    private String planType;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("PurchaseMethod")
    @Validation(required = true)
    private String purchaseMethod;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private DescribeReservationDemandCommittedAmountRequest(Builder builder) {
        super(builder);
        this.demandPlan = builder.demandPlan;
        this.instanceFamily = builder.instanceFamily;
        this.instanceFamilySet = builder.instanceFamilySet;
        this.offeringType = builder.offeringType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.planType = builder.planType;
        this.platform = builder.platform;
        this.purchaseMethod = builder.purchaseMethod;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservationDemandCommittedAmountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return demandPlan
     */
    public java.util.List < DemandPlan> getDemandPlan() {
        return this.demandPlan;
    }

    /**
     * @return instanceFamily
     */
    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * @return instanceFamilySet
     */
    public String getInstanceFamilySet() {
        return this.instanceFamilySet;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return purchaseMethod
     */
    public String getPurchaseMethod() {
        return this.purchaseMethod;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<DescribeReservationDemandCommittedAmountRequest, Builder> {
        private java.util.List < DemandPlan> demandPlan; 
        private String instanceFamily; 
        private String instanceFamilySet; 
        private String offeringType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private String planType; 
        private String platform; 
        private String purchaseMethod; 
        private String regionId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReservationDemandCommittedAmountRequest request) {
            super(request);
            this.demandPlan = request.demandPlan;
            this.instanceFamily = request.instanceFamily;
            this.instanceFamilySet = request.instanceFamilySet;
            this.offeringType = request.offeringType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.planType = request.planType;
            this.platform = request.platform;
            this.purchaseMethod = request.purchaseMethod;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * DemandPlan.
         */
        public Builder demandPlan(java.util.List < DemandPlan> demandPlan) {
            this.putQueryParameter("DemandPlan", demandPlan);
            this.demandPlan = demandPlan;
            return this;
        }

        /**
         * InstanceFamily.
         */
        public Builder instanceFamily(String instanceFamily) {
            this.putQueryParameter("InstanceFamily", instanceFamily);
            this.instanceFamily = instanceFamily;
            return this;
        }

        /**
         * InstanceFamilySet.
         */
        public Builder instanceFamilySet(String instanceFamilySet) {
            this.putQueryParameter("InstanceFamilySet", instanceFamilySet);
            this.instanceFamilySet = instanceFamilySet;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
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
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * PurchaseMethod.
         */
        public Builder purchaseMethod(String purchaseMethod) {
            this.putQueryParameter("PurchaseMethod", purchaseMethod);
            this.purchaseMethod = purchaseMethod;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        @Override
        public DescribeReservationDemandCommittedAmountRequest build() {
            return new DescribeReservationDemandCommittedAmountRequest(this);
        } 

    } 

    public static class DemandPlan extends TeaModel {
        @NameInMap("Amount")
        private Long amount;

        @NameInMap("InstanceType")
        private String instanceType;

        private DemandPlan(Builder builder) {
            this.amount = builder.amount;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DemandPlan create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Long amount; 
            private String instanceType; 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public DemandPlan build() {
                return new DemandPlan(this);
            } 

        } 

    }
}
