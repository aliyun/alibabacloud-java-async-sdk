// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerCondition} extends {@link TeaModel}
 *
 * <p>TriggerCondition</p>
 */
public class TriggerCondition extends TeaModel {
    @NameInMap("ComparisonOperator")
    @Validation(required = true)
    private String comparisonOperator;

    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @NameInMap("Statistics")
    @Validation(required = true)
    private String statistics;

    @NameInMap("Tags")
    private java.util.List < Tag > tags;

    @NameInMap("Threshold")
    @Validation(required = true)
    private Double threshold;

    private TriggerCondition(Builder builder) {
        this.comparisonOperator = builder.comparisonOperator;
        this.metricName = builder.metricName;
        this.statistics = builder.statistics;
        this.tags = builder.tags;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerCondition create() {
        return builder().build();
    }

    /**
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return statistics
     */
    public String getStatistics() {
        return this.statistics;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private String comparisonOperator; 
        private String metricName; 
        private String statistics; 
        private java.util.List < Tag > tags; 
        private Double threshold; 

        /**
         * 比较符。取值范围：
         * <p>
         * - EQ:等于。
         * - NE:不等于。
         * - GT:大于。
         * - LT:小于。
         * - GE:大于等于。
         * - LE:小于等于。
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * 指标名称。指标名称需要在 ListAutoScalingMetrics 接口返回的指标名称列表中。
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * 统计量名称。取值范围：
         * <p>
         * - MAX：最大值。
         * - MIN：最小值。
         * - AVG：平均值。
         */
        public Builder statistics(String statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * 指标Tag。
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * 阈值。
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public TriggerCondition build() {
            return new TriggerCondition(this);
        } 

    } 

}
