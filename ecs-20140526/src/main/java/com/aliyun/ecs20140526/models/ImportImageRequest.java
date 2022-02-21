// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportImageRequest} extends {@link RequestModel}
 *
 * <p>ImportImageRequest</p>
 */
public class ImportImageRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("DiskDeviceMapping")
    private java.util.List < DiskDeviceMapping> diskDeviceMapping;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("OSType")
    private String OSType;

    @Query
    @NameInMap("BootMode")
    private String bootMode;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("RoleName")
    private String roleName;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("LicenseType")
    private String licenseType;

    private ImportImageRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.diskDeviceMapping = builder.diskDeviceMapping;
        this.tag = builder.tag;
        this.description = builder.description;
        this.OSType = builder.OSType;
        this.bootMode = builder.bootMode;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
        this.architecture = builder.architecture;
        this.roleName = builder.roleName;
        this.resourceGroupId = builder.resourceGroupId;
        this.imageName = builder.imageName;
        this.licenseType = builder.licenseType;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return diskDeviceMapping
     */
    public java.util.List < DiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * @return bootMode
     */
    public String getBootMode() {
        return this.bootMode;
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
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<ImportImageRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private java.util.List < DiskDeviceMapping> diskDeviceMapping; 
        private java.util.List < Tag> tag; 
        private String description; 
        private String OSType; 
        private String bootMode; 
        private String platform; 
        private String regionId; 
        private String architecture; 
        private String roleName; 
        private String resourceGroupId; 
        private String imageName; 
        private String licenseType; 

        private Builder() {
            super();
        } 

        private Builder(ImportImageRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.diskDeviceMapping = response.diskDeviceMapping;
            this.tag = response.tag;
            this.description = response.description;
            this.OSType = response.OSType;
            this.bootMode = response.bootMode;
            this.platform = response.platform;
            this.regionId = response.regionId;
            this.architecture = response.architecture;
            this.roleName = response.roleName;
            this.resourceGroupId = response.resourceGroupId;
            this.imageName = response.imageName;
            this.licenseType = response.licenseType;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * DiskDeviceMapping.
         */
        public Builder diskDeviceMapping(java.util.List < DiskDeviceMapping> diskDeviceMapping) {
            this.putQueryParameter("DiskDeviceMapping", diskDeviceMapping);
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The description of the image. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Operating system platform type. Valid values:
         * <p>
         * 
         * -Windows
         * -Linux
         * 
         * Default: linux
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * Modify a mirror the start mode of. Valid values:
         * <p>
         * 
         * -BIOS:BIOS startup mode.
         * -UEFI:UEFI boot mode.
         * 
         * Default: BIOS. If "architecture = arm64", the parameter default value for UEFI, and can be set only to UEFI.
         * 
         * > you need to know the specified mirror support the start mode of the, when pass the parameter to modify the startup mode, must be the image itself support the start mode of the match, instance to start normally.
         */
        public Builder bootMode(String bootMode) {
            this.putQueryParameter("BootMode", bootMode);
            this.bootMode = bootMode;
            return this;
        }

        /**
         * Operating system release. Valid values:
         * <p>
         * 
         * -CentOS
         * -CentOS Stream
         * -Ubuntu
         * -SUSE
         * -OpenSUSE
         * -Debian
         * -CoreOS
         * -Aliyun
         * -Anolis
         * -AlmaLinux
         * -Rocky Linux
         * -Others Linux
         * -Customized Linux
         * -Windows Server 2022
         * -Windows Server 2019
         * -Windows Server 2016
         * -Windows Server 2012
         * -Windows Server 2008
         * -Windows Server 2003
         * 
         * Default: Others Linux
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * From define the mirror geographical ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * System architecture. Valid values:
         * <p>
         * 
         * -i386
         * -x86_64
         * -arm64
         * 
         * Default: x86_64
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * Import mirrored when use of RAM role name.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * Import that the mirror is in enterprise resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the image. Length 2~128 characters. Must be in capital small letter or Chinese beginning, can"t to "aliyun" and "acs: "Beginning, cannot contain "http:// or "https://". Can contain numbers, half-width period (.), half-width a colon (:), underscore (_), or dash (-).
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * Import mirrored rear, activate operating system is the license type. Valid values:
         * <p>
         * 
         * -Auto: by Alibaba Cloud Detection source operating system and distribution license. Automatic mode, system priority search you set "platform" whether with Alibaba Cloud official channels License and assigned to the imported image, if lack of class License, switches to BYOL(Bring Your Own License) Way.
         * -aliyun: based on your settings "platform" using Alibaba Cloud official channels license.
         * -BYOL: source operating system comes with the license. The BYOL when, you must ensure that your license key support in Alibaba Cloud use.
         * 
         * Default: Auto
         * 
         * 
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        @Override
        public ImportImageRequest build() {
            return new ImportImageRequest(this);
        } 

    } 

    public static class DiskDeviceMapping extends TeaModel {
        @NameInMap("DiskImSize")
        private Integer diskImSize;

        @NameInMap("Device")
        private String device;

        @NameInMap("OSSBucket")
        private String OSSBucket;

        @NameInMap("Format")
        private String format;

        @NameInMap("OSSObject")
        private String OSSObject;

        @NameInMap("DiskImageSize")
        private Integer diskImageSize;

        private DiskDeviceMapping(Builder builder) {
            this.diskImSize = builder.diskImSize;
            this.device = builder.device;
            this.OSSBucket = builder.OSSBucket;
            this.format = builder.format;
            this.OSSObject = builder.OSSObject;
            this.diskImageSize = builder.diskImageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMapping create() {
            return builder().build();
        }

        /**
         * @return diskImSize
         */
        public Integer getDiskImSize() {
            return this.diskImSize;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return OSSBucket
         */
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return OSSObject
         */
        public String getOSSObject() {
            return this.OSSObject;
        }

        /**
         * @return diskImageSize
         */
        public Integer getDiskImageSize() {
            return this.diskImageSize;
        }

        public static final class Builder {
            private Integer diskImSize; 
            private String device; 
            private String OSSBucket; 
            private String format; 
            private String OSSObject; 
            private Integer diskImageSize; 

            /**
             * 自定义镜像大小。
             * <p>
             * 
             * >该参数即将被弃用，为提高兼容性，请尽量使用`DiskDeviceMapping.N.DiskImageSize`参数。
             */
            public Builder diskImSize(Integer diskImSize) {
                this.diskImSize = diskImSize;
                return this;
            }

            /**
             * 指定DiskDeviceMapping.N.Device在自定义镜像中的设备名。
             * <p>
             * 
             * > 该参数即将停止使用，为提高代码兼容性，建议您尽量不要使用该参数。
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * 镜像文件所在的OSS Bucket。
             * <p>
             * 
             * > 首次导入镜像到该OSS Bucket前，请参见接口说明章节添加RAM授权策略，否则会报错`NoSetRoletoECSServiceAcount`。
             */
            public Builder OSSBucket(String OSSBucket) {
                this.OSSBucket = OSSBucket;
                return this;
            }

            /**
             * 镜像格式。取值范围：
             * <p>
             * 
             * - RAW
             * - VHD
             * - QCOW2
             * 
             * 默认值：无，表示阿里云自动检测镜像格式，以检测格式为准。
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * 镜像上传至OSS Bucket后，保存在Bucket中的镜像文件的文件名（key）。
             */
            public Builder OSSObject(String OSSObject) {
                this.OSSObject = OSSObject;
                return this;
            }

            /**
             * 导入镜像后，自定义镜像的空间大小。
             * <p>
             * 
             * 该空间由系统盘和数据盘组成，当N=1时，表示系统盘，当N=2~17时，表示数据盘。您必须保证系统盘的空间大小大于等于导入的镜像文件大小。取值范围：
             * 
             * - N=1时，取值范围：5 GiB~500 GiB
             * - N=2~17时，取值范围：5 GiB~1000 GiB
             * 
             * 当您将源镜像文件上传至OSS后，可以在OSS Bucket中查看镜像文件的大小。
             */
            public Builder diskImageSize(Integer diskImageSize) {
                this.diskImageSize = diskImageSize;
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
             * 镜像的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 镜像的标签值。N的取值范围：1~20。一旦传入该值，允许为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或者`https://`。
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
