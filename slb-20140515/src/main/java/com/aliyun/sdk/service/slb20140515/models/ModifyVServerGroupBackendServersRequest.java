// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVServerGroupBackendServersRequest} extends {@link RequestModel}
 *
 * <p>ModifyVServerGroupBackendServersRequest</p>
 */
public class ModifyVServerGroupBackendServersRequest extends Request {
    @Query
    @NameInMap("NewBackendServers")
    private String newBackendServers;

    @Query
    @NameInMap("OldBackendServers")
    private String oldBackendServers;

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

    @Query
    @NameInMap("VServerGroupId")
    @Validation(required = true)
    private String VServerGroupId;

    private ModifyVServerGroupBackendServersRequest(Builder builder) {
        super(builder);
        this.newBackendServers = builder.newBackendServers;
        this.oldBackendServers = builder.oldBackendServers;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.VServerGroupId = builder.VServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVServerGroupBackendServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newBackendServers
     */
    public String getNewBackendServers() {
        return this.newBackendServers;
    }

    /**
     * @return oldBackendServers
     */
    public String getOldBackendServers() {
        return this.oldBackendServers;
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
     * @return VServerGroupId
     */
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyVServerGroupBackendServersRequest, Builder> {
        private String newBackendServers; 
        private String oldBackendServers; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String VServerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVServerGroupBackendServersRequest response) {
            super(response);
            this.newBackendServers = response.newBackendServers;
            this.oldBackendServers = response.oldBackendServers;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.VServerGroupId = response.VServerGroupId;
        } 

        /**
         * NewBackendServers.
         */
        public Builder newBackendServers(String newBackendServers) {
            this.putQueryParameter("NewBackendServers", newBackendServers);
            this.newBackendServers = newBackendServers;
            return this;
        }

        /**
         * OldBackendServers.
         */
        public Builder oldBackendServers(String oldBackendServers) {
            this.putQueryParameter("OldBackendServers", oldBackendServers);
            this.oldBackendServers = oldBackendServers;
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
         * RegionId.
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
         * VServerGroupId.
         */
        public Builder VServerGroupId(String VServerGroupId) {
            this.putQueryParameter("VServerGroupId", VServerGroupId);
            this.VServerGroupId = VServerGroupId;
            return this;
        }

        @Override
        public ModifyVServerGroupBackendServersRequest build() {
            return new ModifyVServerGroupBackendServersRequest(this);
        } 

    } 

}
