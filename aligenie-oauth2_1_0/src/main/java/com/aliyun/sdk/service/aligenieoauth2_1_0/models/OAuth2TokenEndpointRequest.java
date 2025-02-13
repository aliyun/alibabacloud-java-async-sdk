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
 * {@link OAuth2TokenEndpointRequest} extends {@link RequestModel}
 *
 * <p>OAuth2TokenEndpointRequest</p>
 */
public class OAuth2TokenEndpointRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantType")
    private String grantType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RedirectUri")
    private String redirectUri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefreshToken")
    private String refreshToken;

    private OAuth2TokenEndpointRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.grantType = builder.grantType;
        this.redirectUri = builder.redirectUri;
        this.refreshToken = builder.refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OAuth2TokenEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return grantType
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public static final class Builder extends Request.Builder<OAuth2TokenEndpointRequest, Builder> {
        private String code; 
        private String grantType; 
        private String redirectUri; 
        private String refreshToken; 

        private Builder() {
            super();
        } 

        private Builder(OAuth2TokenEndpointRequest request) {
            super(request);
            this.code = request.code;
            this.grantType = request.grantType;
            this.redirectUri = request.redirectUri;
            this.refreshToken = request.refreshToken;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * GrantType.
         */
        public Builder grantType(String grantType) {
            this.putBodyParameter("GrantType", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * RedirectUri.
         */
        public Builder redirectUri(String redirectUri) {
            this.putBodyParameter("RedirectUri", redirectUri);
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * RefreshToken.
         */
        public Builder refreshToken(String refreshToken) {
            this.putBodyParameter("RefreshToken", refreshToken);
            this.refreshToken = refreshToken;
            return this;
        }

        @Override
        public OAuth2TokenEndpointRequest build() {
            return new OAuth2TokenEndpointRequest(this);
        } 

    } 

}
