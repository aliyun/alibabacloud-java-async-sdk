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
 * {@link Queries} extends {@link TeaModel}
 *
 * <p>Queries</p>
 */
public class Queries extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("end")
    private Long end;

    @com.aliyun.core.annotation.NameInMap("expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("labelFilters")
    private java.util.List<LabelFilters> labelFilters;

    @com.aliyun.core.annotation.NameInMap("metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("metricSet")
    private String metricSet;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("start")
    private Long start;

    @com.aliyun.core.annotation.NameInMap("timeUnit")
    private String timeUnit;

    @com.aliyun.core.annotation.NameInMap("window")
    private Long window;

    private Queries(Builder builder) {
        this.end = builder.end;
        this.expr = builder.expr;
        this.labelFilters = builder.labelFilters;
        this.metric = builder.metric;
        this.metricSet = builder.metricSet;
        this.name = builder.name;
        this.start = builder.start;
        this.timeUnit = builder.timeUnit;
        this.window = builder.window;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Queries create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return labelFilters
     */
    public java.util.List<LabelFilters> getLabelFilters() {
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

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * @return window
     */
    public Long getWindow() {
        return this.window;
    }

    public static final class Builder {
        private Long end; 
        private String expr; 
        private java.util.List<LabelFilters> labelFilters; 
        private String metric; 
        private String metricSet; 
        private String name; 
        private Long start; 
        private String timeUnit; 
        private Long window; 

        private Builder() {
        } 

        private Builder(Queries model) {
            this.end = model.end;
            this.expr = model.expr;
            this.labelFilters = model.labelFilters;
            this.metric = model.metric;
            this.metricSet = model.metricSet;
            this.name = model.name;
            this.start = model.start;
            this.timeUnit = model.timeUnit;
            this.window = model.window;
        } 

        /**
         * <p>The end offset of the time range for SLS_MULTI_QUERY. This parameter is mutually exclusive with window.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder end(Long end) {
            this.end = end;
            return this;
        }

        /**
         * <p>The query expression. For PROMETHEUS_MULTI_QUERY, this is a PromQL expression. For SLS_MULTI_QUERY, this is an SPL expression.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleValue</p>
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * <p>The label filter conditions for UMODEL_METRICSET_MULTI_QUERY. This parameter is optional and independent for each query.</p>
         */
        public Builder labelFilters(java.util.List<LabelFilters> labelFilters) {
            this.labelFilters = labelFilters;
            return this;
        }

        /**
         * <p>The metric name for UMODEL_METRICSET_MULTI_QUERY.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName</p>
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * <p>The metric set name for UMODEL_METRICSET_MULTI_QUERY.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName</p>
         */
        public Builder metricSet(String metricSet) {
            this.metricSet = metricSet;
            return this;
        }

        /**
         * <p>The query name used by PROMETHEUS_MULTI_QUERY and UMODEL_METRICSET_MULTI_QUERY, such as $A or $B, which can be referenced by condition triggers.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The start offset of the time range for SLS_MULTI_QUERY. This parameter is mutually exclusive with window.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder start(Long start) {
            this.start = start;
            return this;
        }

        /**
         * <p>The time unit for SLS_MULTI_QUERY. Valid values: day, hour, minute, and second.</p>
         * 
         * <strong>example:</strong>
         * <p>second</p>
         */
        public Builder timeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * <p>The snap window size for SLS_MULTI_QUERY. This parameter is mutually exclusive with start and end.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder window(Long window) {
            this.window = window;
            return this;
        }

        public Queries build() {
            return new Queries(this);
        } 

    } 

}
