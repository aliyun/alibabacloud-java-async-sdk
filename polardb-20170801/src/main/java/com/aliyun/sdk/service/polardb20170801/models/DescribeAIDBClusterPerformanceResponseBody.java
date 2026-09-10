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
 * {@link DescribeAIDBClusterPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterPerformanceResponseBody</p>
 */
public class DescribeAIDBClusterPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.NameInMap("PerformanceKeys")
    private java.util.List<PerformanceKeys> performanceKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeAIDBClusterPerformanceResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.DBClusterId = builder.DBClusterId;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.performanceKeys = builder.performanceKeys;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterPerformanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
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
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return performanceKeys
     */
    public java.util.List<PerformanceKeys> getPerformanceKeys() {
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
        private String apiKey; 
        private String DBClusterId; 
        private String DBType; 
        private String DBVersion; 
        private String endTime; 
        private String interval; 
        private java.util.List<PerformanceKeys> performanceKeys; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterPerformanceResponseBody model) {
            this.apiKey = model.apiKey;
            this.DBClusterId = model.DBClusterId;
            this.DBType = model.DBType;
            this.DBVersion = model.DBVersion;
            this.endTime = model.endTime;
            this.interval = model.interval;
            this.performanceKeys = model.performanceKeys;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The API key for the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The ID of the database cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-a************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The type of the database engine. Only <strong>polardb_ai</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_ai</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The version number of the database AI engine.</p>
         * <p>Example: 3.0</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The end of the time range that was queried. The time is in the <code>YYYY-MM-DDThh:mmZ</code> format and is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-16T16:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the performance data. Valid values:</p>
         * <ul>
         * <li>60</li>
         * <li>3600</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The details of the instance performance parameters.</p>
         */
        public Builder performanceKeys(java.util.List<PerformanceKeys> performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range that was queried. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-15T16:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeAIDBClusterPerformanceResponseBody build() {
            return new DescribeAIDBClusterPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterPerformanceResponseBody</p>
     */
    public static class Points extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

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

            private Builder(Points model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * <p>The UNIX timestamp that indicates when the metric was collected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1724206183</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>42.38</p>
             */
            public Builder value(String value) {
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
     * {@link DescribeAIDBClusterPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterPerformanceResponseBody</p>
     */
    public static class PerformanceKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("Measurement")
        private String measurement;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Points")
        private java.util.List<Points> points;

        private PerformanceKeys(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
            this.measurement = builder.measurement;
            this.metricName = builder.metricName;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKeys create() {
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
        public java.util.List<Points> getPoints() {
            return this.points;
        }

        public static final class Builder {
            private String DBNodeId; 
            private String measurement; 
            private String metricName; 
            private java.util.List<Points> points; 

            private Builder() {
            } 

            private Builder(PerformanceKeys model) {
                this.DBNodeId = model.DBNodeId;
                this.measurement = model.measurement;
                this.metricName = model.metricName;
                this.points = model.points;
            } 

            /**
             * <p>The ID of the cluster node.</p>
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
             * <p>PolarDBAIModelCall</p>
             */
            public Builder measurement(String measurement) {
                this.measurement = measurement;
                return this;
            }

            /**
             * <p>The name of the specific performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>model_input_amount</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The array of performance data.</p>
             */
            public Builder points(java.util.List<Points> points) {
                this.points = points;
                return this;
            }

            public PerformanceKeys build() {
                return new PerformanceKeys(this);
            } 

        } 

    }
}
