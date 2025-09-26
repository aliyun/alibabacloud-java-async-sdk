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
 * {@link UpdateAgentRuntimeEndpointInput} extends {@link TeaModel}
 *
 * <p>UpdateAgentRuntimeEndpointInput</p>
 */
public class UpdateAgentRuntimeEndpointInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentRuntimeEndpointName")
    private String agentRuntimeEndpointName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("routingConfiguration")
    private RoutingConfiguration routingConfiguration;

    @com.aliyun.core.annotation.NameInMap("targetVersion")
    private String targetVersion;

    private UpdateAgentRuntimeEndpointInput(Builder builder) {
        this.agentRuntimeEndpointName = builder.agentRuntimeEndpointName;
        this.description = builder.description;
        this.routingConfiguration = builder.routingConfiguration;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentRuntimeEndpointInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeEndpointName
     */
    public String getAgentRuntimeEndpointName() {
        return this.agentRuntimeEndpointName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return routingConfiguration
     */
    public RoutingConfiguration getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder {
        private String agentRuntimeEndpointName; 
        private String description; 
        private RoutingConfiguration routingConfiguration; 
        private String targetVersion; 

        private Builder() {
        } 

        private Builder(UpdateAgentRuntimeEndpointInput model) {
            this.agentRuntimeEndpointName = model.agentRuntimeEndpointName;
            this.description = model.description;
            this.routingConfiguration = model.routingConfiguration;
            this.targetVersion = model.targetVersion;
        } 

        /**
         * agentRuntimeEndpointName.
         */
        public Builder agentRuntimeEndpointName(String agentRuntimeEndpointName) {
            this.agentRuntimeEndpointName = agentRuntimeEndpointName;
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
         * <p>智能体运行时端点的路由配置，支持多版本权重分配</p>
         */
        public Builder routingConfiguration(RoutingConfiguration routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        /**
         * <p>智能体运行时的目标版本</p>
         */
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }

        public UpdateAgentRuntimeEndpointInput build() {
            return new UpdateAgentRuntimeEndpointInput(this);
        } 

    } 

}
