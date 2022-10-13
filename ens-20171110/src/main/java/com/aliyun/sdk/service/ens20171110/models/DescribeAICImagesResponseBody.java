// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAICImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAICImagesResponseBody</p>
 */
public class DescribeAICImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    private java.util.List < Images> images;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAICImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAICImagesResponseBody create() {
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
         * Images.
         */
        public Builder images(java.util.List < Images> images) {
            this.images = images;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAICImagesResponseBody build() {
            return new DescribeAICImagesResponseBody(this);
        } 

    } 

    public static class Images extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("Status")
        private String status;

        @NameInMap("User")
        private String user;

        private Images(Builder builder) {
            this.creationTime = builder.creationTime;
            this.imageId = builder.imageId;
            this.imageUrl = builder.imageUrl;
            this.status = builder.status;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String creationTime; 
            private String imageId; 
            private String imageUrl; 
            private String status; 
            private String user; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
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
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
