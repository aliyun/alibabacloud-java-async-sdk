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
 * {@link GetJobExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobExecutionResponseBody</p>
 */
public class GetJobExecutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetJobExecutionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobExecutionResponseBody create() {
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

        private Builder(GetJobExecutionResponseBody model) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>39938688-0BAB-5AD8-BF02-F4910FAC7589</p>
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

        public GetJobExecutionResponseBody build() {
            return new GetJobExecutionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobExecutionResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobExecutionResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private Integer timeType;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private Integer triggerType;

        private Data(Builder builder) {
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
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.timeType = builder.timeType;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
            private String startTime; 
            private Integer status; 
            private Integer timeType; 
            private Integer triggerType; 

            private Builder() {
            } 

            private Builder(Data model) {
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
                this.startTime = model.startTime;
                this.status = model.status;
                this.timeType = model.timeType;
                this.triggerType = model.triggerType;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
