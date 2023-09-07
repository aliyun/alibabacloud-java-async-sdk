// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterPerformanceResponseBody</p>
 */
public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("DBType")
    private String DBType;

    @NameInMap("DBVersion")
    private String DBVersion;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDBClusterPerformanceResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.endTime = builder.endTime;
        this.performanceKeys = builder.performanceKeys;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterPerformanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
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
        private String DBClusterId; 
        private String DBType; 
        private String DBVersion; 
        private String endTime; 
        private PerformanceKeys performanceKeys; 
        private String requestId; 
        private String startTime; 

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The type of the database engine.
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * The version of the database engine.
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * The end time of the query. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The cluster performance metrics.
         */
        public Builder performanceKeys(PerformanceKeys performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start time of the query. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBClusterPerformanceResponseBody build() {
            return new DescribeDBClusterPerformanceResponseBody(this);
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
             * The timestamp of the metric. This value is a UNIX timestamp. Unit: millisecond.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The value of the metric.
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
        @NameInMap("DBNodeId")
        private String DBNodeId;

        @NameInMap("Measurement")
        private String measurement;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Points")
        private Points points;

        private PerformanceItem(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
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
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
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
            private String DBNodeId; 
            private String measurement; 
            private String metricName; 
            private Points points; 

            /**
             * The ID of the cluster node.
             * <p>
             * 
             * >  The value of this parameter is not returned if the `Key` parameter is set to `PolarDBDiskUsage`.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * The performance metrics that are returned.
             */
            public Builder measurement(String measurement) {
                this.measurement = measurement;
                return this;
            }

            /**
             * The name of the performance metric.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The performance metrics.
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
