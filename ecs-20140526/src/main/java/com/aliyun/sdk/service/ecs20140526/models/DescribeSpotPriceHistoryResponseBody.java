// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpotPriceHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpotPriceHistoryResponseBody</p>
 */
public class DescribeSpotPriceHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Currency")
    private String currency;

    @NameInMap("NextOffset")
    private Integer nextOffset;

    @NameInMap("SpotPrices")
    private SpotPrices spotPrices;

    private DescribeSpotPriceHistoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.currency = builder.currency;
        this.nextOffset = builder.nextOffset;
        this.spotPrices = builder.spotPrices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotPriceHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return nextOffset
     */
    public Integer getNextOffset() {
        return this.nextOffset;
    }

    /**
     * @return spotPrices
     */
    public SpotPrices getSpotPrices() {
        return this.spotPrices;
    }

    public static final class Builder {
        private String requestId; 
        private String currency; 
        private Integer nextOffset; 
        private SpotPrices spotPrices; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The monetary unit of the price.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * The start line of the next page to query the data on the next page. The value of the "Offset" parameter is specified.
         */
        public Builder nextOffset(Integer nextOffset) {
            this.nextOffset = nextOffset;
            return this;
        }

        /**
         * Preemptible price details.
         */
        public Builder spotPrices(SpotPrices spotPrices) {
            this.spotPrices = spotPrices;
            return this;
        }

        public DescribeSpotPriceHistoryResponseBody build() {
            return new DescribeSpotPriceHistoryResponseBody(this);
        } 

    } 

    public static class SpotPriceType extends TeaModel {
        @NameInMap("IoOptimized")
        private String ioOptimized;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("SpotPrice")
        private Float spotPrice;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OriginPrice")
        private Float originPrice;

        private SpotPriceType(Builder builder) {
            this.ioOptimized = builder.ioOptimized;
            this.zoneId = builder.zoneId;
            this.spotPrice = builder.spotPrice;
            this.timestamp = builder.timestamp;
            this.networkType = builder.networkType;
            this.instanceType = builder.instanceType;
            this.originPrice = builder.originPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceType create() {
            return builder().build();
        }

        /**
         * @return ioOptimized
         */
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return spotPrice
         */
        public Float getSpotPrice() {
            return this.spotPrice;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return originPrice
         */
        public Float getOriginPrice() {
            return this.originPrice;
        }

        public static final class Builder {
            private String ioOptimized; 
            private String zoneId; 
            private Float spotPrice; 
            private String timestamp; 
            private String networkType; 
            private String instanceType; 
            private Float originPrice; 

            /**
             * Indicates whether the preemptible instance is an I/O optimized instance.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * The ID of the zone to which the preemptible instance belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The price of a preemptible instance.
             */
            public Builder spotPrice(Float spotPrice) {
                this.spotPrice = spotPrice;
                return this;
            }

            /**
             * The time format is "yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The network type of the preemptible instance.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The instance type of the preemptible instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The original price of the pay-as-you-go instance.
             */
            public Builder originPrice(Float originPrice) {
                this.originPrice = originPrice;
                return this;
            }

            public SpotPriceType build() {
                return new SpotPriceType(this);
            } 

        } 

    }
    public static class SpotPrices extends TeaModel {
        @NameInMap("SpotPriceType")
        private java.util.List < SpotPriceType> spotPriceType;

        private SpotPrices(Builder builder) {
            this.spotPriceType = builder.spotPriceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPrices create() {
            return builder().build();
        }

        /**
         * @return spotPriceType
         */
        public java.util.List < SpotPriceType> getSpotPriceType() {
            return this.spotPriceType;
        }

        public static final class Builder {
            private java.util.List < SpotPriceType> spotPriceType; 

            /**
             * SpotPriceType.
             */
            public Builder spotPriceType(java.util.List < SpotPriceType> spotPriceType) {
                this.spotPriceType = spotPriceType;
                return this;
            }

            public SpotPrices build() {
                return new SpotPrices(this);
            } 

        } 

    }
}
