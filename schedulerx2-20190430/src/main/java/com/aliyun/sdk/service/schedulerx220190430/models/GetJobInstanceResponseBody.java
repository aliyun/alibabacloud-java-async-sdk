// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobInstanceResponseBody</p>
 */
public class GetJobInstanceResponseBody extends TeaModel {
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

    private GetJobInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobInstanceResponseBody create() {
        return builder().build();
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

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the job instance.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned only if the corresponding error occurs.
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetJobInstanceResponseBody build() {
            return new GetJobInstanceResponseBody(this);
        } 

    } 

    public static class JobInstanceDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Executor")
        private String executor;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private Integer timeType;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private Integer triggerType;

        @com.aliyun.core.annotation.NameInMap("WorkAddr")
        private String workAddr;

        private JobInstanceDetail(Builder builder) {
            this.dataTime = builder.dataTime;
            this.endTime = builder.endTime;
            this.executor = builder.executor;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.parameters = builder.parameters;
            this.progress = builder.progress;
            this.result = builder.result;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.timeType = builder.timeType;
            this.traceId = builder.traceId;
            this.triggerType = builder.triggerType;
            this.workAddr = builder.workAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInstanceDetail create() {
            return builder().build();
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
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
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
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
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
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
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
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
            private String dataTime; 
            private String endTime; 
            private String executor; 
            private Long instanceId; 
            private Long jobId; 
            private String jobName; 
            private String parameters; 
            private String progress; 
            private String result; 
            private String scheduleTime; 
            private String startTime; 
            private Integer status; 
            private Integer timeType; 
            private String traceId; 
            private Integer triggerType; 
            private String workAddr; 

            /**
             * The data timestamp of the job instance.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * The end time of the job execution.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The user who executes the job.
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * The job instance ID.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The job ID.
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
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The progress of the job instance.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The execution results of the job instance.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The time when the job was scheduled to run.
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * The start time of the job execution.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the job instance. Valid values:
             * <p>
             * 
             * *   **1**: The job instance is waiting for execution.
             * *   **3**: The job instance is running.
             * *   **4**: The job instance is successful.
             * *   **5**: The job instance failed.
             * *   **9**: The job instance is rejected.
             * 
             * Enumeration class: com.alibaba.schedulerx.common.domain.InstanceStatus
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The method that is used to specify the time when to schedule the job instance. Valid values:
             * <p>
             * 
             * *   **1**: cron
             * *   **3**: fix_rate
             * *   **4**: second_delay
             * *   **100**: api
             * 
             * Enumeration class: com.alibaba.schedulerx.common.domain.TimeType
             */
            public Builder timeType(Integer timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * The trigger type of the job instance. Valid values:
             * <p>
             * 
             * *   **1**: The job instance was triggered at the scheduled time.
             * *   **2**: The job instance was triggered due to data update.
             * *   **3**: The job instance was triggered by an API call.
             * *   **4**: The job instance was triggered because it is manually rerun.
             * *   **5**: The job instance was triggered because the system automatically reruns the job instance upon a system exception, such as a database exception.
             * 
             * Enumeration class: com.alibaba.schedulerx.common.domain.TriggerType
             */
            public Builder triggerType(Integer triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * The endpoint of the triggered client. The value is in the IP address:Port number format.
             */
            public Builder workAddr(String workAddr) {
                this.workAddr = workAddr;
                return this;
            }

            public JobInstanceDetail build() {
                return new JobInstanceDetail(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobInstanceDetail")
        private JobInstanceDetail jobInstanceDetail;

        private Data(Builder builder) {
            this.jobInstanceDetail = builder.jobInstanceDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobInstanceDetail
         */
        public JobInstanceDetail getJobInstanceDetail() {
            return this.jobInstanceDetail;
        }

        public static final class Builder {
            private JobInstanceDetail jobInstanceDetail; 

            /**
             * The details of the job instance.
             */
            public Builder jobInstanceDetail(JobInstanceDetail jobInstanceDetail) {
                this.jobInstanceDetail = jobInstanceDetail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
