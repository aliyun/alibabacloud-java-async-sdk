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
    @NameInMap("Audio")
    private LiveChannelAudio audio;

    @ParentIgnore("LiveChannelStat")
    @NameInMap("ConnectedTime")
    private String connectedTime;

    @ParentIgnore("LiveChannelStat")
    @NameInMap("RemoteAddr")
    private String remoteAddr;

    @ParentIgnore("LiveChannelStat")
    @NameInMap("Status")
    private String status;

    @ParentIgnore("LiveChannelStat")
    @NameInMap("Video")
    private LiveChannelVideo video;


    private GetLiveChannelStatResponseBody(Builder builder) {
        this.audio = builder.audio;
        this.connectedTime = builder.connectedTime;
        this.remoteAddr = builder.remoteAddr;
        this.status = builder.status;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveChannelStatResponseBody create() {
        return builder().build();
    }

    /**
     * @return audio
     */
    public LiveChannelAudio getAudio() {
        return this.audio;
    }

    /**
     * @return connectedTime
     */
    public String getConnectedTime() {
        return this.connectedTime;
    }

    /**
     * @return remoteAddr
     */
    public String getRemoteAddr() {
        return this.remoteAddr;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return video
     */
    public LiveChannelVideo getVideo() {
        return this.video;
    }

    public static final class Builder {
        private LiveChannelAudio audio; 
        private String connectedTime; 
        private String remoteAddr; 
        private String status; 
        private LiveChannelVideo video; 

        /**
         * <p>Audio.</p>
         */
        public Builder audio(LiveChannelAudio audio) {
            this.audio = audio;
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
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Video.</p>
         */
        public Builder video(LiveChannelVideo video) {
            this.video = video;
            return this;
        }

        public GetLiveChannelStatResponseBody build() {
            return new GetLiveChannelStatResponseBody(this);
        } 

    } 

}
