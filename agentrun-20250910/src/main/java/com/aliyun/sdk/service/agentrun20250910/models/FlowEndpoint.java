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
 * {@link FlowEndpoint} extends {@link TeaModel}
 *
 * <p>FlowEndpoint</p>
 */
public class FlowEndpoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("disablePublicNetworkAccess")
    private Boolean disablePublicNetworkAccess;

    @com.aliyun.core.annotation.NameInMap("flowEndpointArn")
    private String flowEndpointArn;

    @com.aliyun.core.annotation.NameInMap("flowEndpointId")
    private String flowEndpointId;

    @com.aliyun.core.annotation.NameInMap("flowEndpointName")
    private String flowEndpointName;

    @com.aliyun.core.annotation.NameInMap("flowId")
    private String flowId;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("routingConfiguration")
    private java.util.List<FlowEndpointRoutingConfig> routingConfiguration;

    @com.aliyun.core.annotation.NameInMap("targetVersion")
    private String targetVersion;

    private FlowEndpoint(Builder builder) {
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.disablePublicNetworkAccess = builder.disablePublicNetworkAccess;
        this.flowEndpointArn = builder.flowEndpointArn;
        this.flowEndpointId = builder.flowEndpointId;
        this.flowEndpointName = builder.flowEndpointName;
        this.flowId = builder.flowId;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.routingConfiguration = builder.routingConfiguration;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlowEndpoint create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
     * @return flowEndpointArn
     */
    public String getFlowEndpointArn() {
        return this.flowEndpointArn;
    }

    /**
     * @return flowEndpointId
     */
    public String getFlowEndpointId() {
        return this.flowEndpointId;
    }

    /**
     * @return flowEndpointName
     */
    public String getFlowEndpointName() {
        return this.flowEndpointName;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
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
        private String createdAt; 
        private String description; 
        private Boolean disablePublicNetworkAccess; 
        private String flowEndpointArn; 
        private String flowEndpointId; 
        private String flowEndpointName; 
        private String flowId; 
        private String lastUpdatedAt; 
        private java.util.List<FlowEndpointRoutingConfig> routingConfiguration; 
        private String targetVersion; 

        private Builder() {
        } 

        private Builder(FlowEndpoint model) {
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.disablePublicNetworkAccess = model.disablePublicNetworkAccess;
            this.flowEndpointArn = model.flowEndpointArn;
            this.flowEndpointId = model.flowEndpointId;
            this.flowEndpointName = model.flowEndpointName;
            this.flowId = model.flowId;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.routingConfiguration = model.routingConfiguration;
            this.targetVersion = model.targetVersion;
        } 

        /**
         * <p>工作流端点的创建时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T10:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
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
         * <p>工作流端点的全局唯一资源名称</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentrun:cn-hangzhou:1760720386195983:workspaces/ws-xxx/flows/flow-xxx/endpoints/fe-xxx</p>
         */
        public Builder flowEndpointArn(String flowEndpointArn) {
            this.flowEndpointArn = flowEndpointArn;
            return this;
        }

        /**
         * <p>工作流端点的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>fe-1234567890abcdef</p>
         */
        public Builder flowEndpointId(String flowEndpointId) {
            this.flowEndpointId = flowEndpointId;
            return this;
        }

        /**
         * <p>工作流端点的名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-flow-endpoint</p>
         */
        public Builder flowEndpointName(String flowEndpointName) {
            this.flowEndpointName = flowEndpointName;
            return this;
        }

        /**
         * <p>工作流的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>flow-1234567890abcdef</p>
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * <p>工作流端点最后一次更新的时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T11:45:00Z</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>工作流端点的版本路由配置</p>
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

        public FlowEndpoint build() {
            return new FlowEndpoint(this);
        } 

    } 

}
