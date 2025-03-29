// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link IncludeImage} extends {@link TeaModel}
 *
 * <p>IncludeImage</p>
 */
public class IncludeImage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("height")
    private Integer height;

    @com.aliyun.core.annotation.NameInMap("imageLink")
    private String imageLink;

    @com.aliyun.core.annotation.NameInMap("width")
    private Integer width;

    private IncludeImage(Builder builder) {
        this.height = builder.height;
        this.imageLink = builder.imageLink;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncludeImage create() {
        return builder().build();
    }

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
     * @return imageLink
     */
    public String getImageLink() {
        return this.imageLink;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Integer height; 
        private String imageLink; 
        private Integer width; 

        private Builder() {
        } 

        private Builder(IncludeImage model) {
            this.height = model.height;
            this.imageLink = model.imageLink;
            this.width = model.width;
        } 

        /**
         * height.
         */
        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        /**
         * imageLink.
         */
        public Builder imageLink(String imageLink) {
            this.imageLink = imageLink;
            return this;
        }

        /**
         * width.
         */
        public Builder width(Integer width) {
            this.width = width;
            return this;
        }

        public IncludeImage build() {
            return new IncludeImage(this);
        } 

    } 

}
