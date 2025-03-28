// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link OAuthCredential} extends {@link TeaModel}
 *
 * <p>OAuthCredential</p>
 */
public class OAuthCredential extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long createdTime;

    @com.aliyun.core.annotation.NameInMap("expiration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expiration;

    @com.aliyun.core.annotation.NameInMap("refreshToken")
    private String refreshToken;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private OAuthCredential(Builder builder) {
        this.createdTime = builder.createdTime;
        this.expiration = builder.expiration;
        this.refreshToken = builder.refreshToken;
        this.scope = builder.scope;
        this.token = builder.token;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OAuthCredential create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return expiration
     */
    public Long getExpiration() {
        return this.expiration;
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long createdTime; 
        private Long expiration; 
        private String refreshToken; 
        private String scope; 
        private String token; 
        private String type; 

        private Builder() {
        } 

        private Builder(OAuthCredential model) {
            this.createdTime = model.createdTime;
            this.expiration = model.expiration;
            this.refreshToken = model.refreshToken;
            this.scope = model.scope;
            this.token = model.token;
            this.type = model.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1716176924603</p>
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1716263324603</p>
         */
        public Builder expiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * refreshToken.
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4e84246b6b3962cd3d207aad1ea2f911</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public OAuthCredential build() {
            return new OAuthCredential(this);
        } 

    } 

}
