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
 * {@link DescribeAgenticDBPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBPerformanceResponseBody</p>
 */
public class DescribeAgenticDBPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeAgenticDBPerformanceResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.performanceKeys = builder.performanceKeys;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBPerformanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
        private String endTime; 
        private PerformanceKeys performanceKeys; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeAgenticDBPerformanceResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.endTime = model.endTime;
            this.performanceKeys = model.performanceKeys;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The AgenticDB cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T01:01:00Z</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F029645-FED9-4FE8-A6D3-488954******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T01:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeAgenticDBPerformanceResponseBody build() {
            return new DescribeAgenticDBPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgenticDBPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBPerformanceResponseBody</p>
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

            public Points build() {
                return new Points(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAgenticDBPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBPerformanceResponseBody</p>
     */
    public static class PerformanceKeysPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("points")
        private java.util.List<Points> points;

        private PerformanceKeysPoints(Builder builder) {
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKeysPoints create() {
            return builder().build();
        }

        /**
         * @return points
         */
        public java.util.List<Points> getPoints() {
            return this.points;
        }

        public static final class Builder {
            private java.util.List<Points> points; 

            private Builder() {
            } 

            private Builder(PerformanceKeysPoints model) {
                this.points = model.points;
            } 

            /**
             * points.
             */
            public Builder points(java.util.List<Points> points) {
                this.points = points;
                return this;
            }

            public PerformanceKeysPoints build() {
                return new PerformanceKeysPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAgenticDBPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBPerformanceResponseBody</p>
     */
    public static class PerformanceKeysPerformanceKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchId")
        private String branchId;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("Measurement")
        private String measurement;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Points")
        private PerformanceKeysPoints points;

        private PerformanceKeysPerformanceKeys(Builder builder) {
            this.branchId = builder.branchId;
            this.endpointId = builder.endpointId;
            this.measurement = builder.measurement;
            this.metricName = builder.metricName;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKeysPerformanceKeys create() {
            return builder().build();
        }

        /**
         * @return branchId
         */
        public String getBranchId() {
            return this.branchId;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
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
        public PerformanceKeysPoints getPoints() {
            return this.points;
        }

        public static final class Builder {
            private String branchId; 
            private String endpointId; 
            private String measurement; 
            private String metricName; 
            private PerformanceKeysPoints points; 

            private Builder() {
            } 

            private Builder(PerformanceKeysPerformanceKeys model) {
                this.branchId = model.branchId;
                this.endpointId = model.endpointId;
                this.measurement = model.measurement;
                this.metricName = model.metricName;
                this.points = model.points;
            } 

            /**
             * BranchId.
             */
            public Builder branchId(String branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
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
            public Builder points(PerformanceKeysPoints points) {
                this.points = points;
                return this;
            }

            public PerformanceKeysPerformanceKeys build() {
                return new PerformanceKeysPerformanceKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAgenticDBPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBPerformanceResponseBody</p>
     */
    public static class PerformanceKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("performanceKeys")
        private java.util.List<PerformanceKeysPerformanceKeys> performanceKeys;

        private PerformanceKeys(Builder builder) {
            this.performanceKeys = builder.performanceKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKeys create() {
            return builder().build();
        }

        /**
         * @return performanceKeys
         */
        public java.util.List<PerformanceKeysPerformanceKeys> getPerformanceKeys() {
            return this.performanceKeys;
        }

        public static final class Builder {
            private java.util.List<PerformanceKeysPerformanceKeys> performanceKeys; 

            private Builder() {
            } 

            private Builder(PerformanceKeys model) {
                this.performanceKeys = model.performanceKeys;
            } 

            /**
             * performanceKeys.
             */
            public Builder performanceKeys(java.util.List<PerformanceKeysPerformanceKeys> performanceKeys) {
                this.performanceKeys = performanceKeys;
                return this;
            }

            public PerformanceKeys build() {
                return new PerformanceKeys(this);
            } 

        } 

    }
}
