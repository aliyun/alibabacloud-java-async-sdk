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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(MediaConvertVolume model) {
            this.integratedLoudnessTarget = model.integratedLoudnessTarget;
            this.level = model.level;
            this.loudnessRangeTarget = model.loudnessRangeTarget;
            this.method = model.method;
            this.truePeak = model.truePeak;
        } 

        /**
         * <p>The target volume.</p>
         * <ul>
         * <li>This parameter takes effect only when Method is set to dynamic.</li>
         * <li>Unit: dB.</li>
         * <li>Value range: -70 to -5.</li>
         * <li>Default value: -6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-6</p>
         */
        public Builder integratedLoudnessTarget(Integer integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }

        /**
         * <p>The volume increase relative to the input audio.</p>
         * <ul>
         * <li>This parameter takes effect only when Method is set to linear.</li>
         * <li>Unit: dB.</li>
         * <li>Value range: up to 20 dB.</li>
         * <li>Default value: -20 dB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-20</p>
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The fluctuation range relative to the target volume.</p>
         * <ul>
         * <li>This parameter takes effect only when Method is set to dynamic.</li>
         * <li>Unit: dB.</li>
         * <li>Value range: 1 to 20.</li>
         * <li>Default value: 8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder loudnessRangeTarget(Integer loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }

        /**
         * <p>The volume adjustment method.</p>
         * <ul>
         * <li>auto: Automatic adjustment.</li>
         * <li>dynamic: Dynamic adjustment.</li>
         * <li>linear: Linear adjustment.</li>
         * <li>Default value: dynamic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dynamic</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The peak volume.</p>
         * <ul>
         * <li>This parameter takes effect only when Method is set to dynamic.</li>
         * <li>Unit: dB.</li>
         * <li>Value range: -9 to 0.</li>
         * <li>Default value: -1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
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
