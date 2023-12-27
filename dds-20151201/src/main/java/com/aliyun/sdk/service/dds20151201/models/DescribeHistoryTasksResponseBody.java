// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryTasksResponseBody</p>
 */
public class DescribeHistoryTasksResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The task objects.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The maximum number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of tasks that meet these conditions without taking pagination into account.
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
        @NameInMap("ActionInfo")
        private String actionInfo;

        @NameInMap("CallerSource")
        private String callerSource;

        @NameInMap("CallerUid")
        private String callerUid;

        @NameInMap("CurrentStepName")
        private String currentStepName;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Product")
        private String product;

        @NameInMap("Progress")
        private Float progress;

        @NameInMap("ReasonCode")
        private String reasonCode;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RemainTime")
        private Integer remainTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskDetail")
        private String taskDetail;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("Uid")
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
        public Integer getStatus() {
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
            private Integer status; 
            private String taskDetail; 
            private String taskId; 
            private String taskType; 
            private String uid; 

            /**
             * A set of allowed actions that can be taken on the task. The system matches the current step name and status of the task to the available actions specified by ActionInfo. If no matching action is found, the current status of the task does not support any action. Example:
             * <p>
             * 
             *        "steps": [
             *         {
             *           "step_name": "exec_task", // The name of the step, which matches the value of CurrentStepName.
             *           "action_info": {    // The actions supported for this step.
             *             "Waiting": [      // The status, which matches the value of Status.
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
             * The system may support the following actions:
             * 
             * *   retry: makes another attempt.
             * *   cancel: makes a cancellation.
             * *   modifySwitchTime: changes the switching or restoration time.
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * The request source. Valid values: System and User.
             */
            public Builder callerSource(String callerSource) {
                this.callerSource = callerSource;
                return this;
            }

            /**
             * The ID of the user who made the request. If CallerSource is set to User, CallerUid indicates the unique ID (UID) of the user.
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
             * The database type. The value is fixed to mongodb.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The end time of the performed O\&M task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The instance ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The instance type of the instance. The value is fixed to Instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The product. The value is fixed to dds.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The current progress of the task. The valid values range from 0 to 100.
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
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The estimated remaining execution time. Unit: seconds. The value 0 indicates that the task is completed.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * The start time of the performed O\&M task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The task status. Valid values:
             * <p>
             * 
             * *   Scheduled: The task is waiting to be executed.
             * *   Running: The task is running.
             * *   Succeed: The task is successful.
             * *   Failed: The task failed.
             * *   Cancelling: The task is being terminated.
             * *   Canceled: The task has been terminated.
             * *   Waiting: The task is waiting for scheduled time.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The details of the task. The task details vary based on the value of the taskType parameter.
             */
            public Builder taskDetail(String taskDetail) {
                this.taskDetail = taskDetail;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The task type.
             * <p>
             * 
             * *   CreateIns: Create an instance.
             * *   DeleteIns: Delete an instance.
             * *   ChangeVariable: Modify parameter settings for an instance.
             * *   ModifyInsConfig: Change the configurations of an instance.
             * *   RestartIns: Restart an instance.
             * *   HaSwitch: Perform a primary/secondary switchover on an instance.
             * *   CloneIns: Clone an instance.
             * *   KernelVersionUpgrade: Update the minor version of an instance.
             * *   ProxyVersionUpgrade: Upgrade the agent version of an instance.
             * *   ModifyAccount: Change the account of an instance.
             * *   ModifyInsSpec: Change the specifications of an instance or perform a data migration on the instance.
             * *   CreateReadIns: Create a read-only instance.
             * *   StartIns: Start an instance.
             * *   StopIns: Stop an instance.
             * *   ModifyNetwork: Modify the network type for an instance.
             * *   LockIns: Lock an instance.
             * *   UnlockIns: Unlock an instance.
             * *   DiskOnlineExpansion: Scale out the disks of an instance online.
             * *   StorageOnlineExpansion: Expend the storage capacity of an instance online.
             * *   AddInsNode: Add a node to an instance.
             * *   DeleteInsNode: Delete a node from an instance.
             * *   ManualBackupIns: Manually back up an instance.
             * *   ModifyInsStorageType: Modify the storage type for an instance.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The ID of the user to which the resource belongs.
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
