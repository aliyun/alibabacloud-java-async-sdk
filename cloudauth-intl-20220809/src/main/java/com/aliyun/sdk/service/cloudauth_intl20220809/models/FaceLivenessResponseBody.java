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
 * {@link FaceLivenessResponseBody} extends {@link TeaModel}
 *
 * <p>FaceLivenessResponseBody</p>
 */
public class FaceLivenessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private FaceLivenessResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceLivenessResponseBody create() {
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

        private Builder(FaceLivenessResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The description of the return result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique ID that Alibaba Cloud generates for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>42EA58CA-5DF4-55D5-82C4-5E7A40DA62BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public FaceLivenessResponseBody build() {
            return new FaceLivenessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FaceLivenessResponseBody} extends {@link TeaModel}
     *
     * <p>FaceLivenessResponseBody</p>
     */
    public static class ExtFaceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceAge")
        private Integer faceAge;

        @com.aliyun.core.annotation.NameInMap("FaceAttack")
        private String faceAttack;

        @com.aliyun.core.annotation.NameInMap("FaceAttributeInfo")
        private String faceAttributeInfo;

        @com.aliyun.core.annotation.NameInMap("FaceGender")
        private String faceGender;

        @com.aliyun.core.annotation.NameInMap("FaceQualityScore")
        private Double faceQualityScore;

        @com.aliyun.core.annotation.NameInMap("IlluminationScore")
        private Double illuminationScore;

        @com.aliyun.core.annotation.NameInMap("KaOcclusionScore")
        private Double kaOcclusionScore;

        @com.aliyun.core.annotation.NameInMap("OcclusionResult")
        private String occlusionResult;

        @com.aliyun.core.annotation.NameInMap("OcclusionScore")
        private Double occlusionScore;

        @com.aliyun.core.annotation.NameInMap("SharpnessScore")
        private Double sharpnessScore;

        private ExtFaceInfo(Builder builder) {
            this.faceAge = builder.faceAge;
            this.faceAttack = builder.faceAttack;
            this.faceAttributeInfo = builder.faceAttributeInfo;
            this.faceGender = builder.faceGender;
            this.faceQualityScore = builder.faceQualityScore;
            this.illuminationScore = builder.illuminationScore;
            this.kaOcclusionScore = builder.kaOcclusionScore;
            this.occlusionResult = builder.occlusionResult;
            this.occlusionScore = builder.occlusionScore;
            this.sharpnessScore = builder.sharpnessScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtFaceInfo create() {
            return builder().build();
        }

        /**
         * @return faceAge
         */
        public Integer getFaceAge() {
            return this.faceAge;
        }

        /**
         * @return faceAttack
         */
        public String getFaceAttack() {
            return this.faceAttack;
        }

        /**
         * @return faceAttributeInfo
         */
        public String getFaceAttributeInfo() {
            return this.faceAttributeInfo;
        }

        /**
         * @return faceGender
         */
        public String getFaceGender() {
            return this.faceGender;
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
         * @return occlusionResult
         */
        public String getOcclusionResult() {
            return this.occlusionResult;
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

        public static final class Builder {
            private Integer faceAge; 
            private String faceAttack; 
            private String faceAttributeInfo; 
            private String faceGender; 
            private Double faceQualityScore; 
            private Double illuminationScore; 
            private Double kaOcclusionScore; 
            private String occlusionResult; 
            private Double occlusionScore; 
            private Double sharpnessScore; 

            private Builder() {
            } 

            private Builder(ExtFaceInfo model) {
                this.faceAge = model.faceAge;
                this.faceAttack = model.faceAttack;
                this.faceAttributeInfo = model.faceAttributeInfo;
                this.faceGender = model.faceGender;
                this.faceQualityScore = model.faceQualityScore;
                this.illuminationScore = model.illuminationScore;
                this.kaOcclusionScore = model.kaOcclusionScore;
                this.occlusionResult = model.occlusionResult;
                this.occlusionScore = model.occlusionScore;
                this.sharpnessScore = model.sharpnessScore;
            } 

            /**
             * <p>The predicted reference age based on the face image. The prediction may fail, in which case no value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder faceAge(Integer faceAge) {
                this.faceAge = faceAge;
                return this;
            }

            /**
             * <p>The liveness detection result. Valid values: Y (attack detected) and N (normal).</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder faceAttack(String faceAttack) {
                this.faceAttack = faceAttack;
                return this;
            }

            /**
             * FaceAttributeInfo.
             */
            public Builder faceAttributeInfo(String faceAttributeInfo) {
                this.faceAttributeInfo = faceAttributeInfo;
                return this;
            }

            /**
             * <p>The predicted gender based on the face image. The prediction may fail, in which case no value is returned. Valid values:</p>
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
             * <p>The face quality score (0 to 100). This value is returned only when the face quality score switch is enabled in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>87.19</p>
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
             * <p>The occlusion detection result. Valid values: Y (occluded) and N (not occluded). This value is returned only when the occlusion detection switch is enabled in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder occlusionResult(String occlusionResult) {
                this.occlusionResult = occlusionResult;
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

            public ExtFaceInfo build() {
                return new ExtFaceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FaceLivenessResponseBody} extends {@link TeaModel}
     *
     * <p>FaceLivenessResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtFaceInfo")
        private ExtFaceInfo extFaceInfo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.extFaceInfo = builder.extFaceInfo;
            this.passed = builder.passed;
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
         * @return extFaceInfo
         */
        public ExtFaceInfo getExtFaceInfo() {
            return this.extFaceInfo;
        }

        /**
         * @return passed
         */
        public String getPassed() {
            return this.passed;
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
            private ExtFaceInfo extFaceInfo; 
            private String passed; 
            private String subCode; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.extFaceInfo = model.extFaceInfo;
                this.passed = model.passed;
                this.subCode = model.subCode;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>The face result information.</p>
             */
            public Builder extFaceInfo(ExtFaceInfo extFaceInfo) {
                this.extFaceInfo = extFaceInfo;
                return this;
            }

            /**
             * <p>Indicates whether the authentication passed. Valid values:</p>
             * <ul>
             * <li>Y: passed.</li>
             * <li>N: not passed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder passed(String passed) {
                this.passed = passed;
                return this;
            }

            /**
             * <p>The sub-result code.</p>
             * 
             * <strong>example:</strong>
             * <p>205</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>The unique ID of the authentication request.</p>
             * 
             * <strong>example:</strong>
             * <p>08573be80f944d95ac812e019e3655a8</p>
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
