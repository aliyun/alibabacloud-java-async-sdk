// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDevopsProjectTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateDevopsProjectTaskRequest</p>
 */
public class UpdateDevopsProjectTaskRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("DueDate")
    private String dueDate;

    @Body
    @NameInMap("ExecutorId")
    private String executorId;

    @Body
    @NameInMap("Note")
    private String note;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ParentTaskId")
    private String parentTaskId;

    @Body
    @NameInMap("Priority")
    @Validation(maximum = 999999999999999D)
    private Integer priority;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("ScenarioFiieldConfigId")
    private String scenarioFiieldConfigId;

    @Body
    @NameInMap("SprintId")
    private String sprintId;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("TaskFlowStatusId")
    private String taskFlowStatusId;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("Visible")
    private String visible;

    private UpdateDevopsProjectTaskRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.dueDate = builder.dueDate;
        this.executorId = builder.executorId;
        this.note = builder.note;
        this.orgId = builder.orgId;
        this.parentTaskId = builder.parentTaskId;
        this.priority = builder.priority;
        this.projectId = builder.projectId;
        this.scenarioFiieldConfigId = builder.scenarioFiieldConfigId;
        this.sprintId = builder.sprintId;
        this.startDate = builder.startDate;
        this.taskFlowStatusId = builder.taskFlowStatusId;
        this.taskId = builder.taskId;
        this.visible = builder.visible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDevopsProjectTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return dueDate
     */
    public String getDueDate() {
        return this.dueDate;
    }

    /**
     * @return executorId
     */
    public String getExecutorId() {
        return this.executorId;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return parentTaskId
     */
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return scenarioFiieldConfigId
     */
    public String getScenarioFiieldConfigId() {
        return this.scenarioFiieldConfigId;
    }

    /**
     * @return sprintId
     */
    public String getSprintId() {
        return this.sprintId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return taskFlowStatusId
     */
    public String getTaskFlowStatusId() {
        return this.taskFlowStatusId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return visible
     */
    public String getVisible() {
        return this.visible;
    }

    public static final class Builder extends Request.Builder<UpdateDevopsProjectTaskRequest, Builder> {
        private String content; 
        private String dueDate; 
        private String executorId; 
        private String note; 
        private String orgId; 
        private String parentTaskId; 
        private Integer priority; 
        private String projectId; 
        private String scenarioFiieldConfigId; 
        private String sprintId; 
        private String startDate; 
        private String taskFlowStatusId; 
        private String taskId; 
        private String visible; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDevopsProjectTaskRequest response) {
            super(response);
            this.content = response.content;
            this.dueDate = response.dueDate;
            this.executorId = response.executorId;
            this.note = response.note;
            this.orgId = response.orgId;
            this.parentTaskId = response.parentTaskId;
            this.priority = response.priority;
            this.projectId = response.projectId;
            this.scenarioFiieldConfigId = response.scenarioFiieldConfigId;
            this.sprintId = response.sprintId;
            this.startDate = response.startDate;
            this.taskFlowStatusId = response.taskFlowStatusId;
            this.taskId = response.taskId;
            this.visible = response.visible;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DueDate.
         */
        public Builder dueDate(String dueDate) {
            this.putBodyParameter("DueDate", dueDate);
            this.dueDate = dueDate;
            return this;
        }

        /**
         * ExecutorId.
         */
        public Builder executorId(String executorId) {
            this.putBodyParameter("ExecutorId", executorId);
            this.executorId = executorId;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putBodyParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * ParentTaskId.
         */
        public Builder parentTaskId(String parentTaskId) {
            this.putBodyParameter("ParentTaskId", parentTaskId);
            this.parentTaskId = parentTaskId;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ScenarioFiieldConfigId.
         */
        public Builder scenarioFiieldConfigId(String scenarioFiieldConfigId) {
            this.putBodyParameter("ScenarioFiieldConfigId", scenarioFiieldConfigId);
            this.scenarioFiieldConfigId = scenarioFiieldConfigId;
            return this;
        }

        /**
         * SprintId.
         */
        public Builder sprintId(String sprintId) {
            this.putBodyParameter("SprintId", sprintId);
            this.sprintId = sprintId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TaskFlowStatusId.
         */
        public Builder taskFlowStatusId(String taskFlowStatusId) {
            this.putBodyParameter("TaskFlowStatusId", taskFlowStatusId);
            this.taskFlowStatusId = taskFlowStatusId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Visible.
         */
        public Builder visible(String visible) {
            this.putBodyParameter("Visible", visible);
            this.visible = visible;
            return this;
        }

        @Override
        public UpdateDevopsProjectTaskRequest build() {
            return new UpdateDevopsProjectTaskRequest(this);
        } 

    } 

}
