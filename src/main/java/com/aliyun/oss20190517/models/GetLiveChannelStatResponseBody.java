// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLiveChannelStatResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveChannelStatResponseBody</p>
 */
public class GetLiveChannelStatResponseBody extends TeaModel {
    @ParentIgnore("LiveChannelStat")
    @NameInMap("Status")
    private String status;

    @ParentIgnore("LiveChannelStat")
    @NameInMap("ConnectedTime")
    private String connectedTime;

    @ParentIgnore("LiveChannelStat")
    @NameInMap("RemoteAddr")
    private String remoteAddr;

    @ParentIgnore("LiveChannelStat")
    @NameInMap("Video")
    private LiveChannelVideo video;

    @ParentIgnore("LiveChannelStat")
    @NameInMap("Audio")
    private LiveChannelAudio audio;


    private GetLiveChannelStatResponseBody(Builder builder) {
        this.status = builder.status;
        this.connectedTime = builder.connectedTime;
        this.remoteAddr = builder.remoteAddr;
        this.video = builder.video;
        this.audio = builder.audio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveChannelStatResponseBody create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String status() {
        return this.status;
    }

    /**
     * @return connectedTime
     */
    public String connectedTime() {
        return this.connectedTime;
    }

    /**
     * @return remoteAddr
     */
    public String remoteAddr() {
        return this.remoteAddr;
    }

    /**
     * @return video
     */
    public LiveChannelVideo video() {
        return this.video;
    }

    /**
     * @return audio
     */
    public LiveChannelAudio audio() {
        return this.audio;
    }

    public static final class Builder {
        private String status; 
        private String connectedTime; 
        private String remoteAddr; 
        private LiveChannelVideo video; 
        private LiveChannelAudio audio; 

        /**
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>ConnectedTime.</p>
         */
        public Builder connectedTime(String connectedTime) {
            this.connectedTime = connectedTime;
            return this;
        }

        /**
         * <p>RemoteAddr.</p>
         */
        public Builder remoteAddr(String remoteAddr) {
            this.remoteAddr = remoteAddr;
            return this;
        }

        /**
         * <p>Video.</p>
         */
        public Builder video(LiveChannelVideo video) {
            this.video = video;
            return this;
        }

        /**
         * <p>Audio.</p>
         */
        public Builder audio(LiveChannelAudio audio) {
            this.audio = audio;
            return this;
        }

        public GetLiveChannelStatResponseBody build() {
            return new GetLiveChannelStatResponseBody(this);
        } 

    } 

}
