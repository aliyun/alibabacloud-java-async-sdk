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
         * ImageIndex.
         */
        public Builder imageIndex(Integer imageIndex) {
            this.imageIndex = imageIndex;
            return this;
        }

        /**
         * ImagePath.
         */
        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        /**
         * NormalizedBox.
         */
        public Builder normalizedBox(java.util.List<Float> normalizedBox) {
            this.normalizedBox = normalizedBox;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Type.
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
