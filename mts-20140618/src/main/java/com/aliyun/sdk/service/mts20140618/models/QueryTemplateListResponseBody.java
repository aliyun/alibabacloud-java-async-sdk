// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTemplateListResponseBody</p>
 */
public class QueryTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistTids")
    private NonExistTids nonExistTids;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateList")
    private TemplateList templateList;

    private QueryTemplateListResponseBody(Builder builder) {
        this.nonExistTids = builder.nonExistTids;
        this.requestId = builder.requestId;
        this.templateList = builder.templateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTemplateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistTids
     */
    public NonExistTids getNonExistTids() {
        return this.nonExistTids;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateList
     */
    public TemplateList getTemplateList() {
        return this.templateList;
    }

    public static final class Builder {
        private NonExistTids nonExistTids; 
        private String requestId; 
        private TemplateList templateList; 

        /**
         * The IDs of the templates that do not exist. This parameter is not returned if all specified transcoding templates are found.
         */
        public Builder nonExistTids(NonExistTids nonExistTids) {
            this.nonExistTids = nonExistTids;
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
         * The transcoding templates.
         */
        public Builder templateList(TemplateList templateList) {
            this.templateList = templateList;
            return this;
        }

        public QueryTemplateListResponseBody build() {
            return new QueryTemplateListResponseBody(this);
        } 

    } 

    public static class NonExistTids extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private NonExistTids(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistTids create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistTids build() {
                return new NonExistTids(this);
            } 

        } 

    }
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

            /**
             * The output volume.
             * <p>
             * 
             * *   This parameter takes effect only if the value of Method is dynamic.
             * *   Unit: dB.
             * *   Valid values: \[-70,-5].
             * *   Default value: -6.
             */
            public Builder integratedLoudnessTarget(String integratedLoudnessTarget) {
                this.integratedLoudnessTarget = integratedLoudnessTarget;
                return this;
            }

            /**
             * The increased volume relative to the volume of the input audio.
             * <p>
             * 
             * *   This parameter takes effect only if the value of Method is linear.
             * *   Unit: dB.
             * *   Valid values: less than or equal to 20.
             * *   Default value: -20.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The range of the volume relative to the output volume.
             * <p>
             * 
             * *   This parameter takes effect only if the value of Method is dynamic.
             * *   Unit: dB.
             * *   Valid values: \[1,20].
             * *   Default value: 8.
             */
            public Builder loudnessRangeTarget(String loudnessRangeTarget) {
                this.loudnessRangeTarget = loudnessRangeTarget;
                return this;
            }

            /**
             * The method that is used to adjust the volume. Valid values:
             * <p>
             * 
             * *   **auto**
             * *   **dynamic**
             * *   **linear**
             * *   Default value: dynamic.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The volume adjustment coefficient.
             * <p>
             * 
             * This parameter takes effect only if the value of Method is adaptive.
             * 
             * Valid values: \[0,1].
             * 
             * Default value: 0.9.
             */
            public Builder peakLevel(String peakLevel) {
                this.peakLevel = peakLevel;
                return this;
            }

            /**
             * The peak volume.
             * <p>
             * 
             * *   This parameter takes effect only if the value of Method is dynamic.
             * *   Unit: dB.
             * *   Valid values: \[-9,0].
             * *   Default value: -1.
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

            /**
             * The audio bitrate of the output file.
             * <p>
             * 
             * *   Valid values: **\[8,1000]**.
             * *   Unit: Kbit/s.
             * *   Default value: **128**.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The number of sound channels. Default value: **2**.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * The audio codec format. Default value: **aac**. Valid values:
             * <p>
             * 
             * *   **aac**
             * *   **mp3**
             * *   **vorbis**
             * *   **flac**
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * The codec profile of the audio. Valid values when the value of Codec is aac:
             * <p>
             * 
             * *   **aac_low**
             * *   **aac_he**
             * *   **aac_he_v2**
             * *   **aac_ld**
             * *   **aac_eld**
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The strength of the independent denoising algorithm.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * Indicates whether the audio stream is deleted. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder remove(String remove) {
                this.remove = remove;
                return this;
            }

            /**
             * The sampling rate.
             * <p>
             * 
             * *   Unit: Hz
             * *   Default value: **44100**.
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * The volume control configurations.
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

            /**
             * The format of the container. Valid values: flv, mp4, ts, m3u8, gif, mp3, ogg, and flac.
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

            /**
             * The color dithering algorithm of the palette. Valid values: sierra and bayer.
             */
            public Builder ditherMode(String ditherMode) {
                this.ditherMode = ditherMode;
                return this;
            }

            /**
             * The duration for which the final frame is paused.
             */
            public Builder finalDelay(String finalDelay) {
                this.finalDelay = finalDelay;
                return this;
            }

            /**
             * Indicates whether a custom palette is used.
             */
            public Builder isCustomPalette(String isCustomPalette) {
                this.isCustomPalette = isCustomPalette;
                return this;
            }

            /**
             * The loop count.
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

            /**
             * The length of the segment. Unit: seconds.
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

            /**
             * The loop count.
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

            /**
             * The transmuxing configurations for GIF.
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * The segment configurations.
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * The transmuxing configurations for WebP.
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

            /**
             * The method of resolution adjustment. Default value: **none**. Valid values:
             * <p>
             * 
             * *   rescale
             * *   crop
             * *   none
             */
            public Builder adjDarMethod(String adjDarMethod) {
                this.adjDarMethod = adjDarMethod;
                return this;
            }

            /**
             * Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, the input bitrate is retained and the specified audio bitrate does not take effect. This parameter has a lower priority than IsCheckAudioBitrateFail. Valid values:
             * <p>
             * 
             * *   **true**
             * 
             * *   **false**
             * 
             * *   Default value:
             * 
             *     *   If this parameter is not specified and the codec of the output audio is different from that of the input audio, the default value is false.
             *     *   If this parameter is not specified and the codec of the output audio is the same as that of the input audio, the default value is true.
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * Indicates whether audio bitrate check errors are allowed. This parameter has a greater priority than IsCheckAudioBitrate. Valid values:
             * <p>
             * 
             * *   **true**: If the audio bitrate check fails, the input file is not transcoded.
             * *   **false**: The audio bitrate is not checked.
             * *   Default value: **false**.
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, the input resolution is retained. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, the input bitrate is retained. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * Indicates whether video bitrate check errors are allowed. This parameter has a higher priority than IsCheckVideoBitrate. Valid values:
             * <p>
             * 
             * *   **true**: If the video bitrate check fails, the input file is not transcoded.
             * *   **false**: The video bitrate is not checked.
             * *   Default value: **false**.
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * The transcoding mode. Default value: **onepass**. Valid values:
             * <p>
             * 
             * *   **onepass**
             * *   **twopass**
             * *   **CBR**
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

            /**
             * The upper limit of the total bitrate. Unit: Kbit/s.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * The lower limit of the total bitrate. Unit: Kbit/s.
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

            /**
             * The upper limit of the dynamic bitrate. If this parameter is set, the average bitrate is in the range of (0, 1000000].
             */
            public Builder abrmax(Float abrmax) {
                this.abrmax = abrmax;
                return this;
            }

            /**
             * The maximum ratio of the upper limit of dynamic bitrate. If this parameter is set, the value of Abrmax does not exceed x times of the source video bitrate. Valid values: (0,1.0].
             */
            public Builder maxAbrRatio(Float maxAbrRatio) {
                this.maxAbrRatio = maxAbrRatio;
                return this;
            }

            /**
             * The Narrowband HD version. Only 1.0 may be returned.
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

            /**
             * The average bitrate of the video. Unit: Kbit/s.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The average bitrate range of the video.
             */
            public Builder bitrateBnd(BitrateBnd bitrateBnd) {
                this.bitrateBnd = bitrateBnd;
                return this;
            }

            /**
             * The buffer size.
             * <p>
             * 
             * *   Unit: KB.
             * *   Default value: **6000**.
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * The codec. Default value: **H.264**.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * The constant rate factor.
             * <p>
             * 
             * *   Default value when the encoding format is H.264: **23**. Default value when the encoding format is H.265: **26**.
             * *   If this parameter is set, the value of Bitrate becomes invalid.
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * The method of video cropping. Valid values:
             * <p>
             * 
             * *   **border**: automatically detects and removes black bars.
             * *   **Value in the width:height:left:top format**: crops the video based on custom settings. Format: width:height:left:top. Example: 1280:800:0:140.
             */
            public Builder crop(String crop) {
                this.crop = crop;
                return this;
            }

            /**
             * The level of video quality control.
             */
            public Builder degrain(String degrain) {
                this.degrain = degrain;
                return this;
            }

            /**
             * The frame rate.
             * <p>
             * 
             * *   The value is 60 if the frame rate of the input file exceeds 60.
             * *   Default value: **the frame rate of the input file**.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The maximum number of frames between two keyframes. Default value: **250**.
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * Indicates whether the HDR2SDR conversion feature is enabled. If this feature is enabled, high dynamic range (HDR) videos are transcoded to standard dynamic range (SDR) videos.
             */
            public Builder hdr2sdr(String hdr2sdr) {
                this.hdr2sdr = hdr2sdr;
                return this;
            }

            /**
             * The height of the video.
             * <p>
             * 
             * *   Unit: pixel.
             * *   Default value: **the height of the input video**.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Indicates whether the auto-rotate screen feature is enabled.
             * <p>
             * 
             * *   If this feature is enabled, the width of the output video corresponds to the long side of the input video, which is the height of the input video in portrait mode. The height of the output video corresponds to the short side of the input video, which is the width of the input video in portrait mode. Valid values:
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder longShortMode(String longShortMode) {
                this.longShortMode = longShortMode;
                return this;
            }

            /**
             * The maximum frame rate.
             */
            public Builder maxFps(String maxFps) {
                this.maxFps = maxFps;
                return this;
            }

            /**
             * The maximum bitrate of the video. Unit: Kbit/s.
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * The Narrowband HD settings.
             */
            public Builder narrowBand(NarrowBand narrowBand) {
                this.narrowBand = narrowBand;
                return this;
            }

            /**
             * The black bars that are added to the video. Format: width:height:left:top. Example: 1280:800:0:140.
             */
            public Builder pad(String pad) {
                this.pad = pad;
                return this;
            }

            /**
             * The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * The preset video algorithm. Valid values: veryfast, fast, medium, slow, and slower. Default value: **medium**.
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * The encoding profile. Valid values:
             * <p>
             * 
             * *   **baseline**: applicable to mobile devices.
             * *   **main**: applicable to standard-definition devices.
             * *   **high**: applicable to high-definition devices.
             * *   Default value: **high**.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The strength of the independent denoising algorithm.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * Indicates whether the video stream is deleted. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder remove(String remove) {
                this.remove = remove;
                return this;
            }

            /**
             * The policy of resolution adjustment. Valid values: cropFirst, widthFirst, and heightFirst.
             */
            public Builder resoPriority(String resoPriority) {
                this.resoPriority = resoPriority;
                return this;
            }

            /**
             * The scan mode. Valid values:
             * <p>
             * 
             * *   **interlaced**
             * *   **progressive**
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * The width of the video.
             * <p>
             * 
             * *   Unit: pixel.
             * *   Default value: **the width of the input video**.
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
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

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
            this.creationTime = builder.creationTime;
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
            private String creationTime; 
            private String id; 
            private MuxConfig muxConfig; 
            private String name; 
            private String state; 
            private TransConfig transConfig; 
            private Video video; 

            /**
             * The audio codec configurations.
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * The container format configurations.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * The time when the template was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The transcoding template ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The transmuxing configurations.
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the template. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **Deleted**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The general transcoding configurations.
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * The video codec configurations.
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
    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Template")
        private java.util.List < Template> template;

        private TemplateList(Builder builder) {
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateList create() {
            return builder().build();
        }

        /**
         * @return template
         */
        public java.util.List < Template> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.List < Template> template; 

            /**
             * Template.
             */
            public Builder template(java.util.List < Template> template) {
                this.template = template;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
}
