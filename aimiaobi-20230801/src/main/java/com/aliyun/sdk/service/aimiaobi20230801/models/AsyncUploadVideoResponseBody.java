// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link AsyncUploadVideoResponseBody} extends {@link TeaModel}
 *
 * <p>AsyncUploadVideoResponseBody</p>
 */
public class AsyncUploadVideoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AsyncUploadVideoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncUploadVideoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AsyncUploadVideoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>94512A33-8EC1-5452-A793-5C91F18ED2F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AsyncUploadVideoResponseBody build() {
            return new AsyncUploadVideoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AsyncUploadVideoResponseBody} extends {@link TeaModel}
     *
     * <p>AsyncUploadVideoResponseBody</p>
     */
    public static class VideoInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoExtraInfo")
        private String videoExtraInfo;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        private String videoName;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        private String videoUrl;

        private VideoInfos(Builder builder) {
            this.videoExtraInfo = builder.videoExtraInfo;
            this.videoId = builder.videoId;
            this.videoName = builder.videoName;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoInfos create() {
            return builder().build();
        }

        /**
         * @return videoExtraInfo
         */
        public String getVideoExtraInfo() {
            return this.videoExtraInfo;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        /**
         * @return videoName
         */
        public String getVideoName() {
            return this.videoName;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private String videoExtraInfo; 
            private String videoId; 
            private String videoName; 
            private String videoUrl; 

            private Builder() {
            } 

            private Builder(VideoInfos model) {
                this.videoExtraInfo = model.videoExtraInfo;
                this.videoId = model.videoId;
                this.videoName = model.videoName;
                this.videoUrl = model.videoUrl;
            } 

            /**
             * VideoExtraInfo.
             */
            public Builder videoExtraInfo(String videoExtraInfo) {
                this.videoExtraInfo = videoExtraInfo;
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
             * VideoName.
             */
            public Builder videoName(String videoName) {
                this.videoName = videoName;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public VideoInfos build() {
                return new VideoInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link AsyncUploadVideoResponseBody} extends {@link TeaModel}
     *
     * <p>AsyncUploadVideoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("VideoInfos")
        private java.util.List<VideoInfos> videoInfos;

        private Data(Builder builder) {
            this.taskId = builder.taskId;
            this.videoInfos = builder.videoInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return videoInfos
         */
        public java.util.List<VideoInfos> getVideoInfos() {
            return this.videoInfos;
        }

        public static final class Builder {
            private String taskId; 
            private java.util.List<VideoInfos> videoInfos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.taskId = model.taskId;
                this.videoInfos = model.videoInfos;
            } 

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * VideoInfos.
             */
            public Builder videoInfos(java.util.List<VideoInfos> videoInfos) {
                this.videoInfos = videoInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
