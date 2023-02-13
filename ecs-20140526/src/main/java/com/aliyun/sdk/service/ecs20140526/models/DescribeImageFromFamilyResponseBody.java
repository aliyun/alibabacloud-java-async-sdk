// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFromFamilyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageFromFamilyResponseBody</p>
 */
public class DescribeImageFromFamilyResponseBody extends TeaModel {
    @NameInMap("Image")
    private Image image;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImageFromFamilyResponseBody(Builder builder) {
        this.image = builder.image;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageFromFamilyResponseBody create() {
        return builder().build();
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Image image; 
        private String requestId; 

        /**
         * The image information.
         */
        public Builder image(Image image) {
            this.image = image;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageFromFamilyResponseBody build() {
            return new DescribeImageFromFamilyResponseBody(this);
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
            private String size; 
            private String snapshotId; 
            private String type; 

            /**
             * The device name of the disk. Example: /dev/xvdb.
             * <p>
             * 
             * >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The format of the image.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The OSS bucket that contains the imported image file.
             */
            public Builder importOSSBucket(String importOSSBucket) {
                this.importOSSBucket = importOSSBucket;
                return this;
            }

            /**
             * The OSS object corresponding to the imported image file.
             */
            public Builder importOSSObject(String importOSSObject) {
                this.importOSSObject = importOSSObject;
                return this;
            }

            /**
             * The size of the disk. Unit: GiB.
             */
            public Builder size(String size) {
                this.size = size;
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
             * The type of the image.
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
             * The tag key of the image.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the image.
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

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @NameInMap("ImageFamily")
        private String imageFamily;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("IsCopied")
        private Boolean isCopied;

        @NameInMap("IsSelfShared")
        private String isSelfShared;

        @NameInMap("IsSubscribed")
        private Boolean isSubscribed;

        @NameInMap("IsSupportCloudinit")
        private Boolean isSupportCloudinit;

        @NameInMap("IsSupportIoOptimized")
        private Boolean isSupportIoOptimized;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("OSType")
        private String OSType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Usage")
        private String usage;

        private Image(Builder builder) {
            this.architecture = builder.architecture;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.imageFamily = builder.imageFamily;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.imageVersion = builder.imageVersion;
            this.isCopied = builder.isCopied;
            this.isSelfShared = builder.isSelfShared;
            this.isSubscribed = builder.isSubscribed;
            this.isSupportCloudinit = builder.isSupportCloudinit;
            this.isSupportIoOptimized = builder.isSupportIoOptimized;
            this.OSName = builder.OSName;
            this.OSType = builder.OSType;
            this.platform = builder.platform;
            this.productCode = builder.productCode;
            this.progress = builder.progress;
            this.size = builder.size;
            this.status = builder.status;
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
         * @return diskDeviceMappings
         */
        public DiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
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
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
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
            private String creationTime; 
            private String description; 
            private DiskDeviceMappings diskDeviceMappings; 
            private String imageFamily; 
            private String imageId; 
            private String imageName; 
            private String imageOwnerAlias; 
            private String imageVersion; 
            private Boolean isCopied; 
            private String isSelfShared; 
            private Boolean isSubscribed; 
            private Boolean isSupportCloudinit; 
            private Boolean isSupportIoOptimized; 
            private String OSName; 
            private String OSType; 
            private String platform; 
            private String productCode; 
            private String progress; 
            private Integer size; 
            private String status; 
            private Tags tags; 
            private String usage; 

            /**
             * The image architecture. Valid values:
             * <p>
             * 
             * *   i386
             * *   x86\_64
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The time when the image was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the image.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The mappings between the disks and snapshots under the image.
             */
            public Builder diskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * The name of the image family.
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
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
             * The name of the image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The alias of the image owner. Valid values:
             * <p>
             * 
             * - system: public images provided by Alibaba Cloud
             * - self: your custom images
             * - others: shared images from other Alibaba Cloud accounts
             * - marketplace: Alibaba Cloud Marketplace images
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
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
             * Indicates whether the image is a copy of another image.
             */
            public Builder isCopied(Boolean isCopied) {
                this.isCopied = isCopied;
                return this;
            }

            /**
             * Indicates whether the image has been shared to other Alibaba Cloud accounts.
             */
            public Builder isSelfShared(String isSelfShared) {
                this.isSelfShared = isSelfShared;
                return this;
            }

            /**
             * Indicates whether you have subscribed to the image corresponding to the specified product code.
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
             * The name of the operating system.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * The type of the operating system. Valid values:
             * <p>
             * 
             * - windows
             * - linux
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * The platform of the operating system.
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
             * The size of the image. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the image. Valid values:
             * <p>
             * 
             * - UnAvailable: The image is unavailable.
             * - Available: The image is available.
             * - Creating: The image is being created.
             * - CreateFailed: The image failed to be created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * An array that consists of Tag data.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether the image has been used to create ECS instances. Valid values:
             * <p>
             * 
             * - instance: The image has been used to create one or more ECS instances.
             * - none: The image has not been used to create ECS instances.
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
}
