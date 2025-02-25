// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeSpotDiscountHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpotDiscountHistoryResponseBody</p>
 */
public class DescribeSpotDiscountHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpotDiscounts")
    private java.util.List<SpotDiscounts> spotDiscounts;

    private DescribeSpotDiscountHistoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spotDiscounts = builder.spotDiscounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotDiscountHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spotDiscounts
     */
    public java.util.List<SpotDiscounts> getSpotDiscounts() {
        return this.spotDiscounts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SpotDiscounts> spotDiscounts; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The discount for the preemptible instance.</p>
         */
        public Builder spotDiscounts(java.util.List<SpotDiscounts> spotDiscounts) {
            this.spotDiscounts = spotDiscounts;
            return this;
        }

        public DescribeSpotDiscountHistoryResponseBody build() {
            return new DescribeSpotDiscountHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSpotDiscountHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSpotDiscountHistoryResponseBody</p>
     */
    public static class SpotDiscounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SpotDiscount")
        private String spotDiscount;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private SpotDiscounts(Builder builder) {
            this.instanceType = builder.instanceType;
            this.spotDiscount = builder.spotDiscount;
            this.timestamp = builder.timestamp;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotDiscounts create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return spotDiscount
         */
        public String getSpotDiscount() {
            return this.spotDiscount;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String instanceType; 
            private String spotDiscount; 
            private String timestamp; 
            private String zoneId; 

            /**
             * <p>The type of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c7.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The discount for the preemptible instance. For example, 0.1 represents a 90% discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder spotDiscount(String spotDiscount) {
                this.spotDiscount = spotDiscount;
                return this;
            }

            /**
             * <p>The time when the discount is available. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-10T10:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public SpotDiscounts build() {
                return new SpotDiscounts(this);
            } 

        } 

    }
}
