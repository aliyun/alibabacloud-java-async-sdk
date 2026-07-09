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
 * {@link MetricSetNamedQueryEntry} extends {@link TeaModel}
 *
 * <p>MetricSetNamedQueryEntry</p>
 */
public class MetricSetNamedQueryEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("labelFilters")
    private java.util.List<UmodelLabelFilter> labelFilters;

    @com.aliyun.core.annotation.NameInMap("metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("metricSet")
    private String metricSet;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private MetricSetNamedQueryEntry(Builder builder) {
        this.labelFilters = builder.labelFilters;
        this.metric = builder.metric;
        this.metricSet = builder.metricSet;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricSetNamedQueryEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelFilters
     */
    public java.util.List<UmodelLabelFilter> getLabelFilters() {
        return this.labelFilters;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return metricSet
     */
    public String getMetricSet() {
        return this.metricSet;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private java.util.List<UmodelLabelFilter> labelFilters; 
        private String metric; 
        private String metricSet; 
        private String name; 

        private Builder() {
        } 

        private Builder(MetricSetNamedQueryEntry model) {
            this.labelFilters = model.labelFilters;
            this.metric = model.metric;
            this.metricSet = model.metricSet;
            this.name = model.name;
        } 

        /**
         * labelFilters.
         */
        public Builder labelFilters(java.util.List<UmodelLabelFilter> labelFilters) {
            this.labelFilters = labelFilters;
            return this;
        }

        /**
         * metric.
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * metricSet.
         */
        public Builder metricSet(String metricSet) {
            this.metricSet = metricSet;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public MetricSetNamedQueryEntry build() {
            return new MetricSetNamedQueryEntry(this);
        } 

    } 

}
