// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateLiveTranscodeTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveTranscodeTemplateRequest</p>
 */
public class UpdateLiveTranscodeTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    private TemplateConfig templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private UpdateLiveTranscodeTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.templateConfig = builder.templateConfig;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveTranscodeTemplateRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateLiveTranscodeTemplateRequest, Builder> {
        private String name; 
        private TemplateConfig templateConfig; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveTranscodeTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.templateConfig = request.templateConfig;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The template name.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The configuration of the template.</p>
         */
        public Builder templateConfig(TemplateConfig templateConfig) {
            String templateConfigShrink = shrink(templateConfig, "TemplateConfig", "json");
            this.putQueryParameter("TemplateConfig", templateConfigShrink);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The template ID. To obtain the template ID, log on to the <a href="https://ims.console.aliyun.com/summary">Intelligent Media Services (IMS) console</a>, choose Real-time Media Processing &gt; Template Management, and then click the Transcoding tab. Alternatively, find the ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/449217.html">CreateLiveTranscodeTemplate</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateLiveTranscodeTemplateRequest build() {
            return new UpdateLiveTranscodeTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLiveTranscodeTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateLiveTranscodeTemplateRequest</p>
     */
    public static class AudioParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Samplerate")
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
             * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The number of sound channels. Valid values: 1: mono 2: binaural</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The audio codec. Valid values: AAC MP3</p>
             * 
             * <strong>example:</strong>
             * <p>AAC</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The audio codec profile. Valid values when the Codec parameter is set to AAC:</p>
             * <ul>
             * <li>aac_low</li>
             * <li>aac_he</li>
             * <li>aac_he_v2</li>
             * <li>aac_ld</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aac_low</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The audio sampling rate. Valid values: 22050 to 96000.</p>
             * <p>Note If you set AudioProfile to aac_ld, the audio sampling rate cannot exceed 44100.</p>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
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
    /**
     * 
     * {@link UpdateLiveTranscodeTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateLiveTranscodeTemplateRequest</p>
     */
    public static class VideoParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Width")
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
             * <p>The bitrate of the output video. Unit: Kbit/s. Valid values: 1 to 6000.</p>
             * 
             * <strong>example:</strong>
             * <p>2500</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The encoding type. Valid values:</p>
             * <ul>
             * <li>H.264</li>
             * <li>H.265</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>H.264</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The frame rate of the output video. Unit: frames per second (FPS). Valid values: 1 to 60.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The group of pictures (GOP) of the output video. Unit: frame. Valid values: 1 to 3000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The height of the output video. Valid values:</p>
             * <ul>
             * <li>Height ≥ 128</li>
             * <li>max (Height,Width) ≤ 2560</li>
             * <li>min（Height,Width）≤ 1440</li>
             * </ul>
             * <blockquote>
             * <p> The resolution of a video transcoded by using the H.265 Narrowband HD template cannot exceed 1,280 × 720 pixels.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The video encoding profile. The profile determines how a video is encoded. In most cases, a greater value indicates better image quality and higher resource consumption. Valid values:</p>
             * <ul>
             * <li>1: baseline. This value is suitable for mobile devices.</li>
             * <li>2: main. This value is suitable for standard-definition devices.</li>
             * <li>3: high. This value is suitable for high-definition devices.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The width of the output video. Valid values:</p>
             * <ul>
             * <li>Width ≥ 128</li>
             * <li>max (Height,Width) ≤ 2560</li>
             * <li>min（Height,Width）≤ 1440</li>
             * </ul>
             * <blockquote>
             * <p> The resolution of a video transcoded by using the H.265 Narrowband HD template cannot exceed 1,280 × 720 pixels.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
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
    /**
     * 
     * {@link UpdateLiveTranscodeTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateLiveTranscodeTemplateRequest</p>
     */
    public static class TemplateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioParams")
        private AudioParams audioParams;

        @com.aliyun.core.annotation.NameInMap("VideoParams")
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
             * <p>The audio parameters.</p>
             */
            public Builder audioParams(AudioParams audioParams) {
                this.audioParams = audioParams;
                return this;
            }

            /**
             * <p>The video parameters.</p>
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
