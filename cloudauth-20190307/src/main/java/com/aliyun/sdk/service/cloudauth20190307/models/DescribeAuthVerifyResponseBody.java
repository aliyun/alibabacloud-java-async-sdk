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
 * {@link DescribeAuthVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuthVerifyResponseBody</p>
 */
public class DescribeAuthVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeAuthVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuthVerifyResponseBody create() {
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

        private Builder(DescribeAuthVerifyResponseBody model) {
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
         * RequestId.
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

        public DescribeAuthVerifyResponseBody build() {
            return new DescribeAuthVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAuthVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthVerifyResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaterialInfo")
        private String materialInfo;

        @com.aliyun.core.annotation.NameInMap("SpoofBackInfo")
        private String spoofBackInfo;

        @com.aliyun.core.annotation.NameInMap("SpoofInfo")
        private String spoofInfo;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        private Result(Builder builder) {
            this.materialInfo = builder.materialInfo;
            this.spoofBackInfo = builder.spoofBackInfo;
            this.spoofInfo = builder.spoofInfo;
            this.subCode = builder.subCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return materialInfo
         */
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        /**
         * @return spoofBackInfo
         */
        public String getSpoofBackInfo() {
            return this.spoofBackInfo;
        }

        /**
         * @return spoofInfo
         */
        public String getSpoofInfo() {
            return this.spoofInfo;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        public static final class Builder {
            private String materialInfo; 
            private String spoofBackInfo; 
            private String spoofInfo; 
            private String subCode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.materialInfo = model.materialInfo;
                this.spoofBackInfo = model.spoofBackInfo;
                this.spoofInfo = model.spoofInfo;
                this.subCode = model.subCode;
            } 

            /**
             * MaterialInfo.
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

            /**
             * SpoofBackInfo.
             */
            public Builder spoofBackInfo(String spoofBackInfo) {
                this.spoofBackInfo = spoofBackInfo;
                return this;
            }

            /**
             * SpoofInfo.
             */
            public Builder spoofInfo(String spoofInfo) {
                this.spoofInfo = spoofInfo;
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
