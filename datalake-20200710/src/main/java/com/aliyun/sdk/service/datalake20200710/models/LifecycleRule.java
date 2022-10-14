// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LifecycleRule} extends {@link TeaModel}
 *
 * <p>LifecycleRule</p>
 */
public class LifecycleRule extends TeaModel {
    @NameInMap("ArchiveDays")
    private Integer archiveDays;

    @NameInMap("BindCount")
    private Integer bindCount;

    @NameInMap("BizId")
    private String bizId;

    @NameInMap("ColdArchiveDays")
    private Integer coldArchiveDays;

    @NameInMap("Config")
    private String config;

    @NameInMap("Description")
    private String description;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("IaDays")
    private Integer iaDays;

    @NameInMap("Name")
    private String name;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("RuleType")
    private String ruleType;

    @NameInMap("ScheduleStatus")
    private String scheduleStatus;

    @NameInMap("Workflow")
    private Workflow workflow;

    @NameInMap("WorkflowId")
    private String workflowId;

    @NameInMap("WorkflowInstance")
    private WorkflowInstance workflowInstance;

    private LifecycleRule(Builder builder) {
        this.archiveDays = builder.archiveDays;
        this.bindCount = builder.bindCount;
        this.bizId = builder.bizId;
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
         * archiveDays
         */
        public Builder archiveDays(Integer archiveDays) {
            this.archiveDays = archiveDays;
            return this;
        }

        /**
         * bindCount
         */
        public Builder bindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }

        /**
         * bizId
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * coldArchiveDays
         */
        public Builder coldArchiveDays(Integer coldArchiveDays) {
            this.coldArchiveDays = coldArchiveDays;
            return this;
        }

        /**
         * Config
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * description
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * 修改时间
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * iaDays
         */
        public Builder iaDays(Integer iaDays) {
            this.iaDays = iaDays;
            return this;
        }

        /**
         * name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * resourceType
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ruleType
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * scheduleStatus
         */
        public Builder scheduleStatus(String scheduleStatus) {
            this.scheduleStatus = scheduleStatus;
            return this;
        }

        /**
         * 工作流
         */
        public Builder workflow(Workflow workflow) {
            this.workflow = workflow;
            return this;
        }

        /**
         * 工作流id
         */
        public Builder workflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        /**
         * 工作流实例
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
