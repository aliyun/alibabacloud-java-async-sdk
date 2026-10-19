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
 * {@link ModifyDBInstanceConnectionStringRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceConnectionStringRequest</p>
 */
public class ModifyDBInstanceConnectionStringRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentConnectionString")
    private String currentConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceModifySuffix")
    private Boolean forceModifySuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewConnectionString")
    private String newConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPort")
    private Integer newPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortModifyOnly")
    private Boolean portModifyOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBInstanceConnectionStringRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.currentConnectionString = builder.currentConnectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.forceModifySuffix = builder.forceModifySuffix;
        this.networkType = builder.networkType;
        this.newConnectionString = builder.newConnectionString;
        this.newPort = builder.newPort;
        this.nodeId = builder.nodeId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portModifyOnly = builder.portModifyOnly;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return forceModifySuffix
     */
    public Boolean getForceModifySuffix() {
        return this.forceModifySuffix;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return portModifyOnly
     */
    public Boolean getPortModifyOnly() {
        return this.portModifyOnly;
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

    public static final class Builder extends Request.Builder<ModifyDBInstanceConnectionStringRequest, Builder> {
        private String regionId; 
        private String currentConnectionString; 
        private String DBInstanceId; 
        private Boolean forceModifySuffix; 
        private String networkType; 
        private String newConnectionString; 
        private Integer newPort; 
        private String nodeId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean portModifyOnly; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceConnectionStringRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.currentConnectionString = request.currentConnectionString;
            this.DBInstanceId = request.DBInstanceId;
            this.forceModifySuffix = request.forceModifySuffix;
            this.networkType = request.networkType;
            this.newConnectionString = request.newConnectionString;
            this.newPort = request.newPort;
            this.nodeId = request.nodeId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portModifyOnly = request.portModifyOnly;
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
         * <p>The current endpoint, which is the endpoint to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
         */
        public Builder currentConnectionString(String currentConnectionString) {
            this.putQueryParameter("CurrentConnectionString", currentConnectionString);
            this.currentConnectionString = currentConnectionString;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>If you specify the ID of a sharded cluster instance, you must also specify the <strong>NodeId</strong> parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ForceModifySuffix.
         */
        public Builder forceModifySuffix(Boolean forceModifySuffix) {
            this.putQueryParameter("ForceModifySuffix", forceModifySuffix);
            this.forceModifySuffix = forceModifySuffix;
            return this;
        }

        /**
         * <p>The network type of the connection string when only the port number is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The new endpoint. The endpoint must meet the following requirements:</p>
         * <ul>
         * <li>It must start with a lowercase letter.</li>
         * <li>It must end with a lowercase letter or a digit.</li>
         * <li>It can contain only lowercase letters, digits, and hyphens (-).</li>
         * <li>It must be 8 to 63 characters in length.</li>
         * </ul>
         * <blockquote>
         * <p>Specify only the prefix of the endpoint. The remaining part cannot be modified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyuntest111</p>
         */
        public Builder newConnectionString(String newConnectionString) {
            this.putQueryParameter("NewConnectionString", newConnectionString);
            this.newConnectionString = newConnectionString;
            return this;
        }

        /**
         * <p>The new port. Valid values: 1000 to 65535.</p>
         * <blockquote>
         * <p>This parameter is active only when the <strong>DBInstanceId</strong> parameter is set to a cloud disk instance ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3310</p>
         */
        public Builder newPort(Integer newPort) {
            this.putQueryParameter("NewPort", newPort);
            this.newPort = newPort;
            return this;
        }

        /**
         * <p>Instance ID of the Mongos node in the sharded cluster instance. You can specify only one Mongos node ID in each call.</p>
         * <blockquote>
         * <p>This parameter is valid only when the <strong>DBInstanceId</strong> parameter is set to instance ID of a sharded cluster instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s-bpxxxxxxxx</p>
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
         * <p>Specifies whether to modify only port numbers. If you modify only port numbers, batch modification is supported.</p>
         */
        public Builder portModifyOnly(Boolean portModifyOnly) {
            this.putQueryParameter("PortModifyOnly", portModifyOnly);
            this.portModifyOnly = portModifyOnly;
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
        public ModifyDBInstanceConnectionStringRequest build() {
            return new ModifyDBInstanceConnectionStringRequest(this);
        } 

    } 

}
