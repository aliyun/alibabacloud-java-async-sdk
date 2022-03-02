// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutLiveChannelRequest} extends {@link RequestModel}
 *
 * <p>PutLiveChannelRequest</p>
 */
public class PutLiveChannelRequest extends Request {
    @Path
    @NameInMap("channel")
    @Validation(required = true)
    private String channel;

    @Body
    @NameInMap("LiveChannelConfiguration")
    @Validation(required = true)
    private LiveChannelConfiguration liveChannelConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<PutLiveChannelRequest, Builder> {
        private String channel; 
        private LiveChannelConfiguration liveChannelConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutLiveChannelRequest request) {
            super(request);
            this.channel = request.channel;
            this.liveChannelConfiguration = request.liveChannelConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putPathParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * LiveChannelConfiguration.
         */
        public Builder liveChannelConfiguration(LiveChannelConfiguration liveChannelConfiguration) {
            this.putBodyParameter("LiveChannelConfiguration", liveChannelConfiguration);
            this.liveChannelConfiguration = liveChannelConfiguration;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        @Override
        public PutLiveChannelRequest build() {
            return new PutLiveChannelRequest(this);
        } 

    } 

}
