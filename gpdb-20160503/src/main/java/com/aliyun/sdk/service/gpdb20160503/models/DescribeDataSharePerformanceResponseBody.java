// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSharePerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSharePerformanceResponseBody</p>
 */
public class DescribeDataSharePerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PerformanceKeys")
    private java.util.List < PerformanceKeys> performanceKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDataSharePerformanceResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.performanceKeys = builder.performanceKeys;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSharePerformanceResponseBody create() {
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
         * The ID of the instance.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The end time of the query.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Details of data sharing performance metrics.
         */
        public Builder performanceKeys(java.util.List < PerformanceKeys> performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start time of the query.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDataSharePerformanceResponseBody build() {
            return new DescribeDataSharePerformanceResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Point")
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
             * The value of the performance metric at a point in time.
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
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List < Values> values;

        private Series(Builder builder) {
            this.name = builder.name;
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
         * @return values
         */
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < Values> values; 

            /**
             * The name of the performance metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * One or more values of the performance metric.
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
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Series")
        private java.util.List < Series> series;

        @com.aliyun.core.annotation.NameInMap("Unit")
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
             * The name of the performance metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Details of the performance metric.
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
