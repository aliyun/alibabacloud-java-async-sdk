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
 * {@link Flow} extends {@link TeaModel}
 *
 * <p>Flow</p>
 */
public class Flow extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("disablePublicNetworkAccess")
    private Boolean disablePublicNetworkAccess;

    @com.aliyun.core.annotation.NameInMap("environmentConfiguration")
    private EnvironmentConfiguration environmentConfiguration;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("externalStorageLocation")
    private String externalStorageLocation;

    @com.aliyun.core.annotation.NameInMap("flowArn")
    private String flowArn;

    @com.aliyun.core.annotation.NameInMap("flowId")
    private String flowId;

    @com.aliyun.core.annotation.NameInMap("flowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("loggingConfiguration")
    private LoggingConfiguration loggingConfiguration;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("tracingConfiguration")
    private TracingConfiguration tracingConfiguration;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private Flow(Builder builder) {
        this.createdAt = builder.createdAt;
        this.definition = builder.definition;
        this.description = builder.description;
        this.disablePublicNetworkAccess = builder.disablePublicNetworkAccess;
        this.environmentConfiguration = builder.environmentConfiguration;
        this.executionRoleArn = builder.executionRoleArn;
        this.externalStorageLocation = builder.externalStorageLocation;
        this.flowArn = builder.flowArn;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.loggingConfiguration = builder.loggingConfiguration;
        this.resourceGroupId = builder.resourceGroupId;
        this.tracingConfiguration = builder.tracingConfiguration;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Flow create() {
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
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
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
     * @return environmentConfiguration
     */
    public EnvironmentConfiguration getEnvironmentConfiguration() {
        return this.environmentConfiguration;
    }

    /**
     * @return executionRoleArn
     */
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * @return externalStorageLocation
     */
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    /**
     * @return flowArn
     */
    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return loggingConfiguration
     */
    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tracingConfiguration
     */
    public TracingConfiguration getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String createdAt; 
        private String definition; 
        private String description; 
        private Boolean disablePublicNetworkAccess; 
        private EnvironmentConfiguration environmentConfiguration; 
        private String executionRoleArn; 
        private String externalStorageLocation; 
        private String flowArn; 
        private String flowId; 
        private String flowName; 
        private String lastUpdatedAt; 
        private LoggingConfiguration loggingConfiguration; 
        private String resourceGroupId; 
        private TracingConfiguration tracingConfiguration; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Flow model) {
            this.createdAt = model.createdAt;
            this.definition = model.definition;
            this.description = model.description;
            this.disablePublicNetworkAccess = model.disablePublicNetworkAccess;
            this.environmentConfiguration = model.environmentConfiguration;
            this.executionRoleArn = model.executionRoleArn;
            this.externalStorageLocation = model.externalStorageLocation;
            this.flowArn = model.flowArn;
            this.flowId = model.flowId;
            this.flowName = model.flowName;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.loggingConfiguration = model.loggingConfiguration;
            this.resourceGroupId = model.resourceGroupId;
            this.tracingConfiguration = model.tracingConfiguration;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>工作流的创建时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T10:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>工作流的定义内容</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>工作流的描述信息，说明该工作流的用途和功能</p>
         * 
         * <strong>example:</strong>
         * <p>Customer service automation flow</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>是否禁用该工作流的公网访问，作为工作流级别的默认策略</p>
         */
        public Builder disablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
            this.disablePublicNetworkAccess = disablePublicNetworkAccess;
            return this;
        }

        /**
         * <p>工作流的环境变量配置，包含一组命名变量列表</p>
         */
        public Builder environmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
            this.environmentConfiguration = environmentConfiguration;
            return this;
        }

        /**
         * <p>为工作流提供访问云服务权限的执行角色ARN</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1760720386195983:role/FlowExecutionRole</p>
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * <p>工作流的外部存储位置</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path</p>
         */
        public Builder externalStorageLocation(String externalStorageLocation) {
            this.externalStorageLocation = externalStorageLocation;
            return this;
        }

        /**
         * <p>工作流的全局唯一资源名称</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentrun:cn-hangzhou:1760720386195983:workspaces/ws-xxx/flows/flow-xxx</p>
         */
        public Builder flowArn(String flowArn) {
            this.flowArn = flowArn;
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
         * <p>工作流的名称，用于标识和区分不同的工作流实例</p>
         * 
         * <strong>example:</strong>
         * <p>my-flow</p>
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>工作流最后一次更新的时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T11:45:00Z</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>工作流的日志配置</p>
         */
        public Builder loggingConfiguration(LoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        /**
         * <p>工作流所属的资源组标识符</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4a4b4a</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>工作流的链路追踪配置</p>
         */
        public Builder tracingConfiguration(TracingConfiguration tracingConfiguration) {
            this.tracingConfiguration = tracingConfiguration;
            return this;
        }

        /**
         * <p>工作流所属的工作空间标识符</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Flow build() {
            return new Flow(this);
        } 

    } 

}
