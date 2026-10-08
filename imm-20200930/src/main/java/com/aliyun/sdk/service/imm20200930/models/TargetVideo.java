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
    private java.util.List<Integer> stream;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Integer> getStream() {
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
        private java.util.List<Integer> stream; 
        private TranscodeVideo transcodeVideo; 

        private Builder() {
        } 

        private Builder(TargetVideo model) {
            this.disableVideo = model.disableVideo;
            this.filterVideo = model.filterVideo;
            this.stream = model.stream;
            this.transcodeVideo = model.transcodeVideo;
        } 

        /**
         * <p>Specifies whether to disable video stream generation. Valid values:</p>
         * <ul>
         * <li>true: Disabled. The output file does not contain a video stream.</li>
         * <li>false (default): Not disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableVideo(Boolean disableVideo) {
            this.disableVideo = disableVideo;
            return this;
        }

        /**
         * <p>The video processing parameters. This parameter does not take effect when the <strong>TranscodeVideo</strong> parameter is empty or when <strong>TranscodeVideo.Codec</strong> is set to copy.</p>
         * <blockquote>
         * <p>This parameter is not supported for the GenerateVideoPlaylist API.</p>
         * </blockquote>
         */
        public Builder filterVideo(FilterVideo filterVideo) {
            this.filterVideo = filterVideo;
            return this;
        }

        /**
         * <p>The list of video stream index numbers to process from the source file. An empty value (default) indicates that the video stream with the smallest index number (the first video stream) is processed. An index number greater than 100 indicates that all video streams are processed.</p>
         * <ul>
         * <li>Example: <code>[0,1]</code> processes video streams with index numbers 0 and 1. <code>[1]</code> processes the video stream with index number 1. <code>[101]</code> processes all video streams.</li>
         * </ul>
         * <blockquote>
         * <p>Only video streams with existing index numbers are processed. If a video stream corresponding to an index number does not exist, that index number is ignored.</p>
         * </blockquote>
         */
        public Builder stream(java.util.List<Integer> stream) {
            this.stream = stream;
            return this;
        }

        /**
         * <p>The video transcoding parameters. An empty value indicates that video processing is disabled and the output file does not contain a video stream.</p>
         * <blockquote>
         * <p>Setting this parameter to an empty value to disable video processing is not recommended.</p>
         * </blockquote>
         */
        public Builder transcodeVideo(TranscodeVideo transcodeVideo) {
            this.transcodeVideo = transcodeVideo;
            return this;
        }

        public TargetVideo build() {
            return new TargetVideo(this);
        } 

    } 

    /**
     * 
     * {@link TargetVideo} extends {@link TeaModel}
     *
     * <p>TargetVideo</p>
     */
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

            private Builder() {
            } 

            private Builder(Delogos model) {
                this.duration = model.duration;
                this.dx = model.dx;
                this.dy = model.dy;
                this.height = model.height;
                this.referPos = model.referPos;
                this.startTime = model.startTime;
                this.width = model.width;
            } 

            /**
             * <p>The duration for which the mosaic is applied, in seconds (s). The default value is until the end of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The meanings differ depending on whether the value is an integer or decimal:</p>
             * <ul>
             * <li>0 (default): Both the offset in pixels and the ratio of horizontal offset to output resolution height are 0.</li>
             * <li>Integer: The offset in pixels (px). Value range: [1,4096].</li>
             * <li>Decimal: The ratio of horizontal offset to output resolution height. Value range: (0,1).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dx(Float dx) {
                this.dx = dx;
                return this;
            }

            /**
             * <p>Default value: 0. The meanings differ depending on whether the value is an integer or decimal:</p>
             * <ul>
             * <li>0 (default): Both the offset in pixels and the ratio of vertical offset to output resolution height are 0.</li>
             * <li>Integer: The offset in pixels (px). Value range: [1,4096].</li>
             * <li>Decimal: The ratio of vertical offset to output resolution height. Value range: (0,1).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dy(Float dy) {
                this.dy = dy;
                return this;
            }

            /**
             * <p>The height of the mosaic. The default value is the decimal 1.0, which fills the entire output video height. The meanings differ depending on whether the value is an integer or decimal:</p>
             * <ul>
             * <li>Integer: The pixel value, in pixels (px). Value range: [1,4096].</li>
             * <li>Decimal: The ratio relative to the output video resolution height. Value range: (0,1).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The reference position for adding the mosaic. Valid values:</p>
             * <ul>
             * <li>topleft (default): top-left corner</li>
             * <li>topright: top-right corner</li>
             * <li>bottomright: bottom-right corner</li>
             * <li>bottomleft: bottom-left corner</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>topleft</p>
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * <p>The start time for adding the mosaic, in seconds (s). The default value is the start time of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startTime(Double startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The width of the mosaic. The default value is the decimal 1.0, which fills the entire output video width. The meanings differ depending on whether the value is an integer or decimal:</p>
             * <ul>
             * <li>Integer: The pixel value, in pixels (px). Value range: [1,4096].</li>
             * <li>Decimal: The ratio relative to the output video resolution width. Value range: (0,1).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link TargetVideo} extends {@link TeaModel}
     *
     * <p>TargetVideo</p>
     */
    public static class Face extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlurRadius")
        private Integer blurRadius;

        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("MinSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("ScaleRatio")
        private Float scaleRatio;

        @com.aliyun.core.annotation.NameInMap("Transparency")
        private Float transparency;

        private Face(Builder builder) {
            this.blurRadius = builder.blurRadius;
            this.confidence = builder.confidence;
            this.minSize = builder.minSize;
            this.scaleRatio = builder.scaleRatio;
            this.transparency = builder.transparency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Face create() {
            return builder().build();
        }

        /**
         * @return blurRadius
         */
        public Integer getBlurRadius() {
            return this.blurRadius;
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleRatio
         */
        public Float getScaleRatio() {
            return this.scaleRatio;
        }

        /**
         * @return transparency
         */
        public Float getTransparency() {
            return this.transparency;
        }

        public static final class Builder {
            private Integer blurRadius; 
            private Float confidence; 
            private Integer minSize; 
            private Float scaleRatio; 
            private Float transparency; 

            private Builder() {
            } 

            private Builder(Face model) {
                this.blurRadius = model.blurRadius;
                this.confidence = model.confidence;
                this.minSize = model.minSize;
                this.scaleRatio = model.scaleRatio;
                this.transparency = model.transparency;
            } 

            /**
             * <p>The blur radius. Value range: 1 to 100. A larger value typically results in a more blurred area.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder blurRadius(Integer blurRadius) {
                this.blurRadius = blurRadius;
                return this;
            }

            /**
             * <p>The face confidence threshold, which sets the lower limit of confidence for face recognition. If the confidence value of a detected face is lower than this threshold, the face is not desensitized.</p>
             * <ul>
             * <li>Value range: 0.0 to 1.0.</li>
             * <li>Default value: 0.0 (no confidence filtering is performed).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The minimum face size threshold, which sets the minimum size of faces to be desensitized. If the width or height of a detected face is smaller than this threshold, the face is not desensitized. Unit: pixels. Default value: 0, which indicates no restriction on face size.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * <p>The detection box scaling ratio. Value range: 0.1 to 5.0. Scales both the width and height of the detection box based on its center.
             * • &gt; 1.0: Enlarges the blur area.
             * • &lt; 1.0: Reduces the blur area.
             * • = 1.0: Uses the original detection box.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder scaleRatio(Float scaleRatio) {
                this.scaleRatio = scaleRatio;
                return this;
            }

            /**
             * <p>The transparency and edge feathering intensity of the blur area. Value range: 0.0 to 1.0.
             * • 0.0: Displays the full blur effect.
             * • 1.0: No blur processing is performed. Only the original image is displayed.
             * • 0.0 to 1.0: A larger value results in a higher proportion of the original image, a smaller actual blur radius, and typically a larger edge feathering range.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder transparency(Float transparency) {
                this.transparency = transparency;
                return this;
            }

            public Face build() {
                return new Face(this);
            } 

        } 

    }
    /**
     * 
     * {@link TargetVideo} extends {@link TeaModel}
     *
     * <p>TargetVideo</p>
     */
    public static class LicensePlate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlurRadius")
        private Integer blurRadius;

        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("MinSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("ScaleRatio")
        private Float scaleRatio;

        @com.aliyun.core.annotation.NameInMap("Transparency")
        private Float transparency;

        private LicensePlate(Builder builder) {
            this.blurRadius = builder.blurRadius;
            this.confidence = builder.confidence;
            this.minSize = builder.minSize;
            this.scaleRatio = builder.scaleRatio;
            this.transparency = builder.transparency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicensePlate create() {
            return builder().build();
        }

        /**
         * @return blurRadius
         */
        public Integer getBlurRadius() {
            return this.blurRadius;
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleRatio
         */
        public Float getScaleRatio() {
            return this.scaleRatio;
        }

        /**
         * @return transparency
         */
        public Float getTransparency() {
            return this.transparency;
        }

        public static final class Builder {
            private Integer blurRadius; 
            private Float confidence; 
            private Integer minSize; 
            private Float scaleRatio; 
            private Float transparency; 

            private Builder() {
            } 

            private Builder(LicensePlate model) {
                this.blurRadius = model.blurRadius;
                this.confidence = model.confidence;
                this.minSize = model.minSize;
                this.scaleRatio = model.scaleRatio;
                this.transparency = model.transparency;
            } 

            /**
             * <p>The blur radius. Value range: 1 to 100. A larger value typically results in a more blurred area.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder blurRadius(Integer blurRadius) {
                this.blurRadius = blurRadius;
                return this;
            }

            /**
             * <p>The license plate confidence threshold, which sets the lower limit of confidence for license plate recognition. If the confidence value of a detected license plate is lower than this threshold, the license plate is not desensitized.</p>
             * <ul>
             * <li>Value range: 0.0 to 1.0.</li>
             * <li>Default value: 0.0 (no confidence filtering is performed).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The minimum license plate size threshold, which sets the minimum size of license plates to be desensitized. If the width or height of a detected license plate is smaller than this threshold, the license plate is not desensitized. Unit: pixels. Default value: 0, which indicates no restriction on license plate size.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * <p>The detection box scaling ratio. Value range: 0.1 to 5.0. Scales both the width and height of the detection box based on its center.
             * • &gt; 1.0: Enlarges the blur area.
             * • &lt; 1.0: Reduces the blur area.
             * • = 1.0: Uses the original detection box.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder scaleRatio(Float scaleRatio) {
                this.scaleRatio = scaleRatio;
                return this;
            }

            /**
             * <p>The transparency and edge feathering intensity of the blur area. Value range: 0.0 to 1.0.
             * • 0.0: Displays the full blur effect.
             * • 1.0: No blur processing is performed. Only the original image is displayed.
             * • 0.0 to 1.0: A larger value results in a higher proportion of the original image, a smaller actual blur radius, and typically a larger edge feathering range.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder transparency(Float transparency) {
                this.transparency = transparency;
                return this;
            }

            public LicensePlate build() {
                return new LicensePlate(this);
            } 

        } 

    }
    /**
     * 
     * {@link TargetVideo} extends {@link TeaModel}
     *
     * <p>TargetVideo</p>
     */
    public static class Desensitization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Face")
        private Face face;

        @com.aliyun.core.annotation.NameInMap("LicensePlate")
        private LicensePlate licensePlate;

        private Desensitization(Builder builder) {
            this.face = builder.face;
            this.licensePlate = builder.licensePlate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Desensitization create() {
            return builder().build();
        }

        /**
         * @return face
         */
        public Face getFace() {
            return this.face;
        }

        /**
         * @return licensePlate
         */
        public LicensePlate getLicensePlate() {
            return this.licensePlate;
        }

        public static final class Builder {
            private Face face; 
            private LicensePlate licensePlate; 

            private Builder() {
            } 

            private Builder(Desensitization model) {
                this.face = model.face;
                this.licensePlate = model.licensePlate;
            } 

            /**
             * <p>The face desensitization configuration.</p>
             * <blockquote>
             * <p>This feature is in public preview. If you have any questions, join the DingTalk group for feedback. For the DingTalk group number, see <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</p>
             * </blockquote>
             */
            public Builder face(Face face) {
                this.face = face;
                return this;
            }

            /**
             * <p>The license plate desensitization configuration.</p>
             * <blockquote>
             * <p>This feature is in public preview. If you have any questions, join the DingTalk group for feedback. For the DingTalk group number, see <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</p>
             * </blockquote>
             */
            public Builder licensePlate(LicensePlate licensePlate) {
                this.licensePlate = licensePlate;
                return this;
            }

            public Desensitization build() {
                return new Desensitization(this);
            } 

        } 

    }
    /**
     * 
     * {@link TargetVideo} extends {@link TeaModel}
     *
     * <p>TargetVideo</p>
     */
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

            private Builder() {
            } 

            private Builder(Watermarks model) {
                this.borderColor = model.borderColor;
                this.borderWidth = model.borderWidth;
                this.content = model.content;
                this.duration = model.duration;
                this.dx = model.dx;
                this.dy = model.dy;
                this.fontApha = model.fontApha;
                this.fontColor = model.fontColor;
                this.fontName = model.fontName;
                this.fontSize = model.fontSize;
                this.height = model.height;
                this.referPos = model.referPos;
                this.startTime = model.startTime;
                this.type = model.type;
                this.URI = model.URI;
                this.width = model.width;
            } 

            /**
             * <p>The border color of the watermark text. The format is #RRGGBB. Default value: #000000. Values such as &quot;red&quot; and &quot;green&quot; are also supported.</p>
             * <blockquote>
             * <p>Notice:  This parameter takes effect when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>red</p>
             */
            public Builder borderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * <p>The border width of the text watermark, in pixels (px). The value must be an integer. Value range: [0,4096]. Default value: 0.</p>
             * <blockquote>
             * <p>Notice:  This parameter takes effect when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder borderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            /**
             * <p>The content of the text watermark. The default value is empty.</p>
             * <blockquote>
             * <p>Notice:  This parameter takes effect when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The duration for which the watermark is displayed, in seconds (s). The default value is until the end of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The meanings differ depending on whether the value is an integer or decimal:</p>
             * <ul>
             * <li>0 (default): Both the offset in pixels and the ratio of horizontal offset to output resolution height are 0.</li>
             * <li>Integer: The offset in pixels (px). Value range: [1,4096].</li>
             * <li>Decimal: The ratio of horizontal offset to output resolution height. Value range: (0,1).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dx(Float dx) {
                this.dx = dx;
                return this;
            }

            /**
             * <p>The meanings differ depending on whether the value is an integer or decimal:</p>
             * <ul>
             * <li><p>0 (default): Both the offset in pixels and the ratio of vertical offset to output resolution height are 0.</p>
             * </li>
             * <li><p>Integer: The offset in pixels (px). Value range: [1,4096].</p>
             * </li>
             * <li><p>Decimal: The ratio of vertical offset to output resolution height. Value range: (0,1).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dy(Float dy) {
                this.dy = dy;
                return this;
            }

            /**
             * <p>The font transparency of the text watermark. Value range: (0,1]. Default value: 1, which indicates fully opaque.</p>
             * <blockquote>
             * <p>Notice:  This parameter takes effect when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder fontApha(Float fontApha) {
                this.fontApha = fontApha;
                return this;
            }

            /**
             * <p>The font color of the watermark text. The format is #RRGGBB. Default value: #000000. Values such as &quot;red&quot; and &quot;green&quot; are also supported.</p>
             * <blockquote>
             * <p>Notice:  This parameter takes effect when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>red</p>
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font name of the text watermark. Valid values:</p>
             * <ul>
             * <li>SourceHanSans-Regular (default)</li>
             * <li>SourceHanSans-Bold</li>
             * <li>SourceHanSerif-Regular</li>
             * <li>SourceHanSerif-Bold</li>
             * </ul>
             * <blockquote>
             * <p>Notice:  This parameter takes effect when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SourceHanSans-Bold</p>
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * <p>The font size of the text watermark. Default value: 16. The value must be an integer. Value range: (4,120).</p>
             * <blockquote>
             * <p>Notice:  This parameter takes effect when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>The height of the watermark image. The default value is the original height of the watermark image. The meanings differ depending on whether the value is an integer or decimal:</p>
             * <ul>
             * <li>Integer: The pixel value of the logo removal height, in pixels (px). Value range: [1,4096].</li>
             * <li>Decimal: The ratio relative to the output video resolution height. Value range: (0,1).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The reference position for adding the watermark. Valid values:</p>
             * <ul>
             * <li>topleft (default): top-left corner</li>
             * <li>topright: top-right corner</li>
             * <li>bottomright: bottom-right corner</li>
             * <li>bottomleft: bottom-left corner</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>topleft</p>
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * <p>The start time for adding the watermark, in seconds (s). The default value is the start time of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startTime(Double startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The watermark type. Valid values:</p>
             * <ul>
             * <li>text (default): text watermark.</li>
             * <li>file: image or animated image watermark.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The OSS URI of the watermark file. Supported formats are PNG and MOV.</p>
             * <p>The OSS URI format is <code>oss://&lt;bucket&gt;/&lt;object&gt;</code>, where <code>&lt;bucket&gt;</code> is the name of an OSS bucket in the same region as the current project, and <code>&lt;object&gt;</code> is the full path of the file including the file name extension.</p>
             * <blockquote>
             * <p>Notice:  This parameter takes effect when the <code>Type</code> parameter is set to <code>file</code>.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/watermark.jpg</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * <p>The width of the watermark image. The default value is the original width of the watermark image. The meanings differ depending on whether the value is an integer or decimal:</p>
             * <ul>
             * <li>Integer: The pixel value of the logo removal width, in pixels (px). Value range: [1,4096].</li>
             * <li>Decimal: The ratio relative to the output video resolution width. Value range: (0,1).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link TargetVideo} extends {@link TeaModel}
     *
     * <p>TargetVideo</p>
     */
    public static class FilterVideo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delogos")
        private java.util.List<Delogos> delogos;

        @com.aliyun.core.annotation.NameInMap("Desensitization")
        private Desensitization desensitization;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private Float speed;

        @com.aliyun.core.annotation.NameInMap("Watermarks")
        private java.util.List<Watermarks> watermarks;

        private FilterVideo(Builder builder) {
            this.delogos = builder.delogos;
            this.desensitization = builder.desensitization;
            this.speed = builder.speed;
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
        public java.util.List<Delogos> getDelogos() {
            return this.delogos;
        }

        /**
         * @return desensitization
         */
        public Desensitization getDesensitization() {
            return this.desensitization;
        }

        /**
         * @return speed
         */
        public Float getSpeed() {
            return this.speed;
        }

        /**
         * @return watermarks
         */
        public java.util.List<Watermarks> getWatermarks() {
            return this.watermarks;
        }

        public static final class Builder {
            private java.util.List<Delogos> delogos; 
            private Desensitization desensitization; 
            private Float speed; 
            private java.util.List<Watermarks> watermarks; 

            private Builder() {
            } 

            private Builder(FilterVideo model) {
                this.delogos = model.delogos;
                this.desensitization = model.desensitization;
                this.speed = model.speed;
                this.watermarks = model.watermarks;
            } 

            /**
             * <p>Blurs a rectangular area of the video to remove logos, station marks, and similar elements.</p>
             */
            public Builder delogos(java.util.List<Delogos> delogos) {
                this.delogos = delogos;
                return this;
            }

            /**
             * <p>The video desensitization configuration.</p>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <ul>
             * <li>This parameter is applicable only to the CreateMediaConvertTask API.</li>
             * </ul>
             */
            public Builder desensitization(Desensitization desensitization) {
                this.desensitization = desensitization;
                return this;
            }

            /**
             * <p>The video playback speed setting. Value range: [0.5,1.0]. Default value: 1.0.</p>
             * <blockquote>
             * <ul>
             * <li>This is the ratio of the transcoded media file playback speed to the source media file default playback speed, not speed-up transcoding.</li>
             * </ul>
             * </blockquote>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <ul>
             * <li>This parameter is applicable only to the CreateMediaConvertTask API.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder speed(Float speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>The list of video watermarks.</p>
             */
            public Builder watermarks(java.util.List<Watermarks> watermarks) {
                this.watermarks = watermarks;
                return this;
            }

            public FilterVideo build() {
                return new FilterVideo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TargetVideo} extends {@link TeaModel}
     *
     * <p>TargetVideo</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("VideoSlim")
        private Integer videoSlim;

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
            this.videoSlim = builder.videoSlim;
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

        /**
         * @return videoSlim
         */
        public Integer getVideoSlim() {
            return this.videoSlim;
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
            private Integer videoSlim; 

            private Builder() {
            } 

            private Builder(TranscodeVideo model) {
                this.adaptiveResolutionDirection = model.adaptiveResolutionDirection;
                this.bFrames = model.bFrames;
                this.bitrate = model.bitrate;
                this.bitrateOption = model.bitrateOption;
                this.bufferSize = model.bufferSize;
                this.CRF = model.CRF;
                this.codec = model.codec;
                this.frameRate = model.frameRate;
                this.frameRateOption = model.frameRateOption;
                this.GOPSize = model.GOPSize;
                this.maxBitrate = model.maxBitrate;
                this.pixelFormat = model.pixelFormat;
                this.refs = model.refs;
                this.resolution = model.resolution;
                this.resolutionOption = model.resolutionOption;
                this.rotation = model.rotation;
                this.scaleType = model.scaleType;
                this.videoSlim = model.videoSlim;
            } 

            /**
             * <p>Specifies whether to enable adaptive long/short side mode. Valid values:</p>
             * <ul>
             * <li>true: Enabled. The format of the <strong>Resolution</strong> parameter is <code>long side × short side</code>.</li>
             * <li>false (default): Disabled. The format of the <strong>Resolution</strong> parameter is <code>width × height</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder adaptiveResolutionDirection(Boolean adaptiveResolutionDirection) {
                this.adaptiveResolutionDirection = adaptiveResolutionDirection;
                return this;
            }

            /**
             * <p>The number of consecutive B-frames. Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bFrames(Integer bFrames) {
                this.bFrames = bFrames;
                return this;
            }

            /**
             * <p>The video stream bitrate, in bits per second (bit/s).</p>
             * <blockquote>
             * <p>This parameter is mutually exclusive with <strong>CRF</strong>. If both this parameter and <strong>CRF</strong> are empty, encoding is performed with a <strong>CRF</strong> value of 23.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>128000</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The video bitrate option. Valid values:</p>
             * <ul>
             * <li>fixed: Always uses the specified target video bitrate.</li>
             * <li>adaptive: Uses the source video bitrate when it is lower than the specified target video bitrate.</li>
             * <li>fall: Returns a failure when the source video bitrate is lower than the specified target video bitrate.</li>
             * </ul>
             * <p>Default value:</p>
             * <ul>
             * <li>For the CreateMediaConvert API, the default value is fixed.</li>
             * <li>For the GenerateVideoPlaylist API, the default value is adaptive.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter must be set together with the <strong>Bitrate</strong> parameter.</p>
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
             * <p>The decoding buffer size for variable bitrate, in bits per second (bps).</p>
             * <blockquote>
             * <p>This parameter takes effect only when used together with the <strong>CRF</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4000000</p>
             */
            public Builder bufferSize(Integer bufferSize) {
                this.bufferSize = bufferSize;
                return this;
            }

            /**
             * <p>Specifies the constant quality mode. This parameter is mutually exclusive with the <strong>Bitrate</strong> parameter. The value range is [0,51]. A larger value results in lower video quality. The recommended value range is [18,38].</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder CRF(Float CRF) {
                this.CRF = CRF;
                return this;
            }

            /**
             * <p>The video encoding format. Valid values:</p>
             * <ul>
             * <li>For the CreateMediaConvert API: copy (default), h264, h265, vp9.
             * <warning>When this parameter is set to copy, the video streams to be processed are directly copied to the output file, and other parameters under <strong>TranscodeVideo</strong> do not take effect. copy cannot be used for video concatenation and is typically used for container format conversion scenarios.</warning></li>
             * <li>For the GenerateVideoPlaylist API: h264 (default), h265.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>h264</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The video frame rate. The default value is the same as the source video.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder frameRate(Float frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * <p>The frame rate option. Valid values:</p>
             * <ul>
             * <li>fixed: Always uses the specified target video frame rate.</li>
             * <li>adaptive: Uses the source video frame rate when it is lower than the specified target video frame rate.</li>
             * <li>fall: Returns a failure when the source video frame rate is lower than the specified target video frame rate.</li>
             * </ul>
             * <p>Default value:</p>
             * <ul>
             * <li>For the CreateMediaConvert API, the default value is fixed.</li>
             * <li>For the GenerateVideoPlaylist API, the default value is adaptive.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter must be set together with the <strong>FrameRate</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fixed</p>
             */
            public Builder frameRateOption(String frameRateOption) {
                this.frameRateOption = frameRateOption;
                return this;
            }

            /**
             * <p>The number of frames between keyframes. Default value: 150.</p>
             * <blockquote>
             * <p>This parameter is not supported for the GenerateVideoPlaylist API.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder GOPSize(Integer GOPSize) {
                this.GOPSize = GOPSize;
                return this;
            }

            /**
             * <p>The maximum bitrate limit for variable bitrate. When using this parameter, the BufferSize parameter must be specified.</p>
             * <blockquote>
             * <p>This parameter takes effect only when used together with the <strong>CRF</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>128000</p>
             */
            public Builder maxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
                return this;
            }

            /**
             * <p>The pixel format. The default value is the same as the source video. Valid values:</p>
             * <ul>
             * <li>yuv420p</li>
             * <li>yuv422p</li>
             * <li>yuv444p</li>
             * <li>yuv420p10le</li>
             * <li>yuv422p10le</li>
             * <li>yuv444p10le</li>
             * <li>yuva420p</li>
             * </ul>
             * <blockquote>
             * <p>yuva420p is available only for the CreateMediaConvert API, and the <strong>Codec</strong> parameter must be set to vp9.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>yuv420p</p>
             */
            public Builder pixelFormat(String pixelFormat) {
                this.pixelFormat = pixelFormat;
                return this;
            }

            /**
             * <p>The number of reference frames. Default value: 2.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder refs(Integer refs) {
                this.refs = refs;
                return this;
            }

            /**
             * <p>The resolution of the output video in the format of <code>widthxheight</code>. The default value is the same as the playback resolution of the source video. You can specify both width and height, or specify only width or height. You can also use the <strong>AdaptiveResolutionDirection</strong> parameter to specify both long and short sides, or only the long side or short side. The value range for a single side is (0,4096].</p>
             * <ul>
             * <li>Example 1: If <strong>AdaptiveResolutionDirection</strong> is false, <code>1280x720</code> sets the width to 1280 and height to 720. <code>1280x</code> sets the width to 1280 and keeps the height the same as the source video. <code>x720</code> sets the height to 720 and keeps the width the same as the source video.</li>
             * <li>Example 2: If <strong>AdaptiveResolutionDirection</strong> is true, <code>1280x720</code> sets the long side to 1280 and short side to 720. <code>1280x</code> sets the long side to 1280 and keeps the short side the same as the source video. <code>x720</code> sets the short side to 720 and keeps the long side the same as the source video.</li>
             * </ul>
             * <blockquote>
             * <p>If the source video contains rotation information, the width/height and long/short side determination is based on the post-rotation state, which is the playback resolution.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>640x480</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The resolution option. Valid values:</p>
             * <ul>
             * <li>fixed: Always uses the specified target video resolution.</li>
             * <li>adaptive: Uses the source video resolution when the source video resolution area is smaller than the specified target video resolution area.</li>
             * <li>fall: Returns a failure when the source video resolution area is smaller than the specified target video resolution area.</li>
             * </ul>
             * <p>Default value:</p>
             * <ul>
             * <li>For the CreateMediaConvert API, the default value is fixed.</li>
             * <li>For the GenerateVideoPlaylist API, the default value is adaptive.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter must be set together with the <strong>Resolution</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fixed</p>
             */
            public Builder resolutionOption(String resolutionOption) {
                this.resolutionOption = resolutionOption;
                return this;
            }

            /**
             * <p>The clockwise rotation degree of the video. Valid values:</p>
             * <ul>
             * <li>0 (default)</li>
             * <li>90</li>
             * <li>180</li>
             * <li>270</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder rotation(Integer rotation) {
                this.rotation = rotation;
                return this;
            }

            /**
             * <p>The scaling mode. Valid values:</p>
             * <ul>
             * <li>stretch (default): Fixed width/height or long/short sides. Forces scaling and stretches to fill blank areas.</li>
             * <li>crop: Proportional scaling. Scales to the minimum resolution that extends beyond the specified width/height or long/short side rectangle, then center-crops the excess.</li>
             * <li>fill: Proportional scaling. Scales to the maximum resolution within the specified width/height or long/short side rectangle, then fills blank areas with black using center alignment.</li>
             * <li>fit: Proportional scaling. Scales to the maximum resolution within the specified width/height or long/short side rectangle.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter must be set together with the <strong>Resolution</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>crop</p>
             */
            public Builder scaleType(String scaleType) {
                this.scaleType = scaleType;
                return this;
            }

            /**
             * <p>Enables the lightweight HD mode. Valid values:</p>
             * <p>0: Default value. Disabled.</p>
             * <p>1: Uses the lightweight HD mode for transcoding.</p>
             * <blockquote>
             * <p>For optimal results, use the officially recommended Bitrate or CRF parameters for video transcoding encoding with lightweight HD.</p>
             * <p>Notice: Lightweight HD supports only h.264/h.265 formats, only yuv420p, 8-bit depth, and does not support multi-target video transcoding output or video concatenation. For more information, see <a href="https://help.aliyun.com/document_detail/2984556.html">Lightweight HD product introduction</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder videoSlim(Integer videoSlim) {
                this.videoSlim = videoSlim;
                return this;
            }

            public TranscodeVideo build() {
                return new TranscodeVideo(this);
            } 

        } 

    }
}
