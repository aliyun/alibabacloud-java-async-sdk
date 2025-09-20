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
 * {@link ImageURL} extends {@link TeaModel}
 *
 * <p>ImageURL</p>
 */
public class ImageURL extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Thumbnail")
    private String thumbnail;

    @com.aliyun.core.annotation.NameInMap("URL")
    private String URL;

    private ImageURL(Builder builder) {
        this.thumbnail = builder.thumbnail;
        this.URL = builder.URL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageURL create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return this.thumbnail;
    }

    /**
     * @return URL
     */
    public String getURL() {
        return this.URL;
    }

    public static final class Builder {
        private String thumbnail; 
        private String URL; 

        private Builder() {
        } 

        private Builder(ImageURL model) {
            this.thumbnail = model.thumbnail;
            this.URL = model.URL;
        } 

        /**
         * Thumbnail.
         */
        public Builder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        /**
         * URL.
         */
        public Builder URL(String URL) {
            this.URL = URL;
            return this;
        }

        public ImageURL build() {
            return new ImageURL(this);
        } 

    } 

}
