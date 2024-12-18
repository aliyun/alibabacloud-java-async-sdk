// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDBInstanceNetInfoForChannelRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceNetInfoForChannelRequest</p>
 */
public class DescribeDBInstanceNetInfoForChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceNetRWSplitType")
    private String DBInstanceNetRWSplitType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Flag")
    private String flag;

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

    private DescribeDBInstanceNetInfoForChannelRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceNetRWSplitType = builder.DBInstanceNetRWSplitType;
        this.flag = builder.flag;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceNetInfoForChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceNetRWSplitType
     */
    public String getDBInstanceNetRWSplitType() {
        return this.DBInstanceNetRWSplitType;
    }

    /**
     * @return flag
     */
    public String getFlag() {
        return this.flag;
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

    public static final class Builder extends Request.Builder<DescribeDBInstanceNetInfoForChannelRequest, Builder> {
        private String clientToken; 
        private String DBInstanceId; 
        private String DBInstanceNetRWSplitType; 
        private String flag; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceNetInfoForChannelRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceNetRWSplitType = request.DBInstanceNetRWSplitType;
            this.flag = request.flag;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/26232.html">DescribeDBInstances</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1k8s41l2o52****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The type of the endpoint to query. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: a regular endpoint. This is the default value.</li>
         * <li><strong>1</strong>: a read/write splitting endpoint that is assigned after the shared proxy feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder DBInstanceNetRWSplitType(String DBInstanceNetRWSplitType) {
            this.putQueryParameter("DBInstanceNetRWSplitType", DBInstanceNetRWSplitType);
            this.DBInstanceNetRWSplitType = DBInstanceNetRWSplitType;
            return this;
        }

        /**
         * <p>An internal parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder flag(String flag) {
            this.putQueryParameter("Flag", flag);
            this.flag = flag;
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

        @Override
        public DescribeDBInstanceNetInfoForChannelRequest build() {
            return new DescribeDBInstanceNetInfoForChannelRequest(this);
        } 

    } 

}
