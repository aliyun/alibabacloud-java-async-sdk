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

        private Builder(ListJobsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The job list information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is returned only when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace can not find namespace: 1a72ecb1-b4cc-400a-a71b-20cdec9b****, namespaceSource:null</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71BCC0E3-64B2-4B63-A870-AFB64EBCB58B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Successful.</p>
         * </li>
         * <li><p><strong>false</strong>: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ContactInfo model) {
                this.ding = model.ding;
                this.userMail = model.userMail;
                this.userName = model.userName;
                this.userPhone = model.userPhone;
            } 

            /**
             * <p>The webhook URL of the DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>**********</p>
             */
            public Builder ding(String ding) {
                this.ding = ding;
                return this;
            }

            /**
             * <p>The email address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user@mail.com">user@mail.com</a></p>
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The mobile phone number of the user.</p>
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
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MonitorConfig model) {
                this.failEnable = model.failEnable;
                this.missWorkerEnable = model.missWorkerEnable;
                this.sendChannel = model.sendChannel;
                this.timeout = model.timeout;
                this.timeoutEnable = model.timeoutEnable;
                this.timeoutKillEnable = model.timeoutKillEnable;
            } 

            /**
             * <p>Indicates whether the failure alert is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
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
             * <p>Indicates whether the no-available-machine alert is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder missWorkerEnable(Boolean missWorkerEnable) {
                this.missWorkerEnable = missWorkerEnable;
                return this;
            }

            /**
             * <p>The alert notification method. Currently, only sms is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>sms</p>
             */
            public Builder sendChannel(String sendChannel) {
                this.sendChannel = sendChannel;
                return this;
            }

            /**
             * <p>The timeout threshold. Unit: seconds. Default value: 7200.</p>
             * 
             * <strong>example:</strong>
             * <p>12300</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>Indicates whether the timeout alert is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
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
             * <p>Specifies whether to terminate the current trigger upon timeout. This feature is disabled by default. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class JobMonitorInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactInfo")
        private java.util.List<ContactInfo> contactInfo;

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
        public java.util.List<ContactInfo> getContactInfo() {
            return this.contactInfo;
        }

        /**
         * @return monitorConfig
         */
        public MonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

        public static final class Builder {
            private java.util.List<ContactInfo> contactInfo; 
            private MonitorConfig monitorConfig; 

            private Builder() {
            } 

            private Builder(JobMonitorInfo model) {
                this.contactInfo = model.contactInfo;
                this.monitorConfig = model.monitorConfig;
            } 

            /**
             * <p>The contact information.</p>
             */
            public Builder contactInfo(java.util.List<ContactInfo> contactInfo) {
                this.contactInfo = contactInfo;
                return this;
            }

            /**
             * <p>The alert switch and threshold configurations.</p>
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
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MapTaskXAttrs model) {
                this.consumerSize = model.consumerSize;
                this.dispatcherSize = model.dispatcherSize;
                this.pageSize = model.pageSize;
                this.queueSize = model.queueSize;
                this.taskAttemptInterval = model.taskAttemptInterval;
                this.taskMaxAttempt = model.taskMaxAttempt;
            } 

            /**
             * <p>The number of threads for a single trigger on a single machine. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder consumerSize(Integer consumerSize) {
                this.consumerSize = consumerSize;
                return this;
            }

            /**
             * <p>The number of subtask dispatch threads. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder dispatcherSize(Integer dispatcherSize) {
                this.dispatcherSize = dispatcherSize;
                return this;
            }

            /**
             * <p>The number of subtasks pulled per request for parallel jobs. Default value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The upper limit of the subtask queue cache. Default value: 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder queueSize(Integer queueSize) {
                this.queueSize = queueSize;
                return this;
            }

            /**
             * <p>The retry interval for failed subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskAttemptInterval(Integer taskAttemptInterval) {
                this.taskAttemptInterval = taskAttemptInterval;
                return this;
            }

            /**
             * <p>The maximum number of retries for failed subtasks.</p>
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
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TimeConfig model) {
                this.calendar = model.calendar;
                this.dataOffset = model.dataOffset;
                this.timeExpression = model.timeExpression;
                this.timeType = model.timeType;
            } 

            /**
             * <p>The custom calendar that can be specified for the cron type.</p>
             * 
             * <strong>example:</strong>
             * <p>workday</p>
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * <p>The time offset that can be specified for the cron type. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataOffset(Integer dataOffset) {
                this.dataOffset = dataOffset;
                return this;
            }

            /**
             * <p>The time expression. The following time expression types are supported:</p>
             * <ul>
             * <li><p><strong>api</strong>: No time expression.</p>
             * </li>
             * <li><p><strong>fix_rate</strong>: A fixed frequency value. For example, 30 indicates that the job is triggered every 30 seconds.</p>
             * </li>
             * <li><p><strong>cron</strong>: A standard cron expression.</p>
             * </li>
             * <li><p><strong>second_delay</strong>: A fixed delay in seconds before each execution (1s to 60s).</p>
             * </li>
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
             * <p>The time configuration type. The following time types are supported:</p>
             * <ul>
             * <li><p><strong>1</strong>: cron</p>
             * </li>
             * <li><p><strong>3</strong>: fix_rate</p>
             * </li>
             * <li><p><strong>4</strong>: second_delay</p>
             * </li>
             * <li><p><strong>100</strong>: api</p>
             * </li>
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
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttemptInterval")
        private Integer attemptInterval;

        @com.aliyun.core.annotation.NameInMap("ClassName")
        private String className;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

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

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

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
            this.endTime = builder.endTime;
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
            this.startTime = builder.startTime;
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
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
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
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
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
            private Long endTime; 
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
            private Long startTime; 
            private Integer status; 
            private TimeConfig timeConfig; 
            private String xAttrs; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.attemptInterval = model.attemptInterval;
                this.className = model.className;
                this.content = model.content;
                this.description = model.description;
                this.endTime = model.endTime;
                this.executeMode = model.executeMode;
                this.jarUrl = model.jarUrl;
                this.jobId = model.jobId;
                this.jobMonitorInfo = model.jobMonitorInfo;
                this.jobType = model.jobType;
                this.mapTaskXAttrs = model.mapTaskXAttrs;
                this.maxAttempt = model.maxAttempt;
                this.maxConcurrency = model.maxConcurrency;
                this.name = model.name;
                this.parameters = model.parameters;
                this.startTime = model.startTime;
                this.status = model.status;
                this.timeConfig = model.timeConfig;
                this.xAttrs = model.xAttrs;
            } 

            /**
             * <p>The error retry interval. Unit: seconds. Default value: 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder attemptInterval(Integer attemptInterval) {
                this.attemptInterval = attemptInterval;
                return this;
            }

            /**
             * <p>The full path of the job interface class. This field is returned only when the job is of the Java type.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.schedulerx.test.helloworld</p>
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * <p>The script code content for Python, Shell, or Go job types.</p>
             * 
             * <strong>example:</strong>
             * <p>echo \&quot;hello\&quot;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The job description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The job expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1776132529000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The job execution mode. Valid values:</p>
             * <ul>
             * <li><p><strong>standalone</strong>: standalone</p>
             * </li>
             * <li><p><strong>broadcast</strong>: broadcast</p>
             * </li>
             * <li><p><strong>parallel</strong>: parallel computing</p>
             * </li>
             * <li><p><strong>grid</strong>: memory grid</p>
             * </li>
             * <li><p><strong>batch</strong>: grid computing</p>
             * </li>
             * <li><p><strong>shard</strong>: shard</p>
             * </li>
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
             * <p>The full path of the JAR package in OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>https:doc***.oss-cn-hangzhou.aliyuncs.com/sc-****-D-0.0.2-SNAPSHOT.jar</p>
             */
            public Builder jarUrl(String jarUrl) {
                this.jarUrl = jarUrl;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>99341</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job monitoring information.</p>
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
             * <p>The advanced configurations. This parameter is applicable only to parallel computing, memory grid, and grid computing.</p>
             */
            public Builder mapTaskXAttrs(MapTaskXAttrs mapTaskXAttrs) {
                this.mapTaskXAttrs = mapTaskXAttrs;
                return this;
            }

            /**
             * <p>The maximum number of error retries. Set this parameter based on your business requirements. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxAttempt(Integer maxAttempt) {
                this.maxAttempt = maxAttempt;
                return this;
            }

            /**
             * <p>The maximum number of concurrently running instances. Default value: 1. This means that if the previous trigger has not finished running, the next trigger is skipped even if the scheduled time has arrived.</p>
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
             * <p>The custom parameters that can be retrieved at runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The start timestamp in milliseconds. A value of -1 indicates immediate start.</p>
             * 
             * <strong>example:</strong>
             * <p>1789454134000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: Enabled. The job can be triggered normally.</p>
             * </li>
             * <li><p><strong>0</strong>: Disabled. The job is not triggered.</p>
             * </li>
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
             * <p>The time configuration information.</p>
             */
            public Builder timeConfig(TimeConfig timeConfig) {
                this.timeConfig = timeConfig;
                return this;
            }

            /**
             * <p>The extended fields of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;pageSize&quot;:5,&quot;queueSize&quot;:10,&quot;consumerSize&quot;:5,&quot;dispatcherSize&quot;:5,&quot;taskMaxAttempt&quot;:0,&quot;taskAttemptInterval&quot;:0,&quot;globalConsumerSize&quot;:1000,&quot;taskDispatchMode&quot;:&quot;push&quot;}</p>
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
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Jobs")
        private java.util.List<Jobs> jobs;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.jobs = builder.jobs;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
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
        public java.util.List<Jobs> getJobs() {
            return this.jobs;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Jobs> jobs; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobs = model.jobs;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The job list and job details.</p>
             */
            public Builder jobs(java.util.List<Jobs> jobs) {
                this.jobs = jobs;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>299</p>
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
