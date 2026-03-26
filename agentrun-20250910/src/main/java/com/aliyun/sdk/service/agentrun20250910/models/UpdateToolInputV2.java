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
 * {@link UpdateToolInputV2} extends {@link TeaModel}
 *
 * <p>UpdateToolInputV2</p>
 */
public class UpdateToolInputV2 extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private UpdateToolInputV2(Builder builder) {
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
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateToolInputV2 create() {
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
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(UpdateToolInputV2 model) {
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
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>更新工具部署的制品类型，支持：Code（代码包）、Container（容器镜像）</p>
         * 
         * <strong>example:</strong>
         * <p>Code</p>
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>更新代码包类型工具的配置信息</p>
         */
        public Builder codeConfiguration(CodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }

        /**
         * <p>更新容器类型工具的配置信息</p>
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * <p>更新工具实例的 CPU 核心数，单位为核</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>更新工具的创建方式。支持：MCP_REMOTE、MCP_LOCAL_STDIO、MCP_BUNDLE、CODE_PACKAGE、OPENAPI_IMPORT</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_REMOTE</p>
         */
        public Builder createMethod(String createMethod) {
            this.createMethod = createMethod;
            return this;
        }

        /**
         * <p>更新工具使用的凭证名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-credential</p>
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        /**
         * <p>更新工具的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>更新后的工具描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>更新工具运行时的环境变量配置</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ENV&quot;: &quot;production&quot;}</p>
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>更新工具执行时使用的 RAM 角色 ARN</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789:role/AliyunFCDefaultRole</p>
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * <p>更新工具的日志配置</p>
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * <p>更新 MCP 工具的配置信息，包括会话亲和性、代理配置等</p>
         */
        public Builder mcpConfig(McpConfig mcpConfig) {
            this.mcpConfig = mcpConfig;
            return this;
        }

        /**
         * <p>更新工具实例的内存大小，单位为 MB</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>更新文件存储 NAS 的配置信息</p>
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * <p>更新工具的网络配置</p>
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * <p>更新对象存储 OSS 的挂载配置</p>
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * <p>更新工具服务监听的端口号</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>更新工具使用的协议规范定义</p>
         */
        public Builder protocolSpec(String protocolSpec) {
            this.protocolSpec = protocolSpec;
            return this;
        }

        /**
         * <p>更新工具执行的超时时间，单位为秒</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>更新工具所属的工作空间标识符</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-xyz789</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public UpdateToolInputV2 build() {
            return new UpdateToolInputV2(this);
        } 

    } 

}
