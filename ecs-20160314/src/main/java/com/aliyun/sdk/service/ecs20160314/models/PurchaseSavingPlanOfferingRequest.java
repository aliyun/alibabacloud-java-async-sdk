// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseSavingPlanOfferingRequest} extends {@link RequestModel}
 *
 * <p>PurchaseSavingPlanOfferingRequest</p>
 */
public class PurchaseSavingPlanOfferingRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CommittedAmount")
    @Validation(required = true)
    private String committedAmount;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceFamily")
    private String instanceFamily;

    @Query
    @NameInMap("InstanceFamilySet")
    private String instanceFamilySet;

    @Query
    @NameInMap("Name")
    private String name;

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

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private PurchaseSavingPlanOfferingRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.committedAmount = builder.committedAmount;
        this.description = builder.description;
        this.instanceFamily = builder.instanceFamily;
        this.instanceFamilySet = builder.instanceFamilySet;
        this.name = builder.name;
        this.offeringType = builder.offeringType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.planType = builder.planType;
        this.purchaseMethod = builder.purchaseMethod;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseSavingPlanOfferingRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return committedAmount
     */
    public String getCommittedAmount() {
        return this.committedAmount;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<PurchaseSavingPlanOfferingRequest, Builder> {
        private String chargeType; 
        private String clientToken; 
        private String committedAmount; 
        private String description; 
        private String instanceFamily; 
        private String instanceFamilySet; 
        private String name; 
        private String offeringType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private String planType; 
        private String purchaseMethod; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseSavingPlanOfferingRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.committedAmount = request.committedAmount;
            this.description = request.description;
            this.instanceFamily = request.instanceFamily;
            this.instanceFamilySet = request.instanceFamilySet;
            this.name = request.name;
            this.offeringType = request.offeringType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.planType = request.planType;
            this.purchaseMethod = request.purchaseMethod;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.startTime = request.startTime;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public PurchaseSavingPlanOfferingRequest build() {
            return new PurchaseSavingPlanOfferingRequest(this);
        } 

    } 

}
