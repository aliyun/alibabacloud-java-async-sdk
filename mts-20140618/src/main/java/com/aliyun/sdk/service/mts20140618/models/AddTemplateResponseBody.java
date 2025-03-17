// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link AddTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>AddTemplateResponseBody</p>
 */
public class AddTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Template")
    private Template template;

    private AddTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String requestId; 
        private Template template; 

        private Builder() {
        } 

        private Builder(AddTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.template = model.template;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FA258E67-09B8-4EAA-8F33-BA567834A2C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the transcoding template.</p>
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        public AddTemplateResponseBody build() {
            return new AddTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Volume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntegratedLoudnessTarget")
        private String integratedLoudnessTarget;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LoudnessRangeTarget")
        private String loudnessRangeTarget;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("PeakLevel")
        private String peakLevel;

        @com.aliyun.core.annotation.NameInMap("TruePeak")
        private String truePeak;

        private Volume(Builder builder) {
            this.integratedLoudnessTarget = builder.integratedLoudnessTarget;
            this.level = builder.level;
            this.loudnessRangeTarget = builder.loudnessRangeTarget;
            this.method = builder.method;
            this.peakLevel = builder.peakLevel;
            this.truePeak = builder.truePeak;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volume create() {
            return builder().build();
        }

        /**
         * @return integratedLoudnessTarget
         */
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return loudnessRangeTarget
         */
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return peakLevel
         */
        public String getPeakLevel() {
            return this.peakLevel;
        }

        /**
         * @return truePeak
         */
        public String getTruePeak() {
            return this.truePeak;
        }

        public static final class Builder {
            private String integratedLoudnessTarget; 
            private String level; 
            private String loudnessRangeTarget; 
            private String method; 
            private String peakLevel; 
            private String truePeak; 

            private Builder() {
            } 

            private Builder(Volume model) {
                this.integratedLoudnessTarget = model.integratedLoudnessTarget;
                this.level = model.level;
                this.loudnessRangeTarget = model.loudnessRangeTarget;
                this.method = model.method;
                this.peakLevel = model.peakLevel;
                this.truePeak = model.truePeak;
            } 

            /**
             * <p>The output volume.</p>
             * <p>This parameter takes effect only when the value of Method is dynamic.</p>
             * <p>Unit: dB.</p>
             * <p>Valid values: [-70,-5].</p>
             * <p>Default value: -6.</p>
             * 
             * <strong>example:</strong>
             * <p>-6</p>
             */
            public Builder integratedLoudnessTarget(String integratedLoudnessTarget) {
                this.integratedLoudnessTarget = integratedLoudnessTarget;
                return this;
            }

            /**
             * <p>The volume adjustment range.</p>
             * <ul>
             * <li>Default value: <strong>-20</strong>.</li>
             * <li>Unit: dB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-20</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The range of the volume relative to the output volume.</p>
             * <p>This parameter takes effect only when the value of Method is dynamic.</p>
             * <p>Unit: dB.</p>
             * <p>Valid values: [1,20].</p>
             * <p>Default value: 8.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder loudnessRangeTarget(String loudnessRangeTarget) {
                this.loudnessRangeTarget = loudnessRangeTarget;
                return this;
            }

            /**
             * <p>The volume adjustment method. Valid values:</p>
             * <ul>
             * <li><strong>auto</strong>: The volume is automatically adjusted.</li>
             * <li><strong>dynamic</strong>: The volume is dynamically adjusted.</li>
             * <li><strong>linear</strong>: The volume is linearly adjusted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The volume adjustment coefficient.</p>
             * <p>This parameter takes effect only when the value of Method is adaptive.</p>
             * <p>Valid values: [0,1].</p>
             * <p>Default value: 0.9.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder peakLevel(String peakLevel) {
                this.peakLevel = peakLevel;
                return this;
            }

            /**
             * <p>The peak volume.</p>
             * <p>This parameter takes effect only when the value of Method is dynamic.</p>
             * <p>Unit: dB.</p>
             * <p>Valid values: [-9,0].</p>
             * <p>Default value: -1.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder truePeak(String truePeak) {
                this.truePeak = truePeak;
                return this;
            }

            public Volume build() {
                return new Volume(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Audio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Qscale")
        private String qscale;

        @com.aliyun.core.annotation.NameInMap("Remove")
        private String remove;

        @com.aliyun.core.annotation.NameInMap("Samplerate")
        private String samplerate;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Volume volume;

        private Audio(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channels = builder.channels;
            this.codec = builder.codec;
            this.profile = builder.profile;
            this.qscale = builder.qscale;
            this.remove = builder.remove;
            this.samplerate = builder.samplerate;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audio create() {
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
         * @return qscale
         */
        public String getQscale() {
            return this.qscale;
        }

        /**
         * @return remove
         */
        public String getRemove() {
            return this.remove;
        }

        /**
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        /**
         * @return volume
         */
        public Volume getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String bitrate; 
            private String channels; 
            private String codec; 
            private String profile; 
            private String qscale; 
            private String remove; 
            private String samplerate; 
            private Volume volume; 

            private Builder() {
            } 

            private Builder(Audio model) {
                this.bitrate = model.bitrate;
                this.channels = model.channels;
                this.codec = model.codec;
                this.profile = model.profile;
                this.qscale = model.qscale;
                this.remove = model.remove;
                this.samplerate = model.samplerate;
                this.volume = model.volume;
            } 

            /**
             * <p>The audio bitrate of the output file.</p>
             * <ul>
             * <li>Unit: Kbit/s.</li>
             * <li>Default value: <strong>128</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The number of sound channels. Default value: <strong>2</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The audio codec format. Default value: <strong>aac</strong>. Valid values:</p>
             * <ul>
             * <li><strong>aac</strong></li>
             * <li><strong>mp3</strong></li>
             * <li><strong>vorbis</strong></li>
             * <li><strong>flac</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The codec profile of the audio. Valid values if the <strong>Codec</strong> parameter is set to <strong>AAC</strong>:</p>
             * <ul>
             * <li><strong>aac_low</strong></li>
             * <li><strong>aac_he</strong></li>
             * <li><strong>aac_he_v2</strong></li>
             * <li><strong>aac_ld</strong></li>
             * <li><strong>aac_eld</strong></li>
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
             * <p>The level of the independent denoising algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * <p>Indicates whether the audio stream is deleted.</p>
             * <ul>
             * <li><strong>true</strong>: The audio stream is deleted.</li>
             * <li><strong>false</strong>: The audio stream is retained.</li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder remove(String remove) {
                this.remove = remove;
                return this;
            }

            /**
             * <p>The sampling rate.</p>
             * <ul>
             * <li>Unit: Hz.</li>
             * <li>Default value: <strong>44100</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * <p>The volume control configurations</p>
             */
            public Builder volume(Volume volume) {
                this.volume = volume;
                return this;
            }

            public Audio build() {
                return new Audio(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        private Container(Builder builder) {
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String format; 

            private Builder() {
            } 

            private Builder(Container model) {
                this.format = model.format;
            } 

            /**
             * <p>The container format.</p>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Gif extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DitherMode")
        private String ditherMode;

        @com.aliyun.core.annotation.NameInMap("FinalDelay")
        private String finalDelay;

        @com.aliyun.core.annotation.NameInMap("IsCustomPalette")
        private String isCustomPalette;

        @com.aliyun.core.annotation.NameInMap("Loop")
        private String loop;

        private Gif(Builder builder) {
            this.ditherMode = builder.ditherMode;
            this.finalDelay = builder.finalDelay;
            this.isCustomPalette = builder.isCustomPalette;
            this.loop = builder.loop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gif create() {
            return builder().build();
        }

        /**
         * @return ditherMode
         */
        public String getDitherMode() {
            return this.ditherMode;
        }

        /**
         * @return finalDelay
         */
        public String getFinalDelay() {
            return this.finalDelay;
        }

        /**
         * @return isCustomPalette
         */
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        /**
         * @return loop
         */
        public String getLoop() {
            return this.loop;
        }

        public static final class Builder {
            private String ditherMode; 
            private String finalDelay; 
            private String isCustomPalette; 
            private String loop; 

            private Builder() {
            } 

            private Builder(Gif model) {
                this.ditherMode = model.ditherMode;
                this.finalDelay = model.finalDelay;
                this.isCustomPalette = model.isCustomPalette;
                this.loop = model.loop;
            } 

            /**
             * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
             * 
             * <strong>example:</strong>
             * <p>sierra</p>
             */
            public Builder ditherMode(String ditherMode) {
                this.ditherMode = ditherMode;
                return this;
            }

            /**
             * <p>The duration for which the final frame is paused. Unit: centiseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder finalDelay(String finalDelay) {
                this.finalDelay = finalDelay;
                return this;
            }

            /**
             * <p>Indicates whether the custom palette is used.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCustomPalette(String isCustomPalette) {
                this.isCustomPalette = isCustomPalette;
                return this;
            }

            /**
             * <p>The loop count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder loop(String loop) {
                this.loop = loop;
                return this;
            }

            public Gif build() {
                return new Gif(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Segment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        private Segment(Builder builder) {
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segment create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String duration; 

            private Builder() {
            } 

            private Builder(Segment model) {
                this.duration = model.duration;
            } 

            /**
             * <p>The length of the segment. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            public Segment build() {
                return new Segment(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Webp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Loop")
        private String loop;

        private Webp(Builder builder) {
            this.loop = builder.loop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Webp create() {
            return builder().build();
        }

        /**
         * @return loop
         */
        public String getLoop() {
            return this.loop;
        }

        public static final class Builder {
            private String loop; 

            private Builder() {
            } 

            private Builder(Webp model) {
                this.loop = model.loop;
            } 

            /**
             * <p>The loop count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder loop(String loop) {
                this.loop = loop;
                return this;
            }

            public Webp build() {
                return new Webp(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class MuxConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gif")
        private Gif gif;

        @com.aliyun.core.annotation.NameInMap("Segment")
        private Segment segment;

        @com.aliyun.core.annotation.NameInMap("Webp")
        private Webp webp;

        private MuxConfig(Builder builder) {
            this.gif = builder.gif;
            this.segment = builder.segment;
            this.webp = builder.webp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MuxConfig create() {
            return builder().build();
        }

        /**
         * @return gif
         */
        public Gif getGif() {
            return this.gif;
        }

        /**
         * @return segment
         */
        public Segment getSegment() {
            return this.segment;
        }

        /**
         * @return webp
         */
        public Webp getWebp() {
            return this.webp;
        }

        public static final class Builder {
            private Gif gif; 
            private Segment segment; 
            private Webp webp; 

            private Builder() {
            } 

            private Builder(MuxConfig model) {
                this.gif = model.gif;
                this.segment = model.segment;
                this.webp = model.webp;
            } 

            /**
             * <p>The transmuxing settings for GIF.</p>
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * <p>The segment settings.</p>
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * <p>The transmuxing settings for WebP.</p>
             */
            public Builder webp(Webp webp) {
                this.webp = webp;
                return this;
            }

            public MuxConfig build() {
                return new MuxConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class TransConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdjDarMethod")
        private String adjDarMethod;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrate")
        private String isCheckAudioBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrateFail")
        private String isCheckAudioBitrateFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckReso")
        private String isCheckReso;

        @com.aliyun.core.annotation.NameInMap("IsCheckResoFail")
        private String isCheckResoFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrate")
        private String isCheckVideoBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrateFail")
        private String isCheckVideoBitrateFail;

        @com.aliyun.core.annotation.NameInMap("TransMode")
        private String transMode;

        private TransConfig(Builder builder) {
            this.adjDarMethod = builder.adjDarMethod;
            this.isCheckAudioBitrate = builder.isCheckAudioBitrate;
            this.isCheckAudioBitrateFail = builder.isCheckAudioBitrateFail;
            this.isCheckReso = builder.isCheckReso;
            this.isCheckResoFail = builder.isCheckResoFail;
            this.isCheckVideoBitrate = builder.isCheckVideoBitrate;
            this.isCheckVideoBitrateFail = builder.isCheckVideoBitrateFail;
            this.transMode = builder.transMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransConfig create() {
            return builder().build();
        }

        /**
         * @return adjDarMethod
         */
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        /**
         * @return isCheckAudioBitrate
         */
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        /**
         * @return isCheckAudioBitrateFail
         */
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        /**
         * @return isCheckReso
         */
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        /**
         * @return isCheckResoFail
         */
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        /**
         * @return isCheckVideoBitrate
         */
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        /**
         * @return isCheckVideoBitrateFail
         */
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        /**
         * @return transMode
         */
        public String getTransMode() {
            return this.transMode;
        }

        public static final class Builder {
            private String adjDarMethod; 
            private String isCheckAudioBitrate; 
            private String isCheckAudioBitrateFail; 
            private String isCheckReso; 
            private String isCheckResoFail; 
            private String isCheckVideoBitrate; 
            private String isCheckVideoBitrateFail; 
            private String transMode; 

            private Builder() {
            } 

            private Builder(TransConfig model) {
                this.adjDarMethod = model.adjDarMethod;
                this.isCheckAudioBitrate = model.isCheckAudioBitrate;
                this.isCheckAudioBitrateFail = model.isCheckAudioBitrateFail;
                this.isCheckReso = model.isCheckReso;
                this.isCheckResoFail = model.isCheckResoFail;
                this.isCheckVideoBitrate = model.isCheckVideoBitrate;
                this.isCheckVideoBitrateFail = model.isCheckVideoBitrateFail;
                this.transMode = model.transMode;
            } 

            /**
             * <p>The method of resolution adjustment. Default value: <strong>none</strong>. Valid values:</p>
             * <ul>
             * <li><strong>rescale</strong>: The input video is rescaled.</li>
             * <li><strong>crop</strong>: The input video is cropped.</li>
             * <li><strong>none</strong>: No change is made.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rescale</p>
             */
            public Builder adjDarMethod(String adjDarMethod) {
                this.adjDarMethod = adjDarMethod;
                return this;
            }

            /**
             * <p>Indicates whether the audio bitrate is checked.</p>
             * <p>If this feature is enabled and the system detects that the audio bitrate of the output file is greater than that of the input file, the audio bitrate of the input file is retained after transcoding.</p>
             * <ul>
             * <li><strong>true</strong>: The audio bitrate is checked.</li>
             * <li><strong>false</strong>: The audio bitrate is not checked.</li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * <p>Indicates whether the audio bitrate is checked. If this feature is enabled and the system detects that the audio bitrate of the output file is higher than that of the input file, the input file is not transcoded. This parameter has a higher priority than the <strong>IsCheckAudioBitrate</strong> parameter. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The audio bitrate is checked. In this case, if the audio bitrate of the output file is higher than that of the input file, the input file is not transcoded.</li>
             * <li><strong>false</strong>: The audio bitrate is not checked.</li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * <p>Indicates whether the resolution is checked.</p>
             * <ul>
             * <li><strong>true</strong>: The resolution is checked.</li>
             * <li><strong>false</strong>: The resolution is not checked.</li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * <blockquote>
             * <p>If this feature is enabled and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, the resolution of the input file is retained after transcoding.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * <p>Indicates whether the resolution is checked.</p>
             * <ul>
             * <li><strong>true</strong>: The resolution is checked.</li>
             * <li><strong>false</strong>: The resolution is not checked.</li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * <blockquote>
             * <p>If this feature is enabled and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, an error that indicates a transcoding failure is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * <p>Indicates whether the video bitrate is checked.</p>
             * <ul>
             * <li><strong>true</strong>: The video bitrate is checked.</li>
             * <li><strong>false</strong>: The video bitrate is not checked.</li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * <blockquote>
             * <p>If this feature is enabled and the system detects that the video bitrate of the output file is greater than that of the input file, the video bitrate of the input file is retained after transcoding.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * <p>Indicates whether the video bitrate is checked. If this feature is enabled and the system detects that the video bitrate of the output file is higher than that of the input file, the input file is not transcoded. This parameter has a higher priority than the IsCheckVideoBitrate parameter.</p>
             * <ul>
             * <li><strong>true</strong>: The video bitrate is checked. In this case, if the video bitrate of the output file is higher than that of the input file, the input file is not transcoded.</li>
             * <li><strong>false</strong>: The video bitrate is not checked.</li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * <p>The transcoding mode. Valid values:</p>
             * <ul>
             * <li><strong>onepass</strong></li>
             * <li><strong>twopass</strong></li>
             * <li><strong>CBR</strong></li>
             * <li>Default value: <strong>onepass</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>onepass</p>
             */
            public Builder transMode(String transMode) {
                this.transMode = transMode;
                return this;
            }

            public TransConfig build() {
                return new TransConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class BitrateBnd extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private String max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private String min;

        private BitrateBnd(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BitrateBnd create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public String getMin() {
            return this.min;
        }

        public static final class Builder {
            private String max; 
            private String min; 

            private Builder() {
            } 

            private Builder(BitrateBnd model) {
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * <p>The maximum bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            public BitrateBnd build() {
                return new BitrateBnd(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class NarrowBand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Abrmax")
        private Float abrmax;

        @com.aliyun.core.annotation.NameInMap("MaxAbrRatio")
        private Float maxAbrRatio;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private NarrowBand(Builder builder) {
            this.abrmax = builder.abrmax;
            this.maxAbrRatio = builder.maxAbrRatio;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NarrowBand create() {
            return builder().build();
        }

        /**
         * @return abrmax
         */
        public Float getAbrmax() {
            return this.abrmax;
        }

        /**
         * @return maxAbrRatio
         */
        public Float getMaxAbrRatio() {
            return this.maxAbrRatio;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Float abrmax; 
            private Float maxAbrRatio; 
            private String version; 

            private Builder() {
            } 

            private Builder(NarrowBand model) {
                this.abrmax = model.abrmax;
                this.maxAbrRatio = model.maxAbrRatio;
                this.version = model.version;
            } 

            /**
             * <p>The upper limit of the dynamic bitrate. If this parameter is set, the average bitrate is in the range of (0, 1000000].</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder abrmax(Float abrmax) {
                this.abrmax = abrmax;
                return this;
            }

            /**
             * <p>The maximum ratio of the upper limit of dynamic bitrate. If this parameter is set, the value of Abrmax does not exceed x times of the source video bitrate. Valid values: (0,1.0].</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder maxAbrRatio(Float maxAbrRatio) {
                this.maxAbrRatio = maxAbrRatio;
                return this;
            }

            /**
             * <p>The Narrowband HD version. Only 1.0 may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public NarrowBand build() {
                return new NarrowBand(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Video extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("BitrateBnd")
        private BitrateBnd bitrateBnd;

        @com.aliyun.core.annotation.NameInMap("Bufsize")
        private String bufsize;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Crf")
        private String crf;

        @com.aliyun.core.annotation.NameInMap("Crop")
        private String crop;

        @com.aliyun.core.annotation.NameInMap("Degrain")
        private String degrain;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Hdr2sdr")
        private String hdr2sdr;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("LongShortMode")
        private String longShortMode;

        @com.aliyun.core.annotation.NameInMap("MaxFps")
        private String maxFps;

        @com.aliyun.core.annotation.NameInMap("Maxrate")
        private String maxrate;

        @com.aliyun.core.annotation.NameInMap("NarrowBand")
        private NarrowBand narrowBand;

        @com.aliyun.core.annotation.NameInMap("Pad")
        private String pad;

        @com.aliyun.core.annotation.NameInMap("PixFmt")
        private String pixFmt;

        @com.aliyun.core.annotation.NameInMap("Preset")
        private String preset;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Qscale")
        private String qscale;

        @com.aliyun.core.annotation.NameInMap("Remove")
        private String remove;

        @com.aliyun.core.annotation.NameInMap("ResoPriority")
        private String resoPriority;

        @com.aliyun.core.annotation.NameInMap("ScanMode")
        private String scanMode;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Video(Builder builder) {
            this.bitrate = builder.bitrate;
            this.bitrateBnd = builder.bitrateBnd;
            this.bufsize = builder.bufsize;
            this.codec = builder.codec;
            this.crf = builder.crf;
            this.crop = builder.crop;
            this.degrain = builder.degrain;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.hdr2sdr = builder.hdr2sdr;
            this.height = builder.height;
            this.longShortMode = builder.longShortMode;
            this.maxFps = builder.maxFps;
            this.maxrate = builder.maxrate;
            this.narrowBand = builder.narrowBand;
            this.pad = builder.pad;
            this.pixFmt = builder.pixFmt;
            this.preset = builder.preset;
            this.profile = builder.profile;
            this.qscale = builder.qscale;
            this.remove = builder.remove;
            this.resoPriority = builder.resoPriority;
            this.scanMode = builder.scanMode;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return bitrateBnd
         */
        public BitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        /**
         * @return bufsize
         */
        public String getBufsize() {
            return this.bufsize;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return crf
         */
        public String getCrf() {
            return this.crf;
        }

        /**
         * @return crop
         */
        public String getCrop() {
            return this.crop;
        }

        /**
         * @return degrain
         */
        public String getDegrain() {
            return this.degrain;
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
         * @return hdr2sdr
         */
        public String getHdr2sdr() {
            return this.hdr2sdr;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return longShortMode
         */
        public String getLongShortMode() {
            return this.longShortMode;
        }

        /**
         * @return maxFps
         */
        public String getMaxFps() {
            return this.maxFps;
        }

        /**
         * @return maxrate
         */
        public String getMaxrate() {
            return this.maxrate;
        }

        /**
         * @return narrowBand
         */
        public NarrowBand getNarrowBand() {
            return this.narrowBand;
        }

        /**
         * @return pad
         */
        public String getPad() {
            return this.pad;
        }

        /**
         * @return pixFmt
         */
        public String getPixFmt() {
            return this.pixFmt;
        }

        /**
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return qscale
         */
        public String getQscale() {
            return this.qscale;
        }

        /**
         * @return remove
         */
        public String getRemove() {
            return this.remove;
        }

        /**
         * @return resoPriority
         */
        public String getResoPriority() {
            return this.resoPriority;
        }

        /**
         * @return scanMode
         */
        public String getScanMode() {
            return this.scanMode;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private BitrateBnd bitrateBnd; 
            private String bufsize; 
            private String codec; 
            private String crf; 
            private String crop; 
            private String degrain; 
            private String fps; 
            private String gop; 
            private String hdr2sdr; 
            private String height; 
            private String longShortMode; 
            private String maxFps; 
            private String maxrate; 
            private NarrowBand narrowBand; 
            private String pad; 
            private String pixFmt; 
            private String preset; 
            private String profile; 
            private String qscale; 
            private String remove; 
            private String resoPriority; 
            private String scanMode; 
            private String width; 

            private Builder() {
            } 

            private Builder(Video model) {
                this.bitrate = model.bitrate;
                this.bitrateBnd = model.bitrateBnd;
                this.bufsize = model.bufsize;
                this.codec = model.codec;
                this.crf = model.crf;
                this.crop = model.crop;
                this.degrain = model.degrain;
                this.fps = model.fps;
                this.gop = model.gop;
                this.hdr2sdr = model.hdr2sdr;
                this.height = model.height;
                this.longShortMode = model.longShortMode;
                this.maxFps = model.maxFps;
                this.maxrate = model.maxrate;
                this.narrowBand = model.narrowBand;
                this.pad = model.pad;
                this.pixFmt = model.pixFmt;
                this.preset = model.preset;
                this.profile = model.profile;
                this.qscale = model.qscale;
                this.remove = model.remove;
                this.resoPriority = model.resoPriority;
                this.scanMode = model.scanMode;
                this.width = model.width;
            } 

            /**
             * <p>The bitrate of the output video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The bitrate range of the video.</p>
             */
            public Builder bitrateBnd(BitrateBnd bitrateBnd) {
                this.bitrateBnd = bitrateBnd;
                return this;
            }

            /**
             * <p>The size of the buffer.</p>
             * <ul>
             * <li>Default value: <strong>6000</strong>.</li>
             * <li>Unit: KB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6000</p>
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * <p>The video codec. Valid values: H.264, H.265, GIF, and WebP. Default value: <strong>H.264</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The constant rate factor. Default value if the video codec is set to H.264: <strong>23</strong>. Default value if the video codec is set to H.265: <strong>26</strong>.</p>
             * <blockquote>
             * <p>If this parameter is specified, the setting of the Bitrate parameter becomes invalid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * <p>The method of video cropping. Valid values:</p>
             * <ul>
             * <li><strong>border</strong>: automatically detects and removes borders.</li>
             * <li><strong>Value in the format of width:height:left:top</strong>: crops the video image based on the custom settings. Example: 1280:800:0:140.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>border</p>
             */
            public Builder crop(String crop) {
                this.crop = crop;
                return this;
            }

            /**
             * <p>The level of quality control on the video.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder degrain(String degrain) {
                this.degrain = degrain;
                return this;
            }

            /**
             * <p>The frame rate. Default value: the frame rate of the input file. The value is 60 if the frame rate of the input file exceeds 60. Unit: frames per second.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The GOP size. The GOP size can be the maximum interval of keyframes or the maximum number of frames in a frame group. If the maximum interval is specified, the value contains the unit (s). If the maximum number of frames is specified, the value does not contain a unit. Default value: <strong>10s</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10s</p>
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>Indicates whether the HDR2SDR conversion feature is enabled. If this feature is enabled, high dynamic range (HDR) videos are transcoded to standard dynamic range (SDR) videos.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hdr2sdr(String hdr2sdr) {
                this.hdr2sdr = hdr2sdr;
                return this;
            }

            /**
             * <p>The height of the video.</p>
             * <ul>
             * <li>Unit: pixel.</li>
             * <li>Default value: the height of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>Indicates whether the auto-rotate screen feature is enabled. Default value: <strong>false</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The auto-rotate screen feature is enabled.</li>
             * <li><strong>false</strong>: The auto-rotate screen feature is disabled.</li>
             * </ul>
             * <blockquote>
             * <p>If this feature is enabled, the width of the output video corresponds to the long side of the input video, which is the height of the input video in portrait mode. The height of the output video corresponds to the short side of the input video, which is the width of the input video in portrait mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder longShortMode(String longShortMode) {
                this.longShortMode = longShortMode;
                return this;
            }

            /**
             * <p>The maximum frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxFps(String maxFps) {
                this.maxFps = maxFps;
                return this;
            }

            /**
             * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * <p>The Narrowband HD settings.</p>
             */
            public Builder narrowBand(NarrowBand narrowBand) {
                this.narrowBand = narrowBand;
                return this;
            }

            /**
             * <p>The black borders to be added to the video. The value is in the width:height:left:top format.</p>
             * 
             * <strong>example:</strong>
             * <p>1280:800:0:140</p>
             */
            public Builder pad(String pad) {
                this.pad = pad;
                return this;
            }

            /**
             * <p>The pixel format. Standard pixel formats such as yuv420p and yuvj420p are supported. The default pixel format can be <strong>yuv420p</strong> or the pixel format of the input video.</p>
             * 
             * <strong>example:</strong>
             * <p>yuv420p</p>
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * <p>The preset video algorithm. Default value: <strong>medium</strong>. Valid values:</p>
             * <ul>
             * <li><strong>veryfast</strong></li>
             * <li><strong>fast</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>slow</strong></li>
             * <li><strong>slower</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is valid only if the Codec parameter is set to H.264.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fast</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * <p>The codec profile.</p>
             * <ul>
             * <li><strong>baseline</strong>: suitable for mobile devices</li>
             * <li><strong>main</strong>: suitable for standard-definition devices</li>
             * <li><strong>high</strong>: suitable for high-definition devices</li>
             * <li>Default value: <strong>high</strong>.</li>
             * </ul>
             * <p>If multiple definitions are available, we recommend that you set this parameter to baseline for the lowest definition to ensure normal playback on low-end devices. Set this parameter to main or high for other definitions.</p>
             * <blockquote>
             * <p>This parameter is valid only if the Codec parameter is set to H.264.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The level of the independent denoising algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * <p>Indicates whether the video stream is deleted.</p>
             * <ul>
             * <li><strong>true</strong>: The video stream is deleted.</li>
             * <li><strong>false</strong>: The video stream is retained.</li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder remove(String remove) {
                this.remove = remove;
                return this;
            }

            /**
             * <p>The policy of resolution adjustment.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resoPriority(String resoPriority) {
                this.resoPriority = resoPriority;
                return this;
            }

            /**
             * <p>The scan mode. Valid values:</p>
             * <ul>
             * <li><strong>interlaced</strong></li>
             * <li><strong>progressive</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>interlaced</p>
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * <p>The width of the video.</p>
             * <ul>
             * <li>Default value: the width of the input video.****</li>
             * <li>Unit: pixel.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TransConfig")
        private TransConfig transConfig;

        @com.aliyun.core.annotation.NameInMap("Video")
        private Video video;

        private Template(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
            this.id = builder.id;
            this.muxConfig = builder.muxConfig;
            this.name = builder.name;
            this.state = builder.state;
            this.transConfig = builder.transConfig;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Audio getAudio() {
            return this.audio;
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return muxConfig
         */
        public MuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return transConfig
         */
        public TransConfig getTransConfig() {
            return this.transConfig;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        public static final class Builder {
            private Audio audio; 
            private Container container; 
            private String id; 
            private MuxConfig muxConfig; 
            private String name; 
            private String state; 
            private TransConfig transConfig; 
            private Video video; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.audio = model.audio;
                this.container = model.container;
                this.id = model.id;
                this.muxConfig = model.muxConfig;
                this.name = model.name;
                this.state = model.state;
                this.transConfig = model.transConfig;
                this.video = model.video;
            } 

            /**
             * <p>The audio codec configurations.</p>
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The container format settings.</p>
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The ID of the transcoding template. We recommend that you keep this ID for subsequent operation calls.</p>
             * 
             * <strong>example:</strong>
             * <p>16f01ad6175e4230ac42bb5182cd****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The transmuxing settings.</p>
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * <p>The name of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>mps-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the template. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The template is normal.</li>
             * <li><strong>Deleted</strong>: The template is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The general transcoding settings.</p>
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * <p>The video codec configurations.</p>
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
