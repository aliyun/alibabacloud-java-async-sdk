// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsResponseBody</p>
 */
public class ListJobsResponseBody extends TeaModel {
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

    private ListJobsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsResponseBody create() {
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
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the jobs.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned if an error occurs.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   **true**: The call is successful.
         * *   **false**: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    public static class ContactInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ding")
        private String ding;

        @com.aliyun.core.annotation.NameInMap("UserMail")
        private String userMail;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserPhone")
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
             * The email address of the user.
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * The username.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The mobile number of the user.
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
        @com.aliyun.core.annotation.NameInMap("FailEnable")
        private Boolean failEnable;

        @com.aliyun.core.annotation.NameInMap("MissWorkerEnable")
        private Boolean missWorkerEnable;

        @com.aliyun.core.annotation.NameInMap("SendChannel")
        private String sendChannel;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("TimeoutEnable")
        private Boolean timeoutEnable;

        @com.aliyun.core.annotation.NameInMap("TimeoutKillEnable")
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
             * Indicates whether the feature of generating an alert upon a failure is enabled. Valid values:
             * <p>
             * 
             * *   **true**: The feature is enabled.
             * *   **false**: The feature is disabled.
             */
            public Builder failEnable(Boolean failEnable) {
                this.failEnable = failEnable;
                return this;
            }

            /**
             * Indicates whether the feature of generating an alert when no machine is available for running the job is enabled.
             */
            public Builder missWorkerEnable(Boolean missWorkerEnable) {
                this.missWorkerEnable = missWorkerEnable;
                return this;
            }

            /**
             * The method that is used to send an alert notification. Only Short Message Service (SMS) is supported.
             */
            public Builder sendChannel(String sendChannel) {
                this.sendChannel = sendChannel;
                return this;
            }

            /**
             * The timeout threshold. Unit: seconds. Default value: 7200.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Indicates whether the feature of generating an alert upon a timeout is enabled. Valid values:
             * <p>
             * 
             * *   **true**: The feature is enabled.
             * *   **false**: The feature is disabled.
             */
            public Builder timeoutEnable(Boolean timeoutEnable) {
                this.timeoutEnable = timeoutEnable;
                return this;
            }

            /**
             * Indicates whether the feature of stopping job triggering upon a timeout is enabled. By default, the feature is disabled.
             * <p>
             * 
             * *   **true**: The feature is enabled.
             * *   **false**: The feature is disabled.
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
        @com.aliyun.core.annotation.NameInMap("ContactInfo")
        private java.util.List < ContactInfo> contactInfo;

        @com.aliyun.core.annotation.NameInMap("MonitorConfig")
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
             * The contact information.
             */
            public Builder contactInfo(java.util.List < ContactInfo> contactInfo) {
                this.contactInfo = contactInfo;
                return this;
            }

            /**
             * The configurations of the alerting feature and the alert threshold.
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
        @com.aliyun.core.annotation.NameInMap("ConsumerSize")
        private Integer consumerSize;

        @com.aliyun.core.annotation.NameInMap("DispatcherSize")
        private Integer dispatcherSize;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("QueueSize")
        private Integer queueSize;

        @com.aliyun.core.annotation.NameInMap("TaskAttemptInterval")
        private Integer taskAttemptInterval;

        @com.aliyun.core.annotation.NameInMap("TaskMaxAttempt")
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
             * The number of threads that are triggered by a standalone job at a time. Default value: 5.
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
             * The number of tasks that are pulled by a parallel job at a time. Default value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The maximum number of task queues that can be cached. Default value: 10000.
             */
            public Builder queueSize(Integer queueSize) {
                this.queueSize = queueSize;
                return this;
            }

            /**
             * The interval at which the system retries to run the task after a task failure.
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
        @com.aliyun.core.annotation.NameInMap("Calendar")
        private String calendar;

        @com.aliyun.core.annotation.NameInMap("DataOffset")
        private Integer dataOffset;

        @com.aliyun.core.annotation.NameInMap("TimeExpression")
        private String timeExpression;

        @com.aliyun.core.annotation.NameInMap("TimeType")
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
             * If the TimeType parameter is set to cron, you can specify custom calendar days.
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * The time offset if the TimeType parameter is set to cron. Unit: seconds.
             */
            public Builder dataOffset(Integer dataOffset) {
                this.dataOffset = dataOffset;
                return this;
            }

            /**
             * The time expression. Valid values:
             * <p>
             * 
             * *   **api**: indicates that no time expression is used to specify the time when to schedule the job.
             * *   **fix_rate**: indicates that the job is triggered at a fixed frequency. For example, a value of 30 indicates that the job is triggered every 30 seconds.
             * *   **cron**: indicates that a standard CRON expression is used to specify the time when to schedule the job.
             * *   **second_delay**: indicates that the job is triggered after a fixed delay. Valid values: 1 to 60. Unit: seconds.
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * The method that is used to specify the time when to schedule the job. Valid values:
             * <p>
             * 
             * *   **1**: cron
             * *   **3**: fix_rate
             * *   **4**: second_delay
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
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttemptInterval")
        private Integer attemptInterval;

        @com.aliyun.core.annotation.NameInMap("ClassName")
        private String className;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExecuteMode")
        private String executeMode;

        @com.aliyun.core.annotation.NameInMap("JarUrl")
        private String jarUrl;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("JobMonitorInfo")
        private JobMonitorInfo jobMonitorInfo;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MapTaskXAttrs")
        private MapTaskXAttrs mapTaskXAttrs;

        @com.aliyun.core.annotation.NameInMap("MaxAttempt")
        private Integer maxAttempt;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private String maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimeConfig")
        private TimeConfig timeConfig;

        @com.aliyun.core.annotation.NameInMap("XAttrs")
        private String xAttrs;

        private Jobs(Builder builder) {
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

        public static Jobs create() {
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
             * The interval at which the system retries to run the job after a job failure. Unit: seconds. Default value: 30.
             */
            public Builder attemptInterval(Integer attemptInterval) {
                this.attemptInterval = attemptInterval;
                return this;
            }

            /**
             * The full path of the job interface class. This parameter is returned only for a Java job.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * The script of the job. This parameter is returned only for a Python, Shell, or Go job.
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
             * *   **standalone**: The job runs in standalone mode.
             * *   **broadcast**: The job runs in broadcast mode.
             * *   **parallel**: The job runs in parallel computing mode.
             * *   **grid**: The job runs in memory grid mode.
             * *   **batch**: The job runs in grid computing mode.
             * *   **shard**: The job runs in multipart mode.
             */
            public Builder executeMode(String executeMode) {
                this.executeMode = executeMode;
                return this;
            }

            /**
             * The full path to which a JAR package is uploaded in Object Storage Service (OSS).
             */
            public Builder jarUrl(String jarUrl) {
                this.jarUrl = jarUrl;
                return this;
            }

            /**
             * The ID of the job.
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
             * The type of the job.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The advanced configurations of the job. The parameters are returned only if the value of the ExecuteMode parameter is parallel, grid, or batch.
             */
            public Builder mapTaskXAttrs(MapTaskXAttrs mapTaskXAttrs) {
                this.mapTaskXAttrs = mapTaskXAttrs;
                return this;
            }

            /**
             * The maximum number of retries after a job failure. This parameter is specified based on your business requirements. Default value: 0.
             */
            public Builder maxAttempt(Integer maxAttempt) {
                this.maxAttempt = maxAttempt;
                return this;
            }

            /**
             * The maximum number of instances that can concurrently run for the job. Default value: 1. A value of 1 indicates that if the last triggered instance is running, the next instance is not triggered even if the scheduled point in time for running the instance is reached.
             */
            public Builder maxConcurrency(String maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * The name of the job.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The user-defined parameters. These parameters can be obtained when the job is running.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Indicates whether the job is enabled. Valid values:
             * <p>
             * 
             * *   **1**: The job is enabled and can be triggered.
             * *   **0**: The job is disabled and cannot be triggered.
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

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Jobs")
        private java.util.List < Jobs> jobs;

        private Data(Builder builder) {
            this.jobs = builder.jobs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobs
         */
        public java.util.List < Jobs> getJobs() {
            return this.jobs;
        }

        public static final class Builder {
            private java.util.List < Jobs> jobs; 

            /**
             * The jobs and their details.
             */
            public Builder jobs(java.util.List < Jobs> jobs) {
                this.jobs = jobs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
