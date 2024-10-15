// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TriggerCondition} extends {@link TeaModel}
 *
 * <p>TriggerCondition</p>
 */
public class TriggerCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comparisonOperator;

    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("Statistics")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statistics;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tag > tags;

    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>比较符。取值范围：</p>
         * <ul>
         * <li>EQ:等于。</li>
         * <li>NE:不等于。</li>
         * <li>GT:大于。</li>
         * <li>LT:小于。</li>
         * <li>GE:大于等于。</li>
         * <li>LE:小于等于。</li>
         * </ul>
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
         * <p>统计量名称。取值范围：</p>
         * <ul>
         * <li>MAX：最大值。</li>
         * <li>MIN：最小值。</li>
         * <li>AVG：平均值。</li>
         * </ul>
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
         * <p>指标Tag。</p>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
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

        public TriggerCondition build() {
            return new TriggerCondition(this);
        } 

    } 

}
