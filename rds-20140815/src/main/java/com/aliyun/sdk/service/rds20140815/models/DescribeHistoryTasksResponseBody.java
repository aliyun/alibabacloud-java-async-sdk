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
 * {@link DescribeHistoryTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryTasksResponseBody</p>
 */
public class DescribeHistoryTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHistoryTasksResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The tasks.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>5CD61041-35F7-10F7-BE94-33A48B22****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of tasks that meet these constraints without taking pagination into account.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHistoryTasksResponseBody build() {
            return new DescribeHistoryTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHistoryTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHistoryTasksResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.actionInfo = model.actionInfo;
                this.callerSource = model.callerSource;
                this.callerUid = model.callerUid;
                this.currentStepName = model.currentStepName;
                this.dbType = model.dbType;
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.product = model.product;
                this.progress = model.progress;
                this.reasonCode = model.reasonCode;
                this.regionId = model.regionId;
                this.remainTime = model.remainTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.taskDetail = model.taskDetail;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.uid = model.uid;
            } 

            /**
             * <p>A set of allowed actions that can be taken on the task. The system matches the current step name and status of the task to the available actions specified by ActionInfo. If no matching action is found, the current status of the task does not support any action. Example:</p>
             * <pre><code>  &quot;steps&quot;: [
             *     {
             *       &quot;step_name&quot;: &quot;exec_task&quot;, // The name of the step, which matches CurrentStepName.      &quot;action_info&quot;: {    // The actions supported for this step.        &quot;Waiting&quot;: [      // The status, which matches Status.          &quot;modifySwitchTime&quot; // The action. Multiple actions are supported.        ]
             *       }
             *     },
             *     {
             *       &quot;step_name&quot;: &quot;init_task&quot;, // The name of the step.      &quot;action_info&quot;: {    // The actions supported for this step.        &quot;Running&quot;: [      // The status.          &quot;cancel&quot;,       // The action.          &quot;pause&quot;
             *         ]
             *       }
             *     }
             *   ]
             * }
             * </code></pre>
             * <p>The system may support the following actions:</p>
             * <ul>
             * <li><strong>retry</strong>: retries the action.</li>
             * <li><strong>cancel</strong>: cancels the action.</li>
             * <li><strong>modifySwitchTime</strong>: changes the switching time or restoration time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;steps&quot;:[{&quot;action_info&quot;:{&quot;Waiting&quot;:[&quot;modifySwitchTime&quot;]},&quot;step_name&quot;:&quot;exec_task&quot;}]}</p>
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * <p>The ID of the user who made the request. If CallerSource is set to User, CallerUid indicates the unique ID (UID) of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>141345906006****</p>
             */
            public Builder callerSource(String callerSource) {
                this.callerSource = callerSource;
                return this;
            }

            /**
             * <p>The source of the request. Valid values:</p>
             * <ul>
             * <li><strong>System</strong></li>
             * <li><strong>User</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder callerUid(String callerUid) {
                this.callerUid = callerUid;
                return this;
            }

            /**
             * <p>The name of the current step. If this parameter is left empty, the task is not started.</p>
             * 
             * <strong>example:</strong>
             * <p>exec_task</p>
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-03T12:06:17Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf62br2491p5l****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The instance category.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>Indicates the task progress.</p>
             * 
             * <strong>example:</strong>
             * <p>79.0</p>
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The reason why the current task was initiated.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The estimated amount of time remaining to complete the task. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * <p>The start time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-03T11:31:03Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Scheduled</li>
             * <li>Running</li>
             * <li>Succeed</li>
             * <li>Failed</li>
             * <li>Cancelling</li>
             * <li>Canceled</li>
             * <li>Waiting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task details.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;callerUid&quot;:&quot;test&quot;}</p>
             */
            public Builder taskDetail(String taskDetail) {
                this.taskDetail = taskDetail;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-83br18hloy3faf****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>autotest_dispatch_cases</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The ID of the user to which the resources belong.</p>
             * 
             * <strong>example:</strong>
             * <p>141345906006****</p>
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
