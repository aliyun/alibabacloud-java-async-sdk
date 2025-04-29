// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListJobExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobExecutionsResponseBody</p>
 */
public class ListJobExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListJobExecutionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobExecutionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListJobExecutionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter error: content is null.</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListJobExecutionsResponseBody build() {
            return new ListJobExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobExecutionsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Attempt")
        private Integer attempt;

        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Executor")
        private String executor;

        @com.aliyun.core.annotation.NameInMap("JobExecutionId")
        private String jobExecutionId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("RouteStrategy")
        private Integer routeStrategy;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private Integer timeType;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private Integer triggerType;

        @com.aliyun.core.annotation.NameInMap("WorkAddr")
        private String workAddr;

        private Records(Builder builder) {
            this.appName = builder.appName;
            this.attempt = builder.attempt;
            this.dataTime = builder.dataTime;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.executor = builder.executor;
            this.jobExecutionId = builder.jobExecutionId;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.jobType = builder.jobType;
            this.parameters = builder.parameters;
            this.result = builder.result;
            this.routeStrategy = builder.routeStrategy;
            this.scheduleTime = builder.scheduleTime;
            this.serverIp = builder.serverIp;
            this.status = builder.status;
            this.timeType = builder.timeType;
            this.triggerType = builder.triggerType;
            this.workAddr = builder.workAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return attempt
         */
        public Integer getAttempt() {
            return this.attempt;
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executor
         */
        public String getExecutor() {
            return this.executor;
        }

        /**
         * @return jobExecutionId
         */
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return routeStrategy
         */
        public Integer getRouteStrategy() {
            return this.routeStrategy;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return timeType
         */
        public Integer getTimeType() {
            return this.timeType;
        }

        /**
         * @return triggerType
         */
        public Integer getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return workAddr
         */
        public String getWorkAddr() {
            return this.workAddr;
        }

        public static final class Builder {
            private String appName; 
            private Integer attempt; 
            private String dataTime; 
            private Long duration; 
            private String endTime; 
            private String executor; 
            private String jobExecutionId; 
            private Long jobId; 
            private String jobName; 
            private String jobType; 
            private String parameters; 
            private String result; 
            private Integer routeStrategy; 
            private String scheduleTime; 
            private String serverIp; 
            private Integer status; 
            private Integer timeType; 
            private Integer triggerType; 
            private String workAddr; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.appName = model.appName;
                this.attempt = model.attempt;
                this.dataTime = model.dataTime;
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.executor = model.executor;
                this.jobExecutionId = model.jobExecutionId;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.jobType = model.jobType;
                this.parameters = model.parameters;
                this.result = model.result;
                this.routeStrategy = model.routeStrategy;
                this.scheduleTime = model.scheduleTime;
                this.serverIp = model.serverIp;
                this.status = model.status;
                this.timeType = model.timeType;
                this.triggerType = model.triggerType;
                this.workAddr = model.workAddr;
            } 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Attempt.
             */
            public Builder attempt(Integer attempt) {
                this.attempt = attempt;
                return this;
            }

            /**
             * DataTime.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Executor.
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * JobExecutionId.
             */
            public Builder jobExecutionId(String jobExecutionId) {
                this.jobExecutionId = jobExecutionId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * RouteStrategy.
             */
            public Builder routeStrategy(Integer routeStrategy) {
                this.routeStrategy = routeStrategy;
                return this;
            }

            /**
             * ScheduleTime.
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TimeType.
             */
            public Builder timeType(Integer timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(Integer triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * WorkAddr.
             */
            public Builder workAddr(String workAddr) {
                this.workAddr = workAddr;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobExecutionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.total = builder.total;
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
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.total = model.total;
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
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
