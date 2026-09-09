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
 * {@link ConnectorUpdateInput} extends {@link TeaModel}
 *
 * <p>ConnectorUpdateInput</p>
 */
public class ConnectorUpdateInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authentication")
    private ConnectorAuthenticationUpdateInput authentication;

    @com.aliyun.core.annotation.NameInMap("capabilityGrants")
    private java.util.List<java.util.Map<String, ?>> capabilityGrants;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private java.util.Map<String, ?> configuration;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("policy")
    private java.util.Map<String, ?> policy;

    @com.aliyun.core.annotation.NameInMap("runtime")
    private ConnectorRuntime runtime;

    @com.aliyun.core.annotation.NameInMap("target")
    private java.util.Map<String, ?> target;

    private ConnectorUpdateInput(Builder builder) {
        this.authentication = builder.authentication;
        this.capabilityGrants = builder.capabilityGrants;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.policy = builder.policy;
        this.runtime = builder.runtime;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectorUpdateInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authentication
     */
    public ConnectorAuthenticationUpdateInput getAuthentication() {
        return this.authentication;
    }

    /**
     * @return capabilityGrants
     */
    public java.util.List<java.util.Map<String, ?>> getCapabilityGrants() {
        return this.capabilityGrants;
    }

    /**
     * @return configuration
     */
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
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
        private ConnectorAuthenticationUpdateInput authentication; 
        private java.util.List<java.util.Map<String, ?>> capabilityGrants; 
        private java.util.Map<String, ?> configuration; 
        private String description; 
        private String displayName; 
        private Boolean enabled; 
        private java.util.Map<String, ?> policy; 
        private ConnectorRuntime runtime; 
        private java.util.Map<String, ?> target; 

        private Builder() {
        } 

        private Builder(ConnectorUpdateInput model) {
            this.authentication = model.authentication;
            this.capabilityGrants = model.capabilityGrants;
            this.configuration = model.configuration;
            this.description = model.description;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.policy = model.policy;
            this.runtime = model.runtime;
            this.target = model.target;
        } 

        /**
         * <p>The authentication configuration used to replace the existing credentials.</p>
         */
        public Builder authentication(ConnectorAuthenticationUpdateInput authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * <p>The list of capabilities used to replace the existing grants.</p>
         */
        public Builder capabilityGrants(java.util.List<java.util.Map<String, ?>> capabilityGrants) {
            this.capabilityGrants = capabilityGrants;
            return this;
        }

        /**
         * <p>The provider configuration used to update the Connector. Only AlibabaCloudResources allows null. Other providers must provide an object.</p>
         */
        public Builder configuration(java.util.Map<String, ?> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>The description of the Connector.</p>
         * 
         * <strong>example:</strong>
         * <p>Production observability data</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the Connector.</p>
         * 
         * <strong>example:</strong>
         * <p>CMS 2.0 production workspace</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Connector.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The execution policy used to replace the existing policy.</p>
         */
        public Builder policy(java.util.Map<String, ?> policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The runtime configuration used to update the Connector.</p>
         */
        public Builder runtime(ConnectorRuntime runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The provider target used to update the Connector.</p>
         */
        public Builder target(java.util.Map<String, ?> target) {
            this.target = target;
            return this;
        }

        public ConnectorUpdateInput build() {
            return new ConnectorUpdateInput(this);
        } 

    } 

}
