// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEstackImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEstackImageResponseBody</p>
 */
public class DescribeEstackImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageList")
    private ImageList imageList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEstackImageResponseBody model) {
            this.imageList = model.imageList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The array of base images.</p>
         */
        public Builder imageList(ImageList imageList) {
            this.imageList = imageList;
            return this;
        }

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D69A58F-345C-4FDE-88E4-BF518948xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEstackImageResponseBody build() {
            return new DescribeEstackImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEstackImageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEstackImageResponseBody</p>
     */
    public static class ImageListInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private Integer imageSize;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("RecentUpdateTime")
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

            private Builder() {
            } 

            private Builder(ImageListInfo model) {
                this.imageName = model.imageName;
                this.imageSize = model.imageSize;
                this.imageType = model.imageType;
                this.imageUrl = model.imageUrl;
                this.recentUpdateTime = model.recentUpdateTime;
            } 

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>tensorflow-21.09-tf1-py3.sif</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The size of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>65535 GiB</p>
             */
            public Builder imageSize(Integer imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>The type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>singularity</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The download URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.oss-cn-hangzhou.aliyuncs.com/eStackPackage/singularity/tensorflow-21.09-tf1-py3.sif">http://xxxx.oss-cn-hangzhou.aliyuncs.com/eStackPackage/singularity/tensorflow-21.09-tf1-py3.sif</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The time when the image was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-05T07:10:55.000Z</p>
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
    /**
     * 
     * {@link DescribeEstackImageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEstackImageResponseBody</p>
     */
    public static class ImageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageListInfo")
        private java.util.List<ImageListInfo> imageListInfo;

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
        public java.util.List<ImageListInfo> getImageListInfo() {
            return this.imageListInfo;
        }

        public static final class Builder {
            private java.util.List<ImageListInfo> imageListInfo; 

            private Builder() {
            } 

            private Builder(ImageList model) {
                this.imageListInfo = model.imageListInfo;
            } 

            /**
             * ImageListInfo.
             */
            public Builder imageListInfo(java.util.List<ImageListInfo> imageListInfo) {
                this.imageListInfo = imageListInfo;
                return this;
            }

            public ImageList build() {
                return new ImageList(this);
            } 

        } 

    }
}
