// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListDynamicImageResponseBody} extends {@link TeaModel}
 *
 * <p>ListDynamicImageResponseBody</p>
 */
public class ListDynamicImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicImageList")
    private java.util.List<DynamicImageList> dynamicImageList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<DynamicImageList> getDynamicImageList() {
        return this.dynamicImageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DynamicImageList> dynamicImageList; 
        private String requestId; 

        /**
         * <p>The list of animated stickers.</p>
         */
        public Builder dynamicImageList(java.util.List<DynamicImageList> dynamicImageList) {
            this.dynamicImageList = dynamicImageList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>570189B6-572E-4953-13B4278EE0D8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDynamicImageResponseBody build() {
            return new ListDynamicImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDynamicImageResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicImageResponseBody</p>
     */
    public static class DynamicImageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("DynamicImageId")
        private String dynamicImageId;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        @com.aliyun.core.annotation.NameInMap("Width")
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
             * <p>The time when the animated sticker was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-28T02:01:06Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The duration of the animated sticker. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the animated sticker.</p>
             * 
             * <strong>example:</strong>
             * <p>2b4e51df60323ef43d6e336ecf****</p>
             */
            public Builder dynamicImageId(String dynamicImageId) {
                this.dynamicImageId = dynamicImageId;
                return this;
            }

            /**
             * <p>The size of the animated sticker file. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>119866</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The URL of the animated sticker file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com/2e114f110059*****0c3193918fd449a/image/dynamic/2b4e51df60*****323ef43d6e336ecf.webp?auth_key=1597296785-0-0-4a48e85*****bd2bb358e0b3cade">https://example.aliyundoc.com/2e114f110059*****0c3193918fd449a/image/dynamic/2b4e51df60*****323ef43d6e336ecf.webp?auth_key=1597296785-0-0-4a48e85*****bd2bb358e0b3cade</a></p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The format of the animated sticker. Valid values: gif and webp.</p>
             * 
             * <strong>example:</strong>
             * <p>webp</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The frame rate of the animated sticker. Unit: frames per second.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The height of the animated sticker. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The job ID for creating the animated sticker.</p>
             * 
             * <strong>example:</strong>
             * <p>2bf4390af9e5491c09cc720ad****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>2e114f1100590c3193918fd449a****</p>
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            /**
             * <p>The width of the animated sticker. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>640</p>
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
