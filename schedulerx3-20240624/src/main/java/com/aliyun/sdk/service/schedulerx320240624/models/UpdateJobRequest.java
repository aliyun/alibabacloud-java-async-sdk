// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppGroupId")
    private Long appGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttemptInterval")
    private Integer attemptInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Calendar")
    private String calendar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildJobId")
    private String childJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DependentStrategy")
    private Integer dependentStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 300)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutorBlockStrategy")
    private Integer executorBlockStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobHandler")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String jobHandler;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxAttempt")
    private Integer maxAttempt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer maxConcurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeConfig")
    private NoticeConfig noticeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeContacts")
    private java.util.List<NoticeContacts> noticeContacts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(maxLength = 2000)
    private String parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteStrategy")
    @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
    private Integer routeStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Script")
    private String script;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTimeType")
    private String startTimeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeExpression")
    private String timeExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeType")
    private Integer timeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("XAttrs")
    private String xAttrs;

    private UpdateJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appGroupId = builder.appGroupId;
        this.appName = builder.appName;
        this.attemptInterval = builder.attemptInterval;
        this.calendar = builder.calendar;
        this.childJobId = builder.childJobId;
        this.clusterId = builder.clusterId;
        this.dependentStrategy = builder.dependentStrategy;
        this.description = builder.description;
        this.executorBlockStrategy = builder.executorBlockStrategy;
        this.jobHandler = builder.jobHandler;
        this.jobId = builder.jobId;
        this.label = builder.label;
        this.maxAttempt = builder.maxAttempt;
        this.maxConcurrency = builder.maxConcurrency;
        this.name = builder.name;
        this.noticeConfig = builder.noticeConfig;
        this.noticeContacts = builder.noticeContacts;
        this.parameters = builder.parameters;
        this.priority = builder.priority;
        this.routeStrategy = builder.routeStrategy;
        this.script = builder.script;
        this.startTime = builder.startTime;
        this.startTimeType = builder.startTimeType;
        this.timeExpression = builder.timeExpression;
        this.timeType = builder.timeType;
        this.timezone = builder.timezone;
        this.weight = builder.weight;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appGroupId
     */
    public Long getAppGroupId() {
        return this.appGroupId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return childJobId
     */
    public String getChildJobId() {
        return this.childJobId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dependentStrategy
     */
    public Integer getDependentStrategy() {
        return this.dependentStrategy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executorBlockStrategy
     */
    public Integer getExecutorBlockStrategy() {
        return this.executorBlockStrategy;
    }

    /**
     * @return jobHandler
     */
    public String getJobHandler() {
        return this.jobHandler;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return noticeConfig
     */
    public NoticeConfig getNoticeConfig() {
        return this.noticeConfig;
    }

    /**
     * @return noticeContacts
     */
    public java.util.List<NoticeContacts> getNoticeContacts() {
        return this.noticeContacts;
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
     * @return routeStrategy
     */
    public Integer getRouteStrategy() {
        return this.routeStrategy;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return startTimeType
     */
    public String getStartTimeType() {
        return this.startTimeType;
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
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    /**
     * @return xAttrs
     */
    public String getXAttrs() {
        return this.xAttrs;
    }

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private String regionId; 
        private Long appGroupId; 
        private String appName; 
        private Integer attemptInterval; 
        private String calendar; 
        private String childJobId; 
        private String clusterId; 
        private Integer dependentStrategy; 
        private String description; 
        private Integer executorBlockStrategy; 
        private String jobHandler; 
        private Long jobId; 
        private String label; 
        private Integer maxAttempt; 
        private Integer maxConcurrency; 
        private String name; 
        private NoticeConfig noticeConfig; 
        private java.util.List<NoticeContacts> noticeContacts; 
        private String parameters; 
        private Integer priority; 
        private Integer routeStrategy; 
        private String script; 
        private Long startTime; 
        private String startTimeType; 
        private String timeExpression; 
        private Integer timeType; 
        private String timezone; 
        private Integer weight; 
        private String xAttrs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appGroupId = request.appGroupId;
            this.appName = request.appName;
            this.attemptInterval = request.attemptInterval;
            this.calendar = request.calendar;
            this.childJobId = request.childJobId;
            this.clusterId = request.clusterId;
            this.dependentStrategy = request.dependentStrategy;
            this.description = request.description;
            this.executorBlockStrategy = request.executorBlockStrategy;
            this.jobHandler = request.jobHandler;
            this.jobId = request.jobId;
            this.label = request.label;
            this.maxAttempt = request.maxAttempt;
            this.maxConcurrency = request.maxConcurrency;
            this.name = request.name;
            this.noticeConfig = request.noticeConfig;
            this.noticeContacts = request.noticeContacts;
            this.parameters = request.parameters;
            this.priority = request.priority;
            this.routeStrategy = request.routeStrategy;
            this.script = request.script;
            this.startTime = request.startTime;
            this.startTimeType = request.startTimeType;
            this.timeExpression = request.timeExpression;
            this.timeType = request.timeType;
            this.timezone = request.timezone;
            this.weight = request.weight;
            this.xAttrs = request.xAttrs;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The application ID.</p>
         */
        public Builder appGroupId(Long appGroupId) {
            this.putBodyParameter("AppGroupId", appGroupId);
            this.appGroupId = appGroupId;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The retry interval upon node failure.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder attemptInterval(Integer attemptInterval) {
            this.putBodyParameter("AttemptInterval", attemptInterval);
            this.attemptInterval = attemptInterval;
            return this;
        }

        /**
         * <p>The custom calendar.</p>
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
         * <p>The child node IDs, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder childJobId(String childJobId) {
            this.putBodyParameter("ChildJobId", childJobId);
            this.childJobId = childJobId;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The dependency strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dependentStrategy(Integer dependentStrategy) {
            this.putBodyParameter("DependentStrategy", dependentStrategy);
            this.dependentStrategy = dependentStrategy;
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
         * <p>The client blocking strategy. Valid values:</p>
         * <ul>
         * <li>1: serial execution on a single machine</li>
         * <li>2: ignore subsequent scheduling</li>
         * <li>3: override previous scheduling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder executorBlockStrategy(Integer executorBlockStrategy) {
            this.putBodyParameter("ExecutorBlockStrategy", executorBlockStrategy);
            this.executorBlockStrategy = executorBlockStrategy;
            return this;
        }

        /**
         * <p>The jobhandler name.</p>
         * 
         * <strong>example:</strong>
         * <p>testJobVoidHandler</p>
         */
        public Builder jobHandler(String jobHandler) {
            this.putBodyParameter("JobHandler", jobHandler);
            this.jobHandler = jobHandler;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74</p>
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The node label information.</p>
         * 
         * <strong>example:</strong>
         * <p>{key:value}</p>
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>The maximum number of retry attempts upon node failure.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxAttempt(Integer maxAttempt) {
            this.putBodyParameter("MaxAttempt", maxAttempt);
            this.maxAttempt = maxAttempt;
            return this;
        }

        /**
         * <p>The maximum concurrency of the node.</p>
         * <blockquote>
         * <p>The maximum number of instances that can run simultaneously for the same node. A value of 1 indicates that repeated execution is not allowed. If the concurrency limit is exceeded, the current scheduling is skipped.</p>
         * </blockquote>
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
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The notification configuration.</p>
         */
        public Builder noticeConfig(NoticeConfig noticeConfig) {
            String noticeConfigShrink = shrink(noticeConfig, "NoticeConfig", "json");
            this.putBodyParameter("NoticeConfig", noticeConfigShrink);
            this.noticeConfig = noticeConfig;
            return this;
        }

        /**
         * <p>The notification contact configuration.</p>
         */
        public Builder noticeContacts(java.util.List<NoticeContacts> noticeContacts) {
            String noticeContactsShrink = shrink(noticeContacts, "NoticeContacts", "json");
            this.putBodyParameter("NoticeContacts", noticeContactsShrink);
            this.noticeContacts = noticeContacts;
            return this;
        }

        /**
         * <p>The node parameters.</p>
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
         * <p>The execution priority of the node. Valid values:</p>
         * <ul>
         * <li>1: low</li>
         * <li>5: medium</li>
         * <li>10: high</li>
         * <li>15: very high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The routing strategy. Valid values:</p>
         * <ul>
         * <li>1: round robin</li>
         * <li>2: random</li>
         * <li>3: first</li>
         * <li>4: last</li>
         * <li>5: least frequently used</li>
         * <li>6: least recently used</li>
         * <li>7: consistent hashing</li>
         * <li>8: shard broadcast</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder routeStrategy(Integer routeStrategy) {
            this.putBodyParameter("RouteStrategy", routeStrategy);
            this.routeStrategy = routeStrategy;
            return this;
        }

        /**
         * <p>The script configured for non-BEAN nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;hello world&quot;</p>
         */
        public Builder script(String script) {
            this.putBodyParameter("Script", script);
            this.script = script;
            return this;
        }

        /**
         * <p>The scheduling start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1716902187</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The start time type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder startTimeType(String startTimeType) {
            this.putBodyParameter("StartTimeType", startTimeType);
            this.startTimeType = startTimeType;
            return this;
        }

        /**
         * <p>The time expression. Set the time expression based on the selected time type.</p>
         * <ul>
         * <li>none: No value is required.</li>
         * <li>cron: Enter a standard cron expression. Online verification is supported.</li>
         * <li>api: No value is required.</li>
         * <li>fixed_rate: Enter a fixed frequency value in seconds. For example, 30 indicates that the node is triggered every 30 seconds.</li>
         * <li>one_time: Enter a scheduling time in the format of yyyy-MM-dd HH:mm:ss or a timestamp in milliseconds. For example, &quot;2022-10-10 10:10:00&quot;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0 0 4 ? * Mon/1</p>
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * <p>The time type. Valid values:</p>
         * <ul>
         * <li>-1: none</li>
         * <li>1: cron</li>
         * <li>3: fix_rate</li>
         * <li>5: one_time</li>
         * <li>100: api</li>
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
         * <p>The time zone.</p>
         * <blockquote>
         * <p>Default value: the time zone of the SchedulerX server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Hongkong</p>
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The node weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder weight(Integer weight) {
            this.putBodyParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        /**
         * <p>The extended properties of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;reponseMode&quot;:&quot;streaming&quot;}</p>
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
    public static class NoticeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndEarly")
        private Integer endEarly;

        @com.aliyun.core.annotation.NameInMap("EndEarlyEnable")
        private Boolean endEarlyEnable;

        @com.aliyun.core.annotation.NameInMap("FailEnable")
        private Boolean failEnable;

        @com.aliyun.core.annotation.NameInMap("FailLimitTimes")
        private Integer failLimitTimes;

        @com.aliyun.core.annotation.NameInMap("MissWorkerEnable")
        private Boolean missWorkerEnable;

        @com.aliyun.core.annotation.NameInMap("SendChannel")
        private String sendChannel;

        @com.aliyun.core.annotation.NameInMap("SuccessNotice")
        private Boolean successNotice;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("TimeoutEnable")
        private Boolean timeoutEnable;

        @com.aliyun.core.annotation.NameInMap("TimeoutKillEnable")
        private Boolean timeoutKillEnable;

        private NoticeConfig(Builder builder) {
            this.endEarly = builder.endEarly;
            this.endEarlyEnable = builder.endEarlyEnable;
            this.failEnable = builder.failEnable;
            this.failLimitTimes = builder.failLimitTimes;
            this.missWorkerEnable = builder.missWorkerEnable;
            this.sendChannel = builder.sendChannel;
            this.successNotice = builder.successNotice;
            this.timeout = builder.timeout;
            this.timeoutEnable = builder.timeoutEnable;
            this.timeoutKillEnable = builder.timeoutKillEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeConfig create() {
            return builder().build();
        }

        /**
         * @return endEarly
         */
        public Integer getEndEarly() {
            return this.endEarly;
        }

        /**
         * @return endEarlyEnable
         */
        public Boolean getEndEarlyEnable() {
            return this.endEarlyEnable;
        }

        /**
         * @return failEnable
         */
        public Boolean getFailEnable() {
            return this.failEnable;
        }

        /**
         * @return failLimitTimes
         */
        public Integer getFailLimitTimes() {
            return this.failLimitTimes;
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
         * @return successNotice
         */
        public Boolean getSuccessNotice() {
            return this.successNotice;
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
            private Integer endEarly; 
            private Boolean endEarlyEnable; 
            private Boolean failEnable; 
            private Integer failLimitTimes; 
            private Boolean missWorkerEnable; 
            private String sendChannel; 
            private Boolean successNotice; 
            private Long timeout; 
            private Boolean timeoutEnable; 
            private Boolean timeoutKillEnable; 

            private Builder() {
            } 

            private Builder(NoticeConfig model) {
                this.endEarly = model.endEarly;
                this.endEarlyEnable = model.endEarlyEnable;
                this.failEnable = model.failEnable;
                this.failLimitTimes = model.failLimitTimes;
                this.missWorkerEnable = model.missWorkerEnable;
                this.sendChannel = model.sendChannel;
                this.successNotice = model.successNotice;
                this.timeout = model.timeout;
                this.timeoutEnable = model.timeoutEnable;
                this.timeoutKillEnable = model.timeoutKillEnable;
            } 

            /**
             * <p>The early completion threshold, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder endEarly(Integer endEarly) {
                this.endEarly = endEarly;
                return this;
            }

            /**
             * <p>Specifies whether to enable the early completion alert.</p>
             */
            public Builder endEarlyEnable(Boolean endEarlyEnable) {
                this.endEarlyEnable = endEarlyEnable;
                return this;
            }

            /**
             * <p>Specifies whether to enable the failure alert. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enables the failure alert.</li>
             * <li><strong>false</strong>: Disables the failure alert.</li>
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
             * <p>The number of consecutive failures.</p>
             * <blockquote>
             * <p>An alert is sent only when the number of consecutive failures exceeds the configured value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder failLimitTimes(Integer failLimitTimes) {
                this.failLimitTimes = failLimitTimes;
                return this;
            }

            /**
             * <p>Specifies whether to enable the no-available-machine alert. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enables the no-available-machine alert.</li>
             * <li><strong>false</strong>: Disables the no-available-machine alert.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder missWorkerEnable(Boolean missWorkerEnable) {
                this.missWorkerEnable = missWorkerEnable;
                return this;
            }

            /**
             * <p>The notification channel. Valid values:</p>
             * <ul>
             * <li>sms: SMS</li>
             * <li>phone: phone call</li>
             * <li>mail: email</li>
             * <li>webhook: webhook<blockquote>
             * <p>Separate multiple notification channels with commas.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>webhook,sms,mail,phone</p>
             */
            public Builder sendChannel(String sendChannel) {
                this.sendChannel = sendChannel;
                return this;
            }

            /**
             * <p>Specifies whether to enable the success notification. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder successNotice(Boolean successNotice) {
                this.successNotice = successNotice;
                return this;
            }

            /**
             * <p>The node execution timeout period, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>Specifies whether to enable the timeout alert. Valid values:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false: Disabled.</p>
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
             * <p>Specifies whether to enable the timeout termination for the current trigger. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enables the timeout termination.</li>
             * <li><strong>false</strong>: Disables the timeout termination.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder timeoutKillEnable(Boolean timeoutKillEnable) {
                this.timeoutKillEnable = timeoutKillEnable;
                return this;
            }

            public NoticeConfig build() {
                return new NoticeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateJobRequest</p>
     */
    public static class NoticeContacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactType")
        private Integer contactType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private NoticeContacts(Builder builder) {
            this.contactType = builder.contactType;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeContacts create() {
            return builder().build();
        }

        /**
         * @return contactType
         */
        public Integer getContactType() {
            return this.contactType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer contactType; 
            private String name; 

            private Builder() {
            } 

            private Builder(NoticeContacts model) {
                this.contactType = model.contactType;
                this.name = model.name;
            } 

            /**
             * <p>The contact type. </p>
             * <blockquote>
             * <p>Default configurations: 1.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder contactType(Integer contactType) {
                this.contactType = contactType;
                return this;
            }

            /**
             * <p>The contact name.</p>
             * 
             * <strong>example:</strong>
             * <p>xiaoming</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NoticeContacts build() {
                return new NoticeContacts(this);
            } 

        } 

    }
}
