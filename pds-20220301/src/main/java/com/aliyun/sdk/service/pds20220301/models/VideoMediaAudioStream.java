// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VideoMediaAudioStream} extends {@link TeaModel}
 *
 * <p>VideoMediaAudioStream</p>
 */
public class VideoMediaAudioStream extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bit_rate")
    private String bitRate;

    @com.aliyun.core.annotation.NameInMap("code_name")
    private String codeName;

    @com.aliyun.core.annotation.NameInMap("duration")
    private String duration;

    private VideoMediaAudioStream(Builder builder) {
        this.bitRate = builder.bitRate;
        this.codeName = builder.codeName;
        this.duration = builder.duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoMediaAudioStream create() {
        return builder().build();
    }

    /**
     * @return bitRate
     */
    public String getBitRate() {
        return this.bitRate;
    }

    /**
     * @return codeName
     */
    public String getCodeName() {
        return this.codeName;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    public static final class Builder {
        private String bitRate; 
        private String codeName; 
        private String duration; 

        /**
         * bit_rate.
         */
        public Builder bitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }

        /**
         * code_name.
         */
        public Builder codeName(String codeName) {
            this.codeName = codeName;
            return this;
        }

        /**
         * duration.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        public VideoMediaAudioStream build() {
            return new VideoMediaAudioStream(this);
        } 

    } 

}
