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

        /**
         * DisableAudio.
         */
        public Builder disableAudio(Boolean disableAudio) {
            this.disableAudio = disableAudio;
            return this;
        }

        /**
         * FilterAudio.
         */
        public Builder filterAudio(FilterAudio filterAudio) {
            this.filterAudio = filterAudio;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(java.util.List<Long> stream) {
            this.stream = stream;
            return this;
        }

        /**
         * TranscodeAudio.
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

            /**
             * Mixing.
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

            /**
             * Bitrate.
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * BitrateOption.
             */
            public Builder bitrateOption(String bitrateOption) {
                this.bitrateOption = bitrateOption;
                return this;
            }

            /**
             * BitsPerSample.
             */
            public Builder bitsPerSample(Integer bitsPerSample) {
                this.bitsPerSample = bitsPerSample;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(Integer channel) {
                this.channel = channel;
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
             * Quality.
             */
            public Builder quality(Integer quality) {
                this.quality = quality;
                return this;
            }

            /**
             * SampleRate.
             */
            public Builder sampleRate(Integer sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * SampleRateOption.
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
