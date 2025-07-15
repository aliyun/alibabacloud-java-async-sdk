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
 * {@link DescribeLiveAISubtitleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveAISubtitleResponseBody</p>
 */
public class DescribeLiveAISubtitleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubtitleConfigs")
    private SubtitleConfigs subtitleConfigs;

    private DescribeLiveAISubtitleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subtitleConfigs = builder.subtitleConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAISubtitleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subtitleConfigs
     */
    public SubtitleConfigs getSubtitleConfigs() {
        return this.subtitleConfigs;
    }

    public static final class Builder {
        private String requestId; 
        private SubtitleConfigs subtitleConfigs; 

        private Builder() {
        } 

        private Builder(DescribeLiveAISubtitleResponseBody model) {
            this.requestId = model.requestId;
            this.subtitleConfigs = model.subtitleConfigs;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64- af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the subtitle templates.</p>
         */
        public Builder subtitleConfigs(SubtitleConfigs subtitleConfigs) {
            this.subtitleConfigs = subtitleConfigs;
            return this;
        }

        public DescribeLiveAISubtitleResponseBody build() {
            return new DescribeLiveAISubtitleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveAISubtitleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAISubtitleResponseBody</p>
     */
    public static class PositionNormalized extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Position")
        private java.util.List<Float> position;

        private PositionNormalized(Builder builder) {
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PositionNormalized create() {
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

            private Builder(PositionNormalized model) {
                this.position = model.position;
            } 

            /**
             * Position.
             */
            public Builder position(java.util.List<Float> position) {
                this.position = position;
                return this;
            }

            public PositionNormalized build() {
                return new PositionNormalized(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveAISubtitleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAISubtitleResponseBody</p>
     */
    public static class RulesRefer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RulesId")
        private java.util.List<String> rulesId;

        private RulesRefer(Builder builder) {
            this.rulesId = builder.rulesId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RulesRefer create() {
            return builder().build();
        }

        /**
         * @return rulesId
         */
        public java.util.List<String> getRulesId() {
            return this.rulesId;
        }

        public static final class Builder {
            private java.util.List<String> rulesId; 

            private Builder() {
            } 

            private Builder(RulesRefer model) {
                this.rulesId = model.rulesId;
            } 

            /**
             * RulesId.
             */
            public Builder rulesId(java.util.List<String> rulesId) {
                this.rulesId = rulesId;
                return this;
            }

            public RulesRefer build() {
                return new RulesRefer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveAISubtitleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAISubtitleResponseBody</p>
     */
    public static class SubtitleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgColor")
        private String bgColor;

        @com.aliyun.core.annotation.NameInMap("BgWidthNormalized")
        private Float bgWidthNormalized;

        @com.aliyun.core.annotation.NameInMap("BorderWidthNormalized")
        private Float borderWidthNormalized;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DstLanguage")
        private String dstLanguage;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontName")
        private String fontName;

        @com.aliyun.core.annotation.NameInMap("FontSizeNormalized")
        private String fontSizeNormalized;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("MaxLines")
        private Integer maxLines;

        @com.aliyun.core.annotation.NameInMap("PositionNormalized")
        private PositionNormalized positionNormalized;

        @com.aliyun.core.annotation.NameInMap("RulesRefer")
        private RulesRefer rulesRefer;

        @com.aliyun.core.annotation.NameInMap("ShowSourceLan")
        private Integer showSourceLan;

        @com.aliyun.core.annotation.NameInMap("SrcLanguage")
        private String srcLanguage;

        @com.aliyun.core.annotation.NameInMap("SubtitleId")
        private String subtitleId;

        @com.aliyun.core.annotation.NameInMap("SubtitleName")
        private String subtitleName;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        @com.aliyun.core.annotation.NameInMap("WordPerline")
        private Integer wordPerline;

        private SubtitleConfig(Builder builder) {
            this.bgColor = builder.bgColor;
            this.bgWidthNormalized = builder.bgWidthNormalized;
            this.borderWidthNormalized = builder.borderWidthNormalized;
            this.description = builder.description;
            this.dstLanguage = builder.dstLanguage;
            this.fontColor = builder.fontColor;
            this.fontName = builder.fontName;
            this.fontSizeNormalized = builder.fontSizeNormalized;
            this.height = builder.height;
            this.maxLines = builder.maxLines;
            this.positionNormalized = builder.positionNormalized;
            this.rulesRefer = builder.rulesRefer;
            this.showSourceLan = builder.showSourceLan;
            this.srcLanguage = builder.srcLanguage;
            this.subtitleId = builder.subtitleId;
            this.subtitleName = builder.subtitleName;
            this.width = builder.width;
            this.wordPerline = builder.wordPerline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleConfig create() {
            return builder().build();
        }

        /**
         * @return bgColor
         */
        public String getBgColor() {
            return this.bgColor;
        }

        /**
         * @return bgWidthNormalized
         */
        public Float getBgWidthNormalized() {
            return this.bgWidthNormalized;
        }

        /**
         * @return borderWidthNormalized
         */
        public Float getBorderWidthNormalized() {
            return this.borderWidthNormalized;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dstLanguage
         */
        public String getDstLanguage() {
            return this.dstLanguage;
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
         * @return fontSizeNormalized
         */
        public String getFontSizeNormalized() {
            return this.fontSizeNormalized;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return maxLines
         */
        public Integer getMaxLines() {
            return this.maxLines;
        }

        /**
         * @return positionNormalized
         */
        public PositionNormalized getPositionNormalized() {
            return this.positionNormalized;
        }

        /**
         * @return rulesRefer
         */
        public RulesRefer getRulesRefer() {
            return this.rulesRefer;
        }

        /**
         * @return showSourceLan
         */
        public Integer getShowSourceLan() {
            return this.showSourceLan;
        }

        /**
         * @return srcLanguage
         */
        public String getSrcLanguage() {
            return this.srcLanguage;
        }

        /**
         * @return subtitleId
         */
        public String getSubtitleId() {
            return this.subtitleId;
        }

        /**
         * @return subtitleName
         */
        public String getSubtitleName() {
            return this.subtitleName;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        /**
         * @return wordPerline
         */
        public Integer getWordPerline() {
            return this.wordPerline;
        }

        public static final class Builder {
            private String bgColor; 
            private Float bgWidthNormalized; 
            private Float borderWidthNormalized; 
            private String description; 
            private String dstLanguage; 
            private String fontColor; 
            private String fontName; 
            private String fontSizeNormalized; 
            private String height; 
            private Integer maxLines; 
            private PositionNormalized positionNormalized; 
            private RulesRefer rulesRefer; 
            private Integer showSourceLan; 
            private String srcLanguage; 
            private String subtitleId; 
            private String subtitleName; 
            private String width; 
            private Integer wordPerline; 

            private Builder() {
            } 

            private Builder(SubtitleConfig model) {
                this.bgColor = model.bgColor;
                this.bgWidthNormalized = model.bgWidthNormalized;
                this.borderWidthNormalized = model.borderWidthNormalized;
                this.description = model.description;
                this.dstLanguage = model.dstLanguage;
                this.fontColor = model.fontColor;
                this.fontName = model.fontName;
                this.fontSizeNormalized = model.fontSizeNormalized;
                this.height = model.height;
                this.maxLines = model.maxLines;
                this.positionNormalized = model.positionNormalized;
                this.rulesRefer = model.rulesRefer;
                this.showSourceLan = model.showSourceLan;
                this.srcLanguage = model.srcLanguage;
                this.subtitleId = model.subtitleId;
                this.subtitleName = model.subtitleName;
                this.width = model.width;
                this.wordPerline = model.wordPerline;
            } 

            /**
             * <p>The background color of the subtitles.</p>
             * 
             * <strong>example:</strong>
             * <p>0xFF0000</p>
             */
            public Builder bgColor(String bgColor) {
                this.bgColor = bgColor;
                return this;
            }

            /**
             * <p>The size of the background image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.09</p>
             */
            public Builder bgWidthNormalized(Float bgWidthNormalized) {
                this.bgWidthNormalized = bgWidthNormalized;
                return this;
            }

            /**
             * <p>The font weight.</p>
             * 
             * <strong>example:</strong>
             * <p>0.05</p>
             */
            public Builder borderWidthNormalized(Float borderWidthNormalized) {
                this.borderWidthNormalized = borderWidthNormalized;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>live AI subtitle template</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The language to which the subtitles are translated.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder dstLanguage(String dstLanguage) {
                this.dstLanguage = dstLanguage;
                return this;
            }

            /**
             * <p>The font color.</p>
             * 
             * <strong>example:</strong>
             * <p>0xFFFFFF</p>
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font.</p>
             * 
             * <strong>example:</strong>
             * <p>AlibabaPuHuiTi-Regular</p>
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * <p>The font size.</p>
             * 
             * <strong>example:</strong>
             * <p>0.037</p>
             */
            public Builder fontSizeNormalized(String fontSizeNormalized) {
                this.fontSizeNormalized = fontSizeNormalized;
                return this;
            }

            /**
             * <p>The height of the preview image.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The number of displayed lines.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxLines(Integer maxLines) {
                this.maxLines = maxLines;
                return this;
            }

            /**
             * <p>The position of the subtitles.</p>
             */
            public Builder positionNormalized(PositionNormalized positionNormalized) {
                this.positionNormalized = positionNormalized;
                return this;
            }

            /**
             * <p>The ID of the subtitle rule.</p>
             */
            public Builder rulesRefer(RulesRefer rulesRefer) {
                this.rulesRefer = rulesRefer;
                return this;
            }

            /**
             * <p>Indicates whether the source language of the subtitle is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showSourceLan(Integer showSourceLan) {
                this.showSourceLan = showSourceLan;
                return this;
            }

            /**
             * <p>The source language of the subtitles.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder srcLanguage(String srcLanguage) {
                this.srcLanguage = srcLanguage;
                return this;
            }

            /**
             * <p>The ID of the subtitle template.</p>
             * 
             * <strong>example:</strong>
             * <p>597991f3-6ef9-4100-9238-82951de1****</p>
             */
            public Builder subtitleId(String subtitleId) {
                this.subtitleId = subtitleId;
                return this;
            }

            /**
             * <p>The name of the subtitle template.</p>
             * 
             * <strong>example:</strong>
             * <p>sub1</p>
             */
            public Builder subtitleName(String subtitleName) {
                this.subtitleName = subtitleName;
                return this;
            }

            /**
             * <p>The width of the preview image.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The number of words per line.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder wordPerline(Integer wordPerline) {
                this.wordPerline = wordPerline;
                return this;
            }

            public SubtitleConfig build() {
                return new SubtitleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveAISubtitleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAISubtitleResponseBody</p>
     */
    public static class SubtitleConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubtitleConfig")
        private java.util.List<SubtitleConfig> subtitleConfig;

        private SubtitleConfigs(Builder builder) {
            this.subtitleConfig = builder.subtitleConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleConfigs create() {
            return builder().build();
        }

        /**
         * @return subtitleConfig
         */
        public java.util.List<SubtitleConfig> getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public static final class Builder {
            private java.util.List<SubtitleConfig> subtitleConfig; 

            private Builder() {
            } 

            private Builder(SubtitleConfigs model) {
                this.subtitleConfig = model.subtitleConfig;
            } 

            /**
             * SubtitleConfig.
             */
            public Builder subtitleConfig(java.util.List<SubtitleConfig> subtitleConfig) {
                this.subtitleConfig = subtitleConfig;
                return this;
            }

            public SubtitleConfigs build() {
                return new SubtitleConfigs(this);
            } 

        } 

    }
}
