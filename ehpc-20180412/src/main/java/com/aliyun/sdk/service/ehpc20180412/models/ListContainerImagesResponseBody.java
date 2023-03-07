// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListContainerImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListContainerImagesResponseBody</p>
 */
public class ListContainerImagesResponseBody extends TeaModel {
    @NameInMap("DBInfo")
    private String DBInfo;

    @NameInMap("Images")
    private Images images;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListContainerImagesResponseBody(Builder builder) {
        this.DBInfo = builder.DBInfo;
        this.images = builder.images;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContainerImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInfo
     */
    public String getDBInfo() {
        return this.DBInfo;
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
        private String DBInfo; 
        private Images images; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information of the database.
         */
        public Builder DBInfo(String DBInfo) {
            this.DBInfo = DBInfo;
            return this;
        }

        /**
         * The array of local images.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListContainerImagesResponseBody build() {
            return new ListContainerImagesResponseBody(this);
        } 

    } 

    public static class ImagesImages extends TeaModel {
        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("Repository")
        private String repository;

        @NameInMap("Status")
        private String status;

        @NameInMap("System")
        private String system;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateDateTime")
        private String updateDateTime;

        private ImagesImages(Builder builder) {
            this.imageId = builder.imageId;
            this.repository = builder.repository;
            this.status = builder.status;
            this.system = builder.system;
            this.tag = builder.tag;
            this.type = builder.type;
            this.updateDateTime = builder.updateDateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImagesImages create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return repository
         */
        public String getRepository() {
            return this.repository;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return system
         */
        public String getSystem() {
            return this.system;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateDateTime
         */
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

        public static final class Builder {
            private String imageId; 
            private String repository; 
            private String status; 
            private String system; 
            private String tag; 
            private String type; 
            private String updateDateTime; 

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The name of the repository.
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * The status of the image.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The container system of the image.
             */
            public Builder system(String system) {
                this.system = system;
                return this;
            }

            /**
             * The tags of the image.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The type of the container. Set the value to singularity.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the image was updated.
             */
            public Builder updateDateTime(String updateDateTime) {
                this.updateDateTime = updateDateTime;
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
             * The array of local images.
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
