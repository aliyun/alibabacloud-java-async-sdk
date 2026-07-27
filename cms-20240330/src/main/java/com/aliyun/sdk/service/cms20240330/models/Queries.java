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
         * end.
         */
        public Builder end(Long end) {
            this.end = end;
            return this;
        }

        /**
         * expr.
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * labelFilters.
         */
        public Builder labelFilters(java.util.List<LabelFilters> labelFilters) {
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

        /**
         * start.
         */
        public Builder start(Long start) {
            this.start = start;
            return this;
        }

        /**
         * timeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * window.
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
