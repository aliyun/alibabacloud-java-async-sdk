// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobInfoResponseBody</p>
 */
public class GetJobInfoResponseBody extends TeaModel {
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
         * <p>The details of the job.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned only if an error occurs.</p>
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
         * <p>Indicates whether the job details were obtained. Valid values:</p>
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

        public GetJobInfoResponseBody build() {
            return new GetJobInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
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
             * <p>The webhook URL of the DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=XXXXXX">https://oapi.dingtalk.com/robot/send?access_token=XXXXXX</a></p>
             */
            public Builder ding(String ding) {
                this.ding = ding;
                return this;
            }

            /**
             * <p>The email address of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user@demo.com">user@demo.com</a></p>
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * <p>The name of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The mobile phone number of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
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
    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
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
             * <p>Indicates whether the Failure alarm switch was turned on. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder failEnable(Boolean failEnable) {
                this.failEnable = failEnable;
                return this;
            }

            /**
             * <p>Indicates whether the No machine alarm available switch was turned on.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder missWorkerEnable(Boolean missWorkerEnable) {
                this.missWorkerEnable = missWorkerEnable;
                return this;
            }

            /**
             * <p>The method used to send alerts. Only Short Message Service (SMS) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>sms</p>
             */
            public Builder sendChannel(String sendChannel) {
                this.sendChannel = sendChannel;
                return this;
            }

            /**
             * <p>The timeout threshold. Default value: 7200. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12300</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>Indicates whether the Timeout alarm switch was turned on. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder timeoutEnable(Boolean timeoutEnable) {
                this.timeoutEnable = timeoutEnable;
                return this;
            }

            /**
             * <p>Indicates whether the Timeout termination switch was turned on. The switch is turned off by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
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
             * <p>The alert contact Information.</p>
             */
            public Builder contactInfo(java.util.List < ContactInfo> contactInfo) {
                this.contactInfo = contactInfo;
                return this;
            }

            /**
             * <p>The configurations of the alerting features and the alert thresholds.</p>
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
    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
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
             * <p>The number of threads that were triggered by a single worker at a time. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder consumerSize(Integer consumerSize) {
                this.consumerSize = consumerSize;
                return this;
            }

            /**
             * <p>The number of task distribution threads. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder dispatcherSize(Integer dispatcherSize) {
                this.dispatcherSize = dispatcherSize;
                return this;
            }

            /**
             * <p>The number of tasks that were pulled by a parallel job at a time. Default value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The maximum number of tasks that can be queued. Default value: 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder queueSize(Integer queueSize) {
                this.queueSize = queueSize;
                return this;
            }

            /**
             * <p>The interval at which the system retried to run the task after a task failure.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskAttemptInterval(Integer taskAttemptInterval) {
                this.taskAttemptInterval = taskAttemptInterval;
                return this;
            }

            /**
             * <p>The number of retries after a task failure.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
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
             * <p>Custom calendar days specified if TimeType is set to <strong>1</strong> (cron).</p>
             * 
             * <strong>example:</strong>
             * <p>Business days</p>
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * <p>The time offset specified if TimeType is set to <strong>1</strong> (cron). Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataOffset(Integer dataOffset) {
                this.dataOffset = dataOffset;
                return this;
            }

            /**
             * <p>The time expression specified based on the value of TimeType:</p>
             * <ul>
             * <li>If TimeType is set to <strong>100</strong> (api), no time expression is required.</li>
             * <li>If TimeType is set to <strong>3</strong> (fix_rate), this parameter value indicates the specific and fixed frequency. For example, if the value is 30, the system triggers a job every 30 seconds.</li>
             * <li>If TimeType is set to <strong>1</strong> (cron), this parameter value indicates the standard CRON expression used to specify the time when to schedule the job.</li>
             * <li>If TimeType is set to <strong>4</strong> (second_delay), this parameter value indicates the fixed delay after which the job is triggered. Valid values: 1 to 60. Unit: seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0 0/10 * * * ?</p>
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * <p>The time type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: cron</li>
             * <li><strong>3</strong>: fix_rate</li>
             * <li><strong>4</strong>: second_delay</li>
             * <li><strong>5</strong>: one_time</li>
             * <li><strong>100</strong>: api</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
    public static class JobConfigInfo extends TeaModel {
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
             * <p>The interval at which the system retried to run the job after a job failure. Default value: 30. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder attemptInterval(Integer attemptInterval) {
                this.attemptInterval = attemptInterval;
                return this;
            }

            /**
             * <p>The full path of the job interface class. This parameter is returned only for jobs whose job type is Java.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.test.helloword</p>
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * <p>The script of a script job.</p>
             * 
             * <strong>example:</strong>
             * <p>echo &quot;clear&quot; &gt; /home/admin/edas-container/logs/catalina.out</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The description of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The execution mode of the job. Valid values:</p>
             * <ul>
             * <li><strong>Stand-alone operation</strong></li>
             * <li><strong>Broadcast run</strong></li>
             * <li><strong>Visual MapReduce</strong></li>
             * <li><strong>MapReduce</strong></li>
             * <li><strong>Shard run</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standalone</p>
             */
            public Builder executeMode(String executeMode) {
                this.executeMode = executeMode;
                return this;
            }

            /**
             * <p>The full path used to upload files to Object Storage Service (OSS).</p>
             * <p>If you use a JAR package, you can upload the JAR package to this OSS path.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/schedulerX/test.jar">https://test.oss-cn-hangzhou.aliyuncs.com/schedulerX/test.jar</a></p>
             */
            public Builder jarUrl(String jarUrl) {
                this.jarUrl = jarUrl;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>538039</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The monitoring information of the job.</p>
             */
            public Builder jobMonitorInfo(JobMonitorInfo jobMonitorInfo) {
                this.jobMonitorInfo = jobMonitorInfo;
                return this;
            }

            /**
             * <p>The job type.</p>
             * 
             * <strong>example:</strong>
             * <p>java</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The advanced configurations of the job.</p>
             */
            public Builder mapTaskXAttrs(MapTaskXAttrs mapTaskXAttrs) {
                this.mapTaskXAttrs = mapTaskXAttrs;
                return this;
            }

            /**
             * <p>The maximum number of retries after a job failure. This parameter was specified based on your business requirements. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxAttempt(Integer maxAttempt) {
                this.maxAttempt = maxAttempt;
                return this;
            }

            /**
             * <p>The maximum number of concurrent instances. Default value: 1. The default value indicates that if the last triggered instance is running, the next instance is not triggered even if the scheduled point in time for running the next instance is reached.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxConcurrency(String maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>helloworld</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user-defined parameters that you can obtain when the job is running.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>Indicates whether the job was enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The job was enabled and could be triggered.</li>
             * <li><strong>0</strong>: The job was disabled and could not be triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time configurations.</p>
             */
            public Builder timeConfig(TimeConfig timeConfig) {
                this.timeConfig = timeConfig;
                return this;
            }

            /**
             * <p>The extended fields.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;pageSize&quot;:5,&quot;queueSize&quot;:10,&quot;consumerSize&quot;:5,&quot;dispatcherSize&quot;:5,&quot;taskMaxAttempt&quot;:0,&quot;taskAttemptInterval&quot;:0,&quot;globalConsumerSize&quot;:1000,&quot;taskDispatchMode&quot;:&quot;push&quot;}</p>
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
    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobConfigInfo")
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
             * <p>The configurations of the job.</p>
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
