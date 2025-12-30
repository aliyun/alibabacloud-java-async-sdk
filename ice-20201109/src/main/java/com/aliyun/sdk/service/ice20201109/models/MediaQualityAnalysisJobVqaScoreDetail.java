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
 * {@link MediaQualityAnalysisJobVqaScoreDetail} extends {@link TeaModel}
 *
 * <p>MediaQualityAnalysisJobVqaScoreDetail</p>
 */
public class MediaQualityAnalysisJobVqaScoreDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IntensityValue")
    private Double intensityValue;

    @com.aliyun.core.annotation.NameInMap("PerceptualScore")
    private Double perceptualScore;

    private MediaQualityAnalysisJobVqaScoreDetail(Builder builder) {
        this.intensityValue = builder.intensityValue;
        this.perceptualScore = builder.perceptualScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaQualityAnalysisJobVqaScoreDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intensityValue
     */
    public Double getIntensityValue() {
        return this.intensityValue;
    }

    /**
     * @return perceptualScore
     */
    public Double getPerceptualScore() {
        return this.perceptualScore;
    }

    public static final class Builder {
        private Double intensityValue; 
        private Double perceptualScore; 

        private Builder() {
        } 

        private Builder(MediaQualityAnalysisJobVqaScoreDetail model) {
            this.intensityValue = model.intensityValue;
            this.perceptualScore = model.perceptualScore;
        } 

        /**
         * IntensityValue.
         */
        public Builder intensityValue(Double intensityValue) {
            this.intensityValue = intensityValue;
            return this;
        }

        /**
         * PerceptualScore.
         */
        public Builder perceptualScore(Double perceptualScore) {
            this.perceptualScore = perceptualScore;
            return this;
        }

        public MediaQualityAnalysisJobVqaScoreDetail build() {
            return new MediaQualityAnalysisJobVqaScoreDetail(this);
        } 

    } 

}
