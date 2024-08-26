// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VideoPreviewSubtitleInfo} extends {@link TeaModel}
 *
 * <p>VideoPreviewSubtitleInfo</p>
 */
public class VideoPreviewSubtitleInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private VideoPreviewSubtitleInfo(Builder builder) {
        this.language = builder.language;
        this.status = builder.status;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoPreviewSubtitleInfo create() {
        return builder().build();
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String language; 
        private String status; 
        private String url; 

        /**
         * language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public VideoPreviewSubtitleInfo build() {
            return new VideoPreviewSubtitleInfo(this);
        } 

    } 

}
