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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Image")
    private Image image;

    private DescribeImageFromFamilyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageFromFamilyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    public static final class Builder {
        private String requestId; 
        private Image image; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned image information.
         */
        public Builder image(Image image) {
            this.image = image;
            return this;
        }

        public DescribeImageFromFamilyResponseBody build() {
            return new DescribeImageFromFamilyResponseBody(this);
        } 

    } 

    public static class DiskDeviceMapping extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("ImportOSSBucket")
        private String importOSSBucket;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("ImportOSSObject")
        private String importOSSObject;

        @NameInMap("Size")
        private String size;

        @NameInMap("Device")
        private String device;

        @NameInMap("Format")
        private String format;

        private DiskDeviceMapping(Builder builder) {
            this.type = builder.type;
            this.importOSSBucket = builder.importOSSBucket;
            this.snapshotId = builder.snapshotId;
            this.importOSSObject = builder.importOSSObject;
            this.size = builder.size;
            this.device = builder.device;
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
         * @return size
         */
        public String getSize() {
            return this.size;
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

        public static final class Builder {
            private String type; 
            private String importOSSBucket; 
            private String snapshotId; 
            private String importOSSObject; 
            private String size; 
            private String device; 
            private String format; 

            /**
             * The type of the image.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The OSS Bucket to which the imported Image belongs.
             */
            public Builder importOSSBucket(String importOSSBucket) {
                this.importOSSBucket = importOSSBucket;
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
             * The OSS Object to which the imported Image belongs.
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
             * The device information of the cloud disk, such as/dev/xvdb.
             * <p>
             * > This parameter will be discontinued soon. We recommend that you do not use this parameter to improve code compatibility.
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
             * The tag value of the custom image.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The tag key of the custom image.
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

        @NameInMap("Platform")
        private String platform;

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
            this.platform = builder.platform;
            this.imageName = builder.imageName;
            this.OSName = builder.OSName;
            this.imageId = builder.imageId;
            this.OSType = builder.OSType;
            this.isSubscribed = builder.isSubscribed;
            this.productCode = builder.productCode;
            this.architecture = builder.architecture;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.tags = builder.tags;
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
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
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
            private String platform; 
            private String imageName; 
            private String OSName; 
            private String imageId; 
            private String OSType; 
            private Boolean isSubscribed; 
            private String productCode; 
            private String architecture; 
            private DiskDeviceMappings diskDeviceMappings; 
            private Tags tags; 

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
             * The image family is.
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
             * The alias of the image owner. Possible values:
             * <p>
             * -system: public image.
             * -self: your custom image.
             * -others: public images of other users.
             * -marketplace: Alibaba Cloud marketplace image.
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * Indicates whether cloud-init is supported.
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
             * The operating system platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
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
             * -Windows
             * -linux
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * Indicates whether you have subscribed to the terms of service of the image product corresponding to the image product code.
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
             * -i386
             * -x86_64
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

            public Image build() {
                return new Image(this);
            } 

        } 

    }
}
