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
 * {@link CloudMonitoringSimpleEscalationEntry} extends {@link TeaModel}
 *
 * <p>CloudMonitoringSimpleEscalationEntry</p>
 */
public class CloudMonitoringSimpleEscalationEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("absDeviation")
    private Double absDeviation;

    @com.aliyun.core.annotation.NameInMap("baselinePeriod")
    private String baselinePeriod;

    @com.aliyun.core.annotation.NameInMap("comparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.NameInMap("preCondition")
    private String preCondition;

    @com.aliyun.core.annotation.NameInMap("sensitivity")
    private String sensitivity;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("statistics")
    private String statistics;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private String threshold;

    @com.aliyun.core.annotation.NameInMap("times")
    private Integer times;

    private CloudMonitoringSimpleEscalationEntry(Builder builder) {
        this.absDeviation = builder.absDeviation;
        this.baselinePeriod = builder.baselinePeriod;
        this.comparisonOperator = builder.comparisonOperator;
        this.preCondition = builder.preCondition;
        this.sensitivity = builder.sensitivity;
        this.severity = builder.severity;
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
        this.times = builder.times;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudMonitoringSimpleEscalationEntry create() {
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
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
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
     * @return times
     */
    public Integer getTimes() {
        return this.times;
    }

    public static final class Builder {
        private Double absDeviation; 
        private String baselinePeriod; 
        private String comparisonOperator; 
        private String preCondition; 
        private String sensitivity; 
        private String severity; 
        private String statistics; 
        private String threshold; 
        private Integer times; 

        private Builder() {
        } 

        private Builder(CloudMonitoringSimpleEscalationEntry model) {
            this.absDeviation = model.absDeviation;
            this.baselinePeriod = model.baselinePeriod;
            this.comparisonOperator = model.comparisonOperator;
            this.preCondition = model.preCondition;
            this.sensitivity = model.sensitivity;
            this.severity = model.severity;
            this.statistics = model.statistics;
            this.threshold = model.threshold;
            this.times = model.times;
        } 

        /**
         * <p>The minimum deviation or absolute deviation dead zone for dynamic baselines (effective only for baseline comparison operators). No alert is triggered if |current value - boundary| &lt; absDeviation. The unit is the same as the metric. The value must be greater than or equal to 0. A value of 0 means no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder absDeviation(Double absDeviation) {
            this.absDeviation = absDeviation;
            return this;
        }

        /**
         * <p>The baseline period (effective only for baseline comparison operators). Valid values: AUTO for automatic identification, DAILY for daily, WEEKLY for weekly, and NONE for no period. For weekly periods, the backend automatically expands the historical training window to 14 days or more. Automatic identification cannot return specific identification results.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder baselinePeriod(String baselinePeriod) {
            this.baselinePeriod = baselinePeriod;
            return this;
        }

        /**
         * <p>The comparison operator. GreaterThanThreshold or LessThanThreshold is used for static thresholds. ABOVE_UPPER, BELOW_LOWER, or OUT_OF_BAND is used for dynamic baseline spikes, drops, or bidirectional changes, which requires the sensitivity parameter. The threshold parameter is not used for baselines and can be omitted.</p>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * <p>The precondition.</p>
         * 
         * <strong>example:</strong>
         * <p>3 consecutive times</p>
         */
        public Builder preCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }

        /**
         * <p>The dynamic baseline sensitivity (effective only for baseline comparison operators). Valid values: HIGH for the narrowest and most sensitive band, MEDIUM for medium, and LOW for the widest and least sensitive band.</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }

        /**
         * <p>The severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
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

        /**
         * <p>The number of consecutive triggers.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder times(Integer times) {
            this.times = times;
            return this;
        }

        public CloudMonitoringSimpleEscalationEntry build() {
            return new CloudMonitoringSimpleEscalationEntry(this);
        } 

    } 

}
