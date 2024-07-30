// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > weeklyTypes;

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
    public java.util.List < String > getWeeklyTypes() {
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
        private java.util.List < String > weeklyTypes; 

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
         * The duration of each scheduled scaling task. Unit: minutes.
         * <p>
         * 
         * >  The value of this parameter must be greater than or equal to 15.
         */
        public Builder durationMinutes(Integer durationMinutes) {
            this.putQueryParameter("DurationMinutes", durationMinutes);
            this.durationMinutes = durationMinutes;
            return this;
        }

        /**
         * Specifies whether to enable the scheduled scaling rule. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The time when the scheduled scaling task is executed.
         * <p>
         * 
         * If you set ScheduleType to at, make sure that the value of this parameter is at least 30 minutes later than the current point in time.
         * 
         * ><notice>To prevent the broker from repeatedly executing instance upgrade and downgrade tasks, make sure that the interval between two consecutive scheduled scaling tasks is at least 60 minutes.></notice>
         */
        public Builder firstScheduledTime(Long firstScheduledTime) {
            this.putQueryParameter("FirstScheduledTime", firstScheduledTime);
            this.firstScheduledTime = firstScheduledTime;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the region where the instance resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The frequency to execute the scheduled scaling task. This parameter is required only if you set ScheduleType to repeat. Valid values:
         * <p>
         * 
         * *   Daily: The scheduled scaling task is executed every day.
         * 
         * *   Weekly: The scheduled scaling task is executed every week.
         */
        public Builder repeatType(String repeatType) {
            this.putQueryParameter("RepeatType", repeatType);
            this.repeatType = repeatType;
            return this;
        }

        /**
         * The reserved production capacity for scheduled scaling. Unit: MB/s.
         * <p>
         * 
         * >  You must specify a higher value than the instance specification for at least one of ReservedPubFlow and ReservedSubFlow.
         */
        public Builder reservedPubFlow(Integer reservedPubFlow) {
            this.putQueryParameter("ReservedPubFlow", reservedPubFlow);
            this.reservedPubFlow = reservedPubFlow;
            return this;
        }

        /**
         * The reserved consumption capacity for scheduled scaling. Unit: MB/s.
         * <p>
         * 
         * >  You must specify a higher value than the instance specification for at least one of ReservedPubFlow and ReservedSubFlow.
         */
        public Builder reservedSubFlow(Integer reservedSubFlow) {
            this.putQueryParameter("ReservedSubFlow", reservedSubFlow);
            this.reservedSubFlow = reservedSubFlow;
            return this;
        }

        /**
         * The name of the scheduled scaling rule.
         * <p>
         * 
         * >  The name of the scheduled scaling rule cannot be the same as the names of other rules for the instance.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The type of the scheduled scaling task. Valid values:
         * <p>
         * 
         * *   at: The scheduled scaling task is executed only once.
         * *   repeat: The scheduled scaling task is repeatedly executed.
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * The time zone in Coordinated Universal Time (UTC).
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * The day on which the scheduled scaling task is executed every week. You can specify multiple days.
         */
        public Builder weeklyTypes(java.util.List < String > weeklyTypes) {
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
