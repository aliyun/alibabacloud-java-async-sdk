// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutLiveChannelStatusRequest} extends {@link RequestModel}
 *
 * <p>PutLiveChannelStatusRequest</p>
 */
public class PutLiveChannelStatusRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("channel")
    private String channel;

    @Query
    @NameInMap("status")
    private String status;


    private PutLiveChannelStatusRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.channel = builder.channel;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLiveChannelStatusRequest create() {
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
     * @return status
     */
    public String status() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<PutLiveChannelStatusRequest.Builder> {
        private String bucket; 
        private String channel; 
        private String status; 

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
         * <p>status.</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        public PutLiveChannelStatusRequest build() {
            return new PutLiveChannelStatusRequest(this);
        } 

    } 

}
