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
 * {@link CreateRealisticPortraitRequest} extends {@link RequestModel}
 *
 * <p>CreateRealisticPortraitRequest</p>
 */
public class CreateRealisticPortraitRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ages")
    private java.util.List<Integer> ages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloth")
    private Integer cloth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("color")
    private Integer color;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("custom")
    private String custom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("face")
    private java.util.List<Integer> face;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("figure")
    private Integer figure;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gender")
    private Integer gender;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hairColor")
    private Integer hairColor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hairstyle")
    private Integer hairstyle;

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
    @com.aliyun.core.annotation.NameInMap("ratio")
    private String ratio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("width")
    private Integer width;

    private CreateRealisticPortraitRequest(Builder builder) {
        super(builder);
        this.ages = builder.ages;
        this.cloth = builder.cloth;
        this.color = builder.color;
        this.custom = builder.custom;
        this.face = builder.face;
        this.figure = builder.figure;
        this.gender = builder.gender;
        this.hairColor = builder.hairColor;
        this.hairstyle = builder.hairstyle;
        this.height = builder.height;
        this.imageUrl = builder.imageUrl;
        this.numbers = builder.numbers;
        this.ratio = builder.ratio;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRealisticPortraitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ages
     */
    public java.util.List<Integer> getAges() {
        return this.ages;
    }

    /**
     * @return cloth
     */
    public Integer getCloth() {
        return this.cloth;
    }

    /**
     * @return color
     */
    public Integer getColor() {
        return this.color;
    }

    /**
     * @return custom
     */
    public String getCustom() {
        return this.custom;
    }

    /**
     * @return face
     */
    public java.util.List<Integer> getFace() {
        return this.face;
    }

    /**
     * @return figure
     */
    public Integer getFigure() {
        return this.figure;
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return this.gender;
    }

    /**
     * @return hairColor
     */
    public Integer getHairColor() {
        return this.hairColor;
    }

    /**
     * @return hairstyle
     */
    public Integer getHairstyle() {
        return this.hairstyle;
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
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder extends Request.Builder<CreateRealisticPortraitRequest, Builder> {
        private java.util.List<Integer> ages; 
        private Integer cloth; 
        private Integer color; 
        private String custom; 
        private java.util.List<Integer> face; 
        private Integer figure; 
        private Integer gender; 
        private Integer hairColor; 
        private Integer hairstyle; 
        private Integer height; 
        private String imageUrl; 
        private Integer numbers; 
        private String ratio; 
        private Integer width; 

        private Builder() {
            super();
        } 

        private Builder(CreateRealisticPortraitRequest request) {
            super(request);
            this.ages = request.ages;
            this.cloth = request.cloth;
            this.color = request.color;
            this.custom = request.custom;
            this.face = request.face;
            this.figure = request.figure;
            this.gender = request.gender;
            this.hairColor = request.hairColor;
            this.hairstyle = request.hairstyle;
            this.height = request.height;
            this.imageUrl = request.imageUrl;
            this.numbers = request.numbers;
            this.ratio = request.ratio;
            this.width = request.width;
        } 

        /**
         * ages.
         */
        public Builder ages(java.util.List<Integer> ages) {
            this.putBodyParameter("ages", ages);
            this.ages = ages;
            return this;
        }

        /**
         * cloth.
         */
        public Builder cloth(Integer cloth) {
            this.putBodyParameter("cloth", cloth);
            this.cloth = cloth;
            return this;
        }

        /**
         * color.
         */
        public Builder color(Integer color) {
            this.putBodyParameter("color", color);
            this.color = color;
            return this;
        }

        /**
         * custom.
         */
        public Builder custom(String custom) {
            this.putBodyParameter("custom", custom);
            this.custom = custom;
            return this;
        }

        /**
         * face.
         */
        public Builder face(java.util.List<Integer> face) {
            this.putBodyParameter("face", face);
            this.face = face;
            return this;
        }

        /**
         * figure.
         */
        public Builder figure(Integer figure) {
            this.putBodyParameter("figure", figure);
            this.figure = figure;
            return this;
        }

        /**
         * gender.
         */
        public Builder gender(Integer gender) {
            this.putBodyParameter("gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * hairColor.
         */
        public Builder hairColor(Integer hairColor) {
            this.putBodyParameter("hairColor", hairColor);
            this.hairColor = hairColor;
            return this;
        }

        /**
         * hairstyle.
         */
        public Builder hairstyle(Integer hairstyle) {
            this.putBodyParameter("hairstyle", hairstyle);
            this.hairstyle = hairstyle;
            return this;
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
         * ratio.
         */
        public Builder ratio(String ratio) {
            this.putBodyParameter("ratio", ratio);
            this.ratio = ratio;
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
        public CreateRealisticPortraitRequest build() {
            return new CreateRealisticPortraitRequest(this);
        } 

    } 

}
