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
 * {@link DiscoveryEndpoint} extends {@link TeaModel}
 *
 * <p>DiscoveryEndpoint</p>
 */
public class DiscoveryEndpoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentEndpointConfigs")
    private java.util.List<AgentEndpointConfig> agentEndpointConfigs;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DiscoveryEndpoint(Builder builder) {
        this.agentEndpointConfigs = builder.agentEndpointConfigs;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiscoveryEndpoint create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentEndpointConfigs
     */
    public java.util.List<AgentEndpointConfig> getAgentEndpointConfigs() {
        return this.agentEndpointConfigs;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private java.util.List<AgentEndpointConfig> agentEndpointConfigs; 
        private String name; 

        private Builder() {
        } 

        private Builder(DiscoveryEndpoint model) {
            this.agentEndpointConfigs = model.agentEndpointConfigs;
            this.name = model.name;
        } 

        /**
         * agentEndpointConfigs.
         */
        public Builder agentEndpointConfigs(java.util.List<AgentEndpointConfig> agentEndpointConfigs) {
            this.agentEndpointConfigs = agentEndpointConfigs;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public DiscoveryEndpoint build() {
            return new DiscoveryEndpoint(this);
        } 

    } 

}
