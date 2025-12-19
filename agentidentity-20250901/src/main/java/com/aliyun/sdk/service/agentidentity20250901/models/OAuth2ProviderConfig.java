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
 * {@link OAuth2ProviderConfig} extends {@link TeaModel}
 *
 * <p>OAuth2ProviderConfig</p>
 */
public class OAuth2ProviderConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomOAuth2ProviderConfig")
    private CustomOAuth2ProviderConfig customOAuth2ProviderConfig;

    @com.aliyun.core.annotation.NameInMap("IncludedOAuth2ProviderConfig")
    private IncludedOAuth2ProviderConfig includedOAuth2ProviderConfig;

    private OAuth2ProviderConfig(Builder builder) {
        this.customOAuth2ProviderConfig = builder.customOAuth2ProviderConfig;
        this.includedOAuth2ProviderConfig = builder.includedOAuth2ProviderConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OAuth2ProviderConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customOAuth2ProviderConfig
     */
    public CustomOAuth2ProviderConfig getCustomOAuth2ProviderConfig() {
        return this.customOAuth2ProviderConfig;
    }

    /**
     * @return includedOAuth2ProviderConfig
     */
    public IncludedOAuth2ProviderConfig getIncludedOAuth2ProviderConfig() {
        return this.includedOAuth2ProviderConfig;
    }

    public static final class Builder {
        private CustomOAuth2ProviderConfig customOAuth2ProviderConfig; 
        private IncludedOAuth2ProviderConfig includedOAuth2ProviderConfig; 

        private Builder() {
        } 

        private Builder(OAuth2ProviderConfig model) {
            this.customOAuth2ProviderConfig = model.customOAuth2ProviderConfig;
            this.includedOAuth2ProviderConfig = model.includedOAuth2ProviderConfig;
        } 

        /**
         * CustomOAuth2ProviderConfig.
         */
        public Builder customOAuth2ProviderConfig(CustomOAuth2ProviderConfig customOAuth2ProviderConfig) {
            this.customOAuth2ProviderConfig = customOAuth2ProviderConfig;
            return this;
        }

        /**
         * IncludedOAuth2ProviderConfig.
         */
        public Builder includedOAuth2ProviderConfig(IncludedOAuth2ProviderConfig includedOAuth2ProviderConfig) {
            this.includedOAuth2ProviderConfig = includedOAuth2ProviderConfig;
            return this;
        }

        public OAuth2ProviderConfig build() {
            return new OAuth2ProviderConfig(this);
        } 

    } 

}
