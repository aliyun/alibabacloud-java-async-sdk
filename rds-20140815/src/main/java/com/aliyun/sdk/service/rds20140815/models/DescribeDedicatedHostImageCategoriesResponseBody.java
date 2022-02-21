// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostImageCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostImageCategoriesResponseBody</p>
 */
public class DescribeDedicatedHostImageCategoriesResponseBody extends TeaModel {
    @NameInMap("Images")
    private Images images;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedHostImageCategoriesResponseBody(Builder builder) {
        this.images = builder.images;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostImageCategoriesResponseBody create() {
        return builder().build();
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
        private Images images; 
        private String requestId; 

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

        public DescribeDedicatedHostImageCategoriesResponseBody build() {
            return new DescribeDedicatedHostImageCategoriesResponseBody(this);
        } 

    } 

    public static class ImagesImages extends TeaModel {
        @NameInMap("ImageCode")
        private String imageCode;

        @NameInMap("ImageName")
        private String imageName;

        private ImagesImages(Builder builder) {
            this.imageCode = builder.imageCode;
            this.imageName = builder.imageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImagesImages create() {
            return builder().build();
        }

        /**
         * @return imageCode
         */
        public String getImageCode() {
            return this.imageCode;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        public static final class Builder {
            private String imageCode; 
            private String imageName; 

            /**
             * ImageCode.
             */
            public Builder imageCode(String imageCode) {
                this.imageCode = imageCode;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            public ImagesImages build() {
                return new ImagesImages(this);
            } 

        } 

    }
    public static class Images extends TeaModel {
        @NameInMap("Images")
        private java.util.List < ImagesImages> images;

        private Images(Builder builder) {
            this.images = builder.images;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return images
         */
        public java.util.List < ImagesImages> getImages() {
            return this.images;
        }

        public static final class Builder {
            private java.util.List < ImagesImages> images; 

            /**
             * Images.
             */
            public Builder images(java.util.List < ImagesImages> images) {
                this.images = images;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
