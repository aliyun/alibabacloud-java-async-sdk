// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link QueryCreateInstancePriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCreateInstancePriceResponseBody</p>
 */
public class QueryCreateInstancePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCreateInstancePriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCreateInstancePriceResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private PriceInfo priceInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryCreateInstancePriceResponseBody model) {
            this.priceInfo = model.priceInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The price information, including the price and discount rules.</p>
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCreateInstancePriceResponseBody build() {
            return new QueryCreateInstancePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCreateInstancePriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceResponseBody</p>
     */
    public static class DepreciateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheapRate")
        private String cheapRate;

        @com.aliyun.core.annotation.NameInMap("CheapStandAmount")
        private String cheapStandAmount;

        @com.aliyun.core.annotation.NameInMap("IsShow")
        private Boolean isShow;

        @com.aliyun.core.annotation.NameInMap("MonthPrice")
        private String monthPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalStandAmount")
        private String originalStandAmount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private DepreciateInfo(Builder builder) {
            this.cheapRate = builder.cheapRate;
            this.cheapStandAmount = builder.cheapStandAmount;
            this.isShow = builder.isShow;
            this.monthPrice = builder.monthPrice;
            this.originalStandAmount = builder.originalStandAmount;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepreciateInfo create() {
            return builder().build();
        }

        /**
         * @return cheapRate
         */
        public String getCheapRate() {
            return this.cheapRate;
        }

        /**
         * @return cheapStandAmount
         */
        public String getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        /**
         * @return isShow
         */
        public Boolean getIsShow() {
            return this.isShow;
        }

        /**
         * @return monthPrice
         */
        public String getMonthPrice() {
            return this.monthPrice;
        }

        /**
         * @return originalStandAmount
         */
        public String getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String cheapRate; 
            private String cheapStandAmount; 
            private Boolean isShow; 
            private String monthPrice; 
            private String originalStandAmount; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(DepreciateInfo model) {
                this.cheapRate = model.cheapRate;
                this.cheapStandAmount = model.cheapStandAmount;
                this.isShow = model.isShow;
                this.monthPrice = model.monthPrice;
                this.originalStandAmount = model.originalStandAmount;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The price reduction rate.</p>
             * 
             * <strong>example:</strong>
             * <p>34%</p>
             */
            public Builder cheapRate(String cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * <p>The total price on the official website after the price reduction.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder cheapStandAmount(String cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
                return this;
            }

            /**
             * <p>Indicates whether to display the price reduction rate.</p>
             */
            public Builder isShow(Boolean isShow) {
                this.isShow = isShow;
                return this;
            }

            /**
             * <p>The equivalent monthly price.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder monthPrice(String monthPrice) {
                this.monthPrice = monthPrice;
                return this;
            }

            /**
             * <p>The original total price on the official website.</p>
             * 
             * <strong>example:</strong>
             * <p>12000</p>
             */
            public Builder originalStandAmount(String originalStandAmount) {
                this.originalStandAmount = originalStandAmount;
                return this;
            }

            /**
             * <p>The start time of the price reduction, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-21T02:06:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public DepreciateInfo build() {
                return new DepreciateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCreateInstancePriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceResponseBody</p>
     */
    public static class ModulePrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("FinalUnitFee")
        private String finalUnitFee;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("PayAmount")
        private Float payAmount;

        @com.aliyun.core.annotation.NameInMap("PriceType")
        private String priceType;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
        private String priceUnit;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private String quantity;

        private ModulePrices(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.finalUnitFee = builder.finalUnitFee;
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
            this.originalAmount = builder.originalAmount;
            this.payAmount = builder.payAmount;
            this.priceType = builder.priceType;
            this.priceUnit = builder.priceUnit;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModulePrices create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return finalUnitFee
         */
        public String getFinalUnitFee() {
            return this.finalUnitFee;
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
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return payAmount
         */
        public Float getPayAmount() {
            return this.payAmount;
        }

        /**
         * @return priceType
         */
        public String getPriceType() {
            return this.priceType;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private Float discountAmount; 
            private String finalUnitFee; 
            private String moduleCode; 
            private String moduleName; 
            private Float originalAmount; 
            private Float payAmount; 
            private String priceType; 
            private String priceUnit; 
            private String quantity; 

            private Builder() {
            } 

            private Builder(ModulePrices model) {
                this.discountAmount = model.discountAmount;
                this.finalUnitFee = model.finalUnitFee;
                this.moduleCode = model.moduleCode;
                this.moduleName = model.moduleName;
                this.originalAmount = model.originalAmount;
                this.payAmount = model.payAmount;
                this.priceType = model.priceType;
                this.priceUnit = model.priceUnit;
                this.quantity = model.quantity;
            } 

            /**
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>648.0</p>
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>The unit price of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>183600.0000</p>
             */
            public Builder finalUnitFee(String finalUnitFee) {
                this.finalUnitFee = finalUnitFee;
                return this;
            }

            /**
             * <p>The module code.</p>
             * 
             * <strong>example:</strong>
             * <p>overhead_cu</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The module name.</p>
             * 
             * <strong>example:</strong>
             * <p>Control and Management Services</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The original amount.</p>
             * 
             * <strong>example:</strong>
             * <p>4320.0</p>
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * <p>The payment amount.</p>
             * 
             * <strong>example:</strong>
             * <p>3672.0</p>
             */
            public Builder payAmount(Float payAmount) {
                this.payAmount = payAmount;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>yearPrice</p>
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * <p>The pricing unit.</p>
             * 
             * <strong>example:</strong>
             * <p>Yuan/CU</p>
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * <p>The order quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            public ModulePrices build() {
                return new ModulePrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCreateInstancePriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceResponseBody</p>
     */
    public static class OptionalPromotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromotionDesc")
        private String promotionDesc;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private OptionalPromotions(Builder builder) {
            this.promotionDesc = builder.promotionDesc;
            this.promotionName = builder.promotionName;
            this.promotionOptionNo = builder.promotionOptionNo;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalPromotions create() {
            return builder().build();
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
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
            private String promotionDesc; 
            private String promotionName; 
            private String promotionOptionNo; 
            private Boolean selected; 

            private Builder() {
            } 

            private Builder(OptionalPromotions model) {
                this.promotionDesc = model.promotionDesc;
                this.promotionName = model.promotionName;
                this.promotionOptionNo = model.promotionOptionNo;
                this.selected = model.selected;
            } 

            /**
             * <p>The description of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>¥1,391.5 coupon (valid until 03/23/2022)</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The name of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>¥1,391.5 coupon</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>The ID of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>500011220010099</p>
             */
            public Builder promotionOptionNo(String promotionOptionNo) {
                this.promotionOptionNo = promotionOptionNo;
                return this;
            }

            /**
             * <p>Specifies whether the coupon is selected. Valid values:</p>
             * <ul>
             * <li>true: Selected.</li>
             * <li>false: Not selected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public OptionalPromotions build() {
                return new OptionalPromotions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCreateInstancePriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceResponseBody</p>
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
             * <p>The description of the promotion rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Enjoy a 15% discount on the official website price for a 1-year subscription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the promotion rule.</p>
             * 
             * <strong>example:</strong>
             * <p>587</p>
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
     * {@link QueryCreateInstancePriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DepreciateInfo")
        private DepreciateInfo depreciateInfo;

        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("LxRequestId")
        private String lxRequestId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModulePrices")
        private java.util.List<ModulePrices> modulePrices;

        @com.aliyun.core.annotation.NameInMap("OptionalPromotions")
        private java.util.List<OptionalPromotions> optionalPromotions;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("StandDiscountPrice")
        private String standDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("StandPrice")
        private String standPrice;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private PriceInfo(Builder builder) {
            this.code = builder.code;
            this.currency = builder.currency;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountAmount = builder.discountAmount;
            this.isContractActivity = builder.isContractActivity;
            this.lxRequestId = builder.lxRequestId;
            this.message = builder.message;
            this.modulePrices = builder.modulePrices;
            this.optionalPromotions = builder.optionalPromotions;
            this.originalAmount = builder.originalAmount;
            this.rules = builder.rules;
            this.standDiscountPrice = builder.standDiscountPrice;
            this.standPrice = builder.standPrice;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return depreciateInfo
         */
        public DepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return isContractActivity
         */
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        /**
         * @return lxRequestId
         */
        public String getLxRequestId() {
            return this.lxRequestId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modulePrices
         */
        public java.util.List<ModulePrices> getModulePrices() {
            return this.modulePrices;
        }

        /**
         * @return optionalPromotions
         */
        public java.util.List<OptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return standDiscountPrice
         */
        public String getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        /**
         * @return standPrice
         */
        public String getStandPrice() {
            return this.standPrice;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String code; 
            private String currency; 
            private DepreciateInfo depreciateInfo; 
            private Float discountAmount; 
            private Boolean isContractActivity; 
            private String lxRequestId; 
            private String message; 
            private java.util.List<ModulePrices> modulePrices; 
            private java.util.List<OptionalPromotions> optionalPromotions; 
            private Float originalAmount; 
            private java.util.List<Rules> rules; 
            private String standDiscountPrice; 
            private String standPrice; 
            private Float tradeAmount; 

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.code = model.code;
                this.currency = model.currency;
                this.depreciateInfo = model.depreciateInfo;
                this.discountAmount = model.discountAmount;
                this.isContractActivity = model.isContractActivity;
                this.lxRequestId = model.lxRequestId;
                this.message = model.message;
                this.modulePrices = model.modulePrices;
                this.optionalPromotions = model.optionalPromotions;
                this.originalAmount = model.originalAmount;
                this.rules = model.rules;
                this.standDiscountPrice = model.standDiscountPrice;
                this.standPrice = model.standPrice;
                this.tradeAmount = model.tradeAmount;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ORDER.INST_HAS_UNPAID_ORDER</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The currency unit.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The price reduction information.</p>
             */
            public Builder depreciateInfo(DepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
                return this;
            }

            /**
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>655.2</p>
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>Indicates whether the key account promotion is applied.</p>
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * <p>The Lingxiao request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
             */
            public Builder lxRequestId(String lxRequestId) {
                this.lxRequestId = lxRequestId;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Unpaid orders exist. Pay for or cancel the existing orders first</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The module prices.</p>
             */
            public Builder modulePrices(java.util.List<ModulePrices> modulePrices) {
                this.modulePrices = modulePrices;
                return this;
            }

            /**
             * <p>The coupon group information.</p>
             */
            public Builder optionalPromotions(java.util.List<OptionalPromotions> optionalPromotions) {
                this.optionalPromotions = optionalPromotions;
                return this;
            }

            /**
             * <p>The original amount.</p>
             * 
             * <strong>example:</strong>
             * <p>4368</p>
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * <p>The promotion rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The discounted price based on the official website discount.</p>
             * 
             * <strong>example:</strong>
             * <p>21321</p>
             */
            public Builder standDiscountPrice(String standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * <p>The discounted price on the official website or the discounted price in the direct sales contract.</p>
             * 
             * <strong>example:</strong>
             * <p>32432</p>
             */
            public Builder standPrice(String standPrice) {
                this.standPrice = standPrice;
                return this;
            }

            /**
             * <p>The final amount, which is the original amount minus the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>3712.8</p>
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
