// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectUserFaceByUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DetectUserFaceByUrlResponseBody</p>
 */
public class DetectUserFaceByUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DetectUserFaceByUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectUserFaceByUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DetectUserFaceByUrlResponseBody build() {
            return new DetectUserFaceByUrlResponseBody(this);
        } 

    } 

    public static class FaceRects extends TeaModel {
        @NameInMap("FaceRectsData")
        private java.util.List < String > faceRectsData;

        private FaceRects(Builder builder) {
            this.faceRectsData = builder.faceRectsData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceRects create() {
            return builder().build();
        }

        /**
         * @return faceRectsData
         */
        public java.util.List < String > getFaceRectsData() {
            return this.faceRectsData;
        }

        public static final class Builder {
            private java.util.List < String > faceRectsData; 

            /**
             * FaceRectsData.
             */
            public Builder faceRectsData(java.util.List < String > faceRectsData) {
                this.faceRectsData = faceRectsData;
                return this;
            }

            public FaceRects build() {
                return new FaceRects(this);
            } 

        } 

    }
    public static class Landmarks extends TeaModel {
        @NameInMap("LandmarksData")
        private java.util.List < String > landmarksData;

        private Landmarks(Builder builder) {
            this.landmarksData = builder.landmarksData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Landmarks create() {
            return builder().build();
        }

        /**
         * @return landmarksData
         */
        public java.util.List < String > getLandmarksData() {
            return this.landmarksData;
        }

        public static final class Builder {
            private java.util.List < String > landmarksData; 

            /**
             * LandmarksData.
             */
            public Builder landmarksData(java.util.List < String > landmarksData) {
                this.landmarksData = landmarksData;
                return this;
            }

            public Landmarks build() {
                return new Landmarks(this);
            } 

        } 

    }
    public static class DataData extends TeaModel {
        @NameInMap("Age")
        private Integer age;

        @NameInMap("BlurScore")
        private Float blurScore;

        @NameInMap("FaceProbability")
        private Float faceProbability;

        @NameInMap("FaceRects")
        private FaceRects faceRects;

        @NameInMap("Gender")
        private Integer gender;

        @NameInMap("GoodForLibrary")
        private Boolean goodForLibrary;

        @NameInMap("GoodForRecognition")
        private Boolean goodForRecognition;

        @NameInMap("Landmarks")
        private Landmarks landmarks;

        @NameInMap("OcclusionScore")
        private Float occlusionScore;

        @NameInMap("PoseScore")
        private Float poseScore;

        private DataData(Builder builder) {
            this.age = builder.age;
            this.blurScore = builder.blurScore;
            this.faceProbability = builder.faceProbability;
            this.faceRects = builder.faceRects;
            this.gender = builder.gender;
            this.goodForLibrary = builder.goodForLibrary;
            this.goodForRecognition = builder.goodForRecognition;
            this.landmarks = builder.landmarks;
            this.occlusionScore = builder.occlusionScore;
            this.poseScore = builder.poseScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return age
         */
        public Integer getAge() {
            return this.age;
        }

        /**
         * @return blurScore
         */
        public Float getBlurScore() {
            return this.blurScore;
        }

        /**
         * @return faceProbability
         */
        public Float getFaceProbability() {
            return this.faceProbability;
        }

        /**
         * @return faceRects
         */
        public FaceRects getFaceRects() {
            return this.faceRects;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return goodForLibrary
         */
        public Boolean getGoodForLibrary() {
            return this.goodForLibrary;
        }

        /**
         * @return goodForRecognition
         */
        public Boolean getGoodForRecognition() {
            return this.goodForRecognition;
        }

        /**
         * @return landmarks
         */
        public Landmarks getLandmarks() {
            return this.landmarks;
        }

        /**
         * @return occlusionScore
         */
        public Float getOcclusionScore() {
            return this.occlusionScore;
        }

        /**
         * @return poseScore
         */
        public Float getPoseScore() {
            return this.poseScore;
        }

        public static final class Builder {
            private Integer age; 
            private Float blurScore; 
            private Float faceProbability; 
            private FaceRects faceRects; 
            private Integer gender; 
            private Boolean goodForLibrary; 
            private Boolean goodForRecognition; 
            private Landmarks landmarks; 
            private Float occlusionScore; 
            private Float poseScore; 

            /**
             * Age.
             */
            public Builder age(Integer age) {
                this.age = age;
                return this;
            }

            /**
             * BlurScore.
             */
            public Builder blurScore(Float blurScore) {
                this.blurScore = blurScore;
                return this;
            }

            /**
             * FaceProbability.
             */
            public Builder faceProbability(Float faceProbability) {
                this.faceProbability = faceProbability;
                return this;
            }

            /**
             * FaceRects.
             */
            public Builder faceRects(FaceRects faceRects) {
                this.faceRects = faceRects;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * GoodForLibrary.
             */
            public Builder goodForLibrary(Boolean goodForLibrary) {
                this.goodForLibrary = goodForLibrary;
                return this;
            }

            /**
             * GoodForRecognition.
             */
            public Builder goodForRecognition(Boolean goodForRecognition) {
                this.goodForRecognition = goodForRecognition;
                return this;
            }

            /**
             * Landmarks.
             */
            public Builder landmarks(Landmarks landmarks) {
                this.landmarks = landmarks;
                return this;
            }

            /**
             * OcclusionScore.
             */
            public Builder occlusionScore(Float occlusionScore) {
                this.occlusionScore = occlusionScore;
                return this;
            }

            /**
             * PoseScore.
             */
            public Builder poseScore(Float poseScore) {
                this.poseScore = poseScore;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("data")
        private java.util.List < DataData> data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < DataData> data; 

            /**
             * data.
             */
            public Builder data(java.util.List < DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
