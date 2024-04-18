// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpotDiscountHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpotDiscountHistoryResponseBody</p>
 */
public class DescribeSpotDiscountHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpotDiscounts")
    private java.util.List < SpotDiscounts> spotDiscounts;

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
    public java.util.List < SpotDiscounts> getSpotDiscounts() {
        return this.spotDiscounts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SpotDiscounts> spotDiscounts; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpotDiscounts.
         */
        public Builder spotDiscounts(java.util.List < SpotDiscounts> spotDiscounts) {
            this.spotDiscounts = spotDiscounts;
            return this;
        }

        public DescribeSpotDiscountHistoryResponseBody build() {
            return new DescribeSpotDiscountHistoryResponseBody(this);
        } 

    } 

    public static class SpotDiscounts extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("SpotDiscount")
        private String spotDiscount;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("ZoneId")
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * SpotDiscount.
             */
            public Builder spotDiscount(String spotDiscount) {
                this.spotDiscount = spotDiscount;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * ZoneId.
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
