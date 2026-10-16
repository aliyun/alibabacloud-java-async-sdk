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
 * {@link UpdateOAuth2CredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateOAuth2CredentialProviderRequest</p>
 */
public class UpdateOAuth2CredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallbackURL")
    private String callbackURL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CredentialProviderVendor")
    private String credentialProviderVendor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OAuth2CredentialProviderName")
    private String oAuth2CredentialProviderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OAuth2ProviderConfig")
    private OAuth2ProviderConfig oAuth2ProviderConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TokenVaultName")
    private String tokenVaultName;

    private UpdateOAuth2CredentialProviderRequest(Builder builder) {
        super(builder);
        this.callbackURL = builder.callbackURL;
        this.credentialProviderVendor = builder.credentialProviderVendor;
        this.description = builder.description;
        this.oAuth2CredentialProviderName = builder.oAuth2CredentialProviderName;
        this.oAuth2ProviderConfig = builder.oAuth2ProviderConfig;
        this.tokenVaultName = builder.tokenVaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOAuth2CredentialProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackURL
     */
    public String getCallbackURL() {
        return this.callbackURL;
    }

    /**
     * @return credentialProviderVendor
     */
    public String getCredentialProviderVendor() {
        return this.credentialProviderVendor;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return oAuth2CredentialProviderName
     */
    public String getOAuth2CredentialProviderName() {
        return this.oAuth2CredentialProviderName;
    }

    /**
     * @return oAuth2ProviderConfig
     */
    public OAuth2ProviderConfig getOAuth2ProviderConfig() {
        return this.oAuth2ProviderConfig;
    }

    /**
     * @return tokenVaultName
     */
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

    public static final class Builder extends Request.Builder<UpdateOAuth2CredentialProviderRequest, Builder> {
        private String callbackURL; 
        private String credentialProviderVendor; 
        private String description; 
        private String oAuth2CredentialProviderName; 
        private OAuth2ProviderConfig oAuth2ProviderConfig; 
        private String tokenVaultName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOAuth2CredentialProviderRequest request) {
            super(request);
            this.callbackURL = request.callbackURL;
            this.credentialProviderVendor = request.credentialProviderVendor;
            this.description = request.description;
            this.oAuth2CredentialProviderName = request.oAuth2CredentialProviderName;
            this.oAuth2ProviderConfig = request.oAuth2ProviderConfig;
            this.tokenVaultName = request.tokenVaultName;
        } 

        /**
         * <p>The unique callback URL assigned to the provider. You must add this URL to the list of allowed callback URLs of the identity provider.
         * Format: <a href="https://agentidentitydata.%7B%7Bregion%7D%7D.aliyuncs.com/oauth2/callback/%7B%7BUUID%7D%7D">https://agentidentitydata.{{region}}.aliyuncs.com/oauth2/callback/{{UUID}}</a>
         * If you specify this parameter, the specified value is used.
         * If you do not specify this parameter, the server automatically generates a value.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
         */
        public Builder callbackURL(String callbackURL) {
            this.putBodyParameter("CallbackURL", callbackURL);
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * <p>AliyunOAuth2</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunOAuth2</p>
         */
        public Builder credentialProviderVendor(String credentialProviderVendor) {
            this.putBodyParameter("CredentialProviderVendor", credentialProviderVendor);
            this.credentialProviderVendor = credentialProviderVendor;
            return this;
        }

        /**
         * <p>The description of the OAuth 2.0 credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>new example provider</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth2-provider-aliyun</p>
         */
        public Builder oAuth2CredentialProviderName(String oAuth2CredentialProviderName) {
            this.putBodyParameter("OAuth2CredentialProviderName", oAuth2CredentialProviderName);
            this.oAuth2CredentialProviderName = oAuth2CredentialProviderName;
            return this;
        }

        /**
         * <p>The object that contains provider-specific configurations, such as clientId and clientSecret.</p>
         */
        public Builder oAuth2ProviderConfig(OAuth2ProviderConfig oAuth2ProviderConfig) {
            String oAuth2ProviderConfigShrink = shrink(oAuth2ProviderConfig, "OAuth2ProviderConfig", "json");
            this.putBodyParameter("OAuth2ProviderConfig", oAuth2ProviderConfigShrink);
            this.oAuth2ProviderConfig = oAuth2ProviderConfig;
            return this;
        }

        /**
         * <p>The name of the TokenVault.</p>
         */
        public Builder tokenVaultName(String tokenVaultName) {
            this.putBodyParameter("TokenVaultName", tokenVaultName);
            this.tokenVaultName = tokenVaultName;
            return this;
        }

        @Override
        public UpdateOAuth2CredentialProviderRequest build() {
            return new UpdateOAuth2CredentialProviderRequest(this);
        } 

    } 

}
