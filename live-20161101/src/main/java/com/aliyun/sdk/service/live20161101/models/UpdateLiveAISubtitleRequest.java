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
 * {@link UpdateLiveAISubtitleRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveAISubtitleRequest</p>
 */
public class UpdateLiveAISubtitleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgColor")
    private String bgColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgWidthNormalized")
    private Float bgWidthNormalized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BorderWidthNormalized")
    private Float borderWidthNormalized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstLanguage")
    private String dstLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FontColor")
    private String fontColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FontName")
    private String fontName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FontSizeNormalized")
    private Float fontSizeNormalized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Height")
    private String height;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxLines")
    private Integer maxLines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PositionNormalized")
    private java.util.List<Float> positionNormalized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSourceLan")
    private Boolean showSourceLan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcLanguage")
    private String srcLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subtitleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleName")
    private String subtitleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Width")
    private String width;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WordPerLine")
    private Integer wordPerLine;

    private UpdateLiveAISubtitleRequest(Builder builder) {
        super(builder);
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
        this.ownerId = builder.ownerId;
        this.positionNormalized = builder.positionNormalized;
        this.regionId = builder.regionId;
        this.showSourceLan = builder.showSourceLan;
        this.srcLanguage = builder.srcLanguage;
        this.subtitleId = builder.subtitleId;
        this.subtitleName = builder.subtitleName;
        this.width = builder.width;
        this.wordPerLine = builder.wordPerLine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveAISubtitleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Float getFontSizeNormalized() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return positionNormalized
     */
    public java.util.List<Float> getPositionNormalized() {
        return this.positionNormalized;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return showSourceLan
     */
    public Boolean getShowSourceLan() {
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
     * @return wordPerLine
     */
    public Integer getWordPerLine() {
        return this.wordPerLine;
    }

    public static final class Builder extends Request.Builder<UpdateLiveAISubtitleRequest, Builder> {
        private String bgColor; 
        private Float bgWidthNormalized; 
        private Float borderWidthNormalized; 
        private String description; 
        private String dstLanguage; 
        private String fontColor; 
        private String fontName; 
        private Float fontSizeNormalized; 
        private String height; 
        private Integer maxLines; 
        private Long ownerId; 
        private java.util.List<Float> positionNormalized; 
        private String regionId; 
        private Boolean showSourceLan; 
        private String srcLanguage; 
        private String subtitleId; 
        private String subtitleName; 
        private String width; 
        private Integer wordPerLine; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveAISubtitleRequest request) {
            super(request);
            this.bgColor = request.bgColor;
            this.bgWidthNormalized = request.bgWidthNormalized;
            this.borderWidthNormalized = request.borderWidthNormalized;
            this.description = request.description;
            this.dstLanguage = request.dstLanguage;
            this.fontColor = request.fontColor;
            this.fontName = request.fontName;
            this.fontSizeNormalized = request.fontSizeNormalized;
            this.height = request.height;
            this.maxLines = request.maxLines;
            this.ownerId = request.ownerId;
            this.positionNormalized = request.positionNormalized;
            this.regionId = request.regionId;
            this.showSourceLan = request.showSourceLan;
            this.srcLanguage = request.srcLanguage;
            this.subtitleId = request.subtitleId;
            this.subtitleName = request.subtitleName;
            this.width = request.width;
            this.wordPerLine = request.wordPerLine;
        } 

        /**
         * <p>The background color of the subtitles. Color format: RGBA.</p>
         * 
         * <strong>example:</strong>
         * <p>0xFF0000</p>
         */
        public Builder bgColor(String bgColor) {
            this.putQueryParameter("BgColor", bgColor);
            this.bgColor = bgColor;
            return this;
        }

        /**
         * <p>The size of the background box. Valid values: [0,1].</p>
         * 
         * <strong>example:</strong>
         * <p>0.09</p>
         */
        public Builder bgWidthNormalized(Float bgWidthNormalized) {
            this.putQueryParameter("BgWidthNormalized", bgWidthNormalized);
            this.bgWidthNormalized = bgWidthNormalized;
            return this;
        }

        /**
         * <p>The font weight. Valid values: [0,1].</p>
         * 
         * <strong>example:</strong>
         * <p>0.05</p>
         */
        public Builder borderWidthNormalized(Float borderWidthNormalized) {
            this.putQueryParameter("BorderWidthNormalized", borderWidthNormalized);
            this.borderWidthNormalized = borderWidthNormalized;
            return this;
        }

        /**
         * <p>The description of the subtitle template. The description can be up to 128 characters in length and can contain letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>live AI subtitle template</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The target language. Valid values:</p>
         * <ul>
         * <li>en-US: English</li>
         * <li>zh-CN: Chinese</li>
         * <li>es-ES: Spanish</li>
         * <li>ru-RU: Russian</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder dstLanguage(String dstLanguage) {
            this.putQueryParameter("DstLanguage", dstLanguage);
            this.dstLanguage = dstLanguage;
            return this;
        }

        /**
         * <p>The font color. Color format: RGBA.</p>
         * 
         * <strong>example:</strong>
         * <p>0xFFFFFF</p>
         */
        public Builder fontColor(String fontColor) {
            this.putQueryParameter("FontColor", fontColor);
            this.fontColor = fontColor;
            return this;
        }

        /**
         * <p>The font. Valid values:</p>
         * <ul>
         * <li>KaiTi (default)</li>
         * <li>AlibabaPuHuiTi-Regular</li>
         * <li>AlibabaPuHuiTi-Bold</li>
         * <li>AlibabaPuHuiTi-Light</li>
         * <li>NotoSansHans-Regular</li>
         * <li>NotoSansHans-Bold</li>
         * <li>NotoSansHans-Light</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KaiTi</p>
         */
        public Builder fontName(String fontName) {
            this.putQueryParameter("FontName", fontName);
            this.fontName = fontName;
            return this;
        }

        /**
         * <p>The font size. Valid values: [0,1].</p>
         * 
         * <strong>example:</strong>
         * <p>0.037</p>
         */
        public Builder fontSizeNormalized(Float fontSizeNormalized) {
            this.putQueryParameter("FontSizeNormalized", fontSizeNormalized);
            this.fontSizeNormalized = fontSizeNormalized;
            return this;
        }

        /**
         * <p>The height of the preview. Unit: pixels.</p>
         * <p>The following preview specifications (width x height) are supported:</p>
         * <ul>
         * <li>360p (640 x 360)</li>
         * <li>360p (360 x 640)</li>
         * <li>480p (854 x 480)</li>
         * <li>480p (480 x 854)</li>
         * <li>720p (1280 x 720)</li>
         * <li>720p (720 x 1280)</li>
         * <li>1080p (1920 x 1080)</li>
         * <li>1080p (1080 x 1920)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder height(String height) {
            this.putQueryParameter("Height", height);
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
            this.putQueryParameter("MaxLines", maxLines);
            this.maxLines = maxLines;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The position of the subtitles relative to the lower-left corner of the screen. The value is a pair of coordinates.</p>
         */
        public Builder positionNormalized(java.util.List<Float> positionNormalized) {
            String positionNormalizedShrink = shrink(positionNormalized, "PositionNormalized", "json");
            this.putQueryParameter("PositionNormalized", positionNormalizedShrink);
            this.positionNormalized = positionNormalized;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to display the source language. Valid values: true and false. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showSourceLan(Boolean showSourceLan) {
            this.putQueryParameter("ShowSourceLan", showSourceLan);
            this.showSourceLan = showSourceLan;
            return this;
        }

        /**
         * <p>The source language. Valid values:</p>
         * <ul>
         * <li>en-US: English</li>
         * <li>zh-CN: Chinese</li>
         * <li>ru-RU: Russian</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder srcLanguage(String srcLanguage) {
            this.putQueryParameter("SrcLanguage", srcLanguage);
            this.srcLanguage = srcLanguage;
            return this;
        }

        /**
         * <p>The ID of the subtitle template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>597991f3-6ef9-4100-9238-82951de1****</p>
         */
        public Builder subtitleId(String subtitleId) {
            this.putQueryParameter("SubtitleId", subtitleId);
            this.subtitleId = subtitleId;
            return this;
        }

        /**
         * <p>The name of the subtitle template. The name can contain digits, letters, and hyphens (-) but cannot start with a hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>live AI subtitle template</p>
         */
        public Builder subtitleName(String subtitleName) {
            this.putQueryParameter("SubtitleName", subtitleName);
            this.subtitleName = subtitleName;
            return this;
        }

        /**
         * <p>The width of the preview. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        public Builder width(String width) {
            this.putQueryParameter("Width", width);
            this.width = width;
            return this;
        }

        /**
         * <p>The number of characters per line. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder wordPerLine(Integer wordPerLine) {
            this.putQueryParameter("WordPerLine", wordPerLine);
            this.wordPerLine = wordPerLine;
            return this;
        }

        @Override
        public UpdateLiveAISubtitleRequest build() {
            return new UpdateLiveAISubtitleRequest(this);
        } 

    } 

}
