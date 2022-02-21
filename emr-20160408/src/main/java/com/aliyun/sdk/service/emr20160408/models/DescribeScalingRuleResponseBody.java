// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingRuleResponseBody</p>
 */
public class DescribeScalingRuleResponseBody extends TeaModel {
    @NameInMap("AdjustmentType")
    private String adjustmentType;

    @NameInMap("AdjustmentValue")
    private Integer adjustmentValue;

    @NameInMap("CloudWatchTrigger")
    private CloudWatchTrigger cloudWatchTrigger;

    @NameInMap("Cooldown")
    private Integer cooldown;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("Id")
    private String id;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleCategory")
    private String ruleCategory;

    @NameInMap("RuleName")
    private String ruleName;

    @NameInMap("SchedulerTrigger")
    private SchedulerTrigger schedulerTrigger;

    @NameInMap("Status")
    private String status;

    @NameInMap("TimeoutWithGrace")
    private Long timeoutWithGrace;

    @NameInMap("WithGrace")
    private Boolean withGrace;

    private DescribeScalingRuleResponseBody(Builder builder) {
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.cloudWatchTrigger = builder.cloudWatchTrigger;
        this.cooldown = builder.cooldown;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.ruleCategory = builder.ruleCategory;
        this.ruleName = builder.ruleName;
        this.schedulerTrigger = builder.schedulerTrigger;
        this.status = builder.status;
        this.timeoutWithGrace = builder.timeoutWithGrace;
        this.withGrace = builder.withGrace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingRuleResponseBody create() {
        return builder().build();
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
    public CloudWatchTrigger getCloudWatchTrigger() {
        return this.cloudWatchTrigger;
    }

    /**
     * @return cooldown
     */
    public Integer getCooldown() {
        return this.cooldown;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleCategory
     */
    public String getRuleCategory() {
        return this.ruleCategory;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return schedulerTrigger
     */
    public SchedulerTrigger getSchedulerTrigger() {
        return this.schedulerTrigger;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder {
        private String adjustmentType; 
        private Integer adjustmentValue; 
        private CloudWatchTrigger cloudWatchTrigger; 
        private Integer cooldown; 
        private String gmtCreate; 
        private String gmtModified; 
        private String id; 
        private String requestId; 
        private String ruleCategory; 
        private String ruleName; 
        private SchedulerTrigger schedulerTrigger; 
        private String status; 
        private Long timeoutWithGrace; 
        private Boolean withGrace; 

        /**
         * AdjustmentType.
         */
        public Builder adjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * AdjustmentValue.
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * CloudWatchTrigger.
         */
        public Builder cloudWatchTrigger(CloudWatchTrigger cloudWatchTrigger) {
            this.cloudWatchTrigger = cloudWatchTrigger;
            return this;
        }

        /**
         * Cooldown.
         */
        public Builder cooldown(Integer cooldown) {
            this.cooldown = cooldown;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleCategory.
         */
        public Builder ruleCategory(String ruleCategory) {
            this.ruleCategory = ruleCategory;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * SchedulerTrigger.
         */
        public Builder schedulerTrigger(SchedulerTrigger schedulerTrigger) {
            this.schedulerTrigger = schedulerTrigger;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TimeoutWithGrace.
         */
        public Builder timeoutWithGrace(Long timeoutWithGrace) {
            this.timeoutWithGrace = timeoutWithGrace;
            return this;
        }

        /**
         * WithGrace.
         */
        public Builder withGrace(Boolean withGrace) {
            this.withGrace = withGrace;
            return this;
        }

        public DescribeScalingRuleResponseBody build() {
            return new DescribeScalingRuleResponseBody(this);
        } 

    } 

    public static class CloudWatchTrigger extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("EvaluationCount")
        private String evaluationCount;

        @NameInMap("MetricDisplayName")
        private String metricDisplayName;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Unit")
        private String unit;

        private CloudWatchTrigger(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.evaluationCount = builder.evaluationCount;
            this.metricDisplayName = builder.metricDisplayName;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.unit = builder.unit;
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
         * @return metricDisplayName
         */
        public String getMetricDisplayName() {
            return this.metricDisplayName;
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

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String evaluationCount; 
            private String metricDisplayName; 
            private String metricName; 
            private Integer period; 
            private String statistics; 
            private String threshold; 
            private String unit; 

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
             * MetricDisplayName.
             */
            public Builder metricDisplayName(String metricDisplayName) {
                this.metricDisplayName = metricDisplayName;
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

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
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
        private Long launchTime;

        @NameInMap("RecurrenceEndTime")
        private Long recurrenceEndTime;

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
        public Long getLaunchTime() {
            return this.launchTime;
        }

        /**
         * @return recurrenceEndTime
         */
        public Long getRecurrenceEndTime() {
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
            private Long launchTime; 
            private Long recurrenceEndTime; 
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
            public Builder launchTime(Long launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * RecurrenceEndTime.
             */
            public Builder recurrenceEndTime(Long recurrenceEndTime) {
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
