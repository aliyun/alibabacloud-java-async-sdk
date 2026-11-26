// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link AuthLoginWithAligenieUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>AuthLoginWithAligenieUserInfoResponseBody</p>
 */
public class AuthLoginWithAligenieUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AuthLoginWithAligenieUserInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthLoginWithAligenieUserInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AuthLoginWithAligenieUserInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Response code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Response Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Flag indicating whether the invocation succeeded</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AuthLoginWithAligenieUserInfoResponseBody build() {
            return new AuthLoginWithAligenieUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AuthLoginWithAligenieUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>AuthLoginWithAligenieUserInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTimeLong")
        private Long expiredTimeLong;

        @com.aliyun.core.annotation.NameInMap("LoginStateAccessToken")
        private String loginStateAccessToken;

        private Result(Builder builder) {
            this.expiredTimeLong = builder.expiredTimeLong;
            this.loginStateAccessToken = builder.loginStateAccessToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return expiredTimeLong
         */
        public Long getExpiredTimeLong() {
            return this.expiredTimeLong;
        }

        /**
         * @return loginStateAccessToken
         */
        public String getLoginStateAccessToken() {
            return this.loginStateAccessToken;
        }

        public static final class Builder {
            private Long expiredTimeLong; 
            private String loginStateAccessToken; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.expiredTimeLong = model.expiredTimeLong;
                this.loginStateAccessToken = model.loginStateAccessToken;
            } 

            /**
             * <p>Expiration time of the login state access token (long integer)</p>
             * 
             * <strong>example:</strong>
             * <p>1659506854230</p>
             */
            public Builder expiredTimeLong(Long expiredTimeLong) {
                this.expiredTimeLong = expiredTimeLong;
                return this;
            }

            /**
             * <p>Login state access token</p>
             * 
             * <strong>example:</strong>
             * <p>d15aa92de679d0d225aa845268be19ee</p>
             */
            public Builder loginStateAccessToken(String loginStateAccessToken) {
                this.loginStateAccessToken = loginStateAccessToken;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
