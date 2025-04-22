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
 * {@link ListAIImageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIImageInfoResponseBody</p>
 */
public class ListAIImageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIImageInfoList")
    private java.util.List<AIImageInfoList> AIImageInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIImageInfoList
     */
    public java.util.List<AIImageInfoList> getAIImageInfoList() {
        return this.AIImageInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AIImageInfoList> AIImageInfoList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIImageInfoResponseBody model) {
            this.AIImageInfoList = model.AIImageInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The image files that are uploaded for AI processing.</p>
         */
        public Builder AIImageInfoList(java.util.List<AIImageInfoList> AIImageInfoList) {
            this.AIImageInfoList = AIImageInfoList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D73420CD-D221-9122-5B8FA995A511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIImageInfoResponseBody build() {
            return new ListAIImageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIImageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIImageInfoResponseBody</p>
     */
    public static class AIImageInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIImageInfoId")
        private String AIImageInfoId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VideoId")
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

            private Builder() {
            } 

            private Builder(AIImageInfoList model) {
                this.AIImageInfoId = model.AIImageInfoId;
                this.creationTime = model.creationTime;
                this.fileURL = model.fileURL;
                this.format = model.format;
                this.jobId = model.jobId;
                this.score = model.score;
                this.version = model.version;
                this.videoId = model.videoId;
            } 

            /**
             * <p>The ID of the image information.</p>
             * 
             * <strong>example:</strong>
             * <p>b89a6aabf1b6197ebd6fe6cf29****</p>
             */
            public Builder AIImageInfoId(String AIImageInfoId) {
                this.AIImageInfoId = AIImageInfoId;
                return this;
            }

            /**
             * <p>The time when the file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-15T03:30:03Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The URL of the image file.</p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The format of the image. Valid values: <strong>gif</strong> and <strong>png</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>gif</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The ID of the image AI processing job.</p>
             * 
             * <strong>example:</strong>
             * <p>cf08a2c6e11ee1711b738b9067****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The score of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>5.035636554444242</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The data version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b547f3f0e199c3b457369f3cf****</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The ID of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>357a8748c5789d2726e6436aa****</p>
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
