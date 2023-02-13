// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DedicatedHostChargeType")
    private String dedicatedHostChargeType;

    @Query
    @NameInMap("DedicatedHostIds")
    @Validation(required = true)
    private String dedicatedHostIds;

    @Query
    @NameInMap("DetailFee")
    private Boolean detailFee;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDedicatedHostsChargeTypeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.dedicatedHostChargeType = builder.dedicatedHostChargeType;
        this.dedicatedHostIds = builder.dedicatedHostIds;
        this.detailFee = builder.detailFee;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dedicatedHostChargeType
     */
    public String getDedicatedHostChargeType() {
        return this.dedicatedHostChargeType;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyDedicatedHostsChargeTypeRequest, Builder> {
        private String sourceRegionId; 
        private Boolean autoPay; 
        private String clientToken; 
        private String dedicatedHostChargeType; 
        private String dedicatedHostIds; 
        private Boolean detailFee; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostsChargeTypeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.autoPay = request.autoPay;
            this.clientToken = request.clientToken;
            this.dedicatedHostChargeType = request.dedicatedHostChargeType;
            this.dedicatedHostIds = request.dedicatedHostIds;
            this.detailFee = request.detailFee;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * Specifies whether to enable automatic payment. Valid values:
         * <p>
         * 
         * *   true: enables automatic payment. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and must be canceled.
         * *   false: An order is generated but no payment is made.
         * 
         * Default value: true.
         * 
         * >  If your account balance is insufficient, you can set the `AutoPay` parameter to `false` to generate an unpaid order. Then, you can pay for the order.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The `ClientToken` value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The new billing method for the dedicated host. Valid values:
         * <p>
         * 
         * *   PrePaid: changes the billing method from pay-as-you-go to subscription.
         * *   PostPaid: changes the billing method from subscription to pay-as-you-go.
         * 
         * Default value: PrePaid.
         */
        public Builder dedicatedHostChargeType(String dedicatedHostChargeType) {
            this.putQueryParameter("DedicatedHostChargeType", dedicatedHostChargeType);
            this.dedicatedHostChargeType = dedicatedHostChargeType;
            return this;
        }

        /**
         * The IDs of dedicated hosts. The value can be a JSON array that consists of up to 20 dedicated host IDs. Separate the dedicated host IDs with commas (,).
         */
        public Builder dedicatedHostIds(String dedicatedHostIds) {
            this.putQueryParameter("DedicatedHostIds", dedicatedHostIds);
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }

        /**
         * Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go.
         * <p>
         * 
         * Default value: false.
         */
        public Builder detailFee(Boolean detailFee) {
            this.putQueryParameter("DetailFee", detailFee);
            this.detailFee = detailFee;
            return this;
        }

        /**
         * Specifies whether to check the validity of the request without actually making the request. Valid values:
         * <p>
         * 
         * *   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the `DryRunOperation` error code is returned.
         * *   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned, and the request is made.
         * 
         * Default value: false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * The renewal duration of the subscription dedicated host. Valid values:
         * <p>
         * 
         * *   When `PeriodUnit` is set to Week, valid values of `Period` are 1, 2, 3, and 4.
         * *   When `PeriodUnit` is set to Month, valid values of `Period` are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the renewal duration (`Period`). Valid values:
         * <p>
         * 
         * *   Week
         * *   Month
         * 
         * Default value: Month.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The region ID of the dedicated host. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyDedicatedHostsChargeTypeRequest build() {
            return new ModifyDedicatedHostsChargeTypeRequest(this);
        } 

    } 

}
