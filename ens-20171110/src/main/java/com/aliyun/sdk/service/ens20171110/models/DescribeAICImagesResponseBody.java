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

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAICImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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
        private java.util.List < Images> images; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the images.
         */
        public Builder images(java.util.List < Images> images) {
            this.images = images;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAICImagesResponseBody build() {
            return new DescribeAICImagesResponseBody(this);
        } 

    } 

    public static class Images extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

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
            this.description = builder.description;
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
            private String description; 
            private String imageId; 
            private String imageUrl; 
            private String status; 
            private String user; 

            /**
             * The time when the image was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the image.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The image ID of the AIC instance.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The URL of the AIC image repository.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * The status of the image. **Available** is returned for this parameter. Available indicates that the image is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The username of the image repository.
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
