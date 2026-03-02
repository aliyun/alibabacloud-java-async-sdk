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
 * {@link PdpServiceDeployment} extends {@link TeaModel}
 *
 * <p>PdpServiceDeployment</p>
 */
public class PdpServiceDeployment extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("applicationType")
    private String applicationType;

    @com.aliyun.core.annotation.NameInMap("changeOrderId")
    private String changeOrderId;

    @com.aliyun.core.annotation.NameInMap("context")
    private String context;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("deploymentType")
    private String deploymentType;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("edasId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String edasId;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("imageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("imageTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageTag;

    @com.aliyun.core.annotation.NameInMap("instanceCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("isServiceGroupEnable")
    private Integer isServiceGroupEnable;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("orgType")
    private String orgType;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("pipelineTimes")
    private Integer pipelineTimes;

    @com.aliyun.core.annotation.NameInMap("repositoryId")
    private String repositoryId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("rollbackStatus")
    private String rollbackStatus;

    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("times")
    private Integer times;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private PdpServiceDeployment(Builder builder) {
        this.accountId = builder.accountId;
        this.applicationType = builder.applicationType;
        this.changeOrderId = builder.changeOrderId;
        this.context = builder.context;
        this.cpu = builder.cpu;
        this.deploymentType = builder.deploymentType;
        this.description = builder.description;
        this.edasId = builder.edasId;
        this.enterpriseId = builder.enterpriseId;
        this.env = builder.env;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.imageId = builder.imageId;
        this.imageTag = builder.imageTag;
        this.instanceCount = builder.instanceCount;
        this.isServiceGroupEnable = builder.isServiceGroupEnable;
        this.memory = builder.memory;
        this.message = builder.message;
        this.orgType = builder.orgType;
        this.pbcId = builder.pbcId;
        this.pbcName = builder.pbcName;
        this.pipelineTimes = builder.pipelineTimes;
        this.repositoryId = builder.repositoryId;
        this.requestId = builder.requestId;
        this.rollbackStatus = builder.rollbackStatus;
        this.serviceGroupId = builder.serviceGroupId;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
        this.timeout = builder.timeout;
        this.times = builder.times;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpServiceDeployment create() {
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
     * @return changeOrderId
     */
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return deploymentType
     */
    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return edasId
     */
    public String getEdasId() {
        return this.edasId;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return orgType
     */
    public String getOrgType() {
        return this.orgType;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return pipelineTimes
     */
    public Integer getPipelineTimes() {
        return this.pipelineTimes;
    }

    /**
     * @return repositoryId
     */
    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rollbackStatus
     */
    public String getRollbackStatus() {
        return this.rollbackStatus;
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String changeOrderId; 
        private String context; 
        private Integer cpu; 
        private String deploymentType; 
        private String description; 
        private String edasId; 
        private Long enterpriseId; 
        private String env; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String imageId; 
        private String imageTag; 
        private Integer instanceCount; 
        private Integer isServiceGroupEnable; 
        private Integer memory; 
        private String message; 
        private String orgType; 
        private Long pbcId; 
        private String pbcName; 
        private Integer pipelineTimes; 
        private String repositoryId; 
        private String requestId; 
        private String rollbackStatus; 
        private Long serviceGroupId; 
        private Long serviceId; 
        private String serviceName; 
        private String status; 
        private Integer timeout; 
        private Integer times; 
        private String type; 

        private Builder() {
        } 

        private Builder(PdpServiceDeployment model) {
            this.accountId = model.accountId;
            this.applicationType = model.applicationType;
            this.changeOrderId = model.changeOrderId;
            this.context = model.context;
            this.cpu = model.cpu;
            this.deploymentType = model.deploymentType;
            this.description = model.description;
            this.edasId = model.edasId;
            this.enterpriseId = model.enterpriseId;
            this.env = model.env;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.imageId = model.imageId;
            this.imageTag = model.imageTag;
            this.instanceCount = model.instanceCount;
            this.isServiceGroupEnable = model.isServiceGroupEnable;
            this.memory = model.memory;
            this.message = model.message;
            this.orgType = model.orgType;
            this.pbcId = model.pbcId;
            this.pbcName = model.pbcName;
            this.pipelineTimes = model.pipelineTimes;
            this.repositoryId = model.repositoryId;
            this.requestId = model.requestId;
            this.rollbackStatus = model.rollbackStatus;
            this.serviceGroupId = model.serviceGroupId;
            this.serviceId = model.serviceId;
            this.serviceName = model.serviceName;
            this.status = model.status;
            this.timeout = model.timeout;
            this.times = model.times;
            this.type = model.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121321412341</p>
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
         * changeOrderId.
         */
        public Builder changeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * context.
         */
        public Builder context(String context) {
            this.context = context;
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
         * deploymentType.
         */
        public Builder deploymentType(String deploymentType) {
            this.deploymentType = deploymentType;
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
         * <p>sdad</p>
         */
        public Builder edasId(String edasId) {
            this.edasId = edasId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
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
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-v12wpq</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20220421100717_prepub</p>
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * orgType.
         */
        public Builder orgType(String orgType) {
            this.orgType = orgType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>management</p>
         */
        public Builder pbcName(String pbcName) {
            this.pbcName = pbcName;
            return this;
        }

        /**
         * pipelineTimes.
         */
        public Builder pipelineTimes(Integer pipelineTimes) {
            this.pipelineTimes = pipelineTimes;
            return this;
        }

        /**
         * repositoryId.
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * rollbackStatus.
         */
        public Builder rollbackStatus(String rollbackStatus) {
            this.rollbackStatus = rollbackStatus;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>employee</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOYMENT_PENDING</p>
         */
        public Builder status(String status) {
            this.status = status;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SERVICE</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PdpServiceDeployment build() {
            return new PdpServiceDeployment(this);
        } 

    } 

}
