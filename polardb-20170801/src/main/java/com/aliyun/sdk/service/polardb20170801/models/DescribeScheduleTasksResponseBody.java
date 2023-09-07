// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduleTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScheduleTasksResponseBody</p>
 */
public class DescribeScheduleTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeScheduleTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduleTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The result data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned for the request.
         * <p>
         * 
         * >  If the request is successful, **Successful** is returned. If the request fails, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeScheduleTasksResponseBody build() {
            return new DescribeScheduleTasksResponseBody(this);
        } 

    } 

    public static class TimerInfos extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("DbClusterDescription")
        private String dbClusterDescription;

        @NameInMap("DbClusterStatus")
        private String dbClusterStatus;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("PlannedEndTime")
        private String plannedEndTime;

        @NameInMap("PlannedStartTime")
        private String plannedStartTime;

        @NameInMap("PlannedTime")
        private String plannedTime;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskCancel")
        private Boolean taskCancel;

        @NameInMap("TaskId")
        private String taskId;

        private TimerInfos(Builder builder) {
            this.action = builder.action;
            this.DBClusterId = builder.DBClusterId;
            this.dbClusterDescription = builder.dbClusterDescription;
            this.dbClusterStatus = builder.dbClusterStatus;
            this.orderId = builder.orderId;
            this.plannedEndTime = builder.plannedEndTime;
            this.plannedStartTime = builder.plannedStartTime;
            this.plannedTime = builder.plannedTime;
            this.region = builder.region;
            this.status = builder.status;
            this.taskCancel = builder.taskCancel;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimerInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return dbClusterDescription
         */
        public String getDbClusterDescription() {
            return this.dbClusterDescription;
        }

        /**
         * @return dbClusterStatus
         */
        public String getDbClusterStatus() {
            return this.dbClusterStatus;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return plannedEndTime
         */
        public String getPlannedEndTime() {
            return this.plannedEndTime;
        }

        /**
         * @return plannedStartTime
         */
        public String getPlannedStartTime() {
            return this.plannedStartTime;
        }

        /**
         * @return plannedTime
         */
        public String getPlannedTime() {
            return this.plannedTime;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskCancel
         */
        public Boolean getTaskCancel() {
            return this.taskCancel;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String action; 
            private String DBClusterId; 
            private String dbClusterDescription; 
            private String dbClusterStatus; 
            private String orderId; 
            private String plannedEndTime; 
            private String plannedStartTime; 
            private String plannedTime; 
            private String region; 
            private String status; 
            private Boolean taskCancel; 
            private String taskId; 

            /**
             * The type of the scheduled tasks.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The description of the cluster.
             */
            public Builder dbClusterDescription(String dbClusterDescription) {
                this.dbClusterDescription = dbClusterDescription;
                return this;
            }

            /**
             * The state of the cluster.
             */
            public Builder dbClusterStatus(String dbClusterStatus) {
                this.dbClusterStatus = dbClusterStatus;
                return this;
            }

            /**
             * The ID of the order.
             * <p>
             * 
             * >  This parameter is returned only when you set the `Action` parameter to **CreateDBNodes** or **ModifyDBNodeClass**.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The latest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.
             */
            public Builder plannedEndTime(String plannedEndTime) {
                this.plannedEndTime = plannedEndTime;
                return this;
            }

            /**
             * The earliest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.
             */
            public Builder plannedStartTime(String plannedStartTime) {
                this.plannedStartTime = plannedStartTime;
                return this;
            }

            /**
             * The expected start time of the task. The time is displayed in UTC.
             */
            public Builder plannedTime(String plannedTime) {
                this.plannedTime = plannedTime;
                return this;
            }

            /**
             * The ID of the region in which the scheduled task runs.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The state of the scheduled task.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether the scheduled task can be canceled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder taskCancel(Boolean taskCancel) {
                this.taskCancel = taskCancel;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TimerInfos build() {
                return new TimerInfos(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TimerInfos")
        private java.util.List < TimerInfos> timerInfos;

        @NameInMap("TotalRecordCount")
        private Integer totalRecordCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.timerInfos = builder.timerInfos;
            this.totalRecordCount = builder.totalRecordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return timerInfos
         */
        public java.util.List < TimerInfos> getTimerInfos() {
            return this.timerInfos;
        }

        /**
         * @return totalRecordCount
         */
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < TimerInfos> timerInfos; 
            private Integer totalRecordCount; 

            /**
             * The page number of the page returned.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The details of the scheduled task.
             */
            public Builder timerInfos(java.util.List < TimerInfos> timerInfos) {
                this.timerInfos = timerInfos;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalRecordCount(Integer totalRecordCount) {
                this.totalRecordCount = totalRecordCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
