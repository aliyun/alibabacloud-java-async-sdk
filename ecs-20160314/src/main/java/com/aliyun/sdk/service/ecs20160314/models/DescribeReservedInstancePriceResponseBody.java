// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstancePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstancePriceResponseBody</p>
 */
public class DescribeReservedInstancePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeReservedInstancePriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedInstancePriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return priceInfo
     */
    public PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PriceInfo priceInfo; 
        private String requestId; 

        /**
         * PriceInfo.
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeReservedInstancePriceResponseBody build() {
            return new DescribeReservedInstancePriceResponseBody(this);
        } 

    } 

    public static class Order extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("ReservedInstanceHourPrice")
        private Float reservedInstanceHourPrice;

        @NameInMap("TradePrice")
        private Float tradePrice;

        private Order(Builder builder) {
            this.currency = builder.currency;
            this.reservedInstanceHourPrice = builder.reservedInstanceHourPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return reservedInstanceHourPrice
         */
        public Float getReservedInstanceHourPrice() {
            return this.reservedInstanceHourPrice;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Float reservedInstanceHourPrice; 
            private Float tradePrice; 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * ReservedInstanceHourPrice.
             */
            public Builder reservedInstanceHourPrice(Float reservedInstanceHourPrice) {
                this.reservedInstanceHourPrice = reservedInstanceHourPrice;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    public static class PriceInfo extends TeaModel {
        @NameInMap("Order")
        private Order order;

        private PriceInfo(Builder builder) {
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public Order getOrder() {
            return this.order;
        }

        public static final class Builder {
            private Order order; 

            /**
             * Order.
             */
            public Builder order(Order order) {
                this.order = order;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
