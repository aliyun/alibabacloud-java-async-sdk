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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
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
             * Ding.
             */
            public Builder ding(String ding) {
                this.ding = ding;
                return this;
            }

            /**
             * UserMail.
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserPhone.
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
             * FailEnable.
             */
            public Builder failEnable(Boolean failEnable) {
                this.failEnable = failEnable;
                return this;
            }

            /**
             * MissWorkerEnable.
             */
            public Builder missWorkerEnable(Boolean missWorkerEnable) {
                this.missWorkerEnable = missWorkerEnable;
                return this;
            }

            /**
             * SendChannel.
             */
            public Builder sendChannel(String sendChannel) {
                this.sendChannel = sendChannel;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * TimeoutEnable.
             */
            public Builder timeoutEnable(Boolean timeoutEnable) {
                this.timeoutEnable = timeoutEnable;
                return this;
            }

            /**
             * TimeoutKillEnable.
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
             * ContactInfo.
             */
            public Builder contactInfo(java.util.List < ContactInfo> contactInfo) {
                this.contactInfo = contactInfo;
                return this;
            }

            /**
             * MonitorConfig.
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
             * ConsumerSize.
             */
            public Builder consumerSize(Integer consumerSize) {
                this.consumerSize = consumerSize;
                return this;
            }

            /**
             * DispatcherSize.
             */
            public Builder dispatcherSize(Integer dispatcherSize) {
                this.dispatcherSize = dispatcherSize;
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
             * QueueSize.
             */
            public Builder queueSize(Integer queueSize) {
                this.queueSize = queueSize;
                return this;
            }

            /**
             * TaskAttemptInterval.
             */
            public Builder taskAttemptInterval(Integer taskAttemptInterval) {
                this.taskAttemptInterval = taskAttemptInterval;
                return this;
            }

            /**
             * TaskMaxAttempt.
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
             * Calendar.
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * DataOffset.
             */
            public Builder dataOffset(Integer dataOffset) {
                this.dataOffset = dataOffset;
                return this;
            }

            /**
             * TimeExpression.
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * TimeType.
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

        @NameInMap("JobMonitorInfo")
        private JobMonitorInfo jobMonitorInfo;

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

        private JobConfigInfo(Builder builder) {
            this.attemptInterval = builder.attemptInterval;
            this.className = builder.className;
            this.content = builder.content;
            this.description = builder.description;
            this.executeMode = builder.executeMode;
            this.jarUrl = builder.jarUrl;
            this.jobMonitorInfo = builder.jobMonitorInfo;
            this.mapTaskXAttrs = builder.mapTaskXAttrs;
            this.maxAttempt = builder.maxAttempt;
            this.maxConcurrency = builder.maxConcurrency;
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.status = builder.status;
            this.timeConfig = builder.timeConfig;
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
         * @return jobMonitorInfo
         */
        public JobMonitorInfo getJobMonitorInfo() {
            return this.jobMonitorInfo;
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

        public static final class Builder {
            private Integer attemptInterval; 
            private String className; 
            private String content; 
            private String description; 
            private String executeMode; 
            private String jarUrl; 
            private JobMonitorInfo jobMonitorInfo; 
            private MapTaskXAttrs mapTaskXAttrs; 
            private Integer maxAttempt; 
            private String maxConcurrency; 
            private String name; 
            private String parameters; 
            private Integer status; 
            private TimeConfig timeConfig; 

            /**
             * AttemptInterval.
             */
            public Builder attemptInterval(Integer attemptInterval) {
                this.attemptInterval = attemptInterval;
                return this;
            }

            /**
             * ClassName.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExecuteMode.
             */
            public Builder executeMode(String executeMode) {
                this.executeMode = executeMode;
                return this;
            }

            /**
             * JarUrl.
             */
            public Builder jarUrl(String jarUrl) {
                this.jarUrl = jarUrl;
                return this;
            }

            /**
             * JobMonitorInfo.
             */
            public Builder jobMonitorInfo(JobMonitorInfo jobMonitorInfo) {
                this.jobMonitorInfo = jobMonitorInfo;
                return this;
            }

            /**
             * MapTaskXAttrs.
             */
            public Builder mapTaskXAttrs(MapTaskXAttrs mapTaskXAttrs) {
                this.mapTaskXAttrs = mapTaskXAttrs;
                return this;
            }

            /**
             * MaxAttempt.
             */
            public Builder maxAttempt(Integer maxAttempt) {
                this.maxAttempt = maxAttempt;
                return this;
            }

            /**
             * MaxConcurrency.
             */
            public Builder maxConcurrency(String maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TimeConfig.
             */
            public Builder timeConfig(TimeConfig timeConfig) {
                this.timeConfig = timeConfig;
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
             * JobConfigInfo.
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
