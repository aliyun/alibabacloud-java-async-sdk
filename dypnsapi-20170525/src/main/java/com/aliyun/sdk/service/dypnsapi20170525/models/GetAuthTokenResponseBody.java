// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAuthTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthTokenResponseBody</p>
 */
public class GetAuthTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TokenInfo")
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
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8906582E-6722</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder tokenInfo(TokenInfo tokenInfo) {
            this.tokenInfo = tokenInfo;
            return this;
        }

        public GetAuthTokenResponseBody build() {
            return new GetAuthTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthTokenResponseBody</p>
     */
    public static class TokenInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("JwtToken")
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
             * <p>The business authentication token.</p>
             * <blockquote>
             * <p> AccessToken is valid for 10 minutes and can be used repeatedly within its validity period.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>agag****</p>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * <p>The API authentication token.</p>
             * <blockquote>
             * <p> JwtToken is valid for 1 hour and can be used repeatedly within its validity period.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>aweghd****</p>
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
