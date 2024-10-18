// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CopyDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CopyDatabaseRequest</p>
 */
public class CopyDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstDBName")
    private String dstDBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReserveAccount")
    private Integer reserveAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDBName")
    private String srcDBName;

    private CopyDatabaseRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.dstDBName = builder.dstDBName;
        this.ownerId = builder.ownerId;
        this.reserveAccount = builder.reserveAccount;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.srcDBName = builder.srcDBName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return dstDBName
     */
    public String getDstDBName() {
        return this.dstDBName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return reserveAccount
     */
    public Integer getReserveAccount() {
        return this.reserveAccount;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return srcDBName
     */
    public String getSrcDBName() {
        return this.srcDBName;
    }

    public static final class Builder extends Request.Builder<CopyDatabaseRequest, Builder> {
        private String DBInstanceName; 
        private String dstDBName; 
        private Long ownerId; 
        private Integer reserveAccount; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String srcDBName; 

        private Builder() {
            super();
        } 

        private Builder(CopyDatabaseRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.dstDBName = request.dstDBName;
            this.ownerId = request.ownerId;
            this.reserveAccount = request.reserveAccount;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.srcDBName = request.srcDBName;
        } 

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5******</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The destination database name.</p>
         * 
         * <strong>example:</strong>
         * <p>db2***</p>
         */
        public Builder dstDBName(String dstDBName) {
            this.putQueryParameter("DstDBName", dstDBName);
            this.dstDBName = dstDBName;
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
         * <p>The reserved account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reserveAccount(Integer reserveAccount) {
            this.putQueryParameter("ReserveAccount", reserveAccount);
            this.reserveAccount = reserveAccount;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The source database name.</p>
         * 
         * <strong>example:</strong>
         * <p>db1***</p>
         */
        public Builder srcDBName(String srcDBName) {
            this.putQueryParameter("SrcDBName", srcDBName);
            this.srcDBName = srcDBName;
            return this;
        }

        @Override
        public CopyDatabaseRequest build() {
            return new CopyDatabaseRequest(this);
        } 

    } 

}
