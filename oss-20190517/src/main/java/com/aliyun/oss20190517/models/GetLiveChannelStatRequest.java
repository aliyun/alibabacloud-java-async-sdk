// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLiveChannelStatRequest} extends {@link RequestModel}
 *
 * <p>GetLiveChannelStatRequest</p>
 */
public class GetLiveChannelStatRequest extends Request {
    @Path
    @NameInMap("channel")
    private String channel;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private GetLiveChannelStatRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveChannelStatRequest create() {
        return builder().build();
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String channel; 
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
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public GetLiveChannelStatRequest build() {
            return new GetLiveChannelStatRequest(this);
        } 

    } 

}
