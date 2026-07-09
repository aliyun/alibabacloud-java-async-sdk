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
    @com.aliyun.core.annotation.NameInMap("comparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.NameInMap("metricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("period")
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("preCondition")
    private String preCondition;

    @com.aliyun.core.annotation.NameInMap("statistics")
    private String statistics;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private String threshold;

    private CloudMonitoringCompositeEscalationEntry(Builder builder) {
        this.comparisonOperator = builder.comparisonOperator;
        this.metricName = builder.metricName;
        this.period = builder.period;
        this.preCondition = builder.preCondition;
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
        private String metricName; 
        private Integer period; 
        private String preCondition; 
        private String statistics; 
        private String threshold; 

        private Builder() {
        } 

        private Builder(CloudMonitoringCompositeEscalationEntry model) {
            this.comparisonOperator = model.comparisonOperator;
            this.metricName = model.metricName;
            this.period = model.period;
            this.preCondition = model.preCondition;
            this.statistics = model.statistics;
            this.threshold = model.threshold;
        } 

        /**
         * comparisonOperator.
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * metricName.
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * period.
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * preCondition.
         */
        public Builder preCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }

        /**
         * statistics.
         */
        public Builder statistics(String statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * threshold.
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
