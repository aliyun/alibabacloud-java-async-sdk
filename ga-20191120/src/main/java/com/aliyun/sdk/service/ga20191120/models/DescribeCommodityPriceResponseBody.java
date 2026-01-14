// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DescribeCommodityPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommodityPriceResponseBody</p>
 */
public class DescribeCommodityPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("DiscountPrice")
    private Double discountPrice;

    @com.aliyun.core.annotation.NameInMap("OrderDetails")
    private java.util.List<OrderDetails> orderDetails;

    @com.aliyun.core.annotation.NameInMap("OriginalPrice")
    private Double originalPrice;

    @com.aliyun.core.annotation.NameInMap("Promotions")
    private java.util.List<Promotions> promotions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleDetails")
    private java.util.List<RuleDetails> ruleDetails;

    @com.aliyun.core.annotation.NameInMap("TradePrice")
    private Double tradePrice;

    private DescribeCommodityPriceResponseBody(Builder builder) {
        this.currency = builder.currency;
        this.discountPrice = builder.discountPrice;
        this.orderDetails = builder.orderDetails;
        this.originalPrice = builder.originalPrice;
        this.promotions = builder.promotions;
        this.requestId = builder.requestId;
        this.ruleDetails = builder.ruleDetails;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommodityPriceResponseBody create() {
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
     * @return discountPrice
     */
    public Double getDiscountPrice() {
        return this.discountPrice;
    }

    /**
     * @return orderDetails
     */
    public java.util.List<OrderDetails> getOrderDetails() {
        return this.orderDetails;
    }

    /**
     * @return originalPrice
     */
    public Double getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * @return promotions
     */
    public java.util.List<Promotions> getPromotions() {
        return this.promotions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleDetails
     */
    public java.util.List<RuleDetails> getRuleDetails() {
        return this.ruleDetails;
    }

    /**
     * @return tradePrice
     */
    public Double getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private String currency; 
        private Double discountPrice; 
        private java.util.List<OrderDetails> orderDetails; 
        private Double originalPrice; 
        private java.util.List<Promotions> promotions; 
        private String requestId; 
        private java.util.List<RuleDetails> ruleDetails; 
        private Double tradePrice; 

        private Builder() {
        } 

        private Builder(DescribeCommodityPriceResponseBody model) {
            this.currency = model.currency;
            this.discountPrice = model.discountPrice;
            this.orderDetails = model.orderDetails;
            this.originalPrice = model.originalPrice;
            this.promotions = model.promotions;
            this.requestId = model.requestId;
            this.ruleDetails = model.ruleDetails;
            this.tradePrice = model.tradePrice;
        } 

        /**
         * <p>The currency unit.</p>
         * <ul>
         * <li>China site: <strong>CNY</strong>.</li>
         * <li>International site: <strong>USD</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>419.8</p>
         */
        public Builder discountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }

        /**
         * <p>The details of the commodity module.</p>
         */
        public Builder orderDetails(java.util.List<OrderDetails> orderDetails) {
            this.orderDetails = orderDetails;
            return this;
        }

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>2099</p>
         */
        public Builder originalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * <p>The details of the coupon.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         */
        public Builder promotions(java.util.List<Promotions> promotions) {
            this.promotions = promotions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the discount rules.</p>
         */
        public Builder ruleDetails(java.util.List<RuleDetails> ruleDetails) {
            this.ruleDetails = ruleDetails;
            return this;
        }

        /**
         * <p>The transaction price, which is equal to the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>1679.2</p>
         */
        public Builder tradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public DescribeCommodityPriceResponseBody build() {
            return new DescribeCommodityPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommodityPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommodityPriceResponseBody</p>
     */
    public static class ModuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Double discountPrice;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Double originalPrice;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Double tradePrice;

        private ModuleDetails(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
            this.originalPrice = builder.originalPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleDetails create() {
            return builder().build();
        }

        /**
         * @return discountPrice
         */
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
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
            private String moduleCode; 
            private String moduleName; 
            private Double originalPrice; 
            private Double tradePrice; 

            private Builder() {
            } 

            private Builder(ModuleDetails model) {
                this.discountPrice = model.discountPrice;
                this.moduleCode = model.moduleCode;
                this.moduleName = model.moduleName;
                this.originalPrice = model.originalPrice;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>40000.0</p>
             */
            public Builder discountPrice(Double discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The code of the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>spec</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The name of the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>Specification</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>200000.0</p>
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The transaction price, which is equal to the original price minus the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>160000.0</p>
             */
            public Builder tradePrice(Double tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public ModuleDetails build() {
                return new ModuleDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCommodityPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommodityPriceResponseBody</p>
     */
    public static class PromDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinalPromFee")
        private Double finalPromFee;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromType")
        private String promType;

        @com.aliyun.core.annotation.NameInMap("PromotionId")
        private String promotionId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        private PromDetails(Builder builder) {
            this.finalPromFee = builder.finalPromFee;
            this.optionCode = builder.optionCode;
            this.promType = builder.promType;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromDetails create() {
            return builder().build();
        }

        /**
         * @return finalPromFee
         */
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return promType
         */
        public String getPromType() {
            return this.promType;
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

        public static final class Builder {
            private Double finalPromFee; 
            private String optionCode; 
            private String promType; 
            private String promotionId; 
            private String promotionName; 

            private Builder() {
            } 

            private Builder(PromDetails model) {
                this.finalPromFee = model.finalPromFee;
                this.optionCode = model.optionCode;
                this.promType = model.promType;
                this.promotionId = model.promotionId;
                this.promotionName = model.promotionName;
            } 

            /**
             * <p>The discounted price.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder finalPromFee(Double finalPromFee) {
                this.finalPromFee = finalPromFee;
                return this;
            }

            /**
             * <p>The code of the discount option.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>youhui_quan</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The sub-type of the discount.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>deduct</p>
             */
            public Builder promType(String promType) {
                this.promType = promType;
                return this;
            }

            /**
             * <p>The ID of the discount item.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50003298014****</p>
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The name of the discount item.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>coupon</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            public PromDetails build() {
                return new PromDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCommodityPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommodityPriceResponseBody</p>
     */
    public static class OrderDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Double discountPrice;

        @com.aliyun.core.annotation.NameInMap("ModuleDetails")
        private java.util.List<ModuleDetails> moduleDetails;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Double originalPrice;

        @com.aliyun.core.annotation.NameInMap("PromDetails")
        private java.util.List<PromDetails> promDetails;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private java.util.List<Long> ruleIds;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Double tradePrice;

        private OrderDetails(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.discountPrice = builder.discountPrice;
            this.moduleDetails = builder.moduleDetails;
            this.originalPrice = builder.originalPrice;
            this.promDetails = builder.promDetails;
            this.quantity = builder.quantity;
            this.ruleIds = builder.ruleIds;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetails create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return discountPrice
         */
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return moduleDetails
         */
        public java.util.List<ModuleDetails> getModuleDetails() {
            return this.moduleDetails;
        }

        /**
         * @return originalPrice
         */
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return promDetails
         */
        public java.util.List<PromDetails> getPromDetails() {
            return this.promDetails;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return ruleIds
         */
        public java.util.List<Long> getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return tradePrice
         */
        public Double getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String commodityCode; 
            private String commodityName; 
            private Double discountPrice; 
            private java.util.List<ModuleDetails> moduleDetails; 
            private Double originalPrice; 
            private java.util.List<PromDetails> promDetails; 
            private Long quantity; 
            private java.util.List<Long> ruleIds; 
            private Double tradePrice; 

            private Builder() {
            } 

            private Builder(OrderDetails model) {
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
                this.discountPrice = model.discountPrice;
                this.moduleDetails = model.moduleDetails;
                this.originalPrice = model.originalPrice;
                this.promDetails = model.promDetails;
                this.quantity = model.quantity;
                this.ruleIds = model.ruleIds;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The code of the commodity.</p>
             * 
             * <strong>example:</strong>
             * <p>ga_gapluspre_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The name of the commodity.</p>
             * 
             * <strong>example:</strong>
             * <p>Global Accelerator_Instance Type (Subscription)</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>419.8</p>
             */
            public Builder discountPrice(Double discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The information about the commodity module.</p>
             */
            public Builder moduleDetails(java.util.List<ModuleDetails> moduleDetails) {
                this.moduleDetails = moduleDetails;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>2099</p>
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The details of the discount.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             */
            public Builder promDetails(java.util.List<PromDetails> promDetails) {
                this.promDetails = promDetails;
                return this;
            }

            /**
             * <p>The number of instances that are purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The IDs of discount rules.</p>
             */
            public Builder ruleIds(java.util.List<Long> ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * <p>The transaction price, which is equal to the original price minus the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>1679.2</p>
             */
            public Builder tradePrice(Double tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public OrderDetails build() {
                return new OrderDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCommodityPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommodityPriceResponseBody</p>
     */
    public static class Promotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanPromFee")
        private Double canPromFee;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private Promotions(Builder builder) {
            this.canPromFee = builder.canPromFee;
            this.optionCode = builder.optionCode;
            this.promotionName = builder.promotionName;
            this.promotionOptionNo = builder.promotionOptionNo;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Promotions create() {
            return builder().build();
        }

        /**
         * @return canPromFee
         */
        public Double getCanPromFee() {
            return this.canPromFee;
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return promotionOptionNo
         */
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private Double canPromFee; 
            private String optionCode; 
            private String promotionName; 
            private String promotionOptionNo; 
            private Boolean selected; 

            private Builder() {
            } 

            private Builder(Promotions model) {
                this.canPromFee = model.canPromFee;
                this.optionCode = model.optionCode;
                this.promotionName = model.promotionName;
                this.promotionOptionNo = model.promotionOptionNo;
                this.selected = model.selected;
            } 

            /**
             * <p>The discounted amount.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder canPromFee(Double canPromFee) {
                this.canPromFee = canPromFee;
                return this;
            }

            /**
             * <p>The code of the commodity to which the coupon can be applied.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>youhui_quan</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The name of the coupon.</p>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>youhuiquan_promotion_option_id_for_blank</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>The code of the coupon.</p>
             * <blockquote>
             * <ul>
             * <li><code>youhuiquan_promotion_option_id_for_blank</code> indicates coupons that cannot be applied to the commodity.</li>
             * <li>This parameter does not take effect for accounts registered on the China site (aliyun.com).</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50003298014****</p>
             */
            public Builder promotionOptionNo(String promotionOptionNo) {
                this.promotionOptionNo = promotionOptionNo;
                return this;
            }

            /**
             * <p>Indicates whether the coupon was selected.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
             * </blockquote>
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
     * {@link DescribeCommodityPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommodityPriceResponseBody</p>
     */
    public static class RuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private RuleDetails(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleDetails create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(RuleDetails model) {
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * <p>The ID of the discount rule.</p>
             * 
             * <strong>example:</strong>
             * <p>102104100786****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the discount rule.</p>
             * 
             * <strong>example:</strong>
             * <p>GA New Customers Small II Specification Monthly Subscription - 20% Discount</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public RuleDetails build() {
                return new RuleDetails(this);
            } 

        } 

    }
}
