// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CommodityValue} extends {@link TeaModel}
 *
 * <p>CommodityValue</p>
 */
public class CommodityValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CommodityValue(Builder builder) {
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommodityValue create() {
        return builder().build();
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Result result; 

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CommodityValue build() {
            return new CommodityValue(this);
        } 

    } 

    /**
     * 
     * {@link CommodityValue} extends {@link TeaModel}
     *
     * <p>CommodityValue</p>
     */
    public static class Order extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private String tradeAmount;

        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private String discountAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private String originalAmount;

        private Order(Builder builder) {
            this.currency = builder.currency;
            this.tradeAmount = builder.tradeAmount;
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return tradeAmount
         */
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        /**
         * @return discountAmount
         */
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public static final class Builder {
            private String currency; 
            private String tradeAmount; 
            private String discountAmount; 
            private String originalAmount; 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * TradeAmount.
             */
            public Builder tradeAmount(String tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(String discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(String originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommodityValue} extends {@link TeaModel}
     *
     * <p>CommodityValue</p>
     */
    public static class ModuleAttrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private ModuleAttrs(Builder builder) {
            this.type = builder.type;
            this.name = builder.name;
            this.code = builder.code;
            this.value = builder.value;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleAttrs create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Long type; 
            private String name; 
            private String code; 
            private String value; 
            private String unit; 

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public ModuleAttrs build() {
                return new ModuleAttrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommodityValue} extends {@link TeaModel}
     *
     * <p>CommodityValue</p>
     */
    public static class ModuleInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("TotalProductFee")
        private Double totalProductFee;

        @com.aliyun.core.annotation.NameInMap("DiscountFee")
        private Double discountFee;

        @com.aliyun.core.annotation.NameInMap("PayFee")
        private Double payFee;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
        private String priceUnit;

        @com.aliyun.core.annotation.NameInMap("IsPricingModule")
        private Boolean isPricingModule;

        @com.aliyun.core.annotation.NameInMap("NeedOrderPay")
        private Boolean needOrderPay;

        @com.aliyun.core.annotation.NameInMap("PriceType")
        private String priceType;

        @com.aliyun.core.annotation.NameInMap("ModuleAttrs")
        private java.util.List < ModuleAttrs> moduleAttrs;

        private ModuleInstance(Builder builder) {
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.moduleCode = builder.moduleCode;
            this.totalProductFee = builder.totalProductFee;
            this.discountFee = builder.discountFee;
            this.payFee = builder.payFee;
            this.priceUnit = builder.priceUnit;
            this.isPricingModule = builder.isPricingModule;
            this.needOrderPay = builder.needOrderPay;
            this.priceType = builder.priceType;
            this.moduleAttrs = builder.moduleAttrs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleInstance create() {
            return builder().build();
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return totalProductFee
         */
        public Double getTotalProductFee() {
            return this.totalProductFee;
        }

        /**
         * @return discountFee
         */
        public Double getDiscountFee() {
            return this.discountFee;
        }

        /**
         * @return payFee
         */
        public Double getPayFee() {
            return this.payFee;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return isPricingModule
         */
        public Boolean getIsPricingModule() {
            return this.isPricingModule;
        }

        /**
         * @return needOrderPay
         */
        public Boolean getNeedOrderPay() {
            return this.needOrderPay;
        }

        /**
         * @return priceType
         */
        public String getPriceType() {
            return this.priceType;
        }

        /**
         * @return moduleAttrs
         */
        public java.util.List < ModuleAttrs> getModuleAttrs() {
            return this.moduleAttrs;
        }

        public static final class Builder {
            private Long moduleId; 
            private String moduleName; 
            private String moduleCode; 
            private Double totalProductFee; 
            private Double discountFee; 
            private Double payFee; 
            private String priceUnit; 
            private Boolean isPricingModule; 
            private Boolean needOrderPay; 
            private String priceType; 
            private java.util.List < ModuleAttrs> moduleAttrs; 

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
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
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * TotalProductFee.
             */
            public Builder totalProductFee(Double totalProductFee) {
                this.totalProductFee = totalProductFee;
                return this;
            }

            /**
             * DiscountFee.
             */
            public Builder discountFee(Double discountFee) {
                this.discountFee = discountFee;
                return this;
            }

            /**
             * PayFee.
             */
            public Builder payFee(Double payFee) {
                this.payFee = payFee;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * IsPricingModule.
             */
            public Builder isPricingModule(Boolean isPricingModule) {
                this.isPricingModule = isPricingModule;
                return this;
            }

            /**
             * NeedOrderPay.
             */
            public Builder needOrderPay(Boolean needOrderPay) {
                this.needOrderPay = needOrderPay;
                return this;
            }

            /**
             * PriceType.
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * ModuleAttrs.
             */
            public Builder moduleAttrs(java.util.List < ModuleAttrs> moduleAttrs) {
                this.moduleAttrs = moduleAttrs;
                return this;
            }

            public ModuleInstance build() {
                return new ModuleInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommodityValue} extends {@link TeaModel}
     *
     * <p>CommodityValue</p>
     */
    public static class SubOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleInstance")
        private java.util.List < ModuleInstance> moduleInstance;

        private SubOrder(Builder builder) {
            this.moduleInstance = builder.moduleInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrder create() {
            return builder().build();
        }

        /**
         * @return moduleInstance
         */
        public java.util.List < ModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

        public static final class Builder {
            private java.util.List < ModuleInstance> moduleInstance; 

            /**
             * ModuleInstance.
             */
            public Builder moduleInstance(java.util.List < ModuleInstance> moduleInstance) {
                this.moduleInstance = moduleInstance;
                return this;
            }

            public SubOrder build() {
                return new SubOrder(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommodityValue} extends {@link TeaModel}
     *
     * <p>CommodityValue</p>
     */
    public static class SubOrders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubOrder")
        private java.util.List < SubOrder> subOrder;

        private SubOrders(Builder builder) {
            this.subOrder = builder.subOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrders create() {
            return builder().build();
        }

        /**
         * @return subOrder
         */
        public java.util.List < SubOrder> getSubOrder() {
            return this.subOrder;
        }

        public static final class Builder {
            private java.util.List < SubOrder> subOrder; 

            /**
             * SubOrder.
             */
            public Builder subOrder(java.util.List < SubOrder> subOrder) {
                this.subOrder = subOrder;
                return this;
            }

            public SubOrders build() {
                return new SubOrders(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommodityValue} extends {@link TeaModel}
     *
     * <p>CommodityValue</p>
     */
    public static class Coupons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanPromFee")
        private Double canPromFee;

        @com.aliyun.core.annotation.NameInMap("CouponDesc")
        private String couponDesc;

        @com.aliyun.core.annotation.NameInMap("CouponName")
        private String couponName;

        @com.aliyun.core.annotation.NameInMap("CouponOptionNo")
        private String couponOptionNo;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private Coupons(Builder builder) {
            this.canPromFee = builder.canPromFee;
            this.couponDesc = builder.couponDesc;
            this.couponName = builder.couponName;
            this.couponOptionNo = builder.couponOptionNo;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coupons create() {
            return builder().build();
        }

        /**
         * @return canPromFee
         */
        public Double getCanPromFee() {
            return this.canPromFee;
        }

        /**
         * @return couponDesc
         */
        public String getCouponDesc() {
            return this.couponDesc;
        }

        /**
         * @return couponName
         */
        public String getCouponName() {
            return this.couponName;
        }

        /**
         * @return couponOptionNo
         */
        public String getCouponOptionNo() {
            return this.couponOptionNo;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private Double canPromFee; 
            private String couponDesc; 
            private String couponName; 
            private String couponOptionNo; 
            private Boolean selected; 

            /**
             * CanPromFee.
             */
            public Builder canPromFee(Double canPromFee) {
                this.canPromFee = canPromFee;
                return this;
            }

            /**
             * CouponDesc.
             */
            public Builder couponDesc(String couponDesc) {
                this.couponDesc = couponDesc;
                return this;
            }

            /**
             * CouponName.
             */
            public Builder couponName(String couponName) {
                this.couponName = couponName;
                return this;
            }

            /**
             * CouponOptionNo.
             */
            public Builder couponOptionNo(String couponOptionNo) {
                this.couponOptionNo = couponOptionNo;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public Coupons build() {
                return new Coupons(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommodityValue} extends {@link TeaModel}
     *
     * <p>CommodityValue</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private Order order;

        @com.aliyun.core.annotation.NameInMap("InquiryType")
        private String inquiryType;

        @com.aliyun.core.annotation.NameInMap("SubOrders")
        private SubOrders subOrders;

        @com.aliyun.core.annotation.NameInMap("Coupons")
        private java.util.List < Coupons> coupons;

        private Result(Builder builder) {
            this.order = builder.order;
            this.inquiryType = builder.inquiryType;
            this.subOrders = builder.subOrders;
            this.coupons = builder.coupons;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public Order getOrder() {
            return this.order;
        }

        /**
         * @return inquiryType
         */
        public String getInquiryType() {
            return this.inquiryType;
        }

        /**
         * @return subOrders
         */
        public SubOrders getSubOrders() {
            return this.subOrders;
        }

        /**
         * @return coupons
         */
        public java.util.List < Coupons> getCoupons() {
            return this.coupons;
        }

        public static final class Builder {
            private Order order; 
            private String inquiryType; 
            private SubOrders subOrders; 
            private java.util.List < Coupons> coupons; 

            /**
             * Order.
             */
            public Builder order(Order order) {
                this.order = order;
                return this;
            }

            /**
             * InquiryType.
             */
            public Builder inquiryType(String inquiryType) {
                this.inquiryType = inquiryType;
                return this;
            }

            /**
             * SubOrders.
             */
            public Builder subOrders(SubOrders subOrders) {
                this.subOrders = subOrders;
                return this;
            }

            /**
             * Coupons.
             */
            public Builder coupons(java.util.List < Coupons> coupons) {
                this.coupons = coupons;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
