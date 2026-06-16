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
 * {@link UpdateAgentRuntimeInput} extends {@link TeaModel}
 *
 * <p>UpdateAgentRuntimeInput</p>
 */
public class UpdateAgentRuntimeInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentRuntimeName")
    private String agentRuntimeName;

    @com.aliyun.core.annotation.NameInMap("armsConfiguration")
    private ArmsConfiguration armsConfiguration;

    @com.aliyun.core.annotation.NameInMap("artifactType")
    private String artifactType;

    @com.aliyun.core.annotation.NameInMap("codeConfiguration")
    private CodeConfiguration codeConfiguration;

    @com.aliyun.core.annotation.NameInMap("containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("disableOndemand")
    private Boolean disableOndemand;

    @com.aliyun.core.annotation.NameInMap("disableSessionAffinity")
    private Boolean disableSessionAffinity;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("edition")
    private String edition;

    @com.aliyun.core.annotation.NameInMap("enableSessionIsolation")
    private Boolean enableSessionIsolation;

    @com.aliyun.core.annotation.NameInMap("environmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("externalAgentEndpointUrl")
    private String externalAgentEndpointUrl;

    @com.aliyun.core.annotation.NameInMap("forceEvictInstances")
    private Boolean forceEvictInstances;

    @com.aliyun.core.annotation.NameInMap("headerFieldName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String headerFieldName;

    @com.aliyun.core.annotation.NameInMap("healthCheckConfiguration")
    private HealthCheckConfiguration healthCheckConfiguration;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("protocolConfiguration")
    private ProtocolConfiguration protocolConfiguration;

    @com.aliyun.core.annotation.NameInMap("sessionAffinityType")
    private String sessionAffinityType;

    @com.aliyun.core.annotation.NameInMap("sessionConcurrencyLimitPerInstance")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer sessionConcurrencyLimitPerInstance;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutSeconds")
    private Integer sessionIdleTimeoutSeconds;

    @com.aliyun.core.annotation.NameInMap("systemTags")
    private java.util.List<String> systemTags;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private UpdateAgentRuntimeInput(Builder builder) {
        this.agentRuntimeName = builder.agentRuntimeName;
        this.armsConfiguration = builder.armsConfiguration;
        this.artifactType = builder.artifactType;
        this.codeConfiguration = builder.codeConfiguration;
        this.containerConfiguration = builder.containerConfiguration;
        this.cpu = builder.cpu;
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.disableOndemand = builder.disableOndemand;
        this.disableSessionAffinity = builder.disableSessionAffinity;
        this.diskSize = builder.diskSize;
        this.edition = builder.edition;
        this.enableSessionIsolation = builder.enableSessionIsolation;
        this.environmentVariables = builder.environmentVariables;
        this.executionRoleArn = builder.executionRoleArn;
        this.externalAgentEndpointUrl = builder.externalAgentEndpointUrl;
        this.forceEvictInstances = builder.forceEvictInstances;
        this.headerFieldName = builder.headerFieldName;
        this.healthCheckConfiguration = builder.healthCheckConfiguration;
        this.logConfiguration = builder.logConfiguration;
        this.memory = builder.memory;
        this.nasConfig = builder.nasConfig;
        this.networkConfiguration = builder.networkConfiguration;
        this.ossMountConfig = builder.ossMountConfig;
        this.port = builder.port;
        this.protocolConfiguration = builder.protocolConfiguration;
        this.sessionAffinityType = builder.sessionAffinityType;
        this.sessionConcurrencyLimitPerInstance = builder.sessionConcurrencyLimitPerInstance;
        this.sessionIdleTimeoutSeconds = builder.sessionIdleTimeoutSeconds;
        this.systemTags = builder.systemTags;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentRuntimeInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeName
     */
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    /**
     * @return armsConfiguration
     */
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return codeConfiguration
     */
    public CodeConfiguration getCodeConfiguration() {
        return this.codeConfiguration;
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
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableOndemand
     */
    public Boolean getDisableOndemand() {
        return this.disableOndemand;
    }

    /**
     * @return disableSessionAffinity
     */
    public Boolean getDisableSessionAffinity() {
        return this.disableSessionAffinity;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return enableSessionIsolation
     */
    public Boolean getEnableSessionIsolation() {
        return this.enableSessionIsolation;
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
     * @return externalAgentEndpointUrl
     */
    public String getExternalAgentEndpointUrl() {
        return this.externalAgentEndpointUrl;
    }

    /**
     * @return forceEvictInstances
     */
    public Boolean getForceEvictInstances() {
        return this.forceEvictInstances;
    }

    /**
     * @return headerFieldName
     */
    public String getHeaderFieldName() {
        return this.headerFieldName;
    }

    /**
     * @return healthCheckConfiguration
     */
    public HealthCheckConfiguration getHealthCheckConfiguration() {
        return this.healthCheckConfiguration;
    }

    /**
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
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
     * @return ossMountConfig
     */
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return protocolConfiguration
     */
    public ProtocolConfiguration getProtocolConfiguration() {
        return this.protocolConfiguration;
    }

    /**
     * @return sessionAffinityType
     */
    public String getSessionAffinityType() {
        return this.sessionAffinityType;
    }

    /**
     * @return sessionConcurrencyLimitPerInstance
     */
    public Integer getSessionConcurrencyLimitPerInstance() {
        return this.sessionConcurrencyLimitPerInstance;
    }

    /**
     * @return sessionIdleTimeoutSeconds
     */
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    /**
     * @return systemTags
     */
    public java.util.List<String> getSystemTags() {
        return this.systemTags;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String agentRuntimeName; 
        private ArmsConfiguration armsConfiguration; 
        private String artifactType; 
        private CodeConfiguration codeConfiguration; 
        private ContainerConfiguration containerConfiguration; 
        private Float cpu; 
        private String credentialName; 
        private String description; 
        private Boolean disableOndemand; 
        private Boolean disableSessionAffinity; 
        private Integer diskSize; 
        private String edition; 
        private Boolean enableSessionIsolation; 
        private java.util.Map<String, String> environmentVariables; 
        private String executionRoleArn; 
        private String externalAgentEndpointUrl; 
        private Boolean forceEvictInstances; 
        private String headerFieldName; 
        private HealthCheckConfiguration healthCheckConfiguration; 
        private LogConfiguration logConfiguration; 
        private Integer memory; 
        private NASConfig nasConfig; 
        private NetworkConfiguration networkConfiguration; 
        private OSSMountConfig ossMountConfig; 
        private Integer port; 
        private ProtocolConfiguration protocolConfiguration; 
        private String sessionAffinityType; 
        private Integer sessionConcurrencyLimitPerInstance; 
        private Integer sessionIdleTimeoutSeconds; 
        private java.util.List<String> systemTags; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(UpdateAgentRuntimeInput model) {
            this.agentRuntimeName = model.agentRuntimeName;
            this.armsConfiguration = model.armsConfiguration;
            this.artifactType = model.artifactType;
            this.codeConfiguration = model.codeConfiguration;
            this.containerConfiguration = model.containerConfiguration;
            this.cpu = model.cpu;
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.disableOndemand = model.disableOndemand;
            this.disableSessionAffinity = model.disableSessionAffinity;
            this.diskSize = model.diskSize;
            this.edition = model.edition;
            this.enableSessionIsolation = model.enableSessionIsolation;
            this.environmentVariables = model.environmentVariables;
            this.executionRoleArn = model.executionRoleArn;
            this.externalAgentEndpointUrl = model.externalAgentEndpointUrl;
            this.forceEvictInstances = model.forceEvictInstances;
            this.headerFieldName = model.headerFieldName;
            this.healthCheckConfiguration = model.healthCheckConfiguration;
            this.logConfiguration = model.logConfiguration;
            this.memory = model.memory;
            this.nasConfig = model.nasConfig;
            this.networkConfiguration = model.networkConfiguration;
            this.ossMountConfig = model.ossMountConfig;
            this.port = model.port;
            this.protocolConfiguration = model.protocolConfiguration;
            this.sessionAffinityType = model.sessionAffinityType;
            this.sessionConcurrencyLimitPerInstance = model.sessionConcurrencyLimitPerInstance;
            this.sessionIdleTimeoutSeconds = model.sessionIdleTimeoutSeconds;
            this.systemTags = model.systemTags;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * agentRuntimeName.
         */
        public Builder agentRuntimeName(String agentRuntimeName) {
            this.agentRuntimeName = agentRuntimeName;
            return this;
        }

        /**
         * <p>应用实时监控服务（ARMS）的配置信息</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder armsConfiguration(ArmsConfiguration armsConfiguration) {
            this.armsConfiguration = armsConfiguration;
            return this;
        }

        /**
         * artifactType.
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>当artifactType为Code时的代码配置信息，包括代码源、入口文件等</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder codeConfiguration(CodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }

        /**
         * <p>当artifactType为Container时的容器配置信息，包括镜像地址、启动命令等</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>用于访问智能体的凭证名称，访问智能体运行时将使用此凭证进行身份验证</p>
         * 
         * <strong>example:</strong>
         * <p>my-credential</p>
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
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
         * <p>是否禁用按需弹性能力。默认为 false，设置为 true 时关闭按需弹性</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableOndemand(Boolean disableOndemand) {
            this.disableOndemand = disableOndemand;
            return this;
        }

        /**
         * <p>是否禁用会话亲和性。默认为 false（即默认启用会话亲和），设置为 true 时关闭会话亲和</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableSessionAffinity(Boolean disableSessionAffinity) {
            this.disableSessionAffinity = disableSessionAffinity;
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
         * edition.
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * <p>是否启用会话隔离，启用后每个会话将在独立的环境中运行</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSessionIsolation(Boolean enableSessionIsolation) {
            this.enableSessionIsolation = enableSessionIsolation;
            return this;
        }

        /**
         * <p>智能体运行时的环境变量配置，用于在运行时传递配置参数</p>
         * 
         * <strong>example:</strong>
         * <p>ENV_VAR1=value1,ENV_VAR2=value2</p>
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>为智能体运行时提供访问云服务权限的执行角色ARN</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012:role/AgentRunExecutionRole</p>
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * <p>外部注册类型的智能体访问端点地址，用于连接已部署在外部的智能体服务</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://external-agent.example.com/api">https://external-agent.example.com/api</a></p>
         */
        public Builder externalAgentEndpointUrl(String externalAgentEndpointUrl) {
            this.externalAgentEndpointUrl = externalAgentEndpointUrl;
            return this;
        }

        /**
         * <p>更新运行时配置后是否尽力驱逐当前活跃 FC 会话，使新配置尽快生效</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceEvictInstances(Boolean forceEvictInstances) {
            this.forceEvictInstances = forceEvictInstances;
            return this;
        }

        /**
         * <p>当 sessionAffinityType 为 HEADER_FIELD 时用于会话亲和的请求头名称</p>
         * 
         * <strong>example:</strong>
         * <p>x-agentrun-session-id</p>
         */
        public Builder headerFieldName(String headerFieldName) {
            this.headerFieldName = headerFieldName;
            return this;
        }

        /**
         * <p>智能体运行时的健康检查配置，用于监控运行时实例的健康状态</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder healthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
            this.healthCheckConfiguration = healthCheckConfiguration;
            return this;
        }

        /**
         * <p>SLS（简单日志服务）配置</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>文件存储NAS的配置信息，用于挂载NAS文件系统到智能体运行时</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * <p>智能体运行时的网络配置，包括VPC、安全组等网络访问设置</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * <p>对象存储OSS的挂载配置信息，用于挂载OSS存储桶到智能体运行时</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>智能体运行时的通信协议配置，定义运行时如何与外部系统交互</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder protocolConfiguration(ProtocolConfiguration protocolConfiguration) {
            this.protocolConfiguration = protocolConfiguration;
            return this;
        }

        /**
         * <p>会话亲和模式。NONE 表示关闭会话亲和；HEADER_FIELD 表示基于请求头的会话亲和；GENERATED_COOKIE 表示由 FC 生成 Cookie 进行会话亲和；COOKIE 为兼容别名，服务端会归一为 GENERATED_COOKIE</p>
         * 
         * <strong>example:</strong>
         * <p>GENERATED_COOKIE</p>
         */
        public Builder sessionAffinityType(String sessionAffinityType) {
            this.sessionAffinityType = sessionAffinityType;
            return this;
        }

        /**
         * <p>每个运行时实例允许的最大并发会话数</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder sessionConcurrencyLimitPerInstance(Integer sessionConcurrencyLimitPerInstance) {
            this.sessionConcurrencyLimitPerInstance = sessionConcurrencyLimitPerInstance;
            return this;
        }

        /**
         * <p>会话的空闲超时时间，单位为秒。实例没有会话请求后处于空闲状态，空闲态为闲置计费模式，超过此超时时间后会话自动过期，不可继续使用</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder sessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }

        /**
         * <p>智能体运行时的系统标签信息，用于系统级别的资源分类和管理</p>
         * 
         * <strong>example:</strong>
         * <p>system-tag-1,system-tag-2</p>
         */
        public Builder systemTags(java.util.List<String> systemTags) {
            this.systemTags = systemTags;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public UpdateAgentRuntimeInput build() {
            return new UpdateAgentRuntimeInput(this);
        } 

    } 

}
