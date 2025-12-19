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
 * {@link CustomOAuth2ProviderConfig} extends {@link TeaModel}
 *
 * <p>CustomOAuth2ProviderConfig</p>
 */
public class CustomOAuth2ProviderConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    private String clientSecret;

    @com.aliyun.core.annotation.NameInMap("OAuth2Discovery")
    private OAuth2Discovery oAuth2Discovery;

    private CustomOAuth2ProviderConfig(Builder builder) {
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.oAuth2Discovery = builder.oAuth2Discovery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomOAuth2ProviderConfig create() {
        return builder().build();
    }

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
     * @return oAuth2Discovery
     */
    public OAuth2Discovery getOAuth2Discovery() {
        return this.oAuth2Discovery;
    }

    public static final class Builder {
        private String clientId; 
        private String clientSecret; 
        private OAuth2Discovery oAuth2Discovery; 

        private Builder() {
        } 

        private Builder(CustomOAuth2ProviderConfig model) {
            this.clientId = model.clientId;
            this.clientSecret = model.clientSecret;
            this.oAuth2Discovery = model.oAuth2Discovery;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientSecret.
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * OAuth2Discovery.
         */
        public Builder oAuth2Discovery(OAuth2Discovery oAuth2Discovery) {
            this.oAuth2Discovery = oAuth2Discovery;
            return this;
        }

        public CustomOAuth2ProviderConfig build() {
            return new CustomOAuth2ProviderConfig(this);
        } 

    } 

}
