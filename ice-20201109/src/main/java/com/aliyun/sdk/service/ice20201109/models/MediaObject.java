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

    private MediaObject(Builder builder) {
        this.media = builder.media;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaObject create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String media; 
        private String type; 

        private Builder() {
        } 

        private Builder(MediaObject model) {
            this.media = model.media;
            this.type = model.type;
        } 

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

        public MediaObject build() {
            return new MediaObject(this);
        } 

    } 

}
