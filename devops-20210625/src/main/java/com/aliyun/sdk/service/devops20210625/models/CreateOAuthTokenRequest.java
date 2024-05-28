// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOAuthTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateOAuthTokenRequest</p>
 */
public class CreateOAuthTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientSecret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientSecret;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grantType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grantType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("login")
    private String login;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    private CreateOAuthTokenRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.code = builder.code;
        this.grantType = builder.grantType;
        this.login = builder.login;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOAuthTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return login
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<CreateOAuthTokenRequest, Builder> {
        private String clientId; 
        private String clientSecret; 
        private String code; 
        private String grantType; 
        private String login; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(CreateOAuthTokenRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.code = request.code;
            this.grantType = request.grantType;
            this.login = request.login;
            this.scope = request.scope;
        } 

        /**
         * clientId
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * client_secret
         */
        public Builder clientSecret(String clientSecret) {
            this.putBodyParameter("clientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * grantType.
         */
        public Builder grantType(String grantType) {
            this.putBodyParameter("grantType", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * login.
         */
        public Builder login(String login) {
            this.putBodyParameter("login", login);
            this.login = login;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public CreateOAuthTokenRequest build() {
            return new CreateOAuthTokenRequest(this);
        } 

    } 

}
