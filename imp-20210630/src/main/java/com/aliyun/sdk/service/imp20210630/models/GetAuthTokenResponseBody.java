// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthTokenResponseBody</p>
 */
public class GetAuthTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetAuthTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthTokenResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Result result; 

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

        public GetAuthTokenResponseBody build() {
            return new GetAuthTokenResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AccessToken")
        private String accessToken;

        @NameInMap("AccessTokenExpiredTime")
        private Long accessTokenExpiredTime;

        @NameInMap("RefreshToken")
        private String refreshToken;

        private Result(Builder builder) {
            this.accessToken = builder.accessToken;
            this.accessTokenExpiredTime = builder.accessTokenExpiredTime;
            this.refreshToken = builder.refreshToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return accessTokenExpiredTime
         */
        public Long getAccessTokenExpiredTime() {
            return this.accessTokenExpiredTime;
        }

        /**
         * @return refreshToken
         */
        public String getRefreshToken() {
            return this.refreshToken;
        }

        public static final class Builder {
            private String accessToken; 
            private Long accessTokenExpiredTime; 
            private String refreshToken; 

            /**
             * 用于长链接建连的token
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * 登录token过期时间(毫秒)
             */
            public Builder accessTokenExpiredTime(Long accessTokenExpiredTime) {
                this.accessTokenExpiredTime = accessTokenExpiredTime;
                return this;
            }

            /**
             * 更新Token，若AccessToken过期，则可以使用RefreshToken再次获取新Token
             */
            public Builder refreshToken(String refreshToken) {
                this.refreshToken = refreshToken;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
