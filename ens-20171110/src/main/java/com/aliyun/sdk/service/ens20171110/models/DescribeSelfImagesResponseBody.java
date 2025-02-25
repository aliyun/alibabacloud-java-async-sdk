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
 * {@link DescribeSelfImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSelfImagesResponseBody</p>
 */
public class DescribeSelfImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Images")
    private Images images;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSelfImagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.images = builder.images;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSelfImagesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Images images; 
        private String requestId; 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The image information.</p>
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A8B8EB73-B4FD-4262-8EF6-680DF39C9BA0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSelfImagesResponseBody build() {
            return new DescribeSelfImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSelfImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSelfImagesResponseBody</p>
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

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
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

            /**
             * imageId.
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
     * {@link DescribeSelfImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSelfImagesResponseBody</p>
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
     * {@link DescribeSelfImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSelfImagesResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("ComputeType")
        private String computeType;

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

        @com.aliyun.core.annotation.NameInMap("ImageStorageSize")
        private String imageStorageSize;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Image(Builder builder) {
            this.architecture = builder.architecture;
            this.computeType = builder.computeType;
            this.creationTime = builder.creationTime;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.imageSize = builder.imageSize;
            this.imageStorageSize = builder.imageStorageSize;
            this.instanceId = builder.instanceId;
            this.osVersion = builder.osVersion;
            this.platform = builder.platform;
            this.snapshotId = builder.snapshotId;
            this.status = builder.status;
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
         * @return computeType
         */
        public String getComputeType() {
            return this.computeType;
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
         * @return imageStorageSize
         */
        public String getImageStorageSize() {
            return this.imageStorageSize;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String architecture; 
            private String computeType; 
            private String creationTime; 
            private DiskDeviceMappings diskDeviceMappings; 
            private String imageId; 
            private String imageName; 
            private String imageOwnerAlias; 
            private String imageSize; 
            private String imageStorageSize; 
            private String instanceId; 
            private String osVersion; 
            private String platform; 
            private String snapshotId; 
            private String status; 

            /**
             * <p>The image architecture. Valid values:</p>
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
             * <p>Computing type. ens_vm/ens: x86 computing. bare_metal: x86 bare machine or x86 bare metal. arm_vm: ARM computing. arm_bare_metal: ARM bare machine or ARM bare metal. pcfarm: heterogeneous computing.</p>
             * 
             * <strong>example:</strong>
             * <p>ens_vm</p>
             */
            public Builder computeType(String computeType) {
                this.computeType = computeType;
                return this;
            }

            /**
             * <p>The image creation time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-08T12:10:03Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_a****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_a****</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The source of the image. Valid values:</p>
             * <ul>
             * <li><strong>others</strong>: a custom image that is shared by other Alibaba Cloud accounts.</li>
             * <li><strong>self</strong>: your own custom image.</li>
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
             * <p>20</p>
             */
            public Builder imageSize(String imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>The size of the image storage.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder imageStorageSize(String imageStorageSize) {
                this.imageStorageSize = imageStorageSize;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5iqczfxps7csjrxeca****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The operating system version.</p>
             * 
             * <strong>example:</strong>
             * <p>7.2</p>
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * <p>The platform.</p>
             * <ul>
             * <li>centos</li>
             * <li>ubuntu</li>
             * <li>alios</li>
             * <li>debian</li>
             * <li>rhel</li>
             * <li>windows</li>
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
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-5yt3bdedxzdz6t6uuw****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The state of the image.</p>
             * <ul>
             * <li>Creating.</li>
             * <li>Packing.</li>
             * <li>Uploading.</li>
             * <li>Pack_failed.</li>
             * <li>Upload_failed.</li>
             * <li>Available: Only images in the Available state can be used and operated.</li>
             * <li>Unavailable.</li>
             * <li>Copying.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSelfImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSelfImagesResponseBody</p>
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
