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
 * {@link Illustration} extends {@link TeaModel}
 *
 * <p>Illustration</p>
 */
public class Illustration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageIndex")
    private Integer imageIndex;

    @com.aliyun.core.annotation.NameInMap("ImagePath")
    private String imagePath;

    @com.aliyun.core.annotation.NameInMap("NormalizedBox")
    private java.util.List<Float> normalizedBox;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private Illustration(Builder builder) {
        this.imageIndex = builder.imageIndex;
        this.imagePath = builder.imagePath;
        this.normalizedBox = builder.normalizedBox;
        this.pageNumber = builder.pageNumber;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Illustration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageIndex
     */
    public Integer getImageIndex() {
        return this.imageIndex;
    }

    /**
     * @return imagePath
     */
    public String getImagePath() {
        return this.imagePath;
    }

    /**
     * @return normalizedBox
     */
    public java.util.List<Float> getNormalizedBox() {
        return this.normalizedBox;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer imageIndex; 
        private String imagePath; 
        private java.util.List<Float> normalizedBox; 
        private Integer pageNumber; 
        private String text; 
        private String type; 

        private Builder() {
        } 

        private Builder(Illustration model) {
            this.imageIndex = model.imageIndex;
            this.imagePath = model.imagePath;
            this.normalizedBox = model.normalizedBox;
            this.pageNumber = model.pageNumber;
            this.text = model.text;
            this.type = model.type;
        } 

        /**
         * <p>The index of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder imageIndex(Integer imageIndex) {
            this.imageIndex = imageIndex;
            return this;
        }

        /**
         * <p>The relative path of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;imgs/page_0_img_image_box_770_540_1367_860.png&quot;</p>
         */
        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        /**
         * <p>The normalized coordinate of the image on the page.</p>
         */
        public Builder normalizedBox(java.util.List<Float> normalizedBox) {
            this.normalizedBox = normalizedBox;
            return this;
        }

        /**
         * <p>The page number where the image is located.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The text result recognized by optical character recognition (OCR) from the image.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;图片&quot;</p>
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * <p>The type of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>image、table、code</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Illustration build() {
            return new Illustration(this);
        } 

    } 

}
