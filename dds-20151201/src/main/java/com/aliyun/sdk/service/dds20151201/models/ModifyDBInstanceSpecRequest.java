// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceSpecRequest</p>
 */
public class ModifyDBInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    private String DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraParam")
    private String extraParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
    private String readonlyReplicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
    private String replicationFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBInstanceSpecRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoPay = builder.autoPay;
        this.businessInfo = builder.businessInfo;
        this.couponNo = builder.couponNo;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.effectiveTime = builder.effectiveTime;
        this.extraParam = builder.extraParam;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.readonlyReplicas = builder.readonlyReplicas;
        this.replicationFactor = builder.replicationFactor;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceStorage
     */
    public String getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return extraParam
     */
    public String getExtraParam() {
        return this.extraParam;
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
     * @return readonlyReplicas
     */
    public String getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    /**
     * @return replicationFactor
     */
    public String getReplicationFactor() {
        return this.replicationFactor;
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

    public static final class Builder extends Request.Builder<ModifyDBInstanceSpecRequest, Builder> {
        private String regionId; 
        private Boolean autoPay; 
        private String businessInfo; 
        private String couponNo; 
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private String DBInstanceStorage; 
        private String effectiveTime; 
        private String extraParam; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String readonlyReplicas; 
        private String replicationFactor; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSpecRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoPay = request.autoPay;
            this.businessInfo = request.businessInfo;
            this.couponNo = request.couponNo;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.effectiveTime = request.effectiveTime;
            this.extraParam = request.extraParam;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.readonlyReplicas = request.readonlyReplicas;
            this.replicationFactor = request.replicationFactor;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable automatic payment. Valid values:
         * <p>
         * 
         * *   **true** (default): enables automatic payment. Make sure that your Alibaba Cloud account has a sufficient balance.
         * *   **false**: disables automatic payment. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose **Expenses** > **User Center**. In the left-side navigation pane, choose **Order Management** > **Order**. On the **Orders for Services** tab, find the order and pay for the order.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The business information.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
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
         * The instance type. For more information, see [Instance types](~~57141~~). You can also call the [DescribeAvailableResource](~~149719~~) operation to view instance types.
         * <p>
         * 
         * > You must specify at least one of the DBInstanceClass and **DBInstanceStorage** parameters.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The storage capacity of the instance. Valid values: 10 to 3000. The value must be a multiple of 10. Unit: GB. The values that can be specified for this parameter are subject to the instance types. For more information, see [Instance types](~~57141~~).
         * <p>
         * 
         * > 
         * 
         * *   You must specify at least one of the DBInstanceStorage and **DBInstanceClass** parameters.
         * 
         * *   Storage capacity can be scaled down only for pay-as-you-go replica set instances. The new storage capacity you specify must be greater than the used storage capacity.
         */
        public Builder DBInstanceStorage(String DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The time when the changed configurations take effect. Valid values:
         * <p>
         * 
         * *   **Immediately** (default): The configurations immediately take effect.
         * *   **MaintainTime**: The configurations take effect during the maintenance window of the instance.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * The additional parameter.
         * <p>
         * 
         * Valid values:
         * 
         * *   async
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   sync
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder extraParam(String extraParam) {
            this.putQueryParameter("ExtraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * The type of the configuration change. Valid values:
         * <p>
         * 
         * *   **UPGRADE**
         * *   **DOWNGRADE** (default)
         * 
         * >  This parameter can be configured only when the billing method of the instance is subscription.
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
         * The number of read-only nodes. Valid values: **0** to **5**.
         * <p>
         * 
         * If your instance has only **Classic Network** and **VPC** endpoints, you must apply for a public endpoint or release the classic network endpoint for the instance before you can change the **Read-only Nodes** value.
         * 
         * > You can go to the **Database Connections** page to view the types of networks that are enabled.
         */
        public Builder readonlyReplicas(String readonlyReplicas) {
            this.putQueryParameter("ReadonlyReplicas", readonlyReplicas);
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }

        /**
         * The number of nodes in the instance.
         * <p>
         * 
         * *   Valid values for replica set instances: **3**, **5**, and **7**
         * *   Valid values for standalone instances: **1**
         * 
         * >  This parameter is not required for a serverless instance which is only available on the China site (aliyun.com).
         */
        public Builder replicationFactor(String replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
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
        public ModifyDBInstanceSpecRequest build() {
            return new ModifyDBInstanceSpecRequest(this);
        } 

    } 

}
