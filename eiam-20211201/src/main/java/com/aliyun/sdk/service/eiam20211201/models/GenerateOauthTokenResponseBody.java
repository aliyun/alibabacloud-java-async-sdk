// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GenerateOauthTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateOauthTokenResponseBody</p>
 */
public class GenerateOauthTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TokenResponse")
    private TokenResponse tokenResponse;

    private GenerateOauthTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tokenResponse = builder.tokenResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOauthTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokenResponse
     */
    public TokenResponse getTokenResponse() {
        return this.tokenResponse;
    }

    public static final class Builder {
        private String requestId; 
        private TokenResponse tokenResponse; 

        private Builder() {
        } 

        private Builder(GenerateOauthTokenResponseBody model) {
            this.requestId = model.requestId;
            this.tokenResponse = model.tokenResponse;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TokenResponse.
         */
        public Builder tokenResponse(TokenResponse tokenResponse) {
            this.tokenResponse = tokenResponse;
            return this;
        }

        public GenerateOauthTokenResponseBody build() {
            return new GenerateOauthTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateOauthTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateOauthTokenResponseBody</p>
     */
    public static class TokenResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("ExpiresAt")
        private Long expiresAt;

        @com.aliyun.core.annotation.NameInMap("ExpiresIn")
        private Long expiresIn;

        @com.aliyun.core.annotation.NameInMap("TokenType")
        private String tokenType;

        private TokenResponse(Builder builder) {
            this.accessToken = builder.accessToken;
            this.expiresAt = builder.expiresAt;
            this.expiresIn = builder.expiresIn;
            this.tokenType = builder.tokenType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenResponse create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return expiresAt
         */
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return expiresIn
         */
        public Long getExpiresIn() {
            return this.expiresIn;
        }

        /**
         * @return tokenType
         */
        public String getTokenType() {
            return this.tokenType;
        }

        public static final class Builder {
            private String accessToken; 
            private Long expiresAt; 
            private Long expiresIn; 
            private String tokenType; 

            private Builder() {
            } 

            private Builder(TokenResponse model) {
                this.accessToken = model.accessToken;
                this.expiresAt = model.expiresAt;
                this.expiresIn = model.expiresIn;
                this.tokenType = model.tokenType;
            } 

            /**
             * <p>Access Token。</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * ExpiresAt.
             */
            public Builder expiresAt(Long expiresAt) {
                this.expiresAt = expiresAt;
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
             * TokenType.
             */
            public Builder tokenType(String tokenType) {
                this.tokenType = tokenType;
                return this;
            }

            public TokenResponse build() {
                return new TokenResponse(this);
            } 

        } 

    }
}
