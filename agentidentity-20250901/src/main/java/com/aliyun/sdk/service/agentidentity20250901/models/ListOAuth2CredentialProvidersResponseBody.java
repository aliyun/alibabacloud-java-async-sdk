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
 * {@link ListOAuth2CredentialProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOAuth2CredentialProvidersResponseBody</p>
 */
public class ListOAuth2CredentialProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OAuth2CredentialProviders")
    private java.util.List<OAuth2CredentialProviders> oAuth2CredentialProviders;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListOAuth2CredentialProvidersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.oAuth2CredentialProviders = builder.oAuth2CredentialProviders;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOAuth2CredentialProvidersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return oAuth2CredentialProviders
     */
    public java.util.List<OAuth2CredentialProviders> getOAuth2CredentialProviders() {
        return this.oAuth2CredentialProviders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<OAuth2CredentialProviders> oAuth2CredentialProviders; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListOAuth2CredentialProvidersResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.oAuth2CredentialProviders = model.oAuth2CredentialProviders;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OAuth2CredentialProviders.
         */
        public Builder oAuth2CredentialProviders(java.util.List<OAuth2CredentialProviders> oAuth2CredentialProviders) {
            this.oAuth2CredentialProviders = oAuth2CredentialProviders;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOAuth2CredentialProvidersResponseBody build() {
            return new ListOAuth2CredentialProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOAuth2CredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOAuth2CredentialProvidersResponseBody</p>
     */
    public static class OAuth2CredentialProviders extends TeaModel {
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

        private OAuth2CredentialProviders(Builder builder) {
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

        public static OAuth2CredentialProviders create() {
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

            private Builder(OAuth2CredentialProviders model) {
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

            public OAuth2CredentialProviders build() {
                return new OAuth2CredentialProviders(this);
            } 

        } 

    }
}
