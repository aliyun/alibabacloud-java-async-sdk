// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImportImageRequest} extends {@link RequestModel}
 *
 * <p>ImportImageRequest</p>
 */
public class ImportImageRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetectionStrategy")
    private String detectionStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskDeviceMapping")
    private java.util.List < DiskDeviceMapping> diskDeviceMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Features")
    private Features features;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseType")
    private String licenseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSType")
    private String OSType;

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
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocationArn")
    private String storageLocationArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ImportImageRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.architecture = builder.architecture;
        this.bootMode = builder.bootMode;
        this.description = builder.description;
        this.detectionStrategy = builder.detectionStrategy;
        this.diskDeviceMapping = builder.diskDeviceMapping;
        this.dryRun = builder.dryRun;
        this.features = builder.features;
        this.imageName = builder.imageName;
        this.licenseType = builder.licenseType;
        this.OSType = builder.OSType;
        this.ownerId = builder.ownerId;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleName = builder.roleName;
        this.storageLocationArn = builder.storageLocationArn;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportImageRequest create() {
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
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return storageLocationArn
     */
    public String getStorageLocationArn() {
        return this.storageLocationArn;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ImportImageRequest, Builder> {
        private String sourceRegionId; 
        private String architecture; 
        private String bootMode; 
        private String description; 
        private String detectionStrategy; 
        private java.util.List < DiskDeviceMapping> diskDeviceMapping; 
        private Boolean dryRun; 
        private Features features; 
        private String imageName; 
        private String licenseType; 
        private String OSType; 
        private Long ownerId; 
        private String platform; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleName; 
        private String storageLocationArn; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ImportImageRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.architecture = request.architecture;
            this.bootMode = request.bootMode;
            this.description = request.description;
            this.detectionStrategy = request.detectionStrategy;
            this.diskDeviceMapping = request.diskDeviceMapping;
            this.dryRun = request.dryRun;
            this.features = request.features;
            this.imageName = request.imageName;
            this.licenseType = request.licenseType;
            this.OSType = request.OSType;
            this.ownerId = request.ownerId;
            this.platform = request.platform;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleName = request.roleName;
            this.storageLocationArn = request.storageLocationArn;
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
         * <p>The system architecture. Valid values:</p>
         * <ul>
         * <li>i386</li>
         * <li>x86_64</li>
         * <li>arm64</li>
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
         * <li>BIOS</li>
         * <li>UEFI</li>
         * </ul>
         * <p>Default value: BIOS. If you set <code>Architecture</code> to arm64, set this parameter to UEFI.</p>
         * <blockquote>
         * <p>Make sure that you are aware of the boot modes supported by the specified image, as thehe modified boot mode needs to be supported by the image. This way, instances that use this image can start.</p>
         * </blockquote>
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
         * <p>The image description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The mode in which to check the image. If you do not specify this parameter, the image is not checked. Only the standard check mode is supported.</p>
         * <blockquote>
         * <p> This parameter is supported for most Linux and Windows operating system versions. For more information about image check items and operating system limits for image check, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview</a> and <a href="https://help.aliyun.com/document_detail/475800.html">Operating system limits for image check</a>.</p>
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
         * <p>The information about the custom image.</p>
         */
        public Builder diskDeviceMapping(java.util.List < DiskDeviceMapping> diskDeviceMapping) {
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
         * Features.
         */
        public Builder features(Features features) {
            this.putQueryParameter("Features", features);
            this.features = features;
            return this;
        }

        /**
         * <p>The image name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>acs:</code> or <code>aliyun</code>. The name cannot contain <code>http://</code> or <code>https://</code>. The name can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>ImageTestName</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The type of the license used to activate the operating system after the image is imported. Valid values:</p>
         * <ul>
         * <li>Auto: ECS checks the operating system of the image and allocates a license to the operating system. ECS first checks whether the operating system distribution specified by <code>Platform</code> has a license allocated through an official Alibaba Cloud channel. If yes, the allocated license is used. If no, the license that comes with the source operating system is used.</li>
         * <li>Aliyun: The license allocated through an official Alibaba Cloud channel is used for the operating system distribution specified by <code>Platform</code>.</li>
         * <li>BYOL: The license that comes with the source operating system is used. In this case, make sure that your license key is eligible for use in Alibaba Cloud.</li>
         * </ul>
         * <p>Default value: Auto.</p>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * <p>The operating system platform. Valid values:</p>
         * <ul>
         * <li>windows</li>
         * <li>linux</li>
         * </ul>
         * <p>Default value: linux.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
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
         * <p>The operating system distribution. Valid values:</p>
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
         * <p>Aliyun</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The region ID of the source image. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which to assign the image.</p>
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
         * <p>The name of the RAM role used to import the image.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSImageImportDefaultRole</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the cloud box, which is used to uniquely identify a storage location in the cloud.</p>
         * <blockquote>
         * <p> Specify this parameter only if you import an image from OSS on CloudBox. Otherwise, you do not need to specify this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/430190.html">What is OSS on CloudBox?</a></p>
         * </blockquote>
         * <p>The ARN must be in the following format: <code>arn:acs:cloudbox:{RegionId}:{AliUid}:cloudbox/{CloudBoxId}</code>. Replace <code>{RegionId}</code> with the region ID of the cloud box, <code>{AliUid}</code> with the ID of the Alibaba Cloud account to which the cloud box belongs, and <code>{CloudBoxId}</code> with the ID of the cloud box.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:acs:cloudbox:cn-hangzhou:123456:cloudbox/cb-xx***123</p>
         */
        public Builder storageLocationArn(String storageLocationArn) {
            this.putQueryParameter("StorageLocationArn", storageLocationArn);
            this.storageLocationArn = storageLocationArn;
            return this;
        }

        /**
         * <p>The image tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ImportImageRequest build() {
            return new ImportImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link ImportImageRequest} extends {@link TeaModel}
     *
     * <p>ImportImageRequest</p>
     */
    public static class DiskDeviceMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskImSize")
        private Integer diskImSize;

        @com.aliyun.core.annotation.NameInMap("DiskImageSize")
        private Integer diskImageSize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OSSBucket")
        private String OSSBucket;

        @com.aliyun.core.annotation.NameInMap("OSSObject")
        private String OSSObject;

        private DiskDeviceMapping(Builder builder) {
            this.device = builder.device;
            this.diskImSize = builder.diskImSize;
            this.diskImageSize = builder.diskImageSize;
            this.format = builder.format;
            this.OSSBucket = builder.OSSBucket;
            this.OSSObject = builder.OSSObject;
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
         * @return diskImSize
         */
        public Integer getDiskImSize() {
            return this.diskImSize;
        }

        /**
         * @return diskImageSize
         */
        public Integer getDiskImageSize() {
            return this.diskImageSize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return OSSBucket
         */
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        /**
         * @return OSSObject
         */
        public String getOSSObject() {
            return this.OSSObject;
        }

        public static final class Builder {
            private String device; 
            private Integer diskImSize; 
            private Integer diskImageSize; 
            private String format; 
            private String OSSBucket; 
            private String OSSObject; 

            /**
             * <p>The device name of disk N in the custom image.</p>
             * <blockquote>
             * <p> This parameter will be removed in the future. We recommend that you do not use this parameter to ensure future compatibility.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The size of disk N in the custom image. Unit: GiB</p>
             * <p>You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the imported image file. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>When the N value is 1, this parameter specifies the size of the system disk in the custom image. Valid values: 5 to 500.</li>
             * <li>When the N value is an integer in the range of 2 to 17, this parameter specifies the size of a data disk in the custom image. Valid values: 5 to 2000.</li>
             * </ul>
             * <p>After the image file is uploaded to an OSS bucket, you can view the size of the image file in the OSS bucket.</p>
             * <blockquote>
             * <p> This parameter will be removed in the future. We recommend that you use <code>DiskDeviceMapping.N.DiskImageSize</code> to ensure future compatibility.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder diskImSize(Integer diskImSize) {
                this.diskImSize = diskImSize;
                return this;
            }

            /**
             * <p>The size of disk N in the custom image after the image is imported.</p>
             * <p>You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the imported image file. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>When the N value is 1, this parameter specifies the size of the system disk in the custom image. Valid values: 5 to 500.</li>
             * <li>When the N value is an integer in the range of 2 to 17, this parameter specifies the size of a data disk in the custom image. Valid values: 5 to 2000.</li>
             * </ul>
             * <p>After the image file is uploaded to an OSS bucket, you can view the size of the image file in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder diskImageSize(Integer diskImageSize) {
                this.diskImageSize = diskImageSize;
                return this;
            }

            /**
             * <p>The image format. Valid values:</p>
             * <ul>
             * <li>RAW</li>
             * <li>VHD</li>
             * <li>QCOW2</li>
             * </ul>
             * <p>This parameter is empty by default, which indicates that the system checks the format of the image and uses the check result as the value of this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>QCOW2</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The OSS bucket where the image file is stored.</p>
             * <blockquote>
             * <p> Before you import images for the first time, you must use RAM to authorize ECS to access your OSS buckets. If ECS is not authorized to access your OSS buckets, the <code>NoSetRoletoECSServiceAcount</code> error code is returned when you call the ImportImage operation. For more information, see the &quot;<strong>Usage notes</strong>&quot; section in this topic.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ecsimageos</p>
             */
            public Builder OSSBucket(String OSSBucket) {
                this.OSSBucket = OSSBucket;
                return this;
            }

            /**
             * <p>The name (key) of the object that the uploaded image is stored as in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_5.4_32.raw</p>
             */
            public Builder OSSObject(String OSSObject) {
                this.OSSObject = OSSObject;
                return this;
            }

            public DiskDeviceMapping build() {
                return new DiskDeviceMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportImageRequest} extends {@link TeaModel}
     *
     * <p>ImportImageRequest</p>
     */
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
             * NvmeSupport.
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
    /**
     * 
     * {@link ImportImageRequest} extends {@link TeaModel}
     *
     * <p>ImportImageRequest</p>
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

            /**
             * <p>The key of tag N of the image. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the image. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
