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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeImagesResponseBody model) {
            this.images = model.images;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Images.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The page number.</p>
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

            private Builder() {
            } 

            private Builder(Item model) {
                this.name = model.name;
                this.riskCode = model.riskCode;
                this.riskLevel = model.riskLevel;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RiskCode.
             */
            public Builder riskCode(String riskCode) {
                this.riskCode = riskCode;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * Value.
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
        private java.util.List<Item> item;

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
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.item = model.item;
            } 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
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

            private Builder() {
            } 

            private Builder(DetectionOptions model) {
                this.items = model.items;
                this.status = model.status;
            } 

            /**
             * Items.
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            /**
             * Status.
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

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

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
            this.encrypted = builder.encrypted;
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
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
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
            private Boolean encrypted; 
            private String format; 
            private String importOSSBucket; 
            private String importOSSObject; 
            private String progress; 
            private Integer remainTime; 
            private String size; 
            private String snapshotId; 
            private String type; 

            private Builder() {
            } 

            private Builder(DiskDeviceMapping model) {
                this.device = model.device;
                this.encrypted = model.encrypted;
                this.format = model.format;
                this.importOSSBucket = model.importOSSBucket;
                this.importOSSObject = model.importOSSObject;
                this.progress = model.progress;
                this.remainTime = model.remainTime;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
                this.type = model.type;
            } 

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * ImportOSSBucket.
             */
            public Builder importOSSBucket(String importOSSBucket) {
                this.importOSSBucket = importOSSBucket;
                return this;
            }

            /**
             * ImportOSSObject.
             */
            public Builder importOSSObject(String importOSSObject) {
                this.importOSSObject = importOSSObject;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * RemainTime.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * Type.
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
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuOnlineDowngrade")
        private String cpuOnlineDowngrade;

        @com.aliyun.core.annotation.NameInMap("CpuOnlineUpgrade")
        private String cpuOnlineUpgrade;

        @com.aliyun.core.annotation.NameInMap("ImdsSupport")
        private String imdsSupport;

        @com.aliyun.core.annotation.NameInMap("MemoryOnlineDowngrade")
        private String memoryOnlineDowngrade;

        @com.aliyun.core.annotation.NameInMap("MemoryOnlineUpgrade")
        private String memoryOnlineUpgrade;

        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private Features(Builder builder) {
            this.cpuOnlineDowngrade = builder.cpuOnlineDowngrade;
            this.cpuOnlineUpgrade = builder.cpuOnlineUpgrade;
            this.imdsSupport = builder.imdsSupport;
            this.memoryOnlineDowngrade = builder.memoryOnlineDowngrade;
            this.memoryOnlineUpgrade = builder.memoryOnlineUpgrade;
            this.nvmeSupport = builder.nvmeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return cpuOnlineDowngrade
         */
        public String getCpuOnlineDowngrade() {
            return this.cpuOnlineDowngrade;
        }

        /**
         * @return cpuOnlineUpgrade
         */
        public String getCpuOnlineUpgrade() {
            return this.cpuOnlineUpgrade;
        }

        /**
         * @return imdsSupport
         */
        public String getImdsSupport() {
            return this.imdsSupport;
        }

        /**
         * @return memoryOnlineDowngrade
         */
        public String getMemoryOnlineDowngrade() {
            return this.memoryOnlineDowngrade;
        }

        /**
         * @return memoryOnlineUpgrade
         */
        public String getMemoryOnlineUpgrade() {
            return this.memoryOnlineUpgrade;
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public static final class Builder {
            private String cpuOnlineDowngrade; 
            private String cpuOnlineUpgrade; 
            private String imdsSupport; 
            private String memoryOnlineDowngrade; 
            private String memoryOnlineUpgrade; 
            private String nvmeSupport; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.cpuOnlineDowngrade = model.cpuOnlineDowngrade;
                this.cpuOnlineUpgrade = model.cpuOnlineUpgrade;
                this.imdsSupport = model.imdsSupport;
                this.memoryOnlineDowngrade = model.memoryOnlineDowngrade;
                this.memoryOnlineUpgrade = model.memoryOnlineUpgrade;
                this.nvmeSupport = model.nvmeSupport;
            } 

            /**
             * CpuOnlineDowngrade.
             */
            public Builder cpuOnlineDowngrade(String cpuOnlineDowngrade) {
                this.cpuOnlineDowngrade = cpuOnlineDowngrade;
                return this;
            }

            /**
             * CpuOnlineUpgrade.
             */
            public Builder cpuOnlineUpgrade(String cpuOnlineUpgrade) {
                this.cpuOnlineUpgrade = cpuOnlineUpgrade;
                return this;
            }

            /**
             * ImdsSupport.
             */
            public Builder imdsSupport(String imdsSupport) {
                this.imdsSupport = imdsSupport;
                return this;
            }

            /**
             * MemoryOnlineDowngrade.
             */
            public Builder memoryOnlineDowngrade(String memoryOnlineDowngrade) {
                this.memoryOnlineDowngrade = memoryOnlineDowngrade;
                return this;
            }

            /**
             * MemoryOnlineUpgrade.
             */
            public Builder memoryOnlineUpgrade(String memoryOnlineUpgrade) {
                this.memoryOnlineUpgrade = memoryOnlineUpgrade;
                return this;
            }

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
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
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
             * SecureBootSupport.
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

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

        @com.aliyun.core.annotation.NameInMap("SecureBootOptions")
        private SecureBootOptions secureBootOptions;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Usable")
        private Boolean usable;

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
            this.licenseType = builder.licenseType;
            this.loginAsNonRootSupported = builder.loginAsNonRootSupported;
            this.OSName = builder.OSName;
            this.OSNameEn = builder.OSNameEn;
            this.OSType = builder.OSType;
            this.platform = builder.platform;
            this.productCode = builder.productCode;
            this.progress = builder.progress;
            this.resourceGroupId = builder.resourceGroupId;
            this.secureBootOptions = builder.secureBootOptions;
            this.size = builder.size;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
            this.tags = builder.tags;
            this.usable = builder.usable;
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
         * @return licenseType
         */
        public String getLicenseType() {
            return this.licenseType;
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
         * @return secureBootOptions
         */
        public SecureBootOptions getSecureBootOptions() {
            return this.secureBootOptions;
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
         * @return usable
         */
        public Boolean getUsable() {
            return this.usable;
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
            private String licenseType; 
            private Boolean loginAsNonRootSupported; 
            private String OSName; 
            private String OSNameEn; 
            private String OSType; 
            private String platform; 
            private String productCode; 
            private String progress; 
            private String resourceGroupId; 
            private SecureBootOptions secureBootOptions; 
            private Integer size; 
            private String status; 
            private String supplierName; 
            private Tags tags; 
            private Boolean usable; 
            private String usage; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.architecture = model.architecture;
                this.bootMode = model.bootMode;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.detectionOptions = model.detectionOptions;
                this.diskDeviceMappings = model.diskDeviceMappings;
                this.features = model.features;
                this.imageFamily = model.imageFamily;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.imageOwnerId = model.imageOwnerId;
                this.imageVersion = model.imageVersion;
                this.isCopied = model.isCopied;
                this.isPublic = model.isPublic;
                this.isSelfShared = model.isSelfShared;
                this.isSubscribed = model.isSubscribed;
                this.isSupportCloudinit = model.isSupportCloudinit;
                this.isSupportIoOptimized = model.isSupportIoOptimized;
                this.licenseType = model.licenseType;
                this.loginAsNonRootSupported = model.loginAsNonRootSupported;
                this.OSName = model.OSName;
                this.OSNameEn = model.OSNameEn;
                this.OSType = model.OSType;
                this.platform = model.platform;
                this.productCode = model.productCode;
                this.progress = model.progress;
                this.resourceGroupId = model.resourceGroupId;
                this.secureBootOptions = model.secureBootOptions;
                this.size = model.size;
                this.status = model.status;
                this.supplierName = model.supplierName;
                this.tags = model.tags;
                this.usable = model.usable;
                this.usage = model.usage;
            } 

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * BootMode.
             */
            public Builder bootMode(String bootMode) {
                this.bootMode = bootMode;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DetectionOptions.
             */
            public Builder detectionOptions(DetectionOptions detectionOptions) {
                this.detectionOptions = detectionOptions;
                return this;
            }

            /**
             * DiskDeviceMappings.
             */
            public Builder diskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(Features features) {
                this.features = features;
                return this;
            }

            /**
             * ImageFamily.
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageOwnerAlias.
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * ImageOwnerId.
             */
            public Builder imageOwnerId(Long imageOwnerId) {
                this.imageOwnerId = imageOwnerId;
                return this;
            }

            /**
             * ImageVersion.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * IsCopied.
             */
            public Builder isCopied(Boolean isCopied) {
                this.isCopied = isCopied;
                return this;
            }

            /**
             * IsPublic.
             */
            public Builder isPublic(Boolean isPublic) {
                this.isPublic = isPublic;
                return this;
            }

            /**
             * IsSelfShared.
             */
            public Builder isSelfShared(String isSelfShared) {
                this.isSelfShared = isSelfShared;
                return this;
            }

            /**
             * IsSubscribed.
             */
            public Builder isSubscribed(Boolean isSubscribed) {
                this.isSubscribed = isSubscribed;
                return this;
            }

            /**
             * IsSupportCloudinit.
             */
            public Builder isSupportCloudinit(Boolean isSupportCloudinit) {
                this.isSupportCloudinit = isSupportCloudinit;
                return this;
            }

            /**
             * IsSupportIoOptimized.
             */
            public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
                this.isSupportIoOptimized = isSupportIoOptimized;
                return this;
            }

            /**
             * LicenseType.
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
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
             * OSName.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * OSNameEn.
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * OSType.
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecureBootOptions.
             */
            public Builder secureBootOptions(SecureBootOptions secureBootOptions) {
                this.secureBootOptions = secureBootOptions;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Usable.
             */
            public Builder usable(Boolean usable) {
                this.usable = usable;
                return this;
            }

            /**
             * Usage.
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
        private java.util.List<Image> image;

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
        public java.util.List<Image> getImage() {
            return this.image;
        }

        public static final class Builder {
            private java.util.List<Image> image; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.image = model.image;
            } 

            /**
             * Image.
             */
            public Builder image(java.util.List<Image> image) {
                this.image = image;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
