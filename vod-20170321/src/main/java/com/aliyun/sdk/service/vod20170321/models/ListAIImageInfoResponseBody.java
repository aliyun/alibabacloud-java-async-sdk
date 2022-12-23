// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAIImageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIImageInfoResponseBody</p>
 */
public class ListAIImageInfoResponseBody extends TeaModel {
    @NameInMap("AIImageInfoList")
    private java.util.List < AIImageInfoList> AIImageInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private ListAIImageInfoResponseBody(Builder builder) {
        this.AIImageInfoList = builder.AIImageInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIImageInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIImageInfoList
     */
    public java.util.List < AIImageInfoList> getAIImageInfoList() {
        return this.AIImageInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AIImageInfoList> AIImageInfoList; 
        private String requestId; 

        /**
         * The image files that are uploaded for AI processing.
         */
        public Builder AIImageInfoList(java.util.List < AIImageInfoList> AIImageInfoList) {
            this.AIImageInfoList = AIImageInfoList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIImageInfoResponseBody build() {
            return new ListAIImageInfoResponseBody(this);
        } 

    } 

    public static class AIImageInfoList extends TeaModel {
        @NameInMap("AIImageInfoId")
        private String AIImageInfoId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("FileURL")
        private String fileURL;

        @NameInMap("Format")
        private String format;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Score")
        private String score;

        @NameInMap("Version")
        private String version;

        @NameInMap("VideoId")
        private String videoId;

        private AIImageInfoList(Builder builder) {
            this.AIImageInfoId = builder.AIImageInfoId;
            this.creationTime = builder.creationTime;
            this.fileURL = builder.fileURL;
            this.format = builder.format;
            this.jobId = builder.jobId;
            this.score = builder.score;
            this.version = builder.version;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIImageInfoList create() {
            return builder().build();
        }

        /**
         * @return AIImageInfoId
         */
        public String getAIImageInfoId() {
            return this.AIImageInfoId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String AIImageInfoId; 
            private String creationTime; 
            private String fileURL; 
            private String format; 
            private String jobId; 
            private String score; 
            private String version; 
            private String videoId; 

            /**
             * The ID of the image information.
             */
            public Builder AIImageInfoId(String AIImageInfoId) {
                this.AIImageInfoId = AIImageInfoId;
                return this;
            }

            /**
             * The time when the file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The URL of the image file.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * The format of the image. Valid values: **gif** and **png**.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The ID of the image AI processing job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The score of the image.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The data version ID.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The ID of the video.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public AIImageInfoList build() {
                return new AIImageInfoList(this);
            } 

        } 

    }
}
