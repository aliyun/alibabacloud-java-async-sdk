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
 * {@link FlowVersion} extends {@link TeaModel}
 *
 * <p>FlowVersion</p>
 */
public class FlowVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("environmentConfiguration")
    private EnvironmentConfiguration environmentConfiguration;

    @com.aliyun.core.annotation.NameInMap("externalStorageLocation")
    private String externalStorageLocation;

    @com.aliyun.core.annotation.NameInMap("flowId")
    private String flowId;

    @com.aliyun.core.annotation.NameInMap("flowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("flowVersion")
    private String flowVersion;

    @com.aliyun.core.annotation.NameInMap("loggingConfiguration")
    private LoggingConfiguration loggingConfiguration;

    @com.aliyun.core.annotation.NameInMap("tracingConfiguration")
    private TracingConfiguration tracingConfiguration;

    private FlowVersion(Builder builder) {
        this.createdAt = builder.createdAt;
        this.definition = builder.definition;
        this.description = builder.description;
        this.environmentConfiguration = builder.environmentConfiguration;
        this.externalStorageLocation = builder.externalStorageLocation;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.flowVersion = builder.flowVersion;
        this.loggingConfiguration = builder.loggingConfiguration;
        this.tracingConfiguration = builder.tracingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlowVersion create() {
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
     * @return environmentConfiguration
     */
    public EnvironmentConfiguration getEnvironmentConfiguration() {
        return this.environmentConfiguration;
    }

    /**
     * @return externalStorageLocation
     */
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
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
     * @return flowVersion
     */
    public String getFlowVersion() {
        return this.flowVersion;
    }

    /**
     * @return loggingConfiguration
     */
    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * @return tracingConfiguration
     */
    public TracingConfiguration getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    public static final class Builder {
        private String createdAt; 
        private String definition; 
        private String description; 
        private EnvironmentConfiguration environmentConfiguration; 
        private String externalStorageLocation; 
        private String flowId; 
        private String flowName; 
        private String flowVersion; 
        private LoggingConfiguration loggingConfiguration; 
        private TracingConfiguration tracingConfiguration; 

        private Builder() {
        } 

        private Builder(FlowVersion model) {
            this.createdAt = model.createdAt;
            this.definition = model.definition;
            this.description = model.description;
            this.environmentConfiguration = model.environmentConfiguration;
            this.externalStorageLocation = model.externalStorageLocation;
            this.flowId = model.flowId;
            this.flowName = model.flowName;
            this.flowVersion = model.flowVersion;
            this.loggingConfiguration = model.loggingConfiguration;
            this.tracingConfiguration = model.tracingConfiguration;
        } 

        /**
         * <p>工作流版本的创建时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T10:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>工作流版本的定义内容（完整快照，仅在 GetFlowVersion 时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>Type: StateMachine\nName: my-flow\n...</p>
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>工作流版本的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>Version 1.0 - Initial release</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>工作流版本的环境变量配置（完整快照，仅在 GetFlowVersion 时返回）</p>
         */
        public Builder environmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
            this.environmentConfiguration = environmentConfiguration;
            return this;
        }

        /**
         * <p>工作流版本的外部存储位置（完整快照，仅在 GetFlowVersion 时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path</p>
         */
        public Builder externalStorageLocation(String externalStorageLocation) {
            this.externalStorageLocation = externalStorageLocation;
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
         * flowName.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>工作流版本号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder flowVersion(String flowVersion) {
            this.flowVersion = flowVersion;
            return this;
        }

        /**
         * <p>工作流版本的日志配置（完整快照，仅在 GetFlowVersion 时返回）</p>
         */
        public Builder loggingConfiguration(LoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        /**
         * <p>工作流版本的链路追踪配置（完整快照，仅在 GetFlowVersion 时返回）</p>
         */
        public Builder tracingConfiguration(TracingConfiguration tracingConfiguration) {
            this.tracingConfiguration = tracingConfiguration;
            return this;
        }

        public FlowVersion build() {
            return new FlowVersion(this);
        } 

    } 

}
