// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ByLoadScalingRuleSpec} extends {@link TeaModel}
 *
 * <p>ByLoadScalingRuleSpec</p>
 */
public class ByLoadScalingRuleSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comparisonOperator;

    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer evaluationCount;

    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("Statistics")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statistics;

    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double threshold;

    @com.aliyun.core.annotation.NameInMap("TimeWindow")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>比较符。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LT</p>
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * <p>统计次数。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * <p>指标名称。指标名称需要在 ListAutoScalingMetrics 接口返回的指标名称列表中。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yarn_resourcemanager_root_availablememoryusage</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>统计量名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        public Builder statistics(String statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * <p>阈值。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12.5</p>
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>统计窗口。单位为秒。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
