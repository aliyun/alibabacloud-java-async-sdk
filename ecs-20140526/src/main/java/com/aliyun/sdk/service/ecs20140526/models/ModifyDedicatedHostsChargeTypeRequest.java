// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDedicatedHostsChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostsChargeTypeRequest</p>
 */
public class ModifyDedicatedHostsChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostChargeType")
    private String dedicatedHostChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dedicatedHostIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetailFee")
    private Boolean detailFee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * <p>Specifies whether to automatically complete the payment. Valid values:</p>
         * <ul>
         * <li>true: The payment is automatically completed. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and will be canceled.</li>
         * <li>false: An order is generated but no payment is made.</li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p>If you do not have sufficient balance in your account, you can set <code>AutoPay</code> to <code>false</code> to generate an unpaid order. Then, you can pay for the order.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The new billing method of the dedicated hosts. Valid values:</p>
         * <ul>
         * <li>PrePaid: changes the billing method from pay-as-you-go to subscription.</li>
         * <li>PostPaid: changes the billing method from subscription to pay-as-you-go.</li>
         * </ul>
         * <p>Default value: PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder dedicatedHostChargeType(String dedicatedHostChargeType) {
            this.putQueryParameter("DedicatedHostChargeType", dedicatedHostChargeType);
            this.dedicatedHostChargeType = dedicatedHostChargeType;
            return this;
        }

        /**
         * <p>The IDs of the dedicated hosts. The value can be a JSON array that consists of up to 20 dedicated host IDs. Separate the IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;dh-bp181e5064b5sotr****&quot;,&quot;dh-bp18064b5sotrr9c****&quot;]</p>
         */
        public Builder dedicatedHostIds(String dedicatedHostIds) {
            this.putQueryParameter("DedicatedHostIds", dedicatedHostIds);
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }

        /**
         * <p>Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder detailFee(Boolean detailFee) {
            this.putQueryParameter("DetailFee", detailFee);
            this.detailFee = detailFee;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run. The system checks your AccessKey pair, the permissions of the RAM user, and the required parameters. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The renewal duration of the subscription dedicated hosts. Valid values:</p>
         * <ul>
         * <li>If you set <code>PeriodUnit</code> to Week, valid values of <code>Period</code> are 1, 2, 3, and 4.</li>
         * <li>If you set <code>PeriodUnit</code> to Month, valid values of <code>Period</code> are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the renewal duration specified by <code>Period</code>. Valid values:</p>
         * <ul>
         * <li>Week</li>
         * <li>Month</li>
         * </ul>
         * <p>Default value: Month.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The region ID of the dedicated hosts. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
