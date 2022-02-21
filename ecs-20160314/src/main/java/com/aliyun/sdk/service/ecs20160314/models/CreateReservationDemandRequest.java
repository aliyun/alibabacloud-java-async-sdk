// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReservationDemandRequest} extends {@link RequestModel}
 *
 * <p>CreateReservationDemandRequest</p>
 */
public class CreateReservationDemandRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConfirmType")
    @Validation(required = true)
    private String confirmType;

    @Query
    @NameInMap("CouponAuto")
    @Validation(required = true)
    private Boolean couponAuto;

    @Query
    @NameInMap("CouponType")
    @Validation(required = true)
    private String couponType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("InstanceAmount")
    private Integer instanceAmount;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceCpuCoreCount")
    private Integer instanceCpuCoreCount;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("InstanceTypes")
    private String instanceTypes;

    @Query
    @NameInMap("MatchCriteria")
    private String matchCriteria;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Query
    @NameInMap("Platform")
    @Validation(required = true)
    private String platform;

    @Query
    @NameInMap("PrivatePoolOptions")
    private java.util.List < PrivatePoolOptions> privatePoolOptions;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReservedInstanceDescription")
    private String reservedInstanceDescription;

    @Query
    @NameInMap("ReservedInstanceName")
    private String reservedInstanceName;

    @Query
    @NameInMap("ReservedInstanceOfferingType")
    private String reservedInstanceOfferingType;

    @Query
    @NameInMap("ReservedInstanceScope")
    private String reservedInstanceScope;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceSupplyType")
    private String resourceSupplyType;

    @Query
    @NameInMap("SavingPlanDescription")
    private String savingPlanDescription;

    @Query
    @NameInMap("SavingPlanHourFee")
    private Float savingPlanHourFee;

    @Query
    @NameInMap("SavingPlanId")
    private String savingPlanId;

    @Query
    @NameInMap("SavingPlanInstanceTypeFamilyGroup")
    private String savingPlanInstanceTypeFamilyGroup;

    @Query
    @NameInMap("SavingPlanName")
    private String savingPlanName;

    @Query
    @NameInMap("SavingPlanPayMode")
    private String savingPlanPayMode;

    @Query
    @NameInMap("SavingPlanSavingType")
    private String savingPlanSavingType;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ZoneIds")
    private String zoneIds;

    private CreateReservationDemandRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.confirmType = builder.confirmType;
        this.couponAuto = builder.couponAuto;
        this.couponType = builder.couponType;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.instanceAmount = builder.instanceAmount;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceCpuCoreCount = builder.instanceCpuCoreCount;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.instanceTypes = builder.instanceTypes;
        this.matchCriteria = builder.matchCriteria;
        this.name = builder.name;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.phoneNumber = builder.phoneNumber;
        this.platform = builder.platform;
        this.privatePoolOptions = builder.privatePoolOptions;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
        this.reservedInstanceDescription = builder.reservedInstanceDescription;
        this.reservedInstanceName = builder.reservedInstanceName;
        this.reservedInstanceOfferingType = builder.reservedInstanceOfferingType;
        this.reservedInstanceScope = builder.reservedInstanceScope;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceSupplyType = builder.resourceSupplyType;
        this.savingPlanDescription = builder.savingPlanDescription;
        this.savingPlanHourFee = builder.savingPlanHourFee;
        this.savingPlanId = builder.savingPlanId;
        this.savingPlanInstanceTypeFamilyGroup = builder.savingPlanInstanceTypeFamilyGroup;
        this.savingPlanName = builder.savingPlanName;
        this.savingPlanPayMode = builder.savingPlanPayMode;
        this.savingPlanSavingType = builder.savingPlanSavingType;
        this.startTime = builder.startTime;
        this.tag = builder.tag;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReservationDemandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return confirmType
     */
    public String getConfirmType() {
        return this.confirmType;
    }

    /**
     * @return couponAuto
     */
    public Boolean getCouponAuto() {
        return this.couponAuto;
    }

    /**
     * @return couponType
     */
    public String getCouponType() {
        return this.couponType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceAmount
     */
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceCpuCoreCount
     */
    public Integer getInstanceCpuCoreCount() {
        return this.instanceCpuCoreCount;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return instanceTypes
     */
    public String getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return matchCriteria
     */
    public String getMatchCriteria() {
        return this.matchCriteria;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return privatePoolOptions
     */
    public java.util.List < PrivatePoolOptions> getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reservedInstanceDescription
     */
    public String getReservedInstanceDescription() {
        return this.reservedInstanceDescription;
    }

    /**
     * @return reservedInstanceName
     */
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    /**
     * @return reservedInstanceOfferingType
     */
    public String getReservedInstanceOfferingType() {
        return this.reservedInstanceOfferingType;
    }

    /**
     * @return reservedInstanceScope
     */
    public String getReservedInstanceScope() {
        return this.reservedInstanceScope;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceSupplyType
     */
    public String getResourceSupplyType() {
        return this.resourceSupplyType;
    }

    /**
     * @return savingPlanDescription
     */
    public String getSavingPlanDescription() {
        return this.savingPlanDescription;
    }

    /**
     * @return savingPlanHourFee
     */
    public Float getSavingPlanHourFee() {
        return this.savingPlanHourFee;
    }

    /**
     * @return savingPlanId
     */
    public String getSavingPlanId() {
        return this.savingPlanId;
    }

    /**
     * @return savingPlanInstanceTypeFamilyGroup
     */
    public String getSavingPlanInstanceTypeFamilyGroup() {
        return this.savingPlanInstanceTypeFamilyGroup;
    }

    /**
     * @return savingPlanName
     */
    public String getSavingPlanName() {
        return this.savingPlanName;
    }

    /**
     * @return savingPlanPayMode
     */
    public String getSavingPlanPayMode() {
        return this.savingPlanPayMode;
    }

    /**
     * @return savingPlanSavingType
     */
    public String getSavingPlanSavingType() {
        return this.savingPlanSavingType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneIds
     */
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<CreateReservationDemandRequest, Builder> {
        private String clientToken; 
        private String confirmType; 
        private Boolean couponAuto; 
        private String couponType; 
        private String description; 
        private String endTime; 
        private Integer instanceAmount; 
        private String instanceChargeType; 
        private Integer instanceCpuCoreCount; 
        private String instanceTypeFamily; 
        private String instanceTypes; 
        private String matchCriteria; 
        private String name; 
        private Integer period; 
        private String periodUnit; 
        private String phoneNumber; 
        private String platform; 
        private java.util.List < PrivatePoolOptions> privatePoolOptions; 
        private String productType; 
        private String regionId; 
        private String reservedInstanceDescription; 
        private String reservedInstanceName; 
        private String reservedInstanceOfferingType; 
        private String reservedInstanceScope; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String resourceSupplyType; 
        private String savingPlanDescription; 
        private Float savingPlanHourFee; 
        private String savingPlanId; 
        private String savingPlanInstanceTypeFamilyGroup; 
        private String savingPlanName; 
        private String savingPlanPayMode; 
        private String savingPlanSavingType; 
        private String startTime; 
        private java.util.List < Tag> tag; 
        private String zoneIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateReservationDemandRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.confirmType = response.confirmType;
            this.couponAuto = response.couponAuto;
            this.couponType = response.couponType;
            this.description = response.description;
            this.endTime = response.endTime;
            this.instanceAmount = response.instanceAmount;
            this.instanceChargeType = response.instanceChargeType;
            this.instanceCpuCoreCount = response.instanceCpuCoreCount;
            this.instanceTypeFamily = response.instanceTypeFamily;
            this.instanceTypes = response.instanceTypes;
            this.matchCriteria = response.matchCriteria;
            this.name = response.name;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.phoneNumber = response.phoneNumber;
            this.platform = response.platform;
            this.privatePoolOptions = response.privatePoolOptions;
            this.productType = response.productType;
            this.regionId = response.regionId;
            this.reservedInstanceDescription = response.reservedInstanceDescription;
            this.reservedInstanceName = response.reservedInstanceName;
            this.reservedInstanceOfferingType = response.reservedInstanceOfferingType;
            this.reservedInstanceScope = response.reservedInstanceScope;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceSupplyType = response.resourceSupplyType;
            this.savingPlanDescription = response.savingPlanDescription;
            this.savingPlanHourFee = response.savingPlanHourFee;
            this.savingPlanId = response.savingPlanId;
            this.savingPlanInstanceTypeFamilyGroup = response.savingPlanInstanceTypeFamilyGroup;
            this.savingPlanName = response.savingPlanName;
            this.savingPlanPayMode = response.savingPlanPayMode;
            this.savingPlanSavingType = response.savingPlanSavingType;
            this.startTime = response.startTime;
            this.tag = response.tag;
            this.zoneIds = response.zoneIds;
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
         * ConfirmType.
         */
        public Builder confirmType(String confirmType) {
            this.putQueryParameter("ConfirmType", confirmType);
            this.confirmType = confirmType;
            return this;
        }

        /**
         * CouponAuto.
         */
        public Builder couponAuto(Boolean couponAuto) {
            this.putQueryParameter("CouponAuto", couponAuto);
            this.couponAuto = couponAuto;
            return this;
        }

        /**
         * CouponType.
         */
        public Builder couponType(String couponType) {
            this.putQueryParameter("CouponType", couponType);
            this.couponType = couponType;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceAmount.
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InstanceCpuCoreCount.
         */
        public Builder instanceCpuCoreCount(Integer instanceCpuCoreCount) {
            this.putQueryParameter("InstanceCpuCoreCount", instanceCpuCoreCount);
            this.instanceCpuCoreCount = instanceCpuCoreCount;
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
         * InstanceTypes.
         */
        public Builder instanceTypes(String instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * MatchCriteria.
         */
        public Builder matchCriteria(String matchCriteria) {
            this.putQueryParameter("MatchCriteria", matchCriteria);
            this.matchCriteria = matchCriteria;
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
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
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
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(java.util.List < PrivatePoolOptions> privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
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
         * ReservedInstanceDescription.
         */
        public Builder reservedInstanceDescription(String reservedInstanceDescription) {
            this.putQueryParameter("ReservedInstanceDescription", reservedInstanceDescription);
            this.reservedInstanceDescription = reservedInstanceDescription;
            return this;
        }

        /**
         * ReservedInstanceName.
         */
        public Builder reservedInstanceName(String reservedInstanceName) {
            this.putQueryParameter("ReservedInstanceName", reservedInstanceName);
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }

        /**
         * ReservedInstanceOfferingType.
         */
        public Builder reservedInstanceOfferingType(String reservedInstanceOfferingType) {
            this.putQueryParameter("ReservedInstanceOfferingType", reservedInstanceOfferingType);
            this.reservedInstanceOfferingType = reservedInstanceOfferingType;
            return this;
        }

        /**
         * ReservedInstanceScope.
         */
        public Builder reservedInstanceScope(String reservedInstanceScope) {
            this.putQueryParameter("ReservedInstanceScope", reservedInstanceScope);
            this.reservedInstanceScope = reservedInstanceScope;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ResourceSupplyType.
         */
        public Builder resourceSupplyType(String resourceSupplyType) {
            this.putQueryParameter("ResourceSupplyType", resourceSupplyType);
            this.resourceSupplyType = resourceSupplyType;
            return this;
        }

        /**
         * SavingPlanDescription.
         */
        public Builder savingPlanDescription(String savingPlanDescription) {
            this.putQueryParameter("SavingPlanDescription", savingPlanDescription);
            this.savingPlanDescription = savingPlanDescription;
            return this;
        }

        /**
         * SavingPlanHourFee.
         */
        public Builder savingPlanHourFee(Float savingPlanHourFee) {
            this.putQueryParameter("SavingPlanHourFee", savingPlanHourFee);
            this.savingPlanHourFee = savingPlanHourFee;
            return this;
        }

        /**
         * SavingPlanId.
         */
        public Builder savingPlanId(String savingPlanId) {
            this.putQueryParameter("SavingPlanId", savingPlanId);
            this.savingPlanId = savingPlanId;
            return this;
        }

        /**
         * SavingPlanInstanceTypeFamilyGroup.
         */
        public Builder savingPlanInstanceTypeFamilyGroup(String savingPlanInstanceTypeFamilyGroup) {
            this.putQueryParameter("SavingPlanInstanceTypeFamilyGroup", savingPlanInstanceTypeFamilyGroup);
            this.savingPlanInstanceTypeFamilyGroup = savingPlanInstanceTypeFamilyGroup;
            return this;
        }

        /**
         * SavingPlanName.
         */
        public Builder savingPlanName(String savingPlanName) {
            this.putQueryParameter("SavingPlanName", savingPlanName);
            this.savingPlanName = savingPlanName;
            return this;
        }

        /**
         * SavingPlanPayMode.
         */
        public Builder savingPlanPayMode(String savingPlanPayMode) {
            this.putQueryParameter("SavingPlanPayMode", savingPlanPayMode);
            this.savingPlanPayMode = savingPlanPayMode;
            return this;
        }

        /**
         * SavingPlanSavingType.
         */
        public Builder savingPlanSavingType(String savingPlanSavingType) {
            this.putQueryParameter("SavingPlanSavingType", savingPlanSavingType);
            this.savingPlanSavingType = savingPlanSavingType;
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

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * ZoneIds.
         */
        public Builder zoneIds(String zoneIds) {
            this.putQueryParameter("ZoneIds", zoneIds);
            this.zoneIds = zoneIds;
            return this;
        }

        @Override
        public CreateReservationDemandRequest build() {
            return new CreateReservationDemandRequest(this);
        } 

    } 

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        @NameInMap("ZoneId")
        private String zoneId;

        private PrivatePoolOptions(Builder builder) {
            this.instanceAmount = builder.instanceAmount;
            this.instanceType = builder.instanceType;
            this.matchCriteria = builder.matchCriteria;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer instanceAmount; 
            private String instanceType; 
            private String matchCriteria; 
            private String zoneId; 

            /**
             * InstanceAmount.
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * MatchCriteria.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
