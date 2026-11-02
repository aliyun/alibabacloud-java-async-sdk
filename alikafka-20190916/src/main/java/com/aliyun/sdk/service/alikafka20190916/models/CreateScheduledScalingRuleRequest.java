// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link CreateScheduledScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledScalingRuleRequest</p>
 */
public class CreateScheduledScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationMinutes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer durationMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstScheduledTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long firstScheduledTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatType")
    private String repeatType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedPubFlow")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer reservedPubFlow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedSubFlow")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer reservedSubFlow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WeeklyTypes")
    private java.util.List<String> weeklyTypes;

    private CreateScheduledScalingRuleRequest(Builder builder) {
        super(builder);
        this.durationMinutes = builder.durationMinutes;
        this.enable = builder.enable;
        this.firstScheduledTime = builder.firstScheduledTime;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repeatType = builder.repeatType;
        this.reservedPubFlow = builder.reservedPubFlow;
        this.reservedSubFlow = builder.reservedSubFlow;
        this.ruleName = builder.ruleName;
        this.scheduleType = builder.scheduleType;
        this.timeZone = builder.timeZone;
        this.weeklyTypes = builder.weeklyTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledScalingRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return durationMinutes
     */
    public Integer getDurationMinutes() {
        return this.durationMinutes;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return firstScheduledTime
     */
    public Long getFirstScheduledTime() {
        return this.firstScheduledTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeatType
     */
    public String getRepeatType() {
        return this.repeatType;
    }

    /**
     * @return reservedPubFlow
     */
    public Integer getReservedPubFlow() {
        return this.reservedPubFlow;
    }

    /**
     * @return reservedSubFlow
     */
    public Integer getReservedSubFlow() {
        return this.reservedSubFlow;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return weeklyTypes
     */
    public java.util.List<String> getWeeklyTypes() {
        return this.weeklyTypes;
    }

    public static final class Builder extends Request.Builder<CreateScheduledScalingRuleRequest, Builder> {
        private Integer durationMinutes; 
        private Boolean enable; 
        private Long firstScheduledTime; 
        private String instanceId; 
        private String regionId; 
        private String repeatType; 
        private Integer reservedPubFlow; 
        private Integer reservedSubFlow; 
        private String ruleName; 
        private String scheduleType; 
        private String timeZone; 
        private java.util.List<String> weeklyTypes; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledScalingRuleRequest request) {
            super(request);
            this.durationMinutes = request.durationMinutes;
            this.enable = request.enable;
            this.firstScheduledTime = request.firstScheduledTime;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.repeatType = request.repeatType;
            this.reservedPubFlow = request.reservedPubFlow;
            this.reservedSubFlow = request.reservedSubFlow;
            this.ruleName = request.ruleName;
            this.scheduleType = request.scheduleType;
            this.timeZone = request.timeZone;
            this.weeklyTypes = request.weeklyTypes;
        } 

        /**
         * <p>The duration of a scheduled elastic scaling task. Unit: minutes.</p>
         * <blockquote>
         * <p>The value must be at least 15.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder durationMinutes(Integer durationMinutes) {
            this.putQueryParameter("DurationMinutes", durationMinutes);
            this.durationMinutes = durationMinutes;
            return this;
        }

        /**
         * <p>Specifies whether to enable or disable the scheduled task policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the policy.</li>
         * <li><strong>false</strong>: disables the policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The start time of the scheduled policy.</p>
         * <p>If the schedule type is set to one-time execution, the start time must be at least 30 minutes later than the current time.</p>
         * <blockquote>
         * <p>Notice: To prevent the server from continuously executing scale-up and scale-down tasks, the interval between different scheduled tasks must be at least 60 minutes.</notice></p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1714467540000</p>
         */
        public Builder firstScheduledTime(Long firstScheduledTime) {
            this.putQueryParameter("FirstScheduledTime", firstScheduledTime);
            this.firstScheduledTime = firstScheduledTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_serverless-cn-vxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
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
         * <p>The repeat type. This parameter is required when ScheduleType is set to repeat. Valid values:
         *       <li> Daily: Daily timed scheduling.
         *       <li> Weekly: Weekly timed scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly</p>
         */
        public Builder repeatType(String repeatType) {
            this.putQueryParameter("RepeatType", repeatType);
            this.repeatType = repeatType;
            return this;
        }

        /**
         * <p>The reserved production specification for scheduled elastic scaling. Unit: MB/s.</p>
         * <blockquote>
         * <p>At least one of the ReservedPubFlow and ReservedSubFlow parameters must be greater than the current specification.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder reservedPubFlow(Integer reservedPubFlow) {
            this.putQueryParameter("ReservedPubFlow", reservedPubFlow);
            this.reservedPubFlow = reservedPubFlow;
            return this;
        }

        /**
         * <p>The reserved consumption specification for scheduled elastic scaling. Unit: MB/s.</p>
         * <blockquote>
         * <p>At least one of the ReservedSubFlow and ReservedPubFlow parameters must be greater than the current specification.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder reservedSubFlow(Integer reservedSubFlow) {
            this.putQueryParameter("ReservedSubFlow", reservedSubFlow);
            this.reservedSubFlow = reservedSubFlow;
            return this;
        }

        /**
         * <p>The name of the scheduled policy rule.</p>
         * <blockquote>
         * <p>The name must be unique among all rules of the same instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The schedule type. Valid values:</p>
         * <ul>
         * <li><p>at: The policy is executed only once.</p>
         * </li>
         * <li><p>repeat: The policy is executed repeatedly.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>at</p>
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * <p>The time zone in Coordinated Universal Time (UTC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GMT+8</p>
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>The days of the week. Multiple days can be selected for repeated execution.</p>
         */
        public Builder weeklyTypes(java.util.List<String> weeklyTypes) {
            String weeklyTypesShrink = shrink(weeklyTypes, "WeeklyTypes", "json");
            this.putQueryParameter("WeeklyTypes", weeklyTypesShrink);
            this.weeklyTypes = weeklyTypes;
            return this;
        }

        @Override
        public CreateScheduledScalingRuleRequest build() {
            return new CreateScheduledScalingRuleRequest(this);
        } 

    } 

}
