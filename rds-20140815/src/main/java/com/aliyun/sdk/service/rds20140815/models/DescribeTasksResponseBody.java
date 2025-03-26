// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeTasksResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
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
     * @return items
     */
    public Items getItems() {
        return this.items;
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeTasksResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The details of the task execution.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A103039D-B1B2-4C57-B989-7D7C0DA95426</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
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
    public static class TaskProgressInfo extends TeaModel {
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
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ProgressInfo")
        private String progressInfo;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Integer remain;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

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

        private TaskProgressInfo(Builder builder) {
            this.beginTime = builder.beginTime;
            this.currentStepName = builder.currentStepName;
            this.DBName = builder.DBName;
            this.expectedFinishTime = builder.expectedFinishTime;
            this.finishTime = builder.finishTime;
            this.progress = builder.progress;
            this.progressInfo = builder.progressInfo;
            this.remain = builder.remain;
            this.status = builder.status;
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

        public static TaskProgressInfo create() {
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
        public String getProgress() {
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String progress; 
            private String progressInfo; 
            private Integer remain; 
            private String status; 
            private String stepProgressInfo; 
            private String stepsInfo; 
            private String taskAction; 
            private String taskErrorCode; 
            private String taskErrorMessage; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskProgressInfo model) {
                this.beginTime = model.beginTime;
                this.currentStepName = model.currentStepName;
                this.DBName = model.DBName;
                this.expectedFinishTime = model.expectedFinishTime;
                this.finishTime = model.finishTime;
                this.progress = model.progress;
                this.progressInfo = model.progressInfo;
                this.remain = model.remain;
                this.status = model.status;
                this.stepProgressInfo = model.stepProgressInfo;
                this.stepsInfo = model.stepsInfo;
                this.taskAction = model.taskAction;
                this.taskErrorCode = model.taskErrorCode;
                this.taskErrorMessage = model.taskErrorMessage;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The start time of the task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC .</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-20T01:00Z</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The name of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>create_instance</p>
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * <p>The name of the database. If the task involves a database, the database name is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>DBtest</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The estimated end time of the task.</p>
             * <blockquote>
             * <p>In most cases, this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder expectedFinishTime(String expectedFinishTime) {
                this.expectedFinishTime = expectedFinishTime;
                return this;
            }

            /**
             * <p>The end time of the task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-20T02:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The progress of the task in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The description of the task progress.</p>
             * <blockquote>
             * <p>If no progress description is provided for the task, this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder progressInfo(String progressInfo) {
                this.progressInfo = progressInfo;
                return this;
            }

            /**
             * <p>The estimated remaining time of the task. Unit: seconds.</p>
             * <blockquote>
             * <p> If the task is not running, this parameter is not returned or the returned value is <strong>0</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder remain(Integer remain) {
                this.remain = remain;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The progress of the subtask. For example, a value of <code>1/4</code> indicates that the task consists of four subtasks and the first subtask is in progress.</p>
             * 
             * <strong>example:</strong>
             * <p>1/4</p>
             */
            public Builder stepProgressInfo(String stepProgressInfo) {
                this.stepProgressInfo = stepProgressInfo;
                return this;
            }

            /**
             * <p>The details of the subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder stepsInfo(String stepsInfo) {
                this.stepsInfo = stepsInfo;
                return this;
            }

            /**
             * <p>The operation that is used by the task, such as <strong>CreateDBInstance</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateDBInstance</p>
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * <p>The error code that is returned when an error occurs.</p>
             * <blockquote>
             * <p>This parameter is returned only when an error occurs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder taskErrorCode(String taskErrorCode) {
                this.taskErrorCode = taskErrorCode;
                return this;
            }

            /**
             * <p>The error message that is returned when an error occurs.</p>
             * <blockquote>
             * <p> This parameter is returned only when an error occurs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder taskErrorMessage(String taskErrorMessage) {
                this.taskErrorMessage = taskErrorMessage;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>3472xxxxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskProgressInfo build() {
                return new TaskProgressInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskProgressInfo")
        private java.util.List<TaskProgressInfo> taskProgressInfo;

        private Items(Builder builder) {
            this.taskProgressInfo = builder.taskProgressInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return taskProgressInfo
         */
        public java.util.List<TaskProgressInfo> getTaskProgressInfo() {
            return this.taskProgressInfo;
        }

        public static final class Builder {
            private java.util.List<TaskProgressInfo> taskProgressInfo; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.taskProgressInfo = model.taskProgressInfo;
            } 

            /**
             * TaskProgressInfo.
             */
            public Builder taskProgressInfo(java.util.List<TaskProgressInfo> taskProgressInfo) {
                this.taskProgressInfo = taskProgressInfo;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
