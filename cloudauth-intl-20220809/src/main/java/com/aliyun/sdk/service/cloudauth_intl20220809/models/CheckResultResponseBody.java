// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>CheckResultResponseBody</p>
 */
public class CheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CheckResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckResultResponseBody create() {
        return builder().build();
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
         * Id of the request
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

        public CheckResultResponseBody build() {
            return new CheckResultResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EkycResult")
        private String ekycResult;

        @com.aliyun.core.annotation.NameInMap("ExtBasicInfo")
        private String extBasicInfo;

        @com.aliyun.core.annotation.NameInMap("ExtFaceInfo")
        private String extFaceInfo;

        @com.aliyun.core.annotation.NameInMap("ExtIdInfo")
        private String extIdInfo;

        @com.aliyun.core.annotation.NameInMap("ExtRiskInfo")
        private String extRiskInfo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        private Result(Builder builder) {
            this.ekycResult = builder.ekycResult;
            this.extBasicInfo = builder.extBasicInfo;
            this.extFaceInfo = builder.extFaceInfo;
            this.extIdInfo = builder.extIdInfo;
            this.extRiskInfo = builder.extRiskInfo;
            this.passed = builder.passed;
            this.subCode = builder.subCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return ekycResult
         */
        public String getEkycResult() {
            return this.ekycResult;
        }

        /**
         * @return extBasicInfo
         */
        public String getExtBasicInfo() {
            return this.extBasicInfo;
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
         * @return extRiskInfo
         */
        public String getExtRiskInfo() {
            return this.extRiskInfo;
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

        public static final class Builder {
            private String ekycResult; 
            private String extBasicInfo; 
            private String extFaceInfo; 
            private String extIdInfo; 
            private String extRiskInfo; 
            private String passed; 
            private String subCode; 

            /**
             * EkycResult.
             */
            public Builder ekycResult(String ekycResult) {
                this.ekycResult = ekycResult;
                return this;
            }

            /**
             * ExtBasicInfo.
             */
            public Builder extBasicInfo(String extBasicInfo) {
                this.extBasicInfo = extBasicInfo;
                return this;
            }

            /**
             * ExtFaceInfo.
             */
            public Builder extFaceInfo(String extFaceInfo) {
                this.extFaceInfo = extFaceInfo;
                return this;
            }

            /**
             * ExtIdInfo.
             */
            public Builder extIdInfo(String extIdInfo) {
                this.extIdInfo = extIdInfo;
                return this;
            }

            /**
             * ExtRiskInfo.
             */
            public Builder extRiskInfo(String extRiskInfo) {
                this.extRiskInfo = extRiskInfo;
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
