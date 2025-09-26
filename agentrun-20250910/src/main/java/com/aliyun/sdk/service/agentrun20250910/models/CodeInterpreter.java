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
 * {@link CodeInterpreter} extends {@link TeaModel}
 *
 * <p>CodeInterpreter</p>
 */
public class CodeInterpreter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeInterpreterId")
    private String codeInterpreterId;

    @com.aliyun.core.annotation.NameInMap("codeInterpreterName")
    private String codeInterpreterName;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CodeInterpreter(Builder builder) {
        this.codeInterpreterId = builder.codeInterpreterId;
        this.codeInterpreterName = builder.codeInterpreterName;
        this.cpu = builder.cpu;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.executionRoleArn = builder.executionRoleArn;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.memory = builder.memory;
        this.networkConfiguration = builder.networkConfiguration;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CodeInterpreter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeInterpreterId
     */
    public String getCodeInterpreterId() {
        return this.codeInterpreterId;
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
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private String codeInterpreterId; 
        private String codeInterpreterName; 
        private Float cpu; 
        private String createdAt; 
        private String description; 
        private String executionRoleArn; 
        private String lastUpdatedAt; 
        private Integer memory; 
        private NetworkConfiguration networkConfiguration; 
        private String status; 
        private String statusReason; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(CodeInterpreter model) {
            this.codeInterpreterId = model.codeInterpreterId;
            this.codeInterpreterName = model.codeInterpreterName;
            this.cpu = model.cpu;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.executionRoleArn = model.executionRoleArn;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.memory = model.memory;
            this.networkConfiguration = model.networkConfiguration;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.tenantId = model.tenantId;
        } 

        /**
         * <p>代码解释器的唯一标识符</p>
         */
        public Builder codeInterpreterId(String codeInterpreterId) {
            this.codeInterpreterId = codeInterpreterId;
            return this;
        }

        /**
         * <p>代码解释器的名称，用于标识和区分不同的代码解释器实例</p>
         */
        public Builder codeInterpreterName(String codeInterpreterName) {
            this.codeInterpreterName = codeInterpreterName;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>代码解释器的创建时间，采用ISO 8601格式</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * <p>代码解释器的最后更新时间，采用ISO 8601格式</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>内存资源配置（单位：MB）</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>代码解释器的网络配置信息</p>
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * <p>代码解释器的当前状态，如READY（就绪）、TERMINATED（已终止）等</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>当前状态的原因说明（如适用）</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public CodeInterpreter build() {
            return new CodeInterpreter(this);
        } 

    } 

}
