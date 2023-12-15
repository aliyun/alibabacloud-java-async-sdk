// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessTokenResponseBody</p>
 */
public class CreateAccessTokenResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private CreateAccessTokenResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAccessTokenResponseBody build() {
            return new CreateAccessTokenResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AccessToken")
        private String accessToken;

        @NameInMap("ExpiresIn")
        private Long expiresIn;

        @NameInMap("RefreshToken")
        private String refreshToken;

        @NameInMap("TokenType")
        private String tokenType;

        private Result(Builder builder) {
            this.accessToken = builder.accessToken;
            this.expiresIn = builder.expiresIn;
            this.refreshToken = builder.refreshToken;
            this.tokenType = builder.tokenType;
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
         * @return expiresIn
         */
        public Long getExpiresIn() {
            return this.expiresIn;
        }

        /**
         * @return refreshToken
         */
        public String getRefreshToken() {
            return this.refreshToken;
        }

        /**
         * @return tokenType
         */
        public String getTokenType() {
            return this.tokenType;
        }

        public static final class Builder {
            private String accessToken; 
            private Long expiresIn; 
            private String refreshToken; 
            private String tokenType; 

            /**
             * AccessToken.
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * ExpiresIn.
             */
            public Builder expiresIn(Long expiresIn) {
                this.expiresIn = expiresIn;
                return this;
            }

            /**
             * RefreshToken.
             */
            public Builder refreshToken(String refreshToken) {
                this.refreshToken = refreshToken;
                return this;
            }

            /**
             * TokenType.
             */
            public Builder tokenType(String tokenType) {
                this.tokenType = tokenType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
