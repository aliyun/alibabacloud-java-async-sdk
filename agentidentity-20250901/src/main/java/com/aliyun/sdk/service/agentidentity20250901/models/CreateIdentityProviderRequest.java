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
 * {@link CreateIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateIdentityProviderRequest</p>
 */
public class CreateIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedAudience")
    private java.util.List<String> allowedAudience;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiscoveryURL")
    private String discoveryURL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
    private String identityProviderName;

    private CreateIdentityProviderRequest(Builder builder) {
        super(builder);
        this.allowedAudience = builder.allowedAudience;
        this.description = builder.description;
        this.discoveryURL = builder.discoveryURL;
        this.identityProviderName = builder.identityProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedAudience
     */
    public java.util.List<String> getAllowedAudience() {
        return this.allowedAudience;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return discoveryURL
     */
    public String getDiscoveryURL() {
        return this.discoveryURL;
    }

    /**
     * @return identityProviderName
     */
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public static final class Builder extends Request.Builder<CreateIdentityProviderRequest, Builder> {
        private java.util.List<String> allowedAudience; 
        private String description; 
        private String discoveryURL; 
        private String identityProviderName; 

        private Builder() {
            super();
        } 

        private Builder(CreateIdentityProviderRequest request) {
            super(request);
            this.allowedAudience = request.allowedAudience;
            this.description = request.description;
            this.discoveryURL = request.discoveryURL;
            this.identityProviderName = request.identityProviderName;
        } 

        /**
         * AllowedAudience.
         */
        public Builder allowedAudience(java.util.List<String> allowedAudience) {
            String allowedAudienceShrink = shrink(allowedAudience, "AllowedAudience", "json");
            this.putBodyParameter("AllowedAudience", allowedAudienceShrink);
            this.allowedAudience = allowedAudience;
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
         * DiscoveryURL.
         */
        public Builder discoveryURL(String discoveryURL) {
            this.putBodyParameter("DiscoveryURL", discoveryURL);
            this.discoveryURL = discoveryURL;
            return this;
        }

        /**
         * IdentityProviderName.
         */
        public Builder identityProviderName(String identityProviderName) {
            this.putBodyParameter("IdentityProviderName", identityProviderName);
            this.identityProviderName = identityProviderName;
            return this;
        }

        @Override
        public CreateIdentityProviderRequest build() {
            return new CreateIdentityProviderRequest(this);
        } 

    } 

}
