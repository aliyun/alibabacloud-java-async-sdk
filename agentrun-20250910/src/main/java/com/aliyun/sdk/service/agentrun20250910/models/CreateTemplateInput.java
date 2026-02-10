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
 * {@link CreateTemplateInput} extends {@link TeaModel}
 *
 * <p>CreateTemplateInput</p>
 */
public class CreateTemplateInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowAnonymousManage")
    private Boolean allowAnonymousManage;

    @com.aliyun.core.annotation.NameInMap("armsConfiguration")
    private ArmsConfiguration armsConfiguration;

    @com.aliyun.core.annotation.NameInMap("containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float cpu;

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

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    @com.aliyun.core.annotation.Validation(required = true)
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("ossConfiguration")
    private java.util.List<OssConfiguration> ossConfiguration;

    @com.aliyun.core.annotation.NameInMap("sandboxIdleTimeoutInSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 21600, minimum = 1)
    private Integer sandboxIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sandboxTTLInSeconds")
    @Deprecated
    @com.aliyun.core.annotation.Validation(maximum = 21600, minimum = 1)
    private Integer sandboxTTLInSeconds;

    @com.aliyun.core.annotation.NameInMap("templateConfiguration")
    private java.util.Map<String, ?> templateConfiguration;

    @com.aliyun.core.annotation.NameInMap("templateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("templateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    private CreateTemplateInput(Builder builder) {
        this.allowAnonymousManage = builder.allowAnonymousManage;
        this.armsConfiguration = builder.armsConfiguration;
        this.containerConfiguration = builder.containerConfiguration;
        this.cpu = builder.cpu;
        this.credentialConfiguration = builder.credentialConfiguration;
        this.description = builder.description;
        this.diskSize = builder.diskSize;
        this.enableAgent = builder.enableAgent;
        this.environmentVariables = builder.environmentVariables;
        this.executionRoleArn = builder.executionRoleArn;
        this.logConfiguration = builder.logConfiguration;
        this.memory = builder.memory;
        this.nasConfig = builder.nasConfig;
        this.networkConfiguration = builder.networkConfiguration;
        this.ossConfiguration = builder.ossConfiguration;
        this.sandboxIdleTimeoutInSeconds = builder.sandboxIdleTimeoutInSeconds;
        this.sandboxTTLInSeconds = builder.sandboxTTLInSeconds;
        this.templateConfiguration = builder.templateConfiguration;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateInput create() {
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
     * @return armsConfiguration
     */
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
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
     * @return ossConfiguration
     */
    public java.util.List<OssConfiguration> getOssConfiguration() {
        return this.ossConfiguration;
    }

    /**
     * @return sandboxIdleTimeoutInSeconds
     */
    public Integer getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    /**
     * @return sandboxTTLInSeconds
     */
    public Integer getSandboxTTLInSeconds() {
        return this.sandboxTTLInSeconds;
    }

    /**
     * @return templateConfiguration
     */
    public java.util.Map<String, ?> getTemplateConfiguration() {
        return this.templateConfiguration;
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

    public static final class Builder {
        private Boolean allowAnonymousManage; 
        private ArmsConfiguration armsConfiguration; 
        private ContainerConfiguration containerConfiguration; 
        private Float cpu; 
        private CredentialConfiguration credentialConfiguration; 
        private String description; 
        private Integer diskSize; 
        private Boolean enableAgent; 
        private java.util.Map<String, String> environmentVariables; 
        private String executionRoleArn; 
        private LogConfiguration logConfiguration; 
        private Integer memory; 
        private NASConfig nasConfig; 
        private NetworkConfiguration networkConfiguration; 
        private java.util.List<OssConfiguration> ossConfiguration; 
        private Integer sandboxIdleTimeoutInSeconds; 
        private Integer sandboxTTLInSeconds; 
        private java.util.Map<String, ?> templateConfiguration; 
        private String templateName; 
        private String templateType; 

        private Builder() {
        } 

        private Builder(CreateTemplateInput model) {
            this.allowAnonymousManage = model.allowAnonymousManage;
            this.armsConfiguration = model.armsConfiguration;
            this.containerConfiguration = model.containerConfiguration;
            this.cpu = model.cpu;
            this.credentialConfiguration = model.credentialConfiguration;
            this.description = model.description;
            this.diskSize = model.diskSize;
            this.enableAgent = model.enableAgent;
            this.environmentVariables = model.environmentVariables;
            this.executionRoleArn = model.executionRoleArn;
            this.logConfiguration = model.logConfiguration;
            this.memory = model.memory;
            this.nasConfig = model.nasConfig;
            this.networkConfiguration = model.networkConfiguration;
            this.ossConfiguration = model.ossConfiguration;
            this.sandboxIdleTimeoutInSeconds = model.sandboxIdleTimeoutInSeconds;
            this.sandboxTTLInSeconds = model.sandboxTTLInSeconds;
            this.templateConfiguration = model.templateConfiguration;
            this.templateName = model.templateName;
            this.templateType = model.templateType;
        } 

        /**
         * allowAnonymousManage.
         */
        public Builder allowAnonymousManage(Boolean allowAnonymousManage) {
            this.allowAnonymousManage = allowAnonymousManage;
            return this;
        }

        /**
         * armsConfiguration.
         */
        public Builder armsConfiguration(ArmsConfiguration armsConfiguration) {
            this.armsConfiguration = armsConfiguration;
            return this;
        }

        /**
         * <p>容器配置，只允许基于 Browser/Code Interpreter 基础镜像的 image</p>
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * <p>CPU资源配置（单位：核心）</p>
         * <p>This parameter is required.</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
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
         * logConfiguration.
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * <p>内存资源配置（单位：MB）</p>
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
         * <p>This parameter is required.</p>
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
         * <p>沙箱空闲超时时间（秒）</p>
         */
        public Builder sandboxIdleTimeoutInSeconds(Integer sandboxIdleTimeoutInSeconds) {
            this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
            return this;
        }

        /**
         * <p>沙箱存活时间（秒）</p>
         */
        public Builder sandboxTTLInSeconds(Integer sandboxTTLInSeconds) {
            this.sandboxTTLInSeconds = sandboxTTLInSeconds;
            return this;
        }

        /**
         * <p>模板配置（灵活的对象结构，根据 templateType 不同而不同）</p>
         */
        public Builder templateConfiguration(java.util.Map<String, ?> templateConfiguration) {
            this.templateConfiguration = templateConfiguration;
            return this;
        }

        /**
         * <p>模板名称（要求账号唯一的）</p>
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        public CreateTemplateInput build() {
            return new CreateTemplateInput(this);
        } 

    } 

}
