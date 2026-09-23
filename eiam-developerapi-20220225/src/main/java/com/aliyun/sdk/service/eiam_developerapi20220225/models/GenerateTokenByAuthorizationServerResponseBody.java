// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link GenerateTokenByAuthorizationServerResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTokenByAuthorizationServerResponseBody</p>
 */
public class GenerateTokenByAuthorizationServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("access_token")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("expires_at")
    private Long expiresAt;

    @com.aliyun.core.annotation.NameInMap("expires_in")
    private Long expiresIn;

    @com.aliyun.core.annotation.NameInMap("id_token")
    private String idToken;

    @com.aliyun.core.annotation.NameInMap("refresh_token")
    private String refreshToken;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("token_type")
    private String tokenType;

    private GenerateTokenByAuthorizationServerResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.expiresAt = builder.expiresAt;
        this.expiresIn = builder.expiresIn;
        this.idToken = builder.idToken;
        this.refreshToken = builder.refreshToken;
        this.scope = builder.scope;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTokenByAuthorizationServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return idToken
     */
    public String getIdToken() {
        return this.idToken;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshToken() {
        return this.refreshToken;
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
        private Long expiresAt; 
        private Long expiresIn; 
        private String idToken; 
        private String refreshToken; 
        private String scope; 
        private String tokenType; 

        private Builder() {
        } 

        private Builder(GenerateTokenByAuthorizationServerResponseBody model) {
            this.accessToken = model.accessToken;
            this.expiresAt = model.expiresAt;
            this.expiresIn = model.expiresIn;
            this.idToken = model.idToken;
            this.refreshToken = model.refreshToken;
            this.scope = model.scope;
            this.tokenType = model.tokenType;
        } 

        /**
         * <p>Access credential.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJraWQiOiJLRVlLZ0Iyxxxxx</p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>Expiration time of the access credential, as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1653288641</p>
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>Validity period of the access credential, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * <p>Identity credential.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJraWQiOiJLRVlLZ0Iyxxxxx</p>
         */
        public Builder idToken(String idToken) {
            this.idToken = idToken;
            return this;
        }

        /**
         * <p>Refresh token.</p>
         * 
         * <strong>example:</strong>
         * <p>ATxxxxx</p>
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * <p>Scope.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>Token type.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer</p>
         */
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        public GenerateTokenByAuthorizationServerResponseBody build() {
            return new GenerateTokenByAuthorizationServerResponseBody(this);
        } 

    } 

}
