// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("PerformanceKeys")
    private java.util.List < PerformanceKeys> performanceKeys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDBClusterPerformanceResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return performanceKeys
     */
    public java.util.List < PerformanceKeys> getPerformanceKeys() {
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
        private java.util.List < PerformanceKeys> performanceKeys; 
        private String requestId; 
        private String startTime; 

        /**
         * The instance ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The end time of the query. The time follows the ISO 8601 standard in the `YYYY-MM-DDTHH:mmZ` format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The name of the performance metric. For more information, see [Performance parameters](~~86943~~).
         */
        public Builder performanceKeys(java.util.List < PerformanceKeys> performanceKeys) {
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
         * The start time of the query. The time follows the ISO 8601 standard in the `YYYY-MM-DDTHH:mmZ` format. The time is displayed in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBClusterPerformanceResponseBody build() {
            return new DescribeDBClusterPerformanceResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @NameInMap("Point")
        private java.util.List < String > point;

        private Values(Builder builder) {
            this.point = builder.point;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return point
         */
        public java.util.List < String > getPoint() {
            return this.point;
        }

        public static final class Builder {
            private java.util.List < String > point; 

            /**
             * The value of the performance metric and the time when the metric value was collected.
             */
            public Builder point(java.util.List < String > point) {
                this.point = point;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class Series extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Role")
        private String role;

        @NameInMap("Values")
        private java.util.List < Values> values;

        private Series(Builder builder) {
            this.name = builder.name;
            this.role = builder.role;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return values
         */
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String role; 
            private java.util.List < Values> values; 

            /**
             * The name of the compute node or compute group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The role of the node. Valid values:
             * <p>
             * 
             * *   **master**: primary coordinator node
             * *   **standby**: standby coordinator node
             * *   **segment**: compute node
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The value of the performance metric collected at a point in time.
             */
            public Builder values(java.util.List < Values> values) {
                this.values = values;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class PerformanceKeys extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Series")
        private java.util.List < Series> series;

        @NameInMap("Unit")
        private String unit;

        private PerformanceKeys(Builder builder) {
            this.name = builder.name;
            this.series = builder.series;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKeys create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return series
         */
        public java.util.List < Series> getSeries() {
            return this.series;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < Series> series; 
            private String unit; 

            /**
             * The name of the performance metric. For more information, see [Performance parameters](~~86943~~).
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Details of the performance metric of a node.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * The unit of the performance metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public PerformanceKeys build() {
                return new PerformanceKeys(this);
            } 

        } 

    }
}
