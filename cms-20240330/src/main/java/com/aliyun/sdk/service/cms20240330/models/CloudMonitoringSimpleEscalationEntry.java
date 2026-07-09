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
    @com.aliyun.core.annotation.NameInMap("comparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.NameInMap("preCondition")
    private String preCondition;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("statistics")
    private String statistics;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private String threshold;

    @com.aliyun.core.annotation.NameInMap("times")
    private Integer times;

    private CloudMonitoringSimpleEscalationEntry(Builder builder) {
        this.comparisonOperator = builder.comparisonOperator;
        this.preCondition = builder.preCondition;
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
        private String comparisonOperator; 
        private String preCondition; 
        private String severity; 
        private String statistics; 
        private String threshold; 
        private Integer times; 

        private Builder() {
        } 

        private Builder(CloudMonitoringSimpleEscalationEntry model) {
            this.comparisonOperator = model.comparisonOperator;
            this.preCondition = model.preCondition;
            this.severity = model.severity;
            this.statistics = model.statistics;
            this.threshold = model.threshold;
            this.times = model.times;
        } 

        /**
         * comparisonOperator.
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
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
         * severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
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

        /**
         * times.
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
