// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageCroppingSuggestionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageCroppingSuggestionsResponseBody</p>
 */
public class GetImageCroppingSuggestionsResponseBody extends TeaModel {
    @NameInMap("CroppingSuggestions")
    private java.util.List < CroppingSuggestions> croppingSuggestions;

    @NameInMap("ImageUri")
    private String imageUri;

    @NameInMap("RequestId")
    private String requestId;

    private GetImageCroppingSuggestionsResponseBody(Builder builder) {
        this.croppingSuggestions = builder.croppingSuggestions;
        this.imageUri = builder.imageUri;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageCroppingSuggestionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return croppingSuggestions
     */
    public java.util.List < CroppingSuggestions> getCroppingSuggestions() {
        return this.croppingSuggestions;
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
        private java.util.List < CroppingSuggestions> croppingSuggestions; 
        private String imageUri; 
        private String requestId; 

        /**
         * CroppingSuggestions.
         */
        public Builder croppingSuggestions(java.util.List < CroppingSuggestions> croppingSuggestions) {
            this.croppingSuggestions = croppingSuggestions;
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

        public GetImageCroppingSuggestionsResponseBody build() {
            return new GetImageCroppingSuggestionsResponseBody(this);
        } 

    } 

    public static class CroppingBoundary extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Left")
        private Integer left;

        @NameInMap("Top")
        private Integer top;

        @NameInMap("Width")
        private Integer width;

        private CroppingBoundary(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CroppingBoundary create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private Integer left; 
            private Integer top; 
            private Integer width; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CroppingBoundary build() {
                return new CroppingBoundary(this);
            } 

        } 

    }
    public static class CroppingSuggestions extends TeaModel {
        @NameInMap("AspectRatio")
        private String aspectRatio;

        @NameInMap("CroppingBoundary")
        private CroppingBoundary croppingBoundary;

        @NameInMap("Score")
        private Float score;

        private CroppingSuggestions(Builder builder) {
            this.aspectRatio = builder.aspectRatio;
            this.croppingBoundary = builder.croppingBoundary;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CroppingSuggestions create() {
            return builder().build();
        }

        /**
         * @return aspectRatio
         */
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        /**
         * @return croppingBoundary
         */
        public CroppingBoundary getCroppingBoundary() {
            return this.croppingBoundary;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private String aspectRatio; 
            private CroppingBoundary croppingBoundary; 
            private Float score; 

            /**
             * AspectRatio.
             */
            public Builder aspectRatio(String aspectRatio) {
                this.aspectRatio = aspectRatio;
                return this;
            }

            /**
             * CroppingBoundary.
             */
            public Builder croppingBoundary(CroppingBoundary croppingBoundary) {
                this.croppingBoundary = croppingBoundary;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            public CroppingSuggestions build() {
                return new CroppingSuggestions(this);
            } 

        } 

    }
}
