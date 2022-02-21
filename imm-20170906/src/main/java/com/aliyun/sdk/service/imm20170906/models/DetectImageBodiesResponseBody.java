// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageBodiesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageBodiesResponseBody</p>
 */
public class DetectImageBodiesResponseBody extends TeaModel {
    @NameInMap("Bodies")
    private java.util.List < Bodies> bodies;

    @NameInMap("ImageUri")
    private String imageUri;

    @NameInMap("RequestId")
    private String requestId;

    private DetectImageBodiesResponseBody(Builder builder) {
        this.bodies = builder.bodies;
        this.imageUri = builder.imageUri;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageBodiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bodies
     */
    public java.util.List < Bodies> getBodies() {
        return this.bodies;
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
        private java.util.List < Bodies> bodies; 
        private String imageUri; 
        private String requestId; 

        /**
         * Bodies.
         */
        public Builder bodies(java.util.List < Bodies> bodies) {
            this.bodies = bodies;
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

        public DetectImageBodiesResponseBody build() {
            return new DetectImageBodiesResponseBody(this);
        } 

    } 

    public static class BodyBoundary extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Left")
        private Integer left;

        @NameInMap("Top")
        private Integer top;

        @NameInMap("Width")
        private Integer width;

        private BodyBoundary(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyBoundary create() {
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

            public BodyBoundary build() {
                return new BodyBoundary(this);
            } 

        } 

    }
    public static class Bodies extends TeaModel {
        @NameInMap("BodyBoundary")
        private BodyBoundary bodyBoundary;

        @NameInMap("BodyConfidence")
        private Float bodyConfidence;

        private Bodies(Builder builder) {
            this.bodyBoundary = builder.bodyBoundary;
            this.bodyConfidence = builder.bodyConfidence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bodies create() {
            return builder().build();
        }

        /**
         * @return bodyBoundary
         */
        public BodyBoundary getBodyBoundary() {
            return this.bodyBoundary;
        }

        /**
         * @return bodyConfidence
         */
        public Float getBodyConfidence() {
            return this.bodyConfidence;
        }

        public static final class Builder {
            private BodyBoundary bodyBoundary; 
            private Float bodyConfidence; 

            /**
             * BodyBoundary.
             */
            public Builder bodyBoundary(BodyBoundary bodyBoundary) {
                this.bodyBoundary = bodyBoundary;
                return this;
            }

            /**
             * BodyConfidence.
             */
            public Builder bodyConfidence(Float bodyConfidence) {
                this.bodyConfidence = bodyConfidence;
                return this;
            }

            public Bodies build() {
                return new Bodies(this);
            } 

        } 

    }
}
