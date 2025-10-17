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
 * {@link FaceCrossCompareIntlResponseBody} extends {@link TeaModel}
 *
 * <p>FaceCrossCompareIntlResponseBody</p>
 */
public class FaceCrossCompareIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private FaceCrossCompareIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceCrossCompareIntlResponseBody create() {
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

        private Builder(FaceCrossCompareIntlResponseBody model) {
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
         * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
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

        public FaceCrossCompareIntlResponseBody build() {
            return new FaceCrossCompareIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FaceCrossCompareIntlResponseBody} extends {@link TeaModel}
     *
     * <p>FaceCrossCompareIntlResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceComparisonScoreA2B")
        private Double faceComparisonScoreA2B;

        @com.aliyun.core.annotation.NameInMap("FaceComparisonScoreB2C")
        private Double faceComparisonScoreB2C;

        @com.aliyun.core.annotation.NameInMap("FaceComparisonScoreC2A")
        private Double faceComparisonScoreC2A;

        @com.aliyun.core.annotation.NameInMap("FacePassed")
        private String facePassed;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.faceComparisonScoreA2B = builder.faceComparisonScoreA2B;
            this.faceComparisonScoreB2C = builder.faceComparisonScoreB2C;
            this.faceComparisonScoreC2A = builder.faceComparisonScoreC2A;
            this.facePassed = builder.facePassed;
            this.transactionId = builder.transactionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return faceComparisonScoreA2B
         */
        public Double getFaceComparisonScoreA2B() {
            return this.faceComparisonScoreA2B;
        }

        /**
         * @return faceComparisonScoreB2C
         */
        public Double getFaceComparisonScoreB2C() {
            return this.faceComparisonScoreB2C;
        }

        /**
         * @return faceComparisonScoreC2A
         */
        public Double getFaceComparisonScoreC2A() {
            return this.faceComparisonScoreC2A;
        }

        /**
         * @return facePassed
         */
        public String getFacePassed() {
            return this.facePassed;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        public static final class Builder {
            private Double faceComparisonScoreA2B; 
            private Double faceComparisonScoreB2C; 
            private Double faceComparisonScoreC2A; 
            private String facePassed; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.faceComparisonScoreA2B = model.faceComparisonScoreA2B;
                this.faceComparisonScoreB2C = model.faceComparisonScoreB2C;
                this.faceComparisonScoreC2A = model.faceComparisonScoreC2A;
                this.facePassed = model.facePassed;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>A to B comparison score, range 0～100.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder faceComparisonScoreA2B(Double faceComparisonScoreA2B) {
                this.faceComparisonScoreA2B = faceComparisonScoreA2B;
                return this;
            }

            /**
             * <p>B to C comparison score, range 0～100.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder faceComparisonScoreB2C(Double faceComparisonScoreB2C) {
                this.faceComparisonScoreB2C = faceComparisonScoreB2C;
                return this;
            }

            /**
             * <p>C to A comparison score, range 0～100.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder faceComparisonScoreC2A(Double faceComparisonScoreC2A) {
                this.faceComparisonScoreC2A = faceComparisonScoreC2A;
                return this;
            }

            /**
             * <p>Final verification result, values:</p>
             * <ul>
             * <li>Y: Pass</li>
             * <li>N: Fail</li>
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
             * <p>Unique identifier for the authentication request.</p>
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
