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
 * {@link OAuth2Discovery} extends {@link TeaModel}
 *
 * <p>OAuth2Discovery</p>
 */
public class OAuth2Discovery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationServerMetadata")
    private AuthorizationServerMetadata authorizationServerMetadata;

    @com.aliyun.core.annotation.NameInMap("DiscoveryURL")
    private String discoveryURL;

    private OAuth2Discovery(Builder builder) {
        this.authorizationServerMetadata = builder.authorizationServerMetadata;
        this.discoveryURL = builder.discoveryURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OAuth2Discovery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationServerMetadata
     */
    public AuthorizationServerMetadata getAuthorizationServerMetadata() {
        return this.authorizationServerMetadata;
    }

    /**
     * @return discoveryURL
     */
    public String getDiscoveryURL() {
        return this.discoveryURL;
    }

    public static final class Builder {
        private AuthorizationServerMetadata authorizationServerMetadata; 
        private String discoveryURL; 

        private Builder() {
        } 

        private Builder(OAuth2Discovery model) {
            this.authorizationServerMetadata = model.authorizationServerMetadata;
            this.discoveryURL = model.discoveryURL;
        } 

        /**
         * AuthorizationServerMetadata.
         */
        public Builder authorizationServerMetadata(AuthorizationServerMetadata authorizationServerMetadata) {
            this.authorizationServerMetadata = authorizationServerMetadata;
            return this;
        }

        /**
         * DiscoveryURL.
         */
        public Builder discoveryURL(String discoveryURL) {
            this.discoveryURL = discoveryURL;
            return this;
        }

        public OAuth2Discovery build() {
            return new OAuth2Discovery(this);
        } 

    } 

}
