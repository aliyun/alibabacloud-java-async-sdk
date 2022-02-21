// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostsChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostsChargeTypeRequest</p>
 */
public class ModifyDedicatedHostsChargeTypeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

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
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("DedicatedHostIds")
    private String dedicatedHostIds;

    @Query
    @NameInMap("DetailFee")
    private Boolean detailFee;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("DedicatedHostChargeType")
    private String dedicatedHostChargeType;

    @Query
    @NameInMap("Period")
    private Integer period;

    private ModifyDedicatedHostsChargeTypeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.dedicatedHostIds = builder.dedicatedHostIds;
        this.detailFee = builder.detailFee;
        this.autoPay = builder.autoPay;
        this.periodUnit = builder.periodUnit;
        this.dedicatedHostChargeType = builder.dedicatedHostChargeType;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostsChargeTypeRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return dedicatedHostIds
     */
    public String getDedicatedHostIds() {
        return this.dedicatedHostIds;
    }

    /**
     * @return detailFee
     */
    public Boolean getDetailFee() {
        return this.detailFee;
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
     * @return dedicatedHostChargeType
     */
    public String getDedicatedHostChargeType() {
        return this.dedicatedHostChargeType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<ModifyDedicatedHostsChargeTypeRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String dedicatedHostIds; 
        private Boolean detailFee; 
        private Boolean autoPay; 
        private String periodUnit; 
        private String dedicatedHostChargeType; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostsChargeTypeRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.regionId = response.regionId;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.dedicatedHostIds = response.dedicatedHostIds;
            this.detailFee = response.detailFee;
            this.autoPay = response.autoPay;
            this.periodUnit = response.periodUnit;
            this.dedicatedHostChargeType = response.dedicatedHostChargeType;
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
         * The ID of the region to which the dedicated host belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. "ClientToken" only supports ASCII characters and cannot exceed 64 characters in length. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the error code "DryRunOperation" is returned ".
         * -false: a normal request is sent. After the request passes the check, the 2XX HTTP status code is returned and the resource status is directly queried.
         * 
         * Default value: false
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the dedicated host. Values can be by multiple proprietary Host ID a JSON Array to support up to 20 ID,ID between separate them with commas (,).
         */
        public Builder dedicatedHostIds(String dedicatedHostIds) {
            this.putQueryParameter("DedicatedHostIds", dedicatedHostIds);
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }

        /**
         * Annual commitment monthly conversion for quantity pay when, whether to return order fee.
         * <p>
         * 
         * Default value: false
         */
        public Builder detailFee(Boolean detailFee) {
            this.putQueryParameter("DetailFee", detailFee);
            this.detailFee = detailFee;
            return this;
        }

        /**
         * Indicates whether to pay automatically. Valid values:
         * <p>
         * -true: automatic payment. You need to make sure that the account balance adequate, if account balance is insufficient generates exception orders, and only be order.
         * -false: only generate orders don"t buckle fee.
         * 
         * Default: true
         * 
         * > If you of payment insufficient balance, parameters can be "autopay" set "false", generated not payment order, you can self-payment.
         * 
         * 
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Renew length unit of time-the parameter "period" units. Valid values:
         * <p>
         * -Week
         * -Month
         * 
         * Default value: Month
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Proprietary host need to modify the target billing. Valid values:
         * <p>
         * -PrePaid: quantity pay conversion for annual commitment monthly subscription.
         * -PostPaid: annual commitment monthly conversion for quantity pay.
         * 
         * Default: PrePaid
         * 
         */
        public Builder dedicatedHostChargeType(String dedicatedHostChargeType) {
            this.putQueryParameter("DedicatedHostChargeType", dedicatedHostChargeType);
            this.dedicatedHostChargeType = dedicatedHostChargeType;
            return this;
        }

        /**
         * Annual commitment monthly renewal length. Valid values:
         * <p>
         * -"periodunit = week" when "period" effective value:{1, 2 ,3 ,4}
         * -"periodunit = month" when "period" effective value:{1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60}
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public ModifyDedicatedHostsChargeTypeRequest build() {
            return new ModifyDedicatedHostsChargeTypeRequest(this);
        } 

    } 

}
