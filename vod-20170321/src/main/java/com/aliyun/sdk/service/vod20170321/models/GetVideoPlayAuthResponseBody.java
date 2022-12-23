// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoPlayAuthResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoPlayAuthResponseBody</p>
 */
public class GetVideoPlayAuthResponseBody extends TeaModel {
    @NameInMap("PlayAuth")
    private String playAuth;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VideoMeta")
    private VideoMeta videoMeta;

    private GetVideoPlayAuthResponseBody(Builder builder) {
        this.playAuth = builder.playAuth;
        this.requestId = builder.requestId;
        this.videoMeta = builder.videoMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPlayAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return playAuth
     */
    public String getPlayAuth() {
        return this.playAuth;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoMeta
     */
    public VideoMeta getVideoMeta() {
        return this.videoMeta;
    }

    public static final class Builder {
        private String playAuth; 
        private String requestId; 
        private VideoMeta videoMeta; 

        /**
         * The credential for video or audio playback.
         */
        public Builder playAuth(String playAuth) {
            this.playAuth = playAuth;
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
         * The metadata of the audio or video file.
         */
        public Builder videoMeta(VideoMeta videoMeta) {
            this.videoMeta = videoMeta;
            return this;
        }

        public GetVideoPlayAuthResponseBody build() {
            return new GetVideoPlayAuthResponseBody(this);
        } 

    } 

    public static class VideoMeta extends TeaModel {
        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("VideoId")
        private String videoId;

        private VideoMeta(Builder builder) {
            this.coverURL = builder.coverURL;
            this.duration = builder.duration;
            this.status = builder.status;
            this.title = builder.title;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoMeta create() {
            return builder().build();
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String coverURL; 
            private Float duration; 
            private String status; 
            private String title; 
            private String videoId; 

            /**
             * The thumbnail URL of the audio or video file.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The duration of the audio or video file. Unit: seconds.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The status of the audio or video file. For more information about the value range and description, see the [Status](~~52839~~) table.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The title of the audio or video file.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The ID of the audio or video file.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public VideoMeta build() {
                return new VideoMeta(this);
            } 

        } 

    }
}
