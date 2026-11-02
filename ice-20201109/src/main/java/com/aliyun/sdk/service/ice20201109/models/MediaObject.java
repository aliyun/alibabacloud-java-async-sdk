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
         * <p>The file media asset.</p>
         * <ul>
         * <li>If Type is OSS, Media is a URL and supports the OSS and HTTP protocols.     </li>
         * <li>If Type is Media, Media is a media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://bucket.loction.aliyuncs.com/path/to/video.mp4">http://bucket.loction.aliyuncs.com/path/to/video.mp4</a></p>
         */
        public Builder media(String media) {
            this.media = media;
            return this;
        }

        /**
         * <p>The input type. Valid values:</p>
         * <ul>
         * <li>OSS: Alibaba Cloud OSS file </li>
         * <li>Media: Media asset</li>
         * <li>ExternalURL: External URL, not currently publicly supported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
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
