// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobInfoResponseBody</p>
 */
public class GetJobInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetJobInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobInfoResponseBody create() {
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
         * The details of the job.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned only if an error occurs.
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
         * Indicates whether the job details were obtained. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetJobInfoResponseBody build() {
            return new GetJobInfoResponseBody(this);
        } 

    } 

    public static class ContactInfo extends TeaModel {
        @NameInMap("Ding")
        private String ding;

        @NameInMap("UserMail")
        private String userMail;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserPhone")
        private String userPhone;

        private ContactInfo(Builder builder) {
            this.ding = builder.ding;
            this.userMail = builder.userMail;
            this.userName = builder.userName;
            this.userPhone = builder.userPhone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactInfo create() {
            return builder().build();
        }

        /**
         * @return ding
         */
        public String getDing() {
            return this.ding;
        }

        /**
         * @return userMail
         */
        public String getUserMail() {
            return this.userMail;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userPhone
         */
        public String getUserPhone() {
            return this.userPhone;
        }

        public static final class Builder {
            private String ding; 
            private String userMail; 
            private String userName; 
            private String userPhone; 

            /**
             * The webhook URL of the DingTalk chatbot.
             */
            public Builder ding(String ding) {
                this.ding = ding;
                return this;
            }

            /**
             * The email address of the alert contact.
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * The name of the alert contact.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The mobile phone number of the alert contact.
             */
            public Builder userPhone(String userPhone) {
                this.userPhone = userPhone;
                return this;
            }

            public ContactInfo build() {
                return new ContactInfo(this);
            } 

        } 

    }
    public static class MonitorConfig extends TeaModel {
        @NameInMap("FailEnable")
        private Boolean failEnable;

        @NameInMap("MissWorkerEnable")
        private Boolean missWorkerEnable;

        @NameInMap("SendChannel")
        private String sendChannel;

        @NameInMap("Timeout")
        private Long timeout;

        @NameInMap("TimeoutEnable")
        private Boolean timeoutEnable;

        @NameInMap("TimeoutKillEnable")
        private Boolean timeoutKillEnable;

        private MonitorConfig(Builder builder) {
            this.failEnable = builder.failEnable;
            this.missWorkerEnable = builder.missWorkerEnable;
            this.sendChannel = builder.sendChannel;
            this.timeout = builder.timeout;
            this.timeoutEnable = builder.timeoutEnable;
            this.timeoutKillEnable = builder.timeoutKillEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorConfig create() {
            return builder().build();
        }

        /**
         * @return failEnable
         */
        public Boolean getFailEnable() {
            return this.failEnable;
        }

        /**
         * @return missWorkerEnable
         */
        public Boolean getMissWorkerEnable() {
            return this.missWorkerEnable;
        }

        /**
         * @return sendChannel
         */
        public String getSendChannel() {
            return this.sendChannel;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return timeoutEnable
         */
        public Boolean getTimeoutEnable() {
            return this.timeoutEnable;
        }

        /**
         * @return timeoutKillEnable
         */
        public Boolean getTimeoutKillEnable() {
            return this.timeoutKillEnable;
        }

        public static final class Builder {
            private Boolean failEnable; 
            private Boolean missWorkerEnable; 
            private String sendChannel; 
            private Long timeout; 
            private Boolean timeoutEnable; 
            private Boolean timeoutKillEnable; 

            /**
             * Indicates whether the Failure alarm switch was turned on. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder failEnable(Boolean failEnable) {
                this.failEnable = failEnable;
                return this;
            }

            /**
             * Indicates whether the No machine alarm available switch was turned on.
             */
            public Builder missWorkerEnable(Boolean missWorkerEnable) {
                this.missWorkerEnable = missWorkerEnable;
                return this;
            }

            /**
             * The method used to send alerts. Only Short Message Service (SMS) is supported.
             */
            public Builder sendChannel(String sendChannel) {
                this.sendChannel = sendChannel;
                return this;
            }

            /**
             * The timeout threshold. Default value: 7200. Unit: seconds.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Indicates whether the Timeout alarm switch was turned on. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder timeoutEnable(Boolean timeoutEnable) {
                this.timeoutEnable = timeoutEnable;
                return this;
            }

            /**
             * Indicates whether the Timeout termination switch was turned on. The switch is turned off by default.
             */
            public Builder timeoutKillEnable(Boolean timeoutKillEnable) {
                this.timeoutKillEnable = timeoutKillEnable;
                return this;
            }

            public MonitorConfig build() {
                return new MonitorConfig(this);
            } 

        } 

    }
    public static class JobMonitorInfo extends TeaModel {
        @NameInMap("ContactInfo")
        private java.util.List < ContactInfo> contactInfo;

        @NameInMap("MonitorConfig")
        private MonitorConfig monitorConfig;

        private JobMonitorInfo(Builder builder) {
            this.contactInfo = builder.contactInfo;
            this.monitorConfig = builder.monitorConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobMonitorInfo create() {
            return builder().build();
        }

        /**
         * @return contactInfo
         */
        public java.util.List < ContactInfo> getContactInfo() {
            return this.contactInfo;
        }

        /**
         * @return monitorConfig
         */
        public MonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

        public static final class Builder {
            private java.util.List < ContactInfo> contactInfo; 
            private MonitorConfig monitorConfig; 

            /**
             * The alert contact Information.
             */
            public Builder contactInfo(java.util.List < ContactInfo> contactInfo) {
                this.contactInfo = contactInfo;
                return this;
            }

            /**
             * The configurations of the alerting features and the alert thresholds.
             */
            public Builder monitorConfig(MonitorConfig monitorConfig) {
                this.monitorConfig = monitorConfig;
                return this;
            }

            public JobMonitorInfo build() {
                return new JobMonitorInfo(this);
            } 

        } 

    }
    public static class MapTaskXAttrs extends TeaModel {
        @NameInMap("ConsumerSize")
        private Integer consumerSize;

        @NameInMap("DispatcherSize")
        private Integer dispatcherSize;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("QueueSize")
        private Integer queueSize;

        @NameInMap("TaskAttemptInterval")
        private Integer taskAttemptInterval;

        @NameInMap("TaskMaxAttempt")
        private Integer taskMaxAttempt;

        private MapTaskXAttrs(Builder builder) {
            this.consumerSize = builder.consumerSize;
            this.dispatcherSize = builder.dispatcherSize;
            this.pageSize = builder.pageSize;
            this.queueSize = builder.queueSize;
            this.taskAttemptInterval = builder.taskAttemptInterval;
            this.taskMaxAttempt = builder.taskMaxAttempt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MapTaskXAttrs create() {
            return builder().build();
        }

        /**
         * @return consumerSize
         */
        public Integer getConsumerSize() {
            return this.consumerSize;
        }

        /**
         * @return dispatcherSize
         */
        public Integer getDispatcherSize() {
            return this.dispatcherSize;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return queueSize
         */
        public Integer getQueueSize() {
            return this.queueSize;
        }

        /**
         * @return taskAttemptInterval
         */
        public Integer getTaskAttemptInterval() {
            return this.taskAttemptInterval;
        }

        /**
         * @return taskMaxAttempt
         */
        public Integer getTaskMaxAttempt() {
            return this.taskMaxAttempt;
        }

        public static final class Builder {
            private Integer consumerSize; 
            private Integer dispatcherSize; 
            private Integer pageSize; 
            private Integer queueSize; 
            private Integer taskAttemptInterval; 
            private Integer taskMaxAttempt; 

            /**
             * The number of threads that were triggered by a single worker at a time. Default value: 5.
             */
            public Builder consumerSize(Integer consumerSize) {
                this.consumerSize = consumerSize;
                return this;
            }

            /**
             * The number of task distribution threads. Default value: 5.
             */
            public Builder dispatcherSize(Integer dispatcherSize) {
                this.dispatcherSize = dispatcherSize;
                return this;
            }

            /**
             * The number of tasks that were pulled by a parallel job at a time. Default value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The maximum number of tasks that can be queued. Default value: 10000.
             */
            public Builder queueSize(Integer queueSize) {
                this.queueSize = queueSize;
                return this;
            }

            /**
             * The interval at which the system retried to run the task after a task failure.
             */
            public Builder taskAttemptInterval(Integer taskAttemptInterval) {
                this.taskAttemptInterval = taskAttemptInterval;
                return this;
            }

            /**
             * The number of retries after a task failure.
             */
            public Builder taskMaxAttempt(Integer taskMaxAttempt) {
                this.taskMaxAttempt = taskMaxAttempt;
                return this;
            }

            public MapTaskXAttrs build() {
                return new MapTaskXAttrs(this);
            } 

        } 

    }
    public static class TimeConfig extends TeaModel {
        @NameInMap("Calendar")
        private String calendar;

        @NameInMap("DataOffset")
        private Integer dataOffset;

        @NameInMap("TimeExpression")
        private String timeExpression;

        @NameInMap("TimeType")
        private Integer timeType;

        private TimeConfig(Builder builder) {
            this.calendar = builder.calendar;
            this.dataOffset = builder.dataOffset;
            this.timeExpression = builder.timeExpression;
            this.timeType = builder.timeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeConfig create() {
            return builder().build();
        }

        /**
         * @return calendar
         */
        public String getCalendar() {
            return this.calendar;
        }

        /**
         * @return dataOffset
         */
        public Integer getDataOffset() {
            return this.dataOffset;
        }

        /**
         * @return timeExpression
         */
        public String getTimeExpression() {
            return this.timeExpression;
        }

        /**
         * @return timeType
         */
        public Integer getTimeType() {
            return this.timeType;
        }

        public static final class Builder {
            private String calendar; 
            private Integer dataOffset; 
            private String timeExpression; 
            private Integer timeType; 

            /**
             * Custom calendar days specified if TimeType is set to **1** (cron).
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * The time offset specified if TimeType is set to **1** (cron). Unit: seconds.
             */
            public Builder dataOffset(Integer dataOffset) {
                this.dataOffset = dataOffset;
                return this;
            }

            /**
             * The time expression specified based on the value of TimeType:
             * <p>
             * 
             * *   If TimeType is set to **100** (api), no time expression is required.
             * *   If TimeType is set to **3** (fix_rate), this parameter value indicates the specific and fixed frequency. For example, if the value is 30, the system triggers a job every 30 seconds.
             * *   If TimeType is set to **1** (cron), this parameter value indicates the standard CRON expression used to specify the time when to schedule the job.
             * *   If TimeType is set to **4** (second_delay), this parameter value indicates the fixed delay after which the job is triggered. Valid values: 1 to 60. Unit: seconds.
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * The time type. Valid values:
             * <p>
             * 
             * *   **1**: cron
             * *   **3**: fix_rate
             * *   **4**: second_delay
             * *   **5**: one_time
             * *   **100**: api
             */
            public Builder timeType(Integer timeType) {
                this.timeType = timeType;
                return this;
            }

            public TimeConfig build() {
                return new TimeConfig(this);
            } 

        } 

    }
    public static class JobConfigInfo extends TeaModel {
        @NameInMap("AttemptInterval")
        private Integer attemptInterval;

        @NameInMap("ClassName")
        private String className;

        @NameInMap("Content")
        private String content;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExecuteMode")
        private String executeMode;

        @NameInMap("JarUrl")
        private String jarUrl;

        @NameInMap("JobId")
        private Long jobId;

        @NameInMap("JobMonitorInfo")
        private JobMonitorInfo jobMonitorInfo;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MapTaskXAttrs")
        private MapTaskXAttrs mapTaskXAttrs;

        @NameInMap("MaxAttempt")
        private Integer maxAttempt;

        @NameInMap("MaxConcurrency")
        private String maxConcurrency;

        @NameInMap("Name")
        private String name;

        @NameInMap("Parameters")
        private String parameters;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TimeConfig")
        private TimeConfig timeConfig;

        @NameInMap("XAttrs")
        private String xAttrs;

        private JobConfigInfo(Builder builder) {
            this.attemptInterval = builder.attemptInterval;
            this.className = builder.className;
            this.content = builder.content;
            this.description = builder.description;
            this.executeMode = builder.executeMode;
            this.jarUrl = builder.jarUrl;
            this.jobId = builder.jobId;
            this.jobMonitorInfo = builder.jobMonitorInfo;
            this.jobType = builder.jobType;
            this.mapTaskXAttrs = builder.mapTaskXAttrs;
            this.maxAttempt = builder.maxAttempt;
            this.maxConcurrency = builder.maxConcurrency;
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.status = builder.status;
            this.timeConfig = builder.timeConfig;
            this.xAttrs = builder.xAttrs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobConfigInfo create() {
            return builder().build();
        }

        /**
         * @return attemptInterval
         */
        public Integer getAttemptInterval() {
            return this.attemptInterval;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return executeMode
         */
        public String getExecuteMode() {
            return this.executeMode;
        }

        /**
         * @return jarUrl
         */
        public String getJarUrl() {
            return this.jarUrl;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobMonitorInfo
         */
        public JobMonitorInfo getJobMonitorInfo() {
            return this.jobMonitorInfo;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return mapTaskXAttrs
         */
        public MapTaskXAttrs getMapTaskXAttrs() {
            return this.mapTaskXAttrs;
        }

        /**
         * @return maxAttempt
         */
        public Integer getMaxAttempt() {
            return this.maxAttempt;
        }

        /**
         * @return maxConcurrency
         */
        public String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return timeConfig
         */
        public TimeConfig getTimeConfig() {
            return this.timeConfig;
        }

        /**
         * @return xAttrs
         */
        public String getXAttrs() {
            return this.xAttrs;
        }

        public static final class Builder {
            private Integer attemptInterval; 
            private String className; 
            private String content; 
            private String description; 
            private String executeMode; 
            private String jarUrl; 
            private Long jobId; 
            private JobMonitorInfo jobMonitorInfo; 
            private String jobType; 
            private MapTaskXAttrs mapTaskXAttrs; 
            private Integer maxAttempt; 
            private String maxConcurrency; 
            private String name; 
            private String parameters; 
            private Integer status; 
            private TimeConfig timeConfig; 
            private String xAttrs; 

            /**
             * The interval at which the system retried to run the job after a job failure. Default value: 30. Unit: seconds.
             */
            public Builder attemptInterval(Integer attemptInterval) {
                this.attemptInterval = attemptInterval;
                return this;
            }

            /**
             * The full path of the job interface class. This parameter is returned only for jobs whose job type is Java.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * The script of a script job.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The description of the job.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The execution mode of the job. Valid values:
             * <p>
             * 
             * *   **Stand-alone operation**
             * *   **Broadcast run**
             * *   **Visual MapReduce**
             * *   **MapReduce**
             * *   ****
             * *   **Shard run**
             */
            public Builder executeMode(String executeMode) {
                this.executeMode = executeMode;
                return this;
            }

            /**
             * The full path used to upload files to Object Storage Service (OSS).
             * <p>
             * 
             * If you use a JAR package, you can upload the JAR package to this OSS path.
             */
            public Builder jarUrl(String jarUrl) {
                this.jarUrl = jarUrl;
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
             * The monitoring information of the job.
             */
            public Builder jobMonitorInfo(JobMonitorInfo jobMonitorInfo) {
                this.jobMonitorInfo = jobMonitorInfo;
                return this;
            }

            /**
             * The job type.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The advanced configurations of the job.
             */
            public Builder mapTaskXAttrs(MapTaskXAttrs mapTaskXAttrs) {
                this.mapTaskXAttrs = mapTaskXAttrs;
                return this;
            }

            /**
             * The maximum number of retries after a job failure. This parameter was specified based on your business requirements. Default value: 0.
             */
            public Builder maxAttempt(Integer maxAttempt) {
                this.maxAttempt = maxAttempt;
                return this;
            }

            /**
             * The maximum number of concurrent instances. Default value: 1. The default value indicates that if the last triggered instance is running, the next instance is not triggered even if the scheduled point in time for running the next instance is reached.
             */
            public Builder maxConcurrency(String maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * The job name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The user-defined parameters that you can obtain when the job is running.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Indicates whether the job was enabled. Valid values:
             * <p>
             * 
             * *   **1**: The job was enabled and could be triggered.
             * *   **0**: The job was disabled and could not be triggered.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The time configurations.
             */
            public Builder timeConfig(TimeConfig timeConfig) {
                this.timeConfig = timeConfig;
                return this;
            }

            /**
             * The extended fields.
             */
            public Builder xAttrs(String xAttrs) {
                this.xAttrs = xAttrs;
                return this;
            }

            public JobConfigInfo build() {
                return new JobConfigInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("JobConfigInfo")
        private JobConfigInfo jobConfigInfo;

        private Data(Builder builder) {
            this.jobConfigInfo = builder.jobConfigInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobConfigInfo
         */
        public JobConfigInfo getJobConfigInfo() {
            return this.jobConfigInfo;
        }

        public static final class Builder {
            private JobConfigInfo jobConfigInfo; 

            /**
             * The configurations of the job.
             */
            public Builder jobConfigInfo(JobConfigInfo jobConfigInfo) {
                this.jobConfigInfo = jobConfigInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
