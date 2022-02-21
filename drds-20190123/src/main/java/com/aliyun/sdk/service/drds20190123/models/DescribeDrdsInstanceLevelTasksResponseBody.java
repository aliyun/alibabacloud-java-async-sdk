// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceLevelTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceLevelTasksResponseBody</p>
 */
public class DescribeDrdsInstanceLevelTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Tasks")
    private Tasks tasks;

    private DescribeDrdsInstanceLevelTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstanceLevelTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private Tasks tasks; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        public DescribeDrdsInstanceLevelTasksResponseBody build() {
            return new DescribeDrdsInstanceLevelTasksResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @NameInMap("AllowCancel")
        private Boolean allowCancel;

        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("ProgressDescription")
        private String progressDescription;

        @NameInMap("ShowProgress")
        private Boolean showProgress;

        @NameInMap("TargetId")
        private Long targetId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskPhase")
        private String taskPhase;

        @NameInMap("TaskStatus")
        private Integer taskStatus;

        @NameInMap("TaskType")
        private Integer taskType;

        private Task(Builder builder) {
            this.allowCancel = builder.allowCancel;
            this.errMsg = builder.errMsg;
            this.gmtCreate = builder.gmtCreate;
            this.progress = builder.progress;
            this.progressDescription = builder.progressDescription;
            this.showProgress = builder.showProgress;
            this.targetId = builder.targetId;
            this.taskName = builder.taskName;
            this.taskPhase = builder.taskPhase;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return allowCancel
         */
        public Boolean getAllowCancel() {
            return this.allowCancel;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return progressDescription
         */
        public String getProgressDescription() {
            return this.progressDescription;
        }

        /**
         * @return showProgress
         */
        public Boolean getShowProgress() {
            return this.showProgress;
        }

        /**
         * @return targetId
         */
        public Long getTargetId() {
            return this.targetId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskPhase
         */
        public String getTaskPhase() {
            return this.taskPhase;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Boolean allowCancel; 
            private String errMsg; 
            private Long gmtCreate; 
            private Integer progress; 
            private String progressDescription; 
            private Boolean showProgress; 
            private Long targetId; 
            private String taskName; 
            private String taskPhase; 
            private Integer taskStatus; 
            private Integer taskType; 

            /**
             * AllowCancel.
             */
            public Builder allowCancel(Boolean allowCancel) {
                this.allowCancel = allowCancel;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ProgressDescription.
             */
            public Builder progressDescription(String progressDescription) {
                this.progressDescription = progressDescription;
                return this;
            }

            /**
             * ShowProgress.
             */
            public Builder showProgress(Boolean showProgress) {
                this.showProgress = showProgress;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
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
             * TaskPhase.
             */
            public Builder taskPhase(String taskPhase) {
                this.taskPhase = taskPhase;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("Task")
        private java.util.List < Task> task;

        private Tasks(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return task
         */
        public java.util.List < Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List < Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List < Task> task) {
                this.task = task;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
