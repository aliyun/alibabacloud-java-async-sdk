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
 * {@link CreateCredentialInput} extends {@link TeaModel}
 *
 * <p>CreateCredentialInput</p>
 */
public class CreateCredentialInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialAuthType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialAuthType;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("credentialPublicConfig")
    private CredentialPublicConfig credentialPublicConfig;

    @com.aliyun.core.annotation.NameInMap("credentialSecret")
    private String credentialSecret;

    @com.aliyun.core.annotation.NameInMap("credentialSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialSourceType;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    private CreateCredentialInput(Builder builder) {
        this.credentialAuthType = builder.credentialAuthType;
        this.credentialName = builder.credentialName;
        this.credentialPublicConfig = builder.credentialPublicConfig;
        this.credentialSecret = builder.credentialSecret;
        this.credentialSourceType = builder.credentialSourceType;
        this.description = builder.description;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCredentialInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialAuthType
     */
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
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
     * @return credentialSourceType
     */
    public String getCredentialSourceType() {
        return this.credentialSourceType;
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
        private String credentialAuthType; 
        private String credentialName; 
        private CredentialPublicConfig credentialPublicConfig; 
        private String credentialSecret; 
        private String credentialSourceType; 
        private String description; 
        private Boolean enabled; 

        private Builder() {
        } 

        private Builder(CreateCredentialInput model) {
            this.credentialAuthType = model.credentialAuthType;
            this.credentialName = model.credentialName;
            this.credentialPublicConfig = model.credentialPublicConfig;
            this.credentialSecret = model.credentialSecret;
            this.credentialSourceType = model.credentialSourceType;
            this.description = model.description;
            this.enabled = model.enabled;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder credentialAuthType(String credentialAuthType) {
            this.credentialAuthType = credentialAuthType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
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
         * <p>This parameter is required.</p>
         */
        public Builder credentialSourceType(String credentialSourceType) {
            this.credentialSourceType = credentialSourceType;
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

        public CreateCredentialInput build() {
            return new CreateCredentialInput(this);
        } 

    } 

}
