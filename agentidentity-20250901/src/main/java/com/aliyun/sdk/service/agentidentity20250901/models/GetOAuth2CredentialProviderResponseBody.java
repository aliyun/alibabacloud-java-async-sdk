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
 * {@link GetOAuth2CredentialProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetOAuth2CredentialProviderResponseBody</p>
 */
public class GetOAuth2CredentialProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OAuth2CredentialProvider")
    private OAuth2CredentialProvider oAuth2CredentialProvider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOAuth2CredentialProviderResponseBody(Builder builder) {
        this.oAuth2CredentialProvider = builder.oAuth2CredentialProvider;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOAuth2CredentialProviderResponseBody create() {
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

        private Builder(GetOAuth2CredentialProviderResponseBody model) {
            this.oAuth2CredentialProvider = model.oAuth2CredentialProvider;
            this.requestId = model.requestId;
        } 

        /**
         * OAuth2CredentialProvider.
         */
        public Builder oAuth2CredentialProvider(OAuth2CredentialProvider oAuth2CredentialProvider) {
            this.oAuth2CredentialProvider = oAuth2CredentialProvider;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOAuth2CredentialProviderResponseBody build() {
            return new GetOAuth2CredentialProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOAuth2CredentialProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetOAuth2CredentialProviderResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("IDaaSInstanceId")
        private String iDaaSInstanceId;

        @com.aliyun.core.annotation.NameInMap("OAuth2CredentialProviderName")
        private String oAuth2CredentialProviderName;

        @com.aliyun.core.annotation.NameInMap("OAuth2ProviderConfig")
        private OAuth2ProviderConfig oAuth2ProviderConfig;

        @com.aliyun.core.annotation.NameInMap("OAuthType")
        private String oAuthType;

        @com.aliyun.core.annotation.NameInMap("OutboundApplicationId")
        private String outboundApplicationId;

        @com.aliyun.core.annotation.NameInMap("OutboundAudience")
        private String outboundAudience;

        @com.aliyun.core.annotation.NameInMap("OutboundClientId")
        private String outboundClientId;

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
            this.iDaaSInstanceId = builder.iDaaSInstanceId;
            this.oAuth2CredentialProviderName = builder.oAuth2CredentialProviderName;
            this.oAuth2ProviderConfig = builder.oAuth2ProviderConfig;
            this.oAuthType = builder.oAuthType;
            this.outboundApplicationId = builder.outboundApplicationId;
            this.outboundAudience = builder.outboundAudience;
            this.outboundClientId = builder.outboundClientId;
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
         * @return iDaaSInstanceId
         */
        public String getIDaaSInstanceId() {
            return this.iDaaSInstanceId;
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
         * @return outboundApplicationId
         */
        public String getOutboundApplicationId() {
            return this.outboundApplicationId;
        }

        /**
         * @return outboundAudience
         */
        public String getOutboundAudience() {
            return this.outboundAudience;
        }

        /**
         * @return outboundClientId
         */
        public String getOutboundClientId() {
            return this.outboundClientId;
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
            private String iDaaSInstanceId; 
            private String oAuth2CredentialProviderName; 
            private OAuth2ProviderConfig oAuth2ProviderConfig; 
            private String oAuthType; 
            private String outboundApplicationId; 
            private String outboundAudience; 
            private String outboundClientId; 
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
                this.iDaaSInstanceId = model.iDaaSInstanceId;
                this.oAuth2CredentialProviderName = model.oAuth2CredentialProviderName;
                this.oAuth2ProviderConfig = model.oAuth2ProviderConfig;
                this.oAuthType = model.oAuthType;
                this.outboundApplicationId = model.outboundApplicationId;
                this.outboundAudience = model.outboundAudience;
                this.outboundClientId = model.outboundClientId;
                this.sourcePlatform = model.sourcePlatform;
                this.tokenVaultName = model.tokenVaultName;
                this.updateTime = model.updateTime;
            } 

            /**
             * CallbackURL.
             */
            public Builder callbackURL(String callbackURL) {
                this.callbackURL = callbackURL;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CredentialProviderArn.
             */
            public Builder credentialProviderArn(String credentialProviderArn) {
                this.credentialProviderArn = credentialProviderArn;
                return this;
            }

            /**
             * CredentialProviderVendor.
             */
            public Builder credentialProviderVendor(String credentialProviderVendor) {
                this.credentialProviderVendor = credentialProviderVendor;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IDaaSInstanceId.
             */
            public Builder iDaaSInstanceId(String iDaaSInstanceId) {
                this.iDaaSInstanceId = iDaaSInstanceId;
                return this;
            }

            /**
             * OAuth2CredentialProviderName.
             */
            public Builder oAuth2CredentialProviderName(String oAuth2CredentialProviderName) {
                this.oAuth2CredentialProviderName = oAuth2CredentialProviderName;
                return this;
            }

            /**
             * OAuth2ProviderConfig.
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
             * OutboundApplicationId.
             */
            public Builder outboundApplicationId(String outboundApplicationId) {
                this.outboundApplicationId = outboundApplicationId;
                return this;
            }

            /**
             * OutboundAudience.
             */
            public Builder outboundAudience(String outboundAudience) {
                this.outboundAudience = outboundAudience;
                return this;
            }

            /**
             * OutboundClientId.
             */
            public Builder outboundClientId(String outboundClientId) {
                this.outboundClientId = outboundClientId;
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
             * TokenVaultName.
             */
            public Builder tokenVaultName(String tokenVaultName) {
                this.tokenVaultName = tokenVaultName;
                return this;
            }

            /**
             * UpdateTime.
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
