// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageAttributeRequest</p>
 */
public class ModifyImageAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("LicenseType")
    private String licenseType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("BootMode")
    private String bootMode;

    @Query
    @NameInMap("Description")
    private String description;

    private ModifyImageAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.licenseType = builder.licenseType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.status = builder.status;
        this.imageFamily = builder.imageFamily;
        this.bootMode = builder.bootMode;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageAttributeRequest create() {
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
     * @return licenseType
     */
    public String getLicenseType() {
        return this.licenseType;
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
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return bootMode
     */
    public String getBootMode() {
        return this.bootMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<ModifyImageAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String licenseType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String imageId; 
        private String imageName; 
        private String status; 
        private String imageFamily; 
        private String bootMode; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.licenseType = request.licenseType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.status = request.status;
            this.imageFamily = request.imageFamily;
            this.bootMode = request.bootMode;
            this.description = request.description;
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
         * LicenseType.
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
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
         * The region ID of the custom image. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the custom image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The name of the custom image. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "aliyun" or "acs:". It cannot contain "http://" or "https://". It can contain numbers, periods (.), colons (:), underscores (_), and hyphens (-).
         * <p>
         * 
         * Default value: null, indicating that the original name remains unchanged.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The status of the image. Valid values:
         * <p>
         * -Deprecated: sets the image to Deprecated. If you have already shared a custom image, you must cancel the sharing before changing it to the deprecated state. Images in the deprecated state cannot be shared or copied. However, you can use an image to create an instance or replace the system disk.
         * -Available: set the image to Available. You can restore a deprecated image.
         * 
         * > If you want to roll back the previous version of the custom image in the Image family, you can set the latest available custom image to the deprecated state. However, if the image is the only available custom image in the Image family, the deprecated custom image in the Image family will be used to create instances. Therefore, proceed with caution.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The name of the Image family. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "aliyun" or "acs:". It cannot contain "http://" or "https://". It can contain numbers, periods (.), colons (:), underscores (_), and hyphens (-).
         * <p>
         * 
         * Default value: Null.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * Modify the startup mode of an image. Valid values:
         * <p>
         * 
         * -BIOS:BIOS startup mode.
         * -UEFI:UEFI startup mode.
         * 
         * > you need to know the startup mode supported by the specified image. After you use this parameter to modify the startup mode, the instance must match the startup mode supported by the image to start normally.
         */
        public Builder bootMode(String bootMode) {
            this.putQueryParameter("BootMode", bootMode);
            this.bootMode = bootMode;
            return this;
        }

        /**
         * The description of the custom image. The description must be 2 to 256 characters in length. It cannot start with "http:// "or "https.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public ModifyImageAttributeRequest build() {
            return new ModifyImageAttributeRequest(this);
        } 

    } 

}
