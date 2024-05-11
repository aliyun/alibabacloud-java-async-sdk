// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateVideoPlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateVideoPlaylistResponseBody</p>
 */
public class GenerateVideoPlaylistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AudioPlaylist")
    private java.util.List < AudioPlaylist> audioPlaylist;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Float duration;

    @com.aliyun.core.annotation.NameInMap("MasterURI")
    private String masterURI;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubtitlePlaylist")
    private java.util.List < SubtitlePlaylist> subtitlePlaylist;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("VideoPlaylist")
    private java.util.List < VideoPlaylist> videoPlaylist;

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

    /**
     * @return audioPlaylist
     */
    public java.util.List < AudioPlaylist> getAudioPlaylist() {
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
    public java.util.List < SubtitlePlaylist> getSubtitlePlaylist() {
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
    public java.util.List < VideoPlaylist> getVideoPlaylist() {
        return this.videoPlaylist;
    }

    public static final class Builder {
        private java.util.List < AudioPlaylist> audioPlaylist; 
        private Float duration; 
        private String masterURI; 
        private String requestId; 
        private java.util.List < SubtitlePlaylist> subtitlePlaylist; 
        private String token; 
        private java.util.List < VideoPlaylist> videoPlaylist; 

        /**
         * 转码文件列表。
         */
        public Builder audioPlaylist(java.util.List < AudioPlaylist> audioPlaylist) {
            this.audioPlaylist = audioPlaylist;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Float duration) {
            this.duration = duration;
            return this;
        }

        /**
         * MasterURI.
         */
        public Builder masterURI(String masterURI) {
            this.masterURI = masterURI;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 转码文件列表。
         */
        public Builder subtitlePlaylist(java.util.List < SubtitlePlaylist> subtitlePlaylist) {
            this.subtitlePlaylist = subtitlePlaylist;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * 转码文件列表。
         */
        public Builder videoPlaylist(java.util.List < VideoPlaylist> videoPlaylist) {
            this.videoPlaylist = videoPlaylist;
            return this;
        }

        public GenerateVideoPlaylistResponseBody build() {
            return new GenerateVideoPlaylistResponseBody(this);
        } 

    } 

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

            /**
             * Channels.
             */
            public Builder channels(Integer channels) {
                this.channels = channels;
                return this;
            }

            /**
             * 转码生成的Token。用于LiveTranscoding访问的参数。
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * 输出m3u8的OSS地址。地址规则为 Target.URI + ".m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。
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

            /**
             * 字幕流编号，从0开始。
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * 视频源中字幕流的语言。
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * 转码生成的Token。用于LiveTranscoding访问的参数。
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * 输出m3u8的OSS地址。地址规则为 Target.URI + “_” + Index + ".m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。
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

            /**
             * FrameRate.
             */
            public Builder frameRate(String frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * 转码生成的Token。用于LiveTranscoding访问的参数。
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * 输出m3u8的OSS地址。地址规则为 Target.URI + ".m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。
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
