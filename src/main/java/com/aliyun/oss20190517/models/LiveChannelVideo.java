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
    @NameInMap("Bandwidth")
    private Long bandwidth;

    @NameInMap("Codec")
    private String codec;

    @NameInMap("FrameRate")
    private Long frameRate;

    @NameInMap("Height")
    private Long height;

    @NameInMap("Width")
    private Long width;


    private LiveChannelVideo(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.codec = builder.codec;
        this.frameRate = builder.frameRate;
        this.height = builder.height;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelVideo create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return codec
     */
    public String getCodec() {
        return this.codec;
    }

    /**
     * @return frameRate
     */
    public Long getFrameRate() {
        return this.frameRate;
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    /**
     * @return width
     */
    public Long getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Long bandwidth; 
        private String codec; 
        private Long frameRate; 
        private Long height; 
        private Long width; 

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
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        public LiveChannelVideo build() {
            return new LiveChannelVideo(this);
        } 

    } 

}
