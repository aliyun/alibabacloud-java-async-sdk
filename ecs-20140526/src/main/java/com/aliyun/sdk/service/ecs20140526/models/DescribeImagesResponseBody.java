// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("Images")
    private Images images;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return images
     */
    public Images getImages() {
        return this.images;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder {
        private Images images; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the images.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * The page number returned.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the image.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
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

        public DescribeImagesResponseBody build() {
            return new DescribeImagesResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("RiskCode")
        private String riskCode;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("Value")
        private String value;

        private Item(Builder builder) {
            this.name = builder.name;
            this.riskCode = builder.riskCode;
            this.riskLevel = builder.riskLevel;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return riskCode
         */
        public String getRiskCode() {
            return this.riskCode;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String riskCode; 
            private String riskLevel; 
            private String value; 

            /**
             * The name of the check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The risk that is detected on the check item.
             */
            public Builder riskCode(String riskCode) {
                this.riskCode = riskCode;
                return this;
            }

            /**
             * The severity level of the risk that is detected on the check item of the imported custom image. If the system detects a risk on the check item, this parameter is returned. If the system does not detect a risk on the check item, this parameter is not returned.
             * <p>
             * 
             * Valid values:
             * 
             * *   High: The check item is a high-risk item that may affect the startup of the instance and mustbe fixed at your earliest convenience.
             * *   Medium: The check item is a medium-risk item that may affect the startup performance or configurations of the instance. We recommend that you fix this item.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The result of the check item.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class DetectionOptions extends TeaModel {
        @NameInMap("Items")
        private Items items;

        @NameInMap("Status")
        private String status;

        private DetectionOptions(Builder builder) {
            this.items = builder.items;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionOptions create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public Items getItems() {
            return this.items;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Items items; 
            private String status; 

            /**
             * The check items.
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            /**
             * The status of the image check task. Valid values:
             * <p>
             * 
             * *   Processing: The image check task is in progress.
             * *   Finished: The image check task is completed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DetectionOptions build() {
                return new DetectionOptions(this);
            } 

        } 

    }
    public static class DiskDeviceMapping extends TeaModel {
        @NameInMap("Device")
        private String device;

        @NameInMap("Format")
        private String format;

        @NameInMap("ImportOSSBucket")
        private String importOSSBucket;

        @NameInMap("ImportOSSObject")
        private String importOSSObject;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("RemainTime")
        private Integer remainTime;

        @NameInMap("Size")
        private String size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Type")
        private String type;

        private DiskDeviceMapping(Builder builder) {
            this.device = builder.device;
            this.format = builder.format;
            this.importOSSBucket = builder.importOSSBucket;
            this.importOSSObject = builder.importOSSObject;
            this.progress = builder.progress;
            this.remainTime = builder.remainTime;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
            this.type = builder.type;
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
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return importOSSBucket
         */
        public String getImportOSSBucket() {
            return this.importOSSBucket;
        }

        /**
         * @return importOSSObject
         */
        public String getImportOSSObject() {
            return this.importOSSObject;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return remainTime
         */
        public Integer getRemainTime() {
            return this.remainTime;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String device; 
            private String format; 
            private String importOSSBucket; 
            private String importOSSObject; 
            private String progress; 
            private Integer remainTime; 
            private String size; 
            private String snapshotId; 
            private String type; 

            /**
             * The device name of the disk. Example: /dev/xvdb.
             * <p>
             * 
             * > This parameter will be removed in the future. To ensure compatibility, we recommend that you use other parameters.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The image format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The Object Storage Service (OSS) bucket that contains the imported image file.
             */
            public Builder importOSSBucket(String importOSSBucket) {
                this.importOSSBucket = importOSSBucket;
                return this;
            }

            /**
             * The OSS object that corresponds to the imported image file.
             */
            public Builder importOSSObject(String importOSSObject) {
                this.importOSSObject = importOSSObject;
                return this;
            }

            /**
             * The progress of an image copy task.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The remaining amount of time required for an image copy task. Unit: seconds.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * The disk size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * The snapshot ID.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The image type.
             */
            public Builder type(String type) {
                this.type = type;
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
    public static class Features extends TeaModel {
        @NameInMap("NvmeSupport")
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
             * Indicates whether the image supports the Non-Volatile Memory Express (NVMe) protocol. Valid values:
             * <p>
             * 
             * *   supported: The image supports the NVMe protocol. Instances created from this image support NVMe.
             * *   unsupported: The image does not support the NVMe protocol. Instances created from this image do not support the NVMe protocol.
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The key of tag N of the image.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of tag N of the image.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
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
        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("BootMode")
        private String bootMode;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DetectionOptions")
        private DetectionOptions detectionOptions;

        @NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @NameInMap("Features")
        private Features features;

        @NameInMap("ImageFamily")
        private String imageFamily;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("ImageOwnerId")
        private Long imageOwnerId;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("IsCopied")
        private Boolean isCopied;

        @NameInMap("IsPublic")
        private Boolean isPublic;

        @NameInMap("IsSelfShared")
        private String isSelfShared;

        @NameInMap("IsSubscribed")
        private Boolean isSubscribed;

        @NameInMap("IsSupportCloudinit")
        private Boolean isSupportCloudinit;

        @NameInMap("IsSupportIoOptimized")
        private Boolean isSupportIoOptimized;

        @NameInMap("LoginAsNonRootSupported")
        private Boolean loginAsNonRootSupported;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("OSNameEn")
        private String OSNameEn;

        @NameInMap("OSType")
        private String OSType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupplierName")
        private String supplierName;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Usage")
        private String usage;

        private Image(Builder builder) {
            this.architecture = builder.architecture;
            this.bootMode = builder.bootMode;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.detectionOptions = builder.detectionOptions;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.features = builder.features;
            this.imageFamily = builder.imageFamily;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.imageOwnerId = builder.imageOwnerId;
            this.imageVersion = builder.imageVersion;
            this.isCopied = builder.isCopied;
            this.isPublic = builder.isPublic;
            this.isSelfShared = builder.isSelfShared;
            this.isSubscribed = builder.isSubscribed;
            this.isSupportCloudinit = builder.isSupportCloudinit;
            this.isSupportIoOptimized = builder.isSupportIoOptimized;
            this.loginAsNonRootSupported = builder.loginAsNonRootSupported;
            this.OSName = builder.OSName;
            this.OSNameEn = builder.OSNameEn;
            this.OSType = builder.OSType;
            this.platform = builder.platform;
            this.productCode = builder.productCode;
            this.progress = builder.progress;
            this.resourceGroupId = builder.resourceGroupId;
            this.size = builder.size;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
            this.tags = builder.tags;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detectionOptions
         */
        public DetectionOptions getDetectionOptions() {
            return this.detectionOptions;
        }

        /**
         * @return diskDeviceMappings
         */
        public DiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
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
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return imageOwnerId
         */
        public Long getImageOwnerId() {
            return this.imageOwnerId;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return isCopied
         */
        public Boolean getIsCopied() {
            return this.isCopied;
        }

        /**
         * @return isPublic
         */
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        /**
         * @return isSelfShared
         */
        public String getIsSelfShared() {
            return this.isSelfShared;
        }

        /**
         * @return isSubscribed
         */
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        /**
         * @return isSupportCloudinit
         */
        public Boolean getIsSupportCloudinit() {
            return this.isSupportCloudinit;
        }

        /**
         * @return isSupportIoOptimized
         */
        public Boolean getIsSupportIoOptimized() {
            return this.isSupportIoOptimized;
        }

        /**
         * @return loginAsNonRootSupported
         */
        public Boolean getLoginAsNonRootSupported() {
            return this.loginAsNonRootSupported;
        }

        /**
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return OSNameEn
         */
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String architecture; 
            private String bootMode; 
            private String creationTime; 
            private String description; 
            private DetectionOptions detectionOptions; 
            private DiskDeviceMappings diskDeviceMappings; 
            private Features features; 
            private String imageFamily; 
            private String imageId; 
            private String imageName; 
            private String imageOwnerAlias; 
            private Long imageOwnerId; 
            private String imageVersion; 
            private Boolean isCopied; 
            private Boolean isPublic; 
            private String isSelfShared; 
            private Boolean isSubscribed; 
            private Boolean isSupportCloudinit; 
            private Boolean isSupportIoOptimized; 
            private Boolean loginAsNonRootSupported; 
            private String OSName; 
            private String OSNameEn; 
            private String OSType; 
            private String platform; 
            private String productCode; 
            private String progress; 
            private String resourceGroupId; 
            private Integer size; 
            private String status; 
            private String supplierName; 
            private Tags tags; 
            private String usage; 

            /**
             * The architecture of the image. Valid values:
             * <p>
             * 
             * *   i386
             * *   x86\_64
             * *   arm64
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The boot mode of the image. Valid values:
             * <p>
             * 
             * *   BIOS
             * *   UEFI
             * 
             * > When you use this parameter to change the boot mode of the image, specify a boot mode supported by the image. We recommend that you familiarize yourself with the boot modes supported by the specified image to ensure that instances that use this image can be started as expected.
             */
            public Builder bootMode(String bootMode) {
                this.bootMode = bootMode;
                return this;
            }

            /**
             * The image creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The image description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Details about the check performed on the image.
             */
            public Builder detectionOptions(DetectionOptions detectionOptions) {
                this.detectionOptions = detectionOptions;
                return this;
            }

            /**
             * The mappings between the disks and snapshots in the image.
             */
            public Builder diskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * The image attributes.
             */
            public Builder features(Features features) {
                this.features = features;
                return this;
            }

            /**
             * The image family name.
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The image name.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The image source. Valid values:
             * <p>
             * 
             * *   system: public images provided by Alibaba Cloud
             * *   self: your custom images
             * *   others: shared images from other Alibaba Cloud accounts, or community images published by other Alibaba Cloud accounts
             * *   marketplace: Alibaba Cloud Marketplace images.
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images or community images.
             */
            public Builder imageOwnerId(Long imageOwnerId) {
                this.imageOwnerId = imageOwnerId;
                return this;
            }

            /**
             * The image version.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * Indicates whether the image is a copy of another image.
             */
            public Builder isCopied(Boolean isCopied) {
                this.isCopied = isCopied;
                return this;
            }

            /**
             * Indicates whether the image is publicly available. Publicly available images include public images provided by Alibaba Cloud and custom images published as community images. Valid values:
             * <p>
             * 
             * *   true: The image is publicly available.
             * *   false: The image is not publicly available.
             */
            public Builder isPublic(Boolean isPublic) {
                this.isPublic = isPublic;
                return this;
            }

            /**
             * Indicates whether the custom image was shared to other Alibaba Cloud accounts.
             */
            public Builder isSelfShared(String isSelfShared) {
                this.isSelfShared = isSelfShared;
                return this;
            }

            /**
             * Indicates whether the Terms of Service of the image service that corresponds to the product code are accepted.
             */
            public Builder isSubscribed(Boolean isSubscribed) {
                this.isSubscribed = isSubscribed;
                return this;
            }

            /**
             * Indicates whether the image supports cloud-init.
             */
            public Builder isSupportCloudinit(Boolean isSupportCloudinit) {
                this.isSupportCloudinit = isSupportCloudinit;
                return this;
            }

            /**
             * Indicates whether the image can be used on I/O optimized instances.
             */
            public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
                this.isSupportIoOptimized = isSupportIoOptimized;
                return this;
            }

            /**
             * Indicates whether the image supports logons of non-root users. Valid values:
             * <p>
             * 
             * *   true: The image supports logons of non-root users.
             * *   false: The image does not support logons of non-root users.
             */
            public Builder loginAsNonRootSupported(Boolean loginAsNonRootSupported) {
                this.loginAsNonRootSupported = loginAsNonRootSupported;
                return this;
            }

            /**
             * The display name of the operating system in Chinese.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * The display name of the operating system in English.
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * The type of the operating system. Valid values:
             * <p>
             * 
             * *   windows
             * *   linux
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * The operating system.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The product code of the Alibaba Cloud Marketplace image.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The image creation progress. Unit: percent (%).
             */
            public Builder progress(String progress) {
                this.progress = progress;
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
             * The image size. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The image status. Valid values:
             * <p>
             * 
             * *   UnAvailable: The image is unavailable.
             * *   Available: The image is available.
             * *   Creating: The image is being created.
             * *   CreateFailed: The image cannot be created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the provider that published the community image.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * The image tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether the image was used to create ECS instances. Valid values:
             * <p>
             * 
             * *   instance: The image was used to create one or more ECS instances.
             * *   none: The image was not used to create ECS instances.
             */
            public Builder usage(String usage) {
                this.usage = usage;
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
