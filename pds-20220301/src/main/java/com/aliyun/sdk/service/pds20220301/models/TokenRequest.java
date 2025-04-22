// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link TokenRequest} extends {@link RequestModel}
 *
 * <p>TokenRequest</p>
 */
public class TokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assertion")
    private String assertion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("client_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("client_secret")
    private String clientSecret;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grant_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grantType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("redirect_uri")
    private String redirectUri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refresh_token")
    private String refreshToken;

    private TokenRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.assertion = builder.assertion;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.code = builder.code;
        this.grantType = builder.grantType;
        this.redirectUri = builder.redirectUri;
        this.refreshToken = builder.refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return assertion
     */
    public String getAssertion() {
        return this.assertion;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
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

    public static final class Builder extends Request.Builder<TokenRequest, Builder> {
        private String domainId; 
        private String assertion; 
        private String clientId; 
        private String clientSecret; 
        private String code; 
        private String grantType; 
        private String redirectUri; 
        private String refreshToken; 

        private Builder() {
            super();
        } 

        private Builder(TokenRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.assertion = request.assertion;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.code = request.code;
            this.grantType = request.grantType;
            this.redirectUri = request.redirectUri;
            this.refreshToken = request.refreshToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The JWT assertion that is signed by using the JWT private key. The JWT assertion contains the information about the user to be authorized and the authorization parameters. For more information about the structure of the JWT assertion, see JWTPayload. This parameter is required if grant_type is set to urn:ietf:params:oauth:grant-type:jwt-bearer.</p>
         * 
         * <strong>example:</strong>
         * <p>ey***asd</p>
         */
        public Builder assertion(String assertion) {
            this.putBodyParameter("assertion", assertion);
            this.assertion = assertion;
            return this;
        }

        /**
         * <p>The AppId of the application that is created in the Drive and Photo Service console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1Zu***flH</p>
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("client_id", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The AppSecret of the application that is created in the Drive and Photo Service console. This parameter is required if the application is of the WebServer type.</p>
         * 
         * <strong>example:</strong>
         * <p>80D***3i5</p>
         */
        public Builder clientSecret(String clientSecret) {
            this.putBodyParameter("client_secret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * <p>The authorization code in the redirect URI that is specified after the authorization process is complete. This parameter is required if grant_type is set to authorization_code.</p>
         * 
         * <strong>example:</strong>
         * <p>0045157fa8e24f4f9a0d9e3ff158c1e0</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The method that is used to generate an access token. Valid values:</p>
         * <p>authorization_code: generates an access token by using the authorization code that is returned after the authorization process is complete.</p>
         * <p>refresh_token: generates an access token by using the refresh token that is returned after the authorization process is complete.</p>
         * <p>urn:ietf:params:oauth:grant-type:jwt-bearer: generates an access token by using a JWT assertion.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>refresh_token</p>
         */
        public Builder grantType(String grantType) {
            this.putBodyParameter("grant_type", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * <p>The redirect URI that is specified when you initiate the authorization request. This parameter is required if grant_type is set to authorization_code.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/pds">https://aliyun.com/pds</a></p>
         */
        public Builder redirectUri(String redirectUri) {
            this.putBodyParameter("redirect_uri", redirectUri);
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * <p>The refresh token that is used to refresh the access token. This parameter is required if grant_type is set to refresh_token.</p>
         * 
         * <strong>example:</strong>
         * <p>399623e13353490391266c7d48a13ed1</p>
         */
        public Builder refreshToken(String refreshToken) {
            this.putBodyParameter("refresh_token", refreshToken);
            this.refreshToken = refreshToken;
            return this;
        }

        @Override
        public TokenRequest build() {
            return new TokenRequest(this);
        } 

    } 

}
