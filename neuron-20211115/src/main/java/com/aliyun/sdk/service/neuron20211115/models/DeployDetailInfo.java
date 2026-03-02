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
 * {@link DeployDetailInfo} extends {@link TeaModel}
 *
 * <p>DeployDetailInfo</p>
 */
public class DeployDetailInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("accountName")
    private String accountName;

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
    private String edasId;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
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

    @com.aliyun.core.annotation.NameInMap("isMonitorEnable")
    private Integer isMonitorEnable;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("orgType")
    private String orgType;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("pipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.NameInMap("pipelineInfos")
    private java.util.List<DeployPipelineInfo> pipelineInfos;

    @com.aliyun.core.annotation.NameInMap("pipelineRunId")
    private String pipelineRunId;

    @com.aliyun.core.annotation.NameInMap("repositoryId")
    private String repositoryId;

    @com.aliyun.core.annotation.NameInMap("rollbackStatus")
    private String rollbackStatus;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("times")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer times;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DeployDetailInfo(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
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
        this.isMonitorEnable = builder.isMonitorEnable;
        this.memory = builder.memory;
        this.message = builder.message;
        this.orgType = builder.orgType;
        this.pbcId = builder.pbcId;
        this.pbcName = builder.pbcName;
        this.pipelineId = builder.pipelineId;
        this.pipelineInfos = builder.pipelineInfos;
        this.pipelineRunId = builder.pipelineRunId;
        this.repositoryId = builder.repositoryId;
        this.rollbackStatus = builder.rollbackStatus;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
        this.times = builder.times;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployDetailInfo create() {
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
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
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
     * @return isMonitorEnable
     */
    public Integer getIsMonitorEnable() {
        return this.isMonitorEnable;
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
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return pipelineInfos
     */
    public java.util.List<DeployPipelineInfo> getPipelineInfos() {
        return this.pipelineInfos;
    }

    /**
     * @return pipelineRunId
     */
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * @return repositoryId
     */
    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return rollbackStatus
     */
    public String getRollbackStatus() {
        return this.rollbackStatus;
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
        private String accountName; 
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
        private Integer isMonitorEnable; 
        private Integer memory; 
        private String message; 
        private String orgType; 
        private Long pbcId; 
        private String pbcName; 
        private String pipelineId; 
        private java.util.List<DeployPipelineInfo> pipelineInfos; 
        private String pipelineRunId; 
        private String repositoryId; 
        private String rollbackStatus; 
        private Long serviceId; 
        private String serviceName; 
        private String status; 
        private Integer times; 
        private String type; 

        private Builder() {
        } 

        private Builder(DeployDetailInfo model) {
            this.accountId = model.accountId;
            this.accountName = model.accountName;
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
            this.isMonitorEnable = model.isMonitorEnable;
            this.memory = model.memory;
            this.message = model.message;
            this.orgType = model.orgType;
            this.pbcId = model.pbcId;
            this.pbcName = model.pbcName;
            this.pipelineId = model.pipelineId;
            this.pipelineInfos = model.pipelineInfos;
            this.pipelineRunId = model.pipelineRunId;
            this.repositoryId = model.repositoryId;
            this.rollbackStatus = model.rollbackStatus;
            this.serviceId = model.serviceId;
            this.serviceName = model.serviceName;
            this.status = model.status;
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
         * accountName.
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
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
         * edasId.
         */
        public Builder edasId(String edasId) {
            this.edasId = edasId;
            return this;
        }

        /**
         * enterpriseId.
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
         * id.
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
         * isMonitorEnable.
         */
        public Builder isMonitorEnable(Integer isMonitorEnable) {
            this.isMonitorEnable = isMonitorEnable;
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
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * pbcName.
         */
        public Builder pbcName(String pbcName) {
            this.pbcName = pbcName;
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
         * pipelineInfos.
         */
        public Builder pipelineInfos(java.util.List<DeployPipelineInfo> pipelineInfos) {
            this.pipelineInfos = pipelineInfos;
            return this;
        }

        /**
         * pipelineRunId.
         */
        public Builder pipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
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
         * rollbackStatus.
         */
        public Builder rollbackStatus(String rollbackStatus) {
            this.rollbackStatus = rollbackStatus;
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
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * <p>SERVICE</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DeployDetailInfo build() {
            return new DeployDetailInfo(this);
        } 

    } 

}
