// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("IsDetailFee")
    private Boolean isDetailFee;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("IncludeDataDisks")
    private Boolean includeDataDisks;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("Period")
    private Integer period;

    private ModifyInstanceChargeTypeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.periodUnit = builder.periodUnit;
        this.isDetailFee = builder.isDetailFee;
        this.clientToken = builder.clientToken;
        this.includeDataDisks = builder.includeDataDisks;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceIds = builder.instanceIds;
        this.dryRun = builder.dryRun;
        this.autoPay = builder.autoPay;
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
     * @return isDetailFee
     */
    public Boolean getIsDetailFee() {
        return this.isDetailFee;
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
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
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
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
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
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String periodUnit; 
        private Boolean isDetailFee; 
        private String clientToken; 
        private Boolean includeDataDisks; 
        private String instanceChargeType; 
        private String instanceIds; 
        private Boolean dryRun; 
        private Boolean autoPay; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceChargeTypeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.periodUnit = request.periodUnit;
            this.isDetailFee = request.isDetailFee;
            this.clientToken = request.clientToken;
            this.includeDataDisks = request.includeDataDisks;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceIds = request.instanceIds;
            this.dryRun = request.dryRun;
            this.autoPay = request.autoPay;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The unit of the renewal period. Valid values:
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
         * Specifies whether to return the order fee details when the subscription is converted to pay-as-you-go.
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
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to convert all pay-as-you-go data disks attached to the instance to subscription data disks.
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
         * The target billing method of the instance. Valid values:
         * <p>
         * 
         * -PrePaid (default): converts a pay-as-you-go instance to a subscription instance.
         * 
         * -PostPaid: converts a subscription instance to a pay-as-you-go instance.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The ID of the instance. The value can be a JSON array consisting of multiple instance ids. A maximum of 20 ids can be entered. Separate ids with commas (,).
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
         * -false (default): a normal request is sent. After the request passes the check, the status code 2XX is returned and the resource status is directly queried.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Indicates whether to pay automatically. Valid values:
         * <p>
         * 
         * -true (default): automatic payment. You must ensure that your account balance is sufficient. If your account balance is insufficient, an abnormal order will be generated and you can only cancel the order.
         * 
         * -false: only generated orders are billed.
         * 
         * > if the balance of your payment method is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated. You can log on to the ECS console to pay by yourself.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The subscription duration. If the DDH of the ECS instance is a dedicated host, the value range cannot exceed the subscription period of the dedicated host. Valid values:
         * <p>
         * 
         * -<props = "china">"periodunit = Week", the value of "1" is {"1", "2", "3", "4"}</props>
         * 
         * -When "PeriodUnit = Month", "1" value:{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}
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
