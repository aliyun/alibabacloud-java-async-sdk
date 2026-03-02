// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link DeploymentRevertCmd} extends {@link TeaModel}
 *
 * <p>DeploymentRevertCmd</p>
 */
public class DeploymentRevertCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deploymentId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("instanceCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("isMonitorEnable")
    private Integer isMonitorEnable;

    @com.aliyun.core.annotation.NameInMap("isServiceGroupEnable")
    private Integer isServiceGroupEnable;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("times")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer times;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DeploymentRevertCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.cpu = builder.cpu;
        this.deploymentId = builder.deploymentId;
        this.description = builder.description;
        this.instanceCount = builder.instanceCount;
        this.isMonitorEnable = builder.isMonitorEnable;
        this.isServiceGroupEnable = builder.isServiceGroupEnable;
        this.memory = builder.memory;
        this.timeout = builder.timeout;
        this.times = builder.times;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploymentRevertCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return deploymentId
     */
    public Long getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return isMonitorEnable
     */
    public Integer getIsMonitorEnable() {
        return this.isMonitorEnable;
    }

    /**
     * @return isServiceGroupEnable
     */
    public Integer getIsServiceGroupEnable() {
        return this.isServiceGroupEnable;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return times
     */
    public Integer getTimes() {
        return this.times;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String accountId; 
        private Integer cpu; 
        private Long deploymentId; 
        private String description; 
        private Integer instanceCount; 
        private Integer isMonitorEnable; 
        private Integer isServiceGroupEnable; 
        private Integer memory; 
        private Integer timeout; 
        private Integer times; 
        private String type; 

        private Builder() {
        } 

        private Builder(DeploymentRevertCmd model) {
            this.accountId = model.accountId;
            this.cpu = model.cpu;
            this.deploymentId = model.deploymentId;
            this.description = model.description;
            this.instanceCount = model.instanceCount;
            this.isMonitorEnable = model.isMonitorEnable;
            this.isServiceGroupEnable = model.isServiceGroupEnable;
            this.memory = model.memory;
            this.timeout = model.timeout;
            this.times = model.times;
            this.type = model.type;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deploymentId(Long deploymentId) {
            this.deploymentId = deploymentId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * isMonitorEnable.
         */
        public Builder isMonitorEnable(Integer isMonitorEnable) {
            this.isMonitorEnable = isMonitorEnable;
            return this;
        }

        /**
         * isServiceGroupEnable.
         */
        public Builder isServiceGroupEnable(Integer isServiceGroupEnable) {
            this.isServiceGroupEnable = isServiceGroupEnable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder times(Integer times) {
            this.times = times;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DeploymentRevertCmd build() {
            return new DeploymentRevertCmd(this);
        } 

    } 

}
