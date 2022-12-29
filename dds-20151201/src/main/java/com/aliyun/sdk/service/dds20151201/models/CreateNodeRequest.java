// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeRequest</p>
 */
public class CreateNodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    private String accountPassword;

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
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("NodeClass")
    @Validation(required = true)
    private String nodeClass;

    @Query
    @NameInMap("NodeStorage")
    private Integer nodeStorage;

    @Query
    @NameInMap("NodeType")
    @Validation(required = true)
    private String nodeType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReadonlyReplicas")
    @Validation(maximum = 5)
    private Integer readonlyReplicas;

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
    @NameInMap("ShardDirect")
    private Boolean shardDirect;

    private CreateNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.autoPay = builder.autoPay;
        this.businessInfo = builder.businessInfo;
        this.clientToken = builder.clientToken;
        this.couponNo = builder.couponNo;
        this.DBInstanceId = builder.DBInstanceId;
        this.nodeClass = builder.nodeClass;
        this.nodeStorage = builder.nodeStorage;
        this.nodeType = builder.nodeType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.readonlyReplicas = builder.readonlyReplicas;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.shardDirect = builder.shardDirect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeRequest create() {
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
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return nodeClass
     */
    public String getNodeClass() {
        return this.nodeClass;
    }

    /**
     * @return nodeStorage
     */
    public Integer getNodeStorage() {
        return this.nodeStorage;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
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
    public Integer getReadonlyReplicas() {
        return this.readonlyReplicas;
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
     * @return shardDirect
     */
    public Boolean getShardDirect() {
        return this.shardDirect;
    }

    public static final class Builder extends Request.Builder<CreateNodeRequest, Builder> {
        private String regionId; 
        private String accountName; 
        private String accountPassword; 
        private Boolean autoPay; 
        private String businessInfo; 
        private String clientToken; 
        private String couponNo; 
        private String DBInstanceId; 
        private String nodeClass; 
        private Integer nodeStorage; 
        private String nodeType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer readonlyReplicas; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private Boolean shardDirect; 

        private Builder() {
            super();
        } 

        private Builder(CreateNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.autoPay = request.autoPay;
            this.businessInfo = request.businessInfo;
            this.clientToken = request.clientToken;
            this.couponNo = request.couponNo;
            this.DBInstanceId = request.DBInstanceId;
            this.nodeClass = request.nodeClass;
            this.nodeStorage = request.nodeStorage;
            this.nodeType = request.nodeType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.readonlyReplicas = request.readonlyReplicas;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.shardDirect = request.shardDirect;
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
         * The username of the account. The username must meet the following requirements:
         * <p>
         * 
         * * The username starts with a lowercase letter.
         * * The username contains lowercase letters, digits, and underscores (\_).
         * * The username is 4 to 16 characters in length.
         * 
         * > * Keywords cannot be used as account usernames.
         * > * The permissions of this account are fixed at read-only.
         * > * The username and password are required to be set only when you apply for an endpoint for the shard node for the first time.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The password of the account. The password must meet the following requirements:
         * <p>
         * 
         * * The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and specific special characters.
         * * These special characters include ! @ # $ % ^ & \* ( ) \_ + - =
         * * The password is 8 to 32 characters in length.
         * 
         * >  The account password of the shard node cannot be reset.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * Specifies whether to enable automatic payment. Default value: true. Valid values:
         * <p>
         * 
         * *   **true**: enables automatic payment. Make sure that you have sufficient balance within your account.
         * *   **false**: disables automatic payment. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose **Expenses** > **Orders**. On the **Orders** page, find the order and complete the payment.********
         * 
         * >  This parameter is required when the billing method of the instance is subscription.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The business information. This is an additional parameter.
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
         * The coupon code. Default value: **youhuiquan\_promotion\_option\_id\_for\_blank**.
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * The ID of the sharded cluster instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The specifications of the shard or mongos node. For more information, see [Instance types](~~57141~~).
         */
        public Builder nodeClass(String nodeClass) {
            this.putQueryParameter("NodeClass", nodeClass);
            this.nodeClass = nodeClass;
            return this;
        }

        /**
         * The disk capacity of the node. Unit: GB.
         * <p>
         * 
         * Valid values: **10** to **2000**. The value must be a multiple of 10. Unit: GB.
         * 
         * >  This parameter is required if the NodeType parameter is set to **shard**.
         */
        public Builder nodeStorage(Integer nodeStorage) {
            this.putQueryParameter("NodeStorage", nodeStorage);
            this.nodeStorage = nodeStorage;
            return this;
        }

        /**
         * The type of the node. Valid values:
         * <p>
         * 
         * *   **shard**: shard node
         * *   **mongos**: mongos node
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
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
         * The number of read-only nodes in the shard node.
         * <p>
         * 
         * Valid values: **0** to **5**. The value must be an integer. Default value: **0**.
         * 
         * >  This parameter is available only for ApsaraDB for MongoDB instances that are purchased on the China site (aliyun.com).
         */
        public Builder readonlyReplicas(Integer readonlyReplicas) {
            this.putQueryParameter("ReadonlyReplicas", readonlyReplicas);
            this.readonlyReplicas = readonlyReplicas;
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
         * Specifies whether to apply for an endpoint for the shard node. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: applies for an endpoint for the shard node.
         * *   **false** : does not apply for an endpoint for the shard node.
         */
        public Builder shardDirect(Boolean shardDirect) {
            this.putQueryParameter("ShardDirect", shardDirect);
            this.shardDirect = shardDirect;
            return this;
        }

        @Override
        public CreateNodeRequest build() {
            return new CreateNodeRequest(this);
        } 

    } 

}
