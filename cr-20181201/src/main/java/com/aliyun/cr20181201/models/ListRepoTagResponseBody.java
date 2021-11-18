// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListRepoTagResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoTagResponseBody</p>
 */
public class ListRepoTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("Images")
    private java.util.List < Images> images;


    private ListRepoTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.images = builder.images;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return images
     */
    public java.util.List < Images> getImages() {
        return this.images;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private String totalCount; 
        private java.util.List < Images> images; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Images</p>
         */
        public Builder images(java.util.List < Images> images) {
            this.images = images;
            return this;
        }

        public ListRepoTagResponseBody build() {
            return new ListRepoTagResponseBody(this);
        } 

    } 

    public static class Images extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("ImageSize")
        private Long imageSize;

        @NameInMap("ImageCreate")
        private String imageCreate;

        @NameInMap("Digest")
        private String digest;

        @NameInMap("ImageUpdate")
        private String imageUpdate;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("ImageId")
        private String imageId;


        private Images(Builder builder) {
            this.status = builder.status;
            this.imageSize = builder.imageSize;
            this.imageCreate = builder.imageCreate;
            this.digest = builder.digest;
            this.imageUpdate = builder.imageUpdate;
            this.tag = builder.tag;
            this.imageId = builder.imageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return imageSize
         */
        public Long getImageSize() {
            return this.imageSize;
        }

        /**
         * @return imageCreate
         */
        public String getImageCreate() {
            return this.imageCreate;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return imageUpdate
         */
        public String getImageUpdate() {
            return this.imageUpdate;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        public static final class Builder {
            private String status; 
            private Long imageSize; 
            private String imageCreate; 
            private String digest; 
            private String imageUpdate; 
            private String tag; 
            private String imageId; 

            /**
             * <p>State</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Image size</p>
             */
            public Builder imageSize(Long imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>Image creation time</p>
             */
            public Builder imageCreate(String imageCreate) {
                this.imageCreate = imageCreate;
                return this;
            }

            /**
             * <p>digest value</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>Image update time</p>
             */
            public Builder imageUpdate(String imageUpdate) {
                this.imageUpdate = imageUpdate;
                return this;
            }

            /**
             * <p>Image TAG</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>Image ID</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
