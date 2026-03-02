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
 * {@link DeployConfigInfo} extends {@link TeaModel}
 *
 * <p>DeployConfigInfo</p>
 */
public class DeployConfigInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private Long deploymentId;

    @com.aliyun.core.annotation.NameInMap("deploymentType")
    private String deploymentType;

    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.NameInMap("finish")
    private Boolean finish;

    @com.aliyun.core.annotation.NameInMap("instanceCount")
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("isMonitorEnable")
    private Integer isMonitorEnable;

    @com.aliyun.core.annotation.NameInMap("isServiceGroupEnable")
    private Integer isServiceGroupEnable;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("pipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.NameInMap("preStop")
    private String preStop;

    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("times")
    private Integer times;

    private DeployConfigInfo(Builder builder) {
        this.cpu = builder.cpu;
        this.deploymentId = builder.deploymentId;
        this.deploymentType = builder.deploymentType;
        this.env = builder.env;
        this.finish = builder.finish;
        this.instanceCount = builder.instanceCount;
        this.isMonitorEnable = builder.isMonitorEnable;
        this.isServiceGroupEnable = builder.isServiceGroupEnable;
        this.memory = builder.memory;
        this.pipelineId = builder.pipelineId;
        this.preStop = builder.preStop;
        this.serviceGroupId = builder.serviceGroupId;
        this.serviceId = builder.serviceId;
        this.timeout = builder.timeout;
        this.times = builder.times;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployConfigInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return deploymentType
     */
    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return finish
     */
    public Boolean getFinish() {
        return this.finish;
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
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return preStop
     */
    public String getPreStop() {
        return this.preStop;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
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

    public static final class Builder {
        private Integer cpu; 
        private Long deploymentId; 
        private String deploymentType; 
        private String env; 
        private Boolean finish; 
        private Integer instanceCount; 
        private Integer isMonitorEnable; 
        private Integer isServiceGroupEnable; 
        private Integer memory; 
        private String pipelineId; 
        private String preStop; 
        private Long serviceGroupId; 
        private Long serviceId; 
        private Integer timeout; 
        private Integer times; 

        private Builder() {
        } 

        private Builder(DeployConfigInfo model) {
            this.cpu = model.cpu;
            this.deploymentId = model.deploymentId;
            this.deploymentType = model.deploymentType;
            this.env = model.env;
            this.finish = model.finish;
            this.instanceCount = model.instanceCount;
            this.isMonitorEnable = model.isMonitorEnable;
            this.isServiceGroupEnable = model.isServiceGroupEnable;
            this.memory = model.memory;
            this.pipelineId = model.pipelineId;
            this.preStop = model.preStop;
            this.serviceGroupId = model.serviceGroupId;
            this.serviceId = model.serviceId;
            this.timeout = model.timeout;
            this.times = model.times;
        } 

        /**
         * cpu.
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * deploymentId.
         */
        public Builder deploymentId(Long deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * deploymentType.
         */
        public Builder deploymentType(String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST</p>
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * finish.
         */
        public Builder finish(Boolean finish) {
            this.finish = finish;
            return this;
        }

        /**
         * instanceCount.
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
         * memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * preStop.
         */
        public Builder preStop(String preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceId(Long serviceId) {
            this.serviceId = serviceId;
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
         * times.
         */
        public Builder times(Integer times) {
            this.times = times;
            return this;
        }

        public DeployConfigInfo build() {
            return new DeployConfigInfo(this);
        } 

    } 

}
