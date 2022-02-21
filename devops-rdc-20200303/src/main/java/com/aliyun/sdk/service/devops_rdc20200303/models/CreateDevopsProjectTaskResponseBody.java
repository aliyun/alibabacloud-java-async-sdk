// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevopsProjectTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDevopsProjectTaskResponseBody</p>
 */
public class CreateDevopsProjectTaskResponseBody extends TeaModel {
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

    private CreateDevopsProjectTaskResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevopsProjectTaskResponseBody create() {
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

        public CreateDevopsProjectTaskResponseBody build() {
            return new CreateDevopsProjectTaskResponseBody(this);
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

        @NameInMap("IsDone")
        private Boolean isDone;

        @NameInMap("Note")
        private String note;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("Pos")
        private Integer pos;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Rating")
        private Integer rating;

        @NameInMap("ScenarioFieldConfigId")
        private String scenarioFieldConfigId;

        @NameInMap("Source")
        private String source;

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

        @NameInMap("UniqueId")
        private Integer uniqueId;

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
            this.isDone = builder.isDone;
            this.note = builder.note;
            this.organizationId = builder.organizationId;
            this.pos = builder.pos;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.rating = builder.rating;
            this.scenarioFieldConfigId = builder.scenarioFieldConfigId;
            this.source = builder.source;
            this.sprintId = builder.sprintId;
            this.startDate = builder.startDate;
            this.storyPoint = builder.storyPoint;
            this.taskType = builder.taskType;
            this.taskflowstatusId = builder.taskflowstatusId;
            this.tasklistId = builder.tasklistId;
            this.uniqueId = builder.uniqueId;
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
         * @return isDone
         */
        public Boolean getIsDone() {
            return this.isDone;
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
         * @return pos
         */
        public Integer getPos() {
            return this.pos;
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
         * @return rating
         */
        public Integer getRating() {
            return this.rating;
        }

        /**
         * @return scenarioFieldConfigId
         */
        public String getScenarioFieldConfigId() {
            return this.scenarioFieldConfigId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
         * @return uniqueId
         */
        public Integer getUniqueId() {
            return this.uniqueId;
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
            private Boolean isDone; 
            private String note; 
            private String organizationId; 
            private Integer pos; 
            private Integer priority; 
            private String projectId; 
            private Integer rating; 
            private String scenarioFieldConfigId; 
            private String source; 
            private String sprintId; 
            private String startDate; 
            private String storyPoint; 
            private String taskType; 
            private String taskflowstatusId; 
            private String tasklistId; 
            private Integer uniqueId; 
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
             * IsDone.
             */
            public Builder isDone(Boolean isDone) {
                this.isDone = isDone;
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
             * Pos.
             */
            public Builder pos(Integer pos) {
                this.pos = pos;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
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
             * Rating.
             */
            public Builder rating(Integer rating) {
                this.rating = rating;
                return this;
            }

            /**
             * ScenarioFieldConfigId.
             */
            public Builder scenarioFieldConfigId(String scenarioFieldConfigId) {
                this.scenarioFieldConfigId = scenarioFieldConfigId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
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
             * UniqueId.
             */
            public Builder uniqueId(Integer uniqueId) {
                this.uniqueId = uniqueId;
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
