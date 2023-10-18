// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("BusinessInfo")
    private String businessInfo;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CouponNo")
    private String couponNo;

    @Query
    @NameInMap("EffectiveTime")
    private String effectiveTime;

    @Query
    @NameInMap("ForceTrans")
    private Boolean forceTrans;

    @Query
    @NameInMap("ForceUpgrade")
    private Boolean forceUpgrade;

    @Query
    @NameInMap("InstanceClass")
    private String instanceClass;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MajorVersion")
    private String majorVersion;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReadOnlyCount")
    @Validation(maximum = 5)
    private Integer readOnlyCount;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("ShardCount")
    @Validation(maximum = 4092, minimum = 1)
    private Integer shardCount;

    @Query
    @NameInMap("SourceBiz")
    private String sourceBiz;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.businessInfo = builder.businessInfo;
        this.clientToken = builder.clientToken;
        this.couponNo = builder.couponNo;
        this.effectiveTime = builder.effectiveTime;
        this.forceTrans = builder.forceTrans;
        this.forceUpgrade = builder.forceUpgrade;
        this.instanceClass = builder.instanceClass;
        this.instanceId = builder.instanceId;
        this.majorVersion = builder.majorVersion;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.readOnlyCount = builder.readOnlyCount;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.shardCount = builder.shardCount;
        this.sourceBiz = builder.sourceBiz;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return forceTrans
     */
    public Boolean getForceTrans() {
        return this.forceTrans;
    }

    /**
     * @return forceUpgrade
     */
    public Boolean getForceUpgrade() {
        return this.forceUpgrade;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return majorVersion
     */
    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return readOnlyCount
     */
    public Integer getReadOnlyCount() {
        return this.readOnlyCount;
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

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * @return sourceBiz
     */
    public String getSourceBiz() {
        return this.sourceBiz;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceSpecRequest, Builder> {
        private Boolean autoPay; 
        private String businessInfo; 
        private String clientToken; 
        private String couponNo; 
        private String effectiveTime; 
        private Boolean forceTrans; 
        private Boolean forceUpgrade; 
        private String instanceClass; 
        private String instanceId; 
        private String majorVersion; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer readOnlyCount; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private Integer shardCount; 
        private String sourceBiz; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.businessInfo = request.businessInfo;
            this.clientToken = request.clientToken;
            this.couponNo = request.couponNo;
            this.effectiveTime = request.effectiveTime;
            this.forceTrans = request.forceTrans;
            this.forceUpgrade = request.forceUpgrade;
            this.instanceClass = request.instanceClass;
            this.instanceId = request.instanceId;
            this.majorVersion = request.majorVersion;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.readOnlyCount = request.readOnlyCount;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.shardCount = request.shardCount;
            this.sourceBiz = request.sourceBiz;
        } 

        /**
         * Specifies whether to enable auto-renewal. Default value: true. Valid values:
         * <p>
         * 
         * *   **true**: enables auto-renewal.
         * *   **false**: disables auto-renewal. If you set this parameter to **false**, the instance must be manually renewed before it expires. For more information, see [Renew an instance](~~26352~~).
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The ID of the promotional event or business information.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * The time when to change the configurations. Default value: Immediately. Valid values:
         * <p>
         * 
         * *   **Immediately**: The configurations are immediately changed.
         * *   **MaintainTime**: The configurations are changed within the maintenance window. You can call the [ModifyInstanceMaintainTime](~~61000~~) operation to change the maintenance window.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * 是否开启强制传输，取值：
         * <p>
         * - **false**（默认）：在变配前，系统会检查实例当前的内核小版本，若内核版本过低则会报错，您需要升级内核小版本后重试。
         * - **true**：跳过检查项，直接执行变配操作。
         */
        public Builder forceTrans(Boolean forceTrans) {
            this.putQueryParameter("ForceTrans", forceTrans);
            this.forceTrans = forceTrans;
            return this;
        }

        /**
         * Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values:
         * <p>
         * 
         * *   **false**: The system does not forcefully change the configurations.
         * *   **true**: The system forcefully changes the configurations.
         */
        public Builder forceUpgrade(Boolean forceUpgrade) {
            this.putQueryParameter("ForceUpgrade", forceUpgrade);
            this.forceUpgrade = forceUpgrade;
            return this;
        }

        /**
         * The new instance type. You can call the [DescribeAvailableResource](~~120580~~) operation to query the instance types available for configuration change within the zone to which the instance belongs.
         * <p>
         * 
         * >  For more information about the instance types, see [Overview](~~26350~~).
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The major version to which you want to upgrade. When you change the configurations of an instance, you can upgrade the major version of the instance by setting this parameter. Valid values: **4.0** and **5.0**.
         */
        public Builder majorVersion(String majorVersion) {
            this.putQueryParameter("MajorVersion", majorVersion);
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * The change type. This parameter is required when you change the configurations of a subscription instance. Default value: UPGRADE. Valid values:
         * <p>
         * 
         * *   **UPGRADE**: upgrades the configurations of a subscription instance.
         * *   **DOWNGRADE**: downgrades the configurations of a subscription instance.
         * 
         * > *   To downgrade a subscription instance, you must set this parameter to **DOWNGRADE**.
         * > *   If the price of an instance increases after its configurations are changed, the instance is upgraded. If the price decreases, the instance is downgraded. For example, the price of an 8 GB read/write splitting instance with five read replicas is higher than that of a 16 GB cluster instance. If you want to change a 16 GB cluster instance to an 8 GB read/write splitting instance with five read replicas, you must upgrade the instance.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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
         * The number of read-only nodes. This parameter is available only for read/write splitting instances that use cloud disks. Valid values: 1 to 5.
         */
        public Builder readOnlyCount(Integer readOnlyCount) {
            this.putQueryParameter("ReadOnlyCount", readOnlyCount);
            this.readOnlyCount = readOnlyCount;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~61012~~) operation to query the most recent region list.
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

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The number of shards. This parameter is available only for cluster instances that use cloud disks.
         */
        public Builder shardCount(Integer shardCount) {
            this.putQueryParameter("ShardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * The source of the operation. This parameter is used only for internal maintenance. You do not need to specify this parameter.
         */
        public Builder sourceBiz(String sourceBiz) {
            this.putQueryParameter("SourceBiz", sourceBiz);
            this.sourceBiz = sourceBiz;
            return this;
        }

        @Override
        public ModifyInstanceSpecRequest build() {
            return new ModifyInstanceSpecRequest(this);
        } 

    } 

}
