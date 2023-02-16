// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobRequest</p>
 */
public class UpdateJobRequest extends Request {
    @Body
    @NameInMap("AttemptInterval")
    private Integer attemptInterval;

    @Body
    @NameInMap("Calendar")
    private String calendar;

    @Body
    @NameInMap("ClassName")
    private String className;

    @Body
    @NameInMap("ConsumerSize")
    private Integer consumerSize;

    @Body
    @NameInMap("ContactInfo")
    private java.util.List < ContactInfo> contactInfo;

    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("DataOffset")
    private Integer dataOffset;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DispatcherSize")
    private Integer dispatcherSize;

    @Body
    @NameInMap("ExecuteMode")
    private String executeMode;

    @Body
    @NameInMap("FailEnable")
    private Boolean failEnable;

    @Body
    @NameInMap("FailTimes")
    private Integer failTimes;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Body
    @NameInMap("MaxAttempt")
    private Integer maxAttempt;

    @Body
    @NameInMap("MaxConcurrency")
    @Validation(maximum = 200, minimum = 1)
    private Integer maxConcurrency;

    @Body
    @NameInMap("MissWorkerEnable")
    private Boolean missWorkerEnable;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("Parameters")
    private String parameters;

    @Body
    @NameInMap("QueueSize")
    private Integer queueSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("SendChannel")
    private String sendChannel;

    @Body
    @NameInMap("SuccessNoticeEnable")
    private Boolean successNoticeEnable;

    @Body
    @NameInMap("TaskAttemptInterval")
    private Integer taskAttemptInterval;

    @Body
    @NameInMap("TaskMaxAttempt")
    @Validation(maximum = 10)
    private Integer taskMaxAttempt;

    @Body
    @NameInMap("TimeExpression")
    private String timeExpression;

    @Body
    @NameInMap("TimeType")
    private Integer timeType;

    @Body
    @NameInMap("Timeout")
    private Long timeout;

    @Body
    @NameInMap("TimeoutEnable")
    private Boolean timeoutEnable;

    @Body
    @NameInMap("TimeoutKillEnable")
    private Boolean timeoutKillEnable;

    private UpdateJobRequest(Builder builder) {
        super(builder);
        this.attemptInterval = builder.attemptInterval;
        this.calendar = builder.calendar;
        this.className = builder.className;
        this.consumerSize = builder.consumerSize;
        this.contactInfo = builder.contactInfo;
        this.content = builder.content;
        this.dataOffset = builder.dataOffset;
        this.description = builder.description;
        this.dispatcherSize = builder.dispatcherSize;
        this.executeMode = builder.executeMode;
        this.failEnable = builder.failEnable;
        this.failTimes = builder.failTimes;
        this.groupId = builder.groupId;
        this.jobId = builder.jobId;
        this.maxAttempt = builder.maxAttempt;
        this.maxConcurrency = builder.maxConcurrency;
        this.missWorkerEnable = builder.missWorkerEnable;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.pageSize = builder.pageSize;
        this.parameters = builder.parameters;
        this.queueSize = builder.queueSize;
        this.regionId = builder.regionId;
        this.sendChannel = builder.sendChannel;
        this.successNoticeEnable = builder.successNoticeEnable;
        this.taskAttemptInterval = builder.taskAttemptInterval;
        this.taskMaxAttempt = builder.taskMaxAttempt;
        this.timeExpression = builder.timeExpression;
        this.timeType = builder.timeType;
        this.timeout = builder.timeout;
        this.timeoutEnable = builder.timeoutEnable;
        this.timeoutKillEnable = builder.timeoutKillEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attemptInterval
     */
    public Integer getAttemptInterval() {
        return this.attemptInterval;
    }

    /**
     * @return calendar
     */
    public String getCalendar() {
        return this.calendar;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return consumerSize
     */
    public Integer getConsumerSize() {
        return this.consumerSize;
    }

    /**
     * @return contactInfo
     */
    public java.util.List < ContactInfo> getContactInfo() {
        return this.contactInfo;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return dataOffset
     */
    public Integer getDataOffset() {
        return this.dataOffset;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dispatcherSize
     */
    public Integer getDispatcherSize() {
        return this.dispatcherSize;
    }

    /**
     * @return executeMode
     */
    public String getExecuteMode() {
        return this.executeMode;
    }

    /**
     * @return failEnable
     */
    public Boolean getFailEnable() {
        return this.failEnable;
    }

    /**
     * @return failTimes
     */
    public Integer getFailTimes() {
        return this.failTimes;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
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
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * @return missWorkerEnable
     */
    public Boolean getMissWorkerEnable() {
        return this.missWorkerEnable;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return queueSize
     */
    public Integer getQueueSize() {
        return this.queueSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sendChannel
     */
    public String getSendChannel() {
        return this.sendChannel;
    }

    /**
     * @return successNoticeEnable
     */
    public Boolean getSuccessNoticeEnable() {
        return this.successNoticeEnable;
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

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private Integer attemptInterval; 
        private String calendar; 
        private String className; 
        private Integer consumerSize; 
        private java.util.List < ContactInfo> contactInfo; 
        private String content; 
        private Integer dataOffset; 
        private String description; 
        private Integer dispatcherSize; 
        private String executeMode; 
        private Boolean failEnable; 
        private Integer failTimes; 
        private String groupId; 
        private Long jobId; 
        private Integer maxAttempt; 
        private Integer maxConcurrency; 
        private Boolean missWorkerEnable; 
        private String name; 
        private String namespace; 
        private String namespaceSource; 
        private Integer pageSize; 
        private String parameters; 
        private Integer queueSize; 
        private String regionId; 
        private String sendChannel; 
        private Boolean successNoticeEnable; 
        private Integer taskAttemptInterval; 
        private Integer taskMaxAttempt; 
        private String timeExpression; 
        private Integer timeType; 
        private Long timeout; 
        private Boolean timeoutEnable; 
        private Boolean timeoutKillEnable; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest request) {
            super(request);
            this.attemptInterval = request.attemptInterval;
            this.calendar = request.calendar;
            this.className = request.className;
            this.consumerSize = request.consumerSize;
            this.contactInfo = request.contactInfo;
            this.content = request.content;
            this.dataOffset = request.dataOffset;
            this.description = request.description;
            this.dispatcherSize = request.dispatcherSize;
            this.executeMode = request.executeMode;
            this.failEnable = request.failEnable;
            this.failTimes = request.failTimes;
            this.groupId = request.groupId;
            this.jobId = request.jobId;
            this.maxAttempt = request.maxAttempt;
            this.maxConcurrency = request.maxConcurrency;
            this.missWorkerEnable = request.missWorkerEnable;
            this.name = request.name;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.pageSize = request.pageSize;
            this.parameters = request.parameters;
            this.queueSize = request.queueSize;
            this.regionId = request.regionId;
            this.sendChannel = request.sendChannel;
            this.successNoticeEnable = request.successNoticeEnable;
            this.taskAttemptInterval = request.taskAttemptInterval;
            this.taskMaxAttempt = request.taskMaxAttempt;
            this.timeExpression = request.timeExpression;
            this.timeType = request.timeType;
            this.timeout = request.timeout;
            this.timeoutEnable = request.timeoutEnable;
            this.timeoutKillEnable = request.timeoutKillEnable;
        } 

        /**
         * The interval at which the system attempts to rerun a job. Default value: 30. Unit: seconds.
         */
        public Builder attemptInterval(Integer attemptInterval) {
            this.putBodyParameter("AttemptInterval", attemptInterval);
            this.attemptInterval = attemptInterval;
            return this;
        }

        /**
         * When the Time type parameter is set to cron, you can specify a custom calendar.
         */
        public Builder calendar(String calendar) {
            this.putBodyParameter("Calendar", calendar);
            this.calendar = calendar;
            return this;
        }

        /**
         * The full path of the job interface class.
         * <p>
         * 
         * This field is available only when you select a java job. In this case, you must enter a full path.
         */
        public Builder className(String className) {
            this.putBodyParameter("ClassName", className);
            this.className = className;
            return this;
        }

        /**
         * The number of threads that are triggered by a single worker at a time. Default value: 5. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder consumerSize(Integer consumerSize) {
            this.putBodyParameter("ConsumerSize", consumerSize);
            this.consumerSize = consumerSize;
            return this;
        }

        /**
         * The information of the job contact.
         */
        public Builder contactInfo(java.util.List < ContactInfo> contactInfo) {
            this.putBodyParameter("ContactInfo", contactInfo);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * The script code content that is required when you set the job type to **python**, **shell**, or **go**.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * When the Time type parameter is set to cron, you can specify a time offset. Unit: seconds.
         */
        public Builder dataOffset(Integer dataOffset) {
            this.putBodyParameter("DataOffset", dataOffset);
            this.dataOffset = dataOffset;
            return this;
        }

        /**
         * The description of the job.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Default value: 5. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder dispatcherSize(Integer dispatcherSize) {
            this.putBodyParameter("DispatcherSize", dispatcherSize);
            this.dispatcherSize = dispatcherSize;
            return this;
        }

        /**
         * The execution mode of the job. The following execution modes are supported:
         * <p>
         * 
         * *   **standalone**: The job runs in standalone mode.
         * *   **broadcast**: The job runs in broadcast mode.
         * *   **parallel**: The job runs in parallel computing mode.
         * *   **grid**: The job runs in memory grid mode.
         * *   **batch**: The job runs in grid computing mode.
         * *   **sharding**: The job runs in sharding mode.
         */
        public Builder executeMode(String executeMode) {
            this.putBodyParameter("ExecuteMode", executeMode);
            this.executeMode = executeMode;
            return this;
        }

        /**
         * Specifies whether to turn on Failure alarm. Valid values:
         * <p>
         * 
         * *   **true**: Turn on Failure alarm.
         * *   **false**: Turn off Failure alarm.
         */
        public Builder failEnable(Boolean failEnable) {
            this.putBodyParameter("FailEnable", failEnable);
            this.failEnable = failEnable;
            return this;
        }

        /**
         * FailTimes.
         */
        public Builder failTimes(Integer failTimes) {
            this.putBodyParameter("FailTimes", failTimes);
            this.failTimes = failTimes;
            return this;
        }

        /**
         * The ID of the application. You can obtain the application ID on the Application Management page in Distributed Task Scheduling Platform.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the job. You can obtain the job ID on the Task Management page in Distributed Task Scheduling Platform.
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The maximum number of attempts that the system can make when an error occurs on a job. You can specify this parameter based on your business requirements.
         */
        public Builder maxAttempt(Integer maxAttempt) {
            this.putBodyParameter("MaxAttempt", maxAttempt);
            this.maxAttempt = maxAttempt;
            return this;
        }

        /**
         * The maximum number of instances that the system can run at the same time. Default value: 1. When you set this parameter to 1, if the current job does not end, the system will not run the next job even if the runtime is reached.
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putBodyParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * Specifies whether to turn on No machine alarm available when no worker is available.
         * <p>
         * 
         * *   **true**: Turn on No machine alarm available when no worker is available.
         * *   **false**: Turn off No machine alarm available when no worker is available.
         */
        public Builder missWorkerEnable(Boolean missWorkerEnable) {
            this.putBodyParameter("MissWorkerEnable", missWorkerEnable);
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }

        /**
         * The name of the job.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the namespace. You can obtain the ID of the namespace on the Namespace page in Distributed Task Scheduling Platform.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putBodyParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The number of subtasks that can be pulled at a time. Default value: 100. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The user-defined parameters that you can obtain when you run the job.
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The maximum number of subtask queues that you can cache. Default value: 10000. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder queueSize(Integer queueSize) {
            this.putBodyParameter("QueueSize", queueSize);
            this.queueSize = queueSize;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The channel for sending alerts. Only SMS messages are supported.
         */
        public Builder sendChannel(String sendChannel) {
            this.putBodyParameter("SendChannel", sendChannel);
            this.sendChannel = sendChannel;
            return this;
        }

        /**
         * SuccessNoticeEnable.
         */
        public Builder successNoticeEnable(Boolean successNoticeEnable) {
            this.putBodyParameter("SuccessNoticeEnable", successNoticeEnable);
            this.successNoticeEnable = successNoticeEnable;
            return this;
        }

        /**
         * The interval at which the system can rerun the subtask when the subtask fails. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder taskAttemptInterval(Integer taskAttemptInterval) {
            this.putBodyParameter("TaskAttemptInterval", taskAttemptInterval);
            this.taskAttemptInterval = taskAttemptInterval;
            return this;
        }

        /**
         * The number of retries that the system can perform when the subtask fails. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder taskMaxAttempt(Integer taskMaxAttempt) {
            this.putBodyParameter("TaskMaxAttempt", taskMaxAttempt);
            this.taskMaxAttempt = taskMaxAttempt;
            return this;
        }

        /**
         * The time expression. You can set the time expression according to the selected time type.
         * <p>
         * 
         * *   **cron**: Specify a standard Cron expression. You can verify the expression online after you specify the expression.
         * *   **api**: No time expression is available.
         * *   **fixed_rate**: Specify a fixed frequency value. Unit: seconds. For example, if you set this parameter to 30, the system triggers a job every 30 seconds.
         * *   **second_delay**: Specify a delay after which you can run a job. You can specify a value from 1 to 60. Unit: seconds.
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * The type of time. The following time types are supported:
         * <p>
         * 
         * *   **cron**: 1
         * *   **fix_rate**: 3
         * *   **second_delay**: 4
         * *   **api**: 100
         */
        public Builder timeType(Integer timeType) {
            this.putBodyParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * The timeout threshold. Default value: 7200. Unit: seconds.
         */
        public Builder timeout(Long timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * Specifies whether to turn on Timeout alarm. Valid values:
         * <p>
         * 
         * *   **true**: Turn on Timeout alarm.
         * *   **false**: Turn off Timeout alarm.
         */
        public Builder timeoutEnable(Boolean timeoutEnable) {
            this.putBodyParameter("TimeoutEnable", timeoutEnable);
            this.timeoutEnable = timeoutEnable;
            return this;
        }

        /**
         * Specifies whether to turn on Timeout termination. Valid values:
         * <p>
         * 
         * *   **true**: Turn on Timeout termination.
         * *   **false**: Turn off Timeout termination.
         */
        public Builder timeoutKillEnable(Boolean timeoutKillEnable) {
            this.putBodyParameter("TimeoutKillEnable", timeoutKillEnable);
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }

        @Override
        public UpdateJobRequest build() {
            return new UpdateJobRequest(this);
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
             * The webhook URL of the DingTalk chatbot. For more information, see [DingTalk development documentation](https://open.dingtalk.com/document/org/application-types).
             */
            public Builder ding(String ding) {
                this.ding = ding;
                return this;
            }

            /**
             * The email address of the contact.
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * The name of the contact.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The mobile phone number of the contact.
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
}
