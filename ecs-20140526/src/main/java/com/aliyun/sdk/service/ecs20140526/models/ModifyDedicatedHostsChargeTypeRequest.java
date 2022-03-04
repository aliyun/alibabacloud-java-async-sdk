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
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("DedicatedHostChargeType")
    private String dedicatedHostChargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DetailFee")
    private Boolean detailFee;

    @Query
    @NameInMap("DedicatedHostIds")
    @Validation(required = true)
    private String dedicatedHostIds;

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
        this.periodUnit = builder.periodUnit;
        this.dryRun = builder.dryRun;
        this.autoPay = builder.autoPay;
        this.dedicatedHostChargeType = builder.dedicatedHostChargeType;
        this.clientToken = builder.clientToken;
        this.detailFee = builder.detailFee;
        this.dedicatedHostIds = builder.dedicatedHostIds;
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
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return dedicatedHostChargeType
     */
    public String getDedicatedHostChargeType() {
        return this.dedicatedHostChargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return detailFee
     */
    public Boolean getDetailFee() {
        return this.detailFee;
    }

    /**
     * @return dedicatedHostIds
     */
    public String getDedicatedHostIds() {
        return this.dedicatedHostIds;
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
        private String periodUnit; 
        private Boolean dryRun; 
        private Boolean autoPay; 
        private String dedicatedHostChargeType; 
        private String clientToken; 
        private Boolean detailFee; 
        private String dedicatedHostIds; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostsChargeTypeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.periodUnit = request.periodUnit;
            this.dryRun = request.dryRun;
            this.autoPay = request.autoPay;
            this.dedicatedHostChargeType = request.dedicatedHostChargeType;
            this.clientToken = request.clientToken;
            this.detailFee = request.detailFee;
            this.dedicatedHostIds = request.dedicatedHostIds;
            this.period = request.period;
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
         * The unit of the renewal period. Valid values:
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
         * Indicates whether to pay automatically. Valid values:
         * <p>
         * -true: automatic payment. You must ensure that your account balance is sufficient. If your account balance is insufficient, an abnormal order will be generated and you can only cancel the order.
         * -false: only generated orders are billed.
         * 
         * Default value: true
         * 
         * > If the balance of your payment method is insufficient, you can set the parameter "AutoPay" to "false". In this case, an unpaid order is generated and you can pay by yourself.
         * 
         * 
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The target billing method to be modified for the dedicated host. Valid values:
         * <p>
         * -PrePaid: converts the pay-as-you-go billing method to subscription.
         * -PostPaid: convert subscription to pay-as-you-go.
         * 
         * Default value: PrePaid
         * 
         */
        public Builder dedicatedHostChargeType(String dedicatedHostChargeType) {
            this.putQueryParameter("DedicatedHostChargeType", dedicatedHostChargeType);
            this.dedicatedHostChargeType = dedicatedHostChargeType;
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
         * Specifies whether to return the order fee details when the subscription is converted to pay-as-you-go.
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
         * The ID of the dedicated host. The value can be a JSON array consisting of multiple ddh ids. A maximum of 20 ids can be entered. Separate ids with commas (,).
         */
        public Builder dedicatedHostIds(String dedicatedHostIds) {
            this.putQueryParameter("DedicatedHostIds", dedicatedHostIds);
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }

        /**
         * The subscription duration. Valid values:
         * <p>
         * -When "PeriodUnit = Week", the valid value of "1" is {1, 2 ,3 ,4}.
         * -When "$unit = Month", valid values of "$":{1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60}
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
