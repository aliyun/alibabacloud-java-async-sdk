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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * Result.
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
             * FaceAge.
             */
            public Builder faceAge(Integer faceAge) {
                this.faceAge = faceAge;
                return this;
            }

            /**
             * FaceAttack.
             */
            public Builder faceAttack(String faceAttack) {
                this.faceAttack = faceAttack;
                return this;
            }

            /**
             * FaceGender.
             */
            public Builder faceGender(String faceGender) {
                this.faceGender = faceGender;
                return this;
            }

            /**
             * FaceQualityScore.
             */
            public Builder faceQualityScore(Double faceQualityScore) {
                this.faceQualityScore = faceQualityScore;
                return this;
            }

            /**
             * OcclusionResult.
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
             * ExtFaceInfo.
             */
            public Builder extFaceInfo(ExtFaceInfo extFaceInfo) {
                this.extFaceInfo = extFaceInfo;
                return this;
            }

            /**
             * Passed.
             */
            public Builder passed(String passed) {
                this.passed = passed;
                return this;
            }

            /**
             * SubCode.
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * TransactionId.
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
