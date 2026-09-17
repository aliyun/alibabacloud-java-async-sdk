// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FaceDuplicationCheckIntlResponseBody} extends {@link TeaModel}
 *
 * <p>FaceDuplicationCheckIntlResponseBody</p>
 */
public class FaceDuplicationCheckIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private FaceDuplicationCheckIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceDuplicationCheckIntlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(FaceDuplicationCheckIntlResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public FaceDuplicationCheckIntlResponseBody build() {
            return new FaceDuplicationCheckIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FaceDuplicationCheckIntlResponseBody} extends {@link TeaModel}
     *
     * <p>FaceDuplicationCheckIntlResponseBody</p>
     */
    public static class ExtFaceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceAttributeInfo")
        private String faceAttributeInfo;

        @com.aliyun.core.annotation.NameInMap("FaceQualityScore")
        private Double faceQualityScore;

        @com.aliyun.core.annotation.NameInMap("IlluminationScore")
        private Double illuminationScore;

        @com.aliyun.core.annotation.NameInMap("KaOcclusionScore")
        private Double kaOcclusionScore;

        @com.aliyun.core.annotation.NameInMap("OcclusionScore")
        private Double occlusionScore;

        @com.aliyun.core.annotation.NameInMap("SharpnessScore")
        private Double sharpnessScore;

        @com.aliyun.core.annotation.NameInMap("TargetFaceQualityScore")
        private Double targetFaceQualityScore;

        @com.aliyun.core.annotation.NameInMap("TargetIlluminationScore")
        private Double targetIlluminationScore;

        @com.aliyun.core.annotation.NameInMap("TargetKaOcclusionScore")
        private Double targetKaOcclusionScore;

        @com.aliyun.core.annotation.NameInMap("TargetOcclusionScore")
        private Double targetOcclusionScore;

        @com.aliyun.core.annotation.NameInMap("TargetSharpnessScore")
        private Double targetSharpnessScore;

        private ExtFaceInfo(Builder builder) {
            this.faceAttributeInfo = builder.faceAttributeInfo;
            this.faceQualityScore = builder.faceQualityScore;
            this.illuminationScore = builder.illuminationScore;
            this.kaOcclusionScore = builder.kaOcclusionScore;
            this.occlusionScore = builder.occlusionScore;
            this.sharpnessScore = builder.sharpnessScore;
            this.targetFaceQualityScore = builder.targetFaceQualityScore;
            this.targetIlluminationScore = builder.targetIlluminationScore;
            this.targetKaOcclusionScore = builder.targetKaOcclusionScore;
            this.targetOcclusionScore = builder.targetOcclusionScore;
            this.targetSharpnessScore = builder.targetSharpnessScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtFaceInfo create() {
            return builder().build();
        }

        /**
         * @return faceAttributeInfo
         */
        public String getFaceAttributeInfo() {
            return this.faceAttributeInfo;
        }

        /**
         * @return faceQualityScore
         */
        public Double getFaceQualityScore() {
            return this.faceQualityScore;
        }

        /**
         * @return illuminationScore
         */
        public Double getIlluminationScore() {
            return this.illuminationScore;
        }

        /**
         * @return kaOcclusionScore
         */
        public Double getKaOcclusionScore() {
            return this.kaOcclusionScore;
        }

        /**
         * @return occlusionScore
         */
        public Double getOcclusionScore() {
            return this.occlusionScore;
        }

        /**
         * @return sharpnessScore
         */
        public Double getSharpnessScore() {
            return this.sharpnessScore;
        }

        /**
         * @return targetFaceQualityScore
         */
        public Double getTargetFaceQualityScore() {
            return this.targetFaceQualityScore;
        }

        /**
         * @return targetIlluminationScore
         */
        public Double getTargetIlluminationScore() {
            return this.targetIlluminationScore;
        }

        /**
         * @return targetKaOcclusionScore
         */
        public Double getTargetKaOcclusionScore() {
            return this.targetKaOcclusionScore;
        }

        /**
         * @return targetOcclusionScore
         */
        public Double getTargetOcclusionScore() {
            return this.targetOcclusionScore;
        }

        /**
         * @return targetSharpnessScore
         */
        public Double getTargetSharpnessScore() {
            return this.targetSharpnessScore;
        }

        public static final class Builder {
            private String faceAttributeInfo; 
            private Double faceQualityScore; 
            private Double illuminationScore; 
            private Double kaOcclusionScore; 
            private Double occlusionScore; 
            private Double sharpnessScore; 
            private Double targetFaceQualityScore; 
            private Double targetIlluminationScore; 
            private Double targetKaOcclusionScore; 
            private Double targetOcclusionScore; 
            private Double targetSharpnessScore; 

            private Builder() {
            } 

            private Builder(ExtFaceInfo model) {
                this.faceAttributeInfo = model.faceAttributeInfo;
                this.faceQualityScore = model.faceQualityScore;
                this.illuminationScore = model.illuminationScore;
                this.kaOcclusionScore = model.kaOcclusionScore;
                this.occlusionScore = model.occlusionScore;
                this.sharpnessScore = model.sharpnessScore;
                this.targetFaceQualityScore = model.targetFaceQualityScore;
                this.targetIlluminationScore = model.targetIlluminationScore;
                this.targetKaOcclusionScore = model.targetKaOcclusionScore;
                this.targetOcclusionScore = model.targetOcclusionScore;
                this.targetSharpnessScore = model.targetSharpnessScore;
            } 

            /**
             * FaceAttributeInfo.
             */
            public Builder faceAttributeInfo(String faceAttributeInfo) {
                this.faceAttributeInfo = faceAttributeInfo;
                return this;
            }

            /**
             * <p>The overall quality score.</p>
             * 
             * <strong>example:</strong>
             * <p>39.04</p>
             */
            public Builder faceQualityScore(Double faceQualityScore) {
                this.faceQualityScore = faceQualityScore;
                return this;
            }

            /**
             * <p>The illumination score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
             */
            public Builder illuminationScore(Double illuminationScore) {
                this.illuminationScore = illuminationScore;
                return this;
            }

            /**
             * <p>The key area occlusion score.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder kaOcclusionScore(Double kaOcclusionScore) {
                this.kaOcclusionScore = kaOcclusionScore;
                return this;
            }

            /**
             * <p>The occlusion score.</p>
             * 
             * <strong>example:</strong>
             * <p>50.26</p>
             */
            public Builder occlusionScore(Double occlusionScore) {
                this.occlusionScore = occlusionScore;
                return this;
            }

            /**
             * <p>The sharpness score.</p>
             * 
             * <strong>example:</strong>
             * <p>86.47</p>
             */
            public Builder sharpnessScore(Double sharpnessScore) {
                this.sharpnessScore = sharpnessScore;
                return this;
            }

            /**
             * TargetFaceQualityScore.
             */
            public Builder targetFaceQualityScore(Double targetFaceQualityScore) {
                this.targetFaceQualityScore = targetFaceQualityScore;
                return this;
            }

            /**
             * TargetIlluminationScore.
             */
            public Builder targetIlluminationScore(Double targetIlluminationScore) {
                this.targetIlluminationScore = targetIlluminationScore;
                return this;
            }

            /**
             * TargetKaOcclusionScore.
             */
            public Builder targetKaOcclusionScore(Double targetKaOcclusionScore) {
                this.targetKaOcclusionScore = targetKaOcclusionScore;
                return this;
            }

            /**
             * TargetOcclusionScore.
             */
            public Builder targetOcclusionScore(Double targetOcclusionScore) {
                this.targetOcclusionScore = targetOcclusionScore;
                return this;
            }

            /**
             * TargetSharpnessScore.
             */
            public Builder targetSharpnessScore(Double targetSharpnessScore) {
                this.targetSharpnessScore = targetSharpnessScore;
                return this;
            }

            public ExtFaceInfo build() {
                return new ExtFaceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FaceDuplicationCheckIntlResponseBody} extends {@link TeaModel}
     *
     * <p>FaceDuplicationCheckIntlResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DuplicateFace")
        private String duplicateFace;

        @com.aliyun.core.annotation.NameInMap("ExtFaceInfo")
        private ExtFaceInfo extFaceInfo;

        @com.aliyun.core.annotation.NameInMap("FaceAge")
        private String faceAge;

        @com.aliyun.core.annotation.NameInMap("FaceAttack")
        private String faceAttack;

        @com.aliyun.core.annotation.NameInMap("FaceAttackScore")
        private String faceAttackScore;

        @com.aliyun.core.annotation.NameInMap("FaceComparisonScore")
        private String faceComparisonScore;

        @com.aliyun.core.annotation.NameInMap("FaceGender")
        private String faceGender;

        @com.aliyun.core.annotation.NameInMap("FacePassed")
        private String facePassed;

        @com.aliyun.core.annotation.NameInMap("FaceRegistrationId")
        private String faceRegistrationId;

        @com.aliyun.core.annotation.NameInMap("FaceRegistrationResult")
        private Integer faceRegistrationResult;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.duplicateFace = builder.duplicateFace;
            this.extFaceInfo = builder.extFaceInfo;
            this.faceAge = builder.faceAge;
            this.faceAttack = builder.faceAttack;
            this.faceAttackScore = builder.faceAttackScore;
            this.faceComparisonScore = builder.faceComparisonScore;
            this.faceGender = builder.faceGender;
            this.facePassed = builder.facePassed;
            this.faceRegistrationId = builder.faceRegistrationId;
            this.faceRegistrationResult = builder.faceRegistrationResult;
            this.subCode = builder.subCode;
            this.transactionId = builder.transactionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return duplicateFace
         */
        public String getDuplicateFace() {
            return this.duplicateFace;
        }

        /**
         * @return extFaceInfo
         */
        public ExtFaceInfo getExtFaceInfo() {
            return this.extFaceInfo;
        }

        /**
         * @return faceAge
         */
        public String getFaceAge() {
            return this.faceAge;
        }

        /**
         * @return faceAttack
         */
        public String getFaceAttack() {
            return this.faceAttack;
        }

        /**
         * @return faceAttackScore
         */
        public String getFaceAttackScore() {
            return this.faceAttackScore;
        }

        /**
         * @return faceComparisonScore
         */
        public String getFaceComparisonScore() {
            return this.faceComparisonScore;
        }

        /**
         * @return faceGender
         */
        public String getFaceGender() {
            return this.faceGender;
        }

        /**
         * @return facePassed
         */
        public String getFacePassed() {
            return this.facePassed;
        }

        /**
         * @return faceRegistrationId
         */
        public String getFaceRegistrationId() {
            return this.faceRegistrationId;
        }

        /**
         * @return faceRegistrationResult
         */
        public Integer getFaceRegistrationResult() {
            return this.faceRegistrationResult;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        public static final class Builder {
            private String duplicateFace; 
            private ExtFaceInfo extFaceInfo; 
            private String faceAge; 
            private String faceAttack; 
            private String faceAttackScore; 
            private String faceComparisonScore; 
            private String faceGender; 
            private String facePassed; 
            private String faceRegistrationId; 
            private Integer faceRegistrationResult; 
            private String subCode; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.duplicateFace = model.duplicateFace;
                this.extFaceInfo = model.extFaceInfo;
                this.faceAge = model.faceAge;
                this.faceAttack = model.faceAttack;
                this.faceAttackScore = model.faceAttackScore;
                this.faceComparisonScore = model.faceComparisonScore;
                this.faceGender = model.faceGender;
                this.facePassed = model.facePassed;
                this.faceRegistrationId = model.faceRegistrationId;
                this.faceRegistrationResult = model.faceRegistrationResult;
                this.subCode = model.subCode;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>The face ID and UserID retrieved from the face library when a duplicate face is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;faceGroupCode&quot;: &quot;sg7<strong><strong>uzt&quot;,
             *         &quot;faceId&quot;: &quot;f5a921</strong></strong><em><strong>9e792ec84c8f0ca592a&quot;,
             *         &quot;merchantUserId&quot;: &quot;fa</strong></em>*01&quot;
             *     }
             * ]</p>
             */
            public Builder duplicateFace(String duplicateFace) {
                this.duplicateFace = duplicateFace;
                return this;
            }

            /**
             * <p>The related result information.</p>
             */
            public Builder extFaceInfo(ExtFaceInfo extFaceInfo) {
                this.extFaceInfo = extFaceInfo;
                return this;
            }

            /**
             * <p>The predicted reference age of the face. The prediction may fail and the value may not be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder faceAge(String faceAge) {
                this.faceAge = faceAge;
                return this;
            }

            /**
             * <p>Indicates whether the captured face involves a liveness attack. Valid values: Y (attack detected) and N (no attack detected). This field is returned only when passive liveness detection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder faceAttack(String faceAttack) {
                this.faceAttack = faceAttack;
                return this;
            }

            /**
             * <p>The probability of a liveness attack on the face. The value ranges from 0 to 100. This field is returned only when passive liveness detection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder faceAttackScore(String faceAttackScore) {
                this.faceAttackScore = faceAttackScore;
                return this;
            }

            /**
             * <p>The 1:1 comparison score returned when the verification mode is 1 or 2. The score ranges from 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder faceComparisonScore(String faceComparisonScore) {
                this.faceComparisonScore = faceComparisonScore;
                return this;
            }

            /**
             * <p>The predicted gender of the face image. The prediction may fail and the value may not be returned. Valid values:</p>
             * <ul>
             * <li>M: male.</li>
             * <li>F: female.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>M</p>
             */
            public Builder faceGender(String faceGender) {
                this.faceGender = faceGender;
                return this;
            }

            /**
             * <p>The final verification result. Valid values:</p>
             * <ul>
             * <li>Y: passed.</li>
             * <li>N: not passed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder facePassed(String facePassed) {
                this.facePassed = facePassed;
                return this;
            }

            /**
             * <p>The corresponding FACEID returned only when the customer has enabled automatic registration and the face is successfully registered.</p>
             * 
             * <strong>example:</strong>
             * <p>9e792ec84c8f0ca592a</p>
             */
            public Builder faceRegistrationId(String faceRegistrationId) {
                this.faceRegistrationId = faceRegistrationId;
                return this;
            }

            /**
             * <p>The face registration result. Valid values: </p>
             * <ul>
             * <li>0: failed. </li>
             * <li>1: succeeded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder faceRegistrationResult(Integer faceRegistrationResult) {
                this.faceRegistrationResult = faceRegistrationResult;
                return this;
            }

            /**
             * <p>The verification result description. For more information, refer to the ResultObject.SubCode error code description.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>The unique identifier of the verification request.</p>
             * 
             * <strong>example:</strong>
             * <p>4ab0b***cbde97</p>
             */
            public Builder transactionId(String transactionId) {
                this.transactionId = transactionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
