// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeTasksResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

    public static class Items extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("CurrentStepName")
        private String currentStepName;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Progress")
        private Float progress;

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

        @NameInMap("TaskId")
        private String taskId;

        private Items(Builder builder) {
            this.beginTime = builder.beginTime;
            this.currentStepName = builder.currentStepName;
            this.finishTime = builder.finishTime;
            this.progress = builder.progress;
            this.remain = builder.remain;
            this.status = builder.status;
            this.stepProgressInfo = builder.stepProgressInfo;
            this.stepsInfo = builder.stepsInfo;
            this.taskAction = builder.taskAction;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String beginTime; 
            private String currentStepName; 
            private String finishTime; 
            private Float progress; 
            private Integer remain; 
            private String status; 
            private String stepProgressInfo; 
            private String stepsInfo; 
            private String taskAction; 
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
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Float progress) {
                this.progress = progress;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
