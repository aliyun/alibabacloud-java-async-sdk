// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListImagesResponseBody</p>
 */
public class ListImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List < Images> images;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return images
     */
    public java.util.List < Images> getImages() {
        return this.images;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Images> images; 
        private String requestId; 

        /**
         * <p>The OS type of the image. Valid values:</p>
         * <ul>
         * <li>Linux</li>
         * <li>Windows</li>
         * </ul>
         */
        public Builder images(java.util.List < Images> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImagesResponseBody build() {
            return new ListImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImagesResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        private Images(Builder builder) {
            this.description = builder.description;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageType = builder.imageType;
            this.platform = builder.platform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
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
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        public static final class Builder {
            private String description; 
            private String imageId; 
            private String imageName; 
            private String imageType; 
            private String platform; 

            /**
             * <p>The description of the image.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>794c230fd3e64ea19f83f4d7a0ad****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>WordPress-4.8.1</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The type of the image. Valid values:</p>
             * <ul>
             * <li>system</li>
             * <li>app</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
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
             * <p>Linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
