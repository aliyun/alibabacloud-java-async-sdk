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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("channel")
    private String channel;

    @Body
    @NameInMap("liveChannelConfiguration")
    private LiveChannelConfiguration liveChannelConfiguration;


    private PutLiveChannelRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.channel = builder.channel;
        this.liveChannelConfiguration = builder.liveChannelConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLiveChannelRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return channel
     */
    public String channel() {
        return this.channel;
    }

    /**
     * @return liveChannelConfiguration
     */
    public LiveChannelConfiguration liveChannelConfiguration() {
        return this.liveChannelConfiguration;
    }

    public static final class Builder extends Request.Builder<PutLiveChannelRequest.Builder> {
        private String bucket; 
        private String channel; 
        private LiveChannelConfiguration liveChannelConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>channel.</p>
         */
        public Builder channel(String channel) {
            this.putPathParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>liveChannelConfiguration.</p>
         */
        public Builder liveChannelConfiguration(LiveChannelConfiguration liveChannelConfiguration) {
            this.putBodyParameter("liveChannelConfiguration", liveChannelConfiguration);
            this.liveChannelConfiguration = liveChannelConfiguration;
            return this;
        }

        public PutLiveChannelRequest build() {
            return new PutLiveChannelRequest(this);
        } 

    } 

}
