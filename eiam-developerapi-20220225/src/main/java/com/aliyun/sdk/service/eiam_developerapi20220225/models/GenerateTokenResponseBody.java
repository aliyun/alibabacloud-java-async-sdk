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
 * {@link GenerateTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTokenResponseBody</p>
 */
public class GenerateTokenResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("token_type")
    private String tokenType;

    private GenerateTokenResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.expiresAt = builder.expiresAt;
        this.expiresIn = builder.expiresIn;
        this.idToken = builder.idToken;
        this.refreshToken = builder.refreshToken;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTokenResponseBody create() {
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
        private String tokenType; 

        private Builder() {
        } 

        private Builder(GenerateTokenResponseBody model) {
            this.accessToken = model.accessToken;
            this.expiresAt = model.expiresAt;
            this.expiresIn = model.expiresIn;
            this.idToken = model.idToken;
            this.refreshToken = model.refreshToken;
            this.tokenType = model.tokenType;
        } 

        /**
         * <p>The access token.</p>
         * 
         * <strong>example:</strong>
         * <p>ATxxx</p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>The time when the token expires. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1653288641</p>
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The remaining validity period of the token. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * <p>The ID token.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder idToken(String idToken) {
            this.idToken = idToken;
            return this;
        }

        /**
         * <p>The refresh token.</p>
         * 
         * <strong>example:</strong>
         * <p>RTxxx</p>
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * <p>The type of the token. Valid values: Basic Bearer</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer</p>
         */
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        public GenerateTokenResponseBody build() {
            return new GenerateTokenResponseBody(this);
        } 

    } 

}
