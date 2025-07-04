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
    @com.aliyun.core.annotation.Validation(maximum = 8, minimum = 1)
    private Integer routeStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Script")
    private String script;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeExpression")
    private String timeExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeType")
    private Integer timeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    private UpdateJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.attemptInterval = builder.attemptInterval;
        this.calendar = builder.calendar;
        this.childJobId = builder.childJobId;
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.executorBlockStrategy = builder.executorBlockStrategy;
        this.jobHandler = builder.jobHandler;
        this.jobId = builder.jobId;
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
        this.timeExpression = builder.timeExpression;
        this.timeType = builder.timeType;
        this.timezone = builder.timezone;
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

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private String regionId; 
        private String appName; 
        private Integer attemptInterval; 
        private String calendar; 
        private String childJobId; 
        private String clusterId; 
        private String description; 
        private Integer executorBlockStrategy; 
        private String jobHandler; 
        private Long jobId; 
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
        private String timeExpression; 
        private Integer timeType; 
        private String timezone; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.attemptInterval = request.attemptInterval;
            this.calendar = request.calendar;
            this.childJobId = request.childJobId;
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.executorBlockStrategy = request.executorBlockStrategy;
            this.jobHandler = request.jobHandler;
            this.jobId = request.jobId;
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
            this.timeExpression = request.timeExpression;
            this.timeType = request.timeType;
            this.timezone = request.timezone;
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
         * AttemptInterval.
         */
        public Builder attemptInterval(Integer attemptInterval) {
            this.putBodyParameter("AttemptInterval", attemptInterval);
            this.attemptInterval = attemptInterval;
            return this;
        }

        /**
         * Calendar.
         */
        public Builder calendar(String calendar) {
            this.putBodyParameter("Calendar", calendar);
            this.calendar = calendar;
            return this;
        }

        /**
         * ChildJobId.
         */
        public Builder childJobId(String childJobId) {
            this.putBodyParameter("ChildJobId", childJobId);
            this.childJobId = childJobId;
            return this;
        }

        /**
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExecutorBlockStrategy.
         */
        public Builder executorBlockStrategy(Integer executorBlockStrategy) {
            this.putBodyParameter("ExecutorBlockStrategy", executorBlockStrategy);
            this.executorBlockStrategy = executorBlockStrategy;
            return this;
        }

        /**
         * JobHandler.
         */
        public Builder jobHandler(String jobHandler) {
            this.putBodyParameter("JobHandler", jobHandler);
            this.jobHandler = jobHandler;
            return this;
        }

        /**
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
         * MaxAttempt.
         */
        public Builder maxAttempt(Integer maxAttempt) {
            this.putBodyParameter("MaxAttempt", maxAttempt);
            this.maxAttempt = maxAttempt;
            return this;
        }

        /**
         * MaxConcurrency.
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putBodyParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NoticeConfig.
         */
        public Builder noticeConfig(NoticeConfig noticeConfig) {
            String noticeConfigShrink = shrink(noticeConfig, "NoticeConfig", "json");
            this.putBodyParameter("NoticeConfig", noticeConfigShrink);
            this.noticeConfig = noticeConfig;
            return this;
        }

        /**
         * NoticeContacts.
         */
        public Builder noticeContacts(java.util.List<NoticeContacts> noticeContacts) {
            String noticeContactsShrink = shrink(noticeContacts, "NoticeContacts", "json");
            this.putBodyParameter("NoticeContacts", noticeContactsShrink);
            this.noticeContacts = noticeContacts;
            return this;
        }

        /**
         * Parameters.
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
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RouteStrategy.
         */
        public Builder routeStrategy(Integer routeStrategy) {
            this.putBodyParameter("RouteStrategy", routeStrategy);
            this.routeStrategy = routeStrategy;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.putBodyParameter("Script", script);
            this.script = script;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TimeExpression.
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * TimeType.
         */
        public Builder timeType(Integer timeType) {
            this.putBodyParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * Timezone.
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("Timezone", timezone);
            this.timezone = timezone;
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
             * FailEnable.
             */
            public Builder failEnable(Boolean failEnable) {
                this.failEnable = failEnable;
                return this;
            }

            /**
             * FailLimitTimes.
             */
            public Builder failLimitTimes(Integer failLimitTimes) {
                this.failLimitTimes = failLimitTimes;
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
             * SuccessNotice.
             */
            public Builder successNotice(Boolean successNotice) {
                this.successNotice = successNotice;
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
             * ContactType.
             */
            public Builder contactType(Integer contactType) {
                this.contactType = contactType;
                return this;
            }

            /**
             * Name.
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
