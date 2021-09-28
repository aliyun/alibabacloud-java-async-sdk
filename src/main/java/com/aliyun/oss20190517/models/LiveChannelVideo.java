// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannelVideo} extends {@link TeaModel}
 *
 * <p>LiveChannelVideo</p>
 */
public class LiveChannelVideo extends TeaModel {
    @NameInMap("Width")
    private Long width;

    @NameInMap("Height")
    private Long height;

    @NameInMap("FrameRate")
    private Long frameRate;

    @NameInMap("Bandwidth")
    private Long bandwidth;

    @NameInMap("Codec")
    private String codec;


    private LiveChannelVideo(Builder builder) {
        this.width = builder.width;
        this.height = builder.height;
        this.frameRate = builder.frameRate;
        this.bandwidth = builder.bandwidth;
        this.codec = builder.codec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelVideo create() {
        return builder().build();
    }

    /**
     * @return width
     */
    public Long width() {
        return this.width;
    }

    /**
     * @return height
     */
    public Long height() {
        return this.height;
    }

    /**
     * @return frameRate
     */
    public Long frameRate() {
        return this.frameRate;
    }

    /**
     * @return bandwidth
     */
    public Long bandwidth() {
        return this.bandwidth;
    }

    /**
     * @return codec
     */
    public String codec() {
        return this.codec;
    }

    public static final class Builder {
        private Long width; 
        private Long height; 
        private Long frameRate; 
        private Long bandwidth; 
        private String codec; 

        /**
         * <p>description</p>
         */
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder frameRate(Long frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder codec(String codec) {
            this.codec = codec;
            return this;
        }

        public LiveChannelVideo build() {
            return new LiveChannelVideo(this);
        } 

    } 

}
