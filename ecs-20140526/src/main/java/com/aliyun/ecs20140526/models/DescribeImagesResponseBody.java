// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagesResponseBody</p>
 */
public class DescribeImagesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("Images")
    private Images images;

    private DescribeImagesResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.regionId = builder.regionId;
        this.images = builder.images;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return images
     */
    public Images getImages() {
        return this.images;
    }

    public static final class Builder {
        private Integer pageSize; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 
        private String regionId; 
        private Images images; 

        /**
         * The number of entries in the current page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The current page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of images.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Mirror respective geographical ID.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * A collection of Images.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        public DescribeImagesResponseBody build() {
            return new DescribeImagesResponseBody(this);
        } 

    } 

    public static class DiskDeviceMapping extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("ImportOSSBucket")
        private String importOSSBucket;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("ImportOSSObject")
        private String importOSSObject;

        @NameInMap("Device")
        private String device;

        @NameInMap("Size")
        private String size;

        @NameInMap("RemainTime")
        private Integer remainTime;

        @NameInMap("Format")
        private String format;

        private DiskDeviceMapping(Builder builder) {
            this.type = builder.type;
            this.importOSSBucket = builder.importOSSBucket;
            this.progress = builder.progress;
            this.snapshotId = builder.snapshotId;
            this.importOSSObject = builder.importOSSObject;
            this.device = builder.device;
            this.size = builder.size;
            this.remainTime = builder.remainTime;
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMapping create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return importOSSBucket
         */
        public String getImportOSSBucket() {
            return this.importOSSBucket;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return importOSSObject
         */
        public String getImportOSSObject() {
            return this.importOSSObject;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return remainTime
         */
        public Integer getRemainTime() {
            return this.remainTime;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String type; 
            private String importOSSBucket; 
            private String progress; 
            private String snapshotId; 
            private String importOSSObject; 
            private String device; 
            private String size; 
            private Integer remainTime; 
            private String format; 

            /**
             * The type of the image.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The OSS bucket to which the imported Image belongs.
             */
            public Builder importOSSBucket(String importOSSBucket) {
                this.importOSSBucket = importOSSBucket;
                return this;
            }

            /**
             * For replication in the mirror, returns copy the progress of the task.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the snapshot.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The OSS object to which the imported Image belongs.
             */
            public Builder importOSSObject(String importOSSObject) {
                this.importOSSObject = importOSSObject;
                return this;
            }

            /**
             * The device information of the cloud disk, such as/dev/xvdb.
             * <p>
             * 
             * > This parameter will be discontinued soon. We recommend that you do not use this parameter to improve code compatibility.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * Cloud size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * For replication in the mirror, returns replication task the time remaining in seconds.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * The image format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public DiskDeviceMapping build() {
                return new DiskDeviceMapping(this);
            } 

        } 

    }
    public static class DiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        private java.util.List < DiskDeviceMapping> diskDeviceMapping;

        private DiskDeviceMappings(Builder builder) {
            this.diskDeviceMapping = builder.diskDeviceMapping;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMappings create() {
            return builder().build();
        }

        /**
         * @return diskDeviceMapping
         */
        public java.util.List < DiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

        public static final class Builder {
            private java.util.List < DiskDeviceMapping> diskDeviceMapping; 

            /**
             * DiskDeviceMapping.
             */
            public Builder diskDeviceMapping(java.util.List < DiskDeviceMapping> diskDeviceMapping) {
                this.diskDeviceMapping = diskDeviceMapping;
                return this;
            }

            public DiskDeviceMappings build() {
                return new DiskDeviceMappings(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * Mirror the label value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The tag key of the image.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("ImageFamily")
        private String imageFamily;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("IsCopied")
        private Boolean isCopied;

        @NameInMap("IsSupportIoOptimized")
        private Boolean isSupportIoOptimized;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("IsSupportCloudinit")
        private Boolean isSupportCloudinit;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("Usage")
        private String usage;

        @NameInMap("IsSelfShared")
        private String isSelfShared;

        @NameInMap("Description")
        private String description;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("OSNameEn")
        private String OSNameEn;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("OSType")
        private String OSType;

        @NameInMap("IsSubscribed")
        private Boolean isSubscribed;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("IsPublic")
        private Boolean isPublic;

        @NameInMap("ImageOwnerId")
        private Long imageOwnerId;

        @NameInMap("LoginAsNonRootSupported")
        private Boolean loginAsNonRootSupported;

        @NameInMap("SupplierName")
        private String supplierName;

        private Image(Builder builder) {
            this.creationTime = builder.creationTime;
            this.status = builder.status;
            this.imageFamily = builder.imageFamily;
            this.progress = builder.progress;
            this.isCopied = builder.isCopied;
            this.isSupportIoOptimized = builder.isSupportIoOptimized;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.isSupportCloudinit = builder.isSupportCloudinit;
            this.imageVersion = builder.imageVersion;
            this.usage = builder.usage;
            this.isSelfShared = builder.isSelfShared;
            this.description = builder.description;
            this.size = builder.size;
            this.resourceGroupId = builder.resourceGroupId;
            this.platform = builder.platform;
            this.OSNameEn = builder.OSNameEn;
            this.imageName = builder.imageName;
            this.OSName = builder.OSName;
            this.imageId = builder.imageId;
            this.OSType = builder.OSType;
            this.isSubscribed = builder.isSubscribed;
            this.productCode = builder.productCode;
            this.architecture = builder.architecture;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.tags = builder.tags;
            this.isPublic = builder.isPublic;
            this.imageOwnerId = builder.imageOwnerId;
            this.loginAsNonRootSupported = builder.loginAsNonRootSupported;
            this.supplierName = builder.supplierName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return isCopied
         */
        public Boolean getIsCopied() {
            return this.isCopied;
        }

        /**
         * @return isSupportIoOptimized
         */
        public Boolean getIsSupportIoOptimized() {
            return this.isSupportIoOptimized;
        }

        /**
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return isSupportCloudinit
         */
        public Boolean getIsSupportCloudinit() {
            return this.isSupportCloudinit;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        /**
         * @return isSelfShared
         */
        public String getIsSelfShared() {
            return this.isSelfShared;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return OSNameEn
         */
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return isSubscribed
         */
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return diskDeviceMappings
         */
        public DiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return isPublic
         */
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        /**
         * @return imageOwnerId
         */
        public Long getImageOwnerId() {
            return this.imageOwnerId;
        }

        /**
         * @return loginAsNonRootSupported
         */
        public Boolean getLoginAsNonRootSupported() {
            return this.loginAsNonRootSupported;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        public static final class Builder {
            private String creationTime; 
            private String status; 
            private String imageFamily; 
            private String progress; 
            private Boolean isCopied; 
            private Boolean isSupportIoOptimized; 
            private String imageOwnerAlias; 
            private Boolean isSupportCloudinit; 
            private String imageVersion; 
            private String usage; 
            private String isSelfShared; 
            private String description; 
            private Integer size; 
            private String resourceGroupId; 
            private String platform; 
            private String OSNameEn; 
            private String imageName; 
            private String OSName; 
            private String imageId; 
            private String OSType; 
            private Boolean isSubscribed; 
            private String productCode; 
            private String architecture; 
            private DiskDeviceMappings diskDeviceMappings; 
            private Tags tags; 
            private Boolean isPublic; 
            private Long imageOwnerId; 
            private Boolean loginAsNonRootSupported; 
            private String supplierName; 

            /**
             * The time when the image was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The status of the image. Possible values:
             * <p>
             * 
             * -UnAvailable: UnAvailable
             * -Available: Available
             * -Creating: Creating
             * -CreateFailed: Failed to be created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the Image family.
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * The progress of the image completion. Unit: percentage.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Indicates whether the image is copied.
             */
            public Builder isCopied(Boolean isCopied) {
                this.isCopied = isCopied;
                return this;
            }

            /**
             * Indicates whether it can be run on I/O optimized instances.
             */
            public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
                this.isSupportIoOptimized = isSupportIoOptimized;
                return this;
            }

            /**
             * The source of the image. Possible values:
             * <p>
             * 
             * -system: a public image provided by Alibaba Cloud.
             * -self: The custom image you created.
             * -others: shared images or Community images provided by other Alibaba Cloud users.
             * -marketplace: The image provided by the marketplace.
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * Indicates whether Cloud Init is supported.
             */
            public Builder isSupportCloudinit(Boolean isSupportCloudinit) {
                this.isSupportCloudinit = isSupportCloudinit;
                return this;
            }

            /**
             * The version of the image.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * The type of the resource to be referenced. Possible values:
             * <p>
             * 
             * -instance: one or more ECS instances are created.
             * -none: no ECS instance has been created.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * Indicates whether the custom image has been shared with other users.
             */
            public Builder isSelfShared(String isSelfShared) {
                this.isSelfShared = isSelfShared;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The size of the image. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the resource group to which the image belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The operating system platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The name of the operating system.
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * The name of the image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The Chinese display name of the operating system.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The operating system type. Possible values:
             * <p>
             * 
             * -windows
             * -Linux
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * Indicates whether you have subscribed to the terms of service of the image product corresponding to the product code of the image.
             */
            public Builder isSubscribed(Boolean isSubscribed) {
                this.isSubscribed = isSubscribed;
                return this;
            }

            /**
             * The ID of the image product in the marketplace.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The architecture type of the image system. Possible values:
             * <p>
             * 
             * -i386
             * -x86_64
             * -arm64
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The mapping between disks and snapshots in an image.
             */
            public Builder diskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * The tag pair of the image.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <props = "intl"> indicates whether the image is a public image. Public images include public images provided by Alibaba Cloud and custom images that you have published as Community images. Possible value:</props>
             * <p>
             * <props="intl">
             * -true: Open mirror
             * -false: closed mirror
             * 
             * </props>
             * 
             * 
             * 
             */
            public Builder isPublic(Boolean isPublic) {
                this.isPublic = isPublic;
                return this;
            }

            /**
             * <props = "china"> The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query a shared image. </props>
             * <p>
             * 
             * <props = "intl"> The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images and Community images. </props>
             * 
             * <props = "partner"> The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query a shared image. </props>
             */
            public Builder imageOwnerId(Long imageOwnerId) {
                this.imageOwnerId = imageOwnerId;
                return this;
            }

            /**
             * LoginAsNonRootSupported.
             */
            public Builder loginAsNonRootSupported(Boolean loginAsNonRootSupported) {
                this.loginAsNonRootSupported = loginAsNonRootSupported;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class Images extends TeaModel {
        @NameInMap("Image")
        private java.util.List < Image> image;

        private Images(Builder builder) {
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public java.util.List < Image> getImage() {
            return this.image;
        }

        public static final class Builder {
            private java.util.List < Image> image; 

            /**
             * Image.
             */
            public Builder image(java.util.List < Image> image) {
                this.image = image;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
