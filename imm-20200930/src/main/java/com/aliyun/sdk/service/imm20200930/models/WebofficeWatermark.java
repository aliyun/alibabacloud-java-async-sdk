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
 * {@link WebofficeWatermark} extends {@link TeaModel}
 *
 * <p>WebofficeWatermark</p>
 */
public class WebofficeWatermark extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FillStyle")
    private String fillStyle;

    @com.aliyun.core.annotation.NameInMap("Font")
    private String font;

    @com.aliyun.core.annotation.NameInMap("Horizontal")
    private Long horizontal;

    @com.aliyun.core.annotation.NameInMap("Rotate")
    private Float rotate;

    @com.aliyun.core.annotation.NameInMap("Type")
    private Long type;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("Vertical")
    private Long vertical;

    private WebofficeWatermark(Builder builder) {
        this.fillStyle = builder.fillStyle;
        this.font = builder.font;
        this.horizontal = builder.horizontal;
        this.rotate = builder.rotate;
        this.type = builder.type;
        this.value = builder.value;
        this.vertical = builder.vertical;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebofficeWatermark create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fillStyle
     */
    public String getFillStyle() {
        return this.fillStyle;
    }

    /**
     * @return font
     */
    public String getFont() {
        return this.font;
    }

    /**
     * @return horizontal
     */
    public Long getHorizontal() {
        return this.horizontal;
    }

    /**
     * @return rotate
     */
    public Float getRotate() {
        return this.rotate;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return vertical
     */
    public Long getVertical() {
        return this.vertical;
    }

    public static final class Builder {
        private String fillStyle; 
        private String font; 
        private Long horizontal; 
        private Float rotate; 
        private Long type; 
        private String value; 
        private Long vertical; 

        private Builder() {
        } 

        private Builder(WebofficeWatermark model) {
            this.fillStyle = model.fillStyle;
            this.font = model.font;
            this.horizontal = model.horizontal;
            this.rotate = model.rotate;
            this.type = model.type;
            this.value = model.value;
            this.vertical = model.vertical;
        } 

        /**
         * <p>The color and transparency of the text watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>rgba(192, 192, 192, 0.6)</p>
         */
        public Builder fillStyle(String fillStyle) {
            this.fillStyle = fillStyle;
            return this;
        }

        /**
         * <p>The font of the text watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>bold 20px Serif</p>
         */
        public Builder font(String font) {
            this.font = font;
            return this;
        }

        /**
         * <p>The horizontal spacing of the text watermark. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder horizontal(Long horizontal) {
            this.horizontal = horizontal;
            return this;
        }

        /**
         * <p>The rotation of the text watermark. Unit: radian.</p>
         * 
         * <strong>example:</strong>
         * <p>-0.7853982</p>
         */
        public Builder rotate(Float rotate) {
            this.rotate = rotate;
            return this;
        }

        /**
         * <p>The watermark type. Valid values:</p>
         * <ul>
         * <li>0: no watermark.</li>
         * <li>1: text watermark.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Long type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The watermark text.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set the Type parameter to 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * <p>The vertical spacing of the text watermark. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder vertical(Long vertical) {
            this.vertical = vertical;
            return this;
        }

        public WebofficeWatermark build() {
            return new WebofficeWatermark(this);
        } 

    } 

}
