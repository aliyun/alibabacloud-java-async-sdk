// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ImageScore} extends {@link TeaModel}
 *
 * <p>ImageScore</p>
 */
public class ImageScore extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OverallQualityScore")
    private Float overallQualityScore;

    private ImageScore(Builder builder) {
        this.overallQualityScore = builder.overallQualityScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageScore create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return overallQualityScore
     */
    public Float getOverallQualityScore() {
        return this.overallQualityScore;
    }

    public static final class Builder {
        private Float overallQualityScore; 

        private Builder() {
        } 

        private Builder(ImageScore model) {
            this.overallQualityScore = model.overallQualityScore;
        } 

        /**
         * OverallQualityScore.
         */
        public Builder overallQualityScore(Float overallQualityScore) {
            this.overallQualityScore = overallQualityScore;
            return this;
        }

        public ImageScore build() {
            return new ImageScore(this);
        } 

    } 

}
