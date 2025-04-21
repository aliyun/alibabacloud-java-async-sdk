// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CompareFaceVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>CompareFaceVerifyResponseBody</p>
 */
public class CompareFaceVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private CompareFaceVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareFaceVerifyResponseBody create() {
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

        private Builder() {
        } 

        private Builder(CompareFaceVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
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

        public CompareFaceVerifyResponseBody build() {
            return new CompareFaceVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CompareFaceVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>CompareFaceVerifyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertifyId")
        private String certifyId;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("VerifyScore")
        private Float verifyScore;

        private ResultObject(Builder builder) {
            this.certifyId = builder.certifyId;
            this.passed = builder.passed;
            this.verifyScore = builder.verifyScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return certifyId
         */
        public String getCertifyId() {
            return this.certifyId;
        }

        /**
         * @return passed
         */
        public String getPassed() {
            return this.passed;
        }

        /**
         * @return verifyScore
         */
        public Float getVerifyScore() {
            return this.verifyScore;
        }

        public static final class Builder {
            private String certifyId; 
            private String passed; 
            private Float verifyScore; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.certifyId = model.certifyId;
                this.passed = model.passed;
                this.verifyScore = model.verifyScore;
            } 

            /**
             * CertifyId.
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
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
             * VerifyScore.
             */
            public Builder verifyScore(Float verifyScore) {
                this.verifyScore = verifyScore;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
