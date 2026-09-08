// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BootMode")
    private String bootMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetectionStrategy")
    private String detectionStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskDeviceMapping")
    private java.util.List<DiskDeviceMapping> diskDeviceMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Features")
    private Features features;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFamily")
    private String imageFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageVersion")
    private String imageVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecureBootOptions")
    private SecureBootOptions secureBootOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.architecture = builder.architecture;
        this.bootMode = builder.bootMode;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.detectionStrategy = builder.detectionStrategy;
        this.diskDeviceMapping = builder.diskDeviceMapping;
        this.dryRun = builder.dryRun;
        this.features = builder.features;
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
        this.secureBootOptions = builder.secureBootOptions;
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
    public java.util.List<DiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return secureBootOptions
     */
    public SecureBootOptions getSecureBootOptions() {
        return this.secureBootOptions;
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private String sourceRegionId; 
        private String architecture; 
        private String bootMode; 
        private String clientToken; 
        private String description; 
        private String detectionStrategy; 
        private java.util.List<DiskDeviceMapping> diskDeviceMapping; 
        private Boolean dryRun; 
        private Features features; 
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
        private SecureBootOptions secureBootOptions; 
        private String snapshotId; 
        private java.util.List<Tag> tag; 

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
            this.dryRun = request.dryRun;
            this.features = request.features;
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
            this.secureBootOptions = request.secureBootOptions;
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
         * <p>The system architecture. After a data disk snapshot is specified as the system disk of the image, use this parameter to specify the system architecture of the system disk. Valid values:</p>
         * <ul>
         * <li>i386.</li>
         * <li>x86_64.</li>
         * <li>arm64.</li>
         * </ul>
         * <p>Default value: x86_64.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>The boot mode of the image. Valid values:</p>
         * <ul>
         * <li>BIOS: BIOS boot mode.</li>
         * <li>UEFI: UEFI boot mode.</li>
         * <li>UEFI-Preferred: dual boot mode.</li>
         * </ul>
         * <notice>
         * 
         * <p>To prevent instances from failing to start due to an unsupported boot mode, make sure that you understand the boot modes supported by the target image before specifying this parameter. For more information about image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
         * </notice>
         * 
         * <strong>example:</strong>
         * <p>BIOS</p>
         */
        public Builder bootMode(String bootMode) {
            this.putQueryParameter("BootMode", bootMode);
            this.bootMode = bootMode;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the image. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageTestDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The image detection strategy. If this parameter is not specified, detection is not triggered. Only the Standard detection mode is supported. </p>
         * <blockquote>
         * <p>Most Linux and Windows versions are supported. For more information about image detection items and operating system limitations, see <a href="https://help.aliyun.com/document_detail/439819.html">Image detection overview</a> and <a href="https://help.aliyun.com/document_detail/475800.html">Operating system limitations for image detection</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder detectionStrategy(String detectionStrategy) {
            this.putQueryParameter("DetectionStrategy", detectionStrategy);
            this.detectionStrategy = detectionStrategy;
            return this;
        }

        /**
         * <p>The disk and snapshot information used to create the custom image. If you want to create a custom image from system disk and data disk snapshots, use this parameter to specify the snapshots.</p>
         */
        public Builder diskDeviceMapping(java.util.List<DiskDeviceMapping> diskDeviceMapping) {
            this.putQueryParameter("DiskDeviceMapping", diskDeviceMapping);
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The image feature-related properties.</p>
         */
        public Builder features(Features features) {
            this.putQueryParameter("Features", features);
            this.features = features;
            return this;
        }

        /**
         * <p>The image family name. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with aliyun or acs:. It cannot contain http:// or https://. It can contain digits, colons (:), underscores (_), or hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * <p>The image name. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), or hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>TestCentOS</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The image version.</p>
         * <blockquote>
         * <p>If you specify an instance ID (<code>InstanceId</code>) and the image of the instance is an Alibaba Cloud Marketplace image or a custom image created from an Alibaba Cloud Marketplace image, this parameter must be the same as the <code>ImageVersion</code> of the current instance image or left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017011017</p>
         */
        public Builder imageVersion(String imageVersion) {
            this.putQueryParameter("ImageVersion", imageVersion);
            this.imageVersion = imageVersion;
            return this;
        }

        /**
         * <p>The instance ID. This parameter is required when you create a custom image from an instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1g6zv0ce8oghu7****</p>
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
         * <p>The operating system distribution. After a data disk snapshot is specified as the system disk of the image, use this parameter to specify the operating system distribution of the system disk. Valid values:</p>
         * <ul>
         * <li>Aliyun</li>
         * <li>Anolis</li>
         * <li>CentOS</li>
         * <li>Ubuntu</li>
         * <li>CoreOS</li>
         * <li>SUSE</li>
         * <li>Debian</li>
         * <li>OpenSUSE</li>
         * <li>FreeBSD</li>
         * <li>RedHat</li>
         * <li>Kylin</li>
         * <li>UOS</li>
         * <li>Fedora</li>
         * <li>Fedora CoreOS</li>
         * <li>CentOS Stream</li>
         * <li>AlmaLinux</li>
         * <li>Rocky Linux</li>
         * <li>Gentoo</li>
         * <li>Customized Linux</li>
         * <li>Others Linux</li>
         * <li>Windows Server 2022</li>
         * <li>Windows Server 2019</li>
         * <li>Windows Server 2016</li>
         * <li>Windows Server 2012</li>
         * <li>Windows Server 2008</li>
         * <li>Windows Server 2003</li>
         * </ul>
         * <p>Default value: Others Linux.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The region ID of the image. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the custom image belongs. If you do not set this parameter to a value, the created image belongs to the default resource group.</p>
         * <blockquote>
         * <p>If you invoke this operation as a Resource Access Management (RAM) user and <code>ResourceGroupId</code> is left empty, note that when the RAM user does not have permissions on the default resource group, the error message <code>Forbidden: User not authorized to operate on the specified resource</code> is returned. Set a resource group ID that the RAM user has permissions on, or grant the RAM user permissions on the default resource group by using the corresponding Alibaba Cloud account before invoking this operation again.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
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
         * <p>The Secure Boot-related parameters.</p>
         */
        public Builder secureBootOptions(SecureBootOptions secureBootOptions) {
            this.putQueryParameter("SecureBootOptions", secureBootOptions);
            this.secureBootOptions = secureBootOptions;
            return this;
        }

        /**
         * <p>The snapshot ID used to create the custom image.</p>
         * <blockquote>
         * <p>If you want to create a custom image only from the system disk snapshot of an instance, you can use this parameter or the <code>DiskDeviceMapping.N.SnapshotId</code> parameter. If you want to add data disk snapshots, use only the <code>DiskDeviceMapping.N.SnapshotId</code> parameter to specify snapshots.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwkdca0****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateImageRequest build() {
            return new CreateImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageRequest} extends {@link TeaModel}
     *
     * <p>CreateImageRequest</p>
     */
    public static class DiskDeviceMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
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

            private Builder() {
            } 

            private Builder(DiskDeviceMapping model) {
                this.device = model.device;
                this.diskType = model.diskType;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * <p>The device name in the custom image. Valid values:</p>
             * <ul>
             * <li><p>The device name of the system disk must be /dev/xvda.</p>
             * </li>
             * <li><p>The device names of data disks are in alphabetical order from /dev/xvdb to /dev/xvdz and cannot be duplicated.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvdb</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The type of the disk in the new image. You can use this parameter to specify a data disk snapshot as the system disk of the image. If you do not specify this parameter, the disk type defaults to the type of the disk from which the snapshot was created. Valid values:</p>
             * <ul>
             * <li>system: system disk. Only one system disk snapshot can be specified.</li>
             * <li>data: data disk. Up to 16 data disk snapshots can be specified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The size of the disk, in GiB. The valid values and default value of DiskDeviceMapping.N.Size depend on DiskDeviceMapping.N.SnapshotId:</p>
             * <ul>
             * <li>If SnapshotId is not specified, the valid values and default value of Size are:<ul>
             * <li>Basic disk: 5 to 2000 GiB. Default value: 5.</li>
             * <li>Other disk types: 20 to 32768 GiB. Default value: 20.</li>
             * </ul>
             * </li>
             * <li>If SnapshotId is specified, the value of Size must be greater than or equal to the size of the snapshot. Default value: the size of the snapshot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp17441ohwkdca0****</p>
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
    /**
     * 
     * {@link CreateImageRequest} extends {@link TeaModel}
     *
     * <p>CreateImageRequest</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImdsSupport")
        private String imdsSupport;

        private Features(Builder builder) {
            this.imdsSupport = builder.imdsSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return imdsSupport
         */
        public String getImdsSupport() {
            return this.imdsSupport;
        }

        public static final class Builder {
            private String imdsSupport; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.imdsSupport = model.imdsSupport;
            } 

            /**
             * <p>The metadata access mode of the image. Valid values:</p>
             * <ul>
             * <li>v1: When you create an ECS instance from this image, you cannot set the metadata access mode to &quot;hardened mode only&quot;.</li>
             * <li>v2: When you create an ECS instance from this image, you can set the metadata access mode to &quot;hardened mode only&quot;.</li>
             * </ul>
             * <p>Default value: When you create an image from a snapshot, the default value is v1. When you create an image from an instance, the default value is the ImdsSupport property value of the image used to create the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder imdsSupport(String imdsSupport) {
                this.imdsSupport = imdsSupport;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageRequest} extends {@link TeaModel}
     *
     * <p>CreateImageRequest</p>
     */
    public static class SecureBootOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecureBootSupport")
        private String secureBootSupport;

        private SecureBootOptions(Builder builder) {
            this.secureBootSupport = builder.secureBootSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecureBootOptions create() {
            return builder().build();
        }

        /**
         * @return secureBootSupport
         */
        public String getSecureBootSupport() {
            return this.secureBootSupport;
        }

        public static final class Builder {
            private String secureBootSupport; 

            private Builder() {
            } 

            private Builder(SecureBootOptions model) {
                this.secureBootSupport = model.secureBootSupport;
            } 

            /**
             * <p>Specifies whether the image supports Secure Boot. Valid values:</p>
             * <ul>
             * <li>supported: Secure Boot is supported.</li>
             * <li>unsupported: Secure Boot is not supported.<blockquote>
             * <p>Secure Boot supports only the UEFI or UEFI-Preferred boot mode.</p>
             * </blockquote>
             * </li>
             * </ul>
             */
            public Builder secureBootSupport(String secureBootSupport) {
                this.secureBootSupport = secureBootSupport;
                return this;
            }

            public SecureBootOptions build() {
                return new SecureBootOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageRequest} extends {@link TeaModel}
     *
     * <p>CreateImageRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the image. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the image. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ValueTest</p>
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
