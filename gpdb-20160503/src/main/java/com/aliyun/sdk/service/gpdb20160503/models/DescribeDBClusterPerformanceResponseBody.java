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
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
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
         * PerformanceKeys.
         */
        public Builder performanceKeys(java.util.List < PerformanceKeys> performanceKeys) {
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
             * Point.
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Values.
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * Unit.
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
