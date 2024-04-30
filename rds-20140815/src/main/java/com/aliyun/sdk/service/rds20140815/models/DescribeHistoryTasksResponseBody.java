// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryTasksResponseBody</p>
 */
public class DescribeHistoryTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHistoryTasksResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryTasksResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The tasks.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **10 to 100**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of tasks that meet these constraints without taking pagination into account.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHistoryTasksResponseBody build() {
            return new DescribeHistoryTasksResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionInfo")
        private String actionInfo;

        @com.aliyun.core.annotation.NameInMap("CallerSource")
        private String callerSource;

        @com.aliyun.core.annotation.NameInMap("CallerUid")
        private String callerUid;

        @com.aliyun.core.annotation.NameInMap("CurrentStepName")
        private String currentStepName;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Float progress;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemainTime")
        private Integer remainTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskDetail")
        private String taskDetail;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private Items(Builder builder) {
            this.actionInfo = builder.actionInfo;
            this.callerSource = builder.callerSource;
            this.callerUid = builder.callerUid;
            this.currentStepName = builder.currentStepName;
            this.dbType = builder.dbType;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.product = builder.product;
            this.progress = builder.progress;
            this.reasonCode = builder.reasonCode;
            this.regionId = builder.regionId;
            this.remainTime = builder.remainTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskDetail = builder.taskDetail;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return actionInfo
         */
        public String getActionInfo() {
            return this.actionInfo;
        }

        /**
         * @return callerSource
         */
        public String getCallerSource() {
            return this.callerSource;
        }

        /**
         * @return callerUid
         */
        public String getCallerUid() {
            return this.callerUid;
        }

        /**
         * @return currentStepName
         */
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remainTime
         */
        public Integer getRemainTime() {
            return this.remainTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskDetail
         */
        public String getTaskDetail() {
            return this.taskDetail;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String actionInfo; 
            private String callerSource; 
            private String callerUid; 
            private String currentStepName; 
            private String dbType; 
            private String endTime; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private String product; 
            private Float progress; 
            private String reasonCode; 
            private String regionId; 
            private Integer remainTime; 
            private String startTime; 
            private String status; 
            private String taskDetail; 
            private String taskId; 
            private String taskType; 
            private String uid; 

            /**
             * A set of allowed actions that can be taken on the task. The system matches the current step name and status of the task to the available actions specified by ActionInfo. If no matching action is found, the current status of the task does not support any action. Example:
             * <p>
             * 
             *       "steps": [
             *         {
             *           "step_name": "exec_task", // The name of the step, which matches CurrentStepName.
             *           "action_info": {    // The actions supported for this step.
             *             "Waiting": [      // The status, which matches Status.
             *               "modifySwitchTime" // The action. Multiple actions are supported.
             *             ]
             *           }
             *         },
             *         {
             *           "step_name": "init_task", // The name of the step.
             *           "action_info": {    // The actions supported for this step.
             *             "Running": [      // The status.
             *               "cancel",       // The action.
             *               "pause"
             *             ]
             *           }
             *         }
             *       ]
             *     }
             * 
             * The system may support the following actions: retry cancel modifySwitchTime: changes the switching or restoration time.
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * The ID of the user who made the request. If CallerSource is set to User, CallerUid indicates the unique ID (UID) of the user.
             */
            public Builder callerSource(String callerSource) {
                this.callerSource = callerSource;
                return this;
            }

            /**
             * The request source. Valid values: System User
             */
            public Builder callerUid(String callerUid) {
                this.callerUid = callerUid;
                return this;
            }

            /**
             * The name of the current step. If this parameter is left empty, the task is not started.
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * The database type.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The end time of the task. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The instance ID. Example: rm-xxx.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name, which is a user-defined alias.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The type of the instance. Example: user instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The product. Example: rds.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The task progress. Valid values: 0 to 100.
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The reason why the current task was initiated.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The estimated amount of time remaining to complete the task. Unit: seconds.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * The start time of the task. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the task.
             * <p>
             * 
             * *   Scheduled
             * *   Running
             * *   Succeed
             * *   Failed
             * *   Cancelling
             * *   Canceled
             * *   Waiting
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The task details provided in the form of a JSON string. The JSON string can be customized and extended to include additional information about the task. The details vary based on the task type.
             */
            public Builder taskDetail(String taskDetail) {
                this.taskDetail = taskDetail;
                return this;
            }

            /**
             * The task ID in the t-\*\*\* format.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The task type or name.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The ID of the user to which the resources belong.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
