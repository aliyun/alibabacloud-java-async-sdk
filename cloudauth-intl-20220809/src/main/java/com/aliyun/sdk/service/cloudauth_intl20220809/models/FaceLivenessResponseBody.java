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
         * <p><a href="https://www.alibabacloud.com/help/en/ekyc/latest/cadqvlft48igbpdc?spm=a2c63.p38356.0.i54#3d0ed52f967g6">The response code.</a></p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>A detailed description of the response code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>42EA58CA-5DF4-55D5-82C4-5E7A40DA62BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result object</p>
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

        @com.aliyun.core.annotation.NameInMap("FaceGender")
        private String faceGender;

        @com.aliyun.core.annotation.NameInMap("FaceQualityScore")
        private Double faceQualityScore;

        @com.aliyun.core.annotation.NameInMap("OcclusionResult")
        private String occlusionResult;

        private ExtFaceInfo(Builder builder) {
            this.faceAge = builder.faceAge;
            this.faceAttack = builder.faceAttack;
            this.faceGender = builder.faceGender;
            this.faceQualityScore = builder.faceQualityScore;
            this.occlusionResult = builder.occlusionResult;
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
         * @return occlusionResult
         */
        public String getOcclusionResult() {
            return this.occlusionResult;
        }

        public static final class Builder {
            private Integer faceAge; 
            private String faceAttack; 
            private String faceGender; 
            private Double faceQualityScore; 
            private String occlusionResult; 

            private Builder() {
            } 

            private Builder(ExtFaceInfo model) {
                this.faceAge = model.faceAge;
                this.faceAttack = model.faceAttack;
                this.faceGender = model.faceGender;
                this.faceQualityScore = model.faceQualityScore;
                this.occlusionResult = model.occlusionResult;
            } 

            /**
             * <p>The predicted age of the person in the image. The prediction may fail, resulting in an empty value.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder faceAge(Integer faceAge) {
                this.faceAge = faceAge;
                return this;
            }

            /**
             * <p>Indicates whether a presentation attack was detected on the captured face. Y means an attack was detected. N means no attack was detected.</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder faceAttack(String faceAttack) {
                this.faceAttack = faceAttack;
                return this;
            }

            /**
             * <p>The predicted gender of the person in the image. The prediction may fail, resulting in an empty value.</p>
             * <ul>
             * <li><p><strong>M</strong>: Male</p>
             * </li>
             * <li><p><strong>F</strong>: Female</p>
             * </li>
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
             * <p>Optional. The quality score of the live face. The value ranges from 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>87.19</p>
             */
            public Builder faceQualityScore(Double faceQualityScore) {
                this.faceQualityScore = faceQualityScore;
                return this;
            }

            /**
             * <p>Optional. Indicates whether the face is occluded. Y means the face is occluded. N means the face is not occluded.</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder occlusionResult(String occlusionResult) {
                this.occlusionResult = occlusionResult;
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
             * <p>The results of the passive liveness detection. The value is in the JSON format. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/cadqvlft48igbpdc?spm=a2c63.p38356.0.i54#5ff42f7274agz">ExtFaceInfo</a>.</p>
             */
            public Builder extFaceInfo(ExtFaceInfo extFaceInfo) {
                this.extFaceInfo = extFaceInfo;
                return this;
            }

            /**
             * <p>The authentication result. Valid values:</p>
             * <ul>
             * <li><p>Y: The authentication is passed.</p>
             * </li>
             * <li><p>N: The authentication is not passed.</p>
             * </li>
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
             * <p>The code that corresponds to the verification result. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/cadqvlft48igbpdc?spm=a2c63.p38356.0.i54#5ff3e16174tl2">ResultObject.SubCode error codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>205</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>The transaction ID.</p>
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
