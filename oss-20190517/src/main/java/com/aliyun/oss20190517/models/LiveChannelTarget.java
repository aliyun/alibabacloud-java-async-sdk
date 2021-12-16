// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannelTarget} extends {@link TeaModel}
 *
 * <p>LiveChannelTarget</p>
 */
public class LiveChannelTarget extends TeaModel {
    @NameInMap("FragCount")
    private Long fragCount;

    @NameInMap("FragDuration")
    private Long fragDuration;

    @NameInMap("PlaylistName")
    private String playlistName;

    @NameInMap("Type")
    private String type;


    private LiveChannelTarget(Builder builder) {
        this.fragCount = builder.fragCount;
        this.fragDuration = builder.fragDuration;
        this.playlistName = builder.playlistName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelTarget create() {
        return builder().build();
    }

    /**
     * @return fragCount
     */
    public Long getFragCount() {
        return this.fragCount;
    }

    /**
     * @return fragDuration
     */
    public Long getFragDuration() {
        return this.fragDuration;
    }

    /**
     * @return playlistName
     */
    public String getPlaylistName() {
        return this.playlistName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long fragCount; 
        private Long fragDuration; 
        private String playlistName; 
        private String type; 

        /**
         * <p>description</p>
         */
        public Builder fragCount(Long fragCount) {
            this.fragCount = fragCount;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder fragDuration(Long fragDuration) {
            this.fragDuration = fragDuration;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder playlistName(String playlistName) {
            this.playlistName = playlistName;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public LiveChannelTarget build() {
            return new LiveChannelTarget(this);
        } 

    } 

}
