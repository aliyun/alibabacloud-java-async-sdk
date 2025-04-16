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
 * {@link DescribeImageFromFamilyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageFromFamilyResponseBody</p>
 */
public class DescribeImageFromFamilyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private Image image;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeImageFromFamilyResponseBody model) {
            this.image = model.image;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The image information.</p>
         */
        public Builder image(Image image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageFromFamilyResponseBody build() {
            return new DescribeImageFromFamilyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageFromFamilyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageFromFamilyResponseBody</p>
     */
    public static class DiskDeviceMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("ImportOSSBucket")
        private String importOSSBucket;

        @com.aliyun.core.annotation.NameInMap("ImportOSSObject")
        private String importOSSObject;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(DiskDeviceMapping model) {
                this.device = model.device;
                this.format = model.format;
                this.importOSSBucket = model.importOSSBucket;
                this.importOSSObject = model.importOSSObject;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
                this.type = model.type;
            } 

            /**
             * <p>The device name of the disk. Example: /dev/xvdb.</p>
             * <blockquote>
             * <p> This parameter will be removed in the future. To ensure compatibility, we recommend that you use other parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvdb</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The image format.</p>
             * 
             * <strong>example:</strong>
             * <p>qcow2</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The OSS bucket that contains the imported image file.</p>
             * 
             * <strong>example:</strong>
             * <p>testEcsImport</p>
             */
            public Builder importOSSBucket(String importOSSBucket) {
                this.importOSSBucket = importOSSBucket;
                return this;
            }

            /**
             * <p>The OSS object to which the imported image belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>imageImport</p>
             */
            public Builder importOSSObject(String importOSSObject) {
                this.importOSSObject = importOSSObject;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp17ot2q7x72ggtw****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The image type.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
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
    /**
     * 
     * {@link DescribeImageFromFamilyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageFromFamilyResponseBody</p>
     */
    public static class DiskDeviceMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskDeviceMapping")
        private java.util.List<DiskDeviceMapping> diskDeviceMapping;

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
        public java.util.List<DiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

        public static final class Builder {
            private java.util.List<DiskDeviceMapping> diskDeviceMapping; 

            private Builder() {
            } 

            private Builder(DiskDeviceMappings model) {
                this.diskDeviceMapping = model.diskDeviceMapping;
            } 

            /**
             * DiskDeviceMapping.
             */
            public Builder diskDeviceMapping(java.util.List<DiskDeviceMapping> diskDeviceMapping) {
                this.diskDeviceMapping = diskDeviceMapping;
                return this;
            }

            public DiskDeviceMappings build() {
                return new DiskDeviceMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageFromFamilyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageFromFamilyResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeImageFromFamilyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageFromFamilyResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageFromFamilyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageFromFamilyResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("ImageFamily")
        private String imageFamily;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("IsCopied")
        private Boolean isCopied;

        @com.aliyun.core.annotation.NameInMap("IsSelfShared")
        private String isSelfShared;

        @com.aliyun.core.annotation.NameInMap("IsSubscribed")
        private Boolean isSubscribed;

        @com.aliyun.core.annotation.NameInMap("IsSupportCloudinit")
        private Boolean isSupportCloudinit;

        @com.aliyun.core.annotation.NameInMap("IsSupportIoOptimized")
        private Boolean isSupportIoOptimized;

        @com.aliyun.core.annotation.NameInMap("OSName")
        private String OSName;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Usage")
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

            private Builder() {
            } 

            private Builder(Image model) {
                this.architecture = model.architecture;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.diskDeviceMappings = model.diskDeviceMappings;
                this.imageFamily = model.imageFamily;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.imageVersion = model.imageVersion;
                this.isCopied = model.isCopied;
                this.isSelfShared = model.isSelfShared;
                this.isSubscribed = model.isSubscribed;
                this.isSupportCloudinit = model.isSupportCloudinit;
                this.isSupportIoOptimized = model.isSupportIoOptimized;
                this.OSName = model.OSName;
                this.OSType = model.OSType;
                this.platform = model.platform;
                this.productCode = model.productCode;
                this.progress = model.progress;
                this.size = model.size;
                this.status = model.status;
                this.tags = model.tags;
                this.usage = model.usage;
            } 

            /**
             * <p>The architecture of the image. Valid values:</p>
             * <ul>
             * <li>i386</li>
             * <li>x86_64</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The time when the image was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-10T01:01:10Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mappings between the disk and the snapshot in the image.</p>
             */
            public Builder diskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * <p>The name of the image family.</p>
             * 
             * <strong>example:</strong>
             * <p>testImageFamily</p>
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1g7004ksh0oeuc****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>testImageName</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The alias of the image owner. Valid values:</p>
             * <ul>
             * <li>system: public images provided by Alibaba Cloud</li>
             * <li>self: your custom images</li>
             * <li>others: shared images from other Alibaba Cloud accounts</li>
             * <li>marketplace: Alibaba Cloud Marketplace images</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>self</p>
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * <p>The image version.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>Indicates whether the image is a copy of another image.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCopied(Boolean isCopied) {
                this.isCopied = isCopied;
                return this;
            }

            /**
             * <p>Indicates whether the custom image was shared to other Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSelfShared(String isSelfShared) {
                this.isSelfShared = isSelfShared;
                return this;
            }

            /**
             * <p>Indicates whether you have subscribed to the service terms of the image product corresponding to the image product code.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isSubscribed(Boolean isSubscribed) {
                this.isSubscribed = isSubscribed;
                return this;
            }

            /**
             * <p>Indicates whether cloud-init is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSupportCloudinit(Boolean isSupportCloudinit) {
                this.isSupportCloudinit = isSupportCloudinit;
                return this;
            }

            /**
             * <p>Indicates whether the image can be used on I/O optimized instances.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
                this.isSupportIoOptimized = isSupportIoOptimized;
                return this;
            }

            /**
             * <p>The display name of the operating system in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Linux 2.1903</p>
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * <p>The type of the operating system. Valid values:</p>
             * <ul>
             * <li>windows</li>
             * <li>linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * <p>The operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The product code of the Alibaba Cloud Marketplace image.</p>
             * 
             * <strong>example:</strong>
             * <p>jxsc00****</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The image creation progress in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The size of the image. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The state of the image. Valid values:</p>
             * <ul>
             * <li>UnAvailable</li>
             * <li>Available</li>
             * <li>Creating</li>
             * <li>CreateFailed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the image.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates whether the image has been used to create ECS instances. Valid values:</p>
             * <ul>
             * <li>instance: The image was used to create one or more ECS instances.</li>
             * <li>none: The image was not used to create ECS instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
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
