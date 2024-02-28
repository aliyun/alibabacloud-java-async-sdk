// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTaskResponseBody</p>
 */
public class DescribeActiveOperationTaskResponseBody extends TeaModel {
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

    private DescribeActiveOperationTaskResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationTaskResponseBody create() {
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
         * Details of O\&M tasks.
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeActiveOperationTaskResponseBody build() {
            return new DescribeActiveOperationTaskResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("Deadline")
        private String deadline;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("InsName")
        private String insName;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("PrepareInterval")
        private String prepareInterval;

        @NameInMap("Region")
        private String region;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SwitchTime")
        private String switchTime;

        @NameInMap("TaskType")
        private String taskType;

        private Items(Builder builder) {
            this.createdTime = builder.createdTime;
            this.dbType = builder.dbType;
            this.deadline = builder.deadline;
            this.id = builder.id;
            this.insName = builder.insName;
            this.modifiedTime = builder.modifiedTime;
            this.prepareInterval = builder.prepareInterval;
            this.region = builder.region;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.switchTime = builder.switchTime;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return deadline
         */
        public String getDeadline() {
            return this.deadline;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return prepareInterval
         */
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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
         * @return switchTime
         */
        public String getSwitchTime() {
            return this.switchTime;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String createdTime; 
            private String dbType; 
            private String deadline; 
            private Integer id; 
            private String insName; 
            private String modifiedTime; 
            private String prepareInterval; 
            private String region; 
            private String startTime; 
            private Integer status; 
            private String switchTime; 
            private String taskType; 

            /**
             * The time when the O\&M task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The database type of the instance. The return value is **Redis**.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The deadline before which the time to preform the O&M task can be modified. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.
             */
            public Builder deadline(String deadline) {
                this.deadline = deadline;
                return this;
            }

            /**
             * The ID of the O&M task.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * The time when the O\&M task was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The required preparation period between the task start time and the switchover time. The time is displayed in the *HH:mm:ss* format.
             */
            public Builder prepareInterval(String prepareInterval) {
                this.prepareInterval = prepareInterval;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The time when the O\&M task was preformed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the O&M task. Valid values:
             * <p>
             * 
             * *   **2**: The task is waiting for users to specify a switchover time.
             * *   **3**: The task is waiting to be performed.
             * *   **4**: The task is being performed. If the task is in this state, the [ModifyActiveOperationTask](~~ModifyActiveOperationTask~~) operation cannot be called to modify the scheduled switchover time.
             * *   **5**: The task is performed.
             * *   **6**: The task fails.
             * *   **7**: The task is canceled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the system performs the switchover operation. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   **rds_apsaradb_ha**: master-replica switchover
             * *   **rds_apsaradb_transfer**: instance migration
             * *   **rds_apsaradb_upgrade**: minor version update
             * *   **all**: all types
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
