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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the job execution.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter error: content is null.</p>
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
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The number of failed attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attempt(Integer attempt) {
                this.attempt = attempt;
                return this;
            }

            /**
             * <p>The node data timestamp. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-11 00:06:10</p>
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * <p>The total running duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The expiration time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-29 15:56:36</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The executor ID.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;Status\&quot;: \&quot;NORMAL\&quot;, \&quot;ActiveCount\&quot;: 4, \&quot;UnavailableCount\&quot;: 0, \&quot;ExpectedCount\&quot;: 4, \&quot;RiskCount\&quot;: 0}</p>
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * <p>The job execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1310630367761285120</p>
             */
            public Builder jobExecutionId(String jobExecutionId) {
                this.jobExecutionId = jobExecutionId;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>74</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>Tmall-AutoOrderReview</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The job type.</p>
             * 
             * <strong>example:</strong>
             * <p>xxljob</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The job parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/avatar/system/services/biz/payment/crontab/monitorpayment.php</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The returned result.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The routing strategy. Valid values:</p>
             * <ul>
             * <li>1: round-robin</li>
             * <li>2: random</li>
             * <li>3: first</li>
             * <li>4: last</li>
             * <li>5: least frequently used</li>
             * <li>6: least recently used</li>
             * <li>7: consistent hashing</li>
             * <li>8: sharding broadcast</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder routeStrategy(Integer routeStrategy) {
                this.routeStrategy = routeStrategy;
                return this;
            }

            /**
             * <p>The job scheduling time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-11 00:06:10</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>The scheduling node.</p>
             * 
             * <strong>example:</strong>
             * <p>172.3.27.76</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The start time of the job execution. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-11 00:06:10</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The job execution status. Valid values:</p>
             * <ul>
             * <li>0: UNKNOWN.</li>
             * <li>1: WAITING.</li>
             * <li>2: READY.</li>
             * <li>3: RUNNING.</li>
             * <li>4: SUCCESS.</li>
             * <li>5: FAILED.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time type. Valid values:</p>
             * <ul>
             * <li>-1: none</li>
             * <li>1: cron</li>
             * <li>2: fixed_delay</li>
             * <li>3: fixed_rate</li>
             * <li>5: one_time</li>
             * <li>100: api</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeType(Integer timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * <p>The job trigger type. Valid values:</p>
             * <ul>
             * <li>0: unknown</li>
             * <li>1: timer_schedule</li>
             * <li>2: rerun</li>
             * <li>3: api_run</li>
             * <li>4: user_retry</li>
             * <li>5: system_retry</li>
             * <li>6: manual</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
