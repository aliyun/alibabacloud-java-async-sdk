// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutLiveChannelRequest} extends {@link RequestModel}
 *
 * <p>PutLiveChannelRequest</p>
 */
public class PutLiveChannelRequest extends Request {
    @Path
    @NameInMap("channel")
    private String channel;

    @Body
    @NameInMap("LiveChannelConfiguration")
    private LiveChannelConfiguration liveChannelConfiguration;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private PutLiveChannelRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.liveChannelConfiguration = builder.liveChannelConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLiveChannelRequest create() {
        return builder().build();
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return liveChannelConfiguration
     */
    public LiveChannelConfiguration getLiveChannelConfiguration() {
        return this.liveChannelConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String channel; 
        private LiveChannelConfiguration liveChannelConfiguration; 
        private String bucket; 

        /**
         * <p>channel.</p>
         */
        public Builder channel(String channel) {
            this.putPathParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>LiveChannelConfiguration.</p>
         */
        public Builder liveChannelConfiguration(LiveChannelConfiguration liveChannelConfiguration) {
            this.putBodyParameter("LiveChannelConfiguration", liveChannelConfiguration);
            this.liveChannelConfiguration = liveChannelConfiguration;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public PutLiveChannelRequest build() {
            return new PutLiveChannelRequest(this);
        } 

    } 

}
