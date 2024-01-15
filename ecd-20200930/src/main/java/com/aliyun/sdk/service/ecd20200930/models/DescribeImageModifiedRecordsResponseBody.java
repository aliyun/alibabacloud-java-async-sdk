// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageModifiedRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageModifiedRecordsResponseBody</p>
 */
public class DescribeImageModifiedRecordsResponseBody extends TeaModel {
    @NameInMap("ImageModifiedRecords")
    private java.util.List < ImageModifiedRecords> imageModifiedRecords;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return imageModifiedRecords
     */
    public java.util.List < ImageModifiedRecords> getImageModifiedRecords() {
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
        private java.util.List < ImageModifiedRecords> imageModifiedRecords; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The image modification record collection.
         */
        public Builder imageModifiedRecords(java.util.List < ImageModifiedRecords> imageModifiedRecords) {
            this.imageModifiedRecords = imageModifiedRecords;
            return this;
        }

        /**
         * If the NextToken parameter is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of image modification records.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageModifiedRecordsResponseBody build() {
            return new DescribeImageModifiedRecordsResponseBody(this);
        } 

    } 

    public static class ImageModifiedRecords extends TeaModel {
        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("NewImageId")
        private String newImageId;

        @NameInMap("NewImageName")
        private String newImageName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UpdateTime")
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

            /**
             * The ID of the image before the change.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The name of the image before the change.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The ID of the new image.
             */
            public Builder newImageId(String newImageId) {
                this.newImageId = newImageId;
                return this;
            }

            /**
             * Add the image name.
             */
            public Builder newImageName(String newImageName) {
                this.newImageName = newImageName;
                return this;
            }

            /**
             * The status of the workspace.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The last time when the disaster recovery plan was updated.
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
