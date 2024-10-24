// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitProjectTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitProjectTaskRequest</p>
 */
public class SubmitProjectTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("frames")
    private java.util.List < Frames> frames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scaleType")
    private String scaleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subtitleTag")
    private Integer subtitleTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("transparentBackground")
    private Integer transparentBackground;

    private SubmitProjectTaskRequest(Builder builder) {
        super(builder);
        this.frames = builder.frames;
        this.scaleType = builder.scaleType;
        this.subtitleTag = builder.subtitleTag;
        this.transparentBackground = builder.transparentBackground;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitProjectTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return frames
     */
    public java.util.List < Frames> getFrames() {
        return this.frames;
    }

    /**
     * @return scaleType
     */
    public String getScaleType() {
        return this.scaleType;
    }

    /**
     * @return subtitleTag
     */
    public Integer getSubtitleTag() {
        return this.subtitleTag;
    }

    /**
     * @return transparentBackground
     */
    public Integer getTransparentBackground() {
        return this.transparentBackground;
    }

    public static final class Builder extends Request.Builder<SubmitProjectTaskRequest, Builder> {
        private java.util.List < Frames> frames; 
        private String scaleType; 
        private Integer subtitleTag; 
        private Integer transparentBackground; 

        private Builder() {
            super();
        } 

        private Builder(SubmitProjectTaskRequest request) {
            super(request);
            this.frames = request.frames;
            this.scaleType = request.scaleType;
            this.subtitleTag = request.subtitleTag;
            this.transparentBackground = request.transparentBackground;
        } 

        /**
         * <p>frame</p>
         */
        public Builder frames(java.util.List < Frames> frames) {
            this.putBodyParameter("frames", frames);
            this.frames = frames;
            return this;
        }

        /**
         * scaleType.
         */
        public Builder scaleType(String scaleType) {
            this.putBodyParameter("scaleType", scaleType);
            this.scaleType = scaleType;
            return this;
        }

        /**
         * subtitleTag.
         */
        public Builder subtitleTag(Integer subtitleTag) {
            this.putBodyParameter("subtitleTag", subtitleTag);
            this.subtitleTag = subtitleTag;
            return this;
        }

        /**
         * transparentBackground.
         */
        public Builder transparentBackground(Integer transparentBackground) {
            this.putBodyParameter("transparentBackground", transparentBackground);
            this.transparentBackground = transparentBackground;
            return this;
        }

        @Override
        public SubmitProjectTaskRequest build() {
            return new SubmitProjectTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitProjectTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitProjectTaskRequest</p>
     */
    public static class Material extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("speed")
        private String speed;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("volume")
        private Integer volume;

        private Material(Builder builder) {
            this.format = builder.format;
            this.id = builder.id;
            this.speed = builder.speed;
            this.url = builder.url;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Material create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String format; 
            private String id; 
            private String speed; 
            private String url; 
            private Integer volume; 

            /**
             * format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public Material build() {
                return new Material(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitProjectTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitProjectTaskRequest</p>
     */
    public static class Layers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("material")
        private Material material;

        @com.aliyun.core.annotation.NameInMap("positionX")
        private Integer positionX;

        @com.aliyun.core.annotation.NameInMap("positionY")
        private Integer positionY;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("width")
        private Integer width;

        private Layers(Builder builder) {
            this.height = builder.height;
            this.index = builder.index;
            this.material = builder.material;
            this.positionX = builder.positionX;
            this.positionY = builder.positionY;
            this.type = builder.type;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layers create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return material
         */
        public Material getMaterial() {
            return this.material;
        }

        /**
         * @return positionX
         */
        public Integer getPositionX() {
            return this.positionX;
        }

        /**
         * @return positionY
         */
        public Integer getPositionY() {
            return this.positionY;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private Integer index; 
            private Material material; 
            private Integer positionX; 
            private Integer positionY; 
            private String type; 
            private Integer width; 

            /**
             * height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * material.
             */
            public Builder material(Material material) {
                this.material = material;
                return this;
            }

            /**
             * positionX.
             */
            public Builder positionX(Integer positionX) {
                this.positionX = positionX;
                return this;
            }

            /**
             * positionY.
             */
            public Builder positionY(Integer positionY) {
                this.positionY = positionY;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Layers build() {
                return new Layers(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitProjectTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitProjectTaskRequest</p>
     */
    public static class Subtitle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alignment")
        private String alignment;

        @com.aliyun.core.annotation.NameInMap("backgroundColor")
        private String backgroundColor;

        @com.aliyun.core.annotation.NameInMap("font")
        private String font;

        @com.aliyun.core.annotation.NameInMap("fontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("fontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("maxCharLength")
        private Integer maxCharLength;

        @com.aliyun.core.annotation.NameInMap("positionX")
        private Integer positionX;

        @com.aliyun.core.annotation.NameInMap("positionY")
        private Integer positionY;

        @com.aliyun.core.annotation.NameInMap("textHeight")
        private Integer textHeight;

        @com.aliyun.core.annotation.NameInMap("textWidth")
        private Integer textWidth;

        private Subtitle(Builder builder) {
            this.alignment = builder.alignment;
            this.backgroundColor = builder.backgroundColor;
            this.font = builder.font;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.maxCharLength = builder.maxCharLength;
            this.positionX = builder.positionX;
            this.positionY = builder.positionY;
            this.textHeight = builder.textHeight;
            this.textWidth = builder.textWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subtitle create() {
            return builder().build();
        }

        /**
         * @return alignment
         */
        public String getAlignment() {
            return this.alignment;
        }

        /**
         * @return backgroundColor
         */
        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        /**
         * @return font
         */
        public String getFont() {
            return this.font;
        }

        /**
         * @return fontColor
         */
        public String getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return maxCharLength
         */
        public Integer getMaxCharLength() {
            return this.maxCharLength;
        }

        /**
         * @return positionX
         */
        public Integer getPositionX() {
            return this.positionX;
        }

        /**
         * @return positionY
         */
        public Integer getPositionY() {
            return this.positionY;
        }

        /**
         * @return textHeight
         */
        public Integer getTextHeight() {
            return this.textHeight;
        }

        /**
         * @return textWidth
         */
        public Integer getTextWidth() {
            return this.textWidth;
        }

        public static final class Builder {
            private String alignment; 
            private String backgroundColor; 
            private String font; 
            private String fontColor; 
            private Integer fontSize; 
            private Integer maxCharLength; 
            private Integer positionX; 
            private Integer positionY; 
            private Integer textHeight; 
            private Integer textWidth; 

            /**
             * alignment.
             */
            public Builder alignment(String alignment) {
                this.alignment = alignment;
                return this;
            }

            /**
             * backgroundColor.
             */
            public Builder backgroundColor(String backgroundColor) {
                this.backgroundColor = backgroundColor;
                return this;
            }

            /**
             * font.
             */
            public Builder font(String font) {
                this.font = font;
                return this;
            }

            /**
             * fontColor.
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * fontSize.
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * maxCharLength.
             */
            public Builder maxCharLength(Integer maxCharLength) {
                this.maxCharLength = maxCharLength;
                return this;
            }

            /**
             * positionX.
             */
            public Builder positionX(Integer positionX) {
                this.positionX = positionX;
                return this;
            }

            /**
             * positionY.
             */
            public Builder positionY(Integer positionY) {
                this.positionY = positionY;
                return this;
            }

            /**
             * textHeight.
             */
            public Builder textHeight(Integer textHeight) {
                this.textHeight = textHeight;
                return this;
            }

            /**
             * textWidth.
             */
            public Builder textWidth(Integer textWidth) {
                this.textWidth = textWidth;
                return this;
            }

            public Subtitle build() {
                return new Subtitle(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitProjectTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitProjectTaskRequest</p>
     */
    public static class VideoScript extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audioUrl")
        private String audioUrl;

        @com.aliyun.core.annotation.NameInMap("speechOpen")
        private Boolean speechOpen;

        @com.aliyun.core.annotation.NameInMap("speedRate")
        private String speedRate;

        @com.aliyun.core.annotation.NameInMap("textContent")
        private String textContent;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("voiceTemplateId")
        private Long voiceTemplateId;

        @com.aliyun.core.annotation.NameInMap("volume")
        private Integer volume;

        private VideoScript(Builder builder) {
            this.audioUrl = builder.audioUrl;
            this.speechOpen = builder.speechOpen;
            this.speedRate = builder.speedRate;
            this.textContent = builder.textContent;
            this.type = builder.type;
            this.voiceTemplateId = builder.voiceTemplateId;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoScript create() {
            return builder().build();
        }

        /**
         * @return audioUrl
         */
        public String getAudioUrl() {
            return this.audioUrl;
        }

        /**
         * @return speechOpen
         */
        public Boolean getSpeechOpen() {
            return this.speechOpen;
        }

        /**
         * @return speedRate
         */
        public String getSpeedRate() {
            return this.speedRate;
        }

        /**
         * @return textContent
         */
        public String getTextContent() {
            return this.textContent;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return voiceTemplateId
         */
        public Long getVoiceTemplateId() {
            return this.voiceTemplateId;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String audioUrl; 
            private Boolean speechOpen; 
            private String speedRate; 
            private String textContent; 
            private String type; 
            private Long voiceTemplateId; 
            private Integer volume; 

            /**
             * audioUrl.
             */
            public Builder audioUrl(String audioUrl) {
                this.audioUrl = audioUrl;
                return this;
            }

            /**
             * speechOpen.
             */
            public Builder speechOpen(Boolean speechOpen) {
                this.speechOpen = speechOpen;
                return this;
            }

            /**
             * speedRate.
             */
            public Builder speedRate(String speedRate) {
                this.speedRate = speedRate;
                return this;
            }

            /**
             * textContent.
             */
            public Builder textContent(String textContent) {
                this.textContent = textContent;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * voiceTemplateId.
             */
            public Builder voiceTemplateId(Long voiceTemplateId) {
                this.voiceTemplateId = voiceTemplateId;
                return this;
            }

            /**
             * volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public VideoScript build() {
                return new VideoScript(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitProjectTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitProjectTaskRequest</p>
     */
    public static class Frames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("layers")
        private java.util.List < Layers> layers;

        @com.aliyun.core.annotation.NameInMap("subtitle")
        private Subtitle subtitle;

        @com.aliyun.core.annotation.NameInMap("videoScript")
        private VideoScript videoScript;

        private Frames(Builder builder) {
            this.index = builder.index;
            this.layers = builder.layers;
            this.subtitle = builder.subtitle;
            this.videoScript = builder.videoScript;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Frames create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return layers
         */
        public java.util.List < Layers> getLayers() {
            return this.layers;
        }

        /**
         * @return subtitle
         */
        public Subtitle getSubtitle() {
            return this.subtitle;
        }

        /**
         * @return videoScript
         */
        public VideoScript getVideoScript() {
            return this.videoScript;
        }

        public static final class Builder {
            private Integer index; 
            private java.util.List < Layers> layers; 
            private Subtitle subtitle; 
            private VideoScript videoScript; 

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * layers.
             */
            public Builder layers(java.util.List < Layers> layers) {
                this.layers = layers;
                return this;
            }

            /**
             * subtitle.
             */
            public Builder subtitle(Subtitle subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * videoScript.
             */
            public Builder videoScript(VideoScript videoScript) {
                this.videoScript = videoScript;
                return this;
            }

            public Frames build() {
                return new Frames(this);
            } 

        } 

    }
}
