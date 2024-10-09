// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSpotPriceHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpotPriceHistoryResponseBody</p>
 */
public class DescribeSpotPriceHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("NextOffset")
    private Integer nextOffset;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpotPrices")
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
         * <p>The instance type of the preemptible instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * <p>The network type of the preemptible instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder nextOffset(Integer nextOffset) {
            this.nextOffset = nextOffset;
            return this;
        }

        /**
         * <p>The instance type of the preemptible instance.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The zone ID of the preemptible instance.</p>
         */
        public Builder spotPrices(SpotPrices spotPrices) {
            this.spotPrices = spotPrices;
            return this;
        }

        public DescribeSpotPriceHistoryResponseBody build() {
            return new DescribeSpotPriceHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSpotPriceHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSpotPriceHistoryResponseBody</p>
     */
    public static class SpotPriceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IoOptimized")
        private String ioOptimized;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("OriginPrice")
        private Float originPrice;

        @com.aliyun.core.annotation.NameInMap("SpotPrice")
        private Float spotPrice;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The instance type of the preemptible instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Details about the price history of the preemptible instance.</p>
             * 
             * <strong>example:</strong>
             * <p>optimized</p>
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * <p>Queries the price history of a preemptible instance within the last 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The price for a pay-as-you-go instance that has the same configuration as the specified preemptible instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0.354</p>
             */
            public Builder originPrice(Float originPrice) {
                this.originPrice = originPrice;
                return this;
            }

            /**
             * <p>The price for a pay-as-you-go instance that has the same configurations as the preemptible instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0.036</p>
             */
            public Builder spotPrice(Float spotPrice) {
                this.spotPrice = spotPrice;
                return this;
            }

            /**
             * <p>The currency unit of the price.</p>
             * <p>Alibaba Cloud China site (aliyun.com): CNY.</p>
             * <p>Alibaba Cloud International site (alibabacloud.com): USD.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-19T06:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-c</p>
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
    /**
     * 
     * {@link DescribeSpotPriceHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSpotPriceHistoryResponseBody</p>
     */
    public static class SpotPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpotPriceType")
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
