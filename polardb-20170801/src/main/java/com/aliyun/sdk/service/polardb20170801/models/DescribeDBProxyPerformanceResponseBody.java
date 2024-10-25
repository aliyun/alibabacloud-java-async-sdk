// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBProxyPerformanceResponseBody</p>
 */
public class DescribeDBProxyPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDBProxyPerformanceResponseBody(Builder builder) {
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

    public static DescribeDBProxyPerformanceResponseBody create() {
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
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The end time of the query. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T01:01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Details about the performance metrics.</p>
         */
        public Builder performanceKeys(PerformanceKeys performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>35D3E3DA-4650-407A-BFF5-59BFF1******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T01:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBProxyPerformanceResponseBody build() {
            return new DescribeDBProxyPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyPerformanceResponseBody</p>
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

            /**
             * <p>The time when the metric value was collected. This value is a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1600822800000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyPerformanceResponseBody</p>
     */
    public static class Points extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceItemValue")
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
    /**
     * 
     * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyPerformanceResponseBody</p>
     */
    public static class PerformanceItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("Measurement")
        private String measurement;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Points")
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
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-*************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>PolarProxy_CpuUsage</p>
             */
            public Builder measurement(String measurement) {
                this.measurement = measurement;
                return this;
            }

            /**
             * <p>The name of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>service_connections_ps</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The list of the performance metrics.</p>
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
     * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyPerformanceResponseBody</p>
     */
    public static class PerformanceKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceItem")
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
