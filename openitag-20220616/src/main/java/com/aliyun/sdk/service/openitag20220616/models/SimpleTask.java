// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimpleTask} extends {@link TeaModel}
 *
 * <p>SimpleTask</p>
 */
public class SimpleTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Archived")
    private Boolean archived;

    @com.aliyun.core.annotation.NameInMap("ArchivedInfos")
    private String archivedInfos;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private SimpleUser creator;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("LabelStyle")
    private String labelStyle;

    @com.aliyun.core.annotation.NameInMap("Modifier")
    private SimpleUser modifier;

    @com.aliyun.core.annotation.NameInMap("RefTaskId")
    private String refTaskId;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("Stage")
    private String stage;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < String > tags;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("UUID")
    private String UUID;

    @com.aliyun.core.annotation.NameInMap("WorkflowNodes")
    private java.util.List < String > workflowNodes;

    private SimpleTask(Builder builder) {
        this.archived = builder.archived;
        this.archivedInfos = builder.archivedInfos;
        this.creator = builder.creator;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labelStyle = builder.labelStyle;
        this.modifier = builder.modifier;
        this.refTaskId = builder.refTaskId;
        this.remark = builder.remark;
        this.stage = builder.stage;
        this.status = builder.status;
        this.tags = builder.tags;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
        this.UUID = builder.UUID;
        this.workflowNodes = builder.workflowNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleTask create() {
        return builder().build();
    }

    /**
     * @return archived
     */
    public Boolean getArchived() {
        return this.archived;
    }

    /**
     * @return archivedInfos
     */
    public String getArchivedInfos() {
        return this.archivedInfos;
    }

    /**
     * @return creator
     */
    public SimpleUser getCreator() {
        return this.creator;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return labelStyle
     */
    public String getLabelStyle() {
        return this.labelStyle;
    }

    /**
     * @return modifier
     */
    public SimpleUser getModifier() {
        return this.modifier;
    }

    /**
     * @return refTaskId
     */
    public String getRefTaskId() {
        return this.refTaskId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return this.stage;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * @return workflowNodes
     */
    public java.util.List < String > getWorkflowNodes() {
        return this.workflowNodes;
    }

    public static final class Builder {
        private Boolean archived; 
        private String archivedInfos; 
        private SimpleUser creator; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String labelStyle; 
        private SimpleUser modifier; 
        private String refTaskId; 
        private String remark; 
        private String stage; 
        private String status; 
        private java.util.List < String > tags; 
        private String taskId; 
        private String taskName; 
        private String taskType; 
        private String templateId; 
        private String tenantId; 
        private String UUID; 
        private java.util.List < String > workflowNodes; 

        /**
         * Archived.
         */
        public Builder archived(Boolean archived) {
            this.archived = archived;
            return this;
        }

        /**
         * ArchivedInfos.
         */
        public Builder archivedInfos(String archivedInfos) {
            this.archivedInfos = archivedInfos;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(SimpleUser creator) {
            this.creator = creator;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * LabelStyle.
         */
        public Builder labelStyle(String labelStyle) {
            this.labelStyle = labelStyle;
            return this;
        }

        /**
         * Modifier.
         */
        public Builder modifier(SimpleUser modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * RefTaskId.
         */
        public Builder refTaskId(String refTaskId) {
            this.refTaskId = refTaskId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * Stage.
         */
        public Builder stage(String stage) {
            this.stage = stage;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UUID.
         */
        public Builder UUID(String UUID) {
            this.UUID = UUID;
            return this;
        }

        /**
         * WorkflowNodes.
         */
        public Builder workflowNodes(java.util.List < String > workflowNodes) {
            this.workflowNodes = workflowNodes;
            return this;
        }

        public SimpleTask build() {
            return new SimpleTask(this);
        } 

    } 

}
