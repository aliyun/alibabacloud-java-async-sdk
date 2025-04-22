// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link QueryOrderPriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderPriceResponseBody</p>
 */
public class QueryOrderPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("discount_price")
    private Double discountPrice;

    @com.aliyun.core.annotation.NameInMap("original_price")
    private Double originalPrice;

    @com.aliyun.core.annotation.NameInMap("trade_price")
    private Double tradePrice;

    private QueryOrderPriceResponseBody(Builder builder) {
        this.discountPrice = builder.discountPrice;
        this.originalPrice = builder.originalPrice;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return discountPrice
     */
    public Double getDiscountPrice() {
        return this.discountPrice;
    }

    /**
     * @return originalPrice
     */
    public Double getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * @return tradePrice
     */
    public Double getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private Double discountPrice; 
        private Double originalPrice; 
        private Double tradePrice; 

        private Builder() {
        } 

        private Builder(QueryOrderPriceResponseBody model) {
            this.discountPrice = model.discountPrice;
            this.originalPrice = model.originalPrice;
            this.tradePrice = model.tradePrice;
        } 

        /**
         * discount_price.
         */
        public Builder discountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }

        /**
         * original_price.
         */
        public Builder originalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * trade_price.
         */
        public Builder tradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public QueryOrderPriceResponseBody build() {
            return new QueryOrderPriceResponseBody(this);
        } 

    } 

}
