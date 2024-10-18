// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Figure} extends {@link TeaModel}
 *
 * <p>Figure</p>
 */
public class Figure extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Age")
    private Long age;

    @com.aliyun.core.annotation.NameInMap("AgeSD")
    private Float ageSD;

    @com.aliyun.core.annotation.NameInMap("Attractive")
    private Float attractive;

    @com.aliyun.core.annotation.NameInMap("Beard")
    private String beard;

    @com.aliyun.core.annotation.NameInMap("BeardConfidence")
    private Float beardConfidence;

    @com.aliyun.core.annotation.NameInMap("Boundary")
    private Boundary boundary;

    @com.aliyun.core.annotation.NameInMap("Emotion")
    private String emotion;

    @com.aliyun.core.annotation.NameInMap("EmotionConfidence")
    private Float emotionConfidence;

    @com.aliyun.core.annotation.NameInMap("FaceQuality")
    private Float faceQuality;

    @com.aliyun.core.annotation.NameInMap("FigureClusterConfidence")
    private Float figureClusterConfidence;

    @com.aliyun.core.annotation.NameInMap("FigureClusterId")
    private String figureClusterId;

    @com.aliyun.core.annotation.NameInMap("FigureConfidence")
    private Float figureConfidence;

    @com.aliyun.core.annotation.NameInMap("FigureId")
    private String figureId;

    @com.aliyun.core.annotation.NameInMap("FigureType")
    private String figureType;

    @com.aliyun.core.annotation.NameInMap("Gender")
    private String gender;

    @com.aliyun.core.annotation.NameInMap("GenderConfidence")
    private Float genderConfidence;

    @com.aliyun.core.annotation.NameInMap("Glasses")
    private String glasses;

    @com.aliyun.core.annotation.NameInMap("GlassesConfidence")
    private Float glassesConfidence;

    @com.aliyun.core.annotation.NameInMap("Hat")
    private String hat;

    @com.aliyun.core.annotation.NameInMap("HatConfidence")
    private Float hatConfidence;

    @com.aliyun.core.annotation.NameInMap("HeadPose")
    private HeadPose headPose;

    @com.aliyun.core.annotation.NameInMap("Mask")
    private String mask;

    @com.aliyun.core.annotation.NameInMap("MaskConfidence")
    private Float maskConfidence;

    @com.aliyun.core.annotation.NameInMap("Mouth")
    private String mouth;

    @com.aliyun.core.annotation.NameInMap("MouthConfidence")
    private Float mouthConfidence;

    @com.aliyun.core.annotation.NameInMap("Sharpness")
    private Float sharpness;

    private Figure(Builder builder) {
        this.age = builder.age;
        this.ageSD = builder.ageSD;
        this.attractive = builder.attractive;
        this.beard = builder.beard;
        this.beardConfidence = builder.beardConfidence;
        this.boundary = builder.boundary;
        this.emotion = builder.emotion;
        this.emotionConfidence = builder.emotionConfidence;
        this.faceQuality = builder.faceQuality;
        this.figureClusterConfidence = builder.figureClusterConfidence;
        this.figureClusterId = builder.figureClusterId;
        this.figureConfidence = builder.figureConfidence;
        this.figureId = builder.figureId;
        this.figureType = builder.figureType;
        this.gender = builder.gender;
        this.genderConfidence = builder.genderConfidence;
        this.glasses = builder.glasses;
        this.glassesConfidence = builder.glassesConfidence;
        this.hat = builder.hat;
        this.hatConfidence = builder.hatConfidence;
        this.headPose = builder.headPose;
        this.mask = builder.mask;
        this.maskConfidence = builder.maskConfidence;
        this.mouth = builder.mouth;
        this.mouthConfidence = builder.mouthConfidence;
        this.sharpness = builder.sharpness;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Figure create() {
        return builder().build();
    }

    /**
     * @return age
     */
    public Long getAge() {
        return this.age;
    }

    /**
     * @return ageSD
     */
    public Float getAgeSD() {
        return this.ageSD;
    }

    /**
     * @return attractive
     */
    public Float getAttractive() {
        return this.attractive;
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
     * @return boundary
     */
    public Boundary getBoundary() {
        return this.boundary;
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
     * @return faceQuality
     */
    public Float getFaceQuality() {
        return this.faceQuality;
    }

    /**
     * @return figureClusterConfidence
     */
    public Float getFigureClusterConfidence() {
        return this.figureClusterConfidence;
    }

    /**
     * @return figureClusterId
     */
    public String getFigureClusterId() {
        return this.figureClusterId;
    }

    /**
     * @return figureConfidence
     */
    public Float getFigureConfidence() {
        return this.figureConfidence;
    }

    /**
     * @return figureId
     */
    public String getFigureId() {
        return this.figureId;
    }

    /**
     * @return figureType
     */
    public String getFigureType() {
        return this.figureType;
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
     * @return hat
     */
    public String getHat() {
        return this.hat;
    }

    /**
     * @return hatConfidence
     */
    public Float getHatConfidence() {
        return this.hatConfidence;
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

    /**
     * @return mouth
     */
    public String getMouth() {
        return this.mouth;
    }

    /**
     * @return mouthConfidence
     */
    public Float getMouthConfidence() {
        return this.mouthConfidence;
    }

    /**
     * @return sharpness
     */
    public Float getSharpness() {
        return this.sharpness;
    }

    public static final class Builder {
        private Long age; 
        private Float ageSD; 
        private Float attractive; 
        private String beard; 
        private Float beardConfidence; 
        private Boundary boundary; 
        private String emotion; 
        private Float emotionConfidence; 
        private Float faceQuality; 
        private Float figureClusterConfidence; 
        private String figureClusterId; 
        private Float figureConfidence; 
        private String figureId; 
        private String figureType; 
        private String gender; 
        private Float genderConfidence; 
        private String glasses; 
        private Float glassesConfidence; 
        private String hat; 
        private Float hatConfidence; 
        private HeadPose headPose; 
        private String mask; 
        private Float maskConfidence; 
        private String mouth; 
        private Float mouthConfidence; 
        private Float sharpness; 

        /**
         * Age.
         */
        public Builder age(Long age) {
            this.age = age;
            return this;
        }

        /**
         * AgeSD.
         */
        public Builder ageSD(Float ageSD) {
            this.ageSD = ageSD;
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
         * Boundary.
         */
        public Builder boundary(Boundary boundary) {
            this.boundary = boundary;
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
         * FaceQuality.
         */
        public Builder faceQuality(Float faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }

        /**
         * FigureClusterConfidence.
         */
        public Builder figureClusterConfidence(Float figureClusterConfidence) {
            this.figureClusterConfidence = figureClusterConfidence;
            return this;
        }

        /**
         * FigureClusterId.
         */
        public Builder figureClusterId(String figureClusterId) {
            this.figureClusterId = figureClusterId;
            return this;
        }

        /**
         * FigureConfidence.
         */
        public Builder figureConfidence(Float figureConfidence) {
            this.figureConfidence = figureConfidence;
            return this;
        }

        /**
         * FigureId.
         */
        public Builder figureId(String figureId) {
            this.figureId = figureId;
            return this;
        }

        /**
         * FigureType.
         */
        public Builder figureType(String figureType) {
            this.figureType = figureType;
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
         * Hat.
         */
        public Builder hat(String hat) {
            this.hat = hat;
            return this;
        }

        /**
         * HatConfidence.
         */
        public Builder hatConfidence(Float hatConfidence) {
            this.hatConfidence = hatConfidence;
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

        /**
         * Mouth.
         */
        public Builder mouth(String mouth) {
            this.mouth = mouth;
            return this;
        }

        /**
         * MouthConfidence.
         */
        public Builder mouthConfidence(Float mouthConfidence) {
            this.mouthConfidence = mouthConfidence;
            return this;
        }

        /**
         * Sharpness.
         */
        public Builder sharpness(Float sharpness) {
            this.sharpness = sharpness;
            return this;
        }

        public Figure build() {
            return new Figure(this);
        } 

    } 

}
