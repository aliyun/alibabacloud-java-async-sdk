// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFaceModelResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetFaceModelResultResponseBody</p>
 */
public class GetFaceModelResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetFaceModelResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFaceModelResultResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFaceModelResultResponseBody build() {
            return new GetFaceModelResultResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("AgeLowerLimit")
        private Integer ageLowerLimit;

        @NameInMap("AgeLowerLimitReliability")
        private String ageLowerLimitReliability;

        @NameInMap("AgeUpLimit")
        private Integer ageUpLimit;

        @NameInMap("AgeUpLimitReliability")
        private String ageUpLimitReliability;

        @NameInMap("CapColor")
        private Integer capColor;

        @NameInMap("CapColorReliability")
        private String capColorReliability;

        @NameInMap("CapStyle")
        private Integer capStyle;

        @NameInMap("CapStyleReliability")
        private String capStyleReliability;

        @NameInMap("EthicCode")
        private Integer ethicCode;

        @NameInMap("EthicCodeReliability")
        private String ethicCodeReliability;

        @NameInMap("FaceStyle")
        private String faceStyle;

        @NameInMap("FaceStyleReliability")
        private String faceStyleReliability;

        @NameInMap("FeatureData")
        private java.util.List < Float > featureData;

        @NameInMap("GenderCode")
        private Integer genderCode;

        @NameInMap("GenderCodeReliability")
        private String genderCodeReliability;

        @NameInMap("GlassColor")
        private Integer glassColor;

        @NameInMap("GlassColorReliability")
        private String glassColorReliability;

        @NameInMap("GlassStyle")
        private Integer glassStyle;

        @NameInMap("GlassStyleReliability")
        private String glassStyleReliability;

        @NameInMap("HairColor")
        private Integer hairColor;

        @NameInMap("HairColorReliability")
        private String hairColorReliability;

        @NameInMap("HairStyle")
        private Integer hairStyle;

        @NameInMap("HairStyleReliability")
        private String hairStyleReliability;

        @NameInMap("LeftTopX")
        private Float leftTopX;

        @NameInMap("LeftTopY")
        private Float leftTopY;

        @NameInMap("MustacheStyle")
        private String mustacheStyle;

        @NameInMap("MustacheStyleReliability")
        private String mustacheStyleReliability;

        @NameInMap("RespiratorColor")
        private Integer respiratorColor;

        @NameInMap("RespiratorColorReliability")
        private String respiratorColorReliability;

        @NameInMap("RightBottomX")
        private Float rightBottomX;

        @NameInMap("RightBottomY")
        private Float rightBottomY;

        @NameInMap("SkinColor")
        private Integer skinColor;

        @NameInMap("SkinColorReliability")
        private String skinColorReliability;

        private Records(Builder builder) {
            this.ageLowerLimit = builder.ageLowerLimit;
            this.ageLowerLimitReliability = builder.ageLowerLimitReliability;
            this.ageUpLimit = builder.ageUpLimit;
            this.ageUpLimitReliability = builder.ageUpLimitReliability;
            this.capColor = builder.capColor;
            this.capColorReliability = builder.capColorReliability;
            this.capStyle = builder.capStyle;
            this.capStyleReliability = builder.capStyleReliability;
            this.ethicCode = builder.ethicCode;
            this.ethicCodeReliability = builder.ethicCodeReliability;
            this.faceStyle = builder.faceStyle;
            this.faceStyleReliability = builder.faceStyleReliability;
            this.featureData = builder.featureData;
            this.genderCode = builder.genderCode;
            this.genderCodeReliability = builder.genderCodeReliability;
            this.glassColor = builder.glassColor;
            this.glassColorReliability = builder.glassColorReliability;
            this.glassStyle = builder.glassStyle;
            this.glassStyleReliability = builder.glassStyleReliability;
            this.hairColor = builder.hairColor;
            this.hairColorReliability = builder.hairColorReliability;
            this.hairStyle = builder.hairStyle;
            this.hairStyleReliability = builder.hairStyleReliability;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.mustacheStyle = builder.mustacheStyle;
            this.mustacheStyleReliability = builder.mustacheStyleReliability;
            this.respiratorColor = builder.respiratorColor;
            this.respiratorColorReliability = builder.respiratorColorReliability;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.skinColor = builder.skinColor;
            this.skinColorReliability = builder.skinColorReliability;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return ageLowerLimit
         */
        public Integer getAgeLowerLimit() {
            return this.ageLowerLimit;
        }

        /**
         * @return ageLowerLimitReliability
         */
        public String getAgeLowerLimitReliability() {
            return this.ageLowerLimitReliability;
        }

        /**
         * @return ageUpLimit
         */
        public Integer getAgeUpLimit() {
            return this.ageUpLimit;
        }

        /**
         * @return ageUpLimitReliability
         */
        public String getAgeUpLimitReliability() {
            return this.ageUpLimitReliability;
        }

        /**
         * @return capColor
         */
        public Integer getCapColor() {
            return this.capColor;
        }

        /**
         * @return capColorReliability
         */
        public String getCapColorReliability() {
            return this.capColorReliability;
        }

        /**
         * @return capStyle
         */
        public Integer getCapStyle() {
            return this.capStyle;
        }

        /**
         * @return capStyleReliability
         */
        public String getCapStyleReliability() {
            return this.capStyleReliability;
        }

        /**
         * @return ethicCode
         */
        public Integer getEthicCode() {
            return this.ethicCode;
        }

        /**
         * @return ethicCodeReliability
         */
        public String getEthicCodeReliability() {
            return this.ethicCodeReliability;
        }

        /**
         * @return faceStyle
         */
        public String getFaceStyle() {
            return this.faceStyle;
        }

        /**
         * @return faceStyleReliability
         */
        public String getFaceStyleReliability() {
            return this.faceStyleReliability;
        }

        /**
         * @return featureData
         */
        public java.util.List < Float > getFeatureData() {
            return this.featureData;
        }

        /**
         * @return genderCode
         */
        public Integer getGenderCode() {
            return this.genderCode;
        }

        /**
         * @return genderCodeReliability
         */
        public String getGenderCodeReliability() {
            return this.genderCodeReliability;
        }

        /**
         * @return glassColor
         */
        public Integer getGlassColor() {
            return this.glassColor;
        }

        /**
         * @return glassColorReliability
         */
        public String getGlassColorReliability() {
            return this.glassColorReliability;
        }

        /**
         * @return glassStyle
         */
        public Integer getGlassStyle() {
            return this.glassStyle;
        }

        /**
         * @return glassStyleReliability
         */
        public String getGlassStyleReliability() {
            return this.glassStyleReliability;
        }

        /**
         * @return hairColor
         */
        public Integer getHairColor() {
            return this.hairColor;
        }

        /**
         * @return hairColorReliability
         */
        public String getHairColorReliability() {
            return this.hairColorReliability;
        }

        /**
         * @return hairStyle
         */
        public Integer getHairStyle() {
            return this.hairStyle;
        }

        /**
         * @return hairStyleReliability
         */
        public String getHairStyleReliability() {
            return this.hairStyleReliability;
        }

        /**
         * @return leftTopX
         */
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return mustacheStyle
         */
        public String getMustacheStyle() {
            return this.mustacheStyle;
        }

        /**
         * @return mustacheStyleReliability
         */
        public String getMustacheStyleReliability() {
            return this.mustacheStyleReliability;
        }

        /**
         * @return respiratorColor
         */
        public Integer getRespiratorColor() {
            return this.respiratorColor;
        }

        /**
         * @return respiratorColorReliability
         */
        public String getRespiratorColorReliability() {
            return this.respiratorColorReliability;
        }

        /**
         * @return rightBottomX
         */
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        /**
         * @return skinColor
         */
        public Integer getSkinColor() {
            return this.skinColor;
        }

        /**
         * @return skinColorReliability
         */
        public String getSkinColorReliability() {
            return this.skinColorReliability;
        }

        public static final class Builder {
            private Integer ageLowerLimit; 
            private String ageLowerLimitReliability; 
            private Integer ageUpLimit; 
            private String ageUpLimitReliability; 
            private Integer capColor; 
            private String capColorReliability; 
            private Integer capStyle; 
            private String capStyleReliability; 
            private Integer ethicCode; 
            private String ethicCodeReliability; 
            private String faceStyle; 
            private String faceStyleReliability; 
            private java.util.List < Float > featureData; 
            private Integer genderCode; 
            private String genderCodeReliability; 
            private Integer glassColor; 
            private String glassColorReliability; 
            private Integer glassStyle; 
            private String glassStyleReliability; 
            private Integer hairColor; 
            private String hairColorReliability; 
            private Integer hairStyle; 
            private String hairStyleReliability; 
            private Float leftTopX; 
            private Float leftTopY; 
            private String mustacheStyle; 
            private String mustacheStyleReliability; 
            private Integer respiratorColor; 
            private String respiratorColorReliability; 
            private Float rightBottomX; 
            private Float rightBottomY; 
            private Integer skinColor; 
            private String skinColorReliability; 

            /**
             * AgeLowerLimit.
             */
            public Builder ageLowerLimit(Integer ageLowerLimit) {
                this.ageLowerLimit = ageLowerLimit;
                return this;
            }

            /**
             * AgeLowerLimitReliability.
             */
            public Builder ageLowerLimitReliability(String ageLowerLimitReliability) {
                this.ageLowerLimitReliability = ageLowerLimitReliability;
                return this;
            }

            /**
             * AgeUpLimit.
             */
            public Builder ageUpLimit(Integer ageUpLimit) {
                this.ageUpLimit = ageUpLimit;
                return this;
            }

            /**
             * AgeUpLimitReliability.
             */
            public Builder ageUpLimitReliability(String ageUpLimitReliability) {
                this.ageUpLimitReliability = ageUpLimitReliability;
                return this;
            }

            /**
             * CapColor.
             */
            public Builder capColor(Integer capColor) {
                this.capColor = capColor;
                return this;
            }

            /**
             * CapColorReliability.
             */
            public Builder capColorReliability(String capColorReliability) {
                this.capColorReliability = capColorReliability;
                return this;
            }

            /**
             * CapStyle.
             */
            public Builder capStyle(Integer capStyle) {
                this.capStyle = capStyle;
                return this;
            }

            /**
             * CapStyleReliability.
             */
            public Builder capStyleReliability(String capStyleReliability) {
                this.capStyleReliability = capStyleReliability;
                return this;
            }

            /**
             * EthicCode.
             */
            public Builder ethicCode(Integer ethicCode) {
                this.ethicCode = ethicCode;
                return this;
            }

            /**
             * EthicCodeReliability.
             */
            public Builder ethicCodeReliability(String ethicCodeReliability) {
                this.ethicCodeReliability = ethicCodeReliability;
                return this;
            }

            /**
             * FaceStyle.
             */
            public Builder faceStyle(String faceStyle) {
                this.faceStyle = faceStyle;
                return this;
            }

            /**
             * FaceStyleReliability.
             */
            public Builder faceStyleReliability(String faceStyleReliability) {
                this.faceStyleReliability = faceStyleReliability;
                return this;
            }

            /**
             * FeatureData.
             */
            public Builder featureData(java.util.List < Float > featureData) {
                this.featureData = featureData;
                return this;
            }

            /**
             * GenderCode.
             */
            public Builder genderCode(Integer genderCode) {
                this.genderCode = genderCode;
                return this;
            }

            /**
             * GenderCodeReliability.
             */
            public Builder genderCodeReliability(String genderCodeReliability) {
                this.genderCodeReliability = genderCodeReliability;
                return this;
            }

            /**
             * GlassColor.
             */
            public Builder glassColor(Integer glassColor) {
                this.glassColor = glassColor;
                return this;
            }

            /**
             * GlassColorReliability.
             */
            public Builder glassColorReliability(String glassColorReliability) {
                this.glassColorReliability = glassColorReliability;
                return this;
            }

            /**
             * GlassStyle.
             */
            public Builder glassStyle(Integer glassStyle) {
                this.glassStyle = glassStyle;
                return this;
            }

            /**
             * GlassStyleReliability.
             */
            public Builder glassStyleReliability(String glassStyleReliability) {
                this.glassStyleReliability = glassStyleReliability;
                return this;
            }

            /**
             * HairColor.
             */
            public Builder hairColor(Integer hairColor) {
                this.hairColor = hairColor;
                return this;
            }

            /**
             * HairColorReliability.
             */
            public Builder hairColorReliability(String hairColorReliability) {
                this.hairColorReliability = hairColorReliability;
                return this;
            }

            /**
             * HairStyle.
             */
            public Builder hairStyle(Integer hairStyle) {
                this.hairStyle = hairStyle;
                return this;
            }

            /**
             * HairStyleReliability.
             */
            public Builder hairStyleReliability(String hairStyleReliability) {
                this.hairStyleReliability = hairStyleReliability;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(Float leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(Float leftTopY) {
                this.leftTopY = leftTopY;
                return this;
            }

            /**
             * MustacheStyle.
             */
            public Builder mustacheStyle(String mustacheStyle) {
                this.mustacheStyle = mustacheStyle;
                return this;
            }

            /**
             * MustacheStyleReliability.
             */
            public Builder mustacheStyleReliability(String mustacheStyleReliability) {
                this.mustacheStyleReliability = mustacheStyleReliability;
                return this;
            }

            /**
             * RespiratorColor.
             */
            public Builder respiratorColor(Integer respiratorColor) {
                this.respiratorColor = respiratorColor;
                return this;
            }

            /**
             * RespiratorColorReliability.
             */
            public Builder respiratorColorReliability(String respiratorColorReliability) {
                this.respiratorColorReliability = respiratorColorReliability;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(Float rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(Float rightBottomY) {
                this.rightBottomY = rightBottomY;
                return this;
            }

            /**
             * SkinColor.
             */
            public Builder skinColor(Integer skinColor) {
                this.skinColor = skinColor;
                return this;
            }

            /**
             * SkinColorReliability.
             */
            public Builder skinColorReliability(String skinColorReliability) {
                this.skinColorReliability = skinColorReliability;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Records")
        private java.util.List < Records> records;

        private Data(Builder builder) {
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private java.util.List < Records> records; 

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
