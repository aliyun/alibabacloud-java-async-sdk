// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterComponentsResponseBody</p>
 */
public class DescribeCasterComponentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Components")
    private Components components;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeCasterComponentsResponseBody(Builder builder) {
        this.components = builder.components;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterComponentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return components
     */
    public Components getComponents() {
        return this.components;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Components components; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeCasterComponentsResponseBody model) {
            this.components = model.components;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The components.</p>
         */
        public Builder components(Components components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3be7ade8-d907-483c-b24a-0dad45******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterComponentsResponseBody build() {
            return new DescribeCasterComponentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterComponentsResponseBody</p>
     */
    public static class CaptionLayerContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BorderColor")
        private String borderColor;

        @com.aliyun.core.annotation.NameInMap("BorderWidthNormalized")
        private Float borderWidthNormalized;

        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("FontName")
        private String fontName;

        @com.aliyun.core.annotation.NameInMap("LineSpaceNormalized")
        private Float lineSpaceNormalized;

        @com.aliyun.core.annotation.NameInMap("LocationId")
        private String locationId;

        @com.aliyun.core.annotation.NameInMap("PtsOffset")
        private Integer ptsOffset;

        @com.aliyun.core.annotation.NameInMap("ShowSourceLan")
        private Boolean showSourceLan;

        @com.aliyun.core.annotation.NameInMap("SizeNormalized")
        private Float sizeNormalized;

        @com.aliyun.core.annotation.NameInMap("SourceLan")
        private String sourceLan;

        @com.aliyun.core.annotation.NameInMap("TargetLan")
        private String targetLan;

        @com.aliyun.core.annotation.NameInMap("WordCountPerLine")
        private Integer wordCountPerLine;

        @com.aliyun.core.annotation.NameInMap("WordSpaceNormalized")
        private Float wordSpaceNormalized;

        @com.aliyun.core.annotation.NameInMap("WordsCount")
        private Integer wordsCount;

        private CaptionLayerContent(Builder builder) {
            this.borderColor = builder.borderColor;
            this.borderWidthNormalized = builder.borderWidthNormalized;
            this.color = builder.color;
            this.fontName = builder.fontName;
            this.lineSpaceNormalized = builder.lineSpaceNormalized;
            this.locationId = builder.locationId;
            this.ptsOffset = builder.ptsOffset;
            this.showSourceLan = builder.showSourceLan;
            this.sizeNormalized = builder.sizeNormalized;
            this.sourceLan = builder.sourceLan;
            this.targetLan = builder.targetLan;
            this.wordCountPerLine = builder.wordCountPerLine;
            this.wordSpaceNormalized = builder.wordSpaceNormalized;
            this.wordsCount = builder.wordsCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaptionLayerContent create() {
            return builder().build();
        }

        /**
         * @return borderColor
         */
        public String getBorderColor() {
            return this.borderColor;
        }

        /**
         * @return borderWidthNormalized
         */
        public Float getBorderWidthNormalized() {
            return this.borderWidthNormalized;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return fontName
         */
        public String getFontName() {
            return this.fontName;
        }

        /**
         * @return lineSpaceNormalized
         */
        public Float getLineSpaceNormalized() {
            return this.lineSpaceNormalized;
        }

        /**
         * @return locationId
         */
        public String getLocationId() {
            return this.locationId;
        }

        /**
         * @return ptsOffset
         */
        public Integer getPtsOffset() {
            return this.ptsOffset;
        }

        /**
         * @return showSourceLan
         */
        public Boolean getShowSourceLan() {
            return this.showSourceLan;
        }

        /**
         * @return sizeNormalized
         */
        public Float getSizeNormalized() {
            return this.sizeNormalized;
        }

        /**
         * @return sourceLan
         */
        public String getSourceLan() {
            return this.sourceLan;
        }

        /**
         * @return targetLan
         */
        public String getTargetLan() {
            return this.targetLan;
        }

        /**
         * @return wordCountPerLine
         */
        public Integer getWordCountPerLine() {
            return this.wordCountPerLine;
        }

        /**
         * @return wordSpaceNormalized
         */
        public Float getWordSpaceNormalized() {
            return this.wordSpaceNormalized;
        }

        /**
         * @return wordsCount
         */
        public Integer getWordsCount() {
            return this.wordsCount;
        }

        public static final class Builder {
            private String borderColor; 
            private Float borderWidthNormalized; 
            private String color; 
            private String fontName; 
            private Float lineSpaceNormalized; 
            private String locationId; 
            private Integer ptsOffset; 
            private Boolean showSourceLan; 
            private Float sizeNormalized; 
            private String sourceLan; 
            private String targetLan; 
            private Integer wordCountPerLine; 
            private Float wordSpaceNormalized; 
            private Integer wordsCount; 

            private Builder() {
            } 

            private Builder(CaptionLayerContent model) {
                this.borderColor = model.borderColor;
                this.borderWidthNormalized = model.borderWidthNormalized;
                this.color = model.color;
                this.fontName = model.fontName;
                this.lineSpaceNormalized = model.lineSpaceNormalized;
                this.locationId = model.locationId;
                this.ptsOffset = model.ptsOffset;
                this.showSourceLan = model.showSourceLan;
                this.sizeNormalized = model.sizeNormalized;
                this.sourceLan = model.sourceLan;
                this.targetLan = model.targetLan;
                this.wordCountPerLine = model.wordCountPerLine;
                this.wordSpaceNormalized = model.wordSpaceNormalized;
                this.wordsCount = model.wordsCount;
            } 

            /**
             * <p>The color of the text border.</p>
             * <p>Valid values: <strong>0x000000 to 0xffffff</strong>. If the value of this parameter is &quot;&quot;, this parameter does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>0x000000</p>
             */
            public Builder borderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * <p>The normalized value of the width of the text border. The value of this parameter equals the border width divided by the font size.</p>
             * <p>The maximum width of the text border is <strong>16</strong>, even if the border width calculated based on this parameter is greater than <strong>16</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder borderWidthNormalized(Float borderWidthNormalized) {
                this.borderWidthNormalized = borderWidthNormalized;
                return this;
            }

            /**
             * <p>The color of the text. Valid values: <strong>0x000000 to 0xffffff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0x000000</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The font of the text, which is specified by the system. Valid values:</p>
             * <ul>
             * <li><strong>KaiTi</strong></li>
             * <li><strong>AlibabaPuHuiTi-Regular</strong></li>
             * <li><strong>AlibabaPuHuiTi-Bold</strong></li>
             * <li><strong>NAlibabaPuHuiTi-Light</strong></li>
             * <li><strong>NotoSansHans-Regular</strong></li>
             * <li><strong>NotoSansHans-Bold</strong></li>
             * <li><strong>NotoSansHans-Light</strong></li>
             * </ul>
             * <hr>
             * 
             * <strong>example:</strong>
             * <p>KaiTi</p>
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * <p>The line spacing, which indicates the interval between every two lines.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lineSpaceNormalized(Float lineSpaceNormalized) {
                this.lineSpaceNormalized = lineSpaceNormalized;
                return this;
            }

            /**
             * <p>The location ID of the component. If the value of the ComponentType parameter is caption, the LocationId parameter indicates the channel ID of the video source that is referenced by the component.</p>
             * 
             * <strong>example:</strong>
             * <p>RV01</p>
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * <p>The offset between the presentation timestamps (PTS) of the subtitles and the audio.</p>
             * <p>Valid values: <strong>-10000 to 10000</strong>. Default value: <strong>0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ptsOffset(Integer ptsOffset) {
                this.ptsOffset = ptsOffset;
                return this;
            }

            /**
             * <p>Indicates whether the source language of the subtitles is displayed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The source language is displayed.</li>
             * <li><strong>false</strong>: The source language is not displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder showSourceLan(Boolean showSourceLan) {
                this.showSourceLan = showSourceLan;
                return this;
            }

            /**
             * <p>The normalized value of the font size of the subtitles. The value of this parameter equals the font size divided by the output height.``</p>
             * <p>The maximum font size of the subtitles is <strong>1,024</strong>, even if the font size calculated based on this parameter is greater than <strong>1,024</strong>. If the value of this parameter is <strong>-1</strong>, this parameter does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder sizeNormalized(Float sizeNormalized) {
                this.sizeNormalized = sizeNormalized;
                return this;
            }

            /**
             * <p>The source language of the audio in the video source. Valid values:</p>
             * <ul>
             * <li><strong>en</strong>: English</li>
             * <li><strong>cn</strong>: Chinese</li>
             * <li><strong>es</strong>: Spanish</li>
             * <li><strong>ru</strong>: Russian</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder sourceLan(String sourceLan) {
                this.sourceLan = sourceLan;
                return this;
            }

            /**
             * <p>The target language of the audio in the video source. Valid values:</p>
             * <ul>
             * <li><strong>en</strong>: English</li>
             * <li><strong>cn</strong>: Chinese</li>
             * <li><strong>es</strong>: Spanish</li>
             * <li><strong>ru</strong>: Russian</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder targetLan(String targetLan) {
                this.targetLan = targetLan;
                return this;
            }

            /**
             * <p>The maximum number of words displayed in each line.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder wordCountPerLine(Integer wordCountPerLine) {
                this.wordCountPerLine = wordCountPerLine;
                return this;
            }

            /**
             * <p>The word spacing, which indicates the interval between every two words.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder wordSpaceNormalized(Float wordSpaceNormalized) {
                this.wordSpaceNormalized = wordSpaceNormalized;
                return this;
            }

            /**
             * <p>The number of words displayed on the component. The value of this parameter can be specified based on the font size.</p>
             * <p>Valid values: <strong>10 to 50</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder wordsCount(Integer wordsCount) {
                this.wordsCount = wordsCount;
                return this;
            }

            public CaptionLayerContent build() {
                return new CaptionLayerContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterComponentsResponseBody</p>
     */
    public static class PositionNormalizeds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Position")
        private java.util.List<Float> position;

        private PositionNormalizeds(Builder builder) {
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PositionNormalizeds create() {
            return builder().build();
        }

        /**
         * @return position
         */
        public java.util.List<Float> getPosition() {
            return this.position;
        }

        public static final class Builder {
            private java.util.List<Float> position; 

            private Builder() {
            } 

            private Builder(PositionNormalizeds model) {
                this.position = model.position;
            } 

            /**
             * Position.
             */
            public Builder position(java.util.List<Float> position) {
                this.position = position;
                return this;
            }

            public PositionNormalizeds build() {
                return new PositionNormalizeds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterComponentsResponseBody</p>
     */
    public static class ComponentLayer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeightNormalized")
        private Float heightNormalized;

        @com.aliyun.core.annotation.NameInMap("PositionNormalizeds")
        private PositionNormalizeds positionNormalizeds;

        @com.aliyun.core.annotation.NameInMap("PositionRefer")
        private String positionRefer;

        @com.aliyun.core.annotation.NameInMap("Transparency")
        private Integer transparency;

        @com.aliyun.core.annotation.NameInMap("WidthNormalized")
        private Float widthNormalized;

        private ComponentLayer(Builder builder) {
            this.heightNormalized = builder.heightNormalized;
            this.positionNormalizeds = builder.positionNormalizeds;
            this.positionRefer = builder.positionRefer;
            this.transparency = builder.transparency;
            this.widthNormalized = builder.widthNormalized;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentLayer create() {
            return builder().build();
        }

        /**
         * @return heightNormalized
         */
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        /**
         * @return positionNormalizeds
         */
        public PositionNormalizeds getPositionNormalizeds() {
            return this.positionNormalizeds;
        }

        /**
         * @return positionRefer
         */
        public String getPositionRefer() {
            return this.positionRefer;
        }

        /**
         * @return transparency
         */
        public Integer getTransparency() {
            return this.transparency;
        }

        /**
         * @return widthNormalized
         */
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

        public static final class Builder {
            private Float heightNormalized; 
            private PositionNormalizeds positionNormalizeds; 
            private String positionRefer; 
            private Integer transparency; 
            private Float widthNormalized; 

            private Builder() {
            } 

            private Builder(ComponentLayer model) {
                this.heightNormalized = model.heightNormalized;
                this.positionNormalizeds = model.positionNormalizeds;
                this.positionRefer = model.positionRefer;
                this.transparency = model.transparency;
                this.widthNormalized = model.widthNormalized;
            } 

            /**
             * <p>The normalized value for heights of the elements in the layer. The widths of the elements are proportionally scaled based on this parameter.</p>
             * <p>If the value of this parameter is <strong>0</strong>, the elements in the layer are not scaled.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder heightNormalized(Float heightNormalized) {
                this.heightNormalized = heightNormalized;
                return this;
            }

            /**
             * <p>The normalized value of the position of the layer, in the format of <code>[x,y]</code>. Example: <code>[0,0]</code>.</p>
             * <blockquote>
             * <p> The values of x and y need to be normalized.</p>
             * </blockquote>
             */
            public Builder positionNormalizeds(PositionNormalizeds positionNormalizeds) {
                this.positionNormalizeds = positionNormalizeds;
                return this;
            }

            /**
             * <p>The reference coordinates of the layer. Valid values:</p>
             * <ul>
             * <li><strong>topLeft</strong>: the upper-left corner</li>
             * <li><strong>topRight</strong>: the upper-right corner</li>
             * <li><strong>bottomLeft</strong>: the lower-left corner</li>
             * <li><strong>bottomRight</strong>: the lower-right corner</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>topLeft</p>
             */
            public Builder positionRefer(String positionRefer) {
                this.positionRefer = positionRefer;
                return this;
            }

            /**
             * <p>The transparency of the layer. Valid values: 0 to 255.</p>
             * <p>A value of <strong>0</strong> indicates that the layer is completely transparent. A value of <strong>255</strong> indicates that the layer is completely opaque.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder transparency(Integer transparency) {
                this.transparency = transparency;
                return this;
            }

            /**
             * <p>The normalized value for widths of the elements in the layer. The heights of the elements are proportionally scaled based on this parameter. If the value of this parameter is <strong>0</strong>, the elements in the layer are not scaled.</p>
             * <blockquote>
             * <p> This parameter conflicts with the HeightNormalized parameter. If both of them are specified, only the HeightNormalized parameter takes effect. If only one of them is specified, the latest specified value is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder widthNormalized(Float widthNormalized) {
                this.widthNormalized = widthNormalized;
                return this;
            }

            public ComponentLayer build() {
                return new ComponentLayer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterComponentsResponseBody</p>
     */
    public static class ImageLayerContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaterialId")
        private String materialId;

        private ImageLayerContent(Builder builder) {
            this.materialId = builder.materialId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageLayerContent create() {
            return builder().build();
        }

        /**
         * @return materialId
         */
        public String getMaterialId() {
            return this.materialId;
        }

        public static final class Builder {
            private String materialId; 

            private Builder() {
            } 

            private Builder(ImageLayerContent model) {
                this.materialId = model.materialId;
            } 

            /**
             * <p>The ID of the material from the media library.</p>
             * 
             * <strong>example:</strong>
             * <p>6cf724c6ebfd4a59b5b3cec6f10d****</p>
             */
            public Builder materialId(String materialId) {
                this.materialId = materialId;
                return this;
            }

            public ImageLayerContent build() {
                return new ImageLayerContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterComponentsResponseBody</p>
     */
    public static class TextLayerContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BorderColor")
        private String borderColor;

        @com.aliyun.core.annotation.NameInMap("BorderWidthNormalized")
        private Float borderWidthNormalized;

        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("FontName")
        private String fontName;

        @com.aliyun.core.annotation.NameInMap("SizeNormalized")
        private Float sizeNormalized;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private TextLayerContent(Builder builder) {
            this.borderColor = builder.borderColor;
            this.borderWidthNormalized = builder.borderWidthNormalized;
            this.color = builder.color;
            this.fontName = builder.fontName;
            this.sizeNormalized = builder.sizeNormalized;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextLayerContent create() {
            return builder().build();
        }

        /**
         * @return borderColor
         */
        public String getBorderColor() {
            return this.borderColor;
        }

        /**
         * @return borderWidthNormalized
         */
        public Float getBorderWidthNormalized() {
            return this.borderWidthNormalized;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return fontName
         */
        public String getFontName() {
            return this.fontName;
        }

        /**
         * @return sizeNormalized
         */
        public Float getSizeNormalized() {
            return this.sizeNormalized;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String borderColor; 
            private Float borderWidthNormalized; 
            private String color; 
            private String fontName; 
            private Float sizeNormalized; 
            private String text; 

            private Builder() {
            } 

            private Builder(TextLayerContent model) {
                this.borderColor = model.borderColor;
                this.borderWidthNormalized = model.borderWidthNormalized;
                this.color = model.color;
                this.fontName = model.fontName;
                this.sizeNormalized = model.sizeNormalized;
                this.text = model.text;
            } 

            /**
             * <p>The color of the text border. Valid values: <strong>0x000000 to 0xffffff</strong>. If the value of this parameter is <strong>&quot;&quot;</strong>, this parameter does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>0x000000</p>
             */
            public Builder borderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * <p>The normalized value of the width of the text border. The value of this parameter equals the border width divided by the font size.****</p>
             * <p>The maximum width of the text border is <strong>16</strong>, even if the border width calculated based on this parameter is greater than <strong>16</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder borderWidthNormalized(Float borderWidthNormalized) {
                this.borderWidthNormalized = borderWidthNormalized;
                return this;
            }

            /**
             * <p>The color of the text. Valid values: <strong>0x000000 to 0xffffff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0xff0000</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The font of the text, which is specified by the system. Valid values:</p>
             * <ul>
             * <li><strong>KaiTi</strong></li>
             * <li><strong>AlibabaPuHuiTi-Regular</strong></li>
             * <li><strong>AlibabaPuHuiTi-Bold</strong></li>
             * <li><strong>NAlibabaPuHuiTi-Light</strong></li>
             * <li><strong>NotoSansHans-Regular</strong></li>
             * <li><strong>NotoSansHans-Bold</strong></li>
             * <li><strong>NotoSansHans-Light</strong></li>
             * </ul>
             * <hr>
             * 
             * <strong>example:</strong>
             * <p>KaiTi</p>
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * <p>The normalized value of the font size of the text.</p>
             * <p>The value of this parameter equals the font size divided by the output height.**** The maximum font size of the text is <strong>1,024</strong>, even if the font size calculated based on this parameter is greater than <strong>1,024</strong>. If the value of this parameter is <strong>-1</strong>, this parameter does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder sizeNormalized(Float sizeNormalized) {
                this.sizeNormalized = sizeNormalized;
                return this;
            }

            /**
             * <p>The content of the text.</p>
             * 
             * <strong>example:</strong>
             * <p>hello world</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public TextLayerContent build() {
                return new TextLayerContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterComponentsResponseBody</p>
     */
    public static class Component extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaptionLayerContent")
        private CaptionLayerContent captionLayerContent;

        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentLayer")
        private ComponentLayer componentLayer;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("Effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("ImageLayerContent")
        private ImageLayerContent imageLayerContent;

        @com.aliyun.core.annotation.NameInMap("LocationId")
        private String locationId;

        @com.aliyun.core.annotation.NameInMap("TextLayerContent")
        private TextLayerContent textLayerContent;

        private Component(Builder builder) {
            this.captionLayerContent = builder.captionLayerContent;
            this.componentId = builder.componentId;
            this.componentLayer = builder.componentLayer;
            this.componentName = builder.componentName;
            this.componentType = builder.componentType;
            this.effect = builder.effect;
            this.imageLayerContent = builder.imageLayerContent;
            this.locationId = builder.locationId;
            this.textLayerContent = builder.textLayerContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Component create() {
            return builder().build();
        }

        /**
         * @return captionLayerContent
         */
        public CaptionLayerContent getCaptionLayerContent() {
            return this.captionLayerContent;
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentLayer
         */
        public ComponentLayer getComponentLayer() {
            return this.componentLayer;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return imageLayerContent
         */
        public ImageLayerContent getImageLayerContent() {
            return this.imageLayerContent;
        }

        /**
         * @return locationId
         */
        public String getLocationId() {
            return this.locationId;
        }

        /**
         * @return textLayerContent
         */
        public TextLayerContent getTextLayerContent() {
            return this.textLayerContent;
        }

        public static final class Builder {
            private CaptionLayerContent captionLayerContent; 
            private String componentId; 
            private ComponentLayer componentLayer; 
            private String componentName; 
            private String componentType; 
            private String effect; 
            private ImageLayerContent imageLayerContent; 
            private String locationId; 
            private TextLayerContent textLayerContent; 

            private Builder() {
            } 

            private Builder(Component model) {
                this.captionLayerContent = model.captionLayerContent;
                this.componentId = model.componentId;
                this.componentLayer = model.componentLayer;
                this.componentName = model.componentName;
                this.componentType = model.componentType;
                this.effect = model.effect;
                this.imageLayerContent = model.imageLayerContent;
                this.locationId = model.locationId;
                this.textLayerContent = model.textLayerContent;
            } 

            /**
             * <p>The information about the subtitle component.</p>
             */
            public Builder captionLayerContent(CaptionLayerContent captionLayerContent) {
                this.captionLayerContent = captionLayerContent;
                return this;
            }

            /**
             * <p>The component ID.</p>
             * 
             * <strong>example:</strong>
             * <p>72d2ec7a-4cd7-4a01-974b-7cd53947****</p>
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The information about the component layer, such as the size and layout.</p>
             */
            public Builder componentLayer(ComponentLayer componentLayer) {
                this.componentLayer = componentLayer;
                return this;
            }

            /**
             * <p>The name of the component. By default, the name is the ID of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>component_name</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>The type of the component. Valid values:</p>
             * <ul>
             * <li><strong>text</strong>: a text component</li>
             * <li><strong>image</strong>: an image component</li>
             * <li><strong>caption</strong>: a caption component</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The display effect for the component. Valid values:</p>
             * <ul>
             * <li><strong>none</strong></li>
             * <li><strong>animateH</strong>: horizontal scrolling</li>
             * <li><strong>animateV</strong>: vertical scrolling</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>animateV</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>The information about the image component. This parameter is returned only for image components.</p>
             */
            public Builder imageLayerContent(ImageLayerContent imageLayerContent) {
                this.imageLayerContent = imageLayerContent;
                return this;
            }

            /**
             * <p>The location ID of the component.</p>
             * <p>Each location ID can be assigned to only one component and must be in the RC[Number] format. The values of this parameter are in ascending order, for example, from RC01 to RC12.</p>
             * 
             * <strong>example:</strong>
             * <p>RC01</p>
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * <p>The information about the text component. This parameter is returned only for text components.</p>
             */
            public Builder textLayerContent(TextLayerContent textLayerContent) {
                this.textLayerContent = textLayerContent;
                return this;
            }

            public Component build() {
                return new Component(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterComponentsResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Component")
        private java.util.List<Component> component;

        private Components(Builder builder) {
            this.component = builder.component;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public java.util.List<Component> getComponent() {
            return this.component;
        }

        public static final class Builder {
            private java.util.List<Component> component; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.component = model.component;
            } 

            /**
             * Component.
             */
            public Builder component(java.util.List<Component> component) {
                this.component = component;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
