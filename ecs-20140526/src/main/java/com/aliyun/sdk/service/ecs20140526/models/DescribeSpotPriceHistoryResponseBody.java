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
    @NameInMap("Currency")
    private String currency;

    @NameInMap("NextOffset")
    private Integer nextOffset;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpotPrices")
    private SpotPrices spotPrices;

    private DescribeSpotPriceHistoryResponseBody(Builder builder) {
        this.currency = builder.currency;
        this.nextOffset = builder.nextOffset;
        this.requestId = builder.requestId;
        this.spotPrices = builder.spotPrices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotPriceHistoryResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spotPrices
     */
    public SpotPrices getSpotPrices() {
        return this.spotPrices;
    }

    public static final class Builder {
        private String currency; 
        private Integer nextOffset; 
        private String requestId; 
        private SpotPrices spotPrices; 

        /**
         * The currency unit of the price.
         * <p>
         * 
         * Alibaba Cloud China site (aliyun.com): CNY.
         * 
         * Alibaba Cloud International site (alibabacloud.com): USD.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * The start line of the next page. It is the value of the `Offset` request parameter.
         */
        public Builder nextOffset(Integer nextOffset) {
            this.nextOffset = nextOffset;
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
         * Details about the price history of the preemptible instance.
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
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IoOptimized")
        private String ioOptimized;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("OriginPrice")
        private Float originPrice;

        @NameInMap("SpotPrice")
        private Float spotPrice;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("ZoneId")
        private String zoneId;

        private SpotPriceType(Builder builder) {
            this.instanceType = builder.instanceType;
            this.ioOptimized = builder.ioOptimized;
            this.networkType = builder.networkType;
            this.originPrice = builder.originPrice;
            this.spotPrice = builder.spotPrice;
            this.timestamp = builder.timestamp;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceType create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ioOptimized
         */
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return originPrice
         */
        public Float getOriginPrice() {
            return this.originPrice;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String instanceType; 
            private String ioOptimized; 
            private String networkType; 
            private Float originPrice; 
            private Float spotPrice; 
            private String timestamp; 
            private String zoneId; 

            /**
             * The instance type of the preemptible instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Indicates whether the preemptible instance is I/O optimized.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
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
             * The price for a pay-as-you-go instance that has the same configurations as the preemptible instance.
             */
            public Builder originPrice(Float originPrice) {
                this.originPrice = originPrice;
                return this;
            }

            /**
             * The spot price (market price) of the preemptible instance.
             */
            public Builder spotPrice(Float spotPrice) {
                this.spotPrice = spotPrice;
                return this;
            }

            /**
             * The time that corresponds to the queried spot price. The time is in the `yyyy-MM-ddTHH:mm:ssZ` format.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The zone ID of the preemptible instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
