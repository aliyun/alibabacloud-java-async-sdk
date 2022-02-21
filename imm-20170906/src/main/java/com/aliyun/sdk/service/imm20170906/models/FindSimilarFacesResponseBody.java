// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindSimilarFacesResponseBody} extends {@link TeaModel}
 *
 * <p>FindSimilarFacesResponseBody</p>
 */
public class FindSimilarFacesResponseBody extends TeaModel {
    @NameInMap("Faces")
    private java.util.List < Faces> faces;

    @NameInMap("RequestId")
    private String requestId;

    private FindSimilarFacesResponseBody(Builder builder) {
        this.faces = builder.faces;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindSimilarFacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return faces
     */
    public java.util.List < Faces> getFaces() {
        return this.faces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Faces> faces; 
        private String requestId; 

        /**
         * Faces.
         */
        public Builder faces(java.util.List < Faces> faces) {
            this.faces = faces;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindSimilarFacesResponseBody build() {
            return new FindSimilarFacesResponseBody(this);
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
    public static class SimilarFacesFaceAttributes extends TeaModel {
        @NameInMap("FaceBoundary")
        private FaceAttributesFaceBoundary faceBoundary;

        private SimilarFacesFaceAttributes(Builder builder) {
            this.faceBoundary = builder.faceBoundary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimilarFacesFaceAttributes create() {
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

            public SimilarFacesFaceAttributes build() {
                return new SimilarFacesFaceAttributes(this);
            } 

        } 

    }
    public static class SimilarFaces extends TeaModel {
        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("FaceAttributes")
        private SimilarFacesFaceAttributes faceAttributes;

        @NameInMap("FaceId")
        private String faceId;

        @NameInMap("ImageUri")
        private String imageUri;

        @NameInMap("Similarity")
        private Float similarity;

        private SimilarFaces(Builder builder) {
            this.externalId = builder.externalId;
            this.faceAttributes = builder.faceAttributes;
            this.faceId = builder.faceId;
            this.imageUri = builder.imageUri;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimilarFaces create() {
            return builder().build();
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return faceAttributes
         */
        public SimilarFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        /**
         * @return imageUri
         */
        public String getImageUri() {
            return this.imageUri;
        }

        /**
         * @return similarity
         */
        public Float getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private String externalId; 
            private SimilarFacesFaceAttributes faceAttributes; 
            private String faceId; 
            private String imageUri; 
            private Float similarity; 

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * FaceAttributes.
             */
            public Builder faceAttributes(SimilarFacesFaceAttributes faceAttributes) {
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

            /**
             * ImageUri.
             */
            public Builder imageUri(String imageUri) {
                this.imageUri = imageUri;
                return this;
            }

            /**
             * Similarity.
             */
            public Builder similarity(Float similarity) {
                this.similarity = similarity;
                return this;
            }

            public SimilarFaces build() {
                return new SimilarFaces(this);
            } 

        } 

    }
    public static class Faces extends TeaModel {
        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("FaceAttributes")
        private FaceAttributes faceAttributes;

        @NameInMap("FaceId")
        private String faceId;

        @NameInMap("ImageUri")
        private String imageUri;

        @NameInMap("SimilarFaces")
        private java.util.List < SimilarFaces> similarFaces;

        @NameInMap("Similarity")
        private Float similarity;

        private Faces(Builder builder) {
            this.externalId = builder.externalId;
            this.faceAttributes = builder.faceAttributes;
            this.faceId = builder.faceId;
            this.imageUri = builder.imageUri;
            this.similarFaces = builder.similarFaces;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Faces create() {
            return builder().build();
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
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

        /**
         * @return imageUri
         */
        public String getImageUri() {
            return this.imageUri;
        }

        /**
         * @return similarFaces
         */
        public java.util.List < SimilarFaces> getSimilarFaces() {
            return this.similarFaces;
        }

        /**
         * @return similarity
         */
        public Float getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private String externalId; 
            private FaceAttributes faceAttributes; 
            private String faceId; 
            private String imageUri; 
            private java.util.List < SimilarFaces> similarFaces; 
            private Float similarity; 

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

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

            /**
             * ImageUri.
             */
            public Builder imageUri(String imageUri) {
                this.imageUri = imageUri;
                return this;
            }

            /**
             * SimilarFaces.
             */
            public Builder similarFaces(java.util.List < SimilarFaces> similarFaces) {
                this.similarFaces = similarFaces;
                return this;
            }

            /**
             * Similarity.
             */
            public Builder similarity(Float similarity) {
                this.similarity = similarity;
                return this;
            }

            public Faces build() {
                return new Faces(this);
            } 

        } 

    }
}
