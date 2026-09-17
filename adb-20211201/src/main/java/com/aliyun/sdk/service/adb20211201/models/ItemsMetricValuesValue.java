// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ItemsMetricValuesValue} extends {@link TeaModel}
 *
 * <p>ItemsMetricValuesValue</p>
 */
public class ItemsMetricValuesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricCode")
    private String metricCode;

    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("Primary")
    private Boolean primary;

    @com.aliyun.core.annotation.NameInMap("Time2")
    private Time2 time2;

    @com.aliyun.core.annotation.NameInMap("Avg")
    private Avg avg;

    @com.aliyun.core.annotation.NameInMap("Sum")
    private Sum sum;

    @com.aliyun.core.annotation.NameInMap("Max")
    private Max max;

    private ItemsMetricValuesValue(Builder builder) {
        this.metricCode = builder.metricCode;
        this.metricName = builder.metricName;
        this.primary = builder.primary;
        this.time2 = builder.time2;
        this.avg = builder.avg;
        this.sum = builder.sum;
        this.max = builder.max;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ItemsMetricValuesValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricCode
     */
    public String getMetricCode() {
        return this.metricCode;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return primary
     */
    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * @return time2
     */
    public Time2 getTime2() {
        return this.time2;
    }

    /**
     * @return avg
     */
    public Avg getAvg() {
        return this.avg;
    }

    /**
     * @return sum
     */
    public Sum getSum() {
        return this.sum;
    }

    /**
     * @return max
     */
    public Max getMax() {
        return this.max;
    }

    public static final class Builder {
        private String metricCode; 
        private String metricName; 
        private Boolean primary; 
        private Time2 time2; 
        private Avg avg; 
        private Sum sum; 
        private Max max; 

        private Builder() {
        } 

        private Builder(ItemsMetricValuesValue model) {
            this.metricCode = model.metricCode;
            this.metricName = model.metricName;
            this.primary = model.primary;
            this.time2 = model.time2;
            this.avg = model.avg;
            this.sum = model.sum;
            this.max = model.max;
        } 

        /**
         * <p>The primary metric code, which matches the key in <code>MetricValues</code> and the <code>MetricType</code> request parameter. Valid values:</p>
         * <ul>
         * <li><code>QUERY_COUNT</code>: the number of query executions.</li>
         * <li><code>CPU_COST</code>: the CPU consumption.</li>
         * <li><code>SHUFFLE_SIZE</code>: the shuffle data volume.</li>
         * <li><code>PEAK_MEMORY</code>: the peak memory consumption.</li>
         * <li><code>SCAN_SIZE</code>: the scan data volume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU_COST</p>
         */
        public Builder metricCode(String metricCode) {
            this.metricCode = metricCode;
            return this;
        }

        /**
         * <p>The primary metric name. The mapping is as follows:</p>
         * <ul>
         * <li><code>QUERY_COUNT</code>: <code>QueryCount</code>.</li>
         * <li><code>CPU_COST</code>: <code>OperatorCost</code>.</li>
         * <li><code>SHUFFLE_SIZE</code>: <code>ShuffleSize</code>.</li>
         * <li><code>PEAK_MEMORY</code>: <code>PeakMemory</code>.</li>
         * <li><code>SCAN_SIZE</code>: <code>ScanSize</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OperatorCost</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>Indicates whether this is the primary metric for the current analysis dimension. The current value is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder primary(Boolean primary) {
            this.primary = primary;
            return this;
        }

        /**
         * <p>The aggregated result for Time 2 in the NEW report. This field is returned only for NEW reports.</p>
         */
        public Builder time2(Time2 time2) {
            this.time2 = time2;
            return this;
        }

        /**
         * <p>The dual-window comparison of the average value across active query minute buckets for the CHANGED report. This field is returned only for CHANGED reports.</p>
         */
        public Builder avg(Avg avg) {
            this.avg = avg;
            return this;
        }

        /**
         * <p>The dual-window comparison of the sum of metric values across active query minute buckets for the CHANGED report. This field is returned only for CHANGED reports.</p>
         */
        public Builder sum(Sum sum) {
            this.sum = sum;
            return this;
        }

        /**
         * <p>The dual-window comparison of the peak value in a single minute bucket for the CHANGED report. This field is returned only for CHANGED reports.</p>
         */
        public Builder max(Max max) {
            this.max = max;
            return this;
        }

        public ItemsMetricValuesValue build() {
            return new ItemsMetricValuesValue(this);
        } 

    } 

    /**
     * 
     * {@link ItemsMetricValuesValue} extends {@link TeaModel}
     *
     * <p>ItemsMetricValuesValue</p>
     */
    public static class Time2 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SumValue")
        private Double sumValue;

        @com.aliyun.core.annotation.NameInMap("SumDisplayValue")
        private String sumDisplayValue;

        @com.aliyun.core.annotation.NameInMap("AvgValue")
        private Double avgValue;

        @com.aliyun.core.annotation.NameInMap("AvgDisplayValue")
        private String avgDisplayValue;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("MaxDisplayValue")
        private String maxDisplayValue;

        @com.aliyun.core.annotation.NameInMap("SumRatioPercent")
        private Double sumRatioPercent;

        @com.aliyun.core.annotation.NameInMap("AvgRatioPercent")
        private Double avgRatioPercent;

        private Time2(Builder builder) {
            this.sumValue = builder.sumValue;
            this.sumDisplayValue = builder.sumDisplayValue;
            this.avgValue = builder.avgValue;
            this.avgDisplayValue = builder.avgDisplayValue;
            this.maxValue = builder.maxValue;
            this.maxDisplayValue = builder.maxDisplayValue;
            this.sumRatioPercent = builder.sumRatioPercent;
            this.avgRatioPercent = builder.avgRatioPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Time2 create() {
            return builder().build();
        }

        /**
         * @return sumValue
         */
        public Double getSumValue() {
            return this.sumValue;
        }

        /**
         * @return sumDisplayValue
         */
        public String getSumDisplayValue() {
            return this.sumDisplayValue;
        }

        /**
         * @return avgValue
         */
        public Double getAvgValue() {
            return this.avgValue;
        }

        /**
         * @return avgDisplayValue
         */
        public String getAvgDisplayValue() {
            return this.avgDisplayValue;
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return maxDisplayValue
         */
        public String getMaxDisplayValue() {
            return this.maxDisplayValue;
        }

        /**
         * @return sumRatioPercent
         */
        public Double getSumRatioPercent() {
            return this.sumRatioPercent;
        }

        /**
         * @return avgRatioPercent
         */
        public Double getAvgRatioPercent() {
            return this.avgRatioPercent;
        }

        public static final class Builder {
            private Double sumValue; 
            private String sumDisplayValue; 
            private Double avgValue; 
            private String avgDisplayValue; 
            private Double maxValue; 
            private String maxDisplayValue; 
            private Double sumRatioPercent; 
            private Double avgRatioPercent; 

            private Builder() {
            } 

            private Builder(Time2 model) {
                this.sumValue = model.sumValue;
                this.sumDisplayValue = model.sumDisplayValue;
                this.avgValue = model.avgValue;
                this.avgDisplayValue = model.avgDisplayValue;
                this.maxValue = model.maxValue;
                this.maxDisplayValue = model.maxDisplayValue;
                this.sumRatioPercent = model.sumRatioPercent;
                this.avgRatioPercent = model.avgRatioPercent;
            } 

            /**
             * <p>The sum of metric values across active query minute buckets for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder sumValue(Double sumValue) {
                this.sumValue = sumValue;
                return this;
            }

            /**
             * <p>The display string of the total sum for Time 2, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>180s</p>
             */
            public Builder sumDisplayValue(String sumDisplayValue) {
                this.sumDisplayValue = sumDisplayValue;
                return this;
            }

            /**
             * <p>The average value across active query minute buckets for Time 2, calculated as the total sum divided by the number of minute buckets that contain queries for this Pattern. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder avgValue(Double avgValue) {
                this.avgValue = avgValue;
                return this;
            }

            /**
             * <p>The display string of the average value across active query minute buckets for Time 2, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>3s</p>
             */
            public Builder avgDisplayValue(String avgDisplayValue) {
                this.avgDisplayValue = avgDisplayValue;
                return this;
            }

            /**
             * <p>The maximum metric value in a single minute bucket for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The display string of the peak value in a single minute bucket for Time 2, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>9s</p>
             */
            public Builder maxDisplayValue(String maxDisplayValue) {
                this.maxDisplayValue = maxDisplayValue;
                return this;
            }

            /**
             * <p>The percentage of this Pattern\&quot;s Time 2 total sum relative to the total sum of all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sumRatioPercent(Double sumRatioPercent) {
                this.sumRatioPercent = sumRatioPercent;
                return this;
            }

            /**
             * <p>The percentage of this Pattern\&quot;s Time 2 average value relative to the sum of average values across all Patterns before dimension filtering in the current report. A value of 10 indicates 10%.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder avgRatioPercent(Double avgRatioPercent) {
                this.avgRatioPercent = avgRatioPercent;
                return this;
            }

            public Time2 build() {
                return new Time2(this);
            } 

        } 

    }
    /**
     * 
     * {@link ItemsMetricValuesValue} extends {@link TeaModel}
     *
     * <p>ItemsMetricValuesValue</p>
     */
    public static class Avg extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeRatePercent")
        private Double changeRatePercent;

        @com.aliyun.core.annotation.NameInMap("Time1Value")
        private Double time1Value;

        @com.aliyun.core.annotation.NameInMap("Time1DisplayValue")
        private String time1DisplayValue;

        @com.aliyun.core.annotation.NameInMap("Time1RatioPercent")
        private Double time1RatioPercent;

        @com.aliyun.core.annotation.NameInMap("Time2Value")
        private Double time2Value;

        @com.aliyun.core.annotation.NameInMap("Time2DisplayValue")
        private String time2DisplayValue;

        @com.aliyun.core.annotation.NameInMap("Time2RatioPercent")
        private Double time2RatioPercent;

        private Avg(Builder builder) {
            this.changeRatePercent = builder.changeRatePercent;
            this.time1Value = builder.time1Value;
            this.time1DisplayValue = builder.time1DisplayValue;
            this.time1RatioPercent = builder.time1RatioPercent;
            this.time2Value = builder.time2Value;
            this.time2DisplayValue = builder.time2DisplayValue;
            this.time2RatioPercent = builder.time2RatioPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Avg create() {
            return builder().build();
        }

        /**
         * @return changeRatePercent
         */
        public Double getChangeRatePercent() {
            return this.changeRatePercent;
        }

        /**
         * @return time1Value
         */
        public Double getTime1Value() {
            return this.time1Value;
        }

        /**
         * @return time1DisplayValue
         */
        public String getTime1DisplayValue() {
            return this.time1DisplayValue;
        }

        /**
         * @return time1RatioPercent
         */
        public Double getTime1RatioPercent() {
            return this.time1RatioPercent;
        }

        /**
         * @return time2Value
         */
        public Double getTime2Value() {
            return this.time2Value;
        }

        /**
         * @return time2DisplayValue
         */
        public String getTime2DisplayValue() {
            return this.time2DisplayValue;
        }

        /**
         * @return time2RatioPercent
         */
        public Double getTime2RatioPercent() {
            return this.time2RatioPercent;
        }

        public static final class Builder {
            private Double changeRatePercent; 
            private Double time1Value; 
            private String time1DisplayValue; 
            private Double time1RatioPercent; 
            private Double time2Value; 
            private String time2DisplayValue; 
            private Double time2RatioPercent; 

            private Builder() {
            } 

            private Builder(Avg model) {
                this.changeRatePercent = model.changeRatePercent;
                this.time1Value = model.time1Value;
                this.time1DisplayValue = model.time1DisplayValue;
                this.time1RatioPercent = model.time1RatioPercent;
                this.time2Value = model.time2Value;
                this.time2DisplayValue = model.time2DisplayValue;
                this.time2RatioPercent = model.time2RatioPercent;
            } 

            /**
             * <p>The change rate of the average value across active query minute buckets, calculated as (Time 2 value − Time 1 value) / Time 1 value × 100. A value of 200 indicates a 200% increase. When the Time 1 value is 0, a finite change rate cannot be calculated. This field may not be returned and must not be treated as 0%.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder changeRatePercent(Double changeRatePercent) {
                this.changeRatePercent = changeRatePercent;
                return this;
            }

            /**
             * <p>The average value across active query minute buckets for Time 1. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder time1Value(Double time1Value) {
                this.time1Value = time1Value;
                return this;
            }

            /**
             * <p>The display string of the average value across active query minute buckets for Time 1, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>1s</p>
             */
            public Builder time1DisplayValue(String time1DisplayValue) {
                this.time1DisplayValue = time1DisplayValue;
                return this;
            }

            /**
             * <p>The percentage of this Pattern\&quot;s Time 1 average value across active query minute buckets relative to the sum of the corresponding statistics for all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder time1RatioPercent(Double time1RatioPercent) {
                this.time1RatioPercent = time1RatioPercent;
                return this;
            }

            /**
             * <p>The average value across active query minute buckets for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder time2Value(Double time2Value) {
                this.time2Value = time2Value;
                return this;
            }

            /**
             * <p>The display string of the average value across active query minute buckets for Time 2, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>3s</p>
             */
            public Builder time2DisplayValue(String time2DisplayValue) {
                this.time2DisplayValue = time2DisplayValue;
                return this;
            }

            /**
             * <p>The percentage of this Pattern\&quot;s Time 2 average value across active query minute buckets relative to the sum of the corresponding statistics for all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder time2RatioPercent(Double time2RatioPercent) {
                this.time2RatioPercent = time2RatioPercent;
                return this;
            }

            public Avg build() {
                return new Avg(this);
            } 

        } 

    }
    /**
     * 
     * {@link ItemsMetricValuesValue} extends {@link TeaModel}
     *
     * <p>ItemsMetricValuesValue</p>
     */
    public static class Sum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeRatePercent")
        private Double changeRatePercent;

        @com.aliyun.core.annotation.NameInMap("Time1Value")
        private Double time1Value;

        @com.aliyun.core.annotation.NameInMap("Time1DisplayValue")
        private String time1DisplayValue;

        @com.aliyun.core.annotation.NameInMap("Time1RatioPercent")
        private Double time1RatioPercent;

        @com.aliyun.core.annotation.NameInMap("Time2Value")
        private Double time2Value;

        @com.aliyun.core.annotation.NameInMap("Time2DisplayValue")
        private String time2DisplayValue;

        @com.aliyun.core.annotation.NameInMap("Time2RatioPercent")
        private Double time2RatioPercent;

        private Sum(Builder builder) {
            this.changeRatePercent = builder.changeRatePercent;
            this.time1Value = builder.time1Value;
            this.time1DisplayValue = builder.time1DisplayValue;
            this.time1RatioPercent = builder.time1RatioPercent;
            this.time2Value = builder.time2Value;
            this.time2DisplayValue = builder.time2DisplayValue;
            this.time2RatioPercent = builder.time2RatioPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sum create() {
            return builder().build();
        }

        /**
         * @return changeRatePercent
         */
        public Double getChangeRatePercent() {
            return this.changeRatePercent;
        }

        /**
         * @return time1Value
         */
        public Double getTime1Value() {
            return this.time1Value;
        }

        /**
         * @return time1DisplayValue
         */
        public String getTime1DisplayValue() {
            return this.time1DisplayValue;
        }

        /**
         * @return time1RatioPercent
         */
        public Double getTime1RatioPercent() {
            return this.time1RatioPercent;
        }

        /**
         * @return time2Value
         */
        public Double getTime2Value() {
            return this.time2Value;
        }

        /**
         * @return time2DisplayValue
         */
        public String getTime2DisplayValue() {
            return this.time2DisplayValue;
        }

        /**
         * @return time2RatioPercent
         */
        public Double getTime2RatioPercent() {
            return this.time2RatioPercent;
        }

        public static final class Builder {
            private Double changeRatePercent; 
            private Double time1Value; 
            private String time1DisplayValue; 
            private Double time1RatioPercent; 
            private Double time2Value; 
            private String time2DisplayValue; 
            private Double time2RatioPercent; 

            private Builder() {
            } 

            private Builder(Sum model) {
                this.changeRatePercent = model.changeRatePercent;
                this.time1Value = model.time1Value;
                this.time1DisplayValue = model.time1DisplayValue;
                this.time1RatioPercent = model.time1RatioPercent;
                this.time2Value = model.time2Value;
                this.time2DisplayValue = model.time2DisplayValue;
                this.time2RatioPercent = model.time2RatioPercent;
            } 

            /**
             * <p>The change rate of the sum of metric values across active query minute buckets, calculated as (Time 2 value − Time 1 value) / Time 1 value × 100. A value of 200 indicates a 200% increase. When the Time 1 value is 0, a finite change rate cannot be calculated. This field may not be returned and must not be treated as 0%.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder changeRatePercent(Double changeRatePercent) {
                this.changeRatePercent = changeRatePercent;
                return this;
            }

            /**
             * <p>The sum of metric values across active query minute buckets for Time 1. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder time1Value(Double time1Value) {
                this.time1Value = time1Value;
                return this;
            }

            /**
             * <p>The display string of the sum of metric values across active query minute buckets for Time 1, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>60s</p>
             */
            public Builder time1DisplayValue(String time1DisplayValue) {
                this.time1DisplayValue = time1DisplayValue;
                return this;
            }

            /**
             * <p>The percentage of this Pattern\&quot;s Time 1 sum of metric values across active query minute buckets relative to the sum of the corresponding statistics for all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder time1RatioPercent(Double time1RatioPercent) {
                this.time1RatioPercent = time1RatioPercent;
                return this;
            }

            /**
             * <p>The sum of metric values across active query minute buckets for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder time2Value(Double time2Value) {
                this.time2Value = time2Value;
                return this;
            }

            /**
             * <p>The display string of the sum of metric values across active query minute buckets for Time 2, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>180s</p>
             */
            public Builder time2DisplayValue(String time2DisplayValue) {
                this.time2DisplayValue = time2DisplayValue;
                return this;
            }

            /**
             * <p>The percentage of this Pattern\&quot;s Time 2 sum of metric values across active query minute buckets relative to the sum of the corresponding statistics for all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder time2RatioPercent(Double time2RatioPercent) {
                this.time2RatioPercent = time2RatioPercent;
                return this;
            }

            public Sum build() {
                return new Sum(this);
            } 

        } 

    }
    /**
     * 
     * {@link ItemsMetricValuesValue} extends {@link TeaModel}
     *
     * <p>ItemsMetricValuesValue</p>
     */
    public static class Max extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeRatePercent")
        private Double changeRatePercent;

        @com.aliyun.core.annotation.NameInMap("Time1Value")
        private Double time1Value;

        @com.aliyun.core.annotation.NameInMap("Time1DisplayValue")
        private String time1DisplayValue;

        @com.aliyun.core.annotation.NameInMap("Time2Value")
        private Double time2Value;

        @com.aliyun.core.annotation.NameInMap("Time2DisplayValue")
        private String time2DisplayValue;

        private Max(Builder builder) {
            this.changeRatePercent = builder.changeRatePercent;
            this.time1Value = builder.time1Value;
            this.time1DisplayValue = builder.time1DisplayValue;
            this.time2Value = builder.time2Value;
            this.time2DisplayValue = builder.time2DisplayValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Max create() {
            return builder().build();
        }

        /**
         * @return changeRatePercent
         */
        public Double getChangeRatePercent() {
            return this.changeRatePercent;
        }

        /**
         * @return time1Value
         */
        public Double getTime1Value() {
            return this.time1Value;
        }

        /**
         * @return time1DisplayValue
         */
        public String getTime1DisplayValue() {
            return this.time1DisplayValue;
        }

        /**
         * @return time2Value
         */
        public Double getTime2Value() {
            return this.time2Value;
        }

        /**
         * @return time2DisplayValue
         */
        public String getTime2DisplayValue() {
            return this.time2DisplayValue;
        }

        public static final class Builder {
            private Double changeRatePercent; 
            private Double time1Value; 
            private String time1DisplayValue; 
            private Double time2Value; 
            private String time2DisplayValue; 

            private Builder() {
            } 

            private Builder(Max model) {
                this.changeRatePercent = model.changeRatePercent;
                this.time1Value = model.time1Value;
                this.time1DisplayValue = model.time1DisplayValue;
                this.time2Value = model.time2Value;
                this.time2DisplayValue = model.time2DisplayValue;
            } 

            /**
             * <p>The change rate of the peak value in a single minute bucket, calculated as (Time 2 value − Time 1 value) / Time 1 value × 100. A value of 200 indicates a 200% increase. When the Time 1 value is 0, a finite change rate cannot be calculated. This field may not be returned and must not be treated as 0%.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder changeRatePercent(Double changeRatePercent) {
                this.changeRatePercent = changeRatePercent;
                return this;
            }

            /**
             * <p>The peak value in a single minute bucket for Time 1. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder time1Value(Double time1Value) {
                this.time1Value = time1Value;
                return this;
            }

            /**
             * <p>The display string of the peak value in a single minute bucket for Time 1, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>3s</p>
             */
            public Builder time1DisplayValue(String time1DisplayValue) {
                this.time1DisplayValue = time1DisplayValue;
                return this;
            }

            /**
             * <p>The peak value in a single minute bucket for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder time2Value(Double time2Value) {
                this.time2Value = time2Value;
                return this;
            }

            /**
             * <p>The display string of the peak value in a single minute bucket for Time 2, with the unit included.</p>
             * 
             * <strong>example:</strong>
             * <p>9s</p>
             */
            public Builder time2DisplayValue(String time2DisplayValue) {
                this.time2DisplayValue = time2DisplayValue;
                return this;
            }

            public Max build() {
                return new Max(this);
            } 

        } 

    }
}
