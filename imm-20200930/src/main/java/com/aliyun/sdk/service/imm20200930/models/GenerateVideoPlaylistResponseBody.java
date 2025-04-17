// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link GenerateVideoPlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateVideoPlaylistResponseBody</p>
 */
public class GenerateVideoPlaylistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AudioPlaylist")
    private java.util.List<AudioPlaylist> audioPlaylist;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Float duration;

    @com.aliyun.core.annotation.NameInMap("MasterURI")
    private String masterURI;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubtitlePlaylist")
    private java.util.List<SubtitlePlaylist> subtitlePlaylist;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("VideoPlaylist")
    private java.util.List<VideoPlaylist> videoPlaylist;

    private GenerateVideoPlaylistResponseBody(Builder builder) {
        this.audioPlaylist = builder.audioPlaylist;
        this.duration = builder.duration;
        this.masterURI = builder.masterURI;
        this.requestId = builder.requestId;
        this.subtitlePlaylist = builder.subtitlePlaylist;
        this.token = builder.token;
        this.videoPlaylist = builder.videoPlaylist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateVideoPlaylistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioPlaylist
     */
    public java.util.List<AudioPlaylist> getAudioPlaylist() {
        return this.audioPlaylist;
    }

    /**
     * @return duration
     */
    public Float getDuration() {
        return this.duration;
    }

    /**
     * @return masterURI
     */
    public String getMasterURI() {
        return this.masterURI;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subtitlePlaylist
     */
    public java.util.List<SubtitlePlaylist> getSubtitlePlaylist() {
        return this.subtitlePlaylist;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return videoPlaylist
     */
    public java.util.List<VideoPlaylist> getVideoPlaylist() {
        return this.videoPlaylist;
    }

    public static final class Builder {
        private java.util.List<AudioPlaylist> audioPlaylist; 
        private Float duration; 
        private String masterURI; 
        private String requestId; 
        private java.util.List<SubtitlePlaylist> subtitlePlaylist; 
        private String token; 
        private java.util.List<VideoPlaylist> videoPlaylist; 

        private Builder() {
        } 

        private Builder(GenerateVideoPlaylistResponseBody model) {
            this.audioPlaylist = model.audioPlaylist;
            this.duration = model.duration;
            this.masterURI = model.masterURI;
            this.requestId = model.requestId;
            this.subtitlePlaylist = model.subtitlePlaylist;
            this.token = model.token;
            this.videoPlaylist = model.videoPlaylist;
        } 

        /**
         * <p>The audio media playlist files.</p>
         */
        public Builder audioPlaylist(java.util.List<AudioPlaylist> audioPlaylist) {
            this.audioPlaylist = audioPlaylist;
            return this;
        }

        /**
         * <p>The total duration of the generated video.</p>
         * 
         * <strong>example:</strong>
         * <p>1082</p>
         */
        public Builder duration(Float duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The OSS path of the master playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object/master.m3u8</p>
         */
        public Builder masterURI(String masterURI) {
            this.masterURI = masterURI;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The subtitle media playlist files.</p>
         */
        public Builder subtitlePlaylist(java.util.List<SubtitlePlaylist> subtitlePlaylist) {
            this.subtitlePlaylist = subtitlePlaylist;
            return this;
        }

        /**
         * <p>The token of the master playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>92376fbb-171f-4259-913f-705f7ee0****</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>The video media playlist files.</p>
         */
        public Builder videoPlaylist(java.util.List<VideoPlaylist> videoPlaylist) {
            this.videoPlaylist = videoPlaylist;
            return this;
        }

        public GenerateVideoPlaylistResponseBody build() {
            return new GenerateVideoPlaylistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateVideoPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateVideoPlaylistResponseBody</p>
     */
    public static class AudioPlaylist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private Integer channels;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private AudioPlaylist(Builder builder) {
            this.channels = builder.channels;
            this.token = builder.token;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioPlaylist create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public Integer getChannels() {
            return this.channels;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private Integer channels; 
            private String token; 
            private String URI; 

            private Builder() {
            } 

            private Builder(AudioPlaylist model) {
                this.channels = model.channels;
                this.token = model.token;
                this.URI = model.URI;
            } 

            /**
             * <p>The number of audio channels.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder channels(Integer channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The token of the audio media playlist. You can use this parameter to generate the path of a TS file.</p>
             * 
             * <strong>example:</strong>
             * <p>affe0c6042f09722fec95a21b8b******</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>The OSS path of the audio media playlist.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://imm-test/testcases/video.m3u8</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public AudioPlaylist build() {
                return new AudioPlaylist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateVideoPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateVideoPlaylistResponseBody</p>
     */
    public static class SubtitlePlaylist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private SubtitlePlaylist(Builder builder) {
            this.index = builder.index;
            this.language = builder.language;
            this.token = builder.token;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitlePlaylist create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private Integer index; 
            private String language; 
            private String token; 
            private String URI; 

            private Builder() {
            } 

            private Builder(SubtitlePlaylist model) {
                this.index = model.index;
                this.language = model.language;
                this.token = model.token;
                this.URI = model.URI;
            } 

            /**
             * <p>The serial number of the subtitle stream. The value starts from 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language of the subtitle stream.</p>
             * <blockquote>
             * <p> The language is derived from the subtitle stream information in the OSS path specified by the SourceURI parameter for a source video. If no language information exists in the source video, null is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The token of the subtitle media playlist. You can use this parameter to generate the path of a subtitle file.</p>
             * <blockquote>
             * <p> You can generate the path of a transcoded subtitle file based on the returned token value. The path must be in the oss://${Bucket}/${Object}-${Token}_${Index}.ts format. oss://${Bucket}/${Object} specifies the URI specified by input parameters for output files. ${Token} specifies the returned token value, and ${Index} specifies the serial number of a subtitle file.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>affe0c6042f09722fec95a21b8b******</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>The OSS path of the subtitle media playlist.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://imm-test/testcases/vide_0.m3u8</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public SubtitlePlaylist build() {
                return new SubtitlePlaylist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateVideoPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateVideoPlaylistResponseBody</p>
     */
    public static class VideoPlaylist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private String frameRate;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private VideoPlaylist(Builder builder) {
            this.frameRate = builder.frameRate;
            this.resolution = builder.resolution;
            this.token = builder.token;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoPlaylist create() {
            return builder().build();
        }

        /**
         * @return frameRate
         */
        public String getFrameRate() {
            return this.frameRate;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String frameRate; 
            private String resolution; 
            private String token; 
            private String URI; 

            private Builder() {
            } 

            private Builder(VideoPlaylist model) {
                this.frameRate = model.frameRate;
                this.resolution = model.resolution;
                this.token = model.token;
                this.URI = model.URI;
            } 

            /**
             * <p>The video frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>25/1</p>
             */
            public Builder frameRate(String frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * <p>The video resolution.</p>
             * 
             * <strong>example:</strong>
             * <p>640x480</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The token of the video media playlist. You can use this parameter to generate the path of a TS file.</p>
             * <blockquote>
             * <p> You can generate the path of a transcoded TS file based on the value of this parameter. The path must be in the oss://${Bucket}/${Object}-${Token}-${Index}.ts format. oss://${Bucket}/${Object} specifies the URI specified by input parameters for output files. ${Token} specifies the returned token, and ${Index} specifies the serial number of a TS file.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>affe0c6042f09722fec95a21b8b******</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>The OSS path of the video media playlist.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://imm-test/testcases/video.m3u8</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public VideoPlaylist build() {
                return new VideoPlaylist(this);
            } 

        } 

    }
}
