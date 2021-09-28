// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannelPlayUrls} extends {@link TeaModel}
 *
 * <p>LiveChannelPlayUrls</p>
 */
public class LiveChannelPlayUrls extends TeaModel {
    @NameInMap("Url")
    private String url;


    private LiveChannelPlayUrls(Builder builder) {
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelPlayUrls create() {
        return builder().build();
    }

    /**
     * @return url
     */
    public String url() {
        return this.url;
    }

    public static final class Builder {
        private String url; 

        /**
         * <p>description</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public LiveChannelPlayUrls build() {
            return new LiveChannelPlayUrls(this);
        } 

    } 

}
