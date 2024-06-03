// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AutoScalingConstraints} extends {@link TeaModel}
 *
 * <p>AutoScalingConstraints</p>
 */
public class AutoScalingConstraints extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoScalingMetricUnits")
    private java.util.List < MetricUnitValue > autoScalingMetricUnits;

    @com.aliyun.core.annotation.NameInMap("DefaultMetricTriggeredRules")
    private java.util.List < ScalingRule > defaultMetricTriggeredRules;

    @com.aliyun.core.annotation.NameInMap("MaxAdjustmentValue")
    private Integer maxAdjustmentValue;

    @com.aliyun.core.annotation.NameInMap("MaxByLoadRuleCount")
    private Integer maxByLoadRuleCount;

    @com.aliyun.core.annotation.NameInMap("MaxByTimeRuleCount")
    private Integer maxByTimeRuleCount;

    @com.aliyun.core.annotation.NameInMap("SupportMetricTags")
    private java.util.List < SupportMetricTags> supportMetricTags;

    @com.aliyun.core.annotation.NameInMap("SupportMetrics")
    private java.util.List < String > supportMetrics;

    @com.aliyun.core.annotation.NameInMap("SupportRuleTypes")
    private java.util.List < String > supportRuleTypes;

    private AutoScalingConstraints(Builder builder) {
        this.autoScalingMetricUnits = builder.autoScalingMetricUnits;
        this.defaultMetricTriggeredRules = builder.defaultMetricTriggeredRules;
        this.maxAdjustmentValue = builder.maxAdjustmentValue;
        this.maxByLoadRuleCount = builder.maxByLoadRuleCount;
        this.maxByTimeRuleCount = builder.maxByTimeRuleCount;
        this.supportMetricTags = builder.supportMetricTags;
        this.supportMetrics = builder.supportMetrics;
        this.supportRuleTypes = builder.supportRuleTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoScalingConstraints create() {
        return builder().build();
    }

    /**
     * @return autoScalingMetricUnits
     */
    public java.util.List < MetricUnitValue > getAutoScalingMetricUnits() {
        return this.autoScalingMetricUnits;
    }

    /**
     * @return defaultMetricTriggeredRules
     */
    public java.util.List < ScalingRule > getDefaultMetricTriggeredRules() {
        return this.defaultMetricTriggeredRules;
    }

    /**
     * @return maxAdjustmentValue
     */
    public Integer getMaxAdjustmentValue() {
        return this.maxAdjustmentValue;
    }

    /**
     * @return maxByLoadRuleCount
     */
    public Integer getMaxByLoadRuleCount() {
        return this.maxByLoadRuleCount;
    }

    /**
     * @return maxByTimeRuleCount
     */
    public Integer getMaxByTimeRuleCount() {
        return this.maxByTimeRuleCount;
    }

    /**
     * @return supportMetricTags
     */
    public java.util.List < SupportMetricTags> getSupportMetricTags() {
        return this.supportMetricTags;
    }

    /**
     * @return supportMetrics
     */
    public java.util.List < String > getSupportMetrics() {
        return this.supportMetrics;
    }

    /**
     * @return supportRuleTypes
     */
    public java.util.List < String > getSupportRuleTypes() {
        return this.supportRuleTypes;
    }

    public static final class Builder {
        private java.util.List < MetricUnitValue > autoScalingMetricUnits; 
        private java.util.List < ScalingRule > defaultMetricTriggeredRules; 
        private Integer maxAdjustmentValue; 
        private Integer maxByLoadRuleCount; 
        private Integer maxByTimeRuleCount; 
        private java.util.List < SupportMetricTags> supportMetricTags; 
        private java.util.List < String > supportMetrics; 
        private java.util.List < String > supportRuleTypes; 

        /**
         * 按负载伸缩指标单位描述。
         */
        public Builder autoScalingMetricUnits(java.util.List < MetricUnitValue > autoScalingMetricUnits) {
            this.autoScalingMetricUnits = autoScalingMetricUnits;
            return this;
        }

        /**
         * 默认按负载弹性伸缩规则列表
         */
        public Builder defaultMetricTriggeredRules(java.util.List < ScalingRule > defaultMetricTriggeredRules) {
            this.defaultMetricTriggeredRules = defaultMetricTriggeredRules;
            return this;
        }

        /**
         * 单次伸缩活动最大扩缩容节点数量。
         */
        public Builder maxAdjustmentValue(Integer maxAdjustmentValue) {
            this.maxAdjustmentValue = maxAdjustmentValue;
            return this;
        }

        /**
         * 按负载规则数量最大值。
         */
        public Builder maxByLoadRuleCount(Integer maxByLoadRuleCount) {
            this.maxByLoadRuleCount = maxByLoadRuleCount;
            return this;
        }

        /**
         * 按时间规则数量最大值。
         */
        public Builder maxByTimeRuleCount(Integer maxByTimeRuleCount) {
            this.maxByTimeRuleCount = maxByTimeRuleCount;
            return this;
        }

        /**
         * 支持的按负载弹性伸缩指标Tag列表。
         */
        public Builder supportMetricTags(java.util.List < SupportMetricTags> supportMetricTags) {
            this.supportMetricTags = supportMetricTags;
            return this;
        }

        /**
         * 支持的按负载弹性伸缩指标列表。
         */
        public Builder supportMetrics(java.util.List < String > supportMetrics) {
            this.supportMetrics = supportMetrics;
            return this;
        }

        /**
         * 支持的弹性伸缩规则类型。
         */
        public Builder supportRuleTypes(java.util.List < String > supportRuleTypes) {
            this.supportRuleTypes = supportRuleTypes;
            return this;
        }

        public AutoScalingConstraints build() {
            return new AutoScalingConstraints(this);
        } 

    } 

    public static class SupportMetricTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tag > tags;

        private SupportMetricTags(Builder builder) {
            this.metricName = builder.metricName;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportMetricTags create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return tags
         */
        public java.util.List < Tag > getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String metricName; 
            private java.util.List < Tag > tags; 

            /**
             * 指标名称。
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * 指标Tag。
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            public SupportMetricTags build() {
                return new SupportMetricTags(this);
            } 

        } 

    }
}
