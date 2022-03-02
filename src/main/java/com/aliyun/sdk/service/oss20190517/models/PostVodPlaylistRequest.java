// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PostVodPlaylistRequest} extends {@link RequestModel}
 *
 * <p>PostVodPlaylistRequest</p>
 */
public class PostVodPlaylistRequest extends Request {
    @Path
    @NameInMap("channel")
    @Validation(required = true)
    private String channel;

    @Path
    @NameInMap("playlist")
    @Validation(required = true)
    private String playlist;

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

    private PostVodPlaylistRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.playlist = builder.playlist;
        this.bucket = builder.bucket;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostVodPlaylistRequest create() {
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
     * @return playlist
     */
    public String getPlaylist() {
        return this.playlist;
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

    public static final class Builder extends Request.Builder<PostVodPlaylistRequest, Builder> {
        private String channel; 
        private String playlist; 
        private String bucket; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(PostVodPlaylistRequest request) {
            super(request);
            this.channel = request.channel;
            this.playlist = request.playlist;
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
         * playlist.
         */
        public Builder playlist(String playlist) {
            this.putPathParameter("playlist", playlist);
            this.playlist = playlist;
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
        public PostVodPlaylistRequest build() {
            return new PostVodPlaylistRequest(this);
        } 

    } 

}
