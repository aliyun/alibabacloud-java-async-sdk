// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobRequest</p>
 */
public class UpdateJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttemptInterval")
    private Integer attemptInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Calendar")
    private String calendar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClassName")
    private String className;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConsumerSize")
    private Integer consumerSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactInfo")
    private java.util.List < ContactInfo> contactInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataOffset")
    private Integer dataOffset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DispatcherSize")
    private Integer dispatcherSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteMode")
    private String executeMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FailEnable")
    private Boolean failEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FailTimes")
    private Integer failTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxAttempt")
    private Integer maxAttempt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer maxConcurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MissWorkerEnable")
    private Boolean missWorkerEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueueSize")
    private Integer queueSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SendChannel")
    private String sendChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SuccessNoticeEnable")
    private Boolean successNoticeEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskAttemptInterval")
    private Integer taskAttemptInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskDispatchMode")
    private String taskDispatchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskMaxAttempt")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Integer taskMaxAttempt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Template")
    private String template;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeExpression")
    private String timeExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeType")
    private Integer timeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeoutEnable")
    private Boolean timeoutEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeoutKillEnable")
    private Boolean timeoutKillEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("XAttrs")
    private String xAttrs;

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
        this.taskDispatchMode = builder.taskDispatchMode;
        this.taskMaxAttempt = builder.taskMaxAttempt;
        this.template = builder.template;
        this.timeExpression = builder.timeExpression;
        this.timeType = builder.timeType;
        this.timeout = builder.timeout;
        this.timeoutEnable = builder.timeoutEnable;
        this.timeoutKillEnable = builder.timeoutKillEnable;
        this.timezone = builder.timezone;
        this.xAttrs = builder.xAttrs;
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
     * @return taskDispatchMode
     */
    public String getTaskDispatchMode() {
        return this.taskDispatchMode;
    }

    /**
     * @return taskMaxAttempt
     */
    public Integer getTaskMaxAttempt() {
        return this.taskMaxAttempt;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
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

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return xAttrs
     */
    public String getXAttrs() {
        return this.xAttrs;
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
        private String taskDispatchMode; 
        private Integer taskMaxAttempt; 
        private String template; 
        private String timeExpression; 
        private Integer timeType; 
        private Long timeout; 
        private Boolean timeoutEnable; 
        private Boolean timeoutKillEnable; 
        private String timezone; 
        private String xAttrs; 

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
            this.taskDispatchMode = request.taskDispatchMode;
            this.taskMaxAttempt = request.taskMaxAttempt;
            this.template = request.template;
            this.timeExpression = request.timeExpression;
            this.timeType = request.timeType;
            this.timeout = request.timeout;
            this.timeoutEnable = request.timeoutEnable;
            this.timeoutKillEnable = request.timeoutKillEnable;
            this.timezone = request.timezone;
            this.xAttrs = request.xAttrs;
        } 

        /**
         * The interval of retries after a job failure. Default value: 30. Unit: seconds.
         */
        public Builder attemptInterval(Integer attemptInterval) {
            this.putBodyParameter("AttemptInterval", attemptInterval);
            this.attemptInterval = attemptInterval;
            return this;
        }

        /**
         * If you set TimeType to 1 (cron), you can specify calendar days.
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
         * This field is available only when you set the job type to java. In this case, you must enter a full path.
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
         * The information about the alert contact.
         */
        public Builder contactInfo(java.util.List < ContactInfo> contactInfo) {
            this.putBodyParameter("ContactInfo", contactInfo);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * The script content. This parameter is required when you set the job type to python, shell, go, or k8s.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * If you set TimeType to 1 (cron), you can specify a time offset. Unit: seconds.
         */
        public Builder dataOffset(Integer dataOffset) {
            this.putBodyParameter("DataOffset", dataOffset);
            this.dataOffset = dataOffset;
            return this;
        }

        /**
         * The job description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The number of task distribution threads. Default value: 5. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder dispatcherSize(Integer dispatcherSize) {
            this.putBodyParameter("DispatcherSize", dispatcherSize);
            this.dispatcherSize = dispatcherSize;
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
         * *   **Shard run**
         */
        public Builder executeMode(String executeMode) {
            this.putBodyParameter("ExecuteMode", executeMode);
            this.executeMode = executeMode;
            return this;
        }

        /**
         * Specifies whether to turn on Failure alarm. If the switch is turned on, an alert will be generated upon a failure. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder failEnable(Boolean failEnable) {
            this.putBodyParameter("FailEnable", failEnable);
            this.failEnable = failEnable;
            return this;
        }

        /**
         * The number of consecutive failures. An alert will be received if the number of consecutive failures reaches the value of this parameter.
         */
        public Builder failTimes(Integer failTimes) {
            this.putBodyParameter("FailTimes", failTimes);
            this.failTimes = failTimes;
            return this;
        }

        /**
         * The application ID. You can obtain the application ID on the Application Management page in the SchedulerX console.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The job ID. You can obtain the job ID on the Task Management page in the SchedulerX console.
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The maximum number of retries after a job failure. This parameter is specified based on your business requirements.
         */
        public Builder maxAttempt(Integer maxAttempt) {
            this.putBodyParameter("MaxAttempt", maxAttempt);
            this.maxAttempt = maxAttempt;
            return this;
        }

        /**
         * The maximum number of concurrent instances. Default value: 1. The default value indicates that only one instance is allowed to run at a time. When an instance is running, another instance is not triggered even if the scheduled time for running the instance is reached.
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putBodyParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * Specifies whether to turn on No machine alarm available. If the switch is turned on, an alert will be generated when no machine is available for running the job. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder missWorkerEnable(Boolean missWorkerEnable) {
            this.putBodyParameter("MissWorkerEnable", missWorkerEnable);
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }

        /**
         * The job name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The namespace source. This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putBodyParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The number of tasks that can be pulled at a time. Default value: 100. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The user-defined parameters that you can obtain when the job is running.
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The maximum number of tasks that can be queued. Default value: 10000. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder queueSize(Integer queueSize) {
            this.putBodyParameter("QueueSize", queueSize);
            this.queueSize = queueSize;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The method that is used to send alerts. Only Short Message Service (SMS) is supported.
         */
        public Builder sendChannel(String sendChannel) {
            this.putBodyParameter("SendChannel", sendChannel);
            this.sendChannel = sendChannel;
            return this;
        }

        /**
         * Specifies whether to turn on Successful notice. If the switch is turned on, a notice will be sent when a job succeeds.
         */
        public Builder successNoticeEnable(Boolean successNoticeEnable) {
            this.putBodyParameter("SuccessNoticeEnable", successNoticeEnable);
            this.successNoticeEnable = successNoticeEnable;
            return this;
        }

        /**
         * The interval of retries after a task failure. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder taskAttemptInterval(Integer taskAttemptInterval) {
            this.putBodyParameter("TaskAttemptInterval", taskAttemptInterval);
            this.taskAttemptInterval = taskAttemptInterval;
            return this;
        }

        /**
         * The job mode. Valid values: push and pull. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder taskDispatchMode(String taskDispatchMode) {
            this.putBodyParameter("TaskDispatchMode", taskDispatchMode);
            this.taskDispatchMode = taskDispatchMode;
            return this;
        }

        /**
         * The number of retries after a task failure. This parameter is an advanced configuration item of the MapReduce job.
         */
        public Builder taskMaxAttempt(Integer taskMaxAttempt) {
            this.putBodyParameter("TaskMaxAttempt", taskMaxAttempt);
            this.taskMaxAttempt = taskMaxAttempt;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(String template) {
            this.putBodyParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * The time expression. Specify the time expression based on the value of TimeType:
         * <p>
         * 
         * *   If you set TimeType to **1** (cron), specify this parameter to a standard CRON expression.
         * *   If you set TimeType to **100** (api), no time expression is required.
         * *   If you set TimeType to **3** (fixed_rate), specify this parameter to a fixed frequency in seconds. For example, if you set this parameter to 30, the system triggers a job every 30 seconds.
         * *   If you set TimeType to **4** (second_delay), specify this parameter to a fixed delay after which the job is triggered. Valid values: 1 to 60. Unit: seconds.
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
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
         * *   **100**: api
         */
        public Builder timeType(Integer timeType) {
            this.putBodyParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * The timeout threshold. Unit: seconds.
         */
        public Builder timeout(Long timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * Specifies whether to turn on Timeout alarm. If the switch is turned on, an alert will be generated upon a timeout. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder timeoutEnable(Boolean timeoutEnable) {
            this.putBodyParameter("TimeoutEnable", timeoutEnable);
            this.timeoutEnable = timeoutEnable;
            return this;
        }

        /**
         * Specifies whether to turn on Timeout termination. If the switch is turned on, the job will be terminated upon a timeout. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder timeoutKillEnable(Boolean timeoutKillEnable) {
            this.putBodyParameter("TimeoutKillEnable", timeoutKillEnable);
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }

        /**
         * Time zone.
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * XAttrs.
         */
        public Builder xAttrs(String xAttrs) {
            this.putBodyParameter("XAttrs", xAttrs);
            this.xAttrs = xAttrs;
            return this;
        }

        @Override
        public UpdateJobRequest build() {
            return new UpdateJobRequest(this);
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
             * The webhook URL of the DingTalk chatbot.[](https://open.dingtalk.com/document/org/application-types)
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
}
