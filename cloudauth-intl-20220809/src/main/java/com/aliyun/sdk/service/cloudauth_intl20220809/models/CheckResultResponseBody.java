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

        private Builder(CheckResultResponseBody model) {
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

        public CheckResultResponseBody build() {
            return new CheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>CheckResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EkycResult")
        private String ekycResult;

        @com.aliyun.core.annotation.NameInMap("ExtBasicInfo")
        private String extBasicInfo;

        @com.aliyun.core.annotation.NameInMap("ExtFaceInfo")
        private String extFaceInfo;

        @com.aliyun.core.annotation.NameInMap("ExtIdInfo")
        private String extIdInfo;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private String extInfo;

        @com.aliyun.core.annotation.NameInMap("ExtRiskInfo")
        private String extRiskInfo;

        @com.aliyun.core.annotation.NameInMap("ExtSourceInfo")
        private String extSourceInfo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        private Result(Builder builder) {
            this.ekycResult = builder.ekycResult;
            this.extBasicInfo = builder.extBasicInfo;
            this.extFaceInfo = builder.extFaceInfo;
            this.extIdInfo = builder.extIdInfo;
            this.extInfo = builder.extInfo;
            this.extRiskInfo = builder.extRiskInfo;
            this.extSourceInfo = builder.extSourceInfo;
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
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return extRiskInfo
         */
        public String getExtRiskInfo() {
            return this.extRiskInfo;
        }

        /**
         * @return extSourceInfo
         */
        public String getExtSourceInfo() {
            return this.extSourceInfo;
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
            private String extInfo; 
            private String extRiskInfo; 
            private String extSourceInfo; 
            private String passed; 
            private String subCode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.ekycResult = model.ekycResult;
                this.extBasicInfo = model.extBasicInfo;
                this.extFaceInfo = model.extFaceInfo;
                this.extIdInfo = model.extIdInfo;
                this.extInfo = model.extInfo;
                this.extRiskInfo = model.extRiskInfo;
                this.extSourceInfo = model.extSourceInfo;
                this.passed = model.passed;
                this.subCode = model.subCode;
            } 

            /**
             * <p>Authentication result.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder ekycResult(String ekycResult) {
                this.ekycResult = ekycResult;
                return this;
            }

            /**
             * <p>Extended basic information.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder extBasicInfo(String extBasicInfo) {
                this.extBasicInfo = extBasicInfo;
                return this;
            }

            /**
             * <p>Face information.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder extFaceInfo(String extFaceInfo) {
                this.extFaceInfo = extFaceInfo;
                return this;
            }

            /**
             * <p>ID information.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder extIdInfo(String extIdInfo) {
                this.extIdInfo = extIdInfo;
                return this;
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
             * <p>Risk information.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder extRiskInfo(String extRiskInfo) {
                this.extRiskInfo = extRiskInfo;
                return this;
            }

            /**
             * ExtSourceInfo.
             */
            public Builder extSourceInfo(String extSourceInfo) {
                this.extSourceInfo = extSourceInfo;
                return this;
            }

            /**
             * <p>Whether the authentication is passed.</p>
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
             * <p>Sub-result code.</p>
             * 
             * <strong>example:</strong>
             * <hr>
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
