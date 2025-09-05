// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.objectdet20191230.models;

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
 * {@link DetectObjectElement} extends {@link TeaModel}
 *
 * <p>DetectObjectElement</p>
 */
public class DetectObjectElement extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Height")
    private Long height;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Float score;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Width")
    private Long width;

    @com.aliyun.core.annotation.NameInMap("X")
    private Long x;

    @com.aliyun.core.annotation.NameInMap("Y")
    private Long y;

    private DetectObjectElement(Builder builder) {
        this.height = builder.height;
        this.score = builder.score;
        this.type = builder.type;
        this.width = builder.width;
        this.x = builder.x;
        this.y = builder.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectObjectElement create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    /**
     * @return score
     */
    public Float getScore() {
        return this.score;
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
    public Long getWidth() {
        return this.width;
    }

    /**
     * @return x
     */
    public Long getX() {
        return this.x;
    }

    /**
     * @return y
     */
    public Long getY() {
        return this.y;
    }

    public static final class Builder {
        private Long height; 
        private Float score; 
        private String type; 
        private Long width; 
        private Long x; 
        private Long y; 

        private Builder() {
        } 

        private Builder(DetectObjectElement model) {
            this.height = model.height;
            this.score = model.score;
            this.type = model.type;
            this.width = model.width;
            this.x = model.x;
            this.y = model.y;
        } 

        /**
         * Height.
         */
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(Float score) {
            this.score = score;
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
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        /**
         * X.
         */
        public Builder x(Long x) {
            this.x = x;
            return this;
        }

        /**
         * Y.
         */
        public Builder y(Long y) {
            this.y = y;
            return this;
        }

        public DetectObjectElement build() {
            return new DetectObjectElement(this);
        } 

    } 

}
