// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link LiveChannelAudio} extends {@link TeaModel}
 *
 * <p>LiveChannelAudio</p>
 */
public class LiveChannelAudio extends TeaModel {
    @NameInMap("Bandwidth")
    private Long bandwidth;

    @NameInMap("Codec")
    private String codec;

    @NameInMap("SampleRate")
    private Long sampleRate;

    private LiveChannelAudio(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.codec = builder.codec;
        this.sampleRate = builder.sampleRate;
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
     * @return sampleRate
     */
    public Long getSampleRate() {
        return this.sampleRate;
    }

    public static final class Builder {
        private Long bandwidth; 
        private String codec; 
        private Long sampleRate; 

        /**
         * description
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * description
         */
        public Builder codec(String codec) {
            this.codec = codec;
            return this;
        }

        /**
         * description
         */
        public Builder sampleRate(Long sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public LiveChannelAudio build() {
            return new LiveChannelAudio(this);
        } 

    } 

}
