// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutLiveChannelResponseBody} extends {@link TeaModel}
 *
 * <p>PutLiveChannelResponseBody</p>
 */
public class PutLiveChannelResponseBody extends TeaModel {
    @ParentIgnore("CreateLiveChannelResult")
    @NameInMap("PublishUrls")
    private LiveChannelPublishUrls publishUrls;

    @ParentIgnore("CreateLiveChannelResult")
    @NameInMap("PlayUrls")
    private LiveChannelPlayUrls playUrls;


    private PutLiveChannelResponseBody(Builder builder) {
        this.publishUrls = builder.publishUrls;
        this.playUrls = builder.playUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLiveChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return publishUrls
     */
    public LiveChannelPublishUrls publishUrls() {
        return this.publishUrls;
    }

    /**
     * @return playUrls
     */
    public LiveChannelPlayUrls playUrls() {
        return this.playUrls;
    }

    public static final class Builder {
        private LiveChannelPublishUrls publishUrls; 
        private LiveChannelPlayUrls playUrls; 

        /**
         * <p>PublishUrls.</p>
         */
        public Builder publishUrls(LiveChannelPublishUrls publishUrls) {
            this.publishUrls = publishUrls;
            return this;
        }

        /**
         * <p>PlayUrls.</p>
         */
        public Builder playUrls(LiveChannelPlayUrls playUrls) {
            this.playUrls = playUrls;
            return this;
        }

        public PutLiveChannelResponseBody build() {
            return new PutLiveChannelResponseBody(this);
        } 

    } 

}
