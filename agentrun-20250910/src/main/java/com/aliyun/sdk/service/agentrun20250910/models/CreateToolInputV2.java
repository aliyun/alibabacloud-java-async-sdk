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
 * {@link CreateToolInputV2} extends {@link TeaModel}
 *
 * <p>CreateToolInputV2</p>
 */
public class CreateToolInputV2 extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactType")
    private String artifactType;

    @com.aliyun.core.annotation.NameInMap("codeConfiguration")
    private CodeConfiguration codeConfiguration;

    @com.aliyun.core.annotation.NameInMap("containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("createMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createMethod;

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

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("toolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toolName;

    @com.aliyun.core.annotation.NameInMap("toolType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toolType;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private CreateToolInputV2(Builder builder) {
        this.artifactType = builder.artifactType;
        this.codeConfiguration = builder.codeConfiguration;
        this.containerConfiguration = builder.containerConfiguration;
        this.cpu = builder.cpu;
        this.createMethod = builder.createMethod;
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
        this.timeout = builder.timeout;
        this.toolName = builder.toolName;
        this.toolType = builder.toolType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateToolInputV2 create() {
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
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
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
        private Integer timeout; 
        private String toolName; 
        private String toolType; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(CreateToolInputV2 model) {
            this.artifactType = model.artifactType;
            this.codeConfiguration = model.codeConfiguration;
            this.containerConfiguration = model.containerConfiguration;
            this.cpu = model.cpu;
            this.createMethod = model.createMethod;
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
            this.timeout = model.timeout;
            this.toolName = model.toolName;
            this.toolType = model.toolType;
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
         * <p>代码包类型工具的配置信息，包括代码位置、入口函数、运行时等，仅在制品类型为 Code 时需要提供</p>
         */
        public Builder codeConfiguration(CodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }

        /**
         * <p>容器类型工具的配置信息，包括镜像地址、启动命令、端口映射等，仅在制品类型为 Container 时需要提供</p>
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * <p>工具实例的 CPU 核心数，单位为核，支持小数，如 0.5 表示半核</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>工具的创建方式，必填项。支持：MCP_REMOTE（远程 MCP 服务器）、MCP_LOCAL_STDIO（本地 MCP 标准输入输出）、MCP_BUNDLE（MCP 打包部署）、CODE_PACKAGE（代码包部署）、OPENAPI_IMPORT（OpenAPI 导入）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_REMOTE</p>
         */
        public Builder createMethod(String createMethod) {
            this.createMethod = createMethod;
            return this;
        }

        /**
         * <p>工具使用的凭证名称，用于访问需要认证的外部服务，需要提前在系统中创建凭证</p>
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
         * <p>工具运行时的环境变量配置，键值对形式，用于传递配置信息到工具运行环境</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ENV&quot;: &quot;production&quot;, &quot;LOG_LEVEL&quot;: &quot;info&quot;}</p>
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>工具执行时使用的 RAM 角色 ARN，用于权限控制，格式如：acs:ram::123456789:role/AliyunFCDefaultRole</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789:role/AliyunFCDefaultRole</p>
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * <p>工具的日志配置，包括日志存储位置（SLS）、日志级别等</p>
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * <p>MCP 工具的配置信息，包括会话亲和性、代理配置、绑定配置等，仅在工具类型为 MCP 时需要提供</p>
         */
        public Builder mcpConfig(McpConfig mcpConfig) {
            this.mcpConfig = mcpConfig;
            return this;
        }

        /**
         * <p>工具实例的内存大小，单位为 MB，建议根据工具的实际需求配置</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>文件存储 NAS 的配置信息，用于工具访问 NAS 文件系统，实现持久化存储</p>
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * <p>工具的网络配置，包括 VPC、安全组、交换机等信息，用于配置工具的网络访问能力</p>
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * <p>对象存储 OSS 的挂载配置，用于工具访问 OSS 存储桶中的文件</p>
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * <p>工具服务监听的端口号，用于接收请求</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>工具使用的协议规范定义，JSON 格式的字符串，定义工具的接口和交互方式</p>
         */
        public Builder protocolSpec(String protocolSpec) {
            this.protocolSpec = protocolSpec;
            return this;
        }

        /**
         * <p>工具执行的超时时间，单位为秒，超过此时间工具调用将被终止</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>工具的名称，必填项，用于标识和引用工具，需要在工作空间内唯一</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-tool</p>
         */
        public Builder toolName(String toolName) {
            this.toolName = toolName;
            return this;
        }

        /**
         * <p>工具的类型，必填项。支持：MCP（Model Context Protocol 工具）、FUNCTIONCALL（函数调用工具）、SKILL（技能工具）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP</p>
         */
        public Builder toolType(String toolType) {
            this.toolType = toolType;
            return this;
        }

        /**
         * <p>工具所属的工作空间标识符，可选项，不填则使用默认工作空间</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-xyz789</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public CreateToolInputV2 build() {
            return new CreateToolInputV2(this);
        } 

    } 

}
