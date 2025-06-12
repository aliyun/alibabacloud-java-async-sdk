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
 * {@link Insights} extends {@link TeaModel}
 *
 * <p>Insights</p>
 */
public class Insights extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private ImageInsight image;

    @com.aliyun.core.annotation.NameInMap("Video")
    private VideoInsight video;

    private Insights(Builder builder) {
        this.image = builder.image;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Insights create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public ImageInsight getImage() {
        return this.image;
    }

    /**
     * @return video
     */
    public VideoInsight getVideo() {
        return this.video;
    }

    public static final class Builder {
        private ImageInsight image; 
        private VideoInsight video; 

        private Builder() {
        } 

        private Builder(Insights model) {
            this.image = model.image;
            this.video = model.video;
        } 

        /**
         * Image.
         */
        public Builder image(ImageInsight image) {
            this.image = image;
            return this;
        }

        /**
         * Video.
         */
        public Builder video(VideoInsight video) {
            this.video = video;
            return this;
        }

        public Insights build() {
            return new Insights(this);
        } 

    } 

}
