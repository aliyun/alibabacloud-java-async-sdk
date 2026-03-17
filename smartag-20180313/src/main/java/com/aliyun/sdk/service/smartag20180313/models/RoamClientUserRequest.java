// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link RoamClientUserRequest} extends {@link RequestModel}
 *
 * <p>RoamClientUserRequest</p>
 */
public class RoamClientUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginSmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originSmartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetSmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetSmartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private RoamClientUserRequest(Builder builder) {
        super(builder);
        this.originRegionId = builder.originRegionId;
        this.originSmartAGId = builder.originSmartAGId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetSmartAGId = builder.targetSmartAGId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoamClientUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return originRegionId
     */
    public String getOriginRegionId() {
        return this.originRegionId;
    }

    /**
     * @return originSmartAGId
     */
    public String getOriginSmartAGId() {
        return this.originSmartAGId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return targetSmartAGId
     */
    public String getTargetSmartAGId() {
        return this.targetSmartAGId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<RoamClientUserRequest, Builder> {
        private String originRegionId; 
        private String originSmartAGId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetSmartAGId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(RoamClientUserRequest request) {
            super(request);
            this.originRegionId = request.originRegionId;
            this.originSmartAGId = request.originSmartAGId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetSmartAGId = request.targetSmartAGId;
            this.userName = request.userName;
        } 

        /**
         * <p>The region ID of the SAG app instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder originRegionId(String originRegionId) {
            this.putQueryParameter("OriginRegionId", originRegionId);
            this.originRegionId = originRegionId;
            return this;
        }

        /**
         * <p>The ID of the source SAG app instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-m9uhqekwnqcnyy****</p>
         */
        public Builder originSmartAGId(String originSmartAGId) {
            this.putQueryParameter("OriginSmartAGId", originSmartAGId);
            this.originSmartAGId = originSmartAGId;
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
         * <p>The region ID of the SAG app instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>The ID of the destination SAG app instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-ghwa10ko6ndwug****</p>
         */
        public Builder targetSmartAGId(String targetSmartAGId) {
            this.putQueryParameter("TargetSmartAGId", targetSmartAGId);
            this.targetSmartAGId = targetSmartAGId;
            return this;
        }

        /**
         * <p>The usernames of the client for which you want to enable roaming.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public RoamClientUserRequest build() {
            return new RoamClientUserRequest(this);
        } 

    } 

}
