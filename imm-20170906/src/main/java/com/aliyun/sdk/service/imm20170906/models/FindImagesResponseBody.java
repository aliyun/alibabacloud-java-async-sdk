// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindImagesResponseBody} extends {@link TeaModel}
 *
 * <p>FindImagesResponseBody</p>
 */
public class FindImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    private java.util.List < Images> images;

    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    private FindImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.nextMarker = builder.nextMarker;
        this.requestId = builder.requestId;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return images
     */
    public java.util.List < Images> getImages() {
        return this.images;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
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

    public static final class Builder {
        private java.util.List < Images> images; 
        private String nextMarker; 
        private String requestId; 
        private String setId; 

        /**
         * Images.
         */
        public Builder images(java.util.List < Images> images) {
            this.images = images;
            return this;
        }

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
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

        public FindImagesResponseBody build() {
            return new FindImagesResponseBody(this);
        } 

    } 

    public static class Address extends TeaModel {
        @NameInMap("AddressLine")
        private String addressLine;

        @NameInMap("City")
        private String city;

        @NameInMap("Country")
        private String country;

        @NameInMap("District")
        private String district;

        @NameInMap("Province")
        private String province;

        @NameInMap("Township")
        private String township;

        private Address(Builder builder) {
            this.addressLine = builder.addressLine;
            this.city = builder.city;
            this.country = builder.country;
            this.district = builder.district;
            this.province = builder.province;
            this.township = builder.township;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Address create() {
            return builder().build();
        }

        /**
         * @return addressLine
         */
        public String getAddressLine() {
            return this.addressLine;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return township
         */
        public String getTownship() {
            return this.township;
        }

        public static final class Builder {
            private String addressLine; 
            private String city; 
            private String country; 
            private String district; 
            private String province; 
            private String township; 

            /**
             * AddressLine.
             */
            public Builder addressLine(String addressLine) {
                this.addressLine = addressLine;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * District.
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * Township.
             */
            public Builder township(String township) {
                this.township = township;
                return this;
            }

            public Address build() {
                return new Address(this);
            } 

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
    public static class CroppingSuggestion extends TeaModel {
        @NameInMap("AspectRatio")
        private String aspectRatio;

        @NameInMap("CroppingBoundary")
        private CroppingBoundary croppingBoundary;

        @NameInMap("Score")
        private Float score;

        private CroppingSuggestion(Builder builder) {
            this.aspectRatio = builder.aspectRatio;
            this.croppingBoundary = builder.croppingBoundary;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CroppingSuggestion create() {
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

            public CroppingSuggestion build() {
                return new CroppingSuggestion(this);
            } 

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

        @NameInMap("Attractive")
        private Float attractive;

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

        @NameInMap("GroupId")
        private String groupId;

        private Faces(Builder builder) {
            this.age = builder.age;
            this.attractive = builder.attractive;
            this.emotion = builder.emotion;
            this.emotionConfidence = builder.emotionConfidence;
            this.emotionDetails = builder.emotionDetails;
            this.faceAttributes = builder.faceAttributes;
            this.faceConfidence = builder.faceConfidence;
            this.faceId = builder.faceId;
            this.faceQuality = builder.faceQuality;
            this.gender = builder.gender;
            this.genderConfidence = builder.genderConfidence;
            this.groupId = builder.groupId;
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
         * @return attractive
         */
        public Float getAttractive() {
            return this.attractive;
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

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private Integer age; 
            private Float attractive; 
            private String emotion; 
            private Float emotionConfidence; 
            private EmotionDetails emotionDetails; 
            private FaceAttributes faceAttributes; 
            private Float faceConfidence; 
            private String faceId; 
            private Float faceQuality; 
            private String gender; 
            private Float genderConfidence; 
            private String groupId; 

            /**
             * Age.
             */
            public Builder age(Integer age) {
                this.age = age;
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

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public Faces build() {
                return new Faces(this);
            } 

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
    public static class OCRBoundary extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Left")
        private Integer left;

        @NameInMap("Top")
        private Integer top;

        @NameInMap("Width")
        private Integer width;

        private OCRBoundary(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OCRBoundary create() {
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

            public OCRBoundary build() {
                return new OCRBoundary(this);
            } 

        } 

    }
    public static class OCR extends TeaModel {
        @NameInMap("OCRBoundary")
        private OCRBoundary OCRBoundary;

        @NameInMap("OCRConfidence")
        private Float OCRConfidence;

        @NameInMap("OCRContents")
        private String OCRContents;

        private OCR(Builder builder) {
            this.OCRBoundary = builder.OCRBoundary;
            this.OCRConfidence = builder.OCRConfidence;
            this.OCRContents = builder.OCRContents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OCR create() {
            return builder().build();
        }

        /**
         * @return OCRBoundary
         */
        public OCRBoundary getOCRBoundary() {
            return this.OCRBoundary;
        }

        /**
         * @return OCRConfidence
         */
        public Float getOCRConfidence() {
            return this.OCRConfidence;
        }

        /**
         * @return OCRContents
         */
        public String getOCRContents() {
            return this.OCRContents;
        }

        public static final class Builder {
            private OCRBoundary OCRBoundary; 
            private Float OCRConfidence; 
            private String OCRContents; 

            /**
             * OCRBoundary.
             */
            public Builder OCRBoundary(OCRBoundary OCRBoundary) {
                this.OCRBoundary = OCRBoundary;
                return this;
            }

            /**
             * OCRConfidence.
             */
            public Builder OCRConfidence(Float OCRConfidence) {
                this.OCRConfidence = OCRConfidence;
                return this;
            }

            /**
             * OCRContents.
             */
            public Builder OCRContents(String OCRContents) {
                this.OCRContents = OCRContents;
                return this;
            }

            public OCR build() {
                return new OCR(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("CentricScore")
        private Float centricScore;

        @NameInMap("ParentTagName")
        private String parentTagName;

        @NameInMap("TagConfidence")
        private Float tagConfidence;

        @NameInMap("TagLevel")
        private Integer tagLevel;

        @NameInMap("TagName")
        private String tagName;

        private Tags(Builder builder) {
            this.centricScore = builder.centricScore;
            this.parentTagName = builder.parentTagName;
            this.tagConfidence = builder.tagConfidence;
            this.tagLevel = builder.tagLevel;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return centricScore
         */
        public Float getCentricScore() {
            return this.centricScore;
        }

        /**
         * @return parentTagName
         */
        public String getParentTagName() {
            return this.parentTagName;
        }

        /**
         * @return tagConfidence
         */
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        /**
         * @return tagLevel
         */
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private Float centricScore; 
            private String parentTagName; 
            private Float tagConfidence; 
            private Integer tagLevel; 
            private String tagName; 

            /**
             * CentricScore.
             */
            public Builder centricScore(Float centricScore) {
                this.centricScore = centricScore;
                return this;
            }

            /**
             * ParentTagName.
             */
            public Builder parentTagName(String parentTagName) {
                this.parentTagName = parentTagName;
                return this;
            }

            /**
             * TagConfidence.
             */
            public Builder tagConfidence(Float tagConfidence) {
                this.tagConfidence = tagConfidence;
                return this;
            }

            /**
             * TagLevel.
             */
            public Builder tagLevel(Integer tagLevel) {
                this.tagLevel = tagLevel;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Images extends TeaModel {
        @NameInMap("Address")
        private Address address;

        @NameInMap("AddressFailReason")
        private String addressFailReason;

        @NameInMap("AddressModifyTime")
        private String addressModifyTime;

        @NameInMap("AddressStatus")
        private String addressStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CroppingSuggestion")
        private java.util.List < CroppingSuggestion> croppingSuggestion;

        @NameInMap("CroppingSuggestionFailReason")
        private String croppingSuggestionFailReason;

        @NameInMap("CroppingSuggestionModifyTime")
        private String croppingSuggestionModifyTime;

        @NameInMap("CroppingSuggestionStatus")
        private String croppingSuggestionStatus;

        @NameInMap("Exif")
        private String exif;

        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("Faces")
        private java.util.List < Faces> faces;

        @NameInMap("FacesFailReason")
        private String facesFailReason;

        @NameInMap("FacesModifyTime")
        private String facesModifyTime;

        @NameInMap("FacesStatus")
        private String facesStatus;

        @NameInMap("FileSize")
        private Integer fileSize;

        @NameInMap("ImageFormat")
        private String imageFormat;

        @NameInMap("ImageHeight")
        private Integer imageHeight;

        @NameInMap("ImageQuality")
        private ImageQuality imageQuality;

        @NameInMap("ImageQualityFailReason")
        private String imageQualityFailReason;

        @NameInMap("ImageQualityModifyTime")
        private String imageQualityModifyTime;

        @NameInMap("ImageQualityStatus")
        private String imageQualityStatus;

        @NameInMap("ImageTime")
        private String imageTime;

        @NameInMap("ImageUri")
        private String imageUri;

        @NameInMap("ImageWidth")
        private Integer imageWidth;

        @NameInMap("Location")
        private String location;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("OCR")
        private java.util.List < OCR> OCR;

        @NameInMap("OCRFailReason")
        private String OCRFailReason;

        @NameInMap("OCRModifyTime")
        private String OCRModifyTime;

        @NameInMap("OCRStatus")
        private String OCRStatus;

        @NameInMap("Orientation")
        private String orientation;

        @NameInMap("RemarksA")
        private String remarksA;

        @NameInMap("RemarksArrayA")
        private String remarksArrayA;

        @NameInMap("RemarksArrayB")
        private String remarksArrayB;

        @NameInMap("RemarksB")
        private String remarksB;

        @NameInMap("RemarksC")
        private String remarksC;

        @NameInMap("RemarksD")
        private String remarksD;

        @NameInMap("SourcePosition")
        private String sourcePosition;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("SourceUri")
        private String sourceUri;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TagsFailReason")
        private String tagsFailReason;

        @NameInMap("TagsModifyTime")
        private String tagsModifyTime;

        @NameInMap("TagsStatus")
        private String tagsStatus;

        private Images(Builder builder) {
            this.address = builder.address;
            this.addressFailReason = builder.addressFailReason;
            this.addressModifyTime = builder.addressModifyTime;
            this.addressStatus = builder.addressStatus;
            this.createTime = builder.createTime;
            this.croppingSuggestion = builder.croppingSuggestion;
            this.croppingSuggestionFailReason = builder.croppingSuggestionFailReason;
            this.croppingSuggestionModifyTime = builder.croppingSuggestionModifyTime;
            this.croppingSuggestionStatus = builder.croppingSuggestionStatus;
            this.exif = builder.exif;
            this.externalId = builder.externalId;
            this.faces = builder.faces;
            this.facesFailReason = builder.facesFailReason;
            this.facesModifyTime = builder.facesModifyTime;
            this.facesStatus = builder.facesStatus;
            this.fileSize = builder.fileSize;
            this.imageFormat = builder.imageFormat;
            this.imageHeight = builder.imageHeight;
            this.imageQuality = builder.imageQuality;
            this.imageQualityFailReason = builder.imageQualityFailReason;
            this.imageQualityModifyTime = builder.imageQualityModifyTime;
            this.imageQualityStatus = builder.imageQualityStatus;
            this.imageTime = builder.imageTime;
            this.imageUri = builder.imageUri;
            this.imageWidth = builder.imageWidth;
            this.location = builder.location;
            this.modifyTime = builder.modifyTime;
            this.OCR = builder.OCR;
            this.OCRFailReason = builder.OCRFailReason;
            this.OCRModifyTime = builder.OCRModifyTime;
            this.OCRStatus = builder.OCRStatus;
            this.orientation = builder.orientation;
            this.remarksA = builder.remarksA;
            this.remarksArrayA = builder.remarksArrayA;
            this.remarksArrayB = builder.remarksArrayB;
            this.remarksB = builder.remarksB;
            this.remarksC = builder.remarksC;
            this.remarksD = builder.remarksD;
            this.sourcePosition = builder.sourcePosition;
            this.sourceType = builder.sourceType;
            this.sourceUri = builder.sourceUri;
            this.tags = builder.tags;
            this.tagsFailReason = builder.tagsFailReason;
            this.tagsModifyTime = builder.tagsModifyTime;
            this.tagsStatus = builder.tagsStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public Address getAddress() {
            return this.address;
        }

        /**
         * @return addressFailReason
         */
        public String getAddressFailReason() {
            return this.addressFailReason;
        }

        /**
         * @return addressModifyTime
         */
        public String getAddressModifyTime() {
            return this.addressModifyTime;
        }

        /**
         * @return addressStatus
         */
        public String getAddressStatus() {
            return this.addressStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return croppingSuggestion
         */
        public java.util.List < CroppingSuggestion> getCroppingSuggestion() {
            return this.croppingSuggestion;
        }

        /**
         * @return croppingSuggestionFailReason
         */
        public String getCroppingSuggestionFailReason() {
            return this.croppingSuggestionFailReason;
        }

        /**
         * @return croppingSuggestionModifyTime
         */
        public String getCroppingSuggestionModifyTime() {
            return this.croppingSuggestionModifyTime;
        }

        /**
         * @return croppingSuggestionStatus
         */
        public String getCroppingSuggestionStatus() {
            return this.croppingSuggestionStatus;
        }

        /**
         * @return exif
         */
        public String getExif() {
            return this.exif;
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return faces
         */
        public java.util.List < Faces> getFaces() {
            return this.faces;
        }

        /**
         * @return facesFailReason
         */
        public String getFacesFailReason() {
            return this.facesFailReason;
        }

        /**
         * @return facesModifyTime
         */
        public String getFacesModifyTime() {
            return this.facesModifyTime;
        }

        /**
         * @return facesStatus
         */
        public String getFacesStatus() {
            return this.facesStatus;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return imageFormat
         */
        public String getImageFormat() {
            return this.imageFormat;
        }

        /**
         * @return imageHeight
         */
        public Integer getImageHeight() {
            return this.imageHeight;
        }

        /**
         * @return imageQuality
         */
        public ImageQuality getImageQuality() {
            return this.imageQuality;
        }

        /**
         * @return imageQualityFailReason
         */
        public String getImageQualityFailReason() {
            return this.imageQualityFailReason;
        }

        /**
         * @return imageQualityModifyTime
         */
        public String getImageQualityModifyTime() {
            return this.imageQualityModifyTime;
        }

        /**
         * @return imageQualityStatus
         */
        public String getImageQualityStatus() {
            return this.imageQualityStatus;
        }

        /**
         * @return imageTime
         */
        public String getImageTime() {
            return this.imageTime;
        }

        /**
         * @return imageUri
         */
        public String getImageUri() {
            return this.imageUri;
        }

        /**
         * @return imageWidth
         */
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return OCR
         */
        public java.util.List < OCR> getOCR() {
            return this.OCR;
        }

        /**
         * @return OCRFailReason
         */
        public String getOCRFailReason() {
            return this.OCRFailReason;
        }

        /**
         * @return OCRModifyTime
         */
        public String getOCRModifyTime() {
            return this.OCRModifyTime;
        }

        /**
         * @return OCRStatus
         */
        public String getOCRStatus() {
            return this.OCRStatus;
        }

        /**
         * @return orientation
         */
        public String getOrientation() {
            return this.orientation;
        }

        /**
         * @return remarksA
         */
        public String getRemarksA() {
            return this.remarksA;
        }

        /**
         * @return remarksArrayA
         */
        public String getRemarksArrayA() {
            return this.remarksArrayA;
        }

        /**
         * @return remarksArrayB
         */
        public String getRemarksArrayB() {
            return this.remarksArrayB;
        }

        /**
         * @return remarksB
         */
        public String getRemarksB() {
            return this.remarksB;
        }

        /**
         * @return remarksC
         */
        public String getRemarksC() {
            return this.remarksC;
        }

        /**
         * @return remarksD
         */
        public String getRemarksD() {
            return this.remarksD;
        }

        /**
         * @return sourcePosition
         */
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceUri
         */
        public String getSourceUri() {
            return this.sourceUri;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tagsFailReason
         */
        public String getTagsFailReason() {
            return this.tagsFailReason;
        }

        /**
         * @return tagsModifyTime
         */
        public String getTagsModifyTime() {
            return this.tagsModifyTime;
        }

        /**
         * @return tagsStatus
         */
        public String getTagsStatus() {
            return this.tagsStatus;
        }

        public static final class Builder {
            private Address address; 
            private String addressFailReason; 
            private String addressModifyTime; 
            private String addressStatus; 
            private String createTime; 
            private java.util.List < CroppingSuggestion> croppingSuggestion; 
            private String croppingSuggestionFailReason; 
            private String croppingSuggestionModifyTime; 
            private String croppingSuggestionStatus; 
            private String exif; 
            private String externalId; 
            private java.util.List < Faces> faces; 
            private String facesFailReason; 
            private String facesModifyTime; 
            private String facesStatus; 
            private Integer fileSize; 
            private String imageFormat; 
            private Integer imageHeight; 
            private ImageQuality imageQuality; 
            private String imageQualityFailReason; 
            private String imageQualityModifyTime; 
            private String imageQualityStatus; 
            private String imageTime; 
            private String imageUri; 
            private Integer imageWidth; 
            private String location; 
            private String modifyTime; 
            private java.util.List < OCR> OCR; 
            private String OCRFailReason; 
            private String OCRModifyTime; 
            private String OCRStatus; 
            private String orientation; 
            private String remarksA; 
            private String remarksArrayA; 
            private String remarksArrayB; 
            private String remarksB; 
            private String remarksC; 
            private String remarksD; 
            private String sourcePosition; 
            private String sourceType; 
            private String sourceUri; 
            private java.util.List < Tags> tags; 
            private String tagsFailReason; 
            private String tagsModifyTime; 
            private String tagsStatus; 

            /**
             * Address.
             */
            public Builder address(Address address) {
                this.address = address;
                return this;
            }

            /**
             * AddressFailReason.
             */
            public Builder addressFailReason(String addressFailReason) {
                this.addressFailReason = addressFailReason;
                return this;
            }

            /**
             * AddressModifyTime.
             */
            public Builder addressModifyTime(String addressModifyTime) {
                this.addressModifyTime = addressModifyTime;
                return this;
            }

            /**
             * AddressStatus.
             */
            public Builder addressStatus(String addressStatus) {
                this.addressStatus = addressStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CroppingSuggestion.
             */
            public Builder croppingSuggestion(java.util.List < CroppingSuggestion> croppingSuggestion) {
                this.croppingSuggestion = croppingSuggestion;
                return this;
            }

            /**
             * CroppingSuggestionFailReason.
             */
            public Builder croppingSuggestionFailReason(String croppingSuggestionFailReason) {
                this.croppingSuggestionFailReason = croppingSuggestionFailReason;
                return this;
            }

            /**
             * CroppingSuggestionModifyTime.
             */
            public Builder croppingSuggestionModifyTime(String croppingSuggestionModifyTime) {
                this.croppingSuggestionModifyTime = croppingSuggestionModifyTime;
                return this;
            }

            /**
             * CroppingSuggestionStatus.
             */
            public Builder croppingSuggestionStatus(String croppingSuggestionStatus) {
                this.croppingSuggestionStatus = croppingSuggestionStatus;
                return this;
            }

            /**
             * Exif.
             */
            public Builder exif(String exif) {
                this.exif = exif;
                return this;
            }

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * Faces.
             */
            public Builder faces(java.util.List < Faces> faces) {
                this.faces = faces;
                return this;
            }

            /**
             * FacesFailReason.
             */
            public Builder facesFailReason(String facesFailReason) {
                this.facesFailReason = facesFailReason;
                return this;
            }

            /**
             * FacesModifyTime.
             */
            public Builder facesModifyTime(String facesModifyTime) {
                this.facesModifyTime = facesModifyTime;
                return this;
            }

            /**
             * FacesStatus.
             */
            public Builder facesStatus(String facesStatus) {
                this.facesStatus = facesStatus;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * ImageFormat.
             */
            public Builder imageFormat(String imageFormat) {
                this.imageFormat = imageFormat;
                return this;
            }

            /**
             * ImageHeight.
             */
            public Builder imageHeight(Integer imageHeight) {
                this.imageHeight = imageHeight;
                return this;
            }

            /**
             * ImageQuality.
             */
            public Builder imageQuality(ImageQuality imageQuality) {
                this.imageQuality = imageQuality;
                return this;
            }

            /**
             * ImageQualityFailReason.
             */
            public Builder imageQualityFailReason(String imageQualityFailReason) {
                this.imageQualityFailReason = imageQualityFailReason;
                return this;
            }

            /**
             * ImageQualityModifyTime.
             */
            public Builder imageQualityModifyTime(String imageQualityModifyTime) {
                this.imageQualityModifyTime = imageQualityModifyTime;
                return this;
            }

            /**
             * ImageQualityStatus.
             */
            public Builder imageQualityStatus(String imageQualityStatus) {
                this.imageQualityStatus = imageQualityStatus;
                return this;
            }

            /**
             * ImageTime.
             */
            public Builder imageTime(String imageTime) {
                this.imageTime = imageTime;
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
             * ImageWidth.
             */
            public Builder imageWidth(Integer imageWidth) {
                this.imageWidth = imageWidth;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * OCR.
             */
            public Builder OCR(java.util.List < OCR> OCR) {
                this.OCR = OCR;
                return this;
            }

            /**
             * OCRFailReason.
             */
            public Builder OCRFailReason(String OCRFailReason) {
                this.OCRFailReason = OCRFailReason;
                return this;
            }

            /**
             * OCRModifyTime.
             */
            public Builder OCRModifyTime(String OCRModifyTime) {
                this.OCRModifyTime = OCRModifyTime;
                return this;
            }

            /**
             * OCRStatus.
             */
            public Builder OCRStatus(String OCRStatus) {
                this.OCRStatus = OCRStatus;
                return this;
            }

            /**
             * Orientation.
             */
            public Builder orientation(String orientation) {
                this.orientation = orientation;
                return this;
            }

            /**
             * RemarksA.
             */
            public Builder remarksA(String remarksA) {
                this.remarksA = remarksA;
                return this;
            }

            /**
             * RemarksArrayA.
             */
            public Builder remarksArrayA(String remarksArrayA) {
                this.remarksArrayA = remarksArrayA;
                return this;
            }

            /**
             * RemarksArrayB.
             */
            public Builder remarksArrayB(String remarksArrayB) {
                this.remarksArrayB = remarksArrayB;
                return this;
            }

            /**
             * RemarksB.
             */
            public Builder remarksB(String remarksB) {
                this.remarksB = remarksB;
                return this;
            }

            /**
             * RemarksC.
             */
            public Builder remarksC(String remarksC) {
                this.remarksC = remarksC;
                return this;
            }

            /**
             * RemarksD.
             */
            public Builder remarksD(String remarksD) {
                this.remarksD = remarksD;
                return this;
            }

            /**
             * SourcePosition.
             */
            public Builder sourcePosition(String sourcePosition) {
                this.sourcePosition = sourcePosition;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SourceUri.
             */
            public Builder sourceUri(String sourceUri) {
                this.sourceUri = sourceUri;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TagsFailReason.
             */
            public Builder tagsFailReason(String tagsFailReason) {
                this.tagsFailReason = tagsFailReason;
                return this;
            }

            /**
             * TagsModifyTime.
             */
            public Builder tagsModifyTime(String tagsModifyTime) {
                this.tagsModifyTime = tagsModifyTime;
                return this;
            }

            /**
             * TagsStatus.
             */
            public Builder tagsStatus(String tagsStatus) {
                this.tagsStatus = tagsStatus;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
