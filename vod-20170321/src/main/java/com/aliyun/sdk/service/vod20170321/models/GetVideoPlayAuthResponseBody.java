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
 * {@link GetVideoPlayAuthResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoPlayAuthResponseBody</p>
 */
public class GetVideoPlayAuthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlayAuth")
    private String playAuth;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VideoMeta")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetVideoPlayAuthResponseBody model) {
            this.playAuth = model.playAuth;
            this.requestId = model.requestId;
            this.videoMeta = model.videoMeta;
        } 

        /**
         * <p>The credential for media playback.</p>
         * 
         * <strong>example:</strong>
         * <p>sstyYuew6789000000xtt7TYUh****</p>
         */
        public Builder playAuth(String playAuth) {
            this.playAuth = playAuth;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metadata of the audio or video file.</p>
         */
        public Builder videoMeta(VideoMeta videoMeta) {
            this.videoMeta = videoMeta;
            return this;
        }

        public GetVideoPlayAuthResponseBody build() {
            return new GetVideoPlayAuthResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoPlayAuthResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoPlayAuthResponseBody</p>
     */
    public static class VideoMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("VideoId")
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

            private Builder() {
            } 

            private Builder(VideoMeta model) {
                this.coverURL = model.coverURL;
                this.duration = model.duration;
                this.status = model.status;
                this.title = model.title;
                this.videoId = model.videoId;
            } 

            /**
             * <p>The thumbnail URL of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The duration of the media file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120.0</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The status of the media file. For more information about the value range and description, see <a href="~~52839#title-vqg-8cz-7p8~~">Status: the status of a video</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>VOD</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>dfde02284a5c46622a097adaf44a****</p>
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
