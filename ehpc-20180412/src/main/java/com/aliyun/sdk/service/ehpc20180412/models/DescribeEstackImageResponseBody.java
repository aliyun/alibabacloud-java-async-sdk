// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEstackImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEstackImageResponseBody</p>
 */
public class DescribeEstackImageResponseBody extends TeaModel {
    @NameInMap("ImageList")
    private ImageList imageList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEstackImageResponseBody(Builder builder) {
        this.imageList = builder.imageList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEstackImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageList
     */
    public ImageList getImageList() {
        return this.imageList;
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
        private ImageList imageList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ImageList.
         */
        public Builder imageList(ImageList imageList) {
            this.imageList = imageList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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

        public DescribeEstackImageResponseBody build() {
            return new DescribeEstackImageResponseBody(this);
        } 

    } 

    public static class ImageListInfo extends TeaModel {
        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageSize")
        private Integer imageSize;

        @NameInMap("ImageType")
        private String imageType;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("RecentUpdateTime")
        private String recentUpdateTime;

        private ImageListInfo(Builder builder) {
            this.imageName = builder.imageName;
            this.imageSize = builder.imageSize;
            this.imageType = builder.imageType;
            this.imageUrl = builder.imageUrl;
            this.recentUpdateTime = builder.recentUpdateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageListInfo create() {
            return builder().build();
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageSize
         */
        public Integer getImageSize() {
            return this.imageSize;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return recentUpdateTime
         */
        public String getRecentUpdateTime() {
            return this.recentUpdateTime;
        }

        public static final class Builder {
            private String imageName; 
            private Integer imageSize; 
            private String imageType; 
            private String imageUrl; 
            private String recentUpdateTime; 

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageSize.
             */
            public Builder imageSize(Integer imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * ImageType.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
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
             * RecentUpdateTime.
             */
            public Builder recentUpdateTime(String recentUpdateTime) {
                this.recentUpdateTime = recentUpdateTime;
                return this;
            }

            public ImageListInfo build() {
                return new ImageListInfo(this);
            } 

        } 

    }
    public static class ImageList extends TeaModel {
        @NameInMap("ImageListInfo")
        private java.util.List < ImageListInfo> imageListInfo;

        private ImageList(Builder builder) {
            this.imageListInfo = builder.imageListInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageList create() {
            return builder().build();
        }

        /**
         * @return imageListInfo
         */
        public java.util.List < ImageListInfo> getImageListInfo() {
            return this.imageListInfo;
        }

        public static final class Builder {
            private java.util.List < ImageListInfo> imageListInfo; 

            /**
             * ImageListInfo.
             */
            public Builder imageListInfo(java.util.List < ImageListInfo> imageListInfo) {
                this.imageListInfo = imageListInfo;
                return this;
            }

            public ImageList build() {
                return new ImageList(this);
            } 

        } 

    }
}
