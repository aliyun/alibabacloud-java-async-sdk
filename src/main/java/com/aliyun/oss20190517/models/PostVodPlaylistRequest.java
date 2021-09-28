// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PostVodPlaylistRequest} extends {@link RequestModel}
 *
 * <p>PostVodPlaylistRequest</p>
 */
public class PostVodPlaylistRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("channel")
    private String channel;

    @Path
    @NameInMap("playlist")
    private String playlist;

    @Query
    @NameInMap("endTime")
    private String endTime;

    @Query
    @NameInMap("startTime")
    private String startTime;


    private PostVodPlaylistRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.channel = builder.channel;
        this.playlist = builder.playlist;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostVodPlaylistRequest create() {
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
     * @return playlist
     */
    public String playlist() {
        return this.playlist;
    }

    /**
     * @return endTime
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String startTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<PostVodPlaylistRequest.Builder> {
        private String bucket; 
        private String channel; 
        private String playlist; 
        private String endTime; 
        private String startTime; 

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
         * <p>playlist.</p>
         */
        public Builder playlist(String playlist) {
            this.putPathParameter("playlist", playlist);
            this.playlist = playlist;
            return this;
        }

        /**
         * <p>endTime.</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>startTime.</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        public PostVodPlaylistRequest build() {
            return new PostVodPlaylistRequest(this);
        } 

    } 

}
