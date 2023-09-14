// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ByLoadScalingRuleSpec} extends {@link TeaModel}
 *
 * <p>ByLoadScalingRuleSpec</p>
 */
public class ByLoadScalingRuleSpec extends TeaModel {
    @NameInMap("ComparisonOperator")
    @Validation(required = true)
    private String comparisonOperator;

    @NameInMap("EvaluationCount")
    @Validation(required = true)
    private Integer evaluationCount;

    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @NameInMap("Statistics")
    @Validation(required = true)
    private String statistics;

    @NameInMap("Threshold")
    @Validation(required = true)
    private Double threshold;

    @NameInMap("TimeWindow")
    @Validation(required = true)
    private Integer timeWindow;

    private ByLoadScalingRuleSpec(Builder builder) {
        this.comparisonOperator = builder.comparisonOperator;
        this.evaluationCount = builder.evaluationCount;
        this.metricName = builder.metricName;
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
        this.timeWindow = builder.timeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ByLoadScalingRuleSpec create() {
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
    public Integer getEvaluationCount() {
        return this.evaluationCount;
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
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * @return timeWindow
     */
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

    public static final class Builder {
        private String comparisonOperator; 
        private Integer evaluationCount; 
        private String metricName; 
        private String statistics; 
        private Double threshold; 
        private Integer timeWindow; 

        /**
         * 比较符。
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * 统计次数。
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
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
         * 统计量名称。
         */
        public Builder statistics(String statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * 阈值。
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * 统计窗口。单位为秒。
         */
        public Builder timeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }

        public ByLoadScalingRuleSpec build() {
            return new ByLoadScalingRuleSpec(this);
        } 

    } 

}
