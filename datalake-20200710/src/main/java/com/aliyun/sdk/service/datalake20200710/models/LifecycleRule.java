// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LifecycleRule} extends {@link TeaModel}
 *
 * <p>LifecycleRule</p>
 */
public class LifecycleRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArchiveDays")
    private Integer archiveDays;

    @com.aliyun.core.annotation.NameInMap("BindCount")
    private Integer bindCount;

    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("ColdArchiveDays")
    private Integer coldArchiveDays;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("IaDays")
    private Integer iaDays;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.NameInMap("ScheduleStatus")
    private String scheduleStatus;

    @com.aliyun.core.annotation.NameInMap("Workflow")
    private Workflow workflow;

    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    @com.aliyun.core.annotation.NameInMap("WorkflowInstance")
    private WorkflowInstance workflowInstance;

    private LifecycleRule(Builder builder) {
        this.archiveDays = builder.archiveDays;
        this.bindCount = builder.bindCount;
        this.bizId = builder.bizId;
        this.catalogId = builder.catalogId;
        this.coldArchiveDays = builder.coldArchiveDays;
        this.config = builder.config;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.iaDays = builder.iaDays;
        this.name = builder.name;
        this.resourceType = builder.resourceType;
        this.ruleType = builder.ruleType;
        this.scheduleStatus = builder.scheduleStatus;
        this.workflow = builder.workflow;
        this.workflowId = builder.workflowId;
        this.workflowInstance = builder.workflowInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LifecycleRule create() {
        return builder().build();
    }

    /**
     * @return archiveDays
     */
    public Integer getArchiveDays() {
        return this.archiveDays;
    }

    /**
     * @return bindCount
     */
    public Integer getBindCount() {
        return this.bindCount;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return coldArchiveDays
     */
    public Integer getColdArchiveDays() {
        return this.coldArchiveDays;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return iaDays
     */
    public Integer getIaDays() {
        return this.iaDays;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return scheduleStatus
     */
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

    /**
     * @return workflow
     */
    public Workflow getWorkflow() {
        return this.workflow;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workflowInstance
     */
    public WorkflowInstance getWorkflowInstance() {
        return this.workflowInstance;
    }

    public static final class Builder {
        private Integer archiveDays; 
        private Integer bindCount; 
        private String bizId; 
        private String catalogId; 
        private Integer coldArchiveDays; 
        private String config; 
        private String description; 
        private String gmtCreate; 
        private String gmtModified; 
        private Integer iaDays; 
        private String name; 
        private String resourceType; 
        private String ruleType; 
        private String scheduleStatus; 
        private Workflow workflow; 
        private String workflowId; 
        private WorkflowInstance workflowInstance; 

        /**
         * ArchiveDays.
         */
        public Builder archiveDays(Integer archiveDays) {
            this.archiveDays = archiveDays;
            return this;
        }

        /**
         * BindCount.
         */
        public Builder bindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * ColdArchiveDays.
         */
        public Builder coldArchiveDays(Integer coldArchiveDays) {
            this.coldArchiveDays = coldArchiveDays;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * IaDays.
         */
        public Builder iaDays(Integer iaDays) {
            this.iaDays = iaDays;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * ScheduleStatus.
         */
        public Builder scheduleStatus(String scheduleStatus) {
            this.scheduleStatus = scheduleStatus;
            return this;
        }

        /**
         * Workflow.
         */
        public Builder workflow(Workflow workflow) {
            this.workflow = workflow;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        /**
         * WorkflowInstance.
         */
        public Builder workflowInstance(WorkflowInstance workflowInstance) {
            this.workflowInstance = workflowInstance;
            return this;
        }

        public LifecycleRule build() {
            return new LifecycleRule(this);
        } 

    } 

}
