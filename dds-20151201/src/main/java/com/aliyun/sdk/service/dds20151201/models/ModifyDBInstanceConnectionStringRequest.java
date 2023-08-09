// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceConnectionStringRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceConnectionStringRequest</p>
 */
public class ModifyDBInstanceConnectionStringRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CurrentConnectionString")
    @Validation(required = true)
    private String currentConnectionString;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("NewConnectionString")
    @Validation(required = true)
    private String newConnectionString;

    @Query
    @NameInMap("NewPort")
    private Integer newPort;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyDBInstanceConnectionStringRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.currentConnectionString = builder.currentConnectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.newConnectionString = builder.newConnectionString;
        this.newPort = builder.newPort;
        this.nodeId = builder.nodeId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceConnectionStringRequest create() {
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
     * @return currentConnectionString
     */
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return newConnectionString
     */
    public String getNewConnectionString() {
        return this.newConnectionString;
    }

    /**
     * @return newPort
     */
    public Integer getNewPort() {
        return this.newPort;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
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

    public static final class Builder extends Request.Builder<ModifyDBInstanceConnectionStringRequest, Builder> {
        private String regionId; 
        private String currentConnectionString; 
        private String DBInstanceId; 
        private String newConnectionString; 
        private Integer newPort; 
        private String nodeId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceConnectionStringRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.currentConnectionString = request.currentConnectionString;
            this.DBInstanceId = request.DBInstanceId;
            this.newConnectionString = request.newConnectionString;
            this.newPort = request.newPort;
            this.nodeId = request.nodeId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
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
         * The current connection string, which is to be modified.
         */
        public Builder currentConnectionString(String currentConnectionString) {
            this.putQueryParameter("CurrentConnectionString", currentConnectionString);
            this.currentConnectionString = currentConnectionString;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * >  If you set this parameter to the ID of a sharded cluster instance, you must also specify the **NodeId** parameter.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The new connection string. It must be 8 to 64 characters in length and can contain letters and digits. It must start with a lowercase letter.
         * <p>
         * 
         * >  You need only to specify the prefix of the connection string. The content other than the prefix cannot be modified.
         */
        public Builder newConnectionString(String newConnectionString) {
            this.putQueryParameter("NewConnectionString", newConnectionString);
            this.newConnectionString = newConnectionString;
            return this;
        }

        /**
         * this parameter can be used. The new port should be within the range of 1000 to 65535.
         * <p>
         * >When the DBInstanceId parameter is passed in as a cloud disk instance ID
         */
        public Builder newPort(Integer newPort) {
            this.putQueryParameter("NewPort", newPort);
            this.newPort = newPort;
            return this;
        }

        /**
         * The ID of the mongos in the specified sharded cluster instance. Only one mongos ID can be specified in each call.
         * <p>
         * 
         * >  This parameter is valid only if you set the **DBInstanceId** parameter to the ID of a sharded cluster instance.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
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

        @Override
        public ModifyDBInstanceConnectionStringRequest build() {
            return new ModifyDBInstanceConnectionStringRequest(this);
        } 

    } 

}
