// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancePerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancePerformanceResponseBody</p>
 */
public class DescribeDBInstancePerformanceResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDBInstancePerformanceResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.endTime = builder.endTime;
        this.engine = builder.engine;
        this.performanceKeys = builder.performanceKeys;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancePerformanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return performanceKeys
     */
    public PerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
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
        private String DBInstanceId; 
        private String endTime; 
        private String engine; 
        private PerformanceKeys performanceKeys; 
        private String requestId; 
        private String startTime; 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBInstancePerformanceResponseBody build() {
            return new DescribeDBInstancePerformanceResponseBody(this);
        } 

    } 

    public static class PerformanceItemValue extends TeaModel {
        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Value")
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
    public static class Points extends TeaModel {
        @NameInMap("PerformanceItemValue")
        private java.util.List < PerformanceItemValue> performanceItemValue;

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
        public java.util.List < PerformanceItemValue> getPerformanceItemValue() {
            return this.performanceItemValue;
        }

        public static final class Builder {
            private java.util.List < PerformanceItemValue> performanceItemValue; 

            /**
             * PerformanceItemValue.
             */
            public Builder performanceItemValue(java.util.List < PerformanceItemValue> performanceItemValue) {
                this.performanceItemValue = performanceItemValue;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
    public static class PerformanceItem extends TeaModel {
        @NameInMap("Measurement")
        private String measurement;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Points")
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
    public static class PerformanceKeys extends TeaModel {
        @NameInMap("PerformanceItem")
        private java.util.List < PerformanceItem> performanceItem;

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
        public java.util.List < PerformanceItem> getPerformanceItem() {
            return this.performanceItem;
        }

        public static final class Builder {
            private java.util.List < PerformanceItem> performanceItem; 

            /**
             * PerformanceItem.
             */
            public Builder performanceItem(java.util.List < PerformanceItem> performanceItem) {
                this.performanceItem = performanceItem;
                return this;
            }

            public PerformanceKeys build() {
                return new PerformanceKeys(this);
            } 

        } 

    }
}
