// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetOfficeEditUrlWatermark} extends {@link TeaModel}
 *
 * <p>GetOfficeEditUrlWatermark</p>
 */
public class GetOfficeEditUrlWatermark extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fillstyle")
    private String fillstyle;

    @com.aliyun.core.annotation.NameInMap("font")
    private String font;

    @com.aliyun.core.annotation.NameInMap("horizontal")
    private Long horizontal;

    @com.aliyun.core.annotation.NameInMap("rotate")
    private Double rotate;

    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("vertical")
    private Long vertical;

    private GetOfficeEditUrlWatermark(Builder builder) {
        this.fillstyle = builder.fillstyle;
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

    public static GetOfficeEditUrlWatermark create() {
        return builder().build();
    }

    /**
     * @return fillstyle
     */
    public String getFillstyle() {
        return this.fillstyle;
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
    public Double getRotate() {
        return this.rotate;
    }

    /**
     * @return type
     */
    public Integer getType() {
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
        private String fillstyle; 
        private String font; 
        private Long horizontal; 
        private Double rotate; 
        private Integer type; 
        private String value; 
        private Long vertical; 

        /**
         * fillstyle.
         */
        public Builder fillstyle(String fillstyle) {
            this.fillstyle = fillstyle;
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
         * horizontal.
         */
        public Builder horizontal(Long horizontal) {
            this.horizontal = horizontal;
            return this;
        }

        /**
         * rotate.
         */
        public Builder rotate(Double rotate) {
            this.rotate = rotate;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * vertical.
         */
        public Builder vertical(Long vertical) {
            this.vertical = vertical;
            return this;
        }

        public GetOfficeEditUrlWatermark build() {
            return new GetOfficeEditUrlWatermark(this);
        } 

    } 

}
