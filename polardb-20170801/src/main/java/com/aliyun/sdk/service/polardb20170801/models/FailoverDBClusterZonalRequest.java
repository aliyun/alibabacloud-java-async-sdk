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
 * {@link FailoverDBClusterZonalRequest} extends {@link RequestModel}
 *
 * <p>FailoverDBClusterZonalRequest</p>
 */
public class FailoverDBClusterZonalRequest extends Request {
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

    private FailoverDBClusterZonalRequest(Builder builder) {
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

    public static FailoverDBClusterZonalRequest create() {
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

    public static final class Builder extends Request.Builder<FailoverDBClusterZonalRequest, Builder> {
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

        private Builder(FailoverDBClusterZonalRequest request) {
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
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
         * RollBackForDisaster.
         */
        public Builder rollBackForDisaster(Boolean rollBackForDisaster) {
            this.putQueryParameter("RollBackForDisaster", rollBackForDisaster);
            this.rollBackForDisaster = rollBackForDisaster;
            return this;
        }

        /**
         * TargetDBNodeId.
         */
        public Builder targetDBNodeId(String targetDBNodeId) {
            this.putQueryParameter("TargetDBNodeId", targetDBNodeId);
            this.targetDBNodeId = targetDBNodeId;
            return this;
        }

        /**
         * TargetZoneType.
         */
        public Builder targetZoneType(String targetZoneType) {
            this.putQueryParameter("TargetZoneType", targetZoneType);
            this.targetZoneType = targetZoneType;
            return this;
        }

        @Override
        public FailoverDBClusterZonalRequest build() {
            return new FailoverDBClusterZonalRequest(this);
        } 

    } 

}
