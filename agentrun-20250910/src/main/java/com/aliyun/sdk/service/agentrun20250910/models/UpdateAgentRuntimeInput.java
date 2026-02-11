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

    @com.aliyun.core.annotation.NameInMap("environmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("externalAgentEndpointUrl")
    private String externalAgentEndpointUrl;

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

    @com.aliyun.core.annotation.NameInMap("sessionConcurrencyLimitPerInstance")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer sessionConcurrencyLimitPerInstance;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutSeconds")
    private Integer sessionIdleTimeoutSeconds;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private UpdateAgentRuntimeInput(Builder builder) {
        this.agentRuntimeName = builder.agentRuntimeName;
        this.artifactType = builder.artifactType;
        this.codeConfiguration = builder.codeConfiguration;
        this.containerConfiguration = builder.containerConfiguration;
        this.cpu = builder.cpu;
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.environmentVariables = builder.environmentVariables;
        this.executionRoleArn = builder.executionRoleArn;
        this.externalAgentEndpointUrl = builder.externalAgentEndpointUrl;
        this.healthCheckConfiguration = builder.healthCheckConfiguration;
        this.logConfiguration = builder.logConfiguration;
        this.memory = builder.memory;
        this.nasConfig = builder.nasConfig;
        this.networkConfiguration = builder.networkConfiguration;
        this.ossMountConfig = builder.ossMountConfig;
        this.port = builder.port;
        this.protocolConfiguration = builder.protocolConfiguration;
        this.sessionConcurrencyLimitPerInstance = builder.sessionConcurrencyLimitPerInstance;
        this.sessionIdleTimeoutSeconds = builder.sessionIdleTimeoutSeconds;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String agentRuntimeName; 
        private String artifactType; 
        private CodeConfiguration codeConfiguration; 
        private ContainerConfiguration containerConfiguration; 
        private Float cpu; 
        private String credentialName; 
        private String description; 
        private java.util.Map<String, String> environmentVariables; 
        private String executionRoleArn; 
        private String externalAgentEndpointUrl; 
        private HealthCheckConfiguration healthCheckConfiguration; 
        private LogConfiguration logConfiguration; 
        private Integer memory; 
        private NASConfig nasConfig; 
        private NetworkConfiguration networkConfiguration; 
        private OSSMountConfig ossMountConfig; 
        private Integer port; 
        private ProtocolConfiguration protocolConfiguration; 
        private Integer sessionConcurrencyLimitPerInstance; 
        private Integer sessionIdleTimeoutSeconds; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(UpdateAgentRuntimeInput model) {
            this.agentRuntimeName = model.agentRuntimeName;
            this.artifactType = model.artifactType;
            this.codeConfiguration = model.codeConfiguration;
            this.containerConfiguration = model.containerConfiguration;
            this.cpu = model.cpu;
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.environmentVariables = model.environmentVariables;
            this.executionRoleArn = model.executionRoleArn;
            this.externalAgentEndpointUrl = model.externalAgentEndpointUrl;
            this.healthCheckConfiguration = model.healthCheckConfiguration;
            this.logConfiguration = model.logConfiguration;
            this.memory = model.memory;
            this.nasConfig = model.nasConfig;
            this.networkConfiguration = model.networkConfiguration;
            this.ossMountConfig = model.ossMountConfig;
            this.port = model.port;
            this.protocolConfiguration = model.protocolConfiguration;
            this.sessionConcurrencyLimitPerInstance = model.sessionConcurrencyLimitPerInstance;
            this.sessionIdleTimeoutSeconds = model.sessionIdleTimeoutSeconds;
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
         * <p>acs:ram::1760720386195983:role/AgentRunExecutionRole</p>
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
