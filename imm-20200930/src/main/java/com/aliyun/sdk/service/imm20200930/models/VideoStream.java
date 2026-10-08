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
 * {@link VideoStream} extends {@link TeaModel}
 *
 * <p>VideoStream</p>
 */
public class VideoStream extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AverageFrameRate")
    private String averageFrameRate;

    @com.aliyun.core.annotation.NameInMap("BitDepth")
    private Long bitDepth;

    @com.aliyun.core.annotation.NameInMap("Bitrate")
    private Long bitrate;

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

    @com.aliyun.core.annotation.NameInMap("ColorPrimaries")
    private String colorPrimaries;

    @com.aliyun.core.annotation.NameInMap("ColorRange")
    private String colorRange;

    @com.aliyun.core.annotation.NameInMap("ColorSpace")
    private String colorSpace;

    @com.aliyun.core.annotation.NameInMap("ColorTransfer")
    private String colorTransfer;

    @com.aliyun.core.annotation.NameInMap("DisplayAspectRatio")
    private String displayAspectRatio;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Double duration;

    @com.aliyun.core.annotation.NameInMap("FrameCount")
    private Long frameCount;

    @com.aliyun.core.annotation.NameInMap("FrameRate")
    private String frameRate;

    @com.aliyun.core.annotation.NameInMap("HasBFrames")
    private Long hasBFrames;

    @com.aliyun.core.annotation.NameInMap("Height")
    private Long height;

    @com.aliyun.core.annotation.NameInMap("Index")
    private Long index;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("Level")
    private Long level;

    @com.aliyun.core.annotation.NameInMap("PixelFormat")
    private String pixelFormat;

    @com.aliyun.core.annotation.NameInMap("Profile")
    private String profile;

    @com.aliyun.core.annotation.NameInMap("Rotate")
    private String rotate;

    @com.aliyun.core.annotation.NameInMap("SampleAspectRatio")
    private String sampleAspectRatio;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Double startTime;

    @com.aliyun.core.annotation.NameInMap("TimeBase")
    private String timeBase;

    @com.aliyun.core.annotation.NameInMap("Width")
    private Long width;

    private VideoStream(Builder builder) {
        this.averageFrameRate = builder.averageFrameRate;
        this.bitDepth = builder.bitDepth;
        this.bitrate = builder.bitrate;
        this.codecLongName = builder.codecLongName;
        this.codecName = builder.codecName;
        this.codecTag = builder.codecTag;
        this.codecTagString = builder.codecTagString;
        this.codecTimeBase = builder.codecTimeBase;
        this.colorPrimaries = builder.colorPrimaries;
        this.colorRange = builder.colorRange;
        this.colorSpace = builder.colorSpace;
        this.colorTransfer = builder.colorTransfer;
        this.displayAspectRatio = builder.displayAspectRatio;
        this.duration = builder.duration;
        this.frameCount = builder.frameCount;
        this.frameRate = builder.frameRate;
        this.hasBFrames = builder.hasBFrames;
        this.height = builder.height;
        this.index = builder.index;
        this.language = builder.language;
        this.level = builder.level;
        this.pixelFormat = builder.pixelFormat;
        this.profile = builder.profile;
        this.rotate = builder.rotate;
        this.sampleAspectRatio = builder.sampleAspectRatio;
        this.startTime = builder.startTime;
        this.timeBase = builder.timeBase;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoStream create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return averageFrameRate
     */
    public String getAverageFrameRate() {
        return this.averageFrameRate;
    }

    /**
     * @return bitDepth
     */
    public Long getBitDepth() {
        return this.bitDepth;
    }

    /**
     * @return bitrate
     */
    public Long getBitrate() {
        return this.bitrate;
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
     * @return colorPrimaries
     */
    public String getColorPrimaries() {
        return this.colorPrimaries;
    }

    /**
     * @return colorRange
     */
    public String getColorRange() {
        return this.colorRange;
    }

    /**
     * @return colorSpace
     */
    public String getColorSpace() {
        return this.colorSpace;
    }

    /**
     * @return colorTransfer
     */
    public String getColorTransfer() {
        return this.colorTransfer;
    }

    /**
     * @return displayAspectRatio
     */
    public String getDisplayAspectRatio() {
        return this.displayAspectRatio;
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
     * @return frameRate
     */
    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * @return hasBFrames
     */
    public Long getHasBFrames() {
        return this.hasBFrames;
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
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
     * @return level
     */
    public Long getLevel() {
        return this.level;
    }

    /**
     * @return pixelFormat
     */
    public String getPixelFormat() {
        return this.pixelFormat;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return rotate
     */
    public String getRotate() {
        return this.rotate;
    }

    /**
     * @return sampleAspectRatio
     */
    public String getSampleAspectRatio() {
        return this.sampleAspectRatio;
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

    /**
     * @return width
     */
    public Long getWidth() {
        return this.width;
    }

    public static final class Builder {
        private String averageFrameRate; 
        private Long bitDepth; 
        private Long bitrate; 
        private String codecLongName; 
        private String codecName; 
        private String codecTag; 
        private String codecTagString; 
        private String codecTimeBase; 
        private String colorPrimaries; 
        private String colorRange; 
        private String colorSpace; 
        private String colorTransfer; 
        private String displayAspectRatio; 
        private Double duration; 
        private Long frameCount; 
        private String frameRate; 
        private Long hasBFrames; 
        private Long height; 
        private Long index; 
        private String language; 
        private Long level; 
        private String pixelFormat; 
        private String profile; 
        private String rotate; 
        private String sampleAspectRatio; 
        private Double startTime; 
        private String timeBase; 
        private Long width; 

        private Builder() {
        } 

        private Builder(VideoStream model) {
            this.averageFrameRate = model.averageFrameRate;
            this.bitDepth = model.bitDepth;
            this.bitrate = model.bitrate;
            this.codecLongName = model.codecLongName;
            this.codecName = model.codecName;
            this.codecTag = model.codecTag;
            this.codecTagString = model.codecTagString;
            this.codecTimeBase = model.codecTimeBase;
            this.colorPrimaries = model.colorPrimaries;
            this.colorRange = model.colorRange;
            this.colorSpace = model.colorSpace;
            this.colorTransfer = model.colorTransfer;
            this.displayAspectRatio = model.displayAspectRatio;
            this.duration = model.duration;
            this.frameCount = model.frameCount;
            this.frameRate = model.frameRate;
            this.hasBFrames = model.hasBFrames;
            this.height = model.height;
            this.index = model.index;
            this.language = model.language;
            this.level = model.level;
            this.pixelFormat = model.pixelFormat;
            this.profile = model.profile;
            this.rotate = model.rotate;
            this.sampleAspectRatio = model.sampleAspectRatio;
            this.startTime = model.startTime;
            this.timeBase = model.timeBase;
            this.width = model.width;
        } 

        /**
         * <p>The average frame rate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>25/1</p>
         */
        public Builder averageFrameRate(String averageFrameRate) {
            this.averageFrameRate = averageFrameRate;
            return this;
        }

        /**
         * <p>The bit depth.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder bitDepth(Long bitDepth) {
            this.bitDepth = bitDepth;
            return this;
        }

        /**
         * <p>The bitrate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5407765</p>
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * <p>The full name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
         */
        public Builder codecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }

        /**
         * <p>The abbreviated name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        public Builder codecName(String codecName) {
            this.codecName = codecName;
            return this;
        }

        /**
         * <p>The tag of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>0x31637661</p>
         */
        public Builder codecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }

        /**
         * <p>The description of the codec tag.</p>
         * 
         * <strong>example:</strong>
         * <p>avc1</p>
         */
        public Builder codecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }

        /**
         * <p>The time base of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>1373627/83160000</p>
         */
        public Builder codecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }

        /**
         * <p>The primary colors.</p>
         * 
         * <strong>example:</strong>
         * <p>bt709</p>
         */
        public Builder colorPrimaries(String colorPrimaries) {
            this.colorPrimaries = colorPrimaries;
            return this;
        }

        /**
         * <p>The color range.</p>
         * 
         * <strong>example:</strong>
         * <p>tv</p>
         */
        public Builder colorRange(String colorRange) {
            this.colorRange = colorRange;
            return this;
        }

        /**
         * <p>The color space.</p>
         * 
         * <strong>example:</strong>
         * <p>bt709</p>
         */
        public Builder colorSpace(String colorSpace) {
            this.colorSpace = colorSpace;
            return this;
        }

        /**
         * <p>The color transfer function.</p>
         * 
         * <strong>example:</strong>
         * <p>bt709</p>
         */
        public Builder colorTransfer(String colorTransfer) {
            this.colorTransfer = colorTransfer;
            return this;
        }

        /**
         * <p>The display aspect ratio of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        public Builder displayAspectRatio(String displayAspectRatio) {
            this.displayAspectRatio = displayAspectRatio;
            return this;
        }

        /**
         * <p>The duration of the video stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>22.88</p>
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>572</p>
         */
        public Builder frameCount(Long frameCount) {
            this.frameCount = frameCount;
            return this;
        }

        /**
         * <p>The frame rate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>25/1</p>
         */
        public Builder frameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        /**
         * <p>Specifies whether the video stream contains B frames.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder hasBFrames(Long hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }

        /**
         * <p>The image height of the video stream. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * <p>The index number of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder index(Long index) {
            this.index = index;
            return this;
        }

        /**
         * <p>The language used in the video stream. The language is indicated by using a BCP 47 language tag.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>The level.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder level(Long level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The pixel format of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        public Builder pixelFormat(String pixelFormat) {
            this.pixelFormat = pixelFormat;
            return this;
        }

        /**
         * <p>The profile.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>The image rotation angle of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder rotate(String rotate) {
            this.rotate = rotate;
            return this;
        }

        /**
         * <p>The sampling aspect ratio of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1:1</p>
         */
        public Builder sampleAspectRatio(String sampleAspectRatio) {
            this.sampleAspectRatio = sampleAspectRatio;
            return this;
        }

        /**
         * <p>The start time of the video stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/12800</p>
         */
        public Builder timeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }

        /**
         * <p>The image width of the video stream. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        public VideoStream build() {
            return new VideoStream(this);
        } 

    } 

}
