// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String url; 

        /**
         * description
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
