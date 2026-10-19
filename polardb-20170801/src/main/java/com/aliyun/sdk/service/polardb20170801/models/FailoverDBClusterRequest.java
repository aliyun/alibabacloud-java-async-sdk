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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must make sure that the value is unique among different requests. The token is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
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
         * <p>The cluster ID.</p>
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
         * <p>Specifies whether to switch back to the original primary zone after a failover. Valid values:</p>
         * <ul>
         * <li>true: Switch back to the original primary zone.</li>
         * <li>false: Do not switch back to the original primary zone.</li>
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
         * <p>The ID of the node that you want to promote to the primary node. If you leave this parameter empty, the system automatically elects a node. You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query node IDs and other information.</p>
         * <blockquote>
         * <ul>
         * <li>Automatic election of the primary node: The system identifies all read-only nodes that are eligible for election. The system selects one or more read-only nodes with the highest priority. If the switchover to the first node fails due to reasons such as network issues or abnormal replication status, the system attempts to switch to the next node until the switchover succeeds.</li>
         * <li>This parameter is required when the cluster is a PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL cluster. This parameter is optional when the cluster is a PolarDB for MySQL cluster.</li>
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
         * <p>Specifies whether the primary/secondary switchover is performed within the primary zone. Valid values:</p>
         * <ul>
         * <li>Primary: The primary/secondary switchover is performed within the primary zone.</li>
         * <li>Standby: The switchover is performed to the hot standby storage cluster.</li>
         * </ul>
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
