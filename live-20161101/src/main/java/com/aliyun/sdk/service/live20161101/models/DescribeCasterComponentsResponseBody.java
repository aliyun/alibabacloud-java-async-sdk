// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterComponentsResponseBody</p>
 */
public class DescribeCasterComponentsResponseBody extends TeaModel {
    @NameInMap("Components")
    private Components components;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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

        /**
         * Components.
         */
        public Builder components(Components components) {
            this.components = components;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterComponentsResponseBody build() {
            return new DescribeCasterComponentsResponseBody(this);
        } 

    } 

    public static class CaptionLayerContent extends TeaModel {
        @NameInMap("BorderColor")
        private String borderColor;

        @NameInMap("BorderWidthNormalized")
        private Float borderWidthNormalized;

        @NameInMap("Color")
        private String color;

        @NameInMap("FontName")
        private String fontName;

        @NameInMap("LineSpaceNormalized")
        private Float lineSpaceNormalized;

        @NameInMap("LocationId")
        private String locationId;

        @NameInMap("PtsOffset")
        private Integer ptsOffset;

        @NameInMap("ShowSourceLan")
        private Boolean showSourceLan;

        @NameInMap("SizeNormalized")
        private Float sizeNormalized;

        @NameInMap("SourceLan")
        private String sourceLan;

        @NameInMap("TargetLan")
        private String targetLan;

        @NameInMap("WordCountPerLine")
        private Integer wordCountPerLine;

        @NameInMap("WordSpaceNormalized")
        private Float wordSpaceNormalized;

        @NameInMap("WordsCount")
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

            /**
             * BorderColor.
             */
            public Builder borderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * BorderWidthNormalized.
             */
            public Builder borderWidthNormalized(Float borderWidthNormalized) {
                this.borderWidthNormalized = borderWidthNormalized;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
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
             * LineSpaceNormalized.
             */
            public Builder lineSpaceNormalized(Float lineSpaceNormalized) {
                this.lineSpaceNormalized = lineSpaceNormalized;
                return this;
            }

            /**
             * LocationId.
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * PtsOffset.
             */
            public Builder ptsOffset(Integer ptsOffset) {
                this.ptsOffset = ptsOffset;
                return this;
            }

            /**
             * ShowSourceLan.
             */
            public Builder showSourceLan(Boolean showSourceLan) {
                this.showSourceLan = showSourceLan;
                return this;
            }

            /**
             * SizeNormalized.
             */
            public Builder sizeNormalized(Float sizeNormalized) {
                this.sizeNormalized = sizeNormalized;
                return this;
            }

            /**
             * SourceLan.
             */
            public Builder sourceLan(String sourceLan) {
                this.sourceLan = sourceLan;
                return this;
            }

            /**
             * TargetLan.
             */
            public Builder targetLan(String targetLan) {
                this.targetLan = targetLan;
                return this;
            }

            /**
             * WordCountPerLine.
             */
            public Builder wordCountPerLine(Integer wordCountPerLine) {
                this.wordCountPerLine = wordCountPerLine;
                return this;
            }

            /**
             * WordSpaceNormalized.
             */
            public Builder wordSpaceNormalized(Float wordSpaceNormalized) {
                this.wordSpaceNormalized = wordSpaceNormalized;
                return this;
            }

            /**
             * WordsCount.
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
    public static class PositionNormalizeds extends TeaModel {
        @NameInMap("Position")
        private java.util.List < Float > position;

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
        public java.util.List < Float > getPosition() {
            return this.position;
        }

        public static final class Builder {
            private java.util.List < Float > position; 

            /**
             * Position.
             */
            public Builder position(java.util.List < Float > position) {
                this.position = position;
                return this;
            }

            public PositionNormalizeds build() {
                return new PositionNormalizeds(this);
            } 

        } 

    }
    public static class ComponentLayer extends TeaModel {
        @NameInMap("HeightNormalized")
        private Float heightNormalized;

        @NameInMap("PositionNormalizeds")
        private PositionNormalizeds positionNormalizeds;

        @NameInMap("PositionRefer")
        private String positionRefer;

        @NameInMap("Transparency")
        private Integer transparency;

        @NameInMap("WidthNormalized")
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

            /**
             * HeightNormalized.
             */
            public Builder heightNormalized(Float heightNormalized) {
                this.heightNormalized = heightNormalized;
                return this;
            }

            /**
             * PositionNormalizeds.
             */
            public Builder positionNormalizeds(PositionNormalizeds positionNormalizeds) {
                this.positionNormalizeds = positionNormalizeds;
                return this;
            }

            /**
             * PositionRefer.
             */
            public Builder positionRefer(String positionRefer) {
                this.positionRefer = positionRefer;
                return this;
            }

            /**
             * Transparency.
             */
            public Builder transparency(Integer transparency) {
                this.transparency = transparency;
                return this;
            }

            /**
             * WidthNormalized.
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
    public static class ImageLayerContent extends TeaModel {
        @NameInMap("MaterialId")
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

            /**
             * MaterialId.
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
    public static class TextLayerContent extends TeaModel {
        @NameInMap("BorderColor")
        private String borderColor;

        @NameInMap("BorderWidthNormalized")
        private Float borderWidthNormalized;

        @NameInMap("Color")
        private String color;

        @NameInMap("FontName")
        private String fontName;

        @NameInMap("SizeNormalized")
        private Float sizeNormalized;

        @NameInMap("Text")
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

            /**
             * BorderColor.
             */
            public Builder borderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * BorderWidthNormalized.
             */
            public Builder borderWidthNormalized(Float borderWidthNormalized) {
                this.borderWidthNormalized = borderWidthNormalized;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
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
             * SizeNormalized.
             */
            public Builder sizeNormalized(Float sizeNormalized) {
                this.sizeNormalized = sizeNormalized;
                return this;
            }

            /**
             * Text.
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
    public static class Component extends TeaModel {
        @NameInMap("CaptionLayerContent")
        private CaptionLayerContent captionLayerContent;

        @NameInMap("ComponentId")
        private String componentId;

        @NameInMap("ComponentLayer")
        private ComponentLayer componentLayer;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("ComponentType")
        private String componentType;

        @NameInMap("Effect")
        private String effect;

        @NameInMap("ImageLayerContent")
        private ImageLayerContent imageLayerContent;

        @NameInMap("LocationId")
        private String locationId;

        @NameInMap("TextLayerContent")
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

            /**
             * CaptionLayerContent.
             */
            public Builder captionLayerContent(CaptionLayerContent captionLayerContent) {
                this.captionLayerContent = captionLayerContent;
                return this;
            }

            /**
             * ComponentId.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * ComponentLayer.
             */
            public Builder componentLayer(ComponentLayer componentLayer) {
                this.componentLayer = componentLayer;
                return this;
            }

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * Effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * ImageLayerContent.
             */
            public Builder imageLayerContent(ImageLayerContent imageLayerContent) {
                this.imageLayerContent = imageLayerContent;
                return this;
            }

            /**
             * LocationId.
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * TextLayerContent.
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
    public static class Components extends TeaModel {
        @NameInMap("Component")
        private java.util.List < Component> component;

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
        public java.util.List < Component> getComponent() {
            return this.component;
        }

        public static final class Builder {
            private java.util.List < Component> component; 

            /**
             * Component.
             */
            public Builder component(java.util.List < Component> component) {
                this.component = component;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
