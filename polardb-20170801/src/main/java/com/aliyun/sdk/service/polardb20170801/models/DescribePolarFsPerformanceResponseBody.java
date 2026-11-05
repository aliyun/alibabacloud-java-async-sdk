// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarFsPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarFsPerformanceResponseBody</p>
 */
public class DescribePolarFsPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribePolarFsPerformanceResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.performanceKeys = builder.performanceKeys;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsPerformanceResponseBody create() {
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
     * @return performanceKeys
     */
    public PerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private PerformanceKeys performanceKeys; 
        private String polarFsInstanceId; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribePolarFsPerformanceResponseBody model) {
            this.endTime = model.endTime;
            this.performanceKeys = model.performanceKeys;
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The end time of the query. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-07T03:04:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * PerformanceKeys.
         */
        public Builder performanceKeys(PerformanceKeys performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * <p>The PolarFS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-07T02:04:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribePolarFsPerformanceResponseBody build() {
            return new DescribePolarFsPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarFsPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsPerformanceResponseBody</p>
     */
    public static class PerformanceItemValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PerformanceItemValue(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceItemValue create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long timestamp; 
            private String value; 

            private Builder() {
            } 

            private Builder(PerformanceItemValue model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PerformanceItemValue build() {
                return new PerformanceItemValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsPerformanceResponseBody</p>
     */
    public static class Points extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceItemValue")
        private java.util.List<PerformanceItemValue> performanceItemValue;

        private Points(Builder builder) {
            this.performanceItemValue = builder.performanceItemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
            return builder().build();
        }

        /**
         * @return performanceItemValue
         */
        public java.util.List<PerformanceItemValue> getPerformanceItemValue() {
            return this.performanceItemValue;
        }

        public static final class Builder {
            private java.util.List<PerformanceItemValue> performanceItemValue; 

            private Builder() {
            } 

            private Builder(Points model) {
                this.performanceItemValue = model.performanceItemValue;
            } 

            /**
             * PerformanceItemValue.
             */
            public Builder performanceItemValue(java.util.List<PerformanceItemValue> performanceItemValue) {
                this.performanceItemValue = performanceItemValue;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsPerformanceResponseBody</p>
     */
    public static class PerformanceItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Measurement")
        private String measurement;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Points points;

        private PerformanceItem(Builder builder) {
            this.measurement = builder.measurement;
            this.metricName = builder.metricName;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceItem create() {
            return builder().build();
        }

        /**
         * @return measurement
         */
        public String getMeasurement() {
            return this.measurement;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return points
         */
        public Points getPoints() {
            return this.points;
        }

        public static final class Builder {
            private String measurement; 
            private String metricName; 
            private Points points; 

            private Builder() {
            } 

            private Builder(PerformanceItem model) {
                this.measurement = model.measurement;
                this.metricName = model.metricName;
                this.points = model.points;
            } 

            /**
             * Measurement.
             */
            public Builder measurement(String measurement) {
                this.measurement = measurement;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(Points points) {
                this.points = points;
                return this;
            }

            public PerformanceItem build() {
                return new PerformanceItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsPerformanceResponseBody</p>
     */
    public static class PerformanceKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceItem")
        private java.util.List<PerformanceItem> performanceItem;

        private PerformanceKeys(Builder builder) {
            this.performanceItem = builder.performanceItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKeys create() {
            return builder().build();
        }

        /**
         * @return performanceItem
         */
        public java.util.List<PerformanceItem> getPerformanceItem() {
            return this.performanceItem;
        }

        public static final class Builder {
            private java.util.List<PerformanceItem> performanceItem; 

            private Builder() {
            } 

            private Builder(PerformanceKeys model) {
                this.performanceItem = model.performanceItem;
            } 

            /**
             * PerformanceItem.
             */
            public Builder performanceItem(java.util.List<PerformanceItem> performanceItem) {
                this.performanceItem = performanceItem;
                return this;
            }

            public PerformanceKeys build() {
                return new PerformanceKeys(this);
            } 

        } 

    }
}
