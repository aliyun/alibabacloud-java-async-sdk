// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeImageModifiedRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageModifiedRecordsResponseBody</p>
 */
public class DescribeImageModifiedRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageModifiedRecords")
    private java.util.List<ImageModifiedRecords> imageModifiedRecords;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageModifiedRecordsResponseBody(Builder builder) {
        this.imageModifiedRecords = builder.imageModifiedRecords;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageModifiedRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageModifiedRecords
     */
    public java.util.List<ImageModifiedRecords> getImageModifiedRecords() {
        return this.imageModifiedRecords;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<ImageModifiedRecords> imageModifiedRecords; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeImageModifiedRecordsResponseBody model) {
            this.imageModifiedRecords = model.imageModifiedRecords;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about the image modification record.</p>
         */
        public Builder imageModifiedRecords(java.util.List<ImageModifiedRecords> imageModifiedRecords) {
            this.imageModifiedRecords = imageModifiedRecords;
            return this;
        }

        /**
         * <p>If the NextToken parameter is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6koN7RqHg3d2z8LKmSoe821</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC40EE61-7E83-59ED-AEA6-7EE9C437F352</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of image modification records.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageModifiedRecordsResponseBody build() {
            return new DescribeImageModifiedRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageModifiedRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageModifiedRecordsResponseBody</p>
     */
    public static class ImageModifiedRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("NewImageId")
        private String newImageId;

        @com.aliyun.core.annotation.NameInMap("NewImageName")
        private String newImageName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private ImageModifiedRecords(Builder builder) {
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.newImageId = builder.newImageId;
            this.newImageName = builder.newImageName;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageModifiedRecords create() {
            return builder().build();
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
         * @return newImageId
         */
        public String getNewImageId() {
            return this.newImageId;
        }

        /**
         * @return newImageName
         */
        public String getNewImageName() {
            return this.newImageName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String imageId; 
            private String imageName; 
            private String newImageId; 
            private String newImageName; 
            private Integer status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(ImageModifiedRecords model) {
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.newImageId = model.newImageId;
                this.newImageName = model.newImageName;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the original image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-8rnz2imrpcfuh****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the original image.</p>
             * 
             * <strong>example:</strong>
             * <p>win10-0307</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The ID of the new image after the image was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxNewImageID</p>
             */
            public Builder newImageId(String newImageId) {
                this.newImageId = newImageId;
                return this;
            }

            /**
             * <p>The name of the new image after the image was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxImageID</p>
             */
            public Builder newImageName(String newImageName) {
                this.newImageName = newImageName;
                return this;
            }

            /**
             * <p>The status of the image modification.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>0: The image is being modified.</p>
             * </li>
             * <li><p>1: The image is successfully modified.</p>
             * </li>
             * <li><p>2: The image fails to be modified.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the image was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-03T02:43:44.851Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ImageModifiedRecords build() {
                return new ImageModifiedRecords(this);
            } 

        } 

    }
}
