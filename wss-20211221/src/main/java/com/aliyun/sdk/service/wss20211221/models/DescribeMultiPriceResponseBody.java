// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeMultiPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMultiPriceResponseBody</p>
 */
public class DescribeMultiPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMultiPriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultiPriceResponseBody create() {
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

        private Builder(DescribeMultiPriceResponseBody model) {
            this.priceInfo = model.priceInfo;
            this.requestId = model.requestId;
        } 

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

        public DescribeMultiPriceResponseBody build() {
            return new DescribeMultiPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMultiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceResponseBody</p>
     */
    public static class ModuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("ModuleValue")
        private String moduleValue;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private ModuleDetails(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
            this.moduleValue = builder.moduleValue;
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
        public Float getDiscountPrice() {
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
         * @return moduleValue
         */
        public String getModuleValue() {
            return this.moduleValue;
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
            private Float discountPrice; 
            private String moduleCode; 
            private String moduleName; 
            private String moduleValue; 
            private Float originalPrice; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(ModuleDetails model) {
                this.discountPrice = model.discountPrice;
                this.moduleCode = model.moduleCode;
                this.moduleName = model.moduleName;
                this.moduleValue = model.moduleValue;
                this.originalPrice = model.originalPrice;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * ModuleValue.
             */
            public Builder moduleValue(String moduleValue) {
                this.moduleValue = moduleValue;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
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
     * {@link DescribeMultiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceResponseBody</p>
     */
    public static class PriceDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private PriceDetail(Builder builder) {
            this.discountPrice = builder.discountPrice;
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
            private Float originalPrice; 
            private String resourceType; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(PriceDetail model) {
                this.discountPrice = model.discountPrice;
                this.originalPrice = model.originalPrice;
                this.resourceType = model.resourceType;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * TradePrice.
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
     * {@link DescribeMultiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceResponseBody</p>
     */
    public static class PriceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleDetails")
        private java.util.List<ModuleDetails> moduleDetails;

        @com.aliyun.core.annotation.NameInMap("OrderItem")
        private Integer orderItem;

        @com.aliyun.core.annotation.NameInMap("PriceDetail")
        private PriceDetail priceDetail;

        private PriceDetails(Builder builder) {
            this.moduleDetails = builder.moduleDetails;
            this.orderItem = builder.orderItem;
            this.priceDetail = builder.priceDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceDetails create() {
            return builder().build();
        }

        /**
         * @return moduleDetails
         */
        public java.util.List<ModuleDetails> getModuleDetails() {
            return this.moduleDetails;
        }

        /**
         * @return orderItem
         */
        public Integer getOrderItem() {
            return this.orderItem;
        }

        /**
         * @return priceDetail
         */
        public PriceDetail getPriceDetail() {
            return this.priceDetail;
        }

        public static final class Builder {
            private java.util.List<ModuleDetails> moduleDetails; 
            private Integer orderItem; 
            private PriceDetail priceDetail; 

            private Builder() {
            } 

            private Builder(PriceDetails model) {
                this.moduleDetails = model.moduleDetails;
                this.orderItem = model.orderItem;
                this.priceDetail = model.priceDetail;
            } 

            /**
             * ModuleDetails.
             */
            public Builder moduleDetails(java.util.List<ModuleDetails> moduleDetails) {
                this.moduleDetails = moduleDetails;
                return this;
            }

            /**
             * OrderItem.
             */
            public Builder orderItem(Integer orderItem) {
                this.orderItem = orderItem;
                return this;
            }

            /**
             * PriceDetail.
             */
            public Builder priceDetail(PriceDetail priceDetail) {
                this.priceDetail = priceDetail;
                return this;
            }

            public PriceDetails build() {
                return new PriceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceResponseBody</p>
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
             * OptionCode.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * PromotionDesc.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * PromotionId.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * Selected.
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
     * {@link DescribeMultiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("PriceDetails")
        private java.util.List<PriceDetails> priceDetails;

        @com.aliyun.core.annotation.NameInMap("Promotions")
        private java.util.List<Promotions> promotions;

        @com.aliyun.core.annotation.NameInMap("RefundInstanceIdPriceMap")
        private java.util.Map<String, Float> refundInstanceIdPriceMap;

        @com.aliyun.core.annotation.NameInMap("RefundPrice")
        private Float refundPrice;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.priceDetails = builder.priceDetails;
            this.promotions = builder.promotions;
            this.refundInstanceIdPriceMap = builder.refundInstanceIdPriceMap;
            this.refundPrice = builder.refundPrice;
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
         * @return priceDetails
         */
        public java.util.List<PriceDetails> getPriceDetails() {
            return this.priceDetails;
        }

        /**
         * @return promotions
         */
        public java.util.List<Promotions> getPromotions() {
            return this.promotions;
        }

        /**
         * @return refundInstanceIdPriceMap
         */
        public java.util.Map<String, Float> getRefundInstanceIdPriceMap() {
            return this.refundInstanceIdPriceMap;
        }

        /**
         * @return refundPrice
         */
        public Float getRefundPrice() {
            return this.refundPrice;
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
            private java.util.List<PriceDetails> priceDetails; 
            private java.util.List<Promotions> promotions; 
            private java.util.Map<String, Float> refundInstanceIdPriceMap; 
            private Float refundPrice; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(Price model) {
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.originalPrice = model.originalPrice;
                this.priceDetails = model.priceDetails;
                this.promotions = model.promotions;
                this.refundInstanceIdPriceMap = model.refundInstanceIdPriceMap;
                this.refundPrice = model.refundPrice;
                this.tradePrice = model.tradePrice;
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
             * OriginalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * PriceDetails.
             */
            public Builder priceDetails(java.util.List<PriceDetails> priceDetails) {
                this.priceDetails = priceDetails;
                return this;
            }

            /**
             * Promotions.
             */
            public Builder promotions(java.util.List<Promotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * RefundInstanceIdPriceMap.
             */
            public Builder refundInstanceIdPriceMap(java.util.Map<String, Float> refundInstanceIdPriceMap) {
                this.refundInstanceIdPriceMap = refundInstanceIdPriceMap;
                return this;
            }

            /**
             * RefundPrice.
             */
            public Builder refundPrice(Float refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * TradePrice.
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
     * {@link DescribeMultiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceResponseBody</p>
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RuleId.
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
     * {@link DescribeMultiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceResponseBody</p>
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
             * Price.
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * Rules.
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
