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
 * {@link TargetAudio} extends {@link TeaModel}
 *
 * <p>TargetAudio</p>
 */
public class TargetAudio extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisableAudio")
    private Boolean disableAudio;

    @com.aliyun.core.annotation.NameInMap("FilterAudio")
    private FilterAudio filterAudio;

    @com.aliyun.core.annotation.NameInMap("Stream")
    private java.util.List<Long> stream;

    @com.aliyun.core.annotation.NameInMap("TranscodeAudio")
    private TranscodeAudio transcodeAudio;

    private TargetAudio(Builder builder) {
        this.disableAudio = builder.disableAudio;
        this.filterAudio = builder.filterAudio;
        this.stream = builder.stream;
        this.transcodeAudio = builder.transcodeAudio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TargetAudio create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disableAudio
     */
    public Boolean getDisableAudio() {
        return this.disableAudio;
    }

    /**
     * @return filterAudio
     */
    public FilterAudio getFilterAudio() {
        return this.filterAudio;
    }

    /**
     * @return stream
     */
    public java.util.List<Long> getStream() {
        return this.stream;
    }

    /**
     * @return transcodeAudio
     */
    public TranscodeAudio getTranscodeAudio() {
        return this.transcodeAudio;
    }

    public static final class Builder {
        private Boolean disableAudio; 
        private FilterAudio filterAudio; 
        private java.util.List<Long> stream; 
        private TranscodeAudio transcodeAudio; 

        private Builder() {
        } 

        private Builder(TargetAudio model) {
            this.disableAudio = model.disableAudio;
            this.filterAudio = model.filterAudio;
            this.stream = model.stream;
            this.transcodeAudio = model.transcodeAudio;
        } 

        /**
         * <p>Specifies whether to disable audio stream generation. Valid values:</p>
         * <ul>
         * <li>true: disables audio stream generation. No audio stream is included in the output file.</li>
         * <li>false: does not disable audio stream generation. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableAudio(Boolean disableAudio) {
            this.disableAudio = disableAudio;
            return this;
        }

        /**
         * <p>The audio processing settings. This parameter is invalid if <strong>TranscodeAudio</strong> is left empty or <strong>TranscodeAudio.Codec</strong> is set to copy.</p>
         * <blockquote>
         * <p> This parameter is not available to the GenerateVideoPlaylist operation.</p>
         * </blockquote>
         */
        public Builder filterAudio(FilterAudio filterAudio) {
            this.filterAudio = filterAudio;
            return this;
        }

        /**
         * <p>The index numbers of audio streams. If you do not specify this parameter, the first audio stream (the one with the smallest index number) is processed. If the array contains an element greater than 100, all audio streams are processed.</p>
         * <ul>
         * <li>For example, you can set the parameter to <code>[0,1]</code> to process audio streams with index numbers 0 and 1, <code>[1]</code> to process only the audio stream with the index number 1, or <code>[101]</code> to process all audio streams.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify an index number but no audio stream with the index number is found, the index number is ignored.</p>
         * </blockquote>
         */
        public Builder stream(java.util.List<Long> stream) {
            this.stream = stream;
            return this;
        }

        /**
         * <p>The audio transcoding settings. If you do not specify this parameter, no audio streams are included in the output file.</p>
         * <blockquote>
         * <p> We recommend that you do not use this parameter to disable audio stream generation.</p>
         * </blockquote>
         */
        public Builder transcodeAudio(TranscodeAudio transcodeAudio) {
            this.transcodeAudio = transcodeAudio;
            return this;
        }

        public TargetAudio build() {
            return new TargetAudio(this);
        } 

    } 

    /**
     * 
     * {@link TargetAudio} extends {@link TeaModel}
     *
     * <p>TargetAudio</p>
     */
    public static class FilterAudio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mixing")
        private Boolean mixing;

        private FilterAudio(Builder builder) {
            this.mixing = builder.mixing;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterAudio create() {
            return builder().build();
        }

        /**
         * @return mixing
         */
        public Boolean getMixing() {
            return this.mixing;
        }

        public static final class Builder {
            private Boolean mixing; 

            private Builder() {
            } 

            private Builder(FilterAudio model) {
                this.mixing = model.mixing;
            } 

            /**
             * <p>Specifies whether to mix all sound tracks into a single track. Valid values:</p>
             * <ul>
             * <li>false (default)</li>
             * <li>true</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder mixing(Boolean mixing) {
                this.mixing = mixing;
                return this;
            }

            public FilterAudio build() {
                return new FilterAudio(this);
            } 

        } 

    }
    /**
     * 
     * {@link TargetAudio} extends {@link TeaModel}
     *
     * <p>TargetAudio</p>
     */
    public static class TranscodeAudio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private Integer bitrate;

        @com.aliyun.core.annotation.NameInMap("BitrateOption")
        private String bitrateOption;

        @com.aliyun.core.annotation.NameInMap("BitsPerSample")
        private Integer bitsPerSample;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private Integer channel;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Quality")
        private Integer quality;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private Integer sampleRate;

        @com.aliyun.core.annotation.NameInMap("SampleRateOption")
        private String sampleRateOption;

        private TranscodeAudio(Builder builder) {
            this.bitrate = builder.bitrate;
            this.bitrateOption = builder.bitrateOption;
            this.bitsPerSample = builder.bitsPerSample;
            this.channel = builder.channel;
            this.codec = builder.codec;
            this.quality = builder.quality;
            this.sampleRate = builder.sampleRate;
            this.sampleRateOption = builder.sampleRateOption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeAudio create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public Integer getBitrate() {
            return this.bitrate;
        }

        /**
         * @return bitrateOption
         */
        public String getBitrateOption() {
            return this.bitrateOption;
        }

        /**
         * @return bitsPerSample
         */
        public Integer getBitsPerSample() {
            return this.bitsPerSample;
        }

        /**
         * @return channel
         */
        public Integer getChannel() {
            return this.channel;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return quality
         */
        public Integer getQuality() {
            return this.quality;
        }

        /**
         * @return sampleRate
         */
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        /**
         * @return sampleRateOption
         */
        public String getSampleRateOption() {
            return this.sampleRateOption;
        }

        public static final class Builder {
            private Integer bitrate; 
            private String bitrateOption; 
            private Integer bitsPerSample; 
            private Integer channel; 
            private String codec; 
            private Integer quality; 
            private Integer sampleRate; 
            private String sampleRateOption; 

            private Builder() {
            } 

            private Builder(TranscodeAudio model) {
                this.bitrate = model.bitrate;
                this.bitrateOption = model.bitrateOption;
                this.bitsPerSample = model.bitsPerSample;
                this.channel = model.channel;
                this.codec = model.codec;
                this.quality = model.quality;
                this.sampleRate = model.sampleRate;
                this.sampleRateOption = model.sampleRateOption;
            } 

            /**
             * <p>The bitrate of the audio stream. Unit: bit/s. This parameter and the <strong>Quality</strong> parameter are mutually exclusive. Valid values: 1000 to 10000000.</p>
             * 
             * <strong>example:</strong>
             * <p>64000</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The audio bitrate option. Valid values:</p>
             * <ul>
             * <li>fixed: always uses the target bitrate.</li>
             * <li>adaptive: uses the source bitrate when the source bitrate is smaller than the target bitrate.</li>
             * <li>fall: returns a failure when the source bitrate is smaller than the target bitrate.</li>
             * </ul>
             * <p>Default values:</p>
             * <ul>
             * <li>fixed for the CreateMediaConvert operation.</li>
             * <li>adaptive for the GenerateVideoPlaylist operation.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter must be used in conjunction with the <strong>Bitrate</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fixed</p>
             */
            public Builder bitrateOption(String bitrateOption) {
                this.bitrateOption = bitrateOption;
                return this;
            }

            /**
             * <p>The audio bit depth. Valid values: 16 and 24.</p>
             * <blockquote>
             * <p> This parameter takes effect only when Codec is set to flac.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder bitsPerSample(Integer bitsPerSample) {
                this.bitsPerSample = bitsPerSample;
                return this;
            }

            /**
             * <p>The number of sound channels. By default, the audio stream has the same number of sound channels as the source audio. Valid values: [1,8].</p>
             * <blockquote>
             * <p> The number of sound channels varies with audio formats: one or two for MP3, up to six for AC3 5.1, and one for AMR.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channel(Integer channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The codec. Valid values:</p>
             * <ul>
             * <li>copy, mp3, vorbis, aac, flac, ac3, opus, and amr for the CreateMediaConvert operation. The default value is copy.</li>
             * <li>aac for the GenerateVideoPlaylist operation. The default value is aac.</li>
             * </ul>
             * <blockquote>
             * <p> When you set the parameter to copy, the audio stream is directly copied into the output file and all other parameters in <strong>TranscodeAudio</strong> do not take effect. The copy value is commonly used in container format conversion scenarios. You cannot use this value in audio merging scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The audio quality. Valid values: 0 to 100. The greater the value, the higher the quality. This parameter and the <strong>Bitrate</strong> parameter are mutually exclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder quality(Integer quality) {
                this.quality = quality;
                return this;
            }

            /**
             * <p>The sampling rate option. Unit: Hz. By default, the source sampling rate is used. Valid values: 8000, 12025, 12000, 16000, 22050, 24000, 32000, 44100, 48000, 64000, 88200, and 96000.</p>
             * <blockquote>
             * <p> Supported sampling rates vary with formats: 48 kHz and lower for MP3, 8 kHz, 12 kHz, 16 kHz, 24 kHz, and 48 kHz for Opus, 32 kHz, 44.1 kHz, and 48 kHz for AC3, and 8 kHz and 16 kHz for AMR.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12050</p>
             */
            public Builder sampleRate(Integer sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * <p>The sampling rate option. Valid values:</p>
             * <ul>
             * <li>fixed: always uses the target sampling rate.</li>
             * <li>adaptive: uses the source sampling rate when the source sampling rate is smaller than the target sampling rate.</li>
             * <li>fall: returns a failure when the source sampling rate is smaller than the target sampling rate.</li>
             * </ul>
             * <p>Default values:</p>
             * <ul>
             * <li>fixed for the CreateMediaConvert operation.</li>
             * <li>adaptive for the GenerateVideoPlaylist operation.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter must be used in conjunction with the <strong>SampleRate</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fixed</p>
             */
            public Builder sampleRateOption(String sampleRateOption) {
                this.sampleRateOption = sampleRateOption;
                return this;
            }

            public TranscodeAudio build() {
                return new TranscodeAudio(this);
            } 

        } 

    }
}
