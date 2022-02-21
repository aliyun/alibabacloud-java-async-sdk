// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompareImageFacesResponseBody} extends {@link TeaModel}
 *
 * <p>CompareImageFacesResponseBody</p>
 */
public class CompareImageFacesResponseBody extends TeaModel {
    @NameInMap("FaceA")
    private FaceA faceA;

    @NameInMap("FaceB")
    private FaceB faceB;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    @NameInMap("Similarity")
    private Float similarity;

    private CompareImageFacesResponseBody(Builder builder) {
        this.faceA = builder.faceA;
        this.faceB = builder.faceB;
        this.requestId = builder.requestId;
        this.setId = builder.setId;
        this.similarity = builder.similarity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareImageFacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return faceA
     */
    public FaceA getFaceA() {
        return this.faceA;
    }

    /**
     * @return faceB
     */
    public FaceB getFaceB() {
        return this.faceB;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return similarity
     */
    public Float getSimilarity() {
        return this.similarity;
    }

    public static final class Builder {
        private FaceA faceA; 
        private FaceB faceB; 
        private String requestId; 
        private String setId; 
        private Float similarity; 

        /**
         * FaceA.
         */
        public Builder faceA(FaceA faceA) {
            this.faceA = faceA;
            return this;
        }

        /**
         * FaceB.
         */
        public Builder faceB(FaceB faceB) {
            this.faceB = faceB;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.setId = setId;
            return this;
        }

        /**
         * Similarity.
         */
        public Builder similarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }

        public CompareImageFacesResponseBody build() {
            return new CompareImageFacesResponseBody(this);
        } 

    } 

    public static class FaceBoundary extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Left")
        private Integer left;

        @NameInMap("Top")
        private Integer top;

        @NameInMap("Width")
        private Integer width;

        private FaceBoundary(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceBoundary create() {
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

            public FaceBoundary build() {
                return new FaceBoundary(this);
            } 

        } 

    }
    public static class FaceAttributes extends TeaModel {
        @NameInMap("FaceBoundary")
        private FaceBoundary faceBoundary;

        private FaceAttributes(Builder builder) {
            this.faceBoundary = builder.faceBoundary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceAttributes create() {
            return builder().build();
        }

        /**
         * @return faceBoundary
         */
        public FaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public static final class Builder {
            private FaceBoundary faceBoundary; 

            /**
             * FaceBoundary.
             */
            public Builder faceBoundary(FaceBoundary faceBoundary) {
                this.faceBoundary = faceBoundary;
                return this;
            }

            public FaceAttributes build() {
                return new FaceAttributes(this);
            } 

        } 

    }
    public static class FaceA extends TeaModel {
        @NameInMap("FaceAttributes")
        private FaceAttributes faceAttributes;

        @NameInMap("FaceId")
        private String faceId;

        private FaceA(Builder builder) {
            this.faceAttributes = builder.faceAttributes;
            this.faceId = builder.faceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceA create() {
            return builder().build();
        }

        /**
         * @return faceAttributes
         */
        public FaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        public static final class Builder {
            private FaceAttributes faceAttributes; 
            private String faceId; 

            /**
             * FaceAttributes.
             */
            public Builder faceAttributes(FaceAttributes faceAttributes) {
                this.faceAttributes = faceAttributes;
                return this;
            }

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            public FaceA build() {
                return new FaceA(this);
            } 

        } 

    }
    public static class FaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Left")
        private Integer left;

        @NameInMap("Top")
        private Integer top;

        @NameInMap("Width")
        private Integer width;

        private FaceAttributesFaceBoundary(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceAttributesFaceBoundary create() {
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

            public FaceAttributesFaceBoundary build() {
                return new FaceAttributesFaceBoundary(this);
            } 

        } 

    }
    public static class FaceBFaceAttributes extends TeaModel {
        @NameInMap("FaceBoundary")
        private FaceAttributesFaceBoundary faceBoundary;

        private FaceBFaceAttributes(Builder builder) {
            this.faceBoundary = builder.faceBoundary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceBFaceAttributes create() {
            return builder().build();
        }

        /**
         * @return faceBoundary
         */
        public FaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public static final class Builder {
            private FaceAttributesFaceBoundary faceBoundary; 

            /**
             * FaceBoundary.
             */
            public Builder faceBoundary(FaceAttributesFaceBoundary faceBoundary) {
                this.faceBoundary = faceBoundary;
                return this;
            }

            public FaceBFaceAttributes build() {
                return new FaceBFaceAttributes(this);
            } 

        } 

    }
    public static class FaceB extends TeaModel {
        @NameInMap("FaceAttributes")
        private FaceBFaceAttributes faceAttributes;

        @NameInMap("FaceId")
        private String faceId;

        private FaceB(Builder builder) {
            this.faceAttributes = builder.faceAttributes;
            this.faceId = builder.faceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceB create() {
            return builder().build();
        }

        /**
         * @return faceAttributes
         */
        public FaceBFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        public static final class Builder {
            private FaceBFaceAttributes faceAttributes; 
            private String faceId; 

            /**
             * FaceAttributes.
             */
            public Builder faceAttributes(FaceBFaceAttributes faceAttributes) {
                this.faceAttributes = faceAttributes;
                return this;
            }

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            public FaceB build() {
                return new FaceB(this);
            } 

        } 

    }
}
