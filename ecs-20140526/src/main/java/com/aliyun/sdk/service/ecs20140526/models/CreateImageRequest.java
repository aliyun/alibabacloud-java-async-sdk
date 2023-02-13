// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("BootMode")
    private String bootMode;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DetectionStrategy")
    private String detectionStrategy;

    @Query
    @NameInMap("DiskDeviceMapping")
    private java.util.List < DiskDeviceMapping> diskDeviceMapping;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("ImageVersion")
    private String imageVersion;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.architecture = builder.architecture;
        this.bootMode = builder.bootMode;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.detectionStrategy = builder.detectionStrategy;
        this.diskDeviceMapping = builder.diskDeviceMapping;
        this.imageFamily = builder.imageFamily;
        this.imageName = builder.imageName;
        this.imageVersion = builder.imageVersion;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snapshotId = builder.snapshotId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageRequest create() {
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
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return bootMode
     */
    public String getBootMode() {
        return this.bootMode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detectionStrategy
     */
    public String getDetectionStrategy() {
        return this.detectionStrategy;
    }

    /**
     * @return diskDeviceMapping
     */
    public java.util.List < DiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
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
     * @return imageVersion
     */
    public String getImageVersion() {
        return this.imageVersion;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private String sourceRegionId; 
        private String architecture; 
        private String bootMode; 
        private String clientToken; 
        private String description; 
        private String detectionStrategy; 
        private java.util.List < DiskDeviceMapping> diskDeviceMapping; 
        private String imageFamily; 
        private String imageName; 
        private String imageVersion; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String platform; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snapshotId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.architecture = request.architecture;
            this.bootMode = request.bootMode;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.detectionStrategy = request.detectionStrategy;
            this.diskDeviceMapping = request.diskDeviceMapping;
            this.imageFamily = request.imageFamily;
            this.imageName = request.imageName;
            this.imageVersion = request.imageVersion;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.platform = request.platform;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snapshotId = request.snapshotId;
            this.tag = request.tag;
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
         * The system architecture of the system disk. If you specify a data disk snapshot to create the system disk of the custom image, you must use the Architecture parameter to specify the system architecture of the system disk. Valid values:
         * <p>
         * 
         * *   i386
         * *   x86\_64
         * *   arm64
         * 
         * Default value: x86\_64.
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * The boot mode of the custom image. Valid values:
         * <p>
         * 
         * *   BIOS
         * *   UEFI
         * 
         * > You must be aware of the boot modes supported by the specified image. When you use this parameter to change the boot mode of the image, specify a boot mode supported by the image to ensure that instances that use this image can start as expected.
         */
        public Builder bootMode(String bootMode) {
            this.putQueryParameter("BootMode", bootMode);
            this.bootMode = bootMode;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The **ClientToken** value can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * The mode in which to check the source image. If you do not specify this parameter, the source image is not checked. Only Linux images can be checked. Set the value to Standard, which indicates standard check mode.
         * <p>
         * 
         * The following items are checked in standard check mode:
         * 
         * *   Virtio: whether the virtio driver is installed.
         * *   Fstab: whether mounting configurations in the fstab file are correct.
         * *   Grub: whether GRand Unified Bootloader (GRUB) configurations are correct.
         * *   SystemImage: whether the image is valid. Do not import images that are in the ISO format or empty.
         * *   CloudInit: whether cloud-init is installed.
         * *   NVMe: whether the NVMe driver is installed.
         * *   Selinux: whether SElinux is enabled.
         * *   OnlineResizeFS: whether the root partition can be automatically resized.
         * *   Dhcp: whether Dynamic Host Configuration Protocol (DHCP) is enabled for network interface controllers (NICs).
         * *   RtcTimeMode: the RTC time mode.
         * *   Platform: the platform. Example: Linux or Windows.
         * *   OSVersion: the operating system version. Example: Centos 7.9.
         * *   Architecture: the architecture. Example: ARM or x86\_64.
         * *   BootMode: the boot mode. Example: UEFI or Legacy.
         * *   KernelVersion: the kernel version.
         * *   CloudAssistant: whether the Cloud Assistant client is installed.
         * *   SecurityCenterAgent: whether the Security Center agent is installed.
         */
        public Builder detectionStrategy(String detectionStrategy) {
            this.putQueryParameter("DetectionStrategy", detectionStrategy);
            this.detectionStrategy = detectionStrategy;
            return this;
        }

        /**
         * Details about the custom images.
         */
        public Builder diskDeviceMapping(java.util.List < DiskDeviceMapping> diskDeviceMapping) {
            this.putQueryParameter("DiskDeviceMapping", diskDeviceMapping);
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }

        /**
         * ImageFamily.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The version of the custom image.
         * <p>
         * 
         * > If you specify an instance by setting `InstanceId` and the instance uses an Alibaba Cloud Marketplace image or a custom image derived from an Alibaba Cloud Marketplace image, this parameter must be left empty or set to the value of the ImageVersion parameter of the instance.
         */
        public Builder imageVersion(String imageVersion) {
            this.putQueryParameter("ImageVersion", imageVersion);
            this.imageVersion = imageVersion;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * The distribution of the operating system for the system disk in the custom image. If you specify a data disk snapshot to create the system disk of the custom image, you must use the Platform parameter to specify the distribution of the operating system for the system disk. Valid values:
         * <p>
         * 
         * *   CentOS
         * *   Ubuntu
         * *   SUSE
         * *   OpenSUSE
         * *   RedHat
         * *   Debian
         * *   CoreOS
         * *   Aliyun
         * *   Windows Server 2012
         * *   Windows 7
         * *   Customized Linux
         * *   Others Linux
         * 
         * Default value: Others Linux.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * The ID of the region in which to create the custom image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which to assign the custom image. If you do not specify this parameter, the image is assigned to the default resource group.
         * <p>
         * 
         * > If you call the CopyImage operation as a Resource Access Management (RAM) user who is not authorized to manage the default resource group and do not specify the `ResourceGroupId` parameter, the `Forbbiden: User not authorized to operate on the specified resource` error message is returned. You must specify the ID of a resource group that the RAM user is authorized to manage or authorize the RAM user to manage the default resource group before you call the CreateImage operation again.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The ID of the snapshot that is used to create the custom image.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The tags of the custom image.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateImageRequest build() {
            return new CreateImageRequest(this);
        } 

    } 

    public static class DiskDeviceMapping extends TeaModel {
        @NameInMap("Device")
        private String device;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        private DiskDeviceMapping(Builder builder) {
            this.device = builder.device;
            this.diskType = builder.diskType;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMapping create() {
            return builder().build();
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private String device; 
            private String diskType; 
            private Integer size; 
            private String snapshotId; 

            /**
             * The device name of disk N in the custom image. Valid values:
             * <p>
             * 
             * *   For disk categories other than basic disks, such as standard SSDs, ultra disks, and enhanced SSDs (ESSDs), the valid values are in alphabetical order from /dev/vda to /dev/vdz.
             * *   For basic disks, the valid values are in alphabetical order from /dev/xvda to /dev/xvdz.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The type of disk N in the custom image. You can set this parameter to create the system disk of the custom image from a data disk snapshot. If you do not set this parameter, the disk type is determined by the corresponding snapshot. Valid values:
             * <p>
             * 
             * *   system: system disk
             * *   data: data disk
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The size of disk N in the custom image. Unit: GiB. The valid values and default value of DiskDeviceMapping.N.Size depend on DiskDeviceMapping.N.SnapshotId.
             * <p>
             * 
             * *   If no corresponding snapshot IDs are specified in the DiskDeviceMapping.N.SnapshotId value, the following valid values and default values are available for DiskDeviceMapping.N.Size:
             * 
             *     *   For basic disks, the valid values are 5 to 2000, and the default value is 5.
             *     *   For other disk categories, the valid values are 20 to 32768, and the default value is 20.
             * 
             * *   If a corresponding snapshot ID is specified in the DiskDeviceMapping.N.SnapshotId value, the value of DiskDeviceMapping.N.Size must be greater than or equal to the size of the specified snapshot. The default value of DiskDeviceMapping.N.Size is the size of the specified snapshot.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot that is used to create the custom image.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DiskDeviceMapping build() {
                return new DiskDeviceMapping(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N of the custom image. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N of the custom image. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
