// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VideoMediaMetadata} extends {@link TeaModel}
 *
 * <p>VideoMediaMetadata</p>
 */
public class VideoMediaMetadata extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("height")
    private Long height;

    @com.aliyun.core.annotation.NameInMap("video_media_audio_stream")
    private java.util.List < VideoMediaAudioStream > videoMediaAudioStream;

    @com.aliyun.core.annotation.NameInMap("video_media_video_stream")
    private java.util.List < VideoMediaVideoStream > videoMediaVideoStream;

    @com.aliyun.core.annotation.NameInMap("width")
    private Long width;

    private VideoMediaMetadata(Builder builder) {
        this.height = builder.height;
        this.videoMediaAudioStream = builder.videoMediaAudioStream;
        this.videoMediaVideoStream = builder.videoMediaVideoStream;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoMediaMetadata create() {
        return builder().build();
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    /**
     * @return videoMediaAudioStream
     */
    public java.util.List < VideoMediaAudioStream > getVideoMediaAudioStream() {
        return this.videoMediaAudioStream;
    }

    /**
     * @return videoMediaVideoStream
     */
    public java.util.List < VideoMediaVideoStream > getVideoMediaVideoStream() {
        return this.videoMediaVideoStream;
    }

    /**
     * @return width
     */
    public Long getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Long height; 
        private java.util.List < VideoMediaAudioStream > videoMediaAudioStream; 
        private java.util.List < VideoMediaVideoStream > videoMediaVideoStream; 
        private Long width; 

        /**
         * height.
         */
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * video_media_audio_stream.
         */
        public Builder videoMediaAudioStream(java.util.List < VideoMediaAudioStream > videoMediaAudioStream) {
            this.videoMediaAudioStream = videoMediaAudioStream;
            return this;
        }

        /**
         * video_media_video_stream.
         */
        public Builder videoMediaVideoStream(java.util.List < VideoMediaVideoStream > videoMediaVideoStream) {
            this.videoMediaVideoStream = videoMediaVideoStream;
            return this;
        }

        /**
         * width.
         */
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        public VideoMediaMetadata build() {
            return new VideoMediaMetadata(this);
        } 

    } 

}
