// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("DemandName")
    private String demandName;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("DemandDescription")
    private String demandDescription;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("DemandId")
    private String demandId;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

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
        this.demandName = builder.demandName;
        this.zoneId = builder.zoneId;
        this.amount = builder.amount;
        this.demandDescription = builder.demandDescription;
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.instanceType = builder.instanceType;
        this.demandId = builder.demandId;
        this.periodUnit = builder.periodUnit;
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
     * @return demandName
     */
    public String getDemandName() {
        return this.demandName;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return demandDescription
     */
    public String getDemandDescription() {
        return this.demandDescription;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return demandId
     */
    public String getDemandId() {
        return this.demandId;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
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
        private String demandName; 
        private String zoneId; 
        private Integer amount; 
        private String demandDescription; 
        private String regionId; 
        private String endTime; 
        private String startTime; 
        private String instanceType; 
        private String demandId; 
        private String periodUnit; 
        private String instanceChargeType; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDemandRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.clientToken = response.clientToken;
            this.demandName = response.demandName;
            this.zoneId = response.zoneId;
            this.amount = response.amount;
            this.demandDescription = response.demandDescription;
            this.regionId = response.regionId;
            this.endTime = response.endTime;
            this.startTime = response.startTime;
            this.instanceType = response.instanceType;
            this.demandId = response.demandId;
            this.periodUnit = response.periodUnit;
            this.instanceChargeType = response.instanceChargeType;
            this.period = response.period;
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
         * The number of required specifications. Valid values: 1 to 100000.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * Report description. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         */
        public Builder demandDescription(String demandDescription) {
            this.putQueryParameter("DemandDescription", demandDescription);
            this.demandDescription = demandDescription;
            return this;
        }

        /**
         * Report instance belongs geographical ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Latest end buy time. Follow the ISO8601](~~ 25696 ~~) Standard said, use the UTC +0 time. Format is: yyyy-MM-dd HH:mm:ss.
         * <p>
         * 
         * If seconds (ss) value not 00, the automatic image for the current minutes (mm) started.
         * 
         * The latest purchase time is later than the earliest purchase time.
         * 
         * Sooner or later time length generally does not allow more than 10 days.
         * 
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The earliest purchase time. Follow the ISO8601](~~ 25696 ~~) Standard said, use the UTC +0 time. Format is: yyyy-MM-dd HH:mm:ss.
         * <p>
         * 
         * If seconds (ss) value not 00, the automatic image for the current minutes (mm) started.
         * 
         * The latest purchase time is later than the earliest purchase time.
         * 
         * Sooner or later time span general does not allow more than 10 days.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Report instance of the resource specification. See [instance dimension family](~~ 25378 ~~) or call [DescribeInstanceTypes](~~ 25620 ~~) see report instance dimension performance parameter, or see [type selection](~~ 58291 ~~) learn how to choose instance specifications.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Need to modify the report ID.
         */
        public Builder demandId(String demandId) {
            this.putQueryParameter("DemandId", demandId);
            this.demandId = demandId;
            return this;
        }

        /**
         * Buy resources length. Valid values:
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
         * Report instance pay. Valid values:
         * <p>
         * 
         * -PrePaid: Subscription
         * -PostPaid (default): Pay-as-you-go
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * Buy resources length, required value, unit for: month. When the parameter "instancechargetype" value for PrePaid when take effect. Valid values:
         * <p>
         * 
         * -PeriodUnit is Week when Period value:{"1", "2", "3", "4"}.
         * 
         * -PeriodUnit to Month when Period value:{"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
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
