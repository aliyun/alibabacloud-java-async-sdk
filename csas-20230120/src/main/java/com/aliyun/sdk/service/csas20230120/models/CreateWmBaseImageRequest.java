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
        } 

        /**
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
         * ImageControl.
         */
        public Builder imageControl(ImageControl imageControl) {
            String imageControlShrink = shrink(imageControl, "ImageControl", "json");
            this.putBodyParameter("ImageControl", imageControlShrink);
            this.imageControl = imageControl;
            return this;
        }

        /**
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
         * WmInfoBytesB64.
         */
        public Builder wmInfoBytesB64(String wmInfoBytesB64) {
            this.putBodyParameter("WmInfoBytesB64", wmInfoBytesB64);
            this.wmInfoBytesB64 = wmInfoBytesB64;
            return this;
        }

        /**
         * WmInfoSize.
         */
        public Builder wmInfoSize(Long wmInfoSize) {
            this.putBodyParameter("WmInfoSize", wmInfoSize);
            this.wmInfoSize = wmInfoSize;
            return this;
        }

        /**
         * WmInfoUint.
         */
        public Builder wmInfoUint(String wmInfoUint) {
            this.putBodyParameter("WmInfoUint", wmInfoUint);
            this.wmInfoUint = wmInfoUint;
            return this;
        }

        /**
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
    public static class LogoVisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("LogoBase64")
        private String logoBase64;

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
            this.logoBase64 = builder.logoBase64;
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
         * @return logoBase64
         */
        public String getLogoBase64() {
            return this.logoBase64;
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
            private String logoBase64; 
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
                this.logoBase64 = model.logoBase64;
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
             * Angle.
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * LogoBase64.
             */
            public Builder logoBase64(String logoBase64) {
                this.logoBase64 = logoBase64;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * PosAx.
             */
            public Builder posAx(Float posAx) {
                this.posAx = posAx;
                return this;
            }

            /**
             * PosAy.
             */
            public Builder posAy(Float posAy) {
                this.posAy = posAy;
                return this;
            }

            /**
             * PosX.
             */
            public Builder posX(Long posX) {
                this.posX = posX;
                return this;
            }

            /**
             * PosY.
             */
            public Builder posY(Long posY) {
                this.posY = posY;
                return this;
            }

            /**
             * SpaceX.
             */
            public Builder spaceX(Long spaceX) {
                this.spaceX = spaceX;
                return this;
            }

            /**
             * SpaceY.
             */
            public Builder spaceY(Long spaceY) {
                this.spaceY = spaceY;
                return this;
            }

            /**
             * Visible.
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
    public static class TextVisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Long fontSize;

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
             * Angle.
             */
            public Builder angle(Long angle) {
                this.angle = angle;
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
             * FontSize.
             */
            public Builder fontSize(Long fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * PosAx.
             */
            public Builder posAx(Float posAx) {
                this.posAx = posAx;
                return this;
            }

            /**
             * PosAy.
             */
            public Builder posAy(Float posAy) {
                this.posAy = posAy;
                return this;
            }

            /**
             * PosX.
             */
            public Builder posX(Long posX) {
                this.posX = posX;
                return this;
            }

            /**
             * PosY.
             */
            public Builder posY(Long posY) {
                this.posY = posY;
                return this;
            }

            /**
             * SpaceX.
             */
            public Builder spaceX(Long spaceX) {
                this.spaceX = spaceX;
                return this;
            }

            /**
             * SpaceY.
             */
            public Builder spaceY(Long spaceY) {
                this.spaceY = spaceY;
                return this;
            }

            /**
             * Visible.
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            /**
             * VisibleText.
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
             * LogoVisibleControl.
             */
            public Builder logoVisibleControl(LogoVisibleControl logoVisibleControl) {
                this.logoVisibleControl = logoVisibleControl;
                return this;
            }

            /**
             * TextVisibleControl.
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
