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
 * {@link DeploymentTriggerCmd} extends {@link TeaModel}
 *
 * <p>DeploymentTriggerCmd</p>
 */
public class DeploymentTriggerCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("applicationType")
    private String applicationType;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("imageTag")
    private String imageTag;

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

    @com.aliyun.core.annotation.NameInMap("preStop")
    private String preStop;

    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceGroupId;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("times")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer times;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DeploymentTriggerCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.applicationType = builder.applicationType;
        this.cpu = builder.cpu;
        this.description = builder.description;
        this.imageTag = builder.imageTag;
        this.instanceCount = builder.instanceCount;
        this.isMonitorEnable = builder.isMonitorEnable;
        this.isServiceGroupEnable = builder.isServiceGroupEnable;
        this.memory = builder.memory;
        this.preStop = builder.preStop;
        this.serviceGroupId = builder.serviceGroupId;
        this.timeout = builder.timeout;
        this.times = builder.times;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploymentTriggerCmd create() {
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
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
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
        private String applicationType; 
        private Integer cpu; 
        private String description; 
        private String imageTag; 
        private Integer instanceCount; 
        private Integer isMonitorEnable; 
        private Integer isServiceGroupEnable; 
        private Integer memory; 
        private String preStop; 
        private Long serviceGroupId; 
        private Integer timeout; 
        private Integer times; 
        private String type; 

        private Builder() {
        } 

        private Builder(DeploymentTriggerCmd model) {
            this.accountId = model.accountId;
            this.applicationType = model.applicationType;
            this.cpu = model.cpu;
            this.description = model.description;
            this.imageTag = model.imageTag;
            this.instanceCount = model.instanceCount;
            this.isMonitorEnable = model.isMonitorEnable;
            this.isServiceGroupEnable = model.isServiceGroupEnable;
            this.memory = model.memory;
            this.preStop = model.preStop;
            this.serviceGroupId = model.serviceGroupId;
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
         * applicationType.
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
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
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * imageTag.
         */
        public Builder imageTag(String imageTag) {
            this.imageTag = imageTag;
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
         * preStop.
         */
        public Builder preStop(String preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
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

        public DeploymentTriggerCmd build() {
            return new DeploymentTriggerCmd(this);
        } 

    } 

}
