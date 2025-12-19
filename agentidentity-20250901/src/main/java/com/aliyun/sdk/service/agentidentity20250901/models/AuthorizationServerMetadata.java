// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link AuthorizationServerMetadata} extends {@link TeaModel}
 *
 * <p>AuthorizationServerMetadata</p>
 */
public class AuthorizationServerMetadata extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationRequest")
    private AuthorizationRequest authorizationRequest;

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("PKCE")
    private PKCE PKCE;

    @com.aliyun.core.annotation.NameInMap("TokenRequest")
    private TokenReqeust tokenRequest;

    private AuthorizationServerMetadata(Builder builder) {
        this.authorizationRequest = builder.authorizationRequest;
        this.issuer = builder.issuer;
        this.PKCE = builder.PKCE;
        this.tokenRequest = builder.tokenRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizationServerMetadata create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRequest
     */
    public AuthorizationRequest getAuthorizationRequest() {
        return this.authorizationRequest;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return PKCE
     */
    public PKCE getPKCE() {
        return this.PKCE;
    }

    /**
     * @return tokenRequest
     */
    public TokenReqeust getTokenRequest() {
        return this.tokenRequest;
    }

    public static final class Builder {
        private AuthorizationRequest authorizationRequest; 
        private String issuer; 
        private PKCE PKCE; 
        private TokenReqeust tokenRequest; 

        private Builder() {
        } 

        private Builder(AuthorizationServerMetadata model) {
            this.authorizationRequest = model.authorizationRequest;
            this.issuer = model.issuer;
            this.PKCE = model.PKCE;
            this.tokenRequest = model.tokenRequest;
        } 

        /**
         * AuthorizationRequest.
         */
        public Builder authorizationRequest(AuthorizationRequest authorizationRequest) {
            this.authorizationRequest = authorizationRequest;
            return this;
        }

        /**
         * Issuer.
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * PKCE.
         */
        public Builder PKCE(PKCE PKCE) {
            this.PKCE = PKCE;
            return this;
        }

        /**
         * TokenRequest.
         */
        public Builder tokenRequest(TokenReqeust tokenRequest) {
            this.tokenRequest = tokenRequest;
            return this;
        }

        public AuthorizationServerMetadata build() {
            return new AuthorizationServerMetadata(this);
        } 

    } 

}
