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
    private java.util.List<Tag> tag;

    private ImportImageRequest(Builder builder) {
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ImportImageRequest, Builder> {
        private String sourceRegionId; 
        private String architecture; 
        private String bootMode; 
        private String clientToken; 
        private String description; 
        private String detectionStrategy; 
        private java.util.List<DiskDeviceMapping> diskDeviceMapping; 
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
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ImportImageRequest request) {
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
         * <p>The system architecture. Valid values: </p>
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
         * <li>BIOS: Basic Input/Output System (BIOS) boot mode.</li>
         * <li>UEFI: Unified Extensible Firmware Interface (UEFI) boot mode.</li>
         * </ul>
         * <p>Default value: BIOS. If <code>Architecture=arm64</code>, the default value is UEFI, and only UEFI can be specified.</p>
         * <notice>
         * 
         * <p>To prevent instances from failing to start due to an unsupported boot mode, make sure that you understand the boot mode supported by the target image before you specify this parameter. For more information about image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The description of the image. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The image detection strategy. If this parameter is not specified, detection is not triggered. Only the Standard detection mode is supported.</p>
         * <blockquote>
         * <p>Most Linux/Windows versions are supported. For more information about image detection items and operating system limitations, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image detection</a> and <a href="https://help.aliyun.com/document_detail/475800.html">Operating system limitations for image detection</a>.</p>
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
         * <p>The information list of the custom image to create.</p>
         */
        public Builder diskDeviceMapping(java.util.List<DiskDeviceMapping> diskDeviceMapping) {
            this.putQueryParameter("DiskDeviceMapping", diskDeviceMapping);
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run. The system checks the request for potential issues, including the AccessKey validity, the authorization of the Resource Access Management (RAM) user, and required parameters. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
         * <li>false: performs a dry run and sends the Normal request. If the check succeeds, a 2XX HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The image name. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. It can contain digits, periods (.), colons (:), underscores (_), or hyphens (-).</p>
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
         * <p>The license type. This parameter specifies the authorization mode when instances are created by calling <a href="https://help.aliyun.com/document_detail/2679677.html">RunInstances</a> with this image. This value takes effect only for Windows Server images. Valid values:</p>
         * <ul>
         * <li>Aliyun: Uses the Alibaba Cloud official license. After the instance starts, the system attempts to automatically connect to the Alibaba Cloud KMS server for activation. The billing for the instance includes the Windows Server license fee.</li>
         * <li>BYOL: Bring Your Own License. After the instance starts, Alibaba Cloud does not automatically activate it. You must manually activate it by using your own valid license key. The billing for the instance does not include the Windows Server license fee.</li>
         * </ul>
         * <p>Default value: Aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>BYOL</p>
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * <p>The operating system type. Valid values: </p>
         * <ul>
         * <li>windows. You must also set <code>LicenseType</code>.</li>
         * <li>linux.</li>
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
         * <p>The operating system distribution. Valid values: </p>
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
         * <li>Other Windows</li>
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
         * <p>The region ID of the source custom image. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ID of the enterprise resource group to which the imported image belongs.</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the CloudBox, which uniquely identifies the cloud storage location.</p>
         * <blockquote>
         * <p>You need to specify this parameter only when you import an image file from OSS on CloudBox. If you are not using OSS on CloudBox, do not set this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/430190.html">What is OSS on CloudBox</a>.</p>
         * </blockquote>
         * <p>The correct ARN format is: <code>arn:acs:cloudbox:{RegionId}:{AliUid}:cloudbox/{CloudBoxId}</code>, where <code>{RegionId}</code> is the region ID where the CloudBox resides, <code>{AliUid}</code> is the Alibaba Cloud account ID, and <code>{CloudBoxId}</code> is the CloudBox ID.</p>
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
         * <p>The tag list of the image.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
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

            private Builder() {
            } 

            private Builder(DiskDeviceMapping model) {
                this.device = model.device;
                this.diskImSize = model.diskImSize;
                this.diskImageSize = model.diskImageSize;
                this.format = model.format;
                this.OSSBucket = model.OSSBucket;
                this.OSSObject = model.OSSObject;
            } 

            /**
             * <p>The device name of DiskDeviceMapping.N.Device in the custom image.</p>
             * <blockquote>
             * <p>This parameter will be deprecated. For better code compatibility, do not use this parameter.</p>
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
             * <p>The size of the custom image. Unit: GiB.</p>
             * <p>The space consists of the system disk and data disks. Make sure that the system disk space is greater than or equal to the size of the imported image file. Valid values:</p>
             * <ul>
             * <li>When N=1, the value indicates the system disk. Valid values: 1 GiB to 2048 GiB.</li>
             * <li>When N=2 to 17, the value indicates a data disk. Valid values: 1 GiB to 2048 GiB.</li>
             * </ul>
             * <p>After you upload the source image file to OSS, you can view the image file size in the OSS bucket.</p>
             * <blockquote>
             * <p>This parameter will be deprecated. For better compatibility, use <code>DiskDeviceMapping.N.DiskImageSize</code> instead.</p>
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
             * <p>The space size of the custom image after the image is imported.</p>
             * <p>The space consists of the system disk and data disks. Make sure that the system disk space is greater than or equal to the size of the imported image file. Valid values:</p>
             * <ul>
             * <li>When N=1, the value indicates the system disk. Valid values: 1 GiB to 2048 GiB.</li>
             * <li>When N=2 to 17, the value indicates a data disk. Valid values: 1 GiB to 2048 GiB.</li>
             * </ul>
             * <p>After you upload the source image file to OSS, you can view the image file size in the OSS bucket.</p>
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
             * <li>RAW.</li>
             * <li>VHD.</li>
             * <li>QCOW2.</li>
             * <li>VMDK (in invitational preview).</li>
             * </ul>
             * <p>Default value: empty, which indicates that Alibaba Cloud automatically detects the image format and uses the detected format.</p>
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
             * <p>Before importing an image to this OSS bucket for the first time, add the RAM authorization policy as described in the <strong>Operation description</strong> section of this topic. Otherwise, the <code>NoSetRoletoECSServiceAccount</code> error is reported.</p>
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
             * <p>The name (key) of the image file stored in the OSS bucket after the image is uploaded to OSS.</p>
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
        @com.aliyun.core.annotation.NameInMap("ImdsSupport")
        private String imdsSupport;

        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private Features(Builder builder) {
            this.imdsSupport = builder.imdsSupport;
            this.nvmeSupport = builder.nvmeSupport;
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

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public static final class Builder {
            private String imdsSupport; 
            private String nvmeSupport; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.imdsSupport = model.imdsSupport;
                this.nvmeSupport = model.nvmeSupport;
            } 

            /**
             * <p>The metadata access mode of the image. Valid values:</p>
             * <ul>
             * <li>v1: When you create an ECS instance from this image, you cannot set the metadata access mode to &quot;hardened mode only&quot;.</li>
             * <li>v2: When you create an ECS instance from this image, you can set the metadata access mode to &quot;hardened mode only&quot;.</li>
             * </ul>
             * <p>Default value: v1.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder imdsSupport(String imdsSupport) {
                this.imdsSupport = imdsSupport;
                return this;
            }

            /**
             * <p>Specifies whether the image supports NVMe.</p>
             * <ul>
             * <li>supported: The image has the NVMe driver installed.</li>
             * <li>unsupported: The image does not have the NVMe driver installed.</li>
             * <li>If this parameter is not specified or the value is empty, the default value is unsupported.<blockquote>
             * <p>By default, imported images are considered as not supporting the NVMe protocol. If you plan to run the image on instance types that support NVMe (such as c8i and r9i), make sure that the image has a built-in NVMe driver and explicitly set this parameter to supported.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>supported</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the image. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the image. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
