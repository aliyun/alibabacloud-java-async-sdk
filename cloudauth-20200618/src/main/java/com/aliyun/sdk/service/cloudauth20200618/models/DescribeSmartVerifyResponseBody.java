// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20200618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmartVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmartVerifyResponseBody</p>
 */
public class DescribeSmartVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeSmartVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartVerifyResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeSmartVerifyResponseBody build() {
            return new DescribeSmartVerifyResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @NameInMap("MaterialInfo")
        private String materialInfo;

        @NameInMap("Passed")
        private String passed;

        @NameInMap("PassedScore")
        private Float passedScore;

        @NameInMap("SubCode")
        private String subCode;

        private ResultObject(Builder builder) {
            this.materialInfo = builder.materialInfo;
            this.passed = builder.passed;
            this.passedScore = builder.passedScore;
            this.subCode = builder.subCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return materialInfo
         */
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        /**
         * @return passed
         */
        public String getPassed() {
            return this.passed;
        }

        /**
         * @return passedScore
         */
        public Float getPassedScore() {
            return this.passedScore;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        public static final class Builder {
            private String materialInfo; 
            private String passed; 
            private Float passedScore; 
            private String subCode; 

            /**
             * MaterialInfo.
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
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
             * PassedScore.
             */
            public Builder passedScore(Float passedScore) {
                this.passedScore = passedScore;
                return this;
            }

            /**
             * SubCode.
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
