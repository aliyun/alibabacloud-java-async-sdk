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
    @NameInMap("PlayUrls")
    private LiveChannelPlayUrls playUrls;

    @ParentIgnore("CreateLiveChannelResult")
    @NameInMap("PublishUrls")
    private LiveChannelPublishUrls publishUrls;


    private PutLiveChannelResponseBody(Builder builder) {
        this.playUrls = builder.playUrls;
        this.publishUrls = builder.publishUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLiveChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return playUrls
     */
    public LiveChannelPlayUrls getPlayUrls() {
        return this.playUrls;
    }

    /**
     * @return publishUrls
     */
    public LiveChannelPublishUrls getPublishUrls() {
        return this.publishUrls;
    }

    public static final class Builder {
        private LiveChannelPlayUrls playUrls; 
        private LiveChannelPublishUrls publishUrls; 

        /**
         * <p>PlayUrls.</p>
         */
        public Builder playUrls(LiveChannelPlayUrls playUrls) {
            this.playUrls = playUrls;
            return this;
        }

        /**
         * <p>PublishUrls.</p>
         */
        public Builder publishUrls(LiveChannelPublishUrls publishUrls) {
            this.publishUrls = publishUrls;
            return this;
        }

        public PutLiveChannelResponseBody build() {
            return new PutLiveChannelResponseBody(this);
        } 

    } 

}
