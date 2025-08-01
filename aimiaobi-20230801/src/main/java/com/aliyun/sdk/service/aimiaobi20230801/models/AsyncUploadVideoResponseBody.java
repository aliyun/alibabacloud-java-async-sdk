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

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AsyncUploadVideoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AsyncUploadVideoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
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
