// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingGroupInstanceV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupInstanceV2ResponseBody</p>
 */
public class DescribeScalingGroupInstanceV2ResponseBody extends TeaModel {
    @NameInMap("ActiveRuleCategory")
    private String activeRuleCategory;

    @NameInMap("DefaultCooldown")
    private Integer defaultCooldown;

    @NameInMap("HostGroupId")
    private String hostGroupId;

    @NameInMap("MaxSize")
    private Integer maxSize;

    @NameInMap("MinSize")
    private Integer minSize;

    @NameInMap("MultiAvailablePolicy")
    private String multiAvailablePolicy;

    @NameInMap("MultiAvailablePolicyParam")
    private String multiAvailablePolicyParam;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingConfig")
    private ScalingConfig scalingConfig;

    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @NameInMap("ScalingRuleList")
    private ScalingRuleList scalingRuleList;

    @NameInMap("TimeoutWithGrace")
    private Long timeoutWithGrace;

    @NameInMap("WithGrace")
    private Boolean withGrace;

    private DescribeScalingGroupInstanceV2ResponseBody(Builder builder) {
        this.activeRuleCategory = builder.activeRuleCategory;
        this.defaultCooldown = builder.defaultCooldown;
        this.hostGroupId = builder.hostGroupId;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.multiAvailablePolicy = builder.multiAvailablePolicy;
        this.multiAvailablePolicyParam = builder.multiAvailablePolicyParam;
        this.requestId = builder.requestId;
        this.scalingConfig = builder.scalingConfig;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingRuleList = builder.scalingRuleList;
        this.timeoutWithGrace = builder.timeoutWithGrace;
        this.withGrace = builder.withGrace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupInstanceV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return activeRuleCategory
     */
    public String getActiveRuleCategory() {
        return this.activeRuleCategory;
    }

    /**
     * @return defaultCooldown
     */
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return maxSize
     */
    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return minSize
     */
    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * @return multiAvailablePolicy
     */
    public String getMultiAvailablePolicy() {
        return this.multiAvailablePolicy;
    }

    /**
     * @return multiAvailablePolicyParam
     */
    public String getMultiAvailablePolicyParam() {
        return this.multiAvailablePolicyParam;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingConfig
     */
    public ScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return scalingRuleList
     */
    public ScalingRuleList getScalingRuleList() {
        return this.scalingRuleList;
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
        private String activeRuleCategory; 
        private Integer defaultCooldown; 
        private String hostGroupId; 
        private Integer maxSize; 
        private Integer minSize; 
        private String multiAvailablePolicy; 
        private String multiAvailablePolicyParam; 
        private String requestId; 
        private ScalingConfig scalingConfig; 
        private String scalingGroupId; 
        private ScalingRuleList scalingRuleList; 
        private Long timeoutWithGrace; 
        private Boolean withGrace; 

        /**
         * ActiveRuleCategory.
         */
        public Builder activeRuleCategory(String activeRuleCategory) {
            this.activeRuleCategory = activeRuleCategory;
            return this;
        }

        /**
         * DefaultCooldown.
         */
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * MaxSize.
         */
        public Builder maxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * MinSize.
         */
        public Builder minSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }

        /**
         * MultiAvailablePolicy.
         */
        public Builder multiAvailablePolicy(String multiAvailablePolicy) {
            this.multiAvailablePolicy = multiAvailablePolicy;
            return this;
        }

        /**
         * MultiAvailablePolicyParam.
         */
        public Builder multiAvailablePolicyParam(String multiAvailablePolicyParam) {
            this.multiAvailablePolicyParam = multiAvailablePolicyParam;
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
         * ScalingConfig.
         */
        public Builder scalingConfig(ScalingConfig scalingConfig) {
            this.scalingConfig = scalingConfig;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScalingRuleList.
         */
        public Builder scalingRuleList(ScalingRuleList scalingRuleList) {
            this.scalingRuleList = scalingRuleList;
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

        public DescribeScalingGroupInstanceV2ResponseBody build() {
            return new DescribeScalingGroupInstanceV2ResponseBody(this);
        } 

    } 

    public static class InstanceTypeList extends TeaModel {
        @NameInMap("InstanceType")
        private java.util.List < String > instanceType;

        private InstanceTypeList(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeList create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public java.util.List < String > getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List < String > instanceType; 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List < String > instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypeList build() {
                return new InstanceTypeList(this);
            } 

        } 

    }
    public static class SpotPriceLimit extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("PriceLimit")
        private Float priceLimit;

        private SpotPriceLimit(Builder builder) {
            this.instanceType = builder.instanceType;
            this.priceLimit = builder.priceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceLimit create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return priceLimit
         */
        public Float getPriceLimit() {
            return this.priceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private Float priceLimit; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * PriceLimit.
             */
            public Builder priceLimit(Float priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            public SpotPriceLimit build() {
                return new SpotPriceLimit(this);
            } 

        } 

    }
    public static class SpotPriceLimits extends TeaModel {
        @NameInMap("SpotPriceLimit")
        private java.util.List < SpotPriceLimit> spotPriceLimit;

        private SpotPriceLimits(Builder builder) {
            this.spotPriceLimit = builder.spotPriceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceLimits create() {
            return builder().build();
        }

        /**
         * @return spotPriceLimit
         */
        public java.util.List < SpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public static final class Builder {
            private java.util.List < SpotPriceLimit> spotPriceLimit; 

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            public SpotPriceLimits build() {
                return new SpotPriceLimits(this);
            } 

        } 

    }
    public static class ScalingConfig extends TeaModel {
        @NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @NameInMap("DataDiskCount")
        private Integer dataDiskCount;

        @NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @NameInMap("InstanceTypeList")
        private InstanceTypeList instanceTypeList;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("SpotPriceLimits")
        private SpotPriceLimits spotPriceLimits;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("SysDiskCategory")
        private String sysDiskCategory;

        @NameInMap("SysDiskSize")
        private Integer sysDiskSize;

        private ScalingConfig(Builder builder) {
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskCount = builder.dataDiskCount;
            this.dataDiskSize = builder.dataDiskSize;
            this.instanceTypeList = builder.instanceTypeList;
            this.payType = builder.payType;
            this.spotPriceLimits = builder.spotPriceLimits;
            this.spotStrategy = builder.spotStrategy;
            this.sysDiskCategory = builder.sysDiskCategory;
            this.sysDiskSize = builder.sysDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingConfig create() {
            return builder().build();
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskCount
         */
        public Integer getDataDiskCount() {
            return this.dataDiskCount;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return instanceTypeList
         */
        public InstanceTypeList getInstanceTypeList() {
            return this.instanceTypeList;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return spotPriceLimits
         */
        public SpotPriceLimits getSpotPriceLimits() {
            return this.spotPriceLimits;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return sysDiskCategory
         */
        public String getSysDiskCategory() {
            return this.sysDiskCategory;
        }

        /**
         * @return sysDiskSize
         */
        public Integer getSysDiskSize() {
            return this.sysDiskSize;
        }

        public static final class Builder {
            private String dataDiskCategory; 
            private Integer dataDiskCount; 
            private Integer dataDiskSize; 
            private InstanceTypeList instanceTypeList; 
            private String payType; 
            private SpotPriceLimits spotPriceLimits; 
            private String spotStrategy; 
            private String sysDiskCategory; 
            private Integer sysDiskSize; 

            /**
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskCount.
             */
            public Builder dataDiskCount(Integer dataDiskCount) {
                this.dataDiskCount = dataDiskCount;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * InstanceTypeList.
             */
            public Builder instanceTypeList(InstanceTypeList instanceTypeList) {
                this.instanceTypeList = instanceTypeList;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * SpotPriceLimits.
             */
            public Builder spotPriceLimits(SpotPriceLimits spotPriceLimits) {
                this.spotPriceLimits = spotPriceLimits;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * SysDiskCategory.
             */
            public Builder sysDiskCategory(String sysDiskCategory) {
                this.sysDiskCategory = sysDiskCategory;
                return this;
            }

            /**
             * SysDiskSize.
             */
            public Builder sysDiskSize(Integer sysDiskSize) {
                this.sysDiskSize = sysDiskSize;
                return this;
            }

            public ScalingConfig build() {
                return new ScalingConfig(this);
            } 

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
    public static class ScalingRule extends TeaModel {
        @NameInMap("AdjustmentType")
        private String adjustmentType;

        @NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @NameInMap("CloudWatchTrigger")
        private CloudWatchTrigger cloudWatchTrigger;

        @NameInMap("Cooldown")
        private Integer cooldown;

        @NameInMap("EssScalingRuleId")
        private String essScalingRuleId;

        @NameInMap("LaunchExpirationTime")
        private Integer launchExpirationTime;

        @NameInMap("LaunchTime")
        private String launchTime;

        @NameInMap("RecurrenceEndTime")
        private String recurrenceEndTime;

        @NameInMap("RecurrenceType")
        private String recurrenceType;

        @NameInMap("RecurrenceValue")
        private String recurrenceValue;

        @NameInMap("RuleCategory")
        private String ruleCategory;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("ScalingGroupId")
        private Long scalingGroupId;

        @NameInMap("SchedulerTrigger")
        private SchedulerTrigger schedulerTrigger;

        @NameInMap("Status")
        private String status;

        @NameInMap("TimeoutWithGrace")
        private Long timeoutWithGrace;

        @NameInMap("WithGrace")
        private Boolean withGrace;

        private ScalingRule(Builder builder) {
            this.adjustmentType = builder.adjustmentType;
            this.adjustmentValue = builder.adjustmentValue;
            this.cloudWatchTrigger = builder.cloudWatchTrigger;
            this.cooldown = builder.cooldown;
            this.essScalingRuleId = builder.essScalingRuleId;
            this.launchExpirationTime = builder.launchExpirationTime;
            this.launchTime = builder.launchTime;
            this.recurrenceEndTime = builder.recurrenceEndTime;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValue = builder.recurrenceValue;
            this.ruleCategory = builder.ruleCategory;
            this.ruleName = builder.ruleName;
            this.scalingGroupId = builder.scalingGroupId;
            this.schedulerTrigger = builder.schedulerTrigger;
            this.status = builder.status;
            this.timeoutWithGrace = builder.timeoutWithGrace;
            this.withGrace = builder.withGrace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingRule create() {
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
         * @return essScalingRuleId
         */
        public String getEssScalingRuleId() {
            return this.essScalingRuleId;
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
         * @return scalingGroupId
         */
        public Long getScalingGroupId() {
            return this.scalingGroupId;
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
            private String essScalingRuleId; 
            private Integer launchExpirationTime; 
            private String launchTime; 
            private String recurrenceEndTime; 
            private String recurrenceType; 
            private String recurrenceValue; 
            private String ruleCategory; 
            private String ruleName; 
            private Long scalingGroupId; 
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
             * EssScalingRuleId.
             */
            public Builder essScalingRuleId(String essScalingRuleId) {
                this.essScalingRuleId = essScalingRuleId;
                return this;
            }

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
             * ScalingGroupId.
             */
            public Builder scalingGroupId(Long scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
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

            public ScalingRule build() {
                return new ScalingRule(this);
            } 

        } 

    }
    public static class ScalingRuleList extends TeaModel {
        @NameInMap("ScalingRule")
        private java.util.List < ScalingRule> scalingRule;

        private ScalingRuleList(Builder builder) {
            this.scalingRule = builder.scalingRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingRuleList create() {
            return builder().build();
        }

        /**
         * @return scalingRule
         */
        public java.util.List < ScalingRule> getScalingRule() {
            return this.scalingRule;
        }

        public static final class Builder {
            private java.util.List < ScalingRule> scalingRule; 

            /**
             * ScalingRule.
             */
            public Builder scalingRule(java.util.List < ScalingRule> scalingRule) {
                this.scalingRule = scalingRule;
                return this;
            }

            public ScalingRuleList build() {
                return new ScalingRuleList(this);
            } 

        } 

    }
}
