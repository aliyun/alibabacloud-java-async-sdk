// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageFacesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageFacesResponseBody</p>
 */
public class DetectImageFacesResponseBody extends TeaModel {
    @NameInMap("Faces")
    private java.util.List < Faces> faces;

    @NameInMap("ImageUri")
    private String imageUri;

    @NameInMap("RequestId")
    private String requestId;

    private DetectImageFacesResponseBody(Builder builder) {
        this.faces = builder.faces;
        this.imageUri = builder.imageUri;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageFacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return faces
     */
    public java.util.List < Faces> getFaces() {
        return this.faces;
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
        private java.util.List < Faces> faces; 
        private String imageUri; 
        private String requestId; 

        /**
         * Faces.
         */
        public Builder faces(java.util.List < Faces> faces) {
            this.faces = faces;
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

        public DetectImageFacesResponseBody build() {
            return new DetectImageFacesResponseBody(this);
        } 

    } 

    public static class EmotionDetails extends TeaModel {
        @NameInMap("ANGRY")
        private Float ANGRY;

        @NameInMap("CALM")
        private Float CALM;

        @NameInMap("DISGUSTED")
        private Float DISGUSTED;

        @NameInMap("HAPPY")
        private Float HAPPY;

        @NameInMap("SAD")
        private Float SAD;

        @NameInMap("SCARED")
        private Float SCARED;

        @NameInMap("SURPRISED")
        private Float SURPRISED;

        private EmotionDetails(Builder builder) {
            this.ANGRY = builder.ANGRY;
            this.CALM = builder.CALM;
            this.DISGUSTED = builder.DISGUSTED;
            this.HAPPY = builder.HAPPY;
            this.SAD = builder.SAD;
            this.SCARED = builder.SCARED;
            this.SURPRISED = builder.SURPRISED;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmotionDetails create() {
            return builder().build();
        }

        /**
         * @return ANGRY
         */
        public Float getANGRY() {
            return this.ANGRY;
        }

        /**
         * @return CALM
         */
        public Float getCALM() {
            return this.CALM;
        }

        /**
         * @return DISGUSTED
         */
        public Float getDISGUSTED() {
            return this.DISGUSTED;
        }

        /**
         * @return HAPPY
         */
        public Float getHAPPY() {
            return this.HAPPY;
        }

        /**
         * @return SAD
         */
        public Float getSAD() {
            return this.SAD;
        }

        /**
         * @return SCARED
         */
        public Float getSCARED() {
            return this.SCARED;
        }

        /**
         * @return SURPRISED
         */
        public Float getSURPRISED() {
            return this.SURPRISED;
        }

        public static final class Builder {
            private Float ANGRY; 
            private Float CALM; 
            private Float DISGUSTED; 
            private Float HAPPY; 
            private Float SAD; 
            private Float SCARED; 
            private Float SURPRISED; 

            /**
             * ANGRY.
             */
            public Builder ANGRY(Float ANGRY) {
                this.ANGRY = ANGRY;
                return this;
            }

            /**
             * CALM.
             */
            public Builder CALM(Float CALM) {
                this.CALM = CALM;
                return this;
            }

            /**
             * DISGUSTED.
             */
            public Builder DISGUSTED(Float DISGUSTED) {
                this.DISGUSTED = DISGUSTED;
                return this;
            }

            /**
             * HAPPY.
             */
            public Builder HAPPY(Float HAPPY) {
                this.HAPPY = HAPPY;
                return this;
            }

            /**
             * SAD.
             */
            public Builder SAD(Float SAD) {
                this.SAD = SAD;
                return this;
            }

            /**
             * SCARED.
             */
            public Builder SCARED(Float SCARED) {
                this.SCARED = SCARED;
                return this;
            }

            /**
             * SURPRISED.
             */
            public Builder SURPRISED(Float SURPRISED) {
                this.SURPRISED = SURPRISED;
                return this;
            }

            public EmotionDetails build() {
                return new EmotionDetails(this);
            } 

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
    public static class HeadPose extends TeaModel {
        @NameInMap("Pitch")
        private Float pitch;

        @NameInMap("Roll")
        private Float roll;

        @NameInMap("Yaw")
        private Float yaw;

        private HeadPose(Builder builder) {
            this.pitch = builder.pitch;
            this.roll = builder.roll;
            this.yaw = builder.yaw;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeadPose create() {
            return builder().build();
        }

        /**
         * @return pitch
         */
        public Float getPitch() {
            return this.pitch;
        }

        /**
         * @return roll
         */
        public Float getRoll() {
            return this.roll;
        }

        /**
         * @return yaw
         */
        public Float getYaw() {
            return this.yaw;
        }

        public static final class Builder {
            private Float pitch; 
            private Float roll; 
            private Float yaw; 

            /**
             * Pitch.
             */
            public Builder pitch(Float pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * Roll.
             */
            public Builder roll(Float roll) {
                this.roll = roll;
                return this;
            }

            /**
             * Yaw.
             */
            public Builder yaw(Float yaw) {
                this.yaw = yaw;
                return this;
            }

            public HeadPose build() {
                return new HeadPose(this);
            } 

        } 

    }
    public static class FaceAttributes extends TeaModel {
        @NameInMap("Beard")
        private String beard;

        @NameInMap("BeardConfidence")
        private Float beardConfidence;

        @NameInMap("FaceBoundary")
        private FaceBoundary faceBoundary;

        @NameInMap("Glasses")
        private String glasses;

        @NameInMap("GlassesConfidence")
        private Float glassesConfidence;

        @NameInMap("HeadPose")
        private HeadPose headPose;

        @NameInMap("Mask")
        private String mask;

        @NameInMap("MaskConfidence")
        private Float maskConfidence;

        private FaceAttributes(Builder builder) {
            this.beard = builder.beard;
            this.beardConfidence = builder.beardConfidence;
            this.faceBoundary = builder.faceBoundary;
            this.glasses = builder.glasses;
            this.glassesConfidence = builder.glassesConfidence;
            this.headPose = builder.headPose;
            this.mask = builder.mask;
            this.maskConfidence = builder.maskConfidence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceAttributes create() {
            return builder().build();
        }

        /**
         * @return beard
         */
        public String getBeard() {
            return this.beard;
        }

        /**
         * @return beardConfidence
         */
        public Float getBeardConfidence() {
            return this.beardConfidence;
        }

        /**
         * @return faceBoundary
         */
        public FaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        /**
         * @return glasses
         */
        public String getGlasses() {
            return this.glasses;
        }

        /**
         * @return glassesConfidence
         */
        public Float getGlassesConfidence() {
            return this.glassesConfidence;
        }

        /**
         * @return headPose
         */
        public HeadPose getHeadPose() {
            return this.headPose;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return maskConfidence
         */
        public Float getMaskConfidence() {
            return this.maskConfidence;
        }

        public static final class Builder {
            private String beard; 
            private Float beardConfidence; 
            private FaceBoundary faceBoundary; 
            private String glasses; 
            private Float glassesConfidence; 
            private HeadPose headPose; 
            private String mask; 
            private Float maskConfidence; 

            /**
             * Beard.
             */
            public Builder beard(String beard) {
                this.beard = beard;
                return this;
            }

            /**
             * BeardConfidence.
             */
            public Builder beardConfidence(Float beardConfidence) {
                this.beardConfidence = beardConfidence;
                return this;
            }

            /**
             * FaceBoundary.
             */
            public Builder faceBoundary(FaceBoundary faceBoundary) {
                this.faceBoundary = faceBoundary;
                return this;
            }

            /**
             * Glasses.
             */
            public Builder glasses(String glasses) {
                this.glasses = glasses;
                return this;
            }

            /**
             * GlassesConfidence.
             */
            public Builder glassesConfidence(Float glassesConfidence) {
                this.glassesConfidence = glassesConfidence;
                return this;
            }

            /**
             * HeadPose.
             */
            public Builder headPose(HeadPose headPose) {
                this.headPose = headPose;
                return this;
            }

            /**
             * Mask.
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * MaskConfidence.
             */
            public Builder maskConfidence(Float maskConfidence) {
                this.maskConfidence = maskConfidence;
                return this;
            }

            public FaceAttributes build() {
                return new FaceAttributes(this);
            } 

        } 

    }
    public static class Faces extends TeaModel {
        @NameInMap("Age")
        private Integer age;

        @NameInMap("AgeConfidence")
        private Float ageConfidence;

        @NameInMap("Attractive")
        private Float attractive;

        @NameInMap("AttractiveConfidence")
        private Float attractiveConfidence;

        @NameInMap("Emotion")
        private String emotion;

        @NameInMap("EmotionConfidence")
        private Float emotionConfidence;

        @NameInMap("EmotionDetails")
        private EmotionDetails emotionDetails;

        @NameInMap("FaceAttributes")
        private FaceAttributes faceAttributes;

        @NameInMap("FaceConfidence")
        private Float faceConfidence;

        @NameInMap("FaceId")
        private String faceId;

        @NameInMap("FaceQuality")
        private Float faceQuality;

        @NameInMap("Gender")
        private String gender;

        @NameInMap("GenderConfidence")
        private Float genderConfidence;

        private Faces(Builder builder) {
            this.age = builder.age;
            this.ageConfidence = builder.ageConfidence;
            this.attractive = builder.attractive;
            this.attractiveConfidence = builder.attractiveConfidence;
            this.emotion = builder.emotion;
            this.emotionConfidence = builder.emotionConfidence;
            this.emotionDetails = builder.emotionDetails;
            this.faceAttributes = builder.faceAttributes;
            this.faceConfidence = builder.faceConfidence;
            this.faceId = builder.faceId;
            this.faceQuality = builder.faceQuality;
            this.gender = builder.gender;
            this.genderConfidence = builder.genderConfidence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Faces create() {
            return builder().build();
        }

        /**
         * @return age
         */
        public Integer getAge() {
            return this.age;
        }

        /**
         * @return ageConfidence
         */
        public Float getAgeConfidence() {
            return this.ageConfidence;
        }

        /**
         * @return attractive
         */
        public Float getAttractive() {
            return this.attractive;
        }

        /**
         * @return attractiveConfidence
         */
        public Float getAttractiveConfidence() {
            return this.attractiveConfidence;
        }

        /**
         * @return emotion
         */
        public String getEmotion() {
            return this.emotion;
        }

        /**
         * @return emotionConfidence
         */
        public Float getEmotionConfidence() {
            return this.emotionConfidence;
        }

        /**
         * @return emotionDetails
         */
        public EmotionDetails getEmotionDetails() {
            return this.emotionDetails;
        }

        /**
         * @return faceAttributes
         */
        public FaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        /**
         * @return faceConfidence
         */
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        /**
         * @return faceQuality
         */
        public Float getFaceQuality() {
            return this.faceQuality;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return genderConfidence
         */
        public Float getGenderConfidence() {
            return this.genderConfidence;
        }

        public static final class Builder {
            private Integer age; 
            private Float ageConfidence; 
            private Float attractive; 
            private Float attractiveConfidence; 
            private String emotion; 
            private Float emotionConfidence; 
            private EmotionDetails emotionDetails; 
            private FaceAttributes faceAttributes; 
            private Float faceConfidence; 
            private String faceId; 
            private Float faceQuality; 
            private String gender; 
            private Float genderConfidence; 

            /**
             * Age.
             */
            public Builder age(Integer age) {
                this.age = age;
                return this;
            }

            /**
             * AgeConfidence.
             */
            public Builder ageConfidence(Float ageConfidence) {
                this.ageConfidence = ageConfidence;
                return this;
            }

            /**
             * Attractive.
             */
            public Builder attractive(Float attractive) {
                this.attractive = attractive;
                return this;
            }

            /**
             * AttractiveConfidence.
             */
            public Builder attractiveConfidence(Float attractiveConfidence) {
                this.attractiveConfidence = attractiveConfidence;
                return this;
            }

            /**
             * Emotion.
             */
            public Builder emotion(String emotion) {
                this.emotion = emotion;
                return this;
            }

            /**
             * EmotionConfidence.
             */
            public Builder emotionConfidence(Float emotionConfidence) {
                this.emotionConfidence = emotionConfidence;
                return this;
            }

            /**
             * EmotionDetails.
             */
            public Builder emotionDetails(EmotionDetails emotionDetails) {
                this.emotionDetails = emotionDetails;
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
             * FaceConfidence.
             */
            public Builder faceConfidence(Float faceConfidence) {
                this.faceConfidence = faceConfidence;
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
             * FaceQuality.
             */
            public Builder faceQuality(Float faceQuality) {
                this.faceQuality = faceQuality;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * GenderConfidence.
             */
            public Builder genderConfidence(Float genderConfidence) {
                this.genderConfidence = genderConfidence;
                return this;
            }

            public Faces build() {
                return new Faces(this);
            } 

        } 

    }
}
