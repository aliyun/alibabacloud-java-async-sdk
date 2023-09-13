// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveTranscodeTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveTranscodeTemplateRequest</p>
 */
public class CreateLiveTranscodeTemplateRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true, maxLength = 20, minLength = 1)
    private String name;

    @Query
    @NameInMap("TemplateConfig")
    private TemplateConfig templateConfig;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateLiveTranscodeTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.templateConfig = builder.templateConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveTranscodeTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateConfig
     */
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateLiveTranscodeTemplateRequest, Builder> {
        private String name; 
        private TemplateConfig templateConfig; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveTranscodeTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.templateConfig = request.templateConfig;
            this.type = request.type;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TemplateConfig.
         */
        public Builder templateConfig(TemplateConfig templateConfig) {
            String templateConfigShrink = shrink(templateConfig, "TemplateConfig", "json");
            this.putQueryParameter("TemplateConfig", templateConfigShrink);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateLiveTranscodeTemplateRequest build() {
            return new CreateLiveTranscodeTemplateRequest(this);
        } 

    } 

    public static class AudioParams extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Channels")
        private String channels;

        @NameInMap("Codec")
        private String codec;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Samplerate")
        private String samplerate;

        private AudioParams(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channels = builder.channels;
            this.codec = builder.codec;
            this.profile = builder.profile;
            this.samplerate = builder.samplerate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioParams create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        public static final class Builder {
            private String bitrate; 
            private String channels; 
            private String codec; 
            private String profile; 
            private String samplerate; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Samplerate.
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            public AudioParams build() {
                return new AudioParams(this);
            } 

        } 

    }
    public static class VideoParams extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Codec")
        private String codec;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Gop")
        private String gop;

        @NameInMap("Height")
        private String height;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Width")
        private String width;

        private VideoParams(Builder builder) {
            this.bitrate = builder.bitrate;
            this.codec = builder.codec;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.profile = builder.profile;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoParams create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return gop
         */
        public String getGop() {
            return this.gop;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private String codec; 
            private String fps; 
            private String gop; 
            private String height; 
            private String profile; 
            private String width; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Gop.
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public VideoParams build() {
                return new VideoParams(this);
            } 

        } 

    }
    public static class TemplateConfig extends TeaModel {
        @NameInMap("AudioParams")
        private AudioParams audioParams;

        @NameInMap("VideoParams")
        private VideoParams videoParams;

        private TemplateConfig(Builder builder) {
            this.audioParams = builder.audioParams;
            this.videoParams = builder.videoParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateConfig create() {
            return builder().build();
        }

        /**
         * @return audioParams
         */
        public AudioParams getAudioParams() {
            return this.audioParams;
        }

        /**
         * @return videoParams
         */
        public VideoParams getVideoParams() {
            return this.videoParams;
        }

        public static final class Builder {
            private AudioParams audioParams; 
            private VideoParams videoParams; 

            /**
             * AudioParams.
             */
            public Builder audioParams(AudioParams audioParams) {
                this.audioParams = audioParams;
                return this;
            }

            /**
             * VideoParams.
             */
            public Builder videoParams(VideoParams videoParams) {
                this.videoParams = videoParams;
                return this;
            }

            public TemplateConfig build() {
                return new TemplateConfig(this);
            } 

        } 

    }
}
