// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageShareGroupPermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageShareGroupPermissionRequest</p>
 */
public class ModifyImageShareGroupPermissionRequest extends Request {
    @NameInMap("AddGroup")
    private java.util.List < String > addGroup;

    @NameInMap("RemoveGroup")
    private java.util.List < String > removeGroup;

    @Query
    @NameInMap("ImageId")
    private String imageId;

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

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    private ModifyImageShareGroupPermissionRequest(Builder builder) {
        super(builder);
        this.addGroup = builder.addGroup;
        this.removeGroup = builder.removeGroup;
        this.imageId = builder.imageId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceRegionId = builder.sourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageShareGroupPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addGroup
     */
    public java.util.List < String > getAddGroup() {
        return this.addGroup;
    }

    /**
     * @return removeGroup
     */
    public java.util.List < String > getRemoveGroup() {
        return this.removeGroup;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<ModifyImageShareGroupPermissionRequest, Builder> {
        private java.util.List < String > addGroup; 
        private java.util.List < String > removeGroup; 
        private String imageId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageShareGroupPermissionRequest response) {
            super(response);
            this.addGroup = response.addGroup;
            this.removeGroup = response.removeGroup;
            this.imageId = response.imageId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceRegionId = response.sourceRegionId;
        } 

        /**
         * AddGroup.
         */
        public Builder addGroup(java.util.List < String > addGroup) {
            this.addGroup = addGroup;
            return this;
        }

        /**
         * RemoveGroup.
         */
        public Builder removeGroup(java.util.List < String > removeGroup) {
            this.removeGroup = removeGroup;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public ModifyImageShareGroupPermissionRequest build() {
            return new ModifyImageShareGroupPermissionRequest(this);
        } 

    } 

}
