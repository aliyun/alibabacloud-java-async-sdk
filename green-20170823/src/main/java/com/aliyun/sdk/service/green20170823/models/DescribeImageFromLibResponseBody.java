// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFromLibResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageFromLibResponseBody</p>
 */
public class DescribeImageFromLibResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("ImageFromLibList")
    private java.util.List < ImageFromLibList> imageFromLibList;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageFromLibResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.imageFromLibList = builder.imageFromLibList;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageFromLibResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return imageFromLibList
     */
    public java.util.List < ImageFromLibList> getImageFromLibList() {
        return this.imageFromLibList;
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
        private Integer currentPage; 
        private java.util.List < ImageFromLibList> imageFromLibList; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ImageFromLibList.
         */
        public Builder imageFromLibList(java.util.List < ImageFromLibList> imageFromLibList) {
            this.imageFromLibList = imageFromLibList;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageFromLibResponseBody build() {
            return new DescribeImageFromLibResponseBody(this);
        } 

    } 

    public static class ImageFromLibList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImageHitCount")
        private Long imageHitCount;

        @NameInMap("Thumbnail")
        private String thumbnail;

        @NameInMap("VideoHitCount")
        private Long videoHitCount;

        private ImageFromLibList(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.image = builder.image;
            this.imageHitCount = builder.imageHitCount;
            this.thumbnail = builder.thumbnail;
            this.videoHitCount = builder.videoHitCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageFromLibList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imageHitCount
         */
        public Long getImageHitCount() {
            return this.imageHitCount;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return videoHitCount
         */
        public Long getVideoHitCount() {
            return this.videoHitCount;
        }

        public static final class Builder {
            private String createTime; 
            private Long id; 
            private String image; 
            private Long imageHitCount; 
            private String thumbnail; 
            private Long videoHitCount; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * ImageHitCount.
             */
            public Builder imageHitCount(Long imageHitCount) {
                this.imageHitCount = imageHitCount;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * VideoHitCount.
             */
            public Builder videoHitCount(Long videoHitCount) {
                this.videoHitCount = videoHitCount;
                return this;
            }

            public ImageFromLibList build() {
                return new ImageFromLibList(this);
            } 

        } 

    }
}
