// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TargetVideo} extends {@link TeaModel}
 *
 * <p>TargetVideo</p>
 */
public class TargetVideo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisableVideo")
    private Boolean disableVideo;

    @com.aliyun.core.annotation.NameInMap("FilterVideo")
    private FilterVideo filterVideo;

    @com.aliyun.core.annotation.NameInMap("Stream")
    private java.util.List < Integer > stream;

    @com.aliyun.core.annotation.NameInMap("TranscodeVideo")
    private TranscodeVideo transcodeVideo;

    private TargetVideo(Builder builder) {
        this.disableVideo = builder.disableVideo;
        this.filterVideo = builder.filterVideo;
        this.stream = builder.stream;
        this.transcodeVideo = builder.transcodeVideo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TargetVideo create() {
        return builder().build();
    }

    /**
     * @return disableVideo
     */
    public Boolean getDisableVideo() {
        return this.disableVideo;
    }

    /**
     * @return filterVideo
     */
    public FilterVideo getFilterVideo() {
        return this.filterVideo;
    }

    /**
     * @return stream
     */
    public java.util.List < Integer > getStream() {
        return this.stream;
    }

    /**
     * @return transcodeVideo
     */
    public TranscodeVideo getTranscodeVideo() {
        return this.transcodeVideo;
    }

    public static final class Builder {
        private Boolean disableVideo; 
        private FilterVideo filterVideo; 
        private java.util.List < Integer > stream; 
        private TranscodeVideo transcodeVideo; 

        /**
         * DisableVideo.
         */
        public Builder disableVideo(Boolean disableVideo) {
            this.disableVideo = disableVideo;
            return this;
        }

        /**
         * FilterVideo.
         */
        public Builder filterVideo(FilterVideo filterVideo) {
            this.filterVideo = filterVideo;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(java.util.List < Integer > stream) {
            this.stream = stream;
            return this;
        }

        /**
         * TranscodeVideo.
         */
        public Builder transcodeVideo(TranscodeVideo transcodeVideo) {
            this.transcodeVideo = transcodeVideo;
            return this;
        }

        public TargetVideo build() {
            return new TargetVideo(this);
        } 

    } 

    public static class Delogos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("Dx")
        private Float dx;

        @com.aliyun.core.annotation.NameInMap("Dy")
        private Float dy;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("ReferPos")
        private String referPos;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Double startTime;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        private Delogos(Builder builder) {
            this.duration = builder.duration;
            this.dx = builder.dx;
            this.dy = builder.dy;
            this.height = builder.height;
            this.referPos = builder.referPos;
            this.startTime = builder.startTime;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delogos create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return dx
         */
        public Float getDx() {
            return this.dx;
        }

        /**
         * @return dy
         */
        public Float getDy() {
            return this.dy;
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return referPos
         */
        public String getReferPos() {
            return this.referPos;
        }

        /**
         * @return startTime
         */
        public Double getStartTime() {
            return this.startTime;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Double duration; 
            private Float dx; 
            private Float dy; 
            private Float height; 
            private String referPos; 
            private Double startTime; 
            private Float width; 

            /**
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Dx.
             */
            public Builder dx(Float dx) {
                this.dx = dx;
                return this;
            }

            /**
             * Dy.
             */
            public Builder dy(Float dy) {
                this.dy = dy;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * ReferPos.
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
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
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            public Delogos build() {
                return new Delogos(this);
            } 

        } 

    }
    public static class Watermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BorderColor")
        private String borderColor;

        @com.aliyun.core.annotation.NameInMap("BorderWidth")
        private Integer borderWidth;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("Dx")
        private Float dx;

        @com.aliyun.core.annotation.NameInMap("Dy")
        private Float dy;

        @com.aliyun.core.annotation.NameInMap("FontApha")
        private Float fontApha;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontName")
        private String fontName;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("ReferPos")
        private String referPos;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Double startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        private Watermarks(Builder builder) {
            this.borderColor = builder.borderColor;
            this.borderWidth = builder.borderWidth;
            this.content = builder.content;
            this.duration = builder.duration;
            this.dx = builder.dx;
            this.dy = builder.dy;
            this.fontApha = builder.fontApha;
            this.fontColor = builder.fontColor;
            this.fontName = builder.fontName;
            this.fontSize = builder.fontSize;
            this.height = builder.height;
            this.referPos = builder.referPos;
            this.startTime = builder.startTime;
            this.type = builder.type;
            this.URI = builder.URI;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermarks create() {
            return builder().build();
        }

        /**
         * @return borderColor
         */
        public String getBorderColor() {
            return this.borderColor;
        }

        /**
         * @return borderWidth
         */
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return dx
         */
        public Float getDx() {
            return this.dx;
        }

        /**
         * @return dy
         */
        public Float getDy() {
            return this.dy;
        }

        /**
         * @return fontApha
         */
        public Float getFontApha() {
            return this.fontApha;
        }

        /**
         * @return fontColor
         */
        public String getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontName
         */
        public String getFontName() {
            return this.fontName;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return referPos
         */
        public String getReferPos() {
            return this.referPos;
        }

        /**
         * @return startTime
         */
        public Double getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String borderColor; 
            private Integer borderWidth; 
            private String content; 
            private Double duration; 
            private Float dx; 
            private Float dy; 
            private Float fontApha; 
            private String fontColor; 
            private String fontName; 
            private Integer fontSize; 
            private Float height; 
            private String referPos; 
            private Double startTime; 
            private String type; 
            private String URI; 
            private Float width; 

            /**
             * BorderColor.
             */
            public Builder borderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * BorderWidth.
             */
            public Builder borderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * Dx.
             */
            public Builder dx(Float dx) {
                this.dx = dx;
                return this;
            }

            /**
             * Dy.
             */
            public Builder dy(Float dy) {
                this.dy = dy;
                return this;
            }

            /**
             * FontApha.
             */
            public Builder fontApha(Float fontApha) {
                this.fontApha = fontApha;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * FontName.
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * ReferPos.
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            public Watermarks build() {
                return new Watermarks(this);
            } 

        } 

    }
    public static class FilterVideo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delogos")
        private java.util.List < Delogos> delogos;

        @com.aliyun.core.annotation.NameInMap("Watermarks")
        private java.util.List < Watermarks> watermarks;

        private FilterVideo(Builder builder) {
            this.delogos = builder.delogos;
            this.watermarks = builder.watermarks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterVideo create() {
            return builder().build();
        }

        /**
         * @return delogos
         */
        public java.util.List < Delogos> getDelogos() {
            return this.delogos;
        }

        /**
         * @return watermarks
         */
        public java.util.List < Watermarks> getWatermarks() {
            return this.watermarks;
        }

        public static final class Builder {
            private java.util.List < Delogos> delogos; 
            private java.util.List < Watermarks> watermarks; 

            /**
             * Delogos.
             */
            public Builder delogos(java.util.List < Delogos> delogos) {
                this.delogos = delogos;
                return this;
            }

            /**
             * Watermarks.
             */
            public Builder watermarks(java.util.List < Watermarks> watermarks) {
                this.watermarks = watermarks;
                return this;
            }

            public FilterVideo build() {
                return new FilterVideo(this);
            } 

        } 

    }
    public static class TranscodeVideo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdaptiveResolutionDirection")
        private Boolean adaptiveResolutionDirection;

        @com.aliyun.core.annotation.NameInMap("BFrames")
        private Integer bFrames;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private Integer bitrate;

        @com.aliyun.core.annotation.NameInMap("BitrateOption")
        private String bitrateOption;

        @com.aliyun.core.annotation.NameInMap("BufferSize")
        private Integer bufferSize;

        @com.aliyun.core.annotation.NameInMap("CRF")
        private Float CRF;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private Float frameRate;

        @com.aliyun.core.annotation.NameInMap("FrameRateOption")
        private String frameRateOption;

        @com.aliyun.core.annotation.NameInMap("GOPSize")
        private Integer GOPSize;

        @com.aliyun.core.annotation.NameInMap("MaxBitrate")
        private Integer maxBitrate;

        @com.aliyun.core.annotation.NameInMap("PixelFormat")
        private String pixelFormat;

        @com.aliyun.core.annotation.NameInMap("Refs")
        private Integer refs;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("ResolutionOption")
        private String resolutionOption;

        @com.aliyun.core.annotation.NameInMap("Rotation")
        private Integer rotation;

        @com.aliyun.core.annotation.NameInMap("ScaleType")
        private String scaleType;

        private TranscodeVideo(Builder builder) {
            this.adaptiveResolutionDirection = builder.adaptiveResolutionDirection;
            this.bFrames = builder.bFrames;
            this.bitrate = builder.bitrate;
            this.bitrateOption = builder.bitrateOption;
            this.bufferSize = builder.bufferSize;
            this.CRF = builder.CRF;
            this.codec = builder.codec;
            this.frameRate = builder.frameRate;
            this.frameRateOption = builder.frameRateOption;
            this.GOPSize = builder.GOPSize;
            this.maxBitrate = builder.maxBitrate;
            this.pixelFormat = builder.pixelFormat;
            this.refs = builder.refs;
            this.resolution = builder.resolution;
            this.resolutionOption = builder.resolutionOption;
            this.rotation = builder.rotation;
            this.scaleType = builder.scaleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeVideo create() {
            return builder().build();
        }

        /**
         * @return adaptiveResolutionDirection
         */
        public Boolean getAdaptiveResolutionDirection() {
            return this.adaptiveResolutionDirection;
        }

        /**
         * @return bFrames
         */
        public Integer getBFrames() {
            return this.bFrames;
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
         * @return bufferSize
         */
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        /**
         * @return CRF
         */
        public Float getCRF() {
            return this.CRF;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return frameRate
         */
        public Float getFrameRate() {
            return this.frameRate;
        }

        /**
         * @return frameRateOption
         */
        public String getFrameRateOption() {
            return this.frameRateOption;
        }

        /**
         * @return GOPSize
         */
        public Integer getGOPSize() {
            return this.GOPSize;
        }

        /**
         * @return maxBitrate
         */
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        /**
         * @return pixelFormat
         */
        public String getPixelFormat() {
            return this.pixelFormat;
        }

        /**
         * @return refs
         */
        public Integer getRefs() {
            return this.refs;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return resolutionOption
         */
        public String getResolutionOption() {
            return this.resolutionOption;
        }

        /**
         * @return rotation
         */
        public Integer getRotation() {
            return this.rotation;
        }

        /**
         * @return scaleType
         */
        public String getScaleType() {
            return this.scaleType;
        }

        public static final class Builder {
            private Boolean adaptiveResolutionDirection; 
            private Integer bFrames; 
            private Integer bitrate; 
            private String bitrateOption; 
            private Integer bufferSize; 
            private Float CRF; 
            private String codec; 
            private Float frameRate; 
            private String frameRateOption; 
            private Integer GOPSize; 
            private Integer maxBitrate; 
            private String pixelFormat; 
            private Integer refs; 
            private String resolution; 
            private String resolutionOption; 
            private Integer rotation; 
            private String scaleType; 

            /**
             * AdaptiveResolutionDirection.
             */
            public Builder adaptiveResolutionDirection(Boolean adaptiveResolutionDirection) {
                this.adaptiveResolutionDirection = adaptiveResolutionDirection;
                return this;
            }

            /**
             * BFrames.
             */
            public Builder bFrames(Integer bFrames) {
                this.bFrames = bFrames;
                return this;
            }

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
             * BufferSize.
             */
            public Builder bufferSize(Integer bufferSize) {
                this.bufferSize = bufferSize;
                return this;
            }

            /**
             * CRF.
             */
            public Builder CRF(Float CRF) {
                this.CRF = CRF;
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
             * FrameRate.
             */
            public Builder frameRate(Float frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * FrameRateOption.
             */
            public Builder frameRateOption(String frameRateOption) {
                this.frameRateOption = frameRateOption;
                return this;
            }

            /**
             * GOPSize.
             */
            public Builder GOPSize(Integer GOPSize) {
                this.GOPSize = GOPSize;
                return this;
            }

            /**
             * MaxBitrate.
             */
            public Builder maxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
                return this;
            }

            /**
             * PixelFormat.
             */
            public Builder pixelFormat(String pixelFormat) {
                this.pixelFormat = pixelFormat;
                return this;
            }

            /**
             * Refs.
             */
            public Builder refs(Integer refs) {
                this.refs = refs;
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
             * ResolutionOption.
             */
            public Builder resolutionOption(String resolutionOption) {
                this.resolutionOption = resolutionOption;
                return this;
            }

            /**
             * Rotation.
             */
            public Builder rotation(Integer rotation) {
                this.rotation = rotation;
                return this;
            }

            /**
             * ScaleType.
             */
            public Builder scaleType(String scaleType) {
                this.scaleType = scaleType;
                return this;
            }

            public TranscodeVideo build() {
                return new TranscodeVideo(this);
            } 

        } 

    }
}
