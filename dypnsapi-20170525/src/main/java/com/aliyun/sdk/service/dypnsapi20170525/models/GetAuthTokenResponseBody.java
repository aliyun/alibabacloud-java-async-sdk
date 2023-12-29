// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

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
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TokenInfo")
    private TokenInfo tokenInfo;

    private GetAuthTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tokenInfo = builder.tokenInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthTokenResponseBody create() {
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
     * @return tokenInfo
     */
    public TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private TokenInfo tokenInfo; 

        /**
         * The response code.
         * <p>
         * 
         * *   If OK is returned, the request is successful.
         * *   For more information about other error codes, see [API response codes](~~85198~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder tokenInfo(TokenInfo tokenInfo) {
            this.tokenInfo = tokenInfo;
            return this;
        }

        public GetAuthTokenResponseBody build() {
            return new GetAuthTokenResponseBody(this);
        } 

    } 

    public static class TokenInfo extends TeaModel {
        @NameInMap("AccessToken")
        private String accessToken;

        @NameInMap("JwtToken")
        private String jwtToken;

        private TokenInfo(Builder builder) {
            this.accessToken = builder.accessToken;
            this.jwtToken = builder.jwtToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenInfo create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return jwtToken
         */
        public String getJwtToken() {
            return this.jwtToken;
        }

        public static final class Builder {
            private String accessToken; 
            private String jwtToken; 

            /**
             * The business authentication token.
             * <p>
             * 
             * >  AccessToken is valid for 10 minutes and can be used repeatedly within its validity period.
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * The API authentication token.
             * <p>
             * 
             * >  JwtToken is valid for 1 hour and can be used repeatedly within its validity period.
             */
            public Builder jwtToken(String jwtToken) {
                this.jwtToken = jwtToken;
                return this;
            }

            public TokenInfo build() {
                return new TokenInfo(this);
            } 

        } 

    }
}
