// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageAttributeRequest</p>
 */
public class ModifyImageAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BootMode")
    private String bootMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Features")
    private Features features;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFamily")
    private String imageFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseType")
    private String licenseType;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ModifyImageAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.bootMode = builder.bootMode;
        this.description = builder.description;
        this.features = builder.features;
        this.imageFamily = builder.imageFamily;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.licenseType = builder.licenseType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return features
     */
    public Features getFeatures() {
        return this.features;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyImageAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String bootMode; 
        private String description; 
        private Features features; 
        private String imageFamily; 
        private String imageId; 
        private String imageName; 
        private String licenseType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.bootMode = request.bootMode;
            this.description = request.description;
            this.features = request.features;
            this.imageFamily = request.imageFamily;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.licenseType = request.licenseType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
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
         * The new boot mode of the image. Valid values:
         * <p>
         * 
         * *   BIOS: Basic Input/Output System (BIOS)
         * *   UEFI: Unified Extensible Firmware Interface (UEFI)
         * *   UEFI-Preferred: BIOS and UEFI
         * 
         * >  Before you change the boot mode, we recommend that you obtain the boot modes supported by the image. If you specify an unsupported boot mode for the image, ECS instances that use the image cannot start as expected. If you do not know which boot modes are supported by the image, we recommend that you use the image check feature to perform a check. For information about the image check feature, see [Overview](~~439819~~).
         * 
         * >  For information about the UEFI-Preferred boot mode, see [Best practices for ECS instance boot modes](~~2244655~~).
         */
        public Builder bootMode(String bootMode) {
            this.putQueryParameter("BootMode", bootMode);
            this.bootMode = bootMode;
            return this;
        }

        /**
         * The new description of the custom image. The description must be 2 to 256 characters in length It cannot start with [http:// or https://.](http://https://。)
         * <p>
         * 
         * This parameter is empty by default, which specifies that the original description is retained.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The attributes of the custom image.
         */
        public Builder features(Features features) {
            this.putQueryParameter("Features", features);
            this.features = features;
            return this;
        }

        /**
         * The name of the image family. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with acs: or aliyun. [It cannot contain http:// or https://. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).](http://https://。、（.）、（:）、（\_）（-）。)
         * <p>
         * 
         * By default, this parameter is empty.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
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
         * The name of the custom image. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with acs: or aliyun. [It cannot contain http:// or https://. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).](http://https://。、（.）、（:）、（\_）（-）。)
         * <p>
         * 
         * By default, this parameter is empty. In this case, the original name is retained.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The type of the license that is used to activate the operating system after the image is imported. Set the value to BYOL.
         * <p>
         * 
         * BYOL: The license that comes with the source operating system is used. When you use the BYOL license, make sure that your license key is supported by Alibaba Cloud.
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The region ID of the custom image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * The new state of the custom image. Valid values:
         * <p>
         * 
         * *   Deprecated: puts the image into the Deprecated state. If the custom image is shared, you must unshare it before you can put it into the Deprecated state. Images in the Deprecated state cannot be shared or copied, but can be used to create instances or replace system disks.
         * *   Available: puts the image into the Available state. You can restore an image from the Deprecated state to the Available state.
         * 
         * > If you want to roll back a custom image in the image family to a previous version, you can put the latest available custom image into the Deprecated state. If no custom images are in the Available state within the image family, an image family cannot be used to create instances. Proceed with caution if only a single custom image is in the Available state within the image family.
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

    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private Features(Builder builder) {
            this.nvmeSupport = builder.nvmeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public static final class Builder {
            private String nvmeSupport; 

            /**
             * Specifies whether to support the Non-Volatile Memory Express (NVMe) protocol. Valid values:
             * <p>
             * 
             * *   supported: The image supports NVMe. Instances created from this image also support NVMe.
             * *   unsupported: The image does not support NVMe. Instances created from this image do not support NVMe.
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
}
