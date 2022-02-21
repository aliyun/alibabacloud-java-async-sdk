// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDevopsProjectTaskInfoResponseBody</p>
 */
public class GetDevopsProjectTaskInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Object")
    private Object object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private Boolean successful;

    private GetDevopsProjectTaskInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevopsProjectTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return object
     */
    public Object getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successful
     */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Object object; 
        private String requestId; 
        private Boolean successful; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(Object object) {
            this.object = object;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Successful.
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        public GetDevopsProjectTaskInfoResponseBody build() {
            return new GetDevopsProjectTaskInfoResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Created")
        private String created;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("DueDate")
        private String dueDate;

        @NameInMap("ExecutorId")
        private String executorId;

        @NameInMap("Id")
        private String id;

        @NameInMap("InvolveMembers")
        private java.util.List < String > involveMembers;

        @NameInMap("IsDeleted")
        private Boolean isDeleted;

        @NameInMap("IsDone")
        private Boolean isDone;

        @NameInMap("IsTopInProject")
        private Boolean isTopInProject;

        @NameInMap("Note")
        private String note;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("SprintId")
        private String sprintId;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("StoryPoint")
        private String storyPoint;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TaskflowstatusId")
        private String taskflowstatusId;

        @NameInMap("TasklistId")
        private String tasklistId;

        @NameInMap("Updated")
        private String updated;

        @NameInMap("Visible")
        private String visible;

        private Object(Builder builder) {
            this.content = builder.content;
            this.created = builder.created;
            this.creatorId = builder.creatorId;
            this.dueDate = builder.dueDate;
            this.executorId = builder.executorId;
            this.id = builder.id;
            this.involveMembers = builder.involveMembers;
            this.isDeleted = builder.isDeleted;
            this.isDone = builder.isDone;
            this.isTopInProject = builder.isTopInProject;
            this.note = builder.note;
            this.organizationId = builder.organizationId;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.sprintId = builder.sprintId;
            this.startDate = builder.startDate;
            this.storyPoint = builder.storyPoint;
            this.taskType = builder.taskType;
            this.taskflowstatusId = builder.taskflowstatusId;
            this.tasklistId = builder.tasklistId;
            this.updated = builder.updated;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return involveMembers
         */
        public java.util.List < String > getInvolveMembers() {
            return this.involveMembers;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return isDone
         */
        public Boolean getIsDone() {
            return this.isDone;
        }

        /**
         * @return isTopInProject
         */
        public Boolean getIsTopInProject() {
            return this.isTopInProject;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return priority
         */
        public String getPriority() {
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
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return taskflowstatusId
         */
        public String getTaskflowstatusId() {
            return this.taskflowstatusId;
        }

        /**
         * @return tasklistId
         */
        public String getTasklistId() {
            return this.tasklistId;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return visible
         */
        public String getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private String content; 
            private String created; 
            private String creatorId; 
            private String dueDate; 
            private String executorId; 
            private String id; 
            private java.util.List < String > involveMembers; 
            private Boolean isDeleted; 
            private Boolean isDone; 
            private Boolean isTopInProject; 
            private String note; 
            private String organizationId; 
            private String priority; 
            private String projectId; 
            private String sprintId; 
            private String startDate; 
            private String storyPoint; 
            private String taskType; 
            private String taskflowstatusId; 
            private String tasklistId; 
            private String updated; 
            private String visible; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * DueDate.
             */
            public Builder dueDate(String dueDate) {
                this.dueDate = dueDate;
                return this;
            }

            /**
             * ExecutorId.
             */
            public Builder executorId(String executorId) {
                this.executorId = executorId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InvolveMembers.
             */
            public Builder involveMembers(java.util.List < String > involveMembers) {
                this.involveMembers = involveMembers;
                return this;
            }

            /**
             * IsDeleted.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * IsDone.
             */
            public Builder isDone(Boolean isDone) {
                this.isDone = isDone;
                return this;
            }

            /**
             * IsTopInProject.
             */
            public Builder isTopInProject(Boolean isTopInProject) {
                this.isTopInProject = isTopInProject;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SprintId.
             */
            public Builder sprintId(String sprintId) {
                this.sprintId = sprintId;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * StoryPoint.
             */
            public Builder storyPoint(String storyPoint) {
                this.storyPoint = storyPoint;
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
             * TaskflowstatusId.
             */
            public Builder taskflowstatusId(String taskflowstatusId) {
                this.taskflowstatusId = taskflowstatusId;
                return this;
            }

            /**
             * TasklistId.
             */
            public Builder tasklistId(String tasklistId) {
                this.tasklistId = tasklistId;
                return this;
            }

            /**
             * Updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * Visible.
             */
            public Builder visible(String visible) {
                this.visible = visible;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
