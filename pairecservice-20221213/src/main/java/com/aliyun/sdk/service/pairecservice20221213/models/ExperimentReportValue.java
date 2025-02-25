// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExperimentReportValue} extends {@link TeaModel}
 *
 * <p>ExperimentReportValue</p>
 */
public class ExperimentReportValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Baseline")
    private Boolean baseline;

    @com.aliyun.core.annotation.NameInMap("MetricResults")
    private java.util.Map < String, java.util.Map<String, ?>> metricResults;

    private ExperimentReportValue(Builder builder) {
        this.baseline = builder.baseline;
        this.metricResults = builder.metricResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExperimentReportValue create() {
        return builder().build();
    }

    /**
     * @return baseline
     */
    public Boolean getBaseline() {
        return this.baseline;
    }

    /**
     * @return metricResults
     */
    public java.util.Map < String, java.util.Map<String, ?>> getMetricResults() {
        return this.metricResults;
    }

    public static final class Builder {
        private Boolean baseline; 
        private java.util.Map < String, java.util.Map<String, ?>> metricResults; 

        /**
         * Baseline.
         */
        public Builder baseline(Boolean baseline) {
            this.baseline = baseline;
            return this;
        }

        /**
         * MetricResults.
         */
        public Builder metricResults(java.util.Map < String, java.util.Map<String, ?>> metricResults) {
            this.metricResults = metricResults;
            return this;
        }

        public ExperimentReportValue build() {
            return new ExperimentReportValue(this);
        } 

    } 

}
