// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MonitorMetricMeasureData} extends {@link TeaModel}
 *
 * <p>MonitorMetricMeasureData</p>
 */
public class MonitorMetricMeasureData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("measure")
    private String measure;

    @com.aliyun.core.annotation.NameInMap("measurePointData")
    private java.util.List<MonitorMetricMeasurePointData> measurePointData;

    private MonitorMetricMeasureData(Builder builder) {
        this.measure = builder.measure;
        this.measurePointData = builder.measurePointData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorMetricMeasureData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return measure
     */
    public String getMeasure() {
        return this.measure;
    }

    /**
     * @return measurePointData
     */
    public java.util.List<MonitorMetricMeasurePointData> getMeasurePointData() {
        return this.measurePointData;
    }

    public static final class Builder {
        private String measure; 
        private java.util.List<MonitorMetricMeasurePointData> measurePointData; 

        private Builder() {
        } 

        private Builder(MonitorMetricMeasureData model) {
            this.measure = model.measure;
            this.measurePointData = model.measurePointData;
        } 

        /**
         * measure.
         */
        public Builder measure(String measure) {
            this.measure = measure;
            return this;
        }

        /**
         * measurePointData.
         */
        public Builder measurePointData(java.util.List<MonitorMetricMeasurePointData> measurePointData) {
            this.measurePointData = measurePointData;
            return this;
        }

        public MonitorMetricMeasureData build() {
            return new MonitorMetricMeasureData(this);
        } 

    } 

}
