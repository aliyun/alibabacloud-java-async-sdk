// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectSprintInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDevopsProjectSprintInfoResponseBody</p>
 */
public class GetDevopsProjectSprintInfoResponseBody extends TeaModel {
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

    private GetDevopsProjectSprintInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevopsProjectSprintInfoResponseBody create() {
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

        public GetDevopsProjectSprintInfoResponseBody build() {
            return new GetDevopsProjectSprintInfoResponseBody(this);
        } 

    } 

    public static class PlanToDo extends TeaModel {
        @NameInMap("StoryPoints")
        private Integer storyPoints;

        @NameInMap("Tasks")
        private Integer tasks;

        @NameInMap("WorkTimes")
        private Integer workTimes;

        private PlanToDo(Builder builder) {
            this.storyPoints = builder.storyPoints;
            this.tasks = builder.tasks;
            this.workTimes = builder.workTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanToDo create() {
            return builder().build();
        }

        /**
         * @return storyPoints
         */
        public Integer getStoryPoints() {
            return this.storyPoints;
        }

        /**
         * @return tasks
         */
        public Integer getTasks() {
            return this.tasks;
        }

        /**
         * @return workTimes
         */
        public Integer getWorkTimes() {
            return this.workTimes;
        }

        public static final class Builder {
            private Integer storyPoints; 
            private Integer tasks; 
            private Integer workTimes; 

            /**
             * StoryPoints.
             */
            public Builder storyPoints(Integer storyPoints) {
                this.storyPoints = storyPoints;
                return this;
            }

            /**
             * Tasks.
             */
            public Builder tasks(Integer tasks) {
                this.tasks = tasks;
                return this;
            }

            /**
             * WorkTimes.
             */
            public Builder workTimes(Integer workTimes) {
                this.workTimes = workTimes;
                return this;
            }

            public PlanToDo build() {
                return new PlanToDo(this);
            } 

        } 

    }
    public static class Object extends TeaModel {
        @NameInMap("Accomplished")
        private String accomplished;

        @NameInMap("Created")
        private String created;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("DueDate")
        private String dueDate;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsDeleted")
        private Boolean isDeleted;

        @NameInMap("Name")
        private String name;

        @NameInMap("PlanToDo")
        private PlanToDo planToDo;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("Updated")
        private String updated;

        private Object(Builder builder) {
            this.accomplished = builder.accomplished;
            this.created = builder.created;
            this.creatorId = builder.creatorId;
            this.dueDate = builder.dueDate;
            this.id = builder.id;
            this.isDeleted = builder.isDeleted;
            this.name = builder.name;
            this.planToDo = builder.planToDo;
            this.projectId = builder.projectId;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return accomplished
         */
        public String getAccomplished() {
            return this.accomplished;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return planToDo
         */
        public PlanToDo getPlanToDo() {
            return this.planToDo;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String accomplished; 
            private String created; 
            private String creatorId; 
            private String dueDate; 
            private String id; 
            private Boolean isDeleted; 
            private String name; 
            private PlanToDo planToDo; 
            private String projectId; 
            private String startDate; 
            private String status; 
            private String updated; 

            /**
             * Accomplished.
             */
            public Builder accomplished(String accomplished) {
                this.accomplished = accomplished;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PlanToDo.
             */
            public Builder planToDo(PlanToDo planToDo) {
                this.planToDo = planToDo;
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
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
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
             * Updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
