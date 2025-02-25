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
 * {@link FailoverDBClusterRequest} extends {@link RequestModel}
 *
 * <p>FailoverDBClusterRequest</p>
 */
public class FailoverDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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
    @com.aliyun.core.annotation.NameInMap("RollBackForDisaster")
    private Boolean rollBackForDisaster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBNodeId")
    private String targetDBNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetZoneType")
    private String targetZoneType;

    private FailoverDBClusterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rollBackForDisaster = builder.rollBackForDisaster;
        this.targetDBNodeId = builder.targetDBNodeId;
        this.targetZoneType = builder.targetZoneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FailoverDBClusterRequest create() {
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
     * @return rollBackForDisaster
     */
    public Boolean getRollBackForDisaster() {
        return this.rollBackForDisaster;
    }

    /**
     * @return targetDBNodeId
     */
    public String getTargetDBNodeId() {
        return this.targetDBNodeId;
    }

    /**
     * @return targetZoneType
     */
    public String getTargetZoneType() {
        return this.targetZoneType;
    }

    public static final class Builder extends Request.Builder<FailoverDBClusterRequest, Builder> {
        private String clientToken; 
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean rollBackForDisaster; 
        private String targetDBNodeId; 
        private String targetZoneType; 

        private Builder() {
            super();
        } 

        private Builder(FailoverDBClusterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rollBackForDisaster = request.rollBackForDisaster;
            this.targetDBNodeId = request.targetDBNodeId;
            this.targetZoneType = request.targetZoneType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
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
         * <p>Specifies whether to switch back services to the original primary zone when the original primary zone recovers.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder rollBackForDisaster(Boolean rollBackForDisaster) {
            this.putQueryParameter("RollBackForDisaster", rollBackForDisaster);
            this.rollBackForDisaster = rollBackForDisaster;
            return this;
        }

        /**
         * <p>The ID of the read-only node that you want to promote to the primary node. You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query node information, such as node IDs.</p>
         * <blockquote>
         * <ul>
         * <li>If you leave this parameter empty, the system selects one or more available read-only nodes that have the highest failover priority as candidate primary nodes. If the failover to the first read-only node fails due to network issues, abnormal replication status, or other reasons, the system attempts to fail over your applications to the next read-only node until the failover is successful.</li>
         * <li>This parameter is required for PolarDB for Oracle and PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-***********</p>
         */
        public Builder targetDBNodeId(String targetDBNodeId) {
            this.putQueryParameter("TargetDBNodeId", targetDBNodeId);
            this.targetDBNodeId = targetDBNodeId;
            return this;
        }

        /**
         * <p>Whether it is a primary-standby switch within the primary availability zone, with the following values:</p>
         * <p>Primary: Primary-standby switch within the primary availability zone.
         * Standby: Switch to the storage hot backup cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        public Builder targetZoneType(String targetZoneType) {
            this.putQueryParameter("TargetZoneType", targetZoneType);
            this.targetZoneType = targetZoneType;
            return this;
        }

        @Override
        public FailoverDBClusterRequest build() {
            return new FailoverDBClusterRequest(this);
        } 

    } 

}
