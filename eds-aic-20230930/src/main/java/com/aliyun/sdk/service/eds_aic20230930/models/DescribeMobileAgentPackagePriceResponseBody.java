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
 * {@link DescribeMobileAgentPackagePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMobileAgentPackagePriceResponseBody</p>
 */
public class DescribeMobileAgentPackagePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Price")
    private Price price;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private DescribeMobileAgentPackagePriceResponseBody(Builder builder) {
        this.price = builder.price;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMobileAgentPackagePriceResponseBody create() {
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

        private Builder(DescribeMobileAgentPackagePriceResponseBody model) {
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
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
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

        public DescribeMobileAgentPackagePriceResponseBody build() {
            return new DescribeMobileAgentPackagePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMobileAgentPackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMobileAgentPackagePriceResponseBody</p>
     */
    public static class ModulePrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private String discountPrice;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private String originalPrice;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private String tradePrice;

        private ModulePrice(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.moduleName = builder.moduleName;
            this.originalPrice = builder.originalPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModulePrice create() {
            return builder().build();
        }

        /**
         * @return discountPrice
         */
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return originalPrice
         */
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return tradePrice
         */
        public String getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String discountPrice; 
            private String moduleName; 
            private String originalPrice; 
            private String tradePrice; 

            private Builder() {
            } 

            private Builder(ModulePrice model) {
                this.discountPrice = model.discountPrice;
                this.moduleName = model.moduleName;
                this.originalPrice = model.originalPrice;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The discounted price.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder discountPrice(String discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The name of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>Advanced Edition</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder originalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The transaction price.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder tradePrice(String tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public ModulePrice build() {
                return new ModulePrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMobileAgentPackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMobileAgentPackagePriceResponseBody</p>
     */
    public static class PriceDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("ModulePrice")
        private java.util.List<ModulePrice> modulePrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private PriceDetail(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.modulePrice = builder.modulePrice;
            this.originalPrice = builder.originalPrice;
            this.resourceType = builder.resourceType;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceDetail create() {
            return builder().build();
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return modulePrice
         */
        public java.util.List<ModulePrice> getModulePrice() {
            return this.modulePrice;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private Float discountPrice; 
            private java.util.List<ModulePrice> modulePrice; 
            private Float originalPrice; 
            private String resourceType; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(PriceDetail model) {
                this.discountPrice = model.discountPrice;
                this.modulePrice = model.modulePrice;
                this.originalPrice = model.originalPrice;
                this.resourceType = model.resourceType;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The discounted price.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The prices of the modules.</p>
             */
            public Builder modulePrice(java.util.List<ModulePrice> modulePrice) {
                this.modulePrice = modulePrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudPhoneMobileAgent</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The transaction price.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public PriceDetail build() {
                return new PriceDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMobileAgentPackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMobileAgentPackagePriceResponseBody</p>
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
             * <p>The coupon code.</p>
             * 
             * <strong>example:</strong>
             * <p>daily</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The coupon description.</p>
             * 
             * <strong>example:</strong>
             * <p>Regular discount</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The ID of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>90712091****</p>
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The name of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>Regular discount</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>Indicates whether the promotion is selected.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link DescribeMobileAgentPackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMobileAgentPackagePriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("PriceDetail")
        private java.util.List<PriceDetail> priceDetail;

        @com.aliyun.core.annotation.NameInMap("Promotions")
        private java.util.List<Promotions> promotions;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.priceDetail = builder.priceDetail;
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
         * @return priceDetail
         */
        public java.util.List<PriceDetail> getPriceDetail() {
            return this.priceDetail;
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
            private java.util.List<PriceDetail> priceDetail; 
            private java.util.List<Promotions> promotions; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(Price model) {
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.originalPrice = model.originalPrice;
                this.priceDetail = model.priceDetail;
                this.promotions = model.promotions;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The currency.</p>
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
             * <p>200</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The price details.</p>
             */
            public Builder priceDetail(java.util.List<PriceDetail> priceDetail) {
                this.priceDetail = priceDetail;
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
             * <p>800</p>
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
     * {@link DescribeMobileAgentPackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMobileAgentPackagePriceResponseBody</p>
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
             * <p>Regular discount</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f07tkae80jbiy****</p>
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
