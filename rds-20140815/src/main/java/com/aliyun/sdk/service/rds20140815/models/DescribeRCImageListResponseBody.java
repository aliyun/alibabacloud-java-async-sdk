// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCImageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCImageListResponseBody</p>
 */
public class DescribeRCImageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<Images> images;

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

    private DescribeRCImageListResponseBody(Builder builder) {
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

    public static DescribeRCImageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return images
     */
    public java.util.List<Images> getImages() {
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
        private java.util.List<Images> images; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRCImageListResponseBody model) {
            this.images = model.images;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the images.</p>
         */
        public Builder images(java.util.List<Images> images) {
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
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>2553A660-E4EB-4AF4-A402-8AFF70A49143</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRCImageListResponseBody build() {
            return new DescribeRCImageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCImageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCImageListResponseBody</p>
     */
    public static class DiskDeviceMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DiskDeviceMappings(Builder builder) {
            this.device = builder.device;
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMappings create() {
            return builder().build();
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String device; 
            private String size; 
            private String type; 

            private Builder() {
            } 

            private Builder(DiskDeviceMappings model) {
                this.device = model.device;
                this.size = model.size;
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
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DiskDeviceMappings build() {
                return new DiskDeviceMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCImageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCImageListResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private java.util.List<DiskDeviceMappings> diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("IsPublic")
        private Boolean isPublic;

        @com.aliyun.core.annotation.NameInMap("IsSupportRdsCustom")
        private Boolean isSupportRdsCustom;

        @com.aliyun.core.annotation.NameInMap("OSName")
        private String OSName;

        @com.aliyun.core.annotation.NameInMap("OSNameEn")
        private String OSNameEn;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private Images(Builder builder) {
            this.architecture = builder.architecture;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageVersion = builder.imageVersion;
            this.isPublic = builder.isPublic;
            this.isSupportRdsCustom = builder.isSupportRdsCustom;
            this.OSName = builder.OSName;
            this.OSNameEn = builder.OSNameEn;
            this.OSType = builder.OSType;
            this.platform = builder.platform;
            this.size = builder.size;
            this.status = builder.status;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
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
        public java.util.List<DiskDeviceMappings> getDiskDeviceMappings() {
            return this.diskDeviceMappings;
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
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return isPublic
         */
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        /**
         * @return isSupportRdsCustom
         */
        public Boolean getIsSupportRdsCustom() {
            return this.isSupportRdsCustom;
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
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private java.util.List<DiskDeviceMappings> diskDeviceMappings; 
            private String imageId; 
            private String imageName; 
            private String imageVersion; 
            private Boolean isPublic; 
            private Boolean isSupportRdsCustom; 
            private String OSName; 
            private String OSNameEn; 
            private String OSType; 
            private String platform; 
            private Long size; 
            private String status; 
            private String usage; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.architecture = model.architecture;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.diskDeviceMappings = model.diskDeviceMappings;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageVersion = model.imageVersion;
                this.isPublic = model.isPublic;
                this.isSupportRdsCustom = model.isSupportRdsCustom;
                this.OSName = model.OSName;
                this.OSNameEn = model.OSNameEn;
                this.OSType = model.OSType;
                this.platform = model.platform;
                this.size = model.size;
                this.status = model.status;
                this.usage = model.usage;
            } 

            /**
             * <p>The image architecture. Valid values:</p>
             * <ul>
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
             * <p>The time when the image was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-25T02:17:40Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DiskDeviceMappings.
             */
            public Builder diskDeviceMappings(java.util.List<DiskDeviceMappings> diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-2oqiu973jwcxe****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>Created_from_i-2zeh17y17sz677x****</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
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
             * <p>Indicates whether the image is a public image. Public images include public images provided by Alibaba Cloud and custom images published as community images.</p>
             * <ul>
             * <li><strong>true</strong>: The image is a public image.</li>
             * <li><strong>false</strong>: The image is not a public image.</li>
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
             * IsSupportRdsCustom.
             */
            public Builder isSupportRdsCustom(Boolean isSupportRdsCustom) {
                this.isSupportRdsCustom = isSupportRdsCustom;
                return this;
            }

            /**
             * <p>The display name of the operating system in Chinese.</p>
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * <p>The display name of the operating system in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Linux  2.1903 LTS 64 bit Quick Boot</p>
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * <p>The type of the operating system. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong></li>
             * <li><strong>linux</strong></li>
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
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The image size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The image status. Valid values:</p>
             * <ul>
             * <li><strong>Unavailable</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Creating</strong></li>
             * <li><strong>CreateFailed</strong></li>
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
             * <p>Indicates whether the image is used by the RDS Custom instance. Valid values:</p>
             * <ul>
             * <li><strong>instance</strong>: The image is used to create one or more RDS Custom instances.</li>
             * <li><strong>none</strong>: The image is not used to create RDS Custom instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
