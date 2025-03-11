// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsInstanceLevelTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceLevelTasksResponseBody</p>
 */
public class DescribeDrdsInstanceLevelTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tasks")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2F7F8080-9132-4279-85D0-B7E5C4305162</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The list of returned unfinished tasks.</p>
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        public DescribeDrdsInstanceLevelTasksResponseBody build() {
            return new DescribeDrdsInstanceLevelTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsInstanceLevelTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstanceLevelTasksResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCancel")
        private Boolean allowCancel;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ProgressDescription")
        private String progressDescription;

        @com.aliyun.core.annotation.NameInMap("ShowProgress")
        private Boolean showProgress;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private Long targetId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskPhase")
        private String taskPhase;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
             * <p>Indicates whether the task can be canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowCancel(Boolean allowCancel) {
                this.allowCancel = allowCancel;
                return this;
            }

            /**
             * <p>The error message returned for the task.</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The timestamp when the task is created.</p>
             * 
             * <strong>example:</strong>
             * <p>1568705520000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The progress of the task. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The description of the task progress.</p>
             */
            public Builder progressDescription(String progressDescription) {
                this.progressDescription = progressDescription;
                return this;
            }

            /**
             * <p>Indicates whether the progress of the task is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showProgress(Boolean showProgress) {
                this.showProgress = showProgress;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>12312</p>
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>upgrade_instance</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The phase of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskPhase(String taskPhase) {
                this.taskPhase = taskPhase;
                return this;
            }

            /**
             * <p>The state of the task. Valid values:</p>
             * <ul>
             * <li>0: The task is being executed.</li>
             * <li>1: The task is executed.</li>
             * <li>2: The task failed to be executed.</li>
             * <li>3: The task is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The type of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
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
    /**
     * 
     * {@link DescribeDrdsInstanceLevelTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstanceLevelTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Task")
        private java.util.List<Task> task;

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
        public java.util.List<Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List<Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List<Task> task) {
                this.task = task;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
