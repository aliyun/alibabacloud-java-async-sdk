// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeRequest</p>
 */
public class CreateNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeStorage")
    private Integer nodeStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
    @com.aliyun.core.annotation.Validation(maximum = 5)
    private Integer readonlyReplicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardDirect")
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
         * <p>The username of the account. The username must meet the following requirements:</p>
         * <ul>
         * <li>The username starts with a lowercase letter.</li>
         * <li>The username can contain lowercase letters, digits, and underscores (_).</li>
         * <li>The username must be 4 to 16 characters in length.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Keywords cannot be used as accounts.</p>
         * </li>
         * <li><p>This account is granted the read-only permissions.</p>
         * </li>
         * <li><p>The username and password need to be set if you apply for an endpoint for the shard node for the first time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ceshi</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The password of the account. The password must meet the following requirements:</p>
         * <ul>
         * <li>The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>These special characters include ! @ # $ % ^ &amp; * ( ) _ + - =</li>
         * <li>The password is 8 to 32 characters in length.</li>
         * </ul>
         * <blockquote>
         * <p> ApsaraDB for MongoDB does not allow you to reset the password of an account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123+abc</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables automatic payment. Make sure that you have sufficient balance within your account.</li>
         * <li><strong>false</strong>: disables automatic payment. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Expenses</strong> &gt; Orders. On the <strong>Orders</strong> page, find the order that you want to pay for and complete the payment.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required only when the billing method of the instance is subscription.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The business information. This is an additional parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The coupon code. Default value: <strong>youhuiquan_promotion_option_id_for_blank</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>The ID of the sharded cluster instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp11501cd7b5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The instance type of the shard or mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds.shard.mid</p>
         */
        public Builder nodeClass(String nodeClass) {
            this.putQueryParameter("NodeClass", nodeClass);
            this.nodeClass = nodeClass;
            return this;
        }

        /**
         * <p>The disk capacity of the node. Unit: GB.</p>
         * <p>Valid values: <strong>10</strong> to <strong>2000</strong>. The value must be a multiple of 10.</p>
         * <blockquote>
         * <p> This parameter is required only when the NodeType parameter is set to <strong>shard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder nodeStorage(Integer nodeStorage) {
            this.putQueryParameter("NodeStorage", nodeStorage);
            this.nodeStorage = nodeStorage;
            return this;
        }

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li><strong>shard</strong>: shard node</li>
         * <li><strong>mongos</strong>: mongos node</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>shard</p>
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
         * <p>The number of read-only nodes in the shard node.</p>
         * <p>Valid values: <strong>0</strong>, 1, 2, 3, 4, and <strong>5</strong>. Default value: <strong>0</strong>.</p>
         * <blockquote>
         * <p> This parameter is available only for ApsaraDB for MongoDB instances that are purchased on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
         * <p>Specifies whether to apply for an endpoint for the shard node. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: applies for an endpoint for the shard node.</li>
         * <li><strong>false</strong> (default): does not apply for an endpoint for the shard node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
