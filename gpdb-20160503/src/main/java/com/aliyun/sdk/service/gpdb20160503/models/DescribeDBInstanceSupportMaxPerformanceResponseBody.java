// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceSupportMaxPerformanceResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.performances = model.performances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The queried performance metric.</p>
         */
        public Builder performances(Performances performances) {
            this.performances = performances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceSupportMaxPerformanceResponseBody build() {
            return new DescribeDBInstanceSupportMaxPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceSupportMaxPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceSupportMaxPerformanceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Performance model) {
                this.bottleneck = model.bottleneck;
                this.key = model.key;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The performance bottleneck type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs or disk</p>
             */
            public Builder bottleneck(String bottleneck) {
                this.bottleneck = bottleneck;
                return this;
            }

            /**
             * <p>The name of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpg_status,adbpg_disk_status,adbpg_connection_status,adbgp_segment_disk_usage_percent_max,adbpg_master_disk_usage_percent_max,adbpg_disk_usage_percent</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The unit of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
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
    /**
     * 
     * {@link DescribeDBInstanceSupportMaxPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceSupportMaxPerformanceResponseBody</p>
     */
    public static class Performances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Performance")
        private java.util.List<Performance> performance;

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
        public java.util.List<Performance> getPerformance() {
            return this.performance;
        }

        public static final class Builder {
            private java.util.List<Performance> performance; 

            private Builder() {
            } 

            private Builder(Performances model) {
                this.performance = model.performance;
            } 

            /**
             * Performance.
             */
            public Builder performance(java.util.List<Performance> performance) {
                this.performance = performance;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
