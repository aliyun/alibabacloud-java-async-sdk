// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Images")
    private Images images;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.images = builder.images;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private Integer code; 
        private Images images; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeImagesResponseBody model) {
            this.code = model.code;
            this.images = model.images;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned service code. 0 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about images.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8331AA01-C16D-5481-BB47-D19CEBAA811E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
    public static class DiskDeviceMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("imageId")
        private String imageId;

        private DiskDeviceMapping(Builder builder) {
            this.format = builder.format;
            this.size = builder.size;
            this.type = builder.type;
            this.imageId = builder.imageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMapping create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
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

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        public static final class Builder {
            private String format; 
            private String size; 
            private String type; 
            private String imageId; 

            private Builder() {
            } 

            private Builder(DiskDeviceMapping model) {
                this.format = model.format;
                this.size = model.size;
                this.type = model.type;
                this.imageId = model.imageId;
            } 

            /**
             * <p>The format of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>The format of the image.
             * raw
             * qcow2</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The type of the disk. Valid values:</p>
             * <ul>
             * <li>system: system disk.</li>
             * <li>data: data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Data</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of image.</p>
             * 
             * <strong>example:</strong>
             * <p>i-test</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
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
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private String imageSize;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        private Image(Builder builder) {
            this.architecture = builder.architecture;
            this.creationTime = builder.creationTime;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.imageSize = builder.imageSize;
            this.platform = builder.platform;
            this.regionId = builder.regionId;
            this.snapshotId = builder.snapshotId;
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
         * @return diskDeviceMappings
         */
        public DiskDeviceMappings getDiskDeviceMappings() {
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
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return imageSize
         */
        public String getImageSize() {
            return this.imageSize;
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
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private String architecture; 
            private String creationTime; 
            private DiskDeviceMappings diskDeviceMappings; 
            private String imageId; 
            private String imageName; 
            private String imageOwnerAlias; 
            private String imageSize; 
            private String platform; 
            private String regionId; 
            private String snapshotId; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.architecture = model.architecture;
                this.creationTime = model.creationTime;
                this.diskDeviceMappings = model.diskDeviceMappings;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.imageSize = model.imageSize;
                this.platform = model.platform;
                this.regionId = model.regionId;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * <p>The architecture of the image. Example: <strong>x86_64</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The time when the image was created. The time follows the ISO 8601 standard.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-08T12:10:03Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_alibase_2017****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu_16.04</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The source of the image. Valid values:</p>
             * <ul>
             * <li>system: Alibaba Cloud public images</li>
             * <li>self: your custom images</li>
             * <li>others: shared images from other Alibaba Cloud accounts, or community images published by other Alibaba Cloud accounts</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * <p>The size of the image. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder imageSize(String imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>The operating system type of the image. Valid values:</p>
             * <ul>
             * <li>Linux</li>
             * <li>Windows</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>centos</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The ID of the Edge Node Service (ENS) node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>mock-clone_snapshot_id</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
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
