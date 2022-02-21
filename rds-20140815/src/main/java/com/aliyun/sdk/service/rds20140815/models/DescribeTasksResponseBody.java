// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTasksResponseBody</p>
 */
public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeTasksResponseBody build() {
            return new DescribeTasksResponseBody(this);
        } 

    } 

    public static class TaskProgressInfo extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("CurrentStepName")
        private String currentStepName;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("ExpectedFinishTime")
        private String expectedFinishTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("ProgressInfo")
        private String progressInfo;

        @NameInMap("Remain")
        private Integer remain;

        @NameInMap("Status")
        private String status;

        @NameInMap("StepProgressInfo")
        private String stepProgressInfo;

        @NameInMap("StepsInfo")
        private String stepsInfo;

        @NameInMap("TaskAction")
        private String taskAction;

        @NameInMap("TaskErrorCode")
        private String taskErrorCode;

        @NameInMap("TaskErrorMessage")
        private String taskErrorMessage;

        @NameInMap("TaskId")
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
            public Builder progress(String progress) {
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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

            public TaskProgressInfo build() {
                return new TaskProgressInfo(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("TaskProgressInfo")
        private java.util.List < TaskProgressInfo> taskProgressInfo;

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
        public java.util.List < TaskProgressInfo> getTaskProgressInfo() {
            return this.taskProgressInfo;
        }

        public static final class Builder {
            private java.util.List < TaskProgressInfo> taskProgressInfo; 

            /**
             * TaskProgressInfo.
             */
            public Builder taskProgressInfo(java.util.List < TaskProgressInfo> taskProgressInfo) {
                this.taskProgressInfo = taskProgressInfo;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
