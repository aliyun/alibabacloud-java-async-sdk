// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceChargeTypeRequest</p>
 */
public class ModifyInstanceChargeTypeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("IncludeDataDisks")
    private Boolean includeDataDisks;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IsDetailFee")
    private Boolean isDetailFee;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("Period")
    private Integer period;

    private ModifyInstanceChargeTypeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.regionId = builder.regionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.clientToken = builder.clientToken;
        this.includeDataDisks = builder.includeDataDisks;
        this.instanceIds = builder.instanceIds;
        this.dryRun = builder.dryRun;
        this.isDetailFee = builder.isDetailFee;
        this.autoPay = builder.autoPay;
        this.periodUnit = builder.periodUnit;
        this.instanceChargeType = builder.instanceChargeType;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceChargeTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return includeDataDisks
     */
    public Boolean getIncludeDataDisks() {
        return this.includeDataDisks;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return isDetailFee
     */
    public Boolean getIsDetailFee() {
        return this.isDetailFee;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
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

    public static final class Builder extends Request.Builder<ModifyInstanceChargeTypeRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String resourceOwnerAccount; 
        private String regionId; 
        private Long ownerId; 
        private Long resourceOwnerId; 
        private String clientToken; 
        private Boolean includeDataDisks; 
        private String instanceIds; 
        private Boolean dryRun; 
        private Boolean isDetailFee; 
        private Boolean autoPay; 
        private String periodUnit; 
        private String instanceChargeType; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceChargeTypeRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.regionId = response.regionId;
            this.ownerId = response.ownerId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.clientToken = response.clientToken;
            this.includeDataDisks = response.includeDataDisks;
            this.instanceIds = response.instanceIds;
            this.dryRun = response.dryRun;
            this.isDetailFee = response.isDetailFee;
            this.autoPay = response.autoPay;
            this.periodUnit = response.periodUnit;
            this.instanceChargeType = response.instanceChargeType;
            this.period = response.period;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Whether the instance mounted all quantity pay data plate with conversion for annual commitment monthly data plate.
         * <p>
         * 
         * Default value: false
         */
        public Builder includeDataDisks(Boolean includeDataDisks) {
            this.putQueryParameter("IncludeDataDisks", includeDataDisks);
            this.includeDataDisks = includeDataDisks;
            return this;
        }

        /**
         * The ID of the instance. Values can be by multiple instance ID composition a JSON Array to support up to 20 ID,ID between separate them with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the error code "DryRunOperation" is returned ".
         * 
         * -false (default): send normal request, pass inspection rear returns 2XX HTTP status code and directly query the resource situation.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Annual commitment monthly conversion for quantity billing when, whether to return order fee.
         * <p>
         * 
         * Default value: false
         */
        public Builder isDetailFee(Boolean isDetailFee) {
            this.putQueryParameter("IsDetailFee", isDetailFee);
            this.isDetailFee = isDetailFee;
            return this;
        }

        /**
         * Indicates whether to pay automatically. Valid values:
         * <p>
         * 
         * -true (default): automatic payment. You need to make sure that the account balance adequate, if account balance is insufficient generates exception orders, only be order.
         * 
         * -false: only generate orders don"t buckle fee.
         * 
         * > If you of payment insufficient balance, parameters can be AutoPay is set to false, generated not payment order, you can log in ECS management console self-payment.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Renew length unit of time-the parameter "period" units. Valid values:
         * <p>
         * 
         * -<props="china">Week</props>
         * -Month (default)
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Instance need to modify the target billing. Valid values:
         * <p>
         * 
         * -PrePaid (default): will quantity pay instance conversion for annual commitment monthly instance.
         * 
         * -PostPaid: annual commitment monthly instance conversion for quantity pay instance.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * Annual commitment monthly renewal length. If ECS instance host for proprietary host DDH, the value range cannot exceed proprietary the host when the subscription is long. Valid values:
         * <p>
         * 
         * -<props = "china"> "periodunit = week" when "period" value:{"1", "2", "3", "4"}</props>
         * 
         * -"periodunit = month" when "period" value:{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}
         * 
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public ModifyInstanceChargeTypeRequest build() {
            return new ModifyInstanceChargeTypeRequest(this);
        } 

    } 

}
