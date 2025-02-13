// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link OAuth2TokenEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>OAuth2TokenEndpointResponseBody</p>
 */
public class OAuth2TokenEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("ExpiresIn")
    private Long expiresIn;

    @com.aliyun.core.annotation.NameInMap("RefreshToken")
    private String refreshToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("TokenType")
    private String tokenType;

    private OAuth2TokenEndpointResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.expiresIn = builder.expiresIn;
        this.refreshToken = builder.refreshToken;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OAuth2TokenEndpointResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
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
        private String requestId; 
        private String scope; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * TokenType.
         */
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        public OAuth2TokenEndpointResponseBody build() {
            return new OAuth2TokenEndpointResponseBody(this);
        } 

    } 

}
