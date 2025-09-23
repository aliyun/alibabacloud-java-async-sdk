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
 * {@link CheckVerifyLogResponseBody} extends {@link TeaModel}
 *
 * <p>CheckVerifyLogResponseBody</p>
 */
public class CheckVerifyLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CheckVerifyLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckVerifyLogResponseBody create() {
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

        private Builder(CheckVerifyLogResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Backend error code.</p>
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
         * <p>4EB35****87EBA1</p>
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

        public CheckVerifyLogResponseBody build() {
            return new CheckVerifyLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckVerifyLogResponseBody} extends {@link TeaModel}
     *
     * <p>CheckVerifyLogResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private String extInfo;

        @com.aliyun.core.annotation.NameInMap("InterruptPage")
        private String interruptPage;

        @com.aliyun.core.annotation.NameInMap("InterruptPageEn")
        private String interruptPageEn;

        @com.aliyun.core.annotation.NameInMap("LogInfo")
        private java.util.List<String> logInfo;

        @com.aliyun.core.annotation.NameInMap("LogInfoEn")
        private java.util.List<String> logInfoEn;

        @com.aliyun.core.annotation.NameInMap("LogStatisticsInfo")
        private String logStatisticsInfo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("VerifyErrorCode")
        private String verifyErrorCode;

        @com.aliyun.core.annotation.NameInMap("VerifyStatus")
        private String verifyStatus;

        private Result(Builder builder) {
            this.extInfo = builder.extInfo;
            this.interruptPage = builder.interruptPage;
            this.interruptPageEn = builder.interruptPageEn;
            this.logInfo = builder.logInfo;
            this.logInfoEn = builder.logInfoEn;
            this.logStatisticsInfo = builder.logStatisticsInfo;
            this.passed = builder.passed;
            this.subCode = builder.subCode;
            this.verifyErrorCode = builder.verifyErrorCode;
            this.verifyStatus = builder.verifyStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return interruptPage
         */
        public String getInterruptPage() {
            return this.interruptPage;
        }

        /**
         * @return interruptPageEn
         */
        public String getInterruptPageEn() {
            return this.interruptPageEn;
        }

        /**
         * @return logInfo
         */
        public java.util.List<String> getLogInfo() {
            return this.logInfo;
        }

        /**
         * @return logInfoEn
         */
        public java.util.List<String> getLogInfoEn() {
            return this.logInfoEn;
        }

        /**
         * @return logStatisticsInfo
         */
        public String getLogStatisticsInfo() {
            return this.logStatisticsInfo;
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
         * @return verifyErrorCode
         */
        public String getVerifyErrorCode() {
            return this.verifyErrorCode;
        }

        /**
         * @return verifyStatus
         */
        public String getVerifyStatus() {
            return this.verifyStatus;
        }

        public static final class Builder {
            private String extInfo; 
            private String interruptPage; 
            private String interruptPageEn; 
            private java.util.List<String> logInfo; 
            private java.util.List<String> logInfoEn; 
            private String logStatisticsInfo; 
            private String passed; 
            private String subCode; 
            private String verifyErrorCode; 
            private String verifyStatus; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.extInfo = model.extInfo;
                this.interruptPage = model.interruptPage;
                this.interruptPageEn = model.interruptPageEn;
                this.logInfo = model.logInfo;
                this.logInfoEn = model.logInfoEn;
                this.logStatisticsInfo = model.logStatisticsInfo;
                this.passed = model.passed;
                this.subCode = model.subCode;
                this.verifyErrorCode = model.verifyErrorCode;
                this.verifyStatus = model.verifyStatus;
            } 

            /**
             * <p>Extended information</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>Records the last page where the authentication was interrupted.</p>
             * <ul>
             * <li>Page not started</li>
             * <li>OCR guide page</li>
             * <li>OCR camera authorization</li>
             * <li>OCR document capture page</li>
             * <li>OCR recognition loading</li>
             * <li>OCR recognition result editing page</li>
             * <li>OCR recognition result editing loading</li>
             * <li>Liveness detection guide page</li>
             * <li>Liveness detection camera authorization page</li>
             * <li>Liveness detection page</li>
             * <li>Liveness detection fallback page</li>
             * <li>Liveness detection retry</li>
             * <li>Liveness detection loading</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OCR拍摄证件页面</p>
             */
            public Builder interruptPage(String interruptPage) {
                this.interruptPage = interruptPage;
                return this;
            }

            /**
             * <p>The page where the authentication process stops. Possible English values:</p>
             * <p>The following are the values in an unordered list:</p>
             * <ul>
             * <li><p>LOADING</p>
             * </li>
             * <li><p>GUIDE</p>
             * </li>
             * <li><p>FACE</p>
             * </li>
             * <li><p>OCR_SCAN</p>
             * </li>
             * <li><p>OCR_RESULT</p>
             * </li>
             * <li><p>NFC_INPUT</p>
             * </li>
             * <li><p>NFC_READ</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LOADING</p>
             */
            public Builder interruptPageEn(String interruptPageEn) {
                this.interruptPageEn = interruptPageEn;
                return this;
            }

            /**
             * <p>SDK operation log details</p>
             */
            public Builder logInfo(java.util.List<String> logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            /**
             * <p>SDK Operation Log Details (English Version)</p>
             */
            public Builder logInfoEn(java.util.List<String> logInfoEn) {
                this.logInfoEn = logInfoEn;
                return this;
            }

            /**
             * <p>SDK operation log statistics details</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *           &quot;faceOverTimes&quot;: 0,
             *           &quot;hasFaceOverTimes&quot;: false,
             *           &quot;hasFacePermissionRefuse&quot;: false,
             *           &quot;hasOcrEdit&quot;: true,
             *           &quot;hasOcrEditOverTimes&quot;: false,
             *           &quot;hasOcrOverTimes&quot;: true,
             *           &quot;hasOcrPermissionRefuse&quot;: false,
             *           &quot;ocrEditOverTimes&quot;: 0,
             *           &quot;ocrEditTimes&quot;: 1,
             *           &quot;ocrOverTimes&quot;: 1,
             *           &quot;pageStayTimeInfo&quot;: {
             *             &quot;LOADING&quot;: &quot;1615&quot;,
             *             &quot;OCR_SCAN&quot;: &quot;37446&quot;,
             *             &quot;OCR_RESULT&quot;: &quot;1338&quot;,
             *             &quot;FACE&quot;: &quot;8707&quot;
             *           }
             *         }</p>
             */
            public Builder logStatisticsInfo(String logStatisticsInfo) {
                this.logStatisticsInfo = logStatisticsInfo;
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
             * <p>Authentication interruption error codes</p>
             * <ul>
             * <li>1000: The user completed the face scanning process, and the suggested authentication result is pass</li>
             * <li>1001: The user completed the face scanning process, and the suggested authentication result is fail</li>
             * <li>1002: System error</li>
             * <li>1003: SDK initialization failed, please check if the client time is correct</li>
             * <li>1004: Camera permission error</li>
             * <li>1005: Network error</li>
             * <li>1006: User exited</li>
             * <li>1007: Invalid TransactionId</li>
             * <li>1009: Client timestamp error</li>
             * <li>1011: Incorrect document type submitted</li>
             * <li>1012: Missing or format validation failure of key information on the recognized document</li>
             * <li>1013: Poor image quality</li>
             * <li>1014: Exceeded the upper limit of errors</li>
             * <li>1015: Android system version too low</li>
             * <li>1016: Camera permission not obtained</li>
             * <li>9999: Suspected authentication process interruption</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder verifyErrorCode(String verifyErrorCode) {
                this.verifyErrorCode = verifyErrorCode;
                return this;
            }

            /**
             * <p>Authentication status, values:</p>
             * <ul>
             * <li>0: finished (authentication completed)</li>
             * <li>1: unfinished (authentication interrupted)</li>
             * <li>2: notstart (authentication not started)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder verifyStatus(String verifyStatus) {
                this.verifyStatus = verifyStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
