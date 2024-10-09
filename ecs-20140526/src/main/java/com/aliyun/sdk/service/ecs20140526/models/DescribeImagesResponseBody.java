// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagesResponseBody</p>
 */
public class DescribeImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Images")
    private Images images;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The information of the images.</p>
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66189103-EDB2-43E2-BB60-BFF2B62F4EB8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImagesResponseBody build() {
            return new DescribeImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RiskCode")
        private String riskCode;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Nvme</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The risk that the check item may have.</p>
             * 
             * <strong>example:</strong>
             * <p>NVMe.NotInstallded</p>
             */
            public Builder riskCode(String riskCode) {
                this.riskCode = riskCode;
                return this;
            }

            /**
             * <p>The severity of the risk that the check item of the imported custom image has. If the check item is at risk, this parameter is returned. If the check item is not at risk, this parameter is not returned.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>High: The check item is a high-risk item that may affect the startup of the instance. We recommend that you handle the risk.</li>
             * <li>Medium: The check item is a medium-risk item that may affect the startup performance or configurations of the instance. We recommend that you handle the risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The result of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Supported</p>
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
    /**
     * 
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
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
    /**
     * 
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class DetectionOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private Items items;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The check items.</p>
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The state of the image check task. Valid values:</p>
             * <ul>
             * <li>Processing</li>
             * <li>Finished</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Processing</p>
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
    /**
     * 
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RemainTime")
        private Integer remainTime;

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
             * <p>The device name of the disk. Example: /dev/xvdb.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvda</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The format of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>qcow2</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) bucket that contains the imported image file.</p>
             * 
             * <strong>example:</strong>
             * <p>testEcsImport</p>
             */
            public Builder importOSSBucket(String importOSSBucket) {
                this.importOSSBucket = importOSSBucket;
                return this;
            }

            /**
             * <p>The OSS object that corresponds to the imported image file.</p>
             * 
             * <strong>example:</strong>
             * <p>imageImport</p>
             */
            public Builder importOSSObject(String importOSSObject) {
                this.importOSSObject = importOSSObject;
                return this;
            }

            /**
             * <p>The progress of the image copy task.</p>
             * 
             * <strong>example:</strong>
             * <p>32%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The remaining time of the image copy task. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>233</p>
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp17ot2q7x72ggtw****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
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
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class DiskDeviceMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskDeviceMapping")
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
    /**
     * 
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
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
             * <p>Indicates whether the image supports the Non-Volatile Memory Express (NVMe) protocol. Valid values:</p>
             * <ul>
             * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
             * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
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
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
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

            /**
             * <p>The tag key of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Oracle</p>
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
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BootMode")
        private String bootMode;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DetectionOptions")
        private DetectionOptions detectionOptions;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("Features")
        private Features features;

        @com.aliyun.core.annotation.NameInMap("ImageFamily")
        private String imageFamily;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerId")
        private Long imageOwnerId;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("IsCopied")
        private Boolean isCopied;

        @com.aliyun.core.annotation.NameInMap("IsPublic")
        private Boolean isPublic;

        @com.aliyun.core.annotation.NameInMap("IsSelfShared")
        private String isSelfShared;

        @com.aliyun.core.annotation.NameInMap("IsSubscribed")
        private Boolean isSubscribed;

        @com.aliyun.core.annotation.NameInMap("IsSupportCloudinit")
        private Boolean isSupportCloudinit;

        @com.aliyun.core.annotation.NameInMap("IsSupportIoOptimized")
        private Boolean isSupportIoOptimized;

        @com.aliyun.core.annotation.NameInMap("LoginAsNonRootSupported")
        private Boolean loginAsNonRootSupported;

        @com.aliyun.core.annotation.NameInMap("OSName")
        private String OSName;

        @com.aliyun.core.annotation.NameInMap("OSNameEn")
        private String OSNameEn;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Usage")
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
             * <p>The architecture of the image. Valid values:</p>
             * <ul>
             * <li>i386</li>
             * <li>x86_64</li>
             * <li>arm64</li>
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
             * <p>The boot mode of the image. Valid values:</p>
             * <ul>
             * <li>BIOS: Basic Input/Output System (BIOS)</li>
             * <li>UEFI: Unified Extensible Firmware Interface (UEFI)</li>
             * <li>UEFI-Preferred: BIOS and UEFI</li>
             * </ul>
             * <p>For information about the image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>BIOS</p>
             */
            public Builder bootMode(String bootMode) {
                this.bootMode = bootMode;
                return this;
            }

            /**
             * <p>The time when the image was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-15T06:07:05Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Archive log for Oracle</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Details about the check performed on the image.</p>
             */
            public Builder detectionOptions(DetectionOptions detectionOptions) {
                this.detectionOptions = detectionOptions;
                return this;
            }

            /**
             * <p>The mappings between disks and snapshots in the image.</p>
             */
            public Builder diskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * <p>The attributes of the image.</p>
             */
            public Builder features(Features features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The name of the image family.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou-daily-update</p>
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
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
             * <p>The source of the image. Valid values:</p>
             * <ul>
             * <li>system: a public image provided by Alibaba Cloud</li>
             * <li>self: a custom image that you created</li>
             * <li>others: a shared image from another Alibaba Cloud account or a community image published by another Alibaba Cloud account</li>
             * <li>marketplace: an Alibaba Cloud Marketplace image</li>
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
             * <p>The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only if you query shared images or community images.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder imageOwnerId(Long imageOwnerId) {
                this.imageOwnerId = imageOwnerId;
                return this;
            }

            /**
             * <p>The version of the image.</p>
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
             * <p>Indicates whether the image is publicly available. Publicly available images include public images provided by Alibaba Cloud and custom images published as community images. Valid values:</p>
             * <ul>
             * <li>true: The image is publicly available.</li>
             * <li>false: The image is publicly unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isPublic(Boolean isPublic) {
                this.isPublic = isPublic;
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
             * <p>Indicates whether you accepted the Terms of Service of the image service that corresponds to the product code.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isSubscribed(Boolean isSubscribed) {
                this.isSubscribed = isSubscribed;
                return this;
            }

            /**
             * <p>Indicates whether the image supports cloud-init.</p>
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
             * <p>Indicates whether the image supports logons of non-root users. Valid values:</p>
             * <ul>
             * <li>true: The image supports logons of non-root users.</li>
             * <li>false: The image does not support logons of non-root users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder loginAsNonRootSupported(Boolean loginAsNonRootSupported) {
                this.loginAsNonRootSupported = loginAsNonRootSupported;
                return this;
            }

            /**
             * <p>The display name of the operating system in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Server 2016 Datacenter Edition 64-bit (Simplified Chinese)</p>
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * <p>The display name of the operating system in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Server  2016 Data Center Edition 64bit Chinese Edition</p>
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
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
             * <p>windows</p>
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * <p>The operating system platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Server 2016</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Marketplace product code of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>test000****</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The creation progress of the image. Unit: percent (%).</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the image belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The size of the image. Unit: GiB.</p>
             * <blockquote>
             * <p> If the image contains data disk snapshots, this parameter indicates only the size of the system disk snapshot contained in the image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The state of the image. Valid values:</p>
             * <ul>
             * <li>UnAvailable: The image is unavailable.</li>
             * <li>Available: The image is available.</li>
             * <li>Creating: The image is being created.</li>
             * <li>CreateFailed: The image failed to be created.</li>
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
             * <p>The name of the supplier that published the community image.</p>
             * 
             * <strong>example:</strong>
             * <p>TestName</p>
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
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
             * <p>Indicates whether the image was used to create ECS instances. Valid values:</p>
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
    /**
     * 
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Image")
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
