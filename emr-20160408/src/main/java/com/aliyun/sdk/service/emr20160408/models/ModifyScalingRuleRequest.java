// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingRuleRequest</p>
 */
public class ModifyScalingRuleRequest extends Request {
    @Query
    @NameInMap("AdjustmentType")
    private String adjustmentType;

    @Query
    @NameInMap("AdjustmentValue")
    private Integer adjustmentValue;

    @Query
    @NameInMap("CloudWatchTrigger")
    private java.util.List < CloudWatchTrigger> cloudWatchTrigger;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Cooldown")
    private Integer cooldown;

    @Query
    @NameInMap("HostGroupId")
    @Validation(required = true)
    private String hostGroupId;

    @Query
    @NameInMap("LaunchExpirationTime")
    private Integer launchExpirationTime;

    @Query
    @NameInMap("LaunchTime")
    private String launchTime;

    @Query
    @NameInMap("RecurrenceEndTime")
    private String recurrenceEndTime;

    @Query
    @NameInMap("RecurrenceType")
    private String recurrenceType;

    @Query
    @NameInMap("RecurrenceValue")
    private String recurrenceValue;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("ScalingRuleId")
    @Validation(required = true)
    private String scalingRuleId;

    @Query
    @NameInMap("SchedulerTrigger")
    private java.util.List < SchedulerTrigger> schedulerTrigger;

    @Query
    @NameInMap("TimeoutWithGrace")
    private Long timeoutWithGrace;

    @Query
    @NameInMap("WithGrace")
    private Boolean withGrace;

    private ModifyScalingRuleRequest(Builder builder) {
        super(builder);
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.cloudWatchTrigger = builder.cloudWatchTrigger;
        this.clusterId = builder.clusterId;
        this.cooldown = builder.cooldown;
        this.hostGroupId = builder.hostGroupId;
        this.launchExpirationTime = builder.launchExpirationTime;
        this.launchTime = builder.launchTime;
        this.recurrenceEndTime = builder.recurrenceEndTime;
        this.recurrenceType = builder.recurrenceType;
        this.recurrenceValue = builder.recurrenceValue;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleName = builder.ruleName;
        this.scalingRuleId = builder.scalingRuleId;
        this.schedulerTrigger = builder.schedulerTrigger;
        this.timeoutWithGrace = builder.timeoutWithGrace;
        this.withGrace = builder.withGrace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adjustmentType
     */
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * @return adjustmentValue
     */
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    /**
     * @return cloudWatchTrigger
     */
    public java.util.List < CloudWatchTrigger> getCloudWatchTrigger() {
        return this.cloudWatchTrigger;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cooldown
     */
    public Integer getCooldown() {
        return this.cooldown;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return launchExpirationTime
     */
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    /**
     * @return launchTime
     */
    public String getLaunchTime() {
        return this.launchTime;
    }

    /**
     * @return recurrenceEndTime
     */
    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
    }

    /**
     * @return recurrenceType
     */
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    /**
     * @return recurrenceValue
     */
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return scalingRuleId
     */
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    /**
     * @return schedulerTrigger
     */
    public java.util.List < SchedulerTrigger> getSchedulerTrigger() {
        return this.schedulerTrigger;
    }

    /**
     * @return timeoutWithGrace
     */
    public Long getTimeoutWithGrace() {
        return this.timeoutWithGrace;
    }

    /**
     * @return withGrace
     */
    public Boolean getWithGrace() {
        return this.withGrace;
    }

    public static final class Builder extends Request.Builder<ModifyScalingRuleRequest, Builder> {
        private String adjustmentType; 
        private Integer adjustmentValue; 
        private java.util.List < CloudWatchTrigger> cloudWatchTrigger; 
        private String clusterId; 
        private Integer cooldown; 
        private String hostGroupId; 
        private Integer launchExpirationTime; 
        private String launchTime; 
        private String recurrenceEndTime; 
        private String recurrenceType; 
        private String recurrenceValue; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String ruleName; 
        private String scalingRuleId; 
        private java.util.List < SchedulerTrigger> schedulerTrigger; 
        private Long timeoutWithGrace; 
        private Boolean withGrace; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingRuleRequest response) {
            super(response);
            this.adjustmentType = response.adjustmentType;
            this.adjustmentValue = response.adjustmentValue;
            this.cloudWatchTrigger = response.cloudWatchTrigger;
            this.clusterId = response.clusterId;
            this.cooldown = response.cooldown;
            this.hostGroupId = response.hostGroupId;
            this.launchExpirationTime = response.launchExpirationTime;
            this.launchTime = response.launchTime;
            this.recurrenceEndTime = response.recurrenceEndTime;
            this.recurrenceType = response.recurrenceType;
            this.recurrenceValue = response.recurrenceValue;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ruleName = response.ruleName;
            this.scalingRuleId = response.scalingRuleId;
            this.schedulerTrigger = response.schedulerTrigger;
            this.timeoutWithGrace = response.timeoutWithGrace;
            this.withGrace = response.withGrace;
        } 

        /**
         * AdjustmentType.
         */
        public Builder adjustmentType(String adjustmentType) {
            this.putQueryParameter("AdjustmentType", adjustmentType);
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * AdjustmentValue.
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.putQueryParameter("AdjustmentValue", adjustmentValue);
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * CloudWatchTrigger.
         */
        public Builder cloudWatchTrigger(java.util.List < CloudWatchTrigger> cloudWatchTrigger) {
            this.putQueryParameter("CloudWatchTrigger", cloudWatchTrigger);
            this.cloudWatchTrigger = cloudWatchTrigger;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Cooldown.
         */
        public Builder cooldown(Integer cooldown) {
            this.putQueryParameter("Cooldown", cooldown);
            this.cooldown = cooldown;
            return this;
        }

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * LaunchExpirationTime.
         */
        public Builder launchExpirationTime(Integer launchExpirationTime) {
            this.putQueryParameter("LaunchExpirationTime", launchExpirationTime);
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }

        /**
         * LaunchTime.
         */
        public Builder launchTime(String launchTime) {
            this.putQueryParameter("LaunchTime", launchTime);
            this.launchTime = launchTime;
            return this;
        }

        /**
         * RecurrenceEndTime.
         */
        public Builder recurrenceEndTime(String recurrenceEndTime) {
            this.putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }

        /**
         * RecurrenceType.
         */
        public Builder recurrenceType(String recurrenceType) {
            this.putQueryParameter("RecurrenceType", recurrenceType);
            this.recurrenceType = recurrenceType;
            return this;
        }

        /**
         * RecurrenceValue.
         */
        public Builder recurrenceValue(String recurrenceValue) {
            this.putQueryParameter("RecurrenceValue", recurrenceValue);
            this.recurrenceValue = recurrenceValue;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * ScalingRuleId.
         */
        public Builder scalingRuleId(String scalingRuleId) {
            this.putQueryParameter("ScalingRuleId", scalingRuleId);
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        /**
         * SchedulerTrigger.
         */
        public Builder schedulerTrigger(java.util.List < SchedulerTrigger> schedulerTrigger) {
            this.putQueryParameter("SchedulerTrigger", schedulerTrigger);
            this.schedulerTrigger = schedulerTrigger;
            return this;
        }

        /**
         * TimeoutWithGrace.
         */
        public Builder timeoutWithGrace(Long timeoutWithGrace) {
            this.putQueryParameter("TimeoutWithGrace", timeoutWithGrace);
            this.timeoutWithGrace = timeoutWithGrace;
            return this;
        }

        /**
         * WithGrace.
         */
        public Builder withGrace(Boolean withGrace) {
            this.putQueryParameter("WithGrace", withGrace);
            this.withGrace = withGrace;
            return this;
        }

        @Override
        public ModifyScalingRuleRequest build() {
            return new ModifyScalingRuleRequest(this);
        } 

    } 

    public static class CloudWatchTrigger extends TeaModel {
        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        private String comparisonOperator;

        @NameInMap("EvaluationCount")
        @Validation(required = true)
        private String evaluationCount;

        @NameInMap("MetricName")
        @Validation(required = true)
        private String metricName;

        @NameInMap("Period")
        @Validation(required = true)
        private Integer period;

        @NameInMap("Statistics")
        @Validation(required = true)
        private String statistics;

        @NameInMap("Threshold")
        @Validation(required = true)
        private String threshold;

        private CloudWatchTrigger(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.evaluationCount = builder.evaluationCount;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudWatchTrigger create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return evaluationCount
         */
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String evaluationCount; 
            private String metricName; 
            private Integer period; 
            private String statistics; 
            private String threshold; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * EvaluationCount.
             */
            public Builder evaluationCount(String evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public CloudWatchTrigger build() {
                return new CloudWatchTrigger(this);
            } 

        } 

    }
    public static class SchedulerTrigger extends TeaModel {
        @NameInMap("LaunchExpirationTime")
        private Integer launchExpirationTime;

        @NameInMap("LaunchTime")
        @Validation(required = true)
        private String launchTime;

        @NameInMap("RecurrenceEndTime")
        private String recurrenceEndTime;

        @NameInMap("RecurrenceType")
        private String recurrenceType;

        @NameInMap("RecurrenceValue")
        private String recurrenceValue;

        private SchedulerTrigger(Builder builder) {
            this.launchExpirationTime = builder.launchExpirationTime;
            this.launchTime = builder.launchTime;
            this.recurrenceEndTime = builder.recurrenceEndTime;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValue = builder.recurrenceValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerTrigger create() {
            return builder().build();
        }

        /**
         * @return launchExpirationTime
         */
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        /**
         * @return launchTime
         */
        public String getLaunchTime() {
            return this.launchTime;
        }

        /**
         * @return recurrenceEndTime
         */
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValue
         */
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public static final class Builder {
            private Integer launchExpirationTime; 
            private String launchTime; 
            private String recurrenceEndTime; 
            private String recurrenceType; 
            private String recurrenceValue; 

            /**
             * LaunchExpirationTime.
             */
            public Builder launchExpirationTime(Integer launchExpirationTime) {
                this.launchExpirationTime = launchExpirationTime;
                return this;
            }

            /**
             * LaunchTime.
             */
            public Builder launchTime(String launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * RecurrenceEndTime.
             */
            public Builder recurrenceEndTime(String recurrenceEndTime) {
                this.recurrenceEndTime = recurrenceEndTime;
                return this;
            }

            /**
             * RecurrenceType.
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * RecurrenceValue.
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            public SchedulerTrigger build() {
                return new SchedulerTrigger(this);
            } 

        } 

    }
}
