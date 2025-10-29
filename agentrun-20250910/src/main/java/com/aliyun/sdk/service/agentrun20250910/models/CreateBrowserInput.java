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
 * {@link CreateBrowserInput} extends {@link TeaModel}
 *
 * <p>CreateBrowserInput</p>
 */
public class CreateBrowserInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("browserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String browserName;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 16384, minimum = 1024)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    @com.aliyun.core.annotation.Validation(required = true)
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutSeconds")
    private Integer sessionIdleTimeoutSeconds;

    private CreateBrowserInput(Builder builder) {
        this.browserName = builder.browserName;
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

    public static CreateBrowserInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserName
     */
    public String getBrowserName() {
        return this.browserName;
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
        private String browserName; 
        private Float cpu; 
        private String credentialId; 
        private String description; 
        private String executionRoleArn; 
        private Integer memory; 
        private NetworkConfiguration networkConfiguration; 
        private Integer sessionIdleTimeoutSeconds; 

        private Builder() {
        } 

        private Builder(CreateBrowserInput model) {
            this.browserName = model.browserName;
            this.cpu = model.cpu;
            this.credentialId = model.credentialId;
            this.description = model.description;
            this.executionRoleArn = model.executionRoleArn;
            this.memory = model.memory;
            this.networkConfiguration = model.networkConfiguration;
            this.sessionIdleTimeoutSeconds = model.sessionIdleTimeoutSeconds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-browser</p>
         */
        public Builder browserName(String browserName) {
            this.browserName = browserName;
            return this;
        }

        /**
         * <p>CPU资源配置（单位：核）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
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
         * description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * <p>内存资源配置（单位：MB）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
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
         * <p>会话的空闲超时时间，单位为秒。实例没有会话请求后处于空闲状态，空闲态为闲置计费模式，超过此超时时间后会话自动过期，不可继续使用</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder sessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }

        public CreateBrowserInput build() {
            return new CreateBrowserInput(this);
        } 

    } 

}
