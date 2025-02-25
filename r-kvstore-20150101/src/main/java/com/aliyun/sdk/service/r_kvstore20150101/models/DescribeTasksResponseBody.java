// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
         * <p>The details of the task.</p>
         */
        public Builder items(java.util.List < Items> items) {
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
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>608FAEC9-485E-4C65-82DE-2E5B955E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("CurrentStepName")
        private String currentStepName;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Float progress;

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

        @com.aliyun.core.annotation.NameInMap("TaskId")
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
             * <p>The beginning time of the task. The time follows the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-13T06:16:54Z</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The name of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>init_redis</p>
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * <p>The end time of the task. The time follows the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-13T06:17:18Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The progress of the task. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The estimated remaining duration of the task. Unit: seconds.</p>
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
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The task is pending.</li>
             * <li><strong>1</strong>: The task is running.</li>
             * <li><strong>2</strong>: The task is complete.</li>
             * <li><strong>4</strong>: The task is closed.</li>
             * <li><strong>7</strong>: The task is paused.</li>
             * <li><strong>8</strong>: The task is interrupted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The progress of the subtask.</p>
             * <blockquote>
             * <p> If the subtask does not exist, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3/3</p>
             */
            public Builder stepProgressInfo(String stepProgressInfo) {
                this.stepProgressInfo = stepProgressInfo;
                return this;
            }

            /**
             * <p>The information about the subtask in the JSON format. This includes the expected remaining duration (<strong>remain</strong>), the name of the subtask (<strong>name</strong>), and the task progress (<strong>progress</strong>).</p>
             * <blockquote>
             * <p> If the subtask does not exist, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;remain&quot;:0,&quot;name&quot;:&quot;init_instance&quot;,&quot;progress&quot;:100},{&quot;remain&quot;:107,&quot;name&quot;:&quot;init_redis&quot;,&quot;progress&quot;:12.3},{&quot;remain&quot;:1881,&quot;name&quot;:&quot;init_config&quot;,&quot;progress&quot;:0}]</p>
             */
            public Builder stepsInfo(String stepsInfo) {
                this.stepsInfo = stepsInfo;
                return this;
            }

            /**
             * <p>The identifier of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>ModifyDBInstanceParameter</p>
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>32302****</p>
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
