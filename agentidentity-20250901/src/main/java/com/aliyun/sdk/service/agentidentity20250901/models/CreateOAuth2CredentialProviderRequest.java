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
 * {@link CreateOAuth2CredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateOAuth2CredentialProviderRequest</p>
 */
public class CreateOAuth2CredentialProviderRequest extends Request {
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

    private CreateOAuth2CredentialProviderRequest(Builder builder) {
        super(builder);
        this.callbackURL = builder.callbackURL;
        this.credentialProviderVendor = builder.credentialProviderVendor;
        this.description = builder.description;
        this.oAuth2CredentialProviderName = builder.oAuth2CredentialProviderName;
        this.oAuth2ProviderConfig = builder.oAuth2ProviderConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOAuth2CredentialProviderRequest create() {
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

    public static final class Builder extends Request.Builder<CreateOAuth2CredentialProviderRequest, Builder> {
        private String callbackURL; 
        private String credentialProviderVendor; 
        private String description; 
        private String oAuth2CredentialProviderName; 
        private OAuth2ProviderConfig oAuth2ProviderConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateOAuth2CredentialProviderRequest request) {
            super(request);
            this.callbackURL = request.callbackURL;
            this.credentialProviderVendor = request.credentialProviderVendor;
            this.description = request.description;
            this.oAuth2CredentialProviderName = request.oAuth2CredentialProviderName;
            this.oAuth2ProviderConfig = request.oAuth2ProviderConfig;
        } 

        /**
         * CallbackURL.
         */
        public Builder callbackURL(String callbackURL) {
            this.putBodyParameter("CallbackURL", callbackURL);
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * CredentialProviderVendor.
         */
        public Builder credentialProviderVendor(String credentialProviderVendor) {
            this.putBodyParameter("CredentialProviderVendor", credentialProviderVendor);
            this.credentialProviderVendor = credentialProviderVendor;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * OAuth2CredentialProviderName.
         */
        public Builder oAuth2CredentialProviderName(String oAuth2CredentialProviderName) {
            this.putBodyParameter("OAuth2CredentialProviderName", oAuth2CredentialProviderName);
            this.oAuth2CredentialProviderName = oAuth2CredentialProviderName;
            return this;
        }

        /**
         * OAuth2ProviderConfig.
         */
        public Builder oAuth2ProviderConfig(OAuth2ProviderConfig oAuth2ProviderConfig) {
            String oAuth2ProviderConfigShrink = shrink(oAuth2ProviderConfig, "OAuth2ProviderConfig", "json");
            this.putBodyParameter("OAuth2ProviderConfig", oAuth2ProviderConfigShrink);
            this.oAuth2ProviderConfig = oAuth2ProviderConfig;
            return this;
        }

        @Override
        public CreateOAuth2CredentialProviderRequest build() {
            return new CreateOAuth2CredentialProviderRequest(this);
        } 

    } 

}
