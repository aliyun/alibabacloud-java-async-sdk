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
 * {@link ReverseImageConfig} extends {@link TeaModel}
 *
 * <p>ReverseImageConfig</p>
 */
public class ReverseImageConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private ImageReverseImageConfig image;

    @com.aliyun.core.annotation.NameInMap("Video")
    private VideoReverseImageConfig video;

    private ReverseImageConfig(Builder builder) {
        this.image = builder.image;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReverseImageConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public ImageReverseImageConfig getImage() {
        return this.image;
    }

    /**
     * @return video
     */
    public VideoReverseImageConfig getVideo() {
        return this.video;
    }

    public static final class Builder {
        private ImageReverseImageConfig image; 
        private VideoReverseImageConfig video; 

        private Builder() {
        } 

        private Builder(ReverseImageConfig model) {
            this.image = model.image;
            this.video = model.video;
        } 

        /**
         * Image.
         */
        public Builder image(ImageReverseImageConfig image) {
            this.image = image;
            return this;
        }

        /**
         * Video.
         */
        public Builder video(VideoReverseImageConfig video) {
            this.video = video;
            return this;
        }

        public ReverseImageConfig build() {
            return new ReverseImageConfig(this);
        } 

    } 

}
