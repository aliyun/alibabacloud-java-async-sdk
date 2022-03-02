// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutLiveChannelStatusRequest} extends {@link RequestModel}
 *
 * <p>PutLiveChannelStatusRequest</p>
 */
public class PutLiveChannelStatusRequest extends Request {
    @Path
    @NameInMap("channel")
    @Validation(required = true)
    private String channel;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("status")
    @Validation(required = true)
    private String status;

    private PutLiveChannelStatusRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.bucket = builder.bucket;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLiveChannelStatusRequest create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<PutLiveChannelStatusRequest, Builder> {
        private String channel; 
        private String bucket; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(PutLiveChannelStatusRequest request) {
            super(request);
            this.channel = request.channel;
            this.bucket = request.bucket;
            this.status = request.status;
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

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public PutLiveChannelStatusRequest build() {
            return new PutLiveChannelStatusRequest(this);
        } 

    } 

}
