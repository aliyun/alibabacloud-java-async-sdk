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
         * <p>Return code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result.</p>
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
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DuplicateFace")
        private String duplicateFace;

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
             * <p>Returns the face library face ID and UserID when a duplicate face is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             * {&quot;faceGroupCode&quot;:&quot;sg7<strong><strong>uzt&quot;,&quot;faceId&quot;:&quot;f5a921</strong></strong>***9e792ec84c8f0ca592a&quot;}
             * ]</p>
             */
            public Builder duplicateFace(String duplicateFace) {
                this.duplicateFace = duplicateFace;
                return this;
            }

            /**
             * <p>The estimated age of the face, which may not be returned if the prediction fails.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder faceAge(String faceAge) {
                this.faceAge = faceAge;
                return this;
            }

            /**
             * <p>Indicates whether the captured face involves a liveness attack, Y for an attack, N for no attack.
             * Returned when silent liveness detection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder faceAttack(String faceAttack) {
                this.faceAttack = faceAttack;
                return this;
            }

            /**
             * <p>The probability of a liveness attack detected by silent liveness detection. The value range is 0 to 100.
             * Returned when silent liveness detection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder faceAttackScore(String faceAttackScore) {
                this.faceAttackScore = faceAttackScore;
                return this;
            }

            /**
             * <p>When the verification mode is 1 or 2, returns the 1:1 verification comparison score
             * Comparison score range 0～100.</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder faceComparisonScore(String faceComparisonScore) {
                this.faceComparisonScore = faceComparisonScore;
                return this;
            }

            /**
             * <p>The predicted gender of the face in the image, which may not be returned if the prediction fails.</p>
             * <ul>
             * <li>M: Male</li>
             * <li>F: Female</li>
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
             * <p>Final authentication result, values:</p>
             * <ul>
             * <li>Y: Passed</li>
             * <li>N: Not passed</li>
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
             * <p>Returns the corresponding FACEID only when the customer sets auto-registration and the face registration is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>9e792ec84c8f0ca592a</p>
             */
            public Builder faceRegistrationId(String faceRegistrationId) {
                this.faceRegistrationId = faceRegistrationId;
                return this;
            }

            /**
             * <p>Face registration result </p>
             * <ul>
             * <li>0- Failed </li>
             * <li>1- Succeeded</li>
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
             * <p>Description of the authentication result. For more information, see ResultObject.SubCode error code description.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>Unique identifier of the authentication request.</p>
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
