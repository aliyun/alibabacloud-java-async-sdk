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
         * BusinessInfo.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * Capacity.
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * CouponNo.
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * ForceUpgrade.
         */
        public Builder forceUpgrade(Boolean forceUpgrade) {
            this.putQueryParameter("ForceUpgrade", forceUpgrade);
            this.forceUpgrade = forceUpgrade;
            return this;
        }

        /**
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(String instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * OrderParamOut.
         */
        public Builder orderParamOut(String orderParamOut) {
            this.putQueryParameter("OrderParamOut", orderParamOut);
            this.orderParamOut = orderParamOut;
            return this;
        }

        /**
         * OrderType.
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
         * Period.
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Long quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * RegionId.
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
         * ZoneId.
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
