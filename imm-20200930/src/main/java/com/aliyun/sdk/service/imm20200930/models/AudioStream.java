// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AudioStream} extends {@link TeaModel}
 *
 * <p>AudioStream</p>
 */
public class AudioStream extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bitrate")
    private Long bitrate;

    @com.aliyun.core.annotation.NameInMap("ChannelLayout")
    private String channelLayout;

    @com.aliyun.core.annotation.NameInMap("Channels")
    private Long channels;

    @com.aliyun.core.annotation.NameInMap("CodecLongName")
    private String codecLongName;

    @com.aliyun.core.annotation.NameInMap("CodecName")
    private String codecName;

    @com.aliyun.core.annotation.NameInMap("CodecTag")
    private String codecTag;

    @com.aliyun.core.annotation.NameInMap("CodecTagString")
    private String codecTagString;

    @com.aliyun.core.annotation.NameInMap("CodecTimeBase")
    private String codecTimeBase;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Double duration;

    @com.aliyun.core.annotation.NameInMap("FrameCount")
    private Long frameCount;

    @com.aliyun.core.annotation.NameInMap("Index")
    private Long index;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("Lyric")
    private String lyric;

    @com.aliyun.core.annotation.NameInMap("SampleFormat")
    private String sampleFormat;

    @com.aliyun.core.annotation.NameInMap("SampleRate")
    private Long sampleRate;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Double startTime;

    @com.aliyun.core.annotation.NameInMap("TimeBase")
    private String timeBase;

    private AudioStream(Builder builder) {
        this.bitrate = builder.bitrate;
        this.channelLayout = builder.channelLayout;
        this.channels = builder.channels;
        this.codecLongName = builder.codecLongName;
        this.codecName = builder.codecName;
        this.codecTag = builder.codecTag;
        this.codecTagString = builder.codecTagString;
        this.codecTimeBase = builder.codecTimeBase;
        this.duration = builder.duration;
        this.frameCount = builder.frameCount;
        this.index = builder.index;
        this.language = builder.language;
        this.lyric = builder.lyric;
        this.sampleFormat = builder.sampleFormat;
        this.sampleRate = builder.sampleRate;
        this.startTime = builder.startTime;
        this.timeBase = builder.timeBase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AudioStream create() {
        return builder().build();
    }

    /**
     * @return bitrate
     */
    public Long getBitrate() {
        return this.bitrate;
    }

    /**
     * @return channelLayout
     */
    public String getChannelLayout() {
        return this.channelLayout;
    }

    /**
     * @return channels
     */
    public Long getChannels() {
        return this.channels;
    }

    /**
     * @return codecLongName
     */
    public String getCodecLongName() {
        return this.codecLongName;
    }

    /**
     * @return codecName
     */
    public String getCodecName() {
        return this.codecName;
    }

    /**
     * @return codecTag
     */
    public String getCodecTag() {
        return this.codecTag;
    }

    /**
     * @return codecTagString
     */
    public String getCodecTagString() {
        return this.codecTagString;
    }

    /**
     * @return codecTimeBase
     */
    public String getCodecTimeBase() {
        return this.codecTimeBase;
    }

    /**
     * @return duration
     */
    public Double getDuration() {
        return this.duration;
    }

    /**
     * @return frameCount
     */
    public Long getFrameCount() {
        return this.frameCount;
    }

    /**
     * @return index
     */
    public Long getIndex() {
        return this.index;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return lyric
     */
    public String getLyric() {
        return this.lyric;
    }

    /**
     * @return sampleFormat
     */
    public String getSampleFormat() {
        return this.sampleFormat;
    }

    /**
     * @return sampleRate
     */
    public Long getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return startTime
     */
    public Double getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeBase
     */
    public String getTimeBase() {
        return this.timeBase;
    }

    public static final class Builder {
        private Long bitrate; 
        private String channelLayout; 
        private Long channels; 
        private String codecLongName; 
        private String codecName; 
        private String codecTag; 
        private String codecTagString; 
        private String codecTimeBase; 
        private Double duration; 
        private Long frameCount; 
        private Long index; 
        private String language; 
        private String lyric; 
        private String sampleFormat; 
        private Long sampleRate; 
        private Double startTime; 
        private String timeBase; 

        /**
         * Bitrate.
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * ChannelLayout.
         */
        public Builder channelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }

        /**
         * Channels.
         */
        public Builder channels(Long channels) {
            this.channels = channels;
            return this;
        }

        /**
         * CodecLongName.
         */
        public Builder codecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }

        /**
         * CodecName.
         */
        public Builder codecName(String codecName) {
            this.codecName = codecName;
            return this;
        }

        /**
         * CodecTag.
         */
        public Builder codecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }

        /**
         * CodecTagString.
         */
        public Builder codecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }

        /**
         * CodecTimeBase.
         */
        public Builder codecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * FrameCount.
         */
        public Builder frameCount(Long frameCount) {
            this.frameCount = frameCount;
            return this;
        }

        /**
         * Index.
         */
        public Builder index(Long index) {
            this.index = index;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * Lyric.
         */
        public Builder lyric(String lyric) {
            this.lyric = lyric;
            return this;
        }

        /**
         * SampleFormat.
         */
        public Builder sampleFormat(String sampleFormat) {
            this.sampleFormat = sampleFormat;
            return this;
        }

        /**
         * SampleRate.
         */
        public Builder sampleRate(Long sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TimeBase.
         */
        public Builder timeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }

        public AudioStream build() {
            return new AudioStream(this);
        } 

    } 

}
