// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CloudMonitoringCompositeEscalationEntry} extends {@link TeaModel}
 *
 * <p>CloudMonitoringCompositeEscalationEntry</p>
 */
public class CloudMonitoringCompositeEscalationEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("absDeviation")
    private Double absDeviation;

    @com.aliyun.core.annotation.NameInMap("baselinePeriod")
    private String baselinePeriod;

    @com.aliyun.core.annotation.NameInMap("comparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.NameInMap("metricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("period")
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("preCondition")
    private String preCondition;

    @com.aliyun.core.annotation.NameInMap("sensitivity")
    private String sensitivity;

    @com.aliyun.core.annotation.NameInMap("statistics")
    private String statistics;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private String threshold;

    private CloudMonitoringCompositeEscalationEntry(Builder builder) {
        this.absDeviation = builder.absDeviation;
        this.baselinePeriod = builder.baselinePeriod;
        this.comparisonOperator = builder.comparisonOperator;
        this.metricName = builder.metricName;
        this.period = builder.period;
        this.preCondition = builder.preCondition;
        this.sensitivity = builder.sensitivity;
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudMonitoringCompositeEscalationEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return absDeviation
     */
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    /**
     * @return baselinePeriod
     */
    public String getBaselinePeriod() {
        return this.baselinePeriod;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return preCondition
     */
    public String getPreCondition() {
        return this.preCondition;
    }

    /**
     * @return sensitivity
     */
    public String getSensitivity() {
        return this.sensitivity;
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
        private Double absDeviation; 
        private String baselinePeriod; 
        private String comparisonOperator; 
        private String metricName; 
        private Integer period; 
        private String preCondition; 
        private String sensitivity; 
        private String statistics; 
        private String threshold; 

        private Builder() {
        } 

        private Builder(CloudMonitoringCompositeEscalationEntry model) {
            this.absDeviation = model.absDeviation;
            this.baselinePeriod = model.baselinePeriod;
            this.comparisonOperator = model.comparisonOperator;
            this.metricName = model.metricName;
            this.period = model.period;
            this.preCondition = model.preCondition;
            this.sensitivity = model.sensitivity;
            this.statistics = model.statistics;
            this.threshold = model.threshold;
        } 

        /**
         * <p>The minimum deviation or absolute deviation dead zone for dynamic baselines. This parameter takes effect only when the comparisonOperator is set to a baseline operator. If the absolute difference between the current value and the boundary is less than the absDeviation value, no alert is triggered. The unit is the same as the metric unit. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder absDeviation(Double absDeviation) {
            this.absDeviation = absDeviation;
            return this;
        }

        /**
         * <p>The baseline period. This parameter takes effect only when the comparisonOperator is set to a baseline operator. Valid values: AUTO for automatic identification, DAILY for daily, WEEKLY for weekly, and NONE for no period. When set to WEEKLY, the backend automatically extends the historical training window to 14 days or more. Automatic identification cannot return the specific identification result.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder baselinePeriod(String baselinePeriod) {
            this.baselinePeriod = baselinePeriod;
            return this;
        }

        /**
         * <p>The comparison operator. Valid values include GreaterThanThreshold and LessThanThreshold for static thresholds, and ABOVE_UPPER, BELOW_LOWER, and OUT_OF_BAND for dynamic baseline spikes, drops, and bidirectional changes. For dynamic baseline operators, you must specify the sensitivity parameter. The threshold parameter is not used for evaluation and can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>cpuUsage</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The collection period in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The precondition.</p>
         * 
         * <strong>example:</strong>
         * <p>连续3次</p>
         */
        public Builder preCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }

        /**
         * <p>The dynamic baseline sensitivity. This parameter takes effect only when the comparisonOperator is set to a baseline operator. Valid values: HIGH for the narrowest and most sensitive band, MEDIUM for a medium band, and LOW for the widest and least sensitive band.</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }

        /**
         * <p>The statistical method.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        public Builder statistics(String statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * <p>The threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder threshold(String threshold) {
            this.threshold = threshold;
            return this;
        }

        public CloudMonitoringCompositeEscalationEntry build() {
            return new CloudMonitoringCompositeEscalationEntry(this);
        } 

    } 

}
