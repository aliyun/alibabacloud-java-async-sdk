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
 * {@link Template} extends {@link TeaModel}
 *
 * <p>Template</p>
 */
public class Template extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowAnonymousManage")
    private Boolean allowAnonymousManage;

    @com.aliyun.core.annotation.NameInMap("containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("credentialConfiguration")
    private CredentialConfiguration credentialConfiguration;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("enableAgent")
    private Boolean enableAgent;

    @com.aliyun.core.annotation.NameInMap("environmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("mcpOptions")
    private McpOptions mcpOptions;

    @com.aliyun.core.annotation.NameInMap("mcpState")
    private McpState mcpState;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("ossConfiguration")
    private java.util.List<OssConfiguration> ossConfiguration;

    @com.aliyun.core.annotation.NameInMap("resourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("sandboxIdleTimeoutInSeconds")
    private String sandboxIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sandboxTTLInSeconds")
    @Deprecated
    private String sandboxTTLInSeconds;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("templateArn")
    private String templateArn;

    @com.aliyun.core.annotation.NameInMap("templateConfiguration")
    private java.util.Map<String, ?> templateConfiguration;

    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("templateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    @com.aliyun.core.annotation.NameInMap("templateVersion")
    private String templateVersion;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private Template(Builder builder) {
        this.allowAnonymousManage = builder.allowAnonymousManage;
        this.containerConfiguration = builder.containerConfiguration;
        this.cpu = builder.cpu;
        this.createdAt = builder.createdAt;
        this.credentialConfiguration = builder.credentialConfiguration;
        this.description = builder.description;
        this.diskSize = builder.diskSize;
        this.enableAgent = builder.enableAgent;
        this.environmentVariables = builder.environmentVariables;
        this.executionRoleArn = builder.executionRoleArn;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.logConfiguration = builder.logConfiguration;
        this.mcpOptions = builder.mcpOptions;
        this.mcpState = builder.mcpState;
        this.memory = builder.memory;
        this.nasConfig = builder.nasConfig;
        this.networkConfiguration = builder.networkConfiguration;
        this.ossConfiguration = builder.ossConfiguration;
        this.resourceName = builder.resourceName;
        this.sandboxIdleTimeoutInSeconds = builder.sandboxIdleTimeoutInSeconds;
        this.sandboxTTLInSeconds = builder.sandboxTTLInSeconds;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.templateArn = builder.templateArn;
        this.templateConfiguration = builder.templateConfiguration;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
        this.templateVersion = builder.templateVersion;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Template create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowAnonymousManage
     */
    public Boolean getAllowAnonymousManage() {
        return this.allowAnonymousManage;
    }

    /**
     * @return containerConfiguration
     */
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return credentialConfiguration
     */
    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return enableAgent
     */
    public Boolean getEnableAgent() {
        return this.enableAgent;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return executionRoleArn
     */
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * @return mcpOptions
     */
    public McpOptions getMcpOptions() {
        return this.mcpOptions;
    }

    /**
     * @return mcpState
     */
    public McpState getMcpState() {
        return this.mcpState;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return nasConfig
     */
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    /**
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @return ossConfiguration
     */
    public java.util.List<OssConfiguration> getOssConfiguration() {
        return this.ossConfiguration;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return sandboxIdleTimeoutInSeconds
     */
    public String getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    /**
     * @return sandboxTTLInSeconds
     */
    public String getSandboxTTLInSeconds() {
        return this.sandboxTTLInSeconds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return templateArn
     */
    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * @return templateConfiguration
     */
    public java.util.Map<String, ?> getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private Boolean allowAnonymousManage; 
        private ContainerConfiguration containerConfiguration; 
        private Float cpu; 
        private String createdAt; 
        private CredentialConfiguration credentialConfiguration; 
        private String description; 
        private Integer diskSize; 
        private Boolean enableAgent; 
        private java.util.Map<String, String> environmentVariables; 
        private String executionRoleArn; 
        private String lastUpdatedAt; 
        private LogConfiguration logConfiguration; 
        private McpOptions mcpOptions; 
        private McpState mcpState; 
        private Integer memory; 
        private NASConfig nasConfig; 
        private NetworkConfiguration networkConfiguration; 
        private java.util.List<OssConfiguration> ossConfiguration; 
        private String resourceName; 
        private String sandboxIdleTimeoutInSeconds; 
        private String sandboxTTLInSeconds; 
        private String status; 
        private String statusReason; 
        private String templateArn; 
        private java.util.Map<String, ?> templateConfiguration; 
        private String templateId; 
        private String templateName; 
        private String templateType; 
        private String templateVersion; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Template model) {
            this.allowAnonymousManage = model.allowAnonymousManage;
            this.containerConfiguration = model.containerConfiguration;
            this.cpu = model.cpu;
            this.createdAt = model.createdAt;
            this.credentialConfiguration = model.credentialConfiguration;
            this.description = model.description;
            this.diskSize = model.diskSize;
            this.enableAgent = model.enableAgent;
            this.environmentVariables = model.environmentVariables;
            this.executionRoleArn = model.executionRoleArn;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.logConfiguration = model.logConfiguration;
            this.mcpOptions = model.mcpOptions;
            this.mcpState = model.mcpState;
            this.memory = model.memory;
            this.nasConfig = model.nasConfig;
            this.networkConfiguration = model.networkConfiguration;
            this.ossConfiguration = model.ossConfiguration;
            this.resourceName = model.resourceName;
            this.sandboxIdleTimeoutInSeconds = model.sandboxIdleTimeoutInSeconds;
            this.sandboxTTLInSeconds = model.sandboxTTLInSeconds;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.templateArn = model.templateArn;
            this.templateConfiguration = model.templateConfiguration;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.templateType = model.templateType;
            this.templateVersion = model.templateVersion;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * allowAnonymousManage.
         */
        public Builder allowAnonymousManage(Boolean allowAnonymousManage) {
            this.allowAnonymousManage = allowAnonymousManage;
            return this;
        }

        /**
         * containerConfiguration.
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * credentialConfiguration.
         */
        public Builder credentialConfiguration(CredentialConfiguration credentialConfiguration) {
            this.credentialConfiguration = credentialConfiguration;
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
         * diskSize.
         */
        public Builder diskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * enableAgent.
         */
        public Builder enableAgent(Boolean enableAgent) {
            this.enableAgent = enableAgent;
            return this;
        }

        /**
         * environmentVariables.
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * executionRoleArn.
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * lastUpdatedAt.
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * logConfiguration.
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * mcpOptions.
         */
        public Builder mcpOptions(McpOptions mcpOptions) {
            this.mcpOptions = mcpOptions;
            return this;
        }

        /**
         * mcpState.
         */
        public Builder mcpState(McpState mcpState) {
            this.mcpState = mcpState;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * nasConfig.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * networkConfiguration.
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * ossConfiguration.
         */
        public Builder ossConfiguration(java.util.List<OssConfiguration> ossConfiguration) {
            this.ossConfiguration = ossConfiguration;
            return this;
        }

        /**
         * resourceName.
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * sandboxIdleTimeoutInSeconds.
         */
        public Builder sandboxIdleTimeoutInSeconds(String sandboxIdleTimeoutInSeconds) {
            this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
            return this;
        }

        /**
         * sandboxTTLInSeconds.
         */
        public Builder sandboxTTLInSeconds(String sandboxTTLInSeconds) {
            this.sandboxTTLInSeconds = sandboxTTLInSeconds;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * statusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * templateArn.
         */
        public Builder templateArn(String templateArn) {
            this.templateArn = templateArn;
            return this;
        }

        /**
         * templateConfiguration.
         */
        public Builder templateConfiguration(java.util.Map<String, ?> templateConfiguration) {
            this.templateConfiguration = templateConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * templateType.
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        /**
         * templateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Template build() {
            return new Template(this);
        } 

    } 

    /**
     * 
     * {@link Template} extends {@link TeaModel}
     *
     * <p>Template</p>
     */
    public static class McpOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabledTools")
        private java.util.List<String> enabledTools;

        @com.aliyun.core.annotation.NameInMap("transport")
        private String transport;

        private McpOptions(Builder builder) {
            this.enabledTools = builder.enabledTools;
            this.transport = builder.transport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpOptions create() {
            return builder().build();
        }

        /**
         * @return enabledTools
         */
        public java.util.List<String> getEnabledTools() {
            return this.enabledTools;
        }

        /**
         * @return transport
         */
        public String getTransport() {
            return this.transport;
        }

        public static final class Builder {
            private java.util.List<String> enabledTools; 
            private String transport; 

            private Builder() {
            } 

            private Builder(McpOptions model) {
                this.enabledTools = model.enabledTools;
                this.transport = model.transport;
            } 

            /**
             * enabledTools.
             */
            public Builder enabledTools(java.util.List<String> enabledTools) {
                this.enabledTools = enabledTools;
                return this;
            }

            /**
             * transport.
             */
            public Builder transport(String transport) {
                this.transport = transport;
                return this;
            }

            public McpOptions build() {
                return new McpOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link Template} extends {@link TeaModel}
     *
     * <p>Template</p>
     */
    public static class McpState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessEndpoint")
        private String accessEndpoint;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        private McpState(Builder builder) {
            this.accessEndpoint = builder.accessEndpoint;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpState create() {
            return builder().build();
        }

        /**
         * @return accessEndpoint
         */
        public String getAccessEndpoint() {
            return this.accessEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        public static final class Builder {
            private String accessEndpoint; 
            private String status; 
            private String statusReason; 

            private Builder() {
            } 

            private Builder(McpState model) {
                this.accessEndpoint = model.accessEndpoint;
                this.status = model.status;
                this.statusReason = model.statusReason;
            } 

            /**
             * accessEndpoint.
             */
            public Builder accessEndpoint(String accessEndpoint) {
                this.accessEndpoint = accessEndpoint;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * statusReason.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public McpState build() {
                return new McpState(this);
            } 

        } 

    }
}
