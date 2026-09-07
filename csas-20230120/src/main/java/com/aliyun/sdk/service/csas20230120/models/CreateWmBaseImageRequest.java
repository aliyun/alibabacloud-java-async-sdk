// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateWmBaseImageRequest} extends {@link RequestModel}
 *
 * <p>CreateWmBaseImageRequest</p>
 */
public class CreateWmBaseImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Height")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 100)
    private Integer height;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageControl")
    private ImageControl imageControl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Opacity")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 255, minimum = 1)
    private Integer opacity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scale")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 3, minimum = 1)
    private Integer scale;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Width")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 100)
    private Integer width;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoBytesB64")
    @com.aliyun.core.annotation.Validation(maxLength = 400)
    private String wmInfoBytesB64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoSize")
    private Long wmInfoSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoUint")
    private String wmInfoUint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    private CreateWmBaseImageRequest(Builder builder) {
        super(builder);
        this.height = builder.height;
        this.imageControl = builder.imageControl;
        this.opacity = builder.opacity;
        this.scale = builder.scale;
        this.width = builder.width;
        this.wmInfoBytesB64 = builder.wmInfoBytesB64;
        this.wmInfoSize = builder.wmInfoSize;
        this.wmInfoUint = builder.wmInfoUint;
        this.wmType = builder.wmType;
        this.comment = builder.comment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWmBaseImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return imageControl
     */
    public ImageControl getImageControl() {
        return this.imageControl;
    }

    /**
     * @return opacity
     */
    public Integer getOpacity() {
        return this.opacity;
    }

    /**
     * @return scale
     */
    public Integer getScale() {
        return this.scale;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    /**
     * @return wmInfoBytesB64
     */
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    /**
     * @return wmInfoSize
     */
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    /**
     * @return wmInfoUint
     */
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    /**
     * @return wmType
     */
    public String getWmType() {
        return this.wmType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    public static final class Builder extends Request.Builder<CreateWmBaseImageRequest, Builder> {
        private Integer height; 
        private ImageControl imageControl; 
        private Integer opacity; 
        private Integer scale; 
        private Integer width; 
        private String wmInfoBytesB64; 
        private Long wmInfoSize; 
        private String wmInfoUint; 
        private String wmType; 
        private String comment; 

        private Builder() {
            super();
        } 

        private Builder(CreateWmBaseImageRequest request) {
            super(request);
            this.height = request.height;
            this.imageControl = request.imageControl;
            this.opacity = request.opacity;
            this.scale = request.scale;
            this.width = request.width;
            this.wmInfoBytesB64 = request.wmInfoBytesB64;
            this.wmInfoSize = request.wmInfoSize;
            this.wmInfoUint = request.wmInfoUint;
            this.wmType = request.wmType;
            this.comment = request.comment;
        } 

        /**
         * <p>The height of the watermark image, in pixels. Valid values: 100 to 5000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        public Builder height(Integer height) {
            this.putBodyParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * <p>The image watermark control parameters.</p>
         */
        public Builder imageControl(ImageControl imageControl) {
            String imageControlShrink = shrink(imageControl, "ImageControl", "json");
            this.putBodyParameter("ImageControl", imageControlShrink);
            this.imageControl = imageControl;
            return this;
        }

        /**
         * <p>The opacity of the watermark image. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        public Builder opacity(Integer opacity) {
            this.putBodyParameter("Opacity", opacity);
            this.opacity = opacity;
            return this;
        }

        /**
         * <p>The scaling ratio of the watermark image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scale(Integer scale) {
            this.putBodyParameter("Scale", scale);
            this.scale = scale;
            return this;
        }

        /**
         * <p>The width of the watermark image, in pixels. Valid values: 100 to 5000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        public Builder width(Integer width) {
            this.putBodyParameter("Width", width);
            this.width = width;
            return this;
        }

        /**
         * <p>The watermark information in Base64-encoded string format. The length is 1 to 300 characters. If this parameter is set, the WmInfoUint parameter cannot be set.</p>
         * 
         * <strong>example:</strong>
         * <p>aGVsbG8gc2F*****</p>
         */
        public Builder wmInfoBytesB64(String wmInfoBytesB64) {
            this.putBodyParameter("WmInfoBytesB64", wmInfoBytesB64);
            this.wmInfoBytesB64 = wmInfoBytesB64;
            return this;
        }

        /**
         * <p>The bit width of the watermark information capacity. Default value: 32. This parameter must be consistent between embedding and extraction. For example, if the SDK used for embedding is 40-bit, set this parameter to 40 during extraction as well.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder wmInfoSize(Long wmInfoSize) {
            this.putBodyParameter("WmInfoSize", wmInfoSize);
            this.wmInfoSize = wmInfoSize;
            return this;
        }

        /**
         * <p>The watermark information in decimal number format. If this parameter is set, WmInfoBytesB64 cannot be set.</p>
         * <p>The valid range depends on the WmInfoSize parameter:</p>
         * <ul>
         * <li><p>If WmInfoSize is <strong>32</strong>, the valid range is 1 to 4294967295.</p>
         * </li>
         * <li><p>If WmInfoSize is <strong>40</strong>, the valid range is 1 to 1099511627775.</p>
         * </li>
         * <li><p>If WmInfoSize is <strong>64</strong>, the valid range is 1 to 18446744073709551615.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12*****</p>
         */
        public Builder wmInfoUint(String wmInfoUint) {
            this.putBodyParameter("WmInfoUint", wmInfoUint);
            this.wmInfoUint = wmInfoUint;
            return this;
        }

        /**
         * <p>The watermark type. Valid values:</p>
         * <ul>
         * <li><strong>PureWebappInvisible</strong>: web watermark.</li>
         * <li><strong>PureAppInvisible</strong>: App watermark.</li>
         * <li><strong>PureScreenInvisible</strong>: screen watermark.</li>
         * <li><strong>AigcWebappInvisible</strong>: AIGC web watermark.</li>
         * <li><strong>AigcAppInvisible</strong>: AIGC App watermark.</li>
         * <li><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PureWebappInvisible</p>
         */
        public Builder wmType(String wmType) {
            this.putBodyParameter("WmType", wmType);
            this.wmType = wmType;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Remarks</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        @Override
        public CreateWmBaseImageRequest build() {
            return new CreateWmBaseImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWmBaseImageRequest} extends {@link TeaModel}
     *
     * <p>CreateWmBaseImageRequest</p>
     */
    public static class Margin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        private Float bottom;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Float left;

        @com.aliyun.core.annotation.NameInMap("Right")
        private Float right;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Float top;

        private Margin(Builder builder) {
            this.bottom = builder.bottom;
            this.left = builder.left;
            this.right = builder.right;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Margin create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public Float getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public Float getLeft() {
            return this.left;
        }

        /**
         * @return right
         */
        public Float getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public Float getTop() {
            return this.top;
        }

        public static final class Builder {
            private Float bottom; 
            private Float left; 
            private Float right; 
            private Float top; 

            private Builder() {
            } 

            private Builder(Margin model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * <p>Takes effect when Mode is set to bottom-left or bottom-right. The bottom margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bottom(Float bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to top-left or bottom-left. The left margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder left(Float left) {
                this.left = left;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to top-right or bottom-right. The right margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder right(Float right) {
                this.right = right;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to top-left or top-right. The top margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder top(Float top) {
                this.top = top;
                return this;
            }

            public Margin build() {
                return new Margin(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmBaseImageRequest} extends {@link TeaModel}
     *
     * <p>CreateWmBaseImageRequest</p>
     */
    public static class LogoVisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("Enhance")
        private Boolean enhance;

        @com.aliyun.core.annotation.NameInMap("LogoBase64")
        private String logoBase64;

        @com.aliyun.core.annotation.NameInMap("Margin")
        private Margin margin;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Opacity")
        private Integer opacity;

        @com.aliyun.core.annotation.NameInMap("PosAx")
        private Float posAx;

        @com.aliyun.core.annotation.NameInMap("PosAy")
        private Float posAy;

        @com.aliyun.core.annotation.NameInMap("PosX")
        private Long posX;

        @com.aliyun.core.annotation.NameInMap("PosY")
        private Long posY;

        @com.aliyun.core.annotation.NameInMap("SpaceX")
        private Long spaceX;

        @com.aliyun.core.annotation.NameInMap("SpaceY")
        private Long spaceY;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Boolean visible;

        private LogoVisibleControl(Builder builder) {
            this.angle = builder.angle;
            this.enhance = builder.enhance;
            this.logoBase64 = builder.logoBase64;
            this.margin = builder.margin;
            this.mode = builder.mode;
            this.opacity = builder.opacity;
            this.posAx = builder.posAx;
            this.posAy = builder.posAy;
            this.posX = builder.posX;
            this.posY = builder.posY;
            this.spaceX = builder.spaceX;
            this.spaceY = builder.spaceY;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoVisibleControl create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Long getAngle() {
            return this.angle;
        }

        /**
         * @return enhance
         */
        public Boolean getEnhance() {
            return this.enhance;
        }

        /**
         * @return logoBase64
         */
        public String getLogoBase64() {
            return this.logoBase64;
        }

        /**
         * @return margin
         */
        public Margin getMargin() {
            return this.margin;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return opacity
         */
        public Integer getOpacity() {
            return this.opacity;
        }

        /**
         * @return posAx
         */
        public Float getPosAx() {
            return this.posAx;
        }

        /**
         * @return posAy
         */
        public Float getPosAy() {
            return this.posAy;
        }

        /**
         * @return posX
         */
        public Long getPosX() {
            return this.posX;
        }

        /**
         * @return posY
         */
        public Long getPosY() {
            return this.posY;
        }

        /**
         * @return spaceX
         */
        public Long getSpaceX() {
            return this.spaceX;
        }

        /**
         * @return spaceY
         */
        public Long getSpaceY() {
            return this.spaceY;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private Long angle; 
            private Boolean enhance; 
            private String logoBase64; 
            private Margin margin; 
            private String mode; 
            private Integer opacity; 
            private Float posAx; 
            private Float posAy; 
            private Long posX; 
            private Long posY; 
            private Long spaceX; 
            private Long spaceY; 
            private Boolean visible; 

            private Builder() {
            } 

            private Builder(LogoVisibleControl model) {
                this.angle = model.angle;
                this.enhance = model.enhance;
                this.logoBase64 = model.logoBase64;
                this.margin = model.margin;
                this.mode = model.mode;
                this.opacity = model.opacity;
                this.posAx = model.posAx;
                this.posAy = model.posAy;
                this.posX = model.posX;
                this.posY = model.posY;
                this.spaceX = model.spaceX;
                this.spaceY = model.spaceY;
                this.visible = model.visible;
            } 

            /**
             * <p>The clockwise rotation angle of the logo watermark. Valid values: 1 to 360.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * <p>Specifies whether to enable enhanced visible watermark. When enabled, the logo is converted to a watermark logo and added to the image.</p>
             */
            public Builder enhance(Boolean enhance) {
                this.enhance = enhance;
                return this;
            }

            /**
             * <p>The logo watermark in Base64 format. The logo file is a PNG image converted to Base64 format.</p>
             * 
             * <strong>example:</strong>
             * <p>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</p>
             */
            public Builder logoBase64(String logoBase64) {
                this.logoBase64 = logoBase64;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to top-left, top-right, bottom-left, or bottom-right. The margin settings.</p>
             */
            public Builder margin(Margin margin) {
                this.margin = margin;
                return this;
            }

            /**
             * <p>The logo watermark display mode. Valid values:</p>
             * <ul>
             * <li><strong>pos</strong>: fixed position mode.</li>
             * <li><strong>repeat</strong>: tile mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pos</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The opacity of the logo watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * <p>The horizontal anchor point of the logo watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the logo is drawn from the upper-left corner. When set to 0.5, the logo is drawn from the center. When set to (1, 1), the logo is drawn from the lower-right corner.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posAx(Float posAx) {
                this.posAx = posAx;
                return this;
            }

            /**
             * <p>The vertical anchor point of the logo watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the logo is drawn from the upper-left corner. When set to 0.5, the logo is drawn from the center. When set to (1, 1), the logo is drawn from the lower-right corner.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posAy(Float posAy) {
                this.posAy = posAy;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to pos. Specifies the horizontal position of the visible watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posX(Long posX) {
                this.posX = posX;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to pos. Specifies the vertical position of the visible watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posY(Long posY) {
                this.posY = posY;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to repeat. Specifies the horizontal spacing for tiled visible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder spaceX(Long spaceX) {
                this.spaceX = spaceX;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to repeat. Specifies the vertical spacing for tiled visible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder spaceY(Long spaceY) {
                this.spaceY = spaceY;
                return this;
            }

            /**
             * <p>The visibility. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: displayed.</p>
             * </li>
             * <li><p><strong>false</strong>: not displayed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            public LogoVisibleControl build() {
                return new LogoVisibleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmBaseImageRequest} extends {@link TeaModel}
     *
     * <p>CreateWmBaseImageRequest</p>
     */
    public static class TextVisibleControlMargin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        private Float bottom;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Float left;

        @com.aliyun.core.annotation.NameInMap("Right")
        private Float right;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Float top;

        private TextVisibleControlMargin(Builder builder) {
            this.bottom = builder.bottom;
            this.left = builder.left;
            this.right = builder.right;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextVisibleControlMargin create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public Float getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public Float getLeft() {
            return this.left;
        }

        /**
         * @return right
         */
        public Float getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public Float getTop() {
            return this.top;
        }

        public static final class Builder {
            private Float bottom; 
            private Float left; 
            private Float right; 
            private Float top; 

            private Builder() {
            } 

            private Builder(TextVisibleControlMargin model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * <p>Takes effect when Mode is set to bottom-left or bottom-right. The bottom margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bottom(Float bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to top-left or bottom-left. The left margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder left(Float left) {
                this.left = left;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to top-right or bottom-right. The right margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder right(Float right) {
                this.right = right;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to top-left or top-right. The top margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder top(Float top) {
                this.top = top;
                return this;
            }

            public TextVisibleControlMargin build() {
                return new TextVisibleControlMargin(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmBaseImageRequest} extends {@link TeaModel}
     *
     * <p>CreateWmBaseImageRequest</p>
     */
    public static class TextVisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Long fontSize;

        @com.aliyun.core.annotation.NameInMap("Margin")
        private TextVisibleControlMargin margin;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Opacity")
        private Integer opacity;

        @com.aliyun.core.annotation.NameInMap("PosAx")
        private Float posAx;

        @com.aliyun.core.annotation.NameInMap("PosAy")
        private Float posAy;

        @com.aliyun.core.annotation.NameInMap("PosX")
        private Long posX;

        @com.aliyun.core.annotation.NameInMap("PosY")
        private Long posY;

        @com.aliyun.core.annotation.NameInMap("SpaceX")
        private Long spaceX;

        @com.aliyun.core.annotation.NameInMap("SpaceY")
        private Long spaceY;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Boolean visible;

        @com.aliyun.core.annotation.NameInMap("VisibleText")
        private String visibleText;

        private TextVisibleControl(Builder builder) {
            this.angle = builder.angle;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.margin = builder.margin;
            this.mode = builder.mode;
            this.opacity = builder.opacity;
            this.posAx = builder.posAx;
            this.posAy = builder.posAy;
            this.posX = builder.posX;
            this.posY = builder.posY;
            this.spaceX = builder.spaceX;
            this.spaceY = builder.spaceY;
            this.visible = builder.visible;
            this.visibleText = builder.visibleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextVisibleControl create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Long getAngle() {
            return this.angle;
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
        public Long getFontSize() {
            return this.fontSize;
        }

        /**
         * @return margin
         */
        public TextVisibleControlMargin getMargin() {
            return this.margin;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return opacity
         */
        public Integer getOpacity() {
            return this.opacity;
        }

        /**
         * @return posAx
         */
        public Float getPosAx() {
            return this.posAx;
        }

        /**
         * @return posAy
         */
        public Float getPosAy() {
            return this.posAy;
        }

        /**
         * @return posX
         */
        public Long getPosX() {
            return this.posX;
        }

        /**
         * @return posY
         */
        public Long getPosY() {
            return this.posY;
        }

        /**
         * @return spaceX
         */
        public Long getSpaceX() {
            return this.spaceX;
        }

        /**
         * @return spaceY
         */
        public Long getSpaceY() {
            return this.spaceY;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        /**
         * @return visibleText
         */
        public String getVisibleText() {
            return this.visibleText;
        }

        public static final class Builder {
            private Long angle; 
            private String fontColor; 
            private Long fontSize; 
            private TextVisibleControlMargin margin; 
            private String mode; 
            private Integer opacity; 
            private Float posAx; 
            private Float posAy; 
            private Long posX; 
            private Long posY; 
            private Long spaceX; 
            private Long spaceY; 
            private Boolean visible; 
            private String visibleText; 

            private Builder() {
            } 

            private Builder(TextVisibleControl model) {
                this.angle = model.angle;
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.margin = model.margin;
                this.mode = model.mode;
                this.opacity = model.opacity;
                this.posAx = model.posAx;
                this.posAy = model.posAy;
                this.posX = model.posX;
                this.posY = model.posY;
                this.spaceX = model.spaceX;
                this.spaceY = model.spaceY;
                this.visible = model.visible;
                this.visibleText = model.visibleText;
            } 

            /**
             * <p>The clockwise rotation angle of the text watermark. Valid values: 0 to 360.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * <p>The font color of the text watermark. The format is 0xFFFFFF or #FFFFFF RGB color format. For example, 0x000000 or #000000 represents black.</p>
             * 
             * <strong>example:</strong>
             * <p>#FF0000</p>
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size of the text watermark. A larger value indicates a larger font.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fontSize(Long fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to top-left, top-right, bottom-left, or bottom-right. The margin settings.</p>
             */
            public Builder margin(TextVisibleControlMargin margin) {
                this.margin = margin;
                return this;
            }

            /**
             * <p>The text watermark display mode. Valid values:</p>
             * <ul>
             * <li><strong>pos</strong>: fixed position mode.</li>
             * <li><strong>repeat</strong>: tile mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pos</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The opacity of the text watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * <p>The horizontal anchor point of the text watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the text is drawn from the upper-left corner. When set to 0.5, the text is drawn from the center. When set to (1, 1), the text is drawn from the lower-right corner.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posAx(Float posAx) {
                this.posAx = posAx;
                return this;
            }

            /**
             * <p>The vertical anchor point of the text watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the text is drawn from the upper-left corner. When set to 0.5, the text is drawn from the center. When set to (1, 1), the text is drawn from the lower-right corner.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posAy(Float posAy) {
                this.posAy = posAy;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to pos. Specifies the horizontal position of the text watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posX(Long posX) {
                this.posX = posX;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to pos. Specifies the vertical position of the text watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posY(Long posY) {
                this.posY = posY;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to repeat. Specifies the horizontal spacing for tiled text watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder spaceX(Long spaceX) {
                this.spaceX = spaceX;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to repeat. Specifies the vertical spacing for tiled text watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder spaceY(Long spaceY) {
                this.spaceY = spaceY;
                return this;
            }

            /**
             * <p>The visibility. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: displayed.</p>
             * </li>
             * <li><p><strong>false</strong>: not displayed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            /**
             * <p>The text watermark content. The format is a UTF-8 string.</p>
             * 
             * <strong>example:</strong>
             * <p>Watermark text</p>
             */
            public Builder visibleText(String visibleText) {
                this.visibleText = visibleText;
                return this;
            }

            public TextVisibleControl build() {
                return new TextVisibleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmBaseImageRequest} extends {@link TeaModel}
     *
     * <p>CreateWmBaseImageRequest</p>
     */
    public static class ImageControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogoVisibleControl")
        private LogoVisibleControl logoVisibleControl;

        @com.aliyun.core.annotation.NameInMap("TextVisibleControl")
        private TextVisibleControl textVisibleControl;

        private ImageControl(Builder builder) {
            this.logoVisibleControl = builder.logoVisibleControl;
            this.textVisibleControl = builder.textVisibleControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageControl create() {
            return builder().build();
        }

        /**
         * @return logoVisibleControl
         */
        public LogoVisibleControl getLogoVisibleControl() {
            return this.logoVisibleControl;
        }

        /**
         * @return textVisibleControl
         */
        public TextVisibleControl getTextVisibleControl() {
            return this.textVisibleControl;
        }

        public static final class Builder {
            private LogoVisibleControl logoVisibleControl; 
            private TextVisibleControl textVisibleControl; 

            private Builder() {
            } 

            private Builder(ImageControl model) {
                this.logoVisibleControl = model.logoVisibleControl;
                this.textVisibleControl = model.textVisibleControl;
            } 

            /**
             * <p>The logo watermark control parameters.</p>
             */
            public Builder logoVisibleControl(LogoVisibleControl logoVisibleControl) {
                this.logoVisibleControl = logoVisibleControl;
                return this;
            }

            /**
             * <p>The text watermark control parameters for the image.</p>
             */
            public Builder textVisibleControl(TextVisibleControl textVisibleControl) {
                this.textVisibleControl = textVisibleControl;
                return this;
            }

            public ImageControl build() {
                return new ImageControl(this);
            } 

        } 

    }
}
