// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoThrottleRulesAsyncRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoThrottleRulesAsyncRequest</p>
 */
public class UpdateAutoThrottleRulesAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbnormalDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double abnormalDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveSessions")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long activeSessions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowThrottleEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowThrottleEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowThrottleStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowThrottleStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoKillSession")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoKillSession;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuSessionRelation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cpuSessionRelation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuUsage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double cpuUsage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxThrottleTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double maxThrottleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultId")
    private String resultId;

    private UpdateAutoThrottleRulesAsyncRequest(Builder builder) {
        super(builder);
        this.abnormalDuration = builder.abnormalDuration;
        this.activeSessions = builder.activeSessions;
        this.allowThrottleEndTime = builder.allowThrottleEndTime;
        this.allowThrottleStartTime = builder.allowThrottleStartTime;
        this.autoKillSession = builder.autoKillSession;
        this.consoleContext = builder.consoleContext;
        this.cpuSessionRelation = builder.cpuSessionRelation;
        this.cpuUsage = builder.cpuUsage;
        this.instanceIds = builder.instanceIds;
        this.maxThrottleTime = builder.maxThrottleTime;
        this.resultId = builder.resultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoThrottleRulesAsyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalDuration
     */
    public Double getAbnormalDuration() {
        return this.abnormalDuration;
    }

    /**
     * @return activeSessions
     */
    public Long getActiveSessions() {
        return this.activeSessions;
    }

    /**
     * @return allowThrottleEndTime
     */
    public String getAllowThrottleEndTime() {
        return this.allowThrottleEndTime;
    }

    /**
     * @return allowThrottleStartTime
     */
    public String getAllowThrottleStartTime() {
        return this.allowThrottleStartTime;
    }

    /**
     * @return autoKillSession
     */
    public Boolean getAutoKillSession() {
        return this.autoKillSession;
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return cpuSessionRelation
     */
    public String getCpuSessionRelation() {
        return this.cpuSessionRelation;
    }

    /**
     * @return cpuUsage
     */
    public Double getCpuUsage() {
        return this.cpuUsage;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return maxThrottleTime
     */
    public Double getMaxThrottleTime() {
        return this.maxThrottleTime;
    }

    /**
     * @return resultId
     */
    public String getResultId() {
        return this.resultId;
    }

    public static final class Builder extends Request.Builder<UpdateAutoThrottleRulesAsyncRequest, Builder> {
        private Double abnormalDuration; 
        private Long activeSessions; 
        private String allowThrottleEndTime; 
        private String allowThrottleStartTime; 
        private Boolean autoKillSession; 
        private String consoleContext; 
        private String cpuSessionRelation; 
        private Double cpuUsage; 
        private String instanceIds; 
        private Double maxThrottleTime; 
        private String resultId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoThrottleRulesAsyncRequest request) {
            super(request);
            this.abnormalDuration = request.abnormalDuration;
            this.activeSessions = request.activeSessions;
            this.allowThrottleEndTime = request.allowThrottleEndTime;
            this.allowThrottleStartTime = request.allowThrottleStartTime;
            this.autoKillSession = request.autoKillSession;
            this.consoleContext = request.consoleContext;
            this.cpuSessionRelation = request.cpuSessionRelation;
            this.cpuUsage = request.cpuUsage;
            this.instanceIds = request.instanceIds;
            this.maxThrottleTime = request.maxThrottleTime;
            this.resultId = request.resultId;
        } 

        /**
         * The duration threshold for triggering automatic SQL throttling. Set this parameter to a positive integer that is greater than or equal to 2. Unit: minutes.
         */
        public Builder abnormalDuration(Double abnormalDuration) {
            this.putQueryParameter("AbnormalDuration", abnormalDuration);
            this.abnormalDuration = abnormalDuration;
            return this;
        }

        /**
         * The maximum number of active sessions.
         * <p>
         * 
         * *   Specify an integer that is greater than or equal to 16 when the CPU utilization threshold and the maximum number of active sessions are in the **OR** relationship.
         * *   Specify an integer that is greater than or equal to 2 when the CPU utilization threshold and the maximum number of active sessions are in the **AND** relationship.
         */
        public Builder activeSessions(Long activeSessions) {
            this.putQueryParameter("ActiveSessions", activeSessions);
            this.activeSessions = activeSessions;
            return this;
        }

        /**
         * The end time of the throttling window. The time must be in UTC.
         */
        public Builder allowThrottleEndTime(String allowThrottleEndTime) {
            this.putQueryParameter("AllowThrottleEndTime", allowThrottleEndTime);
            this.allowThrottleEndTime = allowThrottleEndTime;
            return this;
        }

        /**
         * The start time of the throttling window. The time must be in UTC.
         */
        public Builder allowThrottleStartTime(String allowThrottleStartTime) {
            this.putQueryParameter("AllowThrottleStartTime", allowThrottleStartTime);
            this.allowThrottleStartTime = allowThrottleStartTime;
            return this;
        }

        /**
         * Specifies whether to terminate abnormal SQL statements in execution at the same time. Valid values:
         * <p>
         * 
         * >  Abnormal SQL statements use the same template as the SQL statements that need to be throttled.
         * 
         * *   **true**
         * *   **false**
         */
        public Builder autoKillSession(Boolean autoKillSession) {
            this.putQueryParameter("AutoKillSession", autoKillSession);
            this.autoKillSession = autoKillSession;
            return this;
        }

        /**
         * The reserved parameter.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:
         * <p>
         * 
         * *   **AND**
         * *   **OR**
         */
        public Builder cpuSessionRelation(String cpuSessionRelation) {
            this.putQueryParameter("CpuSessionRelation", cpuSessionRelation);
            this.cpuSessionRelation = cpuSessionRelation;
            return this;
        }

        /**
         * The CPU utilization threshold, in percentages. Valid values: 70 to 100.
         */
        public Builder cpuUsage(Double cpuUsage) {
            this.putQueryParameter("CpuUsage", cpuUsage);
            this.cpuUsage = cpuUsage;
            return this;
        }

        /**
         * The database instance IDs.
         * <p>
         * 
         * >  Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: `[\"Instance ID1\", \"Instance ID2\"]`.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The maximum throttling duration. Set this parameter to a positive integer. Unit: minutes.
         */
        public Builder maxThrottleTime(Double maxThrottleTime) {
            this.putQueryParameter("MaxThrottleTime", maxThrottleTime);
            this.maxThrottleTime = maxThrottleTime;
            return this;
        }

        /**
         * The ID of the asynchronous request.
         * <p>
         * 
         * >  You can leave this parameter empty when you call the operation to initiate the request for the first time, and use the value of this parameter contained in the response to the first request for subsequent requests.
         */
        public Builder resultId(String resultId) {
            this.putQueryParameter("ResultId", resultId);
            this.resultId = resultId;
            return this;
        }

        @Override
        public UpdateAutoThrottleRulesAsyncRequest build() {
            return new UpdateAutoThrottleRulesAsyncRequest(this);
        } 

    } 

}
