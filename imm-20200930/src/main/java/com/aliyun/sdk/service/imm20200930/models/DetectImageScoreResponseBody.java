// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageScoreResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageScoreResponseBody</p>
 */
public class DetectImageScoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageScore")
    private ImageScore imageScore;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageScoreResponseBody(Builder builder) {
        this.imageScore = builder.imageScore;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageScoreResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageScore
     */
    public ImageScore getImageScore() {
        return this.imageScore;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageScore imageScore; 
        private String requestId; 

        /**
         * ImageScore.
         */
        public Builder imageScore(ImageScore imageScore) {
            this.imageScore = imageScore;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageScoreResponseBody build() {
            return new DetectImageScoreResponseBody(this);
        } 

    } 

    public static class ImageScore extends TeaModel {
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

        /**
         * @return overallQualityScore
         */
        public Float getOverallQualityScore() {
            return this.overallQualityScore;
        }

        public static final class Builder {
            private Float overallQualityScore; 

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
}
