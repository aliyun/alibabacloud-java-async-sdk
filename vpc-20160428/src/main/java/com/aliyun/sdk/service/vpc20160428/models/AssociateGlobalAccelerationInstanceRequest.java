// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateGlobalAccelerationInstanceRequest} extends {@link RequestModel}
 *
 * <p>AssociateGlobalAccelerationInstanceRequest</p>
 */
public class AssociateGlobalAccelerationInstanceRequest extends Request {
    @Query
    @NameInMap("BackendServerId")
    @Validation(required = true)
    private String backendServerId;

    @Query
    @NameInMap("BackendServerRegionId")
    @Validation(required = true)
    private String backendServerRegionId;

    @Query
    @NameInMap("BackendServerType")
    private String backendServerType;

    @Query
    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    private String globalAccelerationInstanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AssociateGlobalAccelerationInstanceRequest(Builder builder) {
        super(builder);
        this.backendServerId = builder.backendServerId;
        this.backendServerRegionId = builder.backendServerRegionId;
        this.backendServerType = builder.backendServerType;
        this.globalAccelerationInstanceId = builder.globalAccelerationInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateGlobalAccelerationInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendServerId
     */
    public String getBackendServerId() {
        return this.backendServerId;
    }

    /**
     * @return backendServerRegionId
     */
    public String getBackendServerRegionId() {
        return this.backendServerRegionId;
    }

    /**
     * @return backendServerType
     */
    public String getBackendServerType() {
        return this.backendServerType;
    }

    /**
     * @return globalAccelerationInstanceId
     */
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
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

    public static final class Builder extends Request.Builder<AssociateGlobalAccelerationInstanceRequest, Builder> {
        private String backendServerId; 
        private String backendServerRegionId; 
        private String backendServerType; 
        private String globalAccelerationInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateGlobalAccelerationInstanceRequest request) {
            super(request);
            this.backendServerId = request.backendServerId;
            this.backendServerRegionId = request.backendServerRegionId;
            this.backendServerType = request.backendServerType;
            this.globalAccelerationInstanceId = request.globalAccelerationInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ID of the backend server.
         */
        public Builder backendServerId(String backendServerId) {
            this.putQueryParameter("BackendServerId", backendServerId);
            this.backendServerId = backendServerId;
            return this;
        }

        /**
         * The region of the backend server. The region must belong to the service area of the GA instance.
         */
        public Builder backendServerRegionId(String backendServerRegionId) {
            this.putQueryParameter("BackendServerRegionId", backendServerRegionId);
            this.backendServerRegionId = backendServerRegionId;
            return this;
        }

        /**
         * The backend server type. Valid values:
         * <p>
         * 
         * *   **EcsInstance** (default): ECS instance
         * *   **SlbInstance**: SLB instance
         */
        public Builder backendServerType(String backendServerType) {
            this.putQueryParameter("BackendServerType", backendServerType);
            this.backendServerType = backendServerType;
            return this;
        }

        /**
         * The ID of the GA instance.
         */
        public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.putQueryParameter("GlobalAccelerationInstanceId", globalAccelerationInstanceId);
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
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
         * The region ID of the GA instance. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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

        @Override
        public AssociateGlobalAccelerationInstanceRequest build() {
            return new AssociateGlobalAccelerationInstanceRequest(this);
        } 

    } 

}
