// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskDetailRequest</p>
 */
public class UpdateTaskDetailRequest extends Request {
    @Body
    @NameInMap("AddInvolvers")
    private String addInvolvers;

    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("CustomFieldId")
    private String customFieldId;

    @Body
    @NameInMap("CustomFieldValues")
    private String customFieldValues;

    @Body
    @NameInMap("DelInvolvers")
    private String delInvolvers;

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
    @NameInMap("Priority")
    @Validation(maximum = 999999999999999D)
    private Long priority;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("SprintId")
    private String sprintId;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("StoryPoint")
    private String storyPoint;

    @Body
    @NameInMap("TagIds")
    private String tagIds;

    @Body
    @NameInMap("TaskFlowStatusId")
    private String taskFlowStatusId;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @Body
    @NameInMap("WorkTimes")
    @Validation(maximum = 100000)
    private Long workTimes;

    private UpdateTaskDetailRequest(Builder builder) {
        super(builder);
        this.addInvolvers = builder.addInvolvers;
        this.content = builder.content;
        this.customFieldId = builder.customFieldId;
        this.customFieldValues = builder.customFieldValues;
        this.delInvolvers = builder.delInvolvers;
        this.dueDate = builder.dueDate;
        this.executorId = builder.executorId;
        this.note = builder.note;
        this.orgId = builder.orgId;
        this.priority = builder.priority;
        this.projectId = builder.projectId;
        this.sprintId = builder.sprintId;
        this.startDate = builder.startDate;
        this.storyPoint = builder.storyPoint;
        this.tagIds = builder.tagIds;
        this.taskFlowStatusId = builder.taskFlowStatusId;
        this.taskId = builder.taskId;
        this.workTimes = builder.workTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addInvolvers
     */
    public String getAddInvolvers() {
        return this.addInvolvers;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return customFieldId
     */
    public String getCustomFieldId() {
        return this.customFieldId;
    }

    /**
     * @return customFieldValues
     */
    public String getCustomFieldValues() {
        return this.customFieldValues;
    }

    /**
     * @return delInvolvers
     */
    public String getDelInvolvers() {
        return this.delInvolvers;
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
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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
     * @return storyPoint
     */
    public String getStoryPoint() {
        return this.storyPoint;
    }

    /**
     * @return tagIds
     */
    public String getTagIds() {
        return this.tagIds;
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
     * @return workTimes
     */
    public Long getWorkTimes() {
        return this.workTimes;
    }

    public static final class Builder extends Request.Builder<UpdateTaskDetailRequest, Builder> {
        private String addInvolvers; 
        private String content; 
        private String customFieldId; 
        private String customFieldValues; 
        private String delInvolvers; 
        private String dueDate; 
        private String executorId; 
        private String note; 
        private String orgId; 
        private Long priority; 
        private String projectId; 
        private String sprintId; 
        private String startDate; 
        private String storyPoint; 
        private String tagIds; 
        private String taskFlowStatusId; 
        private String taskId; 
        private Long workTimes; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskDetailRequest response) {
            super(response);
            this.addInvolvers = response.addInvolvers;
            this.content = response.content;
            this.customFieldId = response.customFieldId;
            this.customFieldValues = response.customFieldValues;
            this.delInvolvers = response.delInvolvers;
            this.dueDate = response.dueDate;
            this.executorId = response.executorId;
            this.note = response.note;
            this.orgId = response.orgId;
            this.priority = response.priority;
            this.projectId = response.projectId;
            this.sprintId = response.sprintId;
            this.startDate = response.startDate;
            this.storyPoint = response.storyPoint;
            this.tagIds = response.tagIds;
            this.taskFlowStatusId = response.taskFlowStatusId;
            this.taskId = response.taskId;
            this.workTimes = response.workTimes;
        } 

        /**
         * AddInvolvers.
         */
        public Builder addInvolvers(String addInvolvers) {
            this.putBodyParameter("AddInvolvers", addInvolvers);
            this.addInvolvers = addInvolvers;
            return this;
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
         * CustomFieldId.
         */
        public Builder customFieldId(String customFieldId) {
            this.putBodyParameter("CustomFieldId", customFieldId);
            this.customFieldId = customFieldId;
            return this;
        }

        /**
         * CustomFieldValues.
         */
        public Builder customFieldValues(String customFieldValues) {
            this.putBodyParameter("CustomFieldValues", customFieldValues);
            this.customFieldValues = customFieldValues;
            return this;
        }

        /**
         * DelInvolvers.
         */
        public Builder delInvolvers(String delInvolvers) {
            this.putBodyParameter("DelInvolvers", delInvolvers);
            this.delInvolvers = delInvolvers;
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
         * Priority.
         */
        public Builder priority(Long priority) {
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
         * StoryPoint.
         */
        public Builder storyPoint(String storyPoint) {
            this.putBodyParameter("StoryPoint", storyPoint);
            this.storyPoint = storyPoint;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(String tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
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
         * WorkTimes.
         */
        public Builder workTimes(Long workTimes) {
            this.putBodyParameter("WorkTimes", workTimes);
            this.workTimes = workTimes;
            return this;
        }

        @Override
        public UpdateTaskDetailRequest build() {
            return new UpdateTaskDetailRequest(this);
        } 

    } 

}
