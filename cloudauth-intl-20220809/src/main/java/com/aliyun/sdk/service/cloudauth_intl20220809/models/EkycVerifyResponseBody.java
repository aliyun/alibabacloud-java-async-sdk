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
 * {@link EkycVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>EkycVerifyResponseBody</p>
 */
public class EkycVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private EkycVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EkycVerifyResponseBody create() {
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

        private Builder(EkycVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#GiGmf">response code</a>.</p>
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

        public EkycVerifyResponseBody build() {
            return new EkycVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EkycVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>EkycVerifyResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtFaceInfo")
        private String extFaceInfo;

        @com.aliyun.core.annotation.NameInMap("ExtIdInfo")
        private String extIdInfo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.extFaceInfo = builder.extFaceInfo;
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
         * @return extFaceInfo
         */
        public String getExtFaceInfo() {
            return this.extFaceInfo;
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
            private String extFaceInfo; 
            private String extIdInfo; 
            private String passed; 
            private String subCode; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.extFaceInfo = model.extFaceInfo;
                this.extIdInfo = model.extIdInfo;
                this.passed = model.passed;
                this.subCode = model.subCode;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>Information about the face liveness verification result. For the JSON format, see the example on the right. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#JJ40j">ExtFaceInfo</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * &quot;faceAttack&quot;: &quot;N&quot;,
             * &quot;faceComparisonScore&quot;: 52.57,
             * &quot;facePassed&quot;: &quot;N&quot;,
             * &quot;authorityComparisonScore&quot;: 80.39
             * }</p>
             */
            public Builder extFaceInfo(String extFaceInfo) {
                this.extFaceInfo = extFaceInfo;
                return this;
            }

            /**
             * <p>Information about the certificate detection result.</p>
             * <p>For the JSON format, see the example on the right. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#iWOBY">ExtIdInfo</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;ocrIdInfo&quot;: {
             *     &quot;expiryDate&quot;: &quot;&quot;,
             *     &quot;originOfIssue&quot;: &quot;Exit and Entry Administration of the Ministry of Public Security&quot;,
             *     &quot;englishName&quot;: &quot;LI SI&quot;,
             *     &quot;sex&quot;: &quot;Male&quot;,
             *     &quot;name&quot;: &quot;Li Si&quot;,
             *     &quot;idNumber&quot;: &quot;H11111112&quot;,
             *     &quot;issueDate&quot;: &quot;2013-01-02&quot;,
             *     &quot;birthDate&quot;: &quot;1990-02-21&quot;
             *   },
             *   &quot;ocrIdPassed&quot;: &quot;N&quot;,
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
             * <p>The final authentication result. Valid values:</p>
             * <ul>
             * <li><p><strong>Y</strong>: The authentication is passed.</p>
             * </li>
             * <li><p><strong>N</strong>: The authentication fails.</p>
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
             * <p>A description of the authentication result. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#HCGLb">Error codes for ResultObject.SubCode</a>.</p>
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
