// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MediaConvertVolume} extends {@link TeaModel}
 *
 * <p>MediaConvertVolume</p>
 */
public class MediaConvertVolume extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IntegratedLoudnessTarget")
    private Integer integratedLoudnessTarget;

    @com.aliyun.core.annotation.NameInMap("Level")
    private Integer level;

    @com.aliyun.core.annotation.NameInMap("LoudnessRangeTarget")
    private Integer loudnessRangeTarget;

    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("TruePeak")
    private Integer truePeak;

    private MediaConvertVolume(Builder builder) {
        this.integratedLoudnessTarget = builder.integratedLoudnessTarget;
        this.level = builder.level;
        this.loudnessRangeTarget = builder.loudnessRangeTarget;
        this.method = builder.method;
        this.truePeak = builder.truePeak;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertVolume create() {
        return builder().build();
    }

    /**
     * @return integratedLoudnessTarget
     */
    public Integer getIntegratedLoudnessTarget() {
        return this.integratedLoudnessTarget;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return loudnessRangeTarget
     */
    public Integer getLoudnessRangeTarget() {
        return this.loudnessRangeTarget;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return truePeak
     */
    public Integer getTruePeak() {
        return this.truePeak;
    }

    public static final class Builder {
        private Integer integratedLoudnessTarget; 
        private Integer level; 
        private Integer loudnessRangeTarget; 
        private String method; 
        private Integer truePeak; 

        /**
         * IntegratedLoudnessTarget.
         */
        public Builder integratedLoudnessTarget(Integer integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * LoudnessRangeTarget.
         */
        public Builder loudnessRangeTarget(Integer loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }

        /**
         * Method.
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * TruePeak.
         */
        public Builder truePeak(Integer truePeak) {
            this.truePeak = truePeak;
            return this;
        }

        public MediaConvertVolume build() {
            return new MediaConvertVolume(this);
        } 

    } 

}
