// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaObject} extends {@link TeaModel}
 *
 * <p>MediaObject</p>
 */
public class MediaObject extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Media")
    private String media;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private MediaObject(Builder builder) {
        this.media = builder.media;
        this.type = builder.type;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaObject create() {
        return builder().build();
    }

    /**
     * @return media
     */
    public String getMedia() {
        return this.media;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String media; 
        private String type; 
        private String url; 

        /**
         * Media.
         */
        public Builder media(String media) {
            this.media = media;
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
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public MediaObject build() {
            return new MediaObject(this);
        } 

    } 

}
