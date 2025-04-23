// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link DescribePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceResponseBody</p>
 */
public class DescribePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Prices")
    private Prices prices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalTradePrice")
    private Float totalTradePrice;

    private DescribePriceResponseBody(Builder builder) {
        this.prices = builder.prices;
        this.requestId = builder.requestId;
        this.totalTradePrice = builder.totalTradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prices
     */
    public Prices getPrices() {
        return this.prices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalTradePrice
     */
    public Float getTotalTradePrice() {
        return this.totalTradePrice;
    }

    public static final class Builder {
        private Prices prices; 
        private String requestId; 
        private Float totalTradePrice; 

        private Builder() {
        } 

        private Builder(DescribePriceResponseBody model) {
            this.prices = model.prices;
            this.requestId = model.requestId;
            this.totalTradePrice = model.totalTradePrice;
        } 

        /**
         * <p>The array of cluster prices. If you query the prices of multiple nodes in the cluster, the sequence of the prices in the returned value of PriceInfo is the same as the sequence of the nodes in the request parameters. For example, the first price in the value of PriceInfo is the price of the first node specified in the request parameters.</p>
         */
        public Builder prices(Prices prices) {
            this.prices = prices;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54FF9025-2C2F-42EB-870D-0DF5B0ACF24E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total price.</p>
         * <p>Unit: USD.</p>
         * 
         * <strong>example:</strong>
         * <p>1258</p>
         */
        public Builder totalTradePrice(Float totalTradePrice) {
            this.totalTradePrice = totalTradePrice;
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
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private PriceInfo(Builder builder) {
            this.currency = builder.currency;
            this.nodeType = builder.nodeType;
            this.originalPrice = builder.originalPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
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
            private String nodeType; 
            private Float originalPrice; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.currency = model.currency;
                this.nodeType = model.nodeType;
                this.originalPrice = model.originalPrice;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The currency that is used to measure the price. Valid values:</p>
             * <p>USD</p>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li>Manager: management node</li>
             * <li>Login: logon node</li>
             * <li>Compute: compute node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Compute</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The original price.</p>
             * <p>Unit: USD.</p>
             * 
             * <strong>example:</strong>
             * <p>1258</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The final price.</p>
             * <p>Unit: USD.</p>
             * 
             * <strong>example:</strong>
             * <p>1258</p>
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class Prices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PriceInfo")
        private java.util.List<PriceInfo> priceInfo;

        private Prices(Builder builder) {
            this.priceInfo = builder.priceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prices create() {
            return builder().build();
        }

        /**
         * @return priceInfo
         */
        public java.util.List<PriceInfo> getPriceInfo() {
            return this.priceInfo;
        }

        public static final class Builder {
            private java.util.List<PriceInfo> priceInfo; 

            private Builder() {
            } 

            private Builder(Prices model) {
                this.priceInfo = model.priceInfo;
            } 

            /**
             * PriceInfo.
             */
            public Builder priceInfo(java.util.List<PriceInfo> priceInfo) {
                this.priceInfo = priceInfo;
                return this;
            }

            public Prices build() {
                return new Prices(this);
            } 

        } 

    }
}
