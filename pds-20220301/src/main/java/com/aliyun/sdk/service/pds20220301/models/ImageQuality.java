// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageQuality} extends {@link TeaModel}
 *
 * <p>ImageQuality</p>
 */
public class ImageQuality extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("overall_score")
    private Double overallScore;

    private ImageQuality(Builder builder) {
        this.overallScore = builder.overallScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageQuality create() {
        return builder().build();
    }

    /**
     * @return overallScore
     */
    public Double getOverallScore() {
        return this.overallScore;
    }

    public static final class Builder {
        private Double overallScore; 

        /**
         * overall_score.
         */
        public Builder overallScore(Double overallScore) {
            this.overallScore = overallScore;
            return this;
        }

        public ImageQuality build() {
            return new ImageQuality(this);
        } 

    } 

}
