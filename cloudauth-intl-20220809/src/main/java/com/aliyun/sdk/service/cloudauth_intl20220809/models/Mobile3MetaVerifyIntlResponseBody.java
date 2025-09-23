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
 * {@link Mobile3MetaVerifyIntlResponseBody} extends {@link TeaModel}
 *
 * <p>Mobile3MetaVerifyIntlResponseBody</p>
 */
public class Mobile3MetaVerifyIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private Mobile3MetaVerifyIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Mobile3MetaVerifyIntlResponseBody create() {
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

        private Builder(Mobile3MetaVerifyIntlResponseBody model) {
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
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>D241532C-4EE9-5A2A-A5A5-C1FD98CE2EDD</p>
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

        public Mobile3MetaVerifyIntlResponseBody build() {
            return new Mobile3MetaVerifyIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link Mobile3MetaVerifyIntlResponseBody} extends {@link TeaModel}
     *
     * <p>Mobile3MetaVerifyIntlResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        private Result(Builder builder) {
            this.bizCode = builder.bizCode;
            this.ispName = builder.ispName;
            this.subCode = builder.subCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        public static final class Builder {
            private String bizCode; 
            private String ispName; 
            private String subCode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.bizCode = model.bizCode;
                this.ispName = model.ispName;
                this.subCode = model.subCode;
            } 

            /**
             * <p>Verification result code.</p>
             * <ul>
             * <li>1: Verification consistent</li>
             * <li>2: Verification inconsistent</li>
             * <li>3: No record found</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>ISP name</p>
             * <ul>
             * <li>CMCC: China Mobile</li>
             * <li>CUCC: China Unicom</li>
             * <li>CTCC: China Telecom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CMCC</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>Detailed verification results</p>
             * <ul>
             * <li>101: Verification passed </li>
             * <li>201: Mobile number and name do not match, mobile number and ID number do not match </li>
             * <li>202: Mobile number and name match, but mobile number and ID number do not match </li>
             * <li>203: Mobile number and ID number match, but mobile number and name do not match </li>
             * <li>204: Other inconsistencies</li>
             * <li>301: No record found</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>101</p>
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
