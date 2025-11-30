// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaConvertJobFeature} extends {@link TeaModel}
 *
 * <p>MediaConvertJobFeature</p>
 */
public class MediaConvertJobFeature extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clip")
    private Clip clip;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, String> metadata;

    @com.aliyun.core.annotation.NameInMap("Watermarks")
    private java.util.List<Watermarks> watermarks;

    private MediaConvertJobFeature(Builder builder) {
        this.clip = builder.clip;
        this.metadata = builder.metadata;
        this.watermarks = builder.watermarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertJobFeature create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clip
     */
    public Clip getClip() {
        return this.clip;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * @return watermarks
     */
    public java.util.List<Watermarks> getWatermarks() {
        return this.watermarks;
    }

    public static final class Builder {
        private Clip clip; 
        private java.util.Map<String, String> metadata; 
        private java.util.List<Watermarks> watermarks; 

        private Builder() {
        } 

        private Builder(MediaConvertJobFeature model) {
            this.clip = model.clip;
            this.metadata = model.metadata;
            this.watermarks = model.watermarks;
        } 

        /**
         * Clip.
         */
        public Builder clip(Clip clip) {
            this.clip = clip;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Watermarks.
         */
        public Builder watermarks(java.util.List<Watermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }

        public MediaConvertJobFeature build() {
            return new MediaConvertJobFeature(this);
        } 

    } 

    /**
     * 
     * {@link MediaConvertJobFeature} extends {@link TeaModel}
     *
     * <p>MediaConvertJobFeature</p>
     */
    public static class TimeSpan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Seek")
        private String seek;

        private TimeSpan(Builder builder) {
            this.duration = builder.duration;
            this.end = builder.end;
            this.seek = builder.seek;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSpan create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return seek
         */
        public String getSeek() {
            return this.seek;
        }

        public static final class Builder {
            private String duration; 
            private String end; 
            private String seek; 

            private Builder() {
            } 

            private Builder(TimeSpan model) {
                this.duration = model.duration;
                this.end = model.end;
                this.seek = model.seek;
            } 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * Seek.
             */
            public Builder seek(String seek) {
                this.seek = seek;
                return this;
            }

            public TimeSpan build() {
                return new TimeSpan(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobFeature} extends {@link TeaModel}
     *
     * <p>MediaConvertJobFeature</p>
     */
    public static class Clip extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigToClipFirstPart")
        private String configToClipFirstPart;

        @com.aliyun.core.annotation.NameInMap("TimeSpan")
        private TimeSpan timeSpan;

        private Clip(Builder builder) {
            this.configToClipFirstPart = builder.configToClipFirstPart;
            this.timeSpan = builder.timeSpan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clip create() {
            return builder().build();
        }

        /**
         * @return configToClipFirstPart
         */
        public String getConfigToClipFirstPart() {
            return this.configToClipFirstPart;
        }

        /**
         * @return timeSpan
         */
        public TimeSpan getTimeSpan() {
            return this.timeSpan;
        }

        public static final class Builder {
            private String configToClipFirstPart; 
            private TimeSpan timeSpan; 

            private Builder() {
            } 

            private Builder(Clip model) {
                this.configToClipFirstPart = model.configToClipFirstPart;
                this.timeSpan = model.timeSpan;
            } 

            /**
             * ConfigToClipFirstPart.
             */
            public Builder configToClipFirstPart(String configToClipFirstPart) {
                this.configToClipFirstPart = configToClipFirstPart;
                return this;
            }

            /**
             * TimeSpan.
             */
            public Builder timeSpan(TimeSpan timeSpan) {
                this.timeSpan = timeSpan;
                return this;
            }

            public Clip build() {
                return new Clip(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobFeature} extends {@link TeaModel}
     *
     * <p>MediaConvertJobFeature</p>
     */
    public static class Watermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adaptive")
        private String adaptive;

        @com.aliyun.core.annotation.NameInMap("BorderColor")
        private String borderColor;

        @com.aliyun.core.annotation.NameInMap("BorderWidth")
        private String borderWidth;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FontAlpha")
        private String fontAlpha;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontName")
        private String fontName;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private String fontSize;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private Watermarks(Builder builder) {
            this.adaptive = builder.adaptive;
            this.borderColor = builder.borderColor;
            this.borderWidth = builder.borderWidth;
            this.content = builder.content;
            this.fontAlpha = builder.fontAlpha;
            this.fontColor = builder.fontColor;
            this.fontName = builder.fontName;
            this.fontSize = builder.fontSize;
            this.height = builder.height;
            this.templateId = builder.templateId;
            this.type = builder.type;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermarks create() {
            return builder().build();
        }

        /**
         * @return adaptive
         */
        public String getAdaptive() {
            return this.adaptive;
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
        public String getBorderWidth() {
            return this.borderWidth;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fontAlpha
         */
        public String getFontAlpha() {
            return this.fontAlpha;
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
        public String getFontSize() {
            return this.fontSize;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
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
        public String getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private String adaptive; 
            private String borderColor; 
            private String borderWidth; 
            private String content; 
            private String fontAlpha; 
            private String fontColor; 
            private String fontName; 
            private String fontSize; 
            private String height; 
            private String templateId; 
            private String type; 
            private String width; 
            private String x; 
            private String y; 

            private Builder() {
            } 

            private Builder(Watermarks model) {
                this.adaptive = model.adaptive;
                this.borderColor = model.borderColor;
                this.borderWidth = model.borderWidth;
                this.content = model.content;
                this.fontAlpha = model.fontAlpha;
                this.fontColor = model.fontColor;
                this.fontName = model.fontName;
                this.fontSize = model.fontSize;
                this.height = model.height;
                this.templateId = model.templateId;
                this.type = model.type;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * Adaptive.
             */
            public Builder adaptive(String adaptive) {
                this.adaptive = adaptive;
                return this;
            }

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
            public Builder borderWidth(String borderWidth) {
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
             * FontAlpha.
             */
            public Builder fontAlpha(String fontAlpha) {
                this.fontAlpha = fontAlpha;
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
            public Builder fontSize(String fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
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
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public Watermarks build() {
                return new Watermarks(this);
            } 

        } 

    }
}
