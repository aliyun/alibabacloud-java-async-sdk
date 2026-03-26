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
 * {@link Tool} extends {@link TeaModel}
 *
 * <p>Tool</p>
 */
public class Tool extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactType")
    private String artifactType;

    @com.aliyun.core.annotation.NameInMap("codeConfiguration")
    private CodeConfiguration codeConfiguration;

    @com.aliyun.core.annotation.NameInMap("containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("createMethod")
    private String createMethod;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("environmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("mcpConfig")
    private McpConfig mcpConfig;

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

    @com.aliyun.core.annotation.NameInMap("protocolSpec")
    private String protocolSpec;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("toolId")
    private String toolId;

    @com.aliyun.core.annotation.NameInMap("toolName")
    private String toolName;

    @com.aliyun.core.annotation.NameInMap("toolType")
    private String toolType;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private Tool(Builder builder) {
        this.artifactType = builder.artifactType;
        this.codeConfiguration = builder.codeConfiguration;
        this.containerConfiguration = builder.containerConfiguration;
        this.cpu = builder.cpu;
        this.createMethod = builder.createMethod;
        this.createdAt = builder.createdAt;
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.environmentVariables = builder.environmentVariables;
        this.executionRoleArn = builder.executionRoleArn;
        this.logConfiguration = builder.logConfiguration;
        this.mcpConfig = builder.mcpConfig;
        this.memory = builder.memory;
        this.nasConfig = builder.nasConfig;
        this.networkConfiguration = builder.networkConfiguration;
        this.ossMountConfig = builder.ossMountConfig;
        this.port = builder.port;
        this.protocolSpec = builder.protocolSpec;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.timeout = builder.timeout;
        this.toolId = builder.toolId;
        this.toolName = builder.toolName;
        this.toolType = builder.toolType;
        this.updatedAt = builder.updatedAt;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Tool create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return createMethod
     */
    public String getCreateMethod() {
        return this.createMethod;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * @return mcpConfig
     */
    public McpConfig getMcpConfig() {
        return this.mcpConfig;
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
     * @return protocolSpec
     */
    public String getProtocolSpec() {
        return this.protocolSpec;
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
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return toolId
     */
    public String getToolId() {
        return this.toolId;
    }

    /**
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    /**
     * @return toolType
     */
    public String getToolType() {
        return this.toolType;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String artifactType; 
        private CodeConfiguration codeConfiguration; 
        private ContainerConfiguration containerConfiguration; 
        private Float cpu; 
        private String createMethod; 
        private String createdAt; 
        private String credentialName; 
        private String description; 
        private java.util.Map<String, String> environmentVariables; 
        private String executionRoleArn; 
        private LogConfiguration logConfiguration; 
        private McpConfig mcpConfig; 
        private Integer memory; 
        private NASConfig nasConfig; 
        private NetworkConfiguration networkConfiguration; 
        private OSSMountConfig ossMountConfig; 
        private Integer port; 
        private String protocolSpec; 
        private String status; 
        private String statusReason; 
        private Integer timeout; 
        private String toolId; 
        private String toolName; 
        private String toolType; 
        private String updatedAt; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Tool model) {
            this.artifactType = model.artifactType;
            this.codeConfiguration = model.codeConfiguration;
            this.containerConfiguration = model.containerConfiguration;
            this.cpu = model.cpu;
            this.createMethod = model.createMethod;
            this.createdAt = model.createdAt;
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.environmentVariables = model.environmentVariables;
            this.executionRoleArn = model.executionRoleArn;
            this.logConfiguration = model.logConfiguration;
            this.mcpConfig = model.mcpConfig;
            this.memory = model.memory;
            this.nasConfig = model.nasConfig;
            this.networkConfiguration = model.networkConfiguration;
            this.ossMountConfig = model.ossMountConfig;
            this.port = model.port;
            this.protocolSpec = model.protocolSpec;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.timeout = model.timeout;
            this.toolId = model.toolId;
            this.toolName = model.toolName;
            this.toolType = model.toolType;
            this.updatedAt = model.updatedAt;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>工具部署的制品类型，支持：Code（代码包）、Container（容器镜像）</p>
         * 
         * <strong>example:</strong>
         * <p>Code</p>
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>代码包类型工具的配置信息，包括代码位置、入口函数等</p>
         */
        public Builder codeConfiguration(CodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }

        /**
         * <p>容器类型工具的配置信息，包括镜像地址、启动命令等</p>
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * <p>工具实例的 CPU 核心数，单位为核</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>工具的创建方式，支持：MCP_REMOTE（远程 MCP 服务器）、MCP_LOCAL_STDIO（本地 MCP 标准输入输出）、MCP_BUNDLE（MCP 打包部署）、CODE_PACKAGE（代码包部署）、OPENAPI_IMPORT（OpenAPI 导入）</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_REMOTE</p>
         */
        public Builder createMethod(String createMethod) {
            this.createMethod = createMethod;
            return this;
        }

        /**
         * <p>工具的创建时间，ISO 8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-10T10:00:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>工具使用的凭证名称，用于访问需要认证的外部服务</p>
         * 
         * <strong>example:</strong>
         * <p>my-credential</p>
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        /**
         * <p>工具的详细描述信息，说明工具的功能和用途</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个用于处理文档的 MCP 工具</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>工具运行时的环境变量配置，键值对形式</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ENV&quot;: &quot;production&quot;, &quot;LOG_LEVEL&quot;: &quot;info&quot;}</p>
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>工具执行时使用的 RAM 角色 ARN，用于权限控制</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789:role/AliyunFCDefaultRole</p>
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * <p>工具的日志配置，包括日志存储位置和日志级别等</p>
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * <p>MCP 工具的配置信息，包括会话亲和性、代理配置等</p>
         */
        public Builder mcpConfig(McpConfig mcpConfig) {
            this.mcpConfig = mcpConfig;
            return this;
        }

        /**
         * <p>工具实例的内存大小，单位为 MB</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>文件存储 NAS 的配置信息，用于工具访问 NAS 文件系统</p>
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * <p>工具的网络配置，包括 VPC、安全组等信息</p>
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * <p>对象存储 OSS 的挂载配置，用于工具访问 OSS 存储</p>
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * <p>工具服务监听的端口号</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>工具使用的协议规范定义，JSON 格式的字符串</p>
         */
        public Builder protocolSpec(String protocolSpec) {
            this.protocolSpec = protocolSpec;
            return this;
        }

        /**
         * <p>工具的当前运行状态，如：Running（运行中）、Stopped（已停止）、Failed（失败）等</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>工具状态的详细原因说明，特别是在失败或异常状态时提供错误信息</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>工具执行的超时时间，单位为秒</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>工具的唯一标识符，由系统自动生成</p>
         * 
         * <strong>example:</strong>
         * <p>tool-abc123</p>
         */
        public Builder toolId(String toolId) {
            this.toolId = toolId;
            return this;
        }

        /**
         * <p>工具的名称，用于标识和引用工具</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-tool</p>
         */
        public Builder toolName(String toolName) {
            this.toolName = toolName;
            return this;
        }

        /**
         * <p>工具的类型，支持：MCP（Model Context Protocol 工具）、FUNCTIONCALL（函数调用工具）、SKILL（技能工具）</p>
         * 
         * <strong>example:</strong>
         * <p>MCP</p>
         */
        public Builder toolType(String toolType) {
            this.toolType = toolType;
            return this;
        }

        /**
         * <p>工具的最后更新时间，ISO 8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-10T12:00:00Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>工具所属的工作空间标识符</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-xyz789</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Tool build() {
            return new Tool(this);
        } 

    } 

}
