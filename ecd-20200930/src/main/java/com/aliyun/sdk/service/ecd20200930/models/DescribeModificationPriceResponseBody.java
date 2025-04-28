// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeModificationPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModificationPriceResponseBody</p>
 */
public class DescribeModificationPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeModificationPriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModificationPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeModificationPriceResponseBody model) {
            this.priceInfo = model.priceInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The price details.</p>
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48174475-5EB2-5F99-A9E9-6F892D645****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeModificationPriceResponseBody build() {
            return new DescribeModificationPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModificationPriceResponseBody</p>
     */
    public static class Promotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionDesc")
        private String promotionDesc;

        @com.aliyun.core.annotation.NameInMap("PromotionId")
        private String promotionId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private Promotions(Builder builder) {
            this.optionCode = builder.optionCode;
            this.promotionDesc = builder.promotionDesc;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Promotions create() {
            return builder().build();
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        /**
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String optionCode; 
            private String promotionDesc; 
            private String promotionId; 
            private String promotionName; 
            private Boolean selected; 

            private Builder() {
            } 

            private Builder(Promotions model) {
                this.optionCode = model.optionCode;
                this.promotionDesc = model.promotionDesc;
                this.promotionId = model.promotionId;
                this.promotionName = model.promotionName;
                this.selected = model.selected;
            } 

            /**
             * <p>The description of the promotion rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The promotion description.</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The ID of the promotion activity.</p>
             * 
             * <strong>example:</strong>
             * <p>promo_option</p>
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The name of the promotion activity.</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>Indicates whether an item is selected.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public Promotions build() {
                return new Promotions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModificationPriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OrderLines")
        private java.util.Map<String, String> orderLines;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("Promotions")
        private java.util.List<Promotions> promotions;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.orderLines = builder.orderLines;
            this.originalPrice = builder.originalPrice;
            this.promotions = builder.promotions;
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
         * @return orderLines
         */
        public java.util.Map<String, String> getOrderLines() {
            return this.orderLines;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return promotions
         */
        public java.util.List<Promotions> getPromotions() {
            return this.promotions;
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
            private java.util.Map<String, String> orderLines; 
            private Float originalPrice; 
            private java.util.List<Promotions> promotions; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(Price model) {
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.orderLines = model.orderLines;
                this.originalPrice = model.originalPrice;
                this.promotions = model.promotions;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The unit of currency (USD).</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discounted amount.</p>
             * 
             * <strong>example:</strong>
             * <p>15.8</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The orders.</p>
             */
            public Builder orderLines(java.util.Map<String, String> orderLines) {
                this.orderLines = orderLines;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>79.0</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The promotion activities.</p>
             */
            public Builder promotions(java.util.List<Promotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * <p>The actual price. The actual price is the original price minus the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>63.2</p>
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
     * {@link DescribeModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModificationPriceResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private Rules(Builder builder) {
            this.description = builder.description;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String description; 
            private Long ruleId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.description = model.description;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>The rule description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>14806</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModificationPriceResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Price")
        private Price price;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private PriceInfo(Builder builder) {
            this.price = builder.price;
            this.rules = builder.rules;
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

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Price price; 
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.price = model.price;
                this.rules = model.rules;
            } 

            /**
             * <p>The price information.</p>
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The promotion rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
