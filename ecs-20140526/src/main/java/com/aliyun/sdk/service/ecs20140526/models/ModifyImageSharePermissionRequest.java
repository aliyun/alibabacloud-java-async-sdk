// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageSharePermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageSharePermissionRequest</p>
 */
public class ModifyImageSharePermissionRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("LaunchPermission")
    private String launchPermission;

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
    @NameInMap("AddAccount")
    private java.util.List < String > addAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("RemoveAccount")
    private java.util.List < String > removeAccount;

    private ModifyImageSharePermissionRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.launchPermission = builder.launchPermission;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.addAccount = builder.addAccount;
        this.regionId = builder.regionId;
        this.imageId = builder.imageId;
        this.removeAccount = builder.removeAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageSharePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return launchPermission
     */
    public String getLaunchPermission() {
        return this.launchPermission;
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
     * @return addAccount
     */
    public java.util.List < String > getAddAccount() {
        return this.addAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return removeAccount
     */
    public java.util.List < String > getRemoveAccount() {
        return this.removeAccount;
    }

    public static final class Builder extends Request.Builder<ModifyImageSharePermissionRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String launchPermission; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > addAccount; 
        private String regionId; 
        private String imageId; 
        private java.util.List < String > removeAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageSharePermissionRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.launchPermission = request.launchPermission;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.addAccount = request.addAccount;
            this.regionId = request.regionId;
            this.imageId = request.imageId;
            this.removeAccount = request.removeAccount;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * LaunchPermission.
         */
        public Builder launchPermission(String launchPermission) {
            this.putQueryParameter("LaunchPermission", launchPermission);
            this.launchPermission = launchPermission;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that is authorized to share images. Valid values of N: 1 to 10. If the value exceeds 10, the system ignores this parameter.
         */
        public Builder addAccount(java.util.List < String > addAccount) {
            this.putQueryParameter("AddAccount", addAccount);
            this.addAccount = addAccount;
            return this;
        }

        /**
         * The ID of the region to which the custom image belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the shared custom image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The ID of the alibaba cloud account that deletes image sharing. Valid values of N: 1 to 10. If the value exceeds 10, the system ignores this parameter.
         */
        public Builder removeAccount(java.util.List < String > removeAccount) {
            this.putQueryParameter("RemoveAccount", removeAccount);
            this.removeAccount = removeAccount;
            return this;
        }

        @Override
        public ModifyImageSharePermissionRequest build() {
            return new ModifyImageSharePermissionRequest(this);
        } 

    } 

}
