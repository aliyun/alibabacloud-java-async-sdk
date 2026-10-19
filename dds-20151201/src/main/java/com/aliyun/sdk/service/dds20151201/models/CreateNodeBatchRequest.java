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
 * {@link CreateNodeBatchRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeBatchRequest</p>
 */
public class CreateNodeBatchRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FromApp")
    private String fromApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodesInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodesInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardDirect")
    private Boolean shardDirect;

    private CreateNodeBatchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.autoPay = builder.autoPay;
        this.businessInfo = builder.businessInfo;
        this.clientToken = builder.clientToken;
        this.couponNo = builder.couponNo;
        this.DBInstanceId = builder.DBInstanceId;
        this.fromApp = builder.fromApp;
        this.nodesInfo = builder.nodesInfo;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.shardDirect = builder.shardDirect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeBatchRequest create() {
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
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return nodesInfo
     */
    public String getNodesInfo() {
        return this.nodesInfo;
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
     * @return shardDirect
     */
    public Boolean getShardDirect() {
        return this.shardDirect;
    }

    public static final class Builder extends Request.Builder<CreateNodeBatchRequest, Builder> {
        private String regionId; 
        private String accountName; 
        private String accountPassword; 
        private Boolean autoPay; 
        private String businessInfo; 
        private String clientToken; 
        private String couponNo; 
        private String DBInstanceId; 
        private String fromApp; 
        private String nodesInfo; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean shardDirect; 

        private Builder() {
            super();
        } 

        private Builder(CreateNodeBatchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.autoPay = request.autoPay;
            this.businessInfo = request.businessInfo;
            this.clientToken = request.clientToken;
            this.couponNo = request.couponNo;
            this.DBInstanceId = request.DBInstanceId;
            this.fromApp = request.fromApp;
            this.nodesInfo = request.nodesInfo;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
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
         * <p>The name of the account. Valid values:</p>
         * <ul>
         * <li>The name must start with a lowercase letter.</li>
         * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
         * <li>The name must be 4 to 16 characters in length.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>ApsaraDB for MongoDB does not support using keywords as account names.</li>
         * <li>The permissions of the account are fixed to read-only.</li>
         * <li>When you apply for a direct connection endpoint for a shard node for the first time, you must set the account name and password. You do not need to set them again for subsequent applications.</li>
         * </ul>
         * </blockquote>
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
         * <p>The password of the account. Valid values:</p>
         * <ul>
         * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>Special characters include !@#$%^&amp;*()_+-=.</li>
         * <li>The password must be 8 to 32 characters in length.</li>
         * </ul>
         * <blockquote>
         * <p>ApsaraDB for MongoDB does not support resetting the password of the account for a shard node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PassWord123</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: (Default) Automatic payment is enabled. Make sure that your account has sufficient balance.</li>
         * <li><strong>false</strong>: Manual payment is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/85052.html">Manually renew a subscription instance</a>.</li>
         * </ul>
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
         * <p>The business information.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. The value cannot contain non-ASCII characters.</p>
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
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li><strong>default</strong> or <strong>null</strong>: (Default) A coupon is used.</li>
         * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: No coupon is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp18b0934e70****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The source of the request. Valid values:</p>
         * <ul>
         * <li><strong>OpenApi</strong>: OpenAPI.</li>
         * <li><strong>mongo_buy</strong>: The console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenApi</p>
         */
        public Builder fromApp(String fromApp) {
            this.putQueryParameter("FromApp", fromApp);
            this.fromApp = fromApp;
            return this;
        }

        /**
         * <p>The specifications of the Mongos or shard nodes to be added. For more information about the specifications, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance specifications</a>.</p>
         * <blockquote>
         * <p>By default, a sharded cluster instance supports up to 32 Mongos nodes and 32 shard nodes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Shards&quot;:[{&quot;DBInstanceClass&quot;:&quot;mdb.shard.4x.large.d&quot;,&quot;Storage&quot;:20}]}</p>
         */
        public Builder nodesInfo(String nodesInfo) {
            this.putQueryParameter("NodesInfo", nodesInfo);
            this.nodesInfo = nodesInfo;
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
         * <p>Specifies whether to apply for a direct connection endpoint for the shard node. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Applies for a direct connection endpoint for the shard node.</li>
         * <li><strong>false</strong>: (Default) Does not apply for a direct connection endpoint for the shard node.</li>
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
        public CreateNodeBatchRequest build() {
            return new CreateNodeBatchRequest(this);
        } 

    } 

}
