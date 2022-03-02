// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetVodPlaylistRequest} extends {@link RequestModel}
 *
 * <p>GetVodPlaylistRequest</p>
 */
public class GetVodPlaylistRequest extends Request {
    @Path
    @NameInMap("channel")
    @Validation(required = true)
    private String channel;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("endTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("startTime")
    @Validation(required = true)
    private String startTime;

    private GetVodPlaylistRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.bucket = builder.bucket;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVodPlaylistRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetVodPlaylistRequest, Builder> {
        private String channel; 
        private String bucket; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetVodPlaylistRequest request) {
            super(request);
            this.channel = request.channel;
            this.bucket = request.bucket;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
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
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetVodPlaylistRequest build() {
            return new GetVodPlaylistRequest(this);
        } 

    } 

}
