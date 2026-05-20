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
 * {@link UpdateFlowEndpointInput} extends {@link TeaModel}
 *
 * <p>UpdateFlowEndpointInput</p>
 */
public class UpdateFlowEndpointInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("disablePublicNetworkAccess")
    private Boolean disablePublicNetworkAccess;

    @com.aliyun.core.annotation.NameInMap("flowEndpointName")
    private String flowEndpointName;

    @com.aliyun.core.annotation.NameInMap("routingConfiguration")
    private java.util.List<FlowEndpointRoutingConfig> routingConfiguration;

    @com.aliyun.core.annotation.NameInMap("targetVersion")
    private String targetVersion;

    private UpdateFlowEndpointInput(Builder builder) {
        this.description = builder.description;
        this.disablePublicNetworkAccess = builder.disablePublicNetworkAccess;
        this.flowEndpointName = builder.flowEndpointName;
        this.routingConfiguration = builder.routingConfiguration;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowEndpointInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disablePublicNetworkAccess
     */
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
    }

    /**
     * @return flowEndpointName
     */
    public String getFlowEndpointName() {
        return this.flowEndpointName;
    }

    /**
     * @return routingConfiguration
     */
    public java.util.List<FlowEndpointRoutingConfig> getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder {
        private String description; 
        private Boolean disablePublicNetworkAccess; 
        private String flowEndpointName; 
        private java.util.List<FlowEndpointRoutingConfig> routingConfiguration; 
        private String targetVersion; 

        private Builder() {
        } 

        private Builder(UpdateFlowEndpointInput model) {
            this.description = model.description;
            this.disablePublicNetworkAccess = model.disablePublicNetworkAccess;
            this.flowEndpointName = model.flowEndpointName;
            this.routingConfiguration = model.routingConfiguration;
            this.targetVersion = model.targetVersion;
        } 

        /**
         * <p>工作流端点的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>Production endpoint for flow</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>是否禁用该端点的公网访问</p>
         */
        public Builder disablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
            this.disablePublicNetworkAccess = disablePublicNetworkAccess;
            return this;
        }

        /**
         * <p>工作流端点的唯一标识名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-flow-endpoint</p>
         */
        public Builder flowEndpointName(String flowEndpointName) {
            this.flowEndpointName = flowEndpointName;
            return this;
        }

        /**
         * <p>工作流端点的版本路由配置，用于流量分配</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder routingConfiguration(java.util.List<FlowEndpointRoutingConfig> routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        /**
         * <p>工作流端点指向的目标版本号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }

        public UpdateFlowEndpointInput build() {
            return new UpdateFlowEndpointInput(this);
        } 

    } 

}
