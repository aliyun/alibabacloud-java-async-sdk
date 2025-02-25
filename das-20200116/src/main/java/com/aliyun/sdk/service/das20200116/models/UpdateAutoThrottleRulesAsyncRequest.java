// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
         * <p>The duration threshold for triggering automatic SQL throttling. Set this parameter to an integer that is greater than or equal to 2. Unit: minutes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder abnormalDuration(Double abnormalDuration) {
            this.putQueryParameter("AbnormalDuration", abnormalDuration);
            this.abnormalDuration = abnormalDuration;
            return this;
        }

        /**
         * <p>The threshold for the number of active sessions.</p>
         * <ul>
         * <li>If this parameter and CpuUsage are in the <strong>OR</strong> relationship, set this parameter to an integer that is greater than or equal to 16.</li>
         * <li>If this parameter and CpuUsage are in the <strong>AND</strong> relationship, set this parameter to an integer that is greater than or equal to 2.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder activeSessions(Long activeSessions) {
            this.putQueryParameter("ActiveSessions", activeSessions);
            this.activeSessions = activeSessions;
            return this;
        }

        /**
         * <p>The end time of the throttling window. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23:59Z</p>
         */
        public Builder allowThrottleEndTime(String allowThrottleEndTime) {
            this.putQueryParameter("AllowThrottleEndTime", allowThrottleEndTime);
            this.allowThrottleEndTime = allowThrottleEndTime;
            return this;
        }

        /**
         * <p>The start time of the throttling window. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00Z</p>
         */
        public Builder allowThrottleStartTime(String allowThrottleStartTime) {
            this.putQueryParameter("AllowThrottleStartTime", allowThrottleStartTime);
            this.allowThrottleStartTime = allowThrottleStartTime;
            return this;
        }

        /**
         * <p>Specifies whether to terminate abnormal SQL statements in execution at the same time. Valid values:</p>
         * <blockquote>
         * <p> Abnormal SQL statements use the same template as the SQL statements to be throttled.</p>
         * </blockquote>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoKillSession(Boolean autoKillSession) {
            this.putQueryParameter("AutoKillSession", autoKillSession);
            this.autoKillSession = autoKillSession;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * <p>The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:</p>
         * <ul>
         * <li><strong>AND</strong></li>
         * <li><strong>OR</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        public Builder cpuSessionRelation(String cpuSessionRelation) {
            this.putQueryParameter("CpuSessionRelation", cpuSessionRelation);
            this.cpuSessionRelation = cpuSessionRelation;
            return this;
        }

        /**
         * <p>The threshold for CPU utilization. Valid values: 70% to 100%.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder cpuUsage(Double cpuUsage) {
            this.putQueryParameter("CpuUsage", cpuUsage);
            this.cpuUsage = cpuUsage;
            return this;
        }

        /**
         * <p>The database instance IDs.</p>
         * <blockquote>
         * <p> Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: <code>[\&quot;Instance ID1\&quot;, \&quot;Instance ID2\&quot;]</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;rm-2ze8g2am97624****&quot;,&quot;rm-2ze9xrhze0709****&quot;]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The maximum throttling duration. Set this parameter to a positive integer. Unit: minutes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxThrottleTime(Double maxThrottleTime) {
            this.putQueryParameter("MaxThrottleTime", maxThrottleTime);
            this.maxThrottleTime = maxThrottleTime;
            return this;
        }

        /**
         * <p>The ID of the asynchronous request.</p>
         * <blockquote>
         * <p> You can leave this parameter empty when you call the operation to initiate the request for the first time, and use the value of this parameter contained in the response to the first request for subsequent requests.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>async__507044db6c4eadfa2dab9b084e80****</p>
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
