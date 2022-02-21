// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVRouterAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVRouterAttributeRequest</p>
 */
public class ModifyVRouterAttributeRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VRouterId")
    private String VRouterId;

    @Query
    @NameInMap("VRouterName")
    private String VRouterName;

    private ModifyVRouterAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.VRouterId = builder.VRouterId;
        this.VRouterName = builder.VRouterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVRouterAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return VRouterId
     */
    public String getVRouterId() {
        return this.VRouterId;
    }

    /**
     * @return VRouterName
     */
    public String getVRouterName() {
        return this.VRouterName;
    }

    public static final class Builder extends Request.Builder<ModifyVRouterAttributeRequest, Builder> {
        private String description; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String VRouterId; 
        private String VRouterName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVRouterAttributeRequest response) {
            super(response);
            this.description = response.description;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.VRouterId = response.VRouterId;
            this.VRouterName = response.VRouterName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * VRouterId.
         */
        public Builder VRouterId(String VRouterId) {
            this.putQueryParameter("VRouterId", VRouterId);
            this.VRouterId = VRouterId;
            return this;
        }

        /**
         * VRouterName.
         */
        public Builder VRouterName(String VRouterName) {
            this.putQueryParameter("VRouterName", VRouterName);
            this.VRouterName = VRouterName;
            return this;
        }

        @Override
        public ModifyVRouterAttributeRequest build() {
            return new ModifyVRouterAttributeRequest(this);
        } 

    } 

}
