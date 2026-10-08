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
 * {@link InsightsConfig} extends {@link TeaModel}
 *
 * <p>InsightsConfig</p>
 */
public class InsightsConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private ImageInsightsConfig image;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("Video")
    private VideoInsightsConfig video;

    private InsightsConfig(Builder builder) {
        this.image = builder.image;
        this.language = builder.language;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsightsConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public ImageInsightsConfig getImage() {
        return this.image;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return video
     */
    public VideoInsightsConfig getVideo() {
        return this.video;
    }

    public static final class Builder {
        private ImageInsightsConfig image; 
        private String language; 
        private VideoInsightsConfig video; 

        private Builder() {
        } 

        private Builder(InsightsConfig model) {
            this.image = model.image;
            this.language = model.language;
            this.video = model.video;
        } 

        /**
         * <p>The image content-aware configuration.</p>
         */
        public Builder image(ImageInsightsConfig image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-Hans</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>The video content-aware configuration.</p>
         */
        public Builder video(VideoInsightsConfig video) {
            this.video = video;
            return this;
        }

        public InsightsConfig build() {
            return new InsightsConfig(this);
        } 

    } 

}
