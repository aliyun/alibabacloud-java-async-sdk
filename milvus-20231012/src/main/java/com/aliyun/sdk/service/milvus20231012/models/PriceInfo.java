// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link PriceInfo} extends {@link TeaModel}
 *
 * <p>PriceInfo</p>
 */
public class PriceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("discountAmount")
    private String discountAmount;

    @com.aliyun.core.annotation.NameInMap("optionalPromotions")
    private java.util.List<PromotionInfo> optionalPromotions;

    @com.aliyun.core.annotation.NameInMap("originalAmount")
    private String originalAmount;

    @com.aliyun.core.annotation.NameInMap("priceModules")
    private java.util.List<PriceModules> priceModules;

    @com.aliyun.core.annotation.NameInMap("rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("taxAmount")
    private String taxAmount;

    @com.aliyun.core.annotation.NameInMap("tradeAmount")
    private String tradeAmount;

    private PriceInfo(Builder builder) {
        this.currency = builder.currency;
        this.discountAmount = builder.discountAmount;
        this.optionalPromotions = builder.optionalPromotions;
        this.originalAmount = builder.originalAmount;
        this.priceModules = builder.priceModules;
        this.rules = builder.rules;
        this.taxAmount = builder.taxAmount;
        this.tradeAmount = builder.tradeAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PriceInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return discountAmount
     */
    public String getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * @return optionalPromotions
     */
    public java.util.List<PromotionInfo> getOptionalPromotions() {
        return this.optionalPromotions;
    }

    /**
     * @return originalAmount
     */
    public String getOriginalAmount() {
        return this.originalAmount;
    }

    /**
     * @return priceModules
     */
    public java.util.List<PriceModules> getPriceModules() {
        return this.priceModules;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return taxAmount
     */
    public String getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * @return tradeAmount
     */
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public static final class Builder {
        private String currency; 
        private String discountAmount; 
        private java.util.List<PromotionInfo> optionalPromotions; 
        private String originalAmount; 
        private java.util.List<PriceModules> priceModules; 
        private java.util.List<Rules> rules; 
        private String taxAmount; 
        private String tradeAmount; 

        private Builder() {
        } 

        private Builder(PriceInfo model) {
            this.currency = model.currency;
            this.discountAmount = model.discountAmount;
            this.optionalPromotions = model.optionalPromotions;
            this.originalAmount = model.originalAmount;
            this.priceModules = model.priceModules;
            this.rules = model.rules;
            this.taxAmount = model.taxAmount;
            this.tradeAmount = model.tradeAmount;
        } 

        /**
         * currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * discountAmount.
         */
        public Builder discountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * optionalPromotions.
         */
        public Builder optionalPromotions(java.util.List<PromotionInfo> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }

        /**
         * originalAmount.
         */
        public Builder originalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }

        /**
         * priceModules.
         */
        public Builder priceModules(java.util.List<PriceModules> priceModules) {
            this.priceModules = priceModules;
            return this;
        }

        /**
         * rules.
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * taxAmount.
         */
        public Builder taxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * tradeAmount.
         */
        public Builder tradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }

        public PriceInfo build() {
            return new PriceInfo(this);
        } 

    } 

    /**
     * 
     * {@link PriceInfo} extends {@link TeaModel}
     *
     * <p>PriceInfo</p>
     */
    public static class PriceModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("originalAmount")
        private String originalAmount;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PriceModules(Builder builder) {
            this.originalAmount = builder.originalAmount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceModules create() {
            return builder().build();
        }

        /**
         * @return originalAmount
         */
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String originalAmount; 
            private String type; 

            private Builder() {
            } 

            private Builder(PriceModules model) {
                this.originalAmount = model.originalAmount;
                this.type = model.type;
            } 

            /**
             * originalAmount.
             */
            public Builder originalAmount(String originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PriceModules build() {
                return new PriceModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link PriceInfo} extends {@link TeaModel}
     *
     * <p>PriceInfo</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        private Rules(Builder builder) {
            this.amount = builder.amount;
            this.name = builder.name;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String amount; 
            private String name; 
            private String ruleId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.amount = model.amount;
                this.name = model.name;
                this.ruleId = model.ruleId;
            } 

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ruleId.
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
