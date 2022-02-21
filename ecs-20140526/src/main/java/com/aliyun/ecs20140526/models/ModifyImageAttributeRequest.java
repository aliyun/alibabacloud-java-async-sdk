// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BootMode")
    private String bootMode;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("Status")
    private String status;

    private ModifyImageAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.licenseType = builder.licenseType;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.regionId = builder.regionId;
        this.bootMode = builder.bootMode;
        this.description = builder.description;
        this.imageFamily = builder.imageFamily;
        this.imageName = builder.imageName;
        this.imageId = builder.imageId;
        this.status = builder.status;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyImageAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String licenseType; 
        private String ownerAccount; 
        private Long resourceOwnerId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String regionId; 
        private String bootMode; 
        private String description; 
        private String imageFamily; 
        private String imageName; 
        private String imageId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageAttributeRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.licenseType = response.licenseType;
            this.ownerAccount = response.ownerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.regionId = response.regionId;
            this.bootMode = response.bootMode;
            this.description = response.description;
            this.imageFamily = response.imageFamily;
            this.imageName = response.imageName;
            this.imageId = response.imageId;
            this.status = response.status;
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
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
         * The region ID of the custom image. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Modify a mirror the start mode of. Valid values:
         * <p>
         * 
         * -BIOS:BIOS startup mode.
         * -UEFI:UEFI boot mode.
         * 
         * > you need to know the specified mirror support the start mode of the, when pass the parameter to modify the startup mode, must be the image itself support the start mode of the match, instance to start normally.
         */
        public Builder bootMode(String bootMode) {
            this.putQueryParameter("BootMode", bootMode);
            this.bootMode = bootMode;
            return this;
        }

        /**
         * Custom image description of the information. Length 2~256 characters. It cannot start with "http:// "or "https.
         * <p>
         * 
         * Default: empty, said keep original description information unchanged.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the Image family. Length 2~128 characters. Must be in capital small letter or Chinese beginning, can"t to "aliyun" or "acs: "Beginning, cannot contain "http:// or "https://". Can contain numbers, half-width period (.), half-width a colon (:), underscore (_), or dash (-).
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
         * Custom mirror name. Length 2~128 characters. Must be in capital small letter or Chinese beginning, can"t to "aliyun" or "acs: "Beginning, cannot contain "http:// or "https://". Can contain numbers, half-width period (.), half-width a colon (:), underscore (_), or dash (-).
         * <p>
         * 
         * Default: empty, said keep original name unchanged.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * Custom image ID.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Mirror state, value range:
         * <p>
         * -Deprecated: The mirror is set for Deprecated state. If you have already shared self-define the mirror, must first cancel sharing can modify for deprecated state. Pair is deprecated state mirroring, can"t sharing and copy the image. But you can use mirror creating instance or replacement system disk.
         * -Available: The mirror is set for Available state. You can deprecated state Image Recovery available.
         * 
         * > If you need to roll back Mirror family in the self-define the mirror a previous version, can be the latest available custom mirror is set for deprecated status, but if the mirror is a mirror family in the only one available self-define the mirror, the deprecated mirror after the Mirror family will no available state self-define the mirror used to create instance, so please prudent.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyImageAttributeRequest build() {
            return new ModifyImageAttributeRequest(this);
        } 

    } 

}
