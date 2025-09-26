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
 * {@link CreateCodeInterpreterInput} extends {@link TeaModel}
 *
 * <p>CreateCodeInterpreterInput</p>
 */
public class CreateCodeInterpreterInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeInterpreterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeInterpreterName;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 16, minimum = 2)
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 16384, minimum = 128)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    @com.aliyun.core.annotation.Validation(required = true)
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutSeconds")
    private Integer sessionIdleTimeoutSeconds;

    private CreateCodeInterpreterInput(Builder builder) {
        this.codeInterpreterName = builder.codeInterpreterName;
        this.cpu = builder.cpu;
        this.credentialId = builder.credentialId;
        this.description = builder.description;
        this.executionRoleArn = builder.executionRoleArn;
        this.memory = builder.memory;
        this.networkConfiguration = builder.networkConfiguration;
        this.sessionIdleTimeoutSeconds = builder.sessionIdleTimeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCodeInterpreterInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeInterpreterName
     */
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionRoleArn
     */
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @return sessionIdleTimeoutSeconds
     */
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    public static final class Builder {
        private String codeInterpreterName; 
        private Float cpu; 
        private String credentialId; 
        private String description; 
        private String executionRoleArn; 
        private Integer memory; 
        private NetworkConfiguration networkConfiguration; 
        private Integer sessionIdleTimeoutSeconds; 

        private Builder() {
        } 

        private Builder(CreateCodeInterpreterInput model) {
            this.codeInterpreterName = model.codeInterpreterName;
            this.cpu = model.cpu;
            this.credentialId = model.credentialId;
            this.description = model.description;
            this.executionRoleArn = model.executionRoleArn;
            this.memory = model.memory;
            this.networkConfiguration = model.networkConfiguration;
            this.sessionIdleTimeoutSeconds = model.sessionIdleTimeoutSeconds;
        } 

        /**
         * <p>代码解释器的名称，用于标识和区分不同的代码解释器实例</p>
         * <p>This parameter is required.</p>
         */
        public Builder codeInterpreterName(String codeInterpreterName) {
            this.codeInterpreterName = codeInterpreterName;
            return this;
        }

        /**
         * <p>CPU资源配置（单位：核数）</p>
         * <p>This parameter is required.</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * credentialId.
         */
        public Builder credentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>代码解释器的描述信息，说明该解释器的用途和功能</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>此代码解释器的执行角色</p>
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
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
         * <p>代码解释器的网络配置，包括VPC、安全组等网络访问设置</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * <p>会话的空闲超时时间，单位为秒。实例没有会话请求后处于空闲状态，空闲态为闲置计费模式，超过此超时时间后会话自动过期，不可继续使用</p>
         */
        public Builder sessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }

        public CreateCodeInterpreterInput build() {
            return new CreateCodeInterpreterInput(this);
        } 

    } 

}
