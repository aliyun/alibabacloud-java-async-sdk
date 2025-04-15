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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4EB35****87EBA1</p>
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

        @com.aliyun.core.annotation.NameInMap("LogInfo")
        private java.util.List<String> logInfo;

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
            this.logInfo = builder.logInfo;
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
         * @return logInfo
         */
        public java.util.List<String> getLogInfo() {
            return this.logInfo;
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
            private java.util.List<String> logInfo; 
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
                this.logInfo = model.logInfo;
                this.logStatisticsInfo = model.logStatisticsInfo;
                this.passed = model.passed;
                this.subCode = model.subCode;
                this.verifyErrorCode = model.verifyErrorCode;
                this.verifyStatus = model.verifyStatus;
            } 

            /**
             * ExtInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * InterruptPage.
             */
            public Builder interruptPage(String interruptPage) {
                this.interruptPage = interruptPage;
                return this;
            }

            /**
             * LogInfo.
             */
            public Builder logInfo(java.util.List<String> logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            /**
             * LogStatisticsInfo.
             */
            public Builder logStatisticsInfo(String logStatisticsInfo) {
                this.logStatisticsInfo = logStatisticsInfo;
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
             * VerifyErrorCode.
             */
            public Builder verifyErrorCode(String verifyErrorCode) {
                this.verifyErrorCode = verifyErrorCode;
                return this;
            }

            /**
             * VerifyStatus.
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
