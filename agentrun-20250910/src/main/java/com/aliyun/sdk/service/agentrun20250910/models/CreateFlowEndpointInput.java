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
 * {@link CreateFlowEndpointInput} extends {@link TeaModel}
 *
 * <p>CreateFlowEndpointInput</p>
 */
public class CreateFlowEndpointInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("flowEndpointName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowEndpointName;

    @com.aliyun.core.annotation.NameInMap("routingConfiguration")
    private java.util.List<FlowEndpointRoutingConfig> routingConfiguration;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.NameInMap("targetVersion")
    private String targetVersion;

    private CreateFlowEndpointInput(Builder builder) {
        this.description = builder.description;
        this.flowEndpointName = builder.flowEndpointName;
        this.routingConfiguration = builder.routingConfiguration;
        this.tags = builder.tags;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowEndpointInput create() {
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
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder {
        private String description; 
        private String flowEndpointName; 
        private java.util.List<FlowEndpointRoutingConfig> routingConfiguration; 
        private java.util.List<String> tags; 
        private String targetVersion; 

        private Builder() {
        } 

        private Builder(CreateFlowEndpointInput model) {
            this.description = model.description;
            this.flowEndpointName = model.flowEndpointName;
            this.routingConfiguration = model.routingConfiguration;
            this.tags = model.tags;
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
         * <p>工作流端点的唯一标识名称</p>
         * <p>This parameter is required.</p>
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
         * <p>工作流端点的标签信息</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        public Builder tags(java.util.List<String> tags) {
            this.tags = tags;
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

        public CreateFlowEndpointInput build() {
            return new CreateFlowEndpointInput(this);
        } 

    } 

}
