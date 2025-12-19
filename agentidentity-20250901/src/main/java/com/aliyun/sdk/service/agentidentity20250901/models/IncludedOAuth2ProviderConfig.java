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
 * {@link IncludedOAuth2ProviderConfig} extends {@link TeaModel}
 *
 * <p>IncludedOAuth2ProviderConfig</p>
 */
public class IncludedOAuth2ProviderConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
    private String authorizationEndpoint;

    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    private String clientSecret;

    @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
    private String tokenEndpoint;

    private IncludedOAuth2ProviderConfig(Builder builder) {
        this.authorizationEndpoint = builder.authorizationEndpoint;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.tokenEndpoint = builder.tokenEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncludedOAuth2ProviderConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationEndpoint
     */
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
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
     * @return tokenEndpoint
     */
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    public static final class Builder {
        private String authorizationEndpoint; 
        private String clientId; 
        private String clientSecret; 
        private String tokenEndpoint; 

        private Builder() {
        } 

        private Builder(IncludedOAuth2ProviderConfig model) {
            this.authorizationEndpoint = model.authorizationEndpoint;
            this.clientId = model.clientId;
            this.clientSecret = model.clientSecret;
            this.tokenEndpoint = model.tokenEndpoint;
        } 

        /**
         * AuthorizationEndpoint.
         */
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
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
         * TokenEndpoint.
         */
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }

        public IncludedOAuth2ProviderConfig build() {
            return new IncludedOAuth2ProviderConfig(this);
        } 

    } 

}
