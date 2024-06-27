// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSupportMaxPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSupportMaxPerformanceResponseBody</p>
 */
public class DescribeDBInstanceSupportMaxPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Performances")
    private Performances performances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceSupportMaxPerformanceResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.performances = builder.performances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSupportMaxPerformanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return performances
     */
    public Performances getPerformances() {
        return this.performances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private Performances performances; 
        private String requestId; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Performances.
         */
        public Builder performances(Performances performances) {
            this.performances = performances;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceSupportMaxPerformanceResponseBody build() {
            return new DescribeDBInstanceSupportMaxPerformanceResponseBody(this);
        } 

    } 

    public static class Performance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottleneck")
        private String bottleneck;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Performance(Builder builder) {
            this.bottleneck = builder.bottleneck;
            this.key = builder.key;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performance create() {
            return builder().build();
        }

        /**
         * @return bottleneck
         */
        public String getBottleneck() {
            return this.bottleneck;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String bottleneck; 
            private String key; 
            private String unit; 
            private String value; 

            /**
             * The performance bottleneck type.
             */
            public Builder bottleneck(String bottleneck) {
                this.bottleneck = bottleneck;
                return this;
            }

            /**
             * The name of the performance metric.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The unit of the performance metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the performance metric.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Performance build() {
                return new Performance(this);
            } 

        } 

    }
    public static class Performances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Performance")
        private java.util.List < Performance> performance;

        private Performances(Builder builder) {
            this.performance = builder.performance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performances create() {
            return builder().build();
        }

        /**
         * @return performance
         */
        public java.util.List < Performance> getPerformance() {
            return this.performance;
        }

        public static final class Builder {
            private java.util.List < Performance> performance; 

            /**
             * Performance.
             */
            public Builder performance(java.util.List < Performance> performance) {
                this.performance = performance;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
