// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link ConnectorCreateInput} extends {@link TeaModel}
 *
 * <p>ConnectorCreateInput</p>
 */
public class ConnectorCreateInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authentication")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConnectorAuthenticationInput authentication;

    @com.aliyun.core.annotation.NameInMap("capabilityGrants")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> capabilityGrants;

    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 16)
    private String clientToken;

    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> configuration;

    @com.aliyun.core.annotation.NameInMap("connectorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorName;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> policy;

    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.NameInMap("runtime")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConnectorRuntime runtime;

    @com.aliyun.core.annotation.NameInMap("target")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> target;

    private ConnectorCreateInput(Builder builder) {
        this.authentication = builder.authentication;
        this.capabilityGrants = builder.capabilityGrants;
        this.clientToken = builder.clientToken;
        this.configuration = builder.configuration;
        this.connectorName = builder.connectorName;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.policy = builder.policy;
        this.provider = builder.provider;
        this.runtime = builder.runtime;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectorCreateInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authentication
     */
    public ConnectorAuthenticationInput getAuthentication() {
        return this.authentication;
    }

    /**
     * @return capabilityGrants
     */
    public java.util.List<java.util.Map<String, ?>> getCapabilityGrants() {
        return this.capabilityGrants;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configuration
     */
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return policy
     */
    public java.util.Map<String, ?> getPolicy() {
        return this.policy;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return runtime
     */
    public ConnectorRuntime getRuntime() {
        return this.runtime;
    }

    /**
     * @return target
     */
    public java.util.Map<String, ?> getTarget() {
        return this.target;
    }

    public static final class Builder {
        private ConnectorAuthenticationInput authentication; 
        private java.util.List<java.util.Map<String, ?>> capabilityGrants; 
        private String clientToken; 
        private java.util.Map<String, ?> configuration; 
        private String connectorName; 
        private String description; 
        private String displayName; 
        private Boolean enabled; 
        private java.util.Map<String, ?> policy; 
        private String provider; 
        private ConnectorRuntime runtime; 
        private java.util.Map<String, ?> target; 

        private Builder() {
        } 

        private Builder(ConnectorCreateInput model) {
            this.authentication = model.authentication;
            this.capabilityGrants = model.capabilityGrants;
            this.clientToken = model.clientToken;
            this.configuration = model.configuration;
            this.connectorName = model.connectorName;
            this.description = model.description;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.policy = model.policy;
            this.provider = model.provider;
            this.runtime = model.runtime;
            this.target = model.target;
        } 

        /**
         * <p>The authentication configuration used to access the target service.</p>
         * <p>This parameter is required.</p>
         */
        public Builder authentication(ConnectorAuthenticationInput authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * <p>The list of capabilities granted to the Connector.</p>
         * <p>This parameter is required.</p>
         */
        public Builder capabilityGrants(java.util.List<java.util.Map<String, ?>> capabilityGrants) {
            this.capabilityGrants = capabilityGrants;
            return this;
        }

        /**
         * <p>Idempotency token</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8f73d0f4-3c8a-4eed-91e6-cf2f7ebcb3d7</p>
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Provider configuration</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(java.util.Map<String, ?> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>Connector name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cms2-prod</p>
         */
        public Builder connectorName(String connectorName) {
            this.connectorName = connectorName;
            return this;
        }

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>Production observability data</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Display name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CMS 2.0 production workspace</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Connector after creation.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The execution policy of the Connector.</p>
         * <p>This parameter is required.</p>
         */
        public Builder policy(java.util.Map<String, ?> policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Provider</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AlibabaCloudCms</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>The runtime configuration of the Connector.</p>
         * <p>This parameter is required.</p>
         */
        public Builder runtime(ConnectorRuntime runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>Provider target</p>
         * <p>This parameter is required.</p>
         */
        public Builder target(java.util.Map<String, ?> target) {
            this.target = target;
            return this;
        }

        public ConnectorCreateInput build() {
            return new ConnectorCreateInput(this);
        } 

    } 

}
