// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @Query
    @NameInMap("BusinessInfo")
    private String businessInfo;

    @Query
    @NameInMap("Capacity")
    private Long capacity;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("CouponNo")
    private String couponNo;

    @Query
    @NameInMap("ForceUpgrade")
    private Boolean forceUpgrade;

    @Query
    @NameInMap("InstanceClass")
    private String instanceClass;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Instances")
    private String instances;

    @Query
    @NameInMap("NodeType")
    private String nodeType;

    @Query
    @NameInMap("OrderParamOut")
    private String orderParamOut;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true)
    private String orderType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Long period;

    @Query
    @NameInMap("Quantity")
    private Long quantity;

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
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.businessInfo = builder.businessInfo;
        this.capacity = builder.capacity;
        this.chargeType = builder.chargeType;
        this.couponNo = builder.couponNo;
        this.forceUpgrade = builder.forceUpgrade;
        this.instanceClass = builder.instanceClass;
        this.instanceId = builder.instanceId;
        this.instances = builder.instances;
        this.nodeType = builder.nodeType;
        this.orderParamOut = builder.orderParamOut;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.quantity = builder.quantity;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
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
     * @return instances
     */
    public String getInstances() {
        return this.instances;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return orderParamOut
     */
    public String getOrderParamOut() {
        return this.orderParamOut;
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
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return quantity
     */
    public Long getQuantity() {
        return this.quantity;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private String businessInfo; 
        private Long capacity; 
        private String chargeType; 
        private String couponNo; 
        private Boolean forceUpgrade; 
        private String instanceClass; 
        private String instanceId; 
        private String instances; 
        private String nodeType; 
        private String orderParamOut; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long period; 
        private Long quantity; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.businessInfo = request.businessInfo;
            this.capacity = request.capacity;
            this.chargeType = request.chargeType;
            this.couponNo = request.couponNo;
            this.forceUpgrade = request.forceUpgrade;
            this.instanceClass = request.instanceClass;
            this.instanceId = request.instanceId;
            this.instances = request.instances;
            this.nodeType = request.nodeType;
            this.orderParamOut = request.orderParamOut;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.quantity = request.quantity;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.zoneId = request.zoneId;
        } 

        /**
         * The extended information such as the promotional event ID and business information.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * The storage capacity of the instance. Unit: MB. This parameter is used only to query ApsaraDB for Redis Community Edition instances that are deployed in classic mode. We recommend that you use the **InstanceClass** parameter to specify an exact instance type.
         * <p>
         * 
         * >  If you specify the **InstanceClass** parameter, you do not need to specify the Capacity parameter.
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **PostPaid** (default): pay-as-you-go
         * *   **PrePaid**: subscription
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The coupon code. Default value: youhuiquan_promotion_option_id_for_blank. This value indicates that no coupon code is available.
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * Specifies whether to forcefully change the configurations of the instance. Valid values:
         * <p>
         * 
         * *   **false**: forcefully changes the configurations.
         * *   **true** (default): does not forcefully change the configurations.
         */
        public Builder forceUpgrade(Boolean forceUpgrade) {
            this.putQueryParameter("ForceUpgrade", forceUpgrade);
            this.forceUpgrade = forceUpgrade;
            return this;
        }

        /**
         * The instance type.
         * <p>
         * 
         * **To view the instance type, perform the following steps:**
         * 
         * 1.  In the [Overview](~~26350~~) topic, click the link in the **Reference** column corresponding to the instance type that you want to view.
         * 2.  In the instance type table of the page that appears, find the instance type in the **InstanceClass** column.
         * 
         * When you query cloud-native cluster instances, you must set this parameter to one of the following values and use the Instances parameter to specify the instance type that you want to query.
         * 
         * *   ApsaraDB for Redis cluster instances: redis.cluster.sharding.common.ce
         * *   Tair DRAM-based cluster instances: tair.rdb.cluster.sharding.common
         * *   Tair persistent memory-based cluster instances: tair.scm.cluster.sharding.common.ce
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * The instance ID.
         * <p>
         * 
         * >  This parameter is required when the **OrderType** parameter is set to **UPGRADE** or **RENEW**.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * A JSON string that contains information about one or more cloud-native cluster instances. For more information, see the "Additional description of the Instances parameter" section of this topic.
         */
        public Builder instances(String instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * The node type. Valid values:
         * <p>
         * 
         * *   **STAND_ALONE**: standalone
         * *   **MASTER_SLAVE** (default): high availability (master-replica)
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * Specifies whether to return parameters related to the order. Valid values:
         * <p>
         * 
         * *   **false** (default)
         * *   **true**
         */
        public Builder orderParamOut(String orderParamOut) {
            this.putQueryParameter("OrderParamOut", orderParamOut);
            this.orderParamOut = orderParamOut;
            return this;
        }

        /**
         * The order type. Valid values:
         * <p>
         * 
         * *   **BUY**: The order is used to purchase instances.
         * *   **UPGRADE**: The order is used to change the configurations of instances.
         * *   **RENEW**: The order is used to renew instances.
         * *   **CONVERT**: The order is used to change the billing methods of instances.
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
         * The subscription duration. Unit: months. Valid values: **1**, 2, 3, 4, 5, 6, 7, 8, **9**, **12**, **24**, and **36**.
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The number of instances that you want to purchase. Valid values: **1** to **30**. Default value: **1**.
         */
        public Builder quantity(Long quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
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
         * The zone ID of the instance. You can call the [DescribeZones](~~94527~~) operation to query the most recent zone list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

}
