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
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

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
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

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
        this.endTime = builder.endTime;
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
        this.priority = builder.priority;
        this.queueSize = builder.queueSize;
        this.regionId = builder.regionId;
        this.sendChannel = builder.sendChannel;
        this.startTime = builder.startTime;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
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
        private java.util.List<ContactInfo> contactInfo; 
        private String content; 
        private Integer dataOffset; 
        private String description; 
        private Integer dispatcherSize; 
        private Long endTime; 
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
        private Integer priority; 
        private Integer queueSize; 
        private String regionId; 
        private String sendChannel; 
        private Long startTime; 
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
            this.endTime = request.endTime;
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
            this.priority = request.priority;
            this.queueSize = request.queueSize;
            this.regionId = request.regionId;
            this.sendChannel = request.sendChannel;
            this.startTime = request.startTime;
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
         * <p>The retry interval on errors. Unit: seconds. Default value: 30.</p>
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
         * <p>The custom calendar that can be optionally specified for the cron type.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        public Builder calendar(String calendar) {
            this.putBodyParameter("Calendar", calendar);
            this.calendar = calendar;
            return this;
        }

        /**
         * <p>The full path of the node interface class.</p>
         * <p>This field is required and must contain the full path only for Java node types.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.test.helloworld</p>
         */
        public Builder className(String className) {
            this.putBodyParameter("ClassName", className);
            this.className = className;
            return this;
        }

        /**
         * <p>Advanced configuration for parallel grid tasks. The number of threads for a single trigger on a single machine. Default value: 5.</p>
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
         * <p>The contact information for the node.</p>
         * <blockquote>
         * <p>Notice: This parameter is deprecated.</notice></p>
         * </blockquote>
         */
        public Builder contactInfo(java.util.List<ContactInfo> contactInfo) {
            this.putBodyParameter("ContactInfo", contactInfo);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * <ul>
         * <li>If the node type is python, shell, or k8s, specify the corresponding script content.</li>
         * <li>If the node type is golang, the content format example is {&quot;jobName&quot;:&quot;HelloWorld&quot;}.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>echo \&quot;hello\&quot;</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The time offset that can be optionally specified for the cron type. Unit: seconds.</p>
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
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Advanced configuration for parallel grid tasks. The number of subtask dispatch threads. Default value: 5.</p>
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The node execution mode. The following execution modes are supported:</p>
         * <ul>
         * <li><strong>Standalone</strong>: standalone</li>
         * <li><strong>Broadcast</strong>: broadcatst</li>
         * <li><strong>Visual MapReduce</strong>: parallel</li>
         * <li><strong>MapReduce</strong>: batch</li>
         * <li><strong>Sharding</strong>: shard</li>
         * </ul>
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
         * <p>Specifies whether to enable the failure alert. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the failure alert.</li>
         * <li><strong>false</strong>: disables the failure alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder failEnable(Boolean failEnable) {
            this.putBodyParameter("FailEnable", failEnable);
            this.failEnable = failEnable;
            return this;
        }

        /**
         * <p>The number of consecutive failures before an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failTimes(Integer failTimes) {
            this.putBodyParameter("FailTimes", failTimes);
            this.failTimes = failTimes;
            return this;
        }

        /**
         * <p>The application ID. You can obtain the application ID on the Application Management page in the console.</p>
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
         * <p>The node ID. You can obtain the node ID on the Task Management page in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>92583</p>
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The maximum number of retries on errors. Set this parameter based on your business requirements.</p>
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
         * <p>The maximum number of concurrently running instances. Default value: 1. This means that if the previous trigger has not finished running, the next trigger is skipped even if the scheduled time has arrived.</p>
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
         * <p>Specifies whether to enable the no-available-machine alert. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the no-available-machine alert.</li>
         * <li><strong>false</strong>: disables the no-available-machine alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder missWorkerEnable(Boolean missWorkerEnable) {
            this.putBodyParameter("MissWorkerEnable", missWorkerEnable);
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>helloword</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the console.</p>
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
         * <p>This parameter is required only for special third-party users.</p>
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
         * <p>Advanced configuration for parallel grid tasks. The number of subtasks pulled per request. Default value: 100.</p>
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
         * <p>The user-defined parameters that can be obtained at runtime.</p>
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
         * <p>The node priority. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low</li>
         * <li><strong>5</strong>: medium</li>
         * <li><strong>10</strong>: high</li>
         * <li><strong>15</strong>: very high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>Advanced configuration for parallel grid tasks. The maximum cache size of the subtask queue. Default value: 10000.</p>
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
         * <p>The alert notification method. Currently, only sms is supported.</p>
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
         * <p>The start timestamp in milliseconds. The value must be greater than the current time. A value of -1 indicates immediate start.</p>
         * 
         * <strong>example:</strong>
         * <p>1789454134000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable the success notification.</p>
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
         * <p>Advanced configuration for parallel grid tasks. The retry interval for failed subtasks.</p>
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
         * <p>Advanced configuration for parallel grid tasks. Specifies the push model or pull model.</p>
         * 
         * <strong>example:</strong>
         * <p>push</p>
         */
        public Builder taskDispatchMode(String taskDispatchMode) {
            this.putBodyParameter("TaskDispatchMode", taskDispatchMode);
            this.taskDispatchMode = taskDispatchMode;
            return this;
        }

        /**
         * <p>Advanced configuration for parallel grid tasks. The number of retries for failed subtasks.</p>
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
         * <p>The custom task template for k8s node types.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1
         * kind: Pod
         * metadata:
         *   name: schedulerx-node-{JOB_ID}
         *   namespace: {NAMESPACE}
         * spec:
         *   containers:</p>
         * <ul>
         * <li>name: node-job
         * image: node:16
         * imagePullPolicy: IfNotPresent
         * volumeMounts:<ul>
         * <li>name: script-node
         * mountPath: script/node
         * command: [&quot;node&quot;, &quot;script/node/node-{JOB_ID}.js&quot;]
         * volumes:</li>
         * </ul>
         * </li>
         * <li>name: script-node
         * configMap:
         *   name: schedulerx-configmap
         *   items:<ul>
         * <li>key: schedulerx-node-{JOB_ID}
         * path: node-{JOB_ID}.js</li>
         * </ul>
         * </li>
         * </ul>
         * <p>  restartPolicy: Never</p>
         */
        public Builder template(String template) {
            this.putBodyParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * <p>The time expression. Set the time expression based on the selected time type.</p>
         * <ul>
         * <li><strong>cron</strong>: specify a standard cron expression, which supports online verification.</li>
         * <li><strong>api</strong>: no time expression is required.</li>
         * <li><strong>fixed_rate</strong>: specify a fixed frequency value in seconds. For example, 30 indicates that the node is triggered every 30 seconds.</li>
         * <li><strong>second_delay</strong>: specify a fixed delay in seconds before each execution (1s to 60s).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * <p>The time configuration type. The following configuration types are supported:</p>
         * <ul>
         * <li><strong>cron</strong>: 1</li>
         * <li><strong>fix_rate</strong>: 3</li>
         * <li><strong>second_delay</strong>: 4</li>
         * <li><strong>one_time</strong>: 5</li>
         * <li><strong>api</strong>: 100</li>
         * </ul>
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
         * <p>The timeout threshold. Unit: seconds.</p>
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
         * <p>Specifies whether to enable the timeout alert. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the timeout alert.</li>
         * <li><strong>false</strong>: disables the timeout alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder timeoutEnable(Boolean timeoutEnable) {
            this.putBodyParameter("TimeoutEnable", timeoutEnable);
            this.timeoutEnable = timeoutEnable;
            return this;
        }

        /**
         * <p>Specifies whether to enable the timeout termination for the current trigger. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the timeout termination.</li>
         * <li><strong>false</strong>: disables the timeout termination.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder timeoutKillEnable(Boolean timeoutKillEnable) {
            this.putBodyParameter("TimeoutKillEnable", timeoutKillEnable);
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }

        /**
         * <p>The time zone.</p>
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
         * <p>The extended attributes. This parameter is required for k8s node types.
         * Job task: {&quot;resource&quot;:&quot;job&quot;}
         * Shell task: {&quot;image&quot;:&quot;busybox&quot;,&quot;resource&quot;:&quot;shell&quot;}</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;resource&quot;:&quot;shell&quot;,&quot;fileFormat&quot;:&quot;unix&quot;,&quot;templateType&quot;:&quot;customTemplate&quot;}</p>
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

    /**
     * 
     * {@link UpdateJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateJobRequest</p>
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
             * <p>The webhook URL of the DingTalk chatbot in the DingTalk group for alert contacts. References: <a href="https://open.dingtalk.com/document/org/application-types">DingTalk development documentation</a>.</p>
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
             * <p>test***@***.com</p>
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
}
