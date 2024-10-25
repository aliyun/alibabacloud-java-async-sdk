// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageInfosResponseBody</p>
 */
public class DescribeImageInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Images")
    private Images images;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageInfosResponseBody(Builder builder) {
        this.code = builder.code;
        this.images = builder.images;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageInfosResponseBody create() {
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
         * <p>The information about images.</p>
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5568A08C-10A9-47F3-902F-647298B463FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageInfosResponseBody build() {
            return new DescribeImageInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageInfosResponseBody</p>
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
     * {@link DescribeImageInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageInfosResponseBody</p>
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
     * {@link DescribeImageInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageInfosResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeType")
        private String computeType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private String imageSize;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("OSName")
        private String OSName;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        private Image(Builder builder) {
            this.computeType = builder.computeType;
            this.description = builder.description;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.imageId = builder.imageId;
            this.imageSize = builder.imageSize;
            this.imageVersion = builder.imageVersion;
            this.OSName = builder.OSName;
            this.OSType = builder.OSType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return computeType
         */
        public String getComputeType() {
            return this.computeType;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageSize
         */
        public String getImageSize() {
            return this.imageSize;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
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

        public static final class Builder {
            private String computeType; 
            private String description; 
            private DiskDeviceMappings diskDeviceMappings; 
            private String imageId; 
            private String imageSize; 
            private String imageVersion; 
            private String OSName; 
            private String OSType; 

            /**
             * <p>The computing type of the image. Valid values:</p>
             * <ul>
             * <li>ens_vm: x86 computing.</li>
             * <li>arm_vm: ARM computing.</li>
             * <li>bare_metal: x86 bare machine.</li>
             * <li>pcfarm: heterogeneous computing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ens_vm</p>
             */
            public Builder computeType(String computeType) {
                this.computeType = computeType;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_alibase_2017****</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>centos_6_08_64_20G_alibase_2017****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
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
             * <p>The version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>6.8</p>
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>The type of the image. Valid values: <strong>centos</strong>, <strong>debian</strong>, <strong>ubuntu</strong>, and <strong>windows</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>centos</p>
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * <p>The type of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageInfosResponseBody</p>
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
