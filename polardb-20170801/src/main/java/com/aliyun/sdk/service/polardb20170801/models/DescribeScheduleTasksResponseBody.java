// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScheduleTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScheduleTasksResponseBody</p>
 */
public class DescribeScheduleTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The result data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned for the request.</p>
         * <blockquote>
         * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>936C7025-27A5-4CB1-BB31-540E1F0CCA12</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeScheduleTasksResponseBody build() {
            return new DescribeScheduleTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScheduleTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScheduleTasksResponseBody</p>
     */
    public static class TimerInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("CrontabJobId")
        private String crontabJobId;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DbClusterDescription")
        private String dbClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DbClusterStatus")
        private String dbClusterStatus;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PlannedEndTime")
        private String plannedEndTime;

        @com.aliyun.core.annotation.NameInMap("PlannedFlashingOffTime")
        private String plannedFlashingOffTime;

        @com.aliyun.core.annotation.NameInMap("PlannedStartTime")
        private String plannedStartTime;

        @com.aliyun.core.annotation.NameInMap("PlannedTime")
        private String plannedTime;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskCancel")
        private Boolean taskCancel;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private TimerInfos(Builder builder) {
            this.action = builder.action;
            this.crontabJobId = builder.crontabJobId;
            this.DBClusterId = builder.DBClusterId;
            this.dbClusterDescription = builder.dbClusterDescription;
            this.dbClusterStatus = builder.dbClusterStatus;
            this.orderId = builder.orderId;
            this.plannedEndTime = builder.plannedEndTime;
            this.plannedFlashingOffTime = builder.plannedFlashingOffTime;
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
         * @return crontabJobId
         */
        public String getCrontabJobId() {
            return this.crontabJobId;
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
         * @return plannedFlashingOffTime
         */
        public String getPlannedFlashingOffTime() {
            return this.plannedFlashingOffTime;
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
            private String crontabJobId; 
            private String DBClusterId; 
            private String dbClusterDescription; 
            private String dbClusterStatus; 
            private String orderId; 
            private String plannedEndTime; 
            private String plannedFlashingOffTime; 
            private String plannedStartTime; 
            private String plannedTime; 
            private String region; 
            private String status; 
            private Boolean taskCancel; 
            private String taskId; 

            /**
             * <p>The type of the scheduled tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateDBNodes</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The ID of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>86293c29-a03d-4872-b625-***********</p>
             */
            public Builder crontabJobId(String crontabJobId) {
                this.crontabJobId = crontabJobId;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-**************</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test_cluster</p>
             */
            public Builder dbClusterDescription(String dbClusterDescription) {
                this.dbClusterDescription = dbClusterDescription;
                return this;
            }

            /**
             * <p>The state of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder dbClusterStatus(String dbClusterStatus) {
                this.dbClusterStatus = dbClusterStatus;
                return this;
            }

            /**
             * <p>The ID of the order.</p>
             * <blockquote>
             * <p> This parameter is returned only when you set the <code>Action</code> parameter to <strong>CreateDBNodes</strong> or <strong>ModifyDBNodeClass</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>208161753******</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The latest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-28T12:30Z</p>
             */
            public Builder plannedEndTime(String plannedEndTime) {
                this.plannedEndTime = plannedEndTime;
                return this;
            }

            /**
             * PlannedFlashingOffTime.
             */
            public Builder plannedFlashingOffTime(String plannedFlashingOffTime) {
                this.plannedFlashingOffTime = plannedFlashingOffTime;
                return this;
            }

            /**
             * <p>The earliest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-28T12:00Z</p>
             */
            public Builder plannedStartTime(String plannedStartTime) {
                this.plannedStartTime = plannedStartTime;
                return this;
            }

            /**
             * <p>The expected start time of the task. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-28T12:16Z</p>
             */
            public Builder plannedTime(String plannedTime) {
                this.plannedTime = plannedTime;
                return this;
            }

            /**
             * <p>The ID of the region in which the scheduled task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The state of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the scheduled task can be canceled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder taskCancel(Boolean taskCancel) {
                this.taskCancel = taskCancel;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>53879cdb-9a00-428e-acaf-ff4cff******</p>
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
    /**
     * 
     * {@link DescribeScheduleTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScheduleTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TimerInfos")
        private java.util.List < TimerInfos> timerInfos;

        @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
             * <p>The page number of the page returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The details of the scheduled tasks.</p>
             */
            public Builder timerInfos(java.util.List < TimerInfos> timerInfos) {
                this.timerInfos = timerInfos;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
