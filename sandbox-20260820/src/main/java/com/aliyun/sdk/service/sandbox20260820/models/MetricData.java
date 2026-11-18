// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link MetricData} extends {@link TeaModel}
 *
 * <p>MetricData</p>
 */
public class MetricData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("groupBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> groupBy;

    @com.aliyun.core.annotation.NameInMap("period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("results")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private MetricData(Builder builder) {
        this.endTime = builder.endTime;
        this.groupBy = builder.groupBy;
        this.period = builder.period;
        this.results = builder.results;
        this.startTime = builder.startTime;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupBy
     */
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private String endTime; 
        private java.util.List<String> groupBy; 
        private Integer period; 
        private java.util.List<Results> results; 
        private String startTime; 
        private String time; 

        private Builder() {
        } 

        private Builder(MetricData model) {
            this.endTime = model.endTime;
            this.groupBy = model.groupBy;
            this.period = model.period;
            this.results = model.results;
            this.startTime = model.startTime;
            this.time = model.time;
        } 

        /**
         * <p>The end time of the time series query, exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:02:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The grouping keys used for this query. An empty array is returned if no grouping is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;teamID&quot;]</p>
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The data point interval used for this query, in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The result for each requested metric.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;metricName&quot;:&quot;cpuUsedCores&quot;,&quot;unit&quot;:&quot;Core&quot;,&quot;series&quot;:[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;points&quot;:[{&quot;timestamp&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;value&quot;:0.25},{&quot;timestamp&quot;:&quot;2026-11-05T00:01:00Z&quot;,&quot;value&quot;:0.5}]}]}]</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The start time of the time series query, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time of the query. Returned only for single-point queries.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:01:00Z</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public MetricData build() {
            return new MetricData(this);
        } 

    } 

    /**
     * 
     * {@link MetricData} extends {@link TeaModel}
     *
     * <p>MetricData</p>
     */
    public static class Points extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("timestamp")
        @com.aliyun.core.annotation.Validation(required = true)
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double value;

        private Points(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timestamp; 
            private Double value; 

            private Builder() {
            } 

            private Builder(Points model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * <p>The time corresponding to the metric value, in UTC seconds.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T00:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The metric value at this time. The unit is specified in unit.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
    /**
     * 
     * {@link MetricData} extends {@link TeaModel}
     *
     * <p>MetricData</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dimensions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map<String, String> dimensions;

        @com.aliyun.core.annotation.NameInMap("points")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Points> points;

        private Series(Builder builder) {
            this.dimensions = builder.dimensions;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public java.util.Map<String, String> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return points
         */
        public java.util.List<Points> getPoints() {
            return this.points;
        }

        public static final class Builder {
            private java.util.Map<String, String> dimensions; 
            private java.util.List<Points> points; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.dimensions = model.dimensions;
                this.points = model.points;
            } 

            /**
             * <p>The team, template, or other grouping values for this series.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;}</p>
             */
            public Builder dimensions(java.util.Map<String, String> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The data points in chronological order. Only times with metric values are listed.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;timestamp&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;value&quot;:0.25},{&quot;timestamp&quot;:&quot;2026-11-05T00:01:00Z&quot;,&quot;value&quot;:0.5}]</p>
             */
            public Builder points(java.util.List<Points> points) {
                this.points = points;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    /**
     * 
     * {@link MetricData} extends {@link TeaModel}
     *
     * <p>MetricData</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metricName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("series")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Series> series;

        @com.aliyun.core.annotation.NameInMap("unit")
        @com.aliyun.core.annotation.Validation(required = true)
        private String unit;

        private Results(Builder builder) {
            this.metricName = builder.metricName;
            this.series = builder.series;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return series
         */
        public java.util.List<Series> getSeries() {
            return this.series;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String metricName; 
            private java.util.List<Series> series; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.metricName = model.metricName;
                this.series = model.series;
                this.unit = model.unit;
            } 

            /**
             * <p>The name of the metric in the request.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cpuUsedCores</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The time series for the metric. An empty array is returned if no data points exist.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;points&quot;:[{&quot;timestamp&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;value&quot;:0.25},{&quot;timestamp&quot;:&quot;2026-11-05T00:01:00Z&quot;,&quot;value&quot;:0.5}]}]</p>
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The unit of the metric value, such as Core for CPU cores.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Core</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
