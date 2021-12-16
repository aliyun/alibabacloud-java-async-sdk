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
    @Path
    @NameInMap("channel")
    private String channel;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("status")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String channel; 
        private String bucket; 
        private String status; 

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
