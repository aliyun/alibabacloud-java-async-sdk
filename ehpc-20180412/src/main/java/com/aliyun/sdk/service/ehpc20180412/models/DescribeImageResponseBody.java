// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageResponseBody</p>
 */
public class DescribeImageResponseBody extends TeaModel {
    @NameInMap("ImageInfo")
    private ImageInfo imageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImageResponseBody(Builder builder) {
        this.imageInfo = builder.imageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageInfo
     */
    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageInfo imageInfo; 
        private String requestId; 

        /**
         * ImageInfo.
         */
        public Builder imageInfo(ImageInfo imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageResponseBody build() {
            return new DescribeImageResponseBody(this);
        } 

    } 

    public static class ImageInfo extends TeaModel {
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

        private ImageInfo(Builder builder) {
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

        public static ImageInfo create() {
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
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Repository.
             */
            public Builder repository(String repository) {
                this.repository = repository;
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
             * System.
             */
            public Builder system(String system) {
                this.system = system;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateDateTime.
             */
            public Builder updateDateTime(String updateDateTime) {
                this.updateDateTime = updateDateTime;
                return this;
            }

            public ImageInfo build() {
                return new ImageInfo(this);
            } 

        } 

    }
}
