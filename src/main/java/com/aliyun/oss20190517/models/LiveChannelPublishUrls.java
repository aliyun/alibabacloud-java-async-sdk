// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannelPublishUrls} extends {@link TeaModel}
 *
 * <p>LiveChannelPublishUrls</p>
 */
public class LiveChannelPublishUrls extends TeaModel {
    @NameInMap("Url")
    private String url;


    private LiveChannelPublishUrls(Builder builder) {
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelPublishUrls create() {
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
         * <p>description</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public LiveChannelPublishUrls build() {
            return new LiveChannelPublishUrls(this);
        } 

    } 

}
