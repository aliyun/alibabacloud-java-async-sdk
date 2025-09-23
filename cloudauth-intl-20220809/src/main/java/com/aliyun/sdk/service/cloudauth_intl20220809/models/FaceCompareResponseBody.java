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
 * {@link FaceCompareResponseBody} extends {@link TeaModel}
 *
 * <p>FaceCompareResponseBody</p>
 */
public class FaceCompareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private FaceCompareResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceCompareResponseBody create() {
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

        private Builder(FaceCompareResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The <a href="https://www.alibabacloud.com/help/en/ekyc/latest/facecompare?spm=a3c0i.23458820.2359477120.28.21167d3fzUmXQC#c43fd16d07mae">response code</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed description of the response code.</p>
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
         * <p>4EB356FE-BB6A-5DCC-B4C5-E8051787EBA1</p>
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

        public FaceCompareResponseBody build() {
            return new FaceCompareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FaceCompareResponseBody} extends {@link TeaModel}
     *
     * <p>FaceCompareResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceComparisonScore")
        private Double faceComparisonScore;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.faceComparisonScore = builder.faceComparisonScore;
            this.passed = builder.passed;
            this.transactionId = builder.transactionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return faceComparisonScore
         */
        public Double getFaceComparisonScore() {
            return this.faceComparisonScore;
        }

        /**
         * @return passed
         */
        public String getPassed() {
            return this.passed;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        public static final class Builder {
            private Double faceComparisonScore; 
            private String passed; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.faceComparisonScore = model.faceComparisonScore;
                this.passed = model.passed;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>The face comparison score. The value ranges from 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder faceComparisonScore(Double faceComparisonScore) {
                this.faceComparisonScore = faceComparisonScore;
                return this;
            }

            /**
             * <p>The final authentication result. Valid values:</p>
             * <ul>
             * <li><p><strong>Y</strong>: The authentication is passed.</p>
             * </li>
             * <li><p><strong>N</strong>: The authentication failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder passed(String passed) {
                this.passed = passed;
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
