// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannelAudio} extends {@link TeaModel}
 *
 * <p>LiveChannelAudio</p>
 */
public class LiveChannelAudio extends TeaModel {
    @NameInMap("Bandwidth")
    private Long bandwidth;

    @NameInMap("SampleRate")
    private Long sampleRate;

    @NameInMap("Codec")
    private String codec;


    private LiveChannelAudio(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.sampleRate = builder.sampleRate;
        this.codec = builder.codec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelAudio create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public Long bandwidth() {
        return this.bandwidth;
    }

    /**
     * @return sampleRate
     */
    public Long sampleRate() {
        return this.sampleRate;
    }

    /**
     * @return codec
     */
    public String codec() {
        return this.codec;
    }

    public static final class Builder {
        private Long bandwidth; 
        private Long sampleRate; 
        private String codec; 

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
        public Builder sampleRate(Long sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder codec(String codec) {
            this.codec = codec;
            return this;
        }

        public LiveChannelAudio build() {
            return new LiveChannelAudio(this);
        } 

    } 

}
