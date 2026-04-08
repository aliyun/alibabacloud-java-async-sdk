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
 * {@link UpdateFlowInput} extends {@link TeaModel}
 *
 * <p>UpdateFlowInput</p>
 */
public class UpdateFlowInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("environmentConfiguration")
    private EnvironmentConfiguration environmentConfiguration;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("externalStorageLocation")
    private String externalStorageLocation;

    @com.aliyun.core.annotation.NameInMap("flowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("loggingConfiguration")
    private LoggingConfiguration loggingConfiguration;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.NameInMap("tracingConfiguration")
    private TracingConfiguration tracingConfiguration;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private UpdateFlowInput(Builder builder) {
        this.definition = builder.definition;
        this.description = builder.description;
        this.environmentConfiguration = builder.environmentConfiguration;
        this.executionRoleArn = builder.executionRoleArn;
        this.externalStorageLocation = builder.externalStorageLocation;
        this.flowName = builder.flowName;
        this.loggingConfiguration = builder.loggingConfiguration;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.tracingConfiguration = builder.tracingConfiguration;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
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
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
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
        private String definition; 
        private String description; 
        private EnvironmentConfiguration environmentConfiguration; 
        private String executionRoleArn; 
        private String externalStorageLocation; 
        private String flowName; 
        private LoggingConfiguration loggingConfiguration; 
        private String resourceGroupId; 
        private java.util.List<String> tags; 
        private TracingConfiguration tracingConfiguration; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(UpdateFlowInput model) {
            this.definition = model.definition;
            this.description = model.description;
            this.environmentConfiguration = model.environmentConfiguration;
            this.executionRoleArn = model.executionRoleArn;
            this.externalStorageLocation = model.externalStorageLocation;
            this.flowName = model.flowName;
            this.loggingConfiguration = model.loggingConfiguration;
            this.resourceGroupId = model.resourceGroupId;
            this.tags = model.tags;
            this.tracingConfiguration = model.tracingConfiguration;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>工作流的定义内容，采用JSON或YAML格式</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>工作流的描述信息，用于说明该工作流的用途和功能</p>
         * 
         * <strong>example:</strong>
         * <p>Customer service automation flow</p>
         */
        public Builder description(String description) {
            this.description = description;
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
         * <p>工作流的外部存储位置，如OSS路径</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path</p>
         */
        public Builder externalStorageLocation(String externalStorageLocation) {
            this.externalStorageLocation = externalStorageLocation;
            return this;
        }

        /**
         * <p>工作流的唯一标识名称，用于区分不同的工作流实例</p>
         * 
         * <strong>example:</strong>
         * <p>my-flow</p>
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
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
         * <p>工作流的标签信息，用于资源分类和管理</p>
         * 
         * <strong>example:</strong>
         * <p>production,automation</p>
         */
        public Builder tags(java.util.List<String> tags) {
            this.tags = tags;
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
         * <p>工作流所属的工作空间标识符，用于资源隔离和权限管理</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public UpdateFlowInput build() {
            return new UpdateFlowInput(this);
        } 

    } 

}
