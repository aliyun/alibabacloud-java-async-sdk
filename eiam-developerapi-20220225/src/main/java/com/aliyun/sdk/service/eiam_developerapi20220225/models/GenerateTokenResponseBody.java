// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GenerateTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTokenResponseBody</p>
 */
public class GenerateTokenResponseBody extends TeaModel {
    @NameInMap("access_token")
    private String accessToken;

    @NameInMap("expires_at")
    private Long expiresAt;

    @NameInMap("expires_in")
    private Long expiresIn;

    @NameInMap("id_token")
    private String idToken;

    @NameInMap("refresh_token")
    private String refreshToken;

    @NameInMap("token_type")
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

        /**
         * access_token。
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * expires_at.
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * expires_in.
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * id_token。
         */
        public Builder idToken(String idToken) {
            this.idToken = idToken;
            return this;
        }

        /**
         * refresh_token。
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * token_type.
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
