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
    @Path
    @NameInMap("channel")
    private String channel;

    @Path
    @NameInMap("playlist")
    private String playlist;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("endTime")
    private String endTime;

    @Query
    @NameInMap("startTime")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String channel; 
        private String playlist; 
        private String bucket; 
        private String endTime; 
        private String startTime; 

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
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
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
