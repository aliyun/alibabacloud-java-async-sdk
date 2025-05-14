// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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

        private Builder(GetJobInstanceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the job instance.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned only if the corresponding error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>jobid: 92583 not match groupId: testSchedulerx.defaultGroup</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4F68ABED-AC31-4412-9297-D9A8F0401108</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetJobInstanceResponseBody build() {
            return new GetJobInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInstanceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(JobInstanceDetail model) {
                this.dataTime = model.dataTime;
                this.endTime = model.endTime;
                this.executor = model.executor;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.parameters = model.parameters;
                this.progress = model.progress;
                this.result = model.result;
                this.scheduleTime = model.scheduleTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.timeType = model.timeType;
                this.traceId = model.traceId;
                this.triggerType = model.triggerType;
                this.workAddr = model.workAddr;
            } 

            /**
             * <p>The data timestamp of the job instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-27 11:52:10</p>
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * <p>The end time of the job execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-27 11:52:10</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The user who executes the job.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * <p>The job instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11111111</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>92583</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>ManualJob</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The parameters of the job instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;alertId&quot;:11111}</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The progress of the job instance.</p>
             * 
             * <strong>example:</strong>
             * <p>complete</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The execution results of the job instance.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The time when the job was scheduled to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-27 11:52:10</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>The start time of the job execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-27 11:52:10</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the job instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The job instance is waiting for execution.</li>
             * <li><strong>3</strong>: The job instance is running.</li>
             * <li><strong>4</strong>: The job instance is successful.</li>
             * <li><strong>5</strong>: The job instance failed.</li>
             * <li><strong>9</strong>: The job instance is rejected.</li>
             * </ul>
             * <p>Enumeration class: com.alibaba.schedulerx.common.domain.InstanceStatus</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The method that is used to specify the time when to schedule the job instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: cron</li>
             * <li><strong>3</strong>: fix_rate</li>
             * <li><strong>4</strong>: second_delay</li>
             * <li><strong>100</strong>: api</li>
             * </ul>
             * <p>Enumeration class: com.alibaba.schedulerx.common.domain.TimeType</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeType(Integer timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * <p>The trace ID, which can be used to query trace details.</p>
             * 
             * <strong>example:</strong>
             * <p>210e845016596663430048015d0a2c</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * <p>The trigger type of the job instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The job instance was triggered at the scheduled time.</li>
             * <li><strong>2</strong>: The job instance was triggered due to data update.</li>
             * <li><strong>3</strong>: The job instance was triggered by an API call.</li>
             * <li><strong>4</strong>: The job instance was triggered because it is manually rerun.</li>
             * <li><strong>5</strong>: The job instance was triggered because the system automatically reruns the job instance upon a system exception, such as a database exception.</li>
             * </ul>
             * <p>Enumeration class: com.alibaba.schedulerx.common.domain.TriggerType</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder triggerType(Integer triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The endpoint of the triggered client. The value is in the IP address:Port number format.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0:16</p>
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
    /**
     * 
     * {@link GetJobInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInstanceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobInstanceDetail = model.jobInstanceDetail;
            } 

            /**
             * <p>The details of the job instance.</p>
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
