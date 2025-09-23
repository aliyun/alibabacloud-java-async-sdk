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
 * {@link DocOcrResponseBody} extends {@link TeaModel}
 *
 * <p>DocOcrResponseBody</p>
 */
public class DocOcrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DocOcrResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocOcrResponseBody create() {
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

        private Builder(DocOcrResponseBody model) {
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
         * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
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

        public DocOcrResponseBody build() {
            return new DocOcrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DocOcrResponseBody} extends {@link TeaModel}
     *
     * <p>DocOcrResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtIdInfo")
        private String extIdInfo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
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
            private String extIdInfo; 
            private String passed; 
            private String subCode; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.extIdInfo = model.extIdInfo;
                this.passed = model.passed;
                this.subCode = model.subCode;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>Card and document recognition result	Only returned when the interface response is successful</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;idFaceQualityScore&quot;: 98.0
             *   &quot;ocrIdInfo&quot;: {
             *     &quot;expiryDate&quot;: &quot;&quot;,
             *     &quot;originOfIssue&quot;: &quot;公安部出入境管理局&quot;,
             *     &quot;englishName&quot;: &quot;LI SI&quot;,
             *     &quot;sex&quot;: &quot;男&quot;,
             *     &quot;name&quot;: &quot;李四&quot;,
             *     &quot;idNumber&quot;: &quot;H11111112&quot;,
             *     &quot;issueDate&quot;: &quot;2013-01-02&quot;,
             *     &quot;birthDate&quot;: &quot;1990-02-21&quot;
             *   },
             *   &quot;spoofInfo&quot;: {
             *     &quot;spoofResult&quot;: &quot;Y&quot;,
             *     &quot;spoofType&quot;: [
             *       &quot;SCREEN_REMARK&quot;
             *     ]
             *   }
             * }</p>
             */
            public Builder extIdInfo(String extIdInfo) {
                this.extIdInfo = extIdInfo;
                return this;
            }

            /**
             * <p>Whether the authentication passed.</p>
             * <ul>
             * <li>Y: Passed</li>
             * <li>N: Not passed</li>
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
             * <p>Sub-result code</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>Unique identifier of the authentication request</p>
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
