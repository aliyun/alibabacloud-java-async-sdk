// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTasksResponseBody</p>
 */
public class DescribeTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private Tasks tasks;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeTasksResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.tasks = builder.tasks;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String endTime; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String startTime; 
        private Tasks tasks; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeTasksResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.endTime = model.endTime;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.tasks = model.tasks;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The ID of the cluster to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-***************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-02T03:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4352AD99-9FF5-41A6-A319-068089******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-30T00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeTasksResponseBody build() {
            return new DescribeTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTasksResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("CurrentStepName")
        private String currentStepName;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExpectedFinishTime")
        private String expectedFinishTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ProgressInfo")
        private String progressInfo;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Integer remain;

        @com.aliyun.core.annotation.NameInMap("StepProgressInfo")
        private String stepProgressInfo;

        @com.aliyun.core.annotation.NameInMap("StepsInfo")
        private String stepsInfo;

        @com.aliyun.core.annotation.NameInMap("TaskAction")
        private String taskAction;

        @com.aliyun.core.annotation.NameInMap("TaskErrorCode")
        private String taskErrorCode;

        @com.aliyun.core.annotation.NameInMap("TaskErrorMessage")
        private String taskErrorMessage;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Task(Builder builder) {
            this.beginTime = builder.beginTime;
            this.currentStepName = builder.currentStepName;
            this.DBName = builder.DBName;
            this.expectedFinishTime = builder.expectedFinishTime;
            this.finishTime = builder.finishTime;
            this.progress = builder.progress;
            this.progressInfo = builder.progressInfo;
            this.remain = builder.remain;
            this.stepProgressInfo = builder.stepProgressInfo;
            this.stepsInfo = builder.stepsInfo;
            this.taskAction = builder.taskAction;
            this.taskErrorCode = builder.taskErrorCode;
            this.taskErrorMessage = builder.taskErrorMessage;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return currentStepName
         */
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return expectedFinishTime
         */
        public String getExpectedFinishTime() {
            return this.expectedFinishTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return progressInfo
         */
        public String getProgressInfo() {
            return this.progressInfo;
        }

        /**
         * @return remain
         */
        public Integer getRemain() {
            return this.remain;
        }

        /**
         * @return stepProgressInfo
         */
        public String getStepProgressInfo() {
            return this.stepProgressInfo;
        }

        /**
         * @return stepsInfo
         */
        public String getStepsInfo() {
            return this.stepsInfo;
        }

        /**
         * @return taskAction
         */
        public String getTaskAction() {
            return this.taskAction;
        }

        /**
         * @return taskErrorCode
         */
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        /**
         * @return taskErrorMessage
         */
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String beginTime; 
            private String currentStepName; 
            private String DBName; 
            private String expectedFinishTime; 
            private String finishTime; 
            private Integer progress; 
            private String progressInfo; 
            private Integer remain; 
            private String stepProgressInfo; 
            private String stepsInfo; 
            private String taskAction; 
            private String taskErrorCode; 
            private String taskErrorMessage; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.beginTime = model.beginTime;
                this.currentStepName = model.currentStepName;
                this.DBName = model.DBName;
                this.expectedFinishTime = model.expectedFinishTime;
                this.finishTime = model.finishTime;
                this.progress = model.progress;
                this.progressInfo = model.progressInfo;
                this.remain = model.remain;
                this.stepProgressInfo = model.stepProgressInfo;
                this.stepsInfo = model.stepsInfo;
                this.taskAction = model.taskAction;
                this.taskErrorCode = model.taskErrorCode;
                this.taskErrorMessage = model.taskErrorMessage;
                this.taskId = model.taskId;
            } 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * CurrentStepName.
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * ExpectedFinishTime.
             */
            public Builder expectedFinishTime(String expectedFinishTime) {
                this.expectedFinishTime = expectedFinishTime;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
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
             * ProgressInfo.
             */
            public Builder progressInfo(String progressInfo) {
                this.progressInfo = progressInfo;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Integer remain) {
                this.remain = remain;
                return this;
            }

            /**
             * StepProgressInfo.
             */
            public Builder stepProgressInfo(String stepProgressInfo) {
                this.stepProgressInfo = stepProgressInfo;
                return this;
            }

            /**
             * StepsInfo.
             */
            public Builder stepsInfo(String stepsInfo) {
                this.stepsInfo = stepsInfo;
                return this;
            }

            /**
             * TaskAction.
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * TaskErrorCode.
             */
            public Builder taskErrorCode(String taskErrorCode) {
                this.taskErrorCode = taskErrorCode;
                return this;
            }

            /**
             * TaskErrorMessage.
             */
            public Builder taskErrorMessage(String taskErrorMessage) {
                this.taskErrorMessage = taskErrorMessage;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTasksResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.task = model.task;
            } 

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
