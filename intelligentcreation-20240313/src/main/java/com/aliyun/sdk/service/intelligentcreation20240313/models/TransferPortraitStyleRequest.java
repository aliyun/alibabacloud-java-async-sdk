// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link TransferPortraitStyleRequest} extends {@link RequestModel}
 *
 * <p>TransferPortraitStyleRequest</p>
 */
public class TransferPortraitStyleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("height")
    private Integer height;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("numbers")
    private Integer numbers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("redrawAmplitude")
    private Integer redrawAmplitude;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("style")
    private Integer style;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("width")
    private Integer width;

    private TransferPortraitStyleRequest(Builder builder) {
        super(builder);
        this.height = builder.height;
        this.imageUrl = builder.imageUrl;
        this.numbers = builder.numbers;
        this.redrawAmplitude = builder.redrawAmplitude;
        this.style = builder.style;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferPortraitStyleRequest create() {
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
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return numbers
     */
    public Integer getNumbers() {
        return this.numbers;
    }

    /**
     * @return redrawAmplitude
     */
    public Integer getRedrawAmplitude() {
        return this.redrawAmplitude;
    }

    /**
     * @return style
     */
    public Integer getStyle() {
        return this.style;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder extends Request.Builder<TransferPortraitStyleRequest, Builder> {
        private Integer height; 
        private String imageUrl; 
        private Integer numbers; 
        private Integer redrawAmplitude; 
        private Integer style; 
        private Integer width; 

        private Builder() {
            super();
        } 

        private Builder(TransferPortraitStyleRequest request) {
            super(request);
            this.height = request.height;
            this.imageUrl = request.imageUrl;
            this.numbers = request.numbers;
            this.redrawAmplitude = request.redrawAmplitude;
            this.style = request.style;
            this.width = request.width;
        } 

        /**
         * height.
         */
        public Builder height(Integer height) {
            this.putBodyParameter("height", height);
            this.height = height;
            return this;
        }

        /**
         * imageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("imageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * numbers.
         */
        public Builder numbers(Integer numbers) {
            this.putBodyParameter("numbers", numbers);
            this.numbers = numbers;
            return this;
        }

        /**
         * redrawAmplitude.
         */
        public Builder redrawAmplitude(Integer redrawAmplitude) {
            this.putBodyParameter("redrawAmplitude", redrawAmplitude);
            this.redrawAmplitude = redrawAmplitude;
            return this;
        }

        /**
         * style.
         */
        public Builder style(Integer style) {
            this.putBodyParameter("style", style);
            this.style = style;
            return this;
        }

        /**
         * width.
         */
        public Builder width(Integer width) {
            this.putBodyParameter("width", width);
            this.width = width;
            return this;
        }

        @Override
        public TransferPortraitStyleRequest build() {
            return new TransferPortraitStyleRequest(this);
        } 

    } 

}
