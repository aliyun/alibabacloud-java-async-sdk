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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AudioStream model) {
            this.bitrate = model.bitrate;
            this.channelLayout = model.channelLayout;
            this.channels = model.channels;
            this.codecLongName = model.codecLongName;
            this.codecName = model.codecName;
            this.codecTag = model.codecTag;
            this.codecTagString = model.codecTagString;
            this.codecTimeBase = model.codecTimeBase;
            this.duration = model.duration;
            this.frameCount = model.frameCount;
            this.index = model.index;
            this.language = model.language;
            this.lyric = model.lyric;
            this.sampleFormat = model.sampleFormat;
            this.sampleRate = model.sampleRate;
            this.startTime = model.startTime;
            this.timeBase = model.timeBase;
        } 

        /**
         * <p>The bitrate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>320087</p>
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * <p>The sound channel layout.</p>
         * 
         * <strong>example:</strong>
         * <p>stereo</p>
         */
        public Builder channelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }

        /**
         * <p>The number of sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder channels(Long channels) {
            this.channels = channels;
            return this;
        }

        /**
         * <p>The full name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC (Advanced Audio Coding)</p>
         */
        public Builder codecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }

        /**
         * <p>The abbreviated name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        public Builder codecName(String codecName) {
            this.codecName = codecName;
            return this;
        }

        /**
         * <p>The tag of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>0x6134706d</p>
         */
        public Builder codecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }

        /**
         * <p>The description of the codec tag.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4a</p>
         */
        public Builder codecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }

        /**
         * <p>The time base of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        public Builder codecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }

        /**
         * <p>The duration of the audio stream in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3.690667</p>
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>173</p>
         */
        public Builder frameCount(Long frameCount) {
            this.frameCount = frameCount;
            return this;
        }

        /**
         * <p>The index number of the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder index(Long index) {
            this.index = index;
            return this;
        }

        /**
         * <p>The audio language in the BCP 47 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>The lyric.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder lyric(String lyric) {
            this.lyric = lyric;
            return this;
        }

        /**
         * <p>The sample format.</p>
         * 
         * <strong>example:</strong>
         * <p>fltp</p>
         */
        public Builder sampleFormat(String sampleFormat) {
            this.sampleFormat = sampleFormat;
            return this;
        }

        /**
         * <p>The sampling rate. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>48000</p>
         */
        public Builder sampleRate(Long sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * <p>The start time of the audio stream in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0235</p>
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/48000</p>
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
