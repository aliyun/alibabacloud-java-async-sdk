// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceResponseBody</p>
 */
public class DescribePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceResponseBody create() {
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
         * <p>The price information.</p>
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>694EB8FF-446C-5B1E-8146-9629E492551F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Price create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Float discountPrice; 
            private Float originalPrice; 
            private Float tradePrice; 

            /**
             * <p>The type of currency.</p>
             * <ul>
             * <li>USD: US dollar</li>
             * <li>JPY: Japanese Yen</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>16125.00</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The final price.</p>
             * 
             * <strong>example:</strong>
             * <p>126.75</p>
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Price")
        private Price price;

        private PriceInfo(Builder builder) {
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public Price getPrice() {
            return this.price;
        }

        public static final class Builder {
            private Price price; 

            /**
             * <p>The price.</p>
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
