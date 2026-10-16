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
 * {@link CreateOAuth2CredentialProviderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOAuth2CredentialProviderResponseBody</p>
 */
public class CreateOAuth2CredentialProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OAuth2CredentialProvider")
    private OAuth2CredentialProvider oAuth2CredentialProvider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateOAuth2CredentialProviderResponseBody(Builder builder) {
        this.oAuth2CredentialProvider = builder.oAuth2CredentialProvider;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOAuth2CredentialProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oAuth2CredentialProvider
     */
    public OAuth2CredentialProvider getOAuth2CredentialProvider() {
        return this.oAuth2CredentialProvider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OAuth2CredentialProvider oAuth2CredentialProvider; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateOAuth2CredentialProviderResponseBody model) {
            this.oAuth2CredentialProvider = model.oAuth2CredentialProvider;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The credential provider.</p>
         */
        public Builder oAuth2CredentialProvider(OAuth2CredentialProvider oAuth2CredentialProvider) {
            this.oAuth2CredentialProvider = oAuth2CredentialProvider;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOAuth2CredentialProviderResponseBody build() {
            return new CreateOAuth2CredentialProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOAuth2CredentialProviderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOAuth2CredentialProviderResponseBody</p>
     */
    public static class OAuth2CredentialProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackURL")
        private String callbackURL;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderArn")
        private String credentialProviderArn;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderVendor")
        private String credentialProviderVendor;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OAuth2CredentialProviderName")
        private String oAuth2CredentialProviderName;

        @com.aliyun.core.annotation.NameInMap("OAuth2ProviderConfig")
        private OAuth2ProviderConfig oAuth2ProviderConfig;

        @com.aliyun.core.annotation.NameInMap("OAuthType")
        private String oAuthType;

        @com.aliyun.core.annotation.NameInMap("SourcePlatform")
        private String sourcePlatform;

        @com.aliyun.core.annotation.NameInMap("TokenVaultName")
        private String tokenVaultName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private OAuth2CredentialProvider(Builder builder) {
            this.callbackURL = builder.callbackURL;
            this.createTime = builder.createTime;
            this.credentialProviderArn = builder.credentialProviderArn;
            this.credentialProviderVendor = builder.credentialProviderVendor;
            this.description = builder.description;
            this.oAuth2CredentialProviderName = builder.oAuth2CredentialProviderName;
            this.oAuth2ProviderConfig = builder.oAuth2ProviderConfig;
            this.oAuthType = builder.oAuthType;
            this.sourcePlatform = builder.sourcePlatform;
            this.tokenVaultName = builder.tokenVaultName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OAuth2CredentialProvider create() {
            return builder().build();
        }

        /**
         * @return callbackURL
         */
        public String getCallbackURL() {
            return this.callbackURL;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialProviderArn
         */
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
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
         * @return oAuthType
         */
        public String getOAuthType() {
            return this.oAuthType;
        }

        /**
         * @return sourcePlatform
         */
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        /**
         * @return tokenVaultName
         */
        public String getTokenVaultName() {
            return this.tokenVaultName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String callbackURL; 
            private String createTime; 
            private String credentialProviderArn; 
            private String credentialProviderVendor; 
            private String description; 
            private String oAuth2CredentialProviderName; 
            private OAuth2ProviderConfig oAuth2ProviderConfig; 
            private String oAuthType; 
            private String sourcePlatform; 
            private String tokenVaultName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(OAuth2CredentialProvider model) {
                this.callbackURL = model.callbackURL;
                this.createTime = model.createTime;
                this.credentialProviderArn = model.credentialProviderArn;
                this.credentialProviderVendor = model.credentialProviderVendor;
                this.description = model.description;
                this.oAuth2CredentialProviderName = model.oAuth2CredentialProviderName;
                this.oAuth2ProviderConfig = model.oAuth2ProviderConfig;
                this.oAuthType = model.oAuthType;
                this.sourcePlatform = model.sourcePlatform;
                this.tokenVaultName = model.tokenVaultName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The unique callback URL assigned to the provider. You must configure this URL in the list of allowed callback URLs of the identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
             */
            public Builder callbackURL(String callbackURL) {
                this.callbackURL = callbackURL;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ARN of the newly created credential provider.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default/oauth2credentialprovider/oauth-provider-aliyun</p>
             */
            public Builder credentialProviderArn(String credentialProviderArn) {
                this.credentialProviderArn = credentialProviderArn;
                return this;
            }

            /**
             * <p>The vendor of the provider.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunOAuth2</p>
             */
            public Builder credentialProviderVendor(String credentialProviderVendor) {
                this.credentialProviderVendor = credentialProviderVendor;
                return this;
            }

            /**
             * <p>The description of the OAuth 2.0 credential provider.</p>
             * 
             * <strong>example:</strong>
             * <p>example provider</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the credential provider.</p>
             * 
             * <strong>example:</strong>
             * <p>oauth-provider-aliyun</p>
             */
            public Builder oAuth2CredentialProviderName(String oAuth2CredentialProviderName) {
                this.oAuth2CredentialProviderName = oAuth2CredentialProviderName;
                return this;
            }

            /**
             * <p>The object that contains provider-specific configurations, such as clientId and clientSecret.</p>
             */
            public Builder oAuth2ProviderConfig(OAuth2ProviderConfig oAuth2ProviderConfig) {
                this.oAuth2ProviderConfig = oAuth2ProviderConfig;
                return this;
            }

            /**
             * OAuthType.
             */
            public Builder oAuthType(String oAuthType) {
                this.oAuthType = oAuthType;
                return this;
            }

            /**
             * SourcePlatform.
             */
            public Builder sourcePlatform(String sourcePlatform) {
                this.sourcePlatform = sourcePlatform;
                return this;
            }

            /**
             * <p>The name of the token vault.</p>
             */
            public Builder tokenVaultName(String tokenVaultName) {
                this.tokenVaultName = tokenVaultName;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T06:19:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public OAuth2CredentialProvider build() {
                return new OAuth2CredentialProvider(this);
            } 

        } 

    }
}
