// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDemandRequest} extends {@link RequestModel}
 *
 * <p>ModifyDemandRequest</p>
 */
public class ModifyDemandRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("DemandName")
    private String demandName;

    @Query
    @NameInMap("DemandDescription")
    private String demandDescription;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("DemandId")
    @Validation(required = true)
    private String demandId;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("Period")
    private Integer period;

    private ModifyDemandRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.zoneId = builder.zoneId;
        this.demandName = builder.demandName;
        this.demandDescription = builder.demandDescription;
        this.instanceType = builder.instanceType;
        this.amount = builder.amount;
        this.periodUnit = builder.periodUnit;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.demandId = builder.demandId;
        this.instanceChargeType = builder.instanceChargeType;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDemandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return demandName
     */
    public String getDemandName() {
        return this.demandName;
    }

    /**
     * @return demandDescription
     */
    public String getDemandDescription() {
        return this.demandDescription;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return demandId
     */
    public String getDemandId() {
        return this.demandId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<ModifyDemandRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String clientToken; 
        private String regionId; 
        private String zoneId; 
        private String demandName; 
        private String demandDescription; 
        private String instanceType; 
        private Integer amount; 
        private String periodUnit; 
        private String startTime; 
        private String endTime; 
        private String demandId; 
        private String instanceChargeType; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDemandRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.zoneId = request.zoneId;
            this.demandName = request.demandName;
            this.demandDescription = request.demandDescription;
            this.instanceType = request.instanceType;
            this.amount = request.amount;
            this.periodUnit = request.periodUnit;
            this.startTime = request.startTime;
            this.endTime = request.endTime;
            this.demandId = request.demandId;
            this.instanceChargeType = request.instanceChargeType;
            this.period = request.period;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The ID of the region to which the reported instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the zone to which the reported instance belongs. For more information, see [DescribeZones](~~ 25610 ~~) for a list of zones.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The name of the report. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
         * <p>
         * 
         * Default value: the name of the instance type.
         */
        public Builder demandName(String demandName) {
            this.putQueryParameter("DemandName", demandName);
            this.demandName = demandName;
            return this;
        }

        /**
         * The description of the report. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         */
        public Builder demandDescription(String demandDescription) {
            this.putQueryParameter("DemandDescription", demandDescription);
            this.demandDescription = demandDescription;
            return this;
        }

        /**
         * The resource type of the reported instance. See [instance type family](~~ 25378 ~~) or call [DescribeInstanceTypes](~~ 25620 ~~) to view the performance parameters of the reported instance type, or see [select configuration](~~ 58291 ~~) to learn how to select an instance type.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The number of required specifications. Valid values: 1 to 100000.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * The duration of the resource purchase. Valid values:
         * <p>
         * -Day
         * -Week
         * -Month (default)
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The earliest purchase time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-dd HH:mm:ss.
         * <p>
         * 
         * If the value of seconds (ss) is not 00, it is automatically set to the beginning of the current minute (mm).
         * 
         * The latest purchase time is later than the earliest purchase time.
         * 
         * The time span between morning and evening is generally not allowed to exceed 10 days.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The latest purchase time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-dd HH:mm:ss.
         * <p>
         * 
         * If the value of seconds (ss) is not 00, it is automatically set to the beginning of the current minute (mm).
         * 
         * The latest purchase time is later than the earliest purchase time.
         * 
         * The length of time in the morning and evening cannot exceed 10 days.
         * 
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the report to be modified.
         */
        public Builder demandId(String demandId) {
            this.putQueryParameter("DemandId", demandId);
            this.demandId = demandId;
            return this;
        }

        /**
         * The billing method of the reported instance. Valid values:
         * <p>
         * 
         * -PrePaid: Subscription
         * -PostPaid (default): pay-as-you-go
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The duration of the resource to be purchased. This parameter is required. Unit: month. This parameter takes effect only when the instancechargetype" parameter is set to PrePaid. Valid values:
         * <p>
         * 
         * When the value of-PeriodUnit is Week, the value of Period is {"1", "2", "3", "4"}.
         * 
         * -When the PeriodUnit is Month, the value of Period is {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public ModifyDemandRequest build() {
            return new ModifyDemandRequest(this);
        } 

    } 

}
