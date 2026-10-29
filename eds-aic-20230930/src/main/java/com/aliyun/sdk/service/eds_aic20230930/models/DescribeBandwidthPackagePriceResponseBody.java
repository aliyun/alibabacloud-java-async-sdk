// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeBandwidthPackagePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackagePriceResponseBody</p>
 */
public class DescribeBandwidthPackagePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Price")
    private Price price;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private DescribeBandwidthPackagePriceResponseBody(Builder builder) {
        this.price = builder.price;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwidthPackagePriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return price
     */
    public Price getPrice() {
        return this.price;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private Price price; 
        private String requestId; 
        private java.util.List<Rules> rules; 

        private Builder() {
        } 

        private Builder(DescribeBandwidthPackagePriceResponseBody model) {
            this.price = model.price;
            this.requestId = model.requestId;
            this.rules = model.rules;
        } 

        /**
         * <p>The price.</p>
         */
        public Builder price(Price price) {
            this.price = price;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The promotion rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        public DescribeBandwidthPackagePriceResponseBody build() {
            return new DescribeBandwidthPackagePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBandwidthPackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBandwidthPackagePriceResponseBody</p>
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
             * <p>The promotion code.</p>
             * 
             * <strong>example:</strong>
             * <p>youhui_quan</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The promotion description.</p>
             * 
             * <strong>example:</strong>
             * <p>youhui</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The ID of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>91381816****</p>
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The name of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>youhui</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>Indicates whether the promotion is selected.</p>
             * 
             * <strong>example:</strong>
             * <p>ture</p>
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
     * {@link DescribeBandwidthPackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBandwidthPackagePriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("Promotions")
        private java.util.List<Promotions> promotions;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
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
            private Float originalPrice; 
            private java.util.List<Promotions> promotions; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(Price model) {
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.originalPrice = model.originalPrice;
                this.promotions = model.promotions;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>&lt;props=&quot;china&quot;&gt;The currency unit (CNY).
             * &lt;props=&quot;intl&quot;&gt;The currency unit (USD).</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discounted price.</p>
             * 
             * <strong>example:</strong>
             * <p>274.75</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * <p>&lt;props=&quot;china&quot;&gt;Unit: CNY.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;Unit: USD.</p>
             * 
             * <strong>example:</strong>
             * <p>8800</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The promotion information.</p>
             */
            public Builder promotions(java.util.List<Promotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * <p>The transaction price.</p>
             * 
             * <strong>example:</strong>
             * <p>213.52</p>
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
     * {@link DescribeBandwidthPackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBandwidthPackagePriceResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

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
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String description; 
            private String ruleId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.description = model.description;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a7gesyly7o34qy****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
