// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeCacheReservePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCacheReservePriceResponseBody</p>
 */
public class DescribeCacheReservePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceModel")
    private PriceModel priceModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCacheReservePriceResponseBody(Builder builder) {
        this.priceModel = builder.priceModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCacheReservePriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return priceModel
     */
    public PriceModel getPriceModel() {
        return this.priceModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PriceModel priceModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCacheReservePriceResponseBody model) {
            this.priceModel = model.priceModel;
            this.requestId = model.requestId;
        } 

        /**
         * PriceModel.
         */
        public Builder priceModel(PriceModel priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCacheReservePriceResponseBody build() {
            return new DescribeCacheReservePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCacheReservePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCacheReservePriceResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private Long ruleDescId;

        private RuleList(Builder builder) {
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleDescId
         */
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        public static final class Builder {
            private String name; 
            private Long ruleDescId; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.name = model.name;
                this.ruleDescId = model.ruleDescId;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleDescId.
             */
            public Builder ruleDescId(Long ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCacheReservePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCacheReservePriceResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

        private Rule(Builder builder) {
            this.ruleList = builder.ruleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return ruleList
         */
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private java.util.List<RuleList> ruleList; 

            private Builder() {
            } 

            private Builder(Rule model) {
                this.ruleList = model.ruleList;
            } 

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCacheReservePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCacheReservePriceResponseBody</p>
     */
    public static class PriceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Float price;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private Rule rule;

        @com.aliyun.core.annotation.NameInMap("TotalPrice")
        private Float totalPrice;

        private PriceModel(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.price = builder.price;
            this.rule = builder.rule;
            this.totalPrice = builder.totalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceModel create() {
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
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return rule
         */
        public Rule getRule() {
            return this.rule;
        }

        /**
         * @return totalPrice
         */
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public static final class Builder {
            private String currency; 
            private Float discountPrice; 
            private Float price; 
            private Rule rule; 
            private Float totalPrice; 

            private Builder() {
            } 

            private Builder(PriceModel model) {
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.price = model.price;
                this.rule = model.rule;
                this.totalPrice = model.totalPrice;
            } 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(Rule rule) {
                this.rule = rule;
                return this;
            }

            /**
             * TotalPrice.
             */
            public Builder totalPrice(Float totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            public PriceModel build() {
                return new PriceModel(this);
            } 

        } 

    }
}
