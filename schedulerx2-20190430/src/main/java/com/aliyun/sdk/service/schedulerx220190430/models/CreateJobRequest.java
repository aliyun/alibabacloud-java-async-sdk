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
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
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
    private java.util.List<ContactInfo> contactInfo;

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
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

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
    @com.aliyun.core.annotation.Validation(required = true)
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SuccessNoticeEnable")
    private Boolean successNoticeEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskAttemptInterval")
    private Integer taskAttemptInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskMaxAttempt")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Integer taskMaxAttempt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeExpression")
    private String timeExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeType")
    @com.aliyun.core.annotation.Validation(required = true)
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

    private CreateJobRequest(Builder builder) {
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
        this.jobType = builder.jobType;
        this.maxAttempt = builder.maxAttempt;
        this.maxConcurrency = builder.maxConcurrency;
        this.missWorkerEnable = builder.missWorkerEnable;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.pageSize = builder.pageSize;
        this.parameters = builder.parameters;
        this.priority = builder.priority;
        this.queueSize = builder.queueSize;
        this.regionId = builder.regionId;
        this.sendChannel = builder.sendChannel;
        this.status = builder.status;
        this.successNoticeEnable = builder.successNoticeEnable;
        this.taskAttemptInterval = builder.taskAttemptInterval;
        this.taskMaxAttempt = builder.taskMaxAttempt;
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

    public static CreateJobRequest create() {
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
    public java.util.List<ContactInfo> getContactInfo() {
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
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
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

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private Integer attemptInterval; 
        private String calendar; 
        private String className; 
        private Integer consumerSize; 
        private java.util.List<ContactInfo> contactInfo; 
        private String content; 
        private Integer dataOffset; 
        private String description; 
        private Integer dispatcherSize; 
        private String executeMode; 
        private Boolean failEnable; 
        private Integer failTimes; 
        private String groupId; 
        private String jobType; 
        private Integer maxAttempt; 
        private Integer maxConcurrency; 
        private Boolean missWorkerEnable; 
        private String name; 
        private String namespace; 
        private String namespaceSource; 
        private Integer pageSize; 
        private String parameters; 
        private Integer priority; 
        private Integer queueSize; 
        private String regionId; 
        private String sendChannel; 
        private Integer status; 
        private Boolean successNoticeEnable; 
        private Integer taskAttemptInterval; 
        private Integer taskMaxAttempt; 
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

        private Builder(CreateJobRequest request) {
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
            this.jobType = request.jobType;
            this.maxAttempt = request.maxAttempt;
            this.maxConcurrency = request.maxConcurrency;
            this.missWorkerEnable = request.missWorkerEnable;
            this.name = request.name;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.pageSize = request.pageSize;
            this.parameters = request.parameters;
            this.priority = request.priority;
            this.queueSize = request.queueSize;
            this.regionId = request.regionId;
            this.sendChannel = request.sendChannel;
            this.status = request.status;
            this.successNoticeEnable = request.successNoticeEnable;
            this.taskAttemptInterval = request.taskAttemptInterval;
            this.taskMaxAttempt = request.taskMaxAttempt;
            this.timeExpression = request.timeExpression;
            this.timeType = request.timeType;
            this.timeout = request.timeout;
            this.timeoutEnable = request.timeoutEnable;
            this.timeoutKillEnable = request.timeoutKillEnable;
            this.timezone = request.timezone;
            this.xAttrs = request.xAttrs;
        } 

        /**
         * <p>The time interval between retry attempts in case of a job failure. Unit: seconds. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder attemptInterval(Integer attemptInterval) {
            this.putBodyParameter("AttemptInterval", attemptInterval);
            this.attemptInterval = attemptInterval;
            return this;
        }

        /**
         * <p>If you set TimeType to 1 (cron), you can specify calendar days.</p>
         * 
         * <strong>example:</strong>
         * <p>This parameter is not supported. You do not need to specify this parameter.</p>
         */
        public Builder calendar(String calendar) {
            this.putBodyParameter("Calendar", calendar);
            this.calendar = calendar;
            return this;
        }

        /**
         * <p>The full path of the job interface class.</p>
         * <p>This parameter is available only when you set JobType to java. You must enter a full path.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.schedulerx.test.helloworld</p>
         */
        public Builder className(String className) {
            this.putBodyParameter("ClassName", className);
            this.className = className;
            return this;
        }

        /**
         * <p>The number of threads that a single worker triggers simultaneously. You can specify this parameter for MapReduce jobs. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder consumerSize(Integer consumerSize) {
            this.putBodyParameter("ConsumerSize", consumerSize);
            this.consumerSize = consumerSize;
            return this;
        }

        /**
         * <p>The information about the alert contact.</p>
         */
        public Builder contactInfo(java.util.List<ContactInfo> contactInfo) {
            this.putBodyParameter("ContactInfo", contactInfo);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * <p>The script content. This parameter is required when you set JobType to python, shell, go, or k8s.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;hello&quot;</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>If you set TimeType to 1 (cron), you can specify a time offset. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2400</p>
         */
        public Builder dataOffset(Integer dataOffset) {
            this.putBodyParameter("DataOffset", dataOffset);
            this.dataOffset = dataOffset;
            return this;
        }

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The number of task distribution threads. This parameter is an advanced configuration item of the MapReduce job. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder dispatcherSize(Integer dispatcherSize) {
            this.putBodyParameter("DispatcherSize", dispatcherSize);
            this.dispatcherSize = dispatcherSize;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>standalone</p>
         */
        public Builder executeMode(String executeMode) {
            this.putBodyParameter("ExecuteMode", executeMode);
            this.executeMode = executeMode;
            return this;
        }

        /**
         * <p>Specifies whether to trigger an alert when a job fails. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: triggers an alert when a job fails.</li>
         * <li><strong>false</strong>: does not trigger an alert when a job fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder failEnable(Boolean failEnable) {
            this.putBodyParameter("FailEnable", failEnable);
            this.failEnable = failEnable;
            return this;
        }

        /**
         * <p>The maximum number of consecutive failures before an alert is triggered. An alert will be triggered if the number of consecutive failures reaches the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder failTimes(Integer failTimes) {
            this.putBodyParameter("FailTimes", failTimes);
            this.failTimes = failTimes;
            return this;
        }

        /**
         * <p>The application ID. You can obtain the application ID on the Application Management page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The job type. Valid values:</p>
         * <ul>
         * <li>java</li>
         * <li>python</li>
         * <li>shell</li>
         * <li>go</li>
         * <li>http</li>
         * <li>xxljob</li>
         * <li>dataworks</li>
         * <li>k8s</li>
         * <li>springschedule</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        public Builder jobType(String jobType) {
            this.putBodyParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The maximum number of retry attempts in case of a job failure. Specify this parameter based on your business requirements. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxAttempt(Integer maxAttempt) {
            this.putBodyParameter("MaxAttempt", maxAttempt);
            this.maxAttempt = maxAttempt;
            return this;
        }

        /**
         * <p>The maximum number of concurrent instances. By default, only one instance can run at a time. When an instance is running, the next instance is not triggered even if the scheduled start time arrives.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putBodyParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * <p>Specifies whether to generate an alert if no machines are available to run the job. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: generates an alert if no machines are available to run the job.</li>
         * <li><strong>false</strong>: does not generate an alert if no machines are available to run the job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder missWorkerEnable(Boolean missWorkerEnable) {
            this.putBodyParameter("MissWorkerEnable", missWorkerEnable);
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }

        /**
         * <p>The job name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>helloworld</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source of the namespace. You must specify this parameter only if the namespace is provided by a third party.</p>
         * 
         * <strong>example:</strong>
         * <p>schedulerx</p>
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putBodyParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * <p>The number of entries per page. You can specify this parameter for MapReduce jobs. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The user-defined parameters that you can obtain when the job is running.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The maximum capacity of the task queue. You can specify this parameter for MapReduce jobs. Default value: 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder queueSize(Integer queueSize) {
            this.putBodyParameter("QueueSize", queueSize);
            this.queueSize = queueSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The method that is used to send alerts. Set the value to sms. Default value: sms.</p>
         * 
         * <strong>example:</strong>
         * <p>sms</p>
         */
        public Builder sendChannel(String sendChannel) {
            this.putBodyParameter("SendChannel", sendChannel);
            this.sendChannel = sendChannel;
            return this;
        }

        /**
         * <p>Specifies whether to enable the job. If this parameter is set to 0, the job is disabled. If this parameter is set to 1, the job is enabled. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Specifies whether to send notifications for successfully running the job.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder successNoticeEnable(Boolean successNoticeEnable) {
            this.putBodyParameter("SuccessNoticeEnable", successNoticeEnable);
            this.successNoticeEnable = successNoticeEnable;
            return this;
        }

        /**
         * <p>The time interval between retry attempts in case of a job failure. This parameter is an advanced configuration item of the MapReduce job. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder taskAttemptInterval(Integer taskAttemptInterval) {
            this.putBodyParameter("TaskAttemptInterval", taskAttemptInterval);
            this.taskAttemptInterval = taskAttemptInterval;
            return this;
        }

        /**
         * <p>The maximum number of retry attempts in case of a job failure. This parameter is an advanced configuration item of the MapReduce job. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder taskMaxAttempt(Integer taskMaxAttempt) {
            this.putBodyParameter("TaskMaxAttempt", taskMaxAttempt);
            this.taskMaxAttempt = taskMaxAttempt;
            return this;
        }

        /**
         * <p>The time expression. Specify the time expression based on the value of TimeType:</p>
         * <ul>
         * <li>If you set TimeType to <strong>1</strong> (cron), specify this parameter to a standard CRON expression.</li>
         * <li>If you set TimeType to <strong>100</strong> (api), no time expression is required.</li>
         * <li>If you set TimeType to <strong>3</strong> (fixed_rate), specify this parameter to a fixed frequency in seconds. For example, if you set this parameter to 30, the system triggers a job every 30 seconds.</li>
         * <li>If you set TimeType to <strong>4</strong> (second_delay), specify this parameter to a fixed delay after which the job is triggered. Valid values: 1 to 60. Unit: seconds.</li>
         * <li>If you set TimeType to <strong>5</strong> (one_time), specify this parameter to a specific time point at which the job is triggered. The time is in the format of yyyy-MM-dd HH:mm:ss, such as 2022-10-10 10:10:00, or a timestamp in milliseconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0 0/10 * * * ?</p>
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * <p>The time type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: cron</li>
         * <li><strong>3</strong>: fixed_rate</li>
         * <li><strong>4</strong>: second_delay</li>
         * <li><strong>5</strong>: one_time</li>
         * <li><strong>100</strong>: api</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeType(Integer timeType) {
            this.putBodyParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * <p>The timeout threshold. Unit: seconds. Default value: 7200.</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        public Builder timeout(Long timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>Specifies whether to enable the timeout alert feature. If the feature is enabled, an alert will be triggered upon a timeout. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the timeout alert feature.</li>
         * <li><strong>false</strong>: disables the timeout alert feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder timeoutEnable(Boolean timeoutEnable) {
            this.putBodyParameter("TimeoutEnable", timeoutEnable);
            this.timeoutEnable = timeoutEnable;
            return this;
        }

        /**
         * <p>Specifies whether to enable the timeout termination feature. If the feature is enabled, a job will automatically be terminated if it times out. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the timeout termination feature.</li>
         * <li><strong>false</strong>: disables the timeout termination feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder timeoutKillEnable(Boolean timeoutKillEnable) {
            this.putBodyParameter("TimeoutKillEnable", timeoutKillEnable);
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }

        /**
         * <p>Time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>GMT+8</p>
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The extended attributes. If you set JobType to k8s, this parameter is required. For a job whose resource type is Job-YAML, set this parameter to {&quot;resource&quot;:&quot;job&quot;}. For a job whose resource type is Shell-Script, set this parameter to {&quot;image&quot;:&quot;busybox&quot;,&quot;resource&quot;:&quot;shell&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;resource&quot;:&quot;job&quot;}</p>
         */
        public Builder xAttrs(String xAttrs) {
            this.putBodyParameter("XAttrs", xAttrs);
            this.xAttrs = xAttrs;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
             * <p>The webhook URL of the DingTalk chatbot.<a href="https://open.dingtalk.com/document/org/application-types"></a></p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>**********</p>
             */
            public Builder ding(String ding) {
                this.ding = ding;
                return this;
            }

            /**
             * <p>The email address of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>test***@***.com</p>
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * <p>The name of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Tom</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The mobile number of the alert contact.</p>
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
}
