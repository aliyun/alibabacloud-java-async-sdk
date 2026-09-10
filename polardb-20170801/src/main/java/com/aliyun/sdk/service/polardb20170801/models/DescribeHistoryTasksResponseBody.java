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
    private String totalCount;

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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

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
         * <p>The list of tasks.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F90D7C14-2D1C-5B88-9CD1-23AB2CF89***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of tasks that meet the conditions, regardless of paging factors.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(String totalCount) {
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
             * <p>The allowed operation information.</p>
             * <blockquote>
             * <p>This feature is not supported yet.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * <p>The request source. Valid values:</p>
             * <ul>
             * <li><p><strong>System</strong>: system</p>
             * </li>
             * <li><p><strong>User</strong>: user</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder callerSource(String callerSource) {
                this.callerSource = callerSource;
                return this;
            }

            /**
             * <p>The ID of the requesting user. If <code>CallerSource</code> is <code>User</code>, this is the user\&quot;s UID.</p>
             * 
             * <strong>example:</strong>
             * <p>1816563541899***</p>
             */
            public Builder callerUid(String callerUid) {
                this.callerUid = callerUid;
                return this;
            }

            /**
             * <p>The name of the current step being executed. If this parameter is empty, the task has not started.</p>
             * 
             * <strong>example:</strong>
             * <p>finish_task</p>
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb_mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-03T07:30:57Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-2zed3m89cw***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-2zed3m89cw***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The product.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The completion progress of the task, from 0.0 to 100.0.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The reason for initiating the current task.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The estimated remaining execution time, in seconds (s).</p>
             * <blockquote>
             * <p>This value is for reference only. The actual execution time prevails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * <p>The start time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-03T07:25:16Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The final status of the task.</p>
             * <ul>
             * <li><p>Scheduled: waiting for execution</p>
             * </li>
             * <li><p>Running: executing</p>
             * </li>
             * <li><p>Succeed: executed successfully</p>
             * </li>
             * <li><p>Failed: execution failed</p>
             * </li>
             * <li><p>Cancelling: stopping</p>
             * </li>
             * <li><p>Canceled: stopped</p>
             * </li>
             * <li><p>Waiting: waiting for preset time</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task details.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;steps\&quot;:[{\&quot;step_name\&quot;:\&quot;init_task\&quot;},{\&quot;step_name\&quot;:\&quot;exec_task\&quot;},{\&quot;step_name\&quot;:\&quot;finish_task\&quot;}]}</p>
             */
            public Builder taskDetail(String taskDetail) {
                this.taskDetail = taskDetail;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-0mqt8qhnw04ipz0***</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>ChangeVariable</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The UID of the account that owns the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1816563541899***</p>
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
