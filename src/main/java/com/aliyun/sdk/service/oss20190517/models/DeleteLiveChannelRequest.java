// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteLiveChannelRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveChannelRequest</p>
 */
public class DeleteLiveChannelRequest extends Request {
    @Path
    @NameInMap("channel")
    @Validation(required = true)
    private String channel;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private DeleteLiveChannelRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveChannelRequest create() {
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
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<DeleteLiveChannelRequest, Builder> {
        private String channel; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveChannelRequest request) {
            super(request);
            this.channel = request.channel;
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
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        @Override
        public DeleteLiveChannelRequest build() {
            return new DeleteLiveChannelRequest(this);
        } 

    } 

}
