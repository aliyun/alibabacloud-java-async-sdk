// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateCredentialInput} extends {@link TeaModel}
 *
 * <p>UpdateCredentialInput</p>
 */
public class UpdateCredentialInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialPublicConfig")
    private CredentialPublicConfig credentialPublicConfig;

    @com.aliyun.core.annotation.NameInMap("credentialSecret")
    private String credentialSecret;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    private UpdateCredentialInput(Builder builder) {
        this.credentialPublicConfig = builder.credentialPublicConfig;
        this.credentialSecret = builder.credentialSecret;
        this.description = builder.description;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCredentialInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialPublicConfig
     */
    public CredentialPublicConfig getCredentialPublicConfig() {
        return this.credentialPublicConfig;
    }

    /**
     * @return credentialSecret
     */
    public String getCredentialSecret() {
        return this.credentialSecret;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder {
        private CredentialPublicConfig credentialPublicConfig; 
        private String credentialSecret; 
        private String description; 
        private Boolean enabled; 

        private Builder() {
        } 

        private Builder(UpdateCredentialInput model) {
            this.credentialPublicConfig = model.credentialPublicConfig;
            this.credentialSecret = model.credentialSecret;
            this.description = model.description;
            this.enabled = model.enabled;
        } 

        /**
         * credentialPublicConfig.
         */
        public Builder credentialPublicConfig(CredentialPublicConfig credentialPublicConfig) {
            this.credentialPublicConfig = credentialPublicConfig;
            return this;
        }

        /**
         * credentialSecret.
         */
        public Builder credentialSecret(String credentialSecret) {
            this.credentialSecret = credentialSecret;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public UpdateCredentialInput build() {
            return new UpdateCredentialInput(this);
        } 

    } 

}
