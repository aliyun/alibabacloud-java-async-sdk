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
 * {@link Boundary} extends {@link TeaModel}
 *
 * <p>Boundary</p>
 */
public class Boundary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Height")
    private Long height;

    @com.aliyun.core.annotation.NameInMap("Left")
    private Long left;

    @com.aliyun.core.annotation.NameInMap("Polygon")
    private java.util.List<PointInt64> polygon;

    @com.aliyun.core.annotation.NameInMap("Top")
    private Long top;

    @com.aliyun.core.annotation.NameInMap("Width")
    private Long width;

    private Boundary(Builder builder) {
        this.height = builder.height;
        this.left = builder.left;
        this.polygon = builder.polygon;
        this.top = builder.top;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Boundary create() {
        return builder().build();
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    /**
     * @return left
     */
    public Long getLeft() {
        return this.left;
    }

    /**
     * @return polygon
     */
    public java.util.List<PointInt64> getPolygon() {
        return this.polygon;
    }

    /**
     * @return top
     */
    public Long getTop() {
        return this.top;
    }

    /**
     * @return width
     */
    public Long getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Long height; 
        private Long left; 
        private java.util.List<PointInt64> polygon; 
        private Long top; 
        private Long width; 

        /**
         * Height.
         */
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * Left.
         */
        public Builder left(Long left) {
            this.left = left;
            return this;
        }

        /**
         * Polygon.
         */
        public Builder polygon(java.util.List<PointInt64> polygon) {
            this.polygon = polygon;
            return this;
        }

        /**
         * Top.
         */
        public Builder top(Long top) {
            this.top = top;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        public Boundary build() {
            return new Boundary(this);
        } 

    } 

}
