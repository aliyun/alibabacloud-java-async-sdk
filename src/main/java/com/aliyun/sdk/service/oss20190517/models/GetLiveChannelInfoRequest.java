// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetLiveChannelInfoRequest} extends {@link RequestModel}
 *
 * <p>GetLiveChannelInfoRequest</p>
 */
public class GetLiveChannelInfoRequest extends Request {
    @Path
    @NameInMap("channel")
    @Validation(required = true)
    private String channel;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private GetLiveChannelInfoRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveChannelInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetLiveChannelInfoRequest, Builder> {
        private String channel; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveChannelInfoRequest request) {
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
        public GetLiveChannelInfoRequest build() {
            return new GetLiveChannelInfoRequest(this);
        } 

    } 

}
