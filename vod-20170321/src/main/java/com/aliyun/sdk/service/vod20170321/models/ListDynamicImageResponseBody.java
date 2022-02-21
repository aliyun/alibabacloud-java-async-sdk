// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDynamicImageResponseBody} extends {@link TeaModel}
 *
 * <p>ListDynamicImageResponseBody</p>
 */
public class ListDynamicImageResponseBody extends TeaModel {
    @NameInMap("DynamicImageList")
    private java.util.List < DynamicImageList> dynamicImageList;

    @NameInMap("RequestId")
    private String requestId;

    private ListDynamicImageResponseBody(Builder builder) {
        this.dynamicImageList = builder.dynamicImageList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicImageList
     */
    public java.util.List < DynamicImageList> getDynamicImageList() {
        return this.dynamicImageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DynamicImageList> dynamicImageList; 
        private String requestId; 

        /**
         * DynamicImageList.
         */
        public Builder dynamicImageList(java.util.List < DynamicImageList> dynamicImageList) {
            this.dynamicImageList = dynamicImageList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDynamicImageResponseBody build() {
            return new ListDynamicImageResponseBody(this);
        } 

    } 

    public static class DynamicImageList extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("DynamicImageId")
        private String dynamicImageId;

        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("FileURL")
        private String fileURL;

        @NameInMap("Format")
        private String format;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Height")
        private String height;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("VideoId")
        private String videoId;

        @NameInMap("Width")
        private String width;

        private DynamicImageList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.duration = builder.duration;
            this.dynamicImageId = builder.dynamicImageId;
            this.fileSize = builder.fileSize;
            this.fileURL = builder.fileURL;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.jobId = builder.jobId;
            this.videoId = builder.videoId;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicImageList create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return dynamicImageId
         */
        public String getDynamicImageId() {
            return this.dynamicImageId;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String creationTime; 
            private String duration; 
            private String dynamicImageId; 
            private String fileSize; 
            private String fileURL; 
            private String format; 
            private String fps; 
            private String height; 
            private String jobId; 
            private String videoId; 
            private String width; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * DynamicImageId.
             */
            public Builder dynamicImageId(String dynamicImageId) {
                this.dynamicImageId = dynamicImageId;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FileURL.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public DynamicImageList build() {
                return new DynamicImageList(this);
            } 

        } 

    }
}
