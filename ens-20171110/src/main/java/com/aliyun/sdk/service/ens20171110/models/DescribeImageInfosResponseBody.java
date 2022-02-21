// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageInfosResponseBody</p>
 */
public class DescribeImageInfosResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Images")
    private Images images;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Images.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageInfosResponseBody build() {
            return new DescribeImageInfosResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageSize")
        private String imageSize;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("OSType")
        private String OSType;

        private Image(Builder builder) {
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private String imageId; 
            private String imageSize; 
            private String imageVersion; 
            private String OSName; 
            private String OSType; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * ImageSize.
             */
            public Builder imageSize(String imageSize) {
                this.imageSize = imageSize;
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
             * OSName.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * OSType.
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
