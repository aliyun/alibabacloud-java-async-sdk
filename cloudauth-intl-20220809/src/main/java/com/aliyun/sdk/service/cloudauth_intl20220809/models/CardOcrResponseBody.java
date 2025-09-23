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
 * {@link CardOcrResponseBody} extends {@link TeaModel}
 *
 * <p>CardOcrResponseBody</p>
 */
public class CardOcrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CardOcrResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CardOcrResponseBody create() {
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

        private Builder(CardOcrResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Return code</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message</p>
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
         * <p>4EB356FE-BB6A-5DCC-B4C5-E8051787EBA1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CardOcrResponseBody build() {
            return new CardOcrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CardOcrResponseBody} extends {@link TeaModel}
     *
     * <p>CardOcrResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtCardInfo")
        private String extCardInfo;

        @com.aliyun.core.annotation.NameInMap("ExtIdInfo")
        private String extIdInfo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.extCardInfo = builder.extCardInfo;
            this.extIdInfo = builder.extIdInfo;
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
         * @return extCardInfo
         */
        public String getExtCardInfo() {
            return this.extCardInfo;
        }

        /**
         * @return extIdInfo
         */
        public String getExtIdInfo() {
            return this.extIdInfo;
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
            private String extCardInfo; 
            private String extIdInfo; 
            private String passed; 
            private String subCode; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.extCardInfo = model.extCardInfo;
                this.extIdInfo = model.extIdInfo;
                this.passed = model.passed;
                this.subCode = model.subCode;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>Document recognition result</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;idFaceQualityScore&quot;: 98.90,
             *   &quot;ocrIdInfo&quot;: {
             *     &quot;expiryDate&quot;: &quot;2024-04-20&quot;,
             *     &quot;placeOfIssue&quot;: &quot;广东&quot;,
             *     &quot;englishName&quot;: &quot;ZHENGJIAN,YANGBEN&quot;,
             *     &quot;originOfIssue&quot;: &quot;公安部出入境管理局&quot;,
             *     &quot;sex&quot;: &quot;女&quot;,
             *     &quot;name&quot;: &quot;证件样本&quot;,
             *     &quot;idNumber&quot;: &quot;C00000000&quot;,
             *     &quot;issueDate&quot;: &quot;2014-04-21&quot;,
             *     &quot;birthDate&quot;: &quot;1981-08-03&quot;
             *   },
             *   &quot;spoofInfo&quot;: {
             *     &quot;spoofResult&quot;: &quot;N&quot;,
             *     &quot;spoofType&quot;: [
             *       &quot;SCREEN_REMARK&quot;
             *     ]
             *   }
             * }</p>
             */
            public Builder extCardInfo(String extCardInfo) {
                this.extCardInfo = extCardInfo;
                return this;
            }

            /**
             * <p>Additional result information</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder extIdInfo(String extIdInfo) {
                this.extIdInfo = extIdInfo;
                return this;
            }

            /**
             * <p>Whether the authentication passed.</p>
             * <ul>
             * <li>Y: Passed.</li>
             * <li>N: Not passed.</li>
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
             * <p>Sub-result code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>Unique identifier for the authentication request</p>
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
