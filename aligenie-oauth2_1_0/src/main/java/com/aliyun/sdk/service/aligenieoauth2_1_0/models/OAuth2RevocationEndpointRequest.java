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
 * {@link OAuth2RevocationEndpointRequest} extends {@link RequestModel}
 *
 * <p>OAuth2RevocationEndpointRequest</p>
 */
public class OAuth2RevocationEndpointRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TokenTypeHint")
    private String tokenTypeHint;

    private OAuth2RevocationEndpointRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
        this.tokenTypeHint = builder.tokenTypeHint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OAuth2RevocationEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return tokenTypeHint
     */
    public String getTokenTypeHint() {
        return this.tokenTypeHint;
    }

    public static final class Builder extends Request.Builder<OAuth2RevocationEndpointRequest, Builder> {
        private String token; 
        private String tokenTypeHint; 

        private Builder() {
            super();
        } 

        private Builder(OAuth2RevocationEndpointRequest request) {
            super(request);
            this.token = request.token;
            this.tokenTypeHint = request.tokenTypeHint;
        } 

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * TokenTypeHint.
         */
        public Builder tokenTypeHint(String tokenTypeHint) {
            this.putBodyParameter("TokenTypeHint", tokenTypeHint);
            this.tokenTypeHint = tokenTypeHint;
            return this;
        }

        @Override
        public OAuth2RevocationEndpointRequest build() {
            return new OAuth2RevocationEndpointRequest(this);
        } 

    } 

}
