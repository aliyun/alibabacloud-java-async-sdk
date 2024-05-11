// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * FillStyle.
         */
        public Builder fillStyle(String fillStyle) {
            this.fillStyle = fillStyle;
            return this;
        }

        /**
         * Font.
         */
        public Builder font(String font) {
            this.font = font;
            return this;
        }

        /**
         * Horizontal.
         */
        public Builder horizontal(Long horizontal) {
            this.horizontal = horizontal;
            return this;
        }

        /**
         * Rotate.
         */
        public Builder rotate(Float rotate) {
            this.rotate = rotate;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Long type) {
            this.type = type;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Vertical.
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
