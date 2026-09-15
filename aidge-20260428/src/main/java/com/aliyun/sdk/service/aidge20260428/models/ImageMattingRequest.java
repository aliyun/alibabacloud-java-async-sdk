// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link ImageMattingRequest} extends {@link RequestModel}
 *
 * <p>ImageMattingRequest</p>
 */
public class ImageMattingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackGroundType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backGroundType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgColor")
    private String bgColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetHeight")
    private Integer targetHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetWidth")
    private Integer targetWidth;

    private ImageMattingRequest(Builder builder) {
        super(builder);
        this.backGroundType = builder.backGroundType;
        this.bgColor = builder.bgColor;
        this.imageUrl = builder.imageUrl;
        this.targetHeight = builder.targetHeight;
        this.targetWidth = builder.targetWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageMattingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backGroundType
     */
    public String getBackGroundType() {
        return this.backGroundType;
    }

    /**
     * @return bgColor
     */
    public String getBgColor() {
        return this.bgColor;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return targetHeight
     */
    public Integer getTargetHeight() {
        return this.targetHeight;
    }

    /**
     * @return targetWidth
     */
    public Integer getTargetWidth() {
        return this.targetWidth;
    }

    public static final class Builder extends Request.Builder<ImageMattingRequest, Builder> {
        private String backGroundType; 
        private String bgColor; 
        private String imageUrl; 
        private Integer targetHeight; 
        private Integer targetWidth; 

        private Builder() {
            super();
        } 

        private Builder(ImageMattingRequest request) {
            super(request);
            this.backGroundType = request.backGroundType;
            this.bgColor = request.bgColor;
            this.imageUrl = request.imageUrl;
            this.targetHeight = request.targetHeight;
            this.targetWidth = request.targetWidth;
        } 

        /**
         * <p>Specifies the background type of the returned image. Valid values:</p>
         * <ul>
         * <li>WHITE_BACKGROUND: white background.</li>
         * <li>TRANSPARENT: transparent background.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WHITE_BACKGROUND</p>
         */
        public Builder backGroundType(String backGroundType) {
            this.putQueryParameter("BackGroundType", backGroundType);
            this.backGroundType = backGroundType;
            return this;
        }

        /**
         * <p>BGColor</p>
         * 
         * <strong>example:</strong>
         * <p>255,255,255</p>
         */
        public Builder bgColor(String bgColor) {
            this.putQueryParameter("BgColor", bgColor);
            this.bgColor = bgColor;
            return this;
        }

        /**
         * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 and 3000 × 3000 pixels. The file size cannot exceed 10 MB.<br><strong>Example</strong>: <code>&quot;https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg&quot;</code></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sc02.alicdn.com/kf/H09364d2c7fc942e685d3b0f656261b24Q.png">https://sc02.alicdn.com/kf/H09364d2c7fc942e685d3b0f656261b24Q.png</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The target image height in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder targetHeight(Integer targetHeight) {
            this.putQueryParameter("TargetHeight", targetHeight);
            this.targetHeight = targetHeight;
            return this;
        }

        /**
         * <p>The target image width in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder targetWidth(Integer targetWidth) {
            this.putQueryParameter("TargetWidth", targetWidth);
            this.targetWidth = targetWidth;
            return this;
        }

        @Override
        public ImageMattingRequest build() {
            return new ImageMattingRequest(this);
        } 

    } 

}
