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
         * <p>The image height in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>324</p>
         */
        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        /**
         * <p>The image link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://k.sinaimg.cn/n/sinakd20121/594/w2048h946/20240328/74cf-32c0d62e843df76567d760b4459d57c1.jpg/w700d1q75cms.jpg">http://k.sinaimg.cn/n/sinakd20121/594/w2048h946/20240328/74cf-32c0d62e843df76567d760b4459d57c1.jpg/w700d1q75cms.jpg</a></p>
         */
        public Builder imageLink(String imageLink) {
            this.imageLink = imageLink;
            return this;
        }

        /**
         * <p>The image width in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
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
