// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageQualityResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageQualityResponseBody</p>
 */
public class GetImageQualityResponseBody extends TeaModel {
    @NameInMap("ImageQuality")
    private ImageQuality imageQuality;

    @NameInMap("ImageUri")
    private String imageUri;

    @NameInMap("RequestId")
    private String requestId;

    private GetImageQualityResponseBody(Builder builder) {
        this.imageQuality = builder.imageQuality;
        this.imageUri = builder.imageUri;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageQualityResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageQuality
     */
    public ImageQuality getImageQuality() {
        return this.imageQuality;
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageQuality imageQuality; 
        private String imageUri; 
        private String requestId; 

        /**
         * ImageQuality.
         */
        public Builder imageQuality(ImageQuality imageQuality) {
            this.imageQuality = imageQuality;
            return this;
        }

        /**
         * ImageUri.
         */
        public Builder imageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetImageQualityResponseBody build() {
            return new GetImageQualityResponseBody(this);
        } 

    } 

    public static class ImageQuality extends TeaModel {
        @NameInMap("Clarity")
        private Float clarity;

        @NameInMap("ClarityScore")
        private Float clarityScore;

        @NameInMap("Color")
        private Float color;

        @NameInMap("ColorScore")
        private Float colorScore;

        @NameInMap("CompositionScore")
        private Float compositionScore;

        @NameInMap("Contrast")
        private Float contrast;

        @NameInMap("ContrastScore")
        private Float contrastScore;

        @NameInMap("Exposure")
        private Float exposure;

        @NameInMap("ExposureScore")
        private Float exposureScore;

        @NameInMap("OverallScore")
        private Float overallScore;

        private ImageQuality(Builder builder) {
            this.clarity = builder.clarity;
            this.clarityScore = builder.clarityScore;
            this.color = builder.color;
            this.colorScore = builder.colorScore;
            this.compositionScore = builder.compositionScore;
            this.contrast = builder.contrast;
            this.contrastScore = builder.contrastScore;
            this.exposure = builder.exposure;
            this.exposureScore = builder.exposureScore;
            this.overallScore = builder.overallScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageQuality create() {
            return builder().build();
        }

        /**
         * @return clarity
         */
        public Float getClarity() {
            return this.clarity;
        }

        /**
         * @return clarityScore
         */
        public Float getClarityScore() {
            return this.clarityScore;
        }

        /**
         * @return color
         */
        public Float getColor() {
            return this.color;
        }

        /**
         * @return colorScore
         */
        public Float getColorScore() {
            return this.colorScore;
        }

        /**
         * @return compositionScore
         */
        public Float getCompositionScore() {
            return this.compositionScore;
        }

        /**
         * @return contrast
         */
        public Float getContrast() {
            return this.contrast;
        }

        /**
         * @return contrastScore
         */
        public Float getContrastScore() {
            return this.contrastScore;
        }

        /**
         * @return exposure
         */
        public Float getExposure() {
            return this.exposure;
        }

        /**
         * @return exposureScore
         */
        public Float getExposureScore() {
            return this.exposureScore;
        }

        /**
         * @return overallScore
         */
        public Float getOverallScore() {
            return this.overallScore;
        }

        public static final class Builder {
            private Float clarity; 
            private Float clarityScore; 
            private Float color; 
            private Float colorScore; 
            private Float compositionScore; 
            private Float contrast; 
            private Float contrastScore; 
            private Float exposure; 
            private Float exposureScore; 
            private Float overallScore; 

            /**
             * Clarity.
             */
            public Builder clarity(Float clarity) {
                this.clarity = clarity;
                return this;
            }

            /**
             * ClarityScore.
             */
            public Builder clarityScore(Float clarityScore) {
                this.clarityScore = clarityScore;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(Float color) {
                this.color = color;
                return this;
            }

            /**
             * ColorScore.
             */
            public Builder colorScore(Float colorScore) {
                this.colorScore = colorScore;
                return this;
            }

            /**
             * CompositionScore.
             */
            public Builder compositionScore(Float compositionScore) {
                this.compositionScore = compositionScore;
                return this;
            }

            /**
             * Contrast.
             */
            public Builder contrast(Float contrast) {
                this.contrast = contrast;
                return this;
            }

            /**
             * ContrastScore.
             */
            public Builder contrastScore(Float contrastScore) {
                this.contrastScore = contrastScore;
                return this;
            }

            /**
             * Exposure.
             */
            public Builder exposure(Float exposure) {
                this.exposure = exposure;
                return this;
            }

            /**
             * ExposureScore.
             */
            public Builder exposureScore(Float exposureScore) {
                this.exposureScore = exposureScore;
                return this;
            }

            /**
             * OverallScore.
             */
            public Builder overallScore(Float overallScore) {
                this.overallScore = overallScore;
                return this;
            }

            public ImageQuality build() {
                return new ImageQuality(this);
            } 

        } 

    }
}
