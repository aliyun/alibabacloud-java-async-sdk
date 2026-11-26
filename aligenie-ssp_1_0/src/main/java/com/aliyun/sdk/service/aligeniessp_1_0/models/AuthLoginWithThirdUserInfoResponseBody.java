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
 * {@link AuthLoginWithThirdUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>AuthLoginWithThirdUserInfoResponseBody</p>
 */
public class AuthLoginWithThirdUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DataObj")
    private DataObj dataObj;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AuthLoginWithThirdUserInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataObj = builder.dataObj;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthLoginWithThirdUserInfoResponseBody create() {
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
     * @return dataObj
     */
    public DataObj getDataObj() {
        return this.dataObj;
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
        private DataObj dataObj; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AuthLoginWithThirdUserInfoResponseBody model) {
            this.code = model.code;
            this.dataObj = model.dataObj;
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
         * <p>When Code is 5140001, it indicates that logon failed because the third-party user is not attached to a Tmall Genie user. The frontend must initiate the phone number authorization logon flow based on this error code. In subsequent steps, the frontend must return the SessionId in DataObj to the server.</p>
         */
        public Builder dataObj(DataObj dataObj) {
            this.dataObj = dataObj;
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

        public AuthLoginWithThirdUserInfoResponseBody build() {
            return new AuthLoginWithThirdUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AuthLoginWithThirdUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>AuthLoginWithThirdUserInfoResponseBody</p>
     */
    public static class DataObj extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private DataObj(Builder builder) {
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataObj create() {
            return builder().build();
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String sessionId; 

            private Builder() {
            } 

            private Builder(DataObj model) {
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>Session ID</p>
             * 
             * <strong>example:</strong>
             * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public DataObj build() {
                return new DataObj(this);
            } 

        } 

    }
    /**
     * 
     * {@link AuthLoginWithThirdUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>AuthLoginWithThirdUserInfoResponseBody</p>
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
             * <p>Expiration time of the logon state access token</p>
             * 
             * <strong>example:</strong>
             * <p>1659428051452</p>
             */
            public Builder expiredTimeLong(Long expiredTimeLong) {
                this.expiredTimeLong = expiredTimeLong;
                return this;
            }

            /**
             * <p>Logon state access token</p>
             * 
             * <strong>example:</strong>
             * <p>bd9ccdb121ee950ddead51e943e081fe</p>
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
