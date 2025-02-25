// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterMigrationRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterMigrationRequest</p>
 */
public class ModifyDBClusterMigrationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStrings")
    private String connectionStrings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewMasterInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newMasterInstanceId;

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
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRDSDBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceRDSDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwapConnectionString")
    private String swapConnectionString;

    private ModifyDBClusterMigrationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connectionStrings = builder.connectionStrings;
        this.DBClusterId = builder.DBClusterId;
        this.newMasterInstanceId = builder.newMasterInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.sourceRDSDBInstanceId = builder.sourceRDSDBInstanceId;
        this.swapConnectionString = builder.swapConnectionString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterMigrationRequest create() {
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
     * @return connectionStrings
     */
    public String getConnectionStrings() {
        return this.connectionStrings;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return newMasterInstanceId
     */
    public String getNewMasterInstanceId() {
        return this.newMasterInstanceId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sourceRDSDBInstanceId
     */
    public String getSourceRDSDBInstanceId() {
        return this.sourceRDSDBInstanceId;
    }

    /**
     * @return swapConnectionString
     */
    public String getSwapConnectionString() {
        return this.swapConnectionString;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterMigrationRequest, Builder> {
        private String regionId; 
        private String connectionStrings; 
        private String DBClusterId; 
        private String newMasterInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String sourceRDSDBInstanceId; 
        private String swapConnectionString; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterMigrationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connectionStrings = request.connectionStrings;
            this.DBClusterId = request.DBClusterId;
            this.newMasterInstanceId = request.newMasterInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.sourceRDSDBInstanceId = request.sourceRDSDBInstanceId;
            this.swapConnectionString = request.swapConnectionString;
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
         * <p>The endpoints to be switched. The endpoints are in the JSON format.</p>
         * <blockquote>
         * <p>This parameter is valid when the SwapConnectionString parameter is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rm-2ze73el581cs*****.mysql.pre.rds.aliyuncs.com&quot;:&quot;pc-2ze8200s298e*****.mysql.polardb.pre.rds.aliyuncs.com&quot;,&quot;rm-2ze73el581cs86*****.mysql.pre.rds.aliyuncs.com&quot;:&quot;test-p*****.mysql.polardb.pre.rds.aliyuncs.com&quot;}</p>
         */
        public Builder connectionStrings(String connectionStrings) {
            this.putQueryParameter("ConnectionStrings", connectionStrings);
            this.connectionStrings = connectionStrings;
            return this;
        }

        /**
         * <p>The ID of cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the new instance or new cluster. Valid values:</p>
         * <ul>
         * <li>To perform a data migration, enter the ID of the PolarDB cluster.</li>
         * <li>To perform a migration rollback, enter the ID of the ApsaraDB for RDS instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder newMasterInstanceId(String newMasterInstanceId) {
            this.putQueryParameter("NewMasterInstanceId", newMasterInstanceId);
            this.newMasterInstanceId = newMasterInstanceId;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The ID of the source ApsaraDB RDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-************</p>
         */
        public Builder sourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
            this.putQueryParameter("SourceRDSDBInstanceId", sourceRDSDBInstanceId);
            this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to switch the endpoints. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: switches the endpoints. If you select this option, you do not need the change the endpoint in your applications.</li>
         * <li><strong>false</strong>: does not switch the endpoints. If you select this option, you must specify the endpoint of the PolarDB cluster in your applications.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder swapConnectionString(String swapConnectionString) {
            this.putQueryParameter("SwapConnectionString", swapConnectionString);
            this.swapConnectionString = swapConnectionString;
            return this;
        }

        @Override
        public ModifyDBClusterMigrationRequest build() {
            return new ModifyDBClusterMigrationRequest(this);
        } 

    } 

}
