// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Result result; 

        private Builder() {
        } 

        private Builder(CommodityValue model) {
            this.result = model.result;
        } 

        /**
         * <p>Result模型。</p>
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

            private Builder() {
            } 

            private Builder(Order model) {
                this.currency = model.currency;
                this.tradeAmount = model.tradeAmount;
                this.discountAmount = model.discountAmount;
                this.originalAmount = model.originalAmount;
            } 

            /**
             * <p>货币代码。</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>优惠后。</p>
             * 
             * <strong>example:</strong>
             * <p>9.99</p>
             */
            public Builder tradeAmount(String tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            /**
             * <p>抵扣金额。</p>
             * 
             * <strong>example:</strong>
             * <p>1.99</p>
             */
            public Builder discountAmount(String discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>优惠前。</p>
             * 
             * <strong>example:</strong>
             * <p>11.98</p>
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

            private Builder() {
            } 

            private Builder(ModuleAttrs model) {
                this.type = model.type;
                this.name = model.name;
                this.code = model.code;
                this.value = model.value;
                this.unit = model.unit;
            } 

            /**
             * <p>属性类型，可选值：</p>
             * <ol>
             * <li>1：商品属性 </li>
             * <li>2：规格属性 </li>
             * <li>3：模块属性 </li>
             * <li>4：外部参数（备用）</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Name</p>
             * 
             * <strong>example:</strong>
             * <p>20GB</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Module attr code</p>
             * 
             * <strong>example:</strong>
             * <p>rds_storage</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>Unit</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
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
        private java.util.List<ModuleAttrs> moduleAttrs;

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
        public java.util.List<ModuleAttrs> getModuleAttrs() {
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
            private java.util.List<ModuleAttrs> moduleAttrs; 

            private Builder() {
            } 

            private Builder(ModuleInstance model) {
                this.moduleId = model.moduleId;
                this.moduleName = model.moduleName;
                this.moduleCode = model.moduleCode;
                this.totalProductFee = model.totalProductFee;
                this.discountFee = model.discountFee;
                this.payFee = model.payFee;
                this.priceUnit = model.priceUnit;
                this.isPricingModule = model.isPricingModule;
                this.needOrderPay = model.needOrderPay;
                this.priceType = model.priceType;
                this.moduleAttrs = model.moduleAttrs;
            } 

            /**
             * <p>模块ID。</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * <p>模块名称。</p>
             * 
             * <strong>example:</strong>
             * <p>Rds</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>模块代码。</p>
             * 
             * <strong>example:</strong>
             * <p>rds_dbtype</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>产品原价（元）。</p>
             * 
             * <strong>example:</strong>
             * <p>10.00</p>
             */
            public Builder totalProductFee(Double totalProductFee) {
                this.totalProductFee = totalProductFee;
                return this;
            }

            /**
             * <p>折扣费用（元）。</p>
             * 
             * <strong>example:</strong>
             * <p>1.99</p>
             */
            public Builder discountFee(Double discountFee) {
                this.discountFee = discountFee;
                return this;
            }

            /**
             * <p>实付金额（元）。</p>
             * 
             * <strong>example:</strong>
             * <p>8.01</p>
             */
            public Builder payFee(Double payFee) {
                this.payFee = payFee;
                return this;
            }

            /**
             * <p>价格单位。</p>
             * 
             * <strong>example:</strong>
             * <p>元/GB/小时</p>
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * <p>是否计价项。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPricingModule(Boolean isPricingModule) {
                this.isPricingModule = isPricingModule;
                return this;
            }

            /**
             * <p>在订单中是否需要支付。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needOrderPay(Boolean needOrderPay) {
                this.needOrderPay = needOrderPay;
                return this;
            }

            /**
             * <p>定价类型。</p>
             * 
             * <strong>example:</strong>
             * <p>hourPrice</p>
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * <p>模块属性。</p>
             */
            public Builder moduleAttrs(java.util.List<ModuleAttrs> moduleAttrs) {
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
        private java.util.List<ModuleInstance> moduleInstance;

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
        public java.util.List<ModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

        public static final class Builder {
            private java.util.List<ModuleInstance> moduleInstance; 

            private Builder() {
            } 

            private Builder(SubOrder model) {
                this.moduleInstance = model.moduleInstance;
            } 

            /**
             * <p>模块（实例）信息。</p>
             */
            public Builder moduleInstance(java.util.List<ModuleInstance> moduleInstance) {
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
        private java.util.List<SubOrder> subOrder;

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
        public java.util.List<SubOrder> getSubOrder() {
            return this.subOrder;
        }

        public static final class Builder {
            private java.util.List<SubOrder> subOrder; 

            private Builder() {
            } 

            private Builder(SubOrders model) {
                this.subOrder = model.subOrder;
            } 

            /**
             * <p>订单子项。</p>
             */
            public Builder subOrder(java.util.List<SubOrder> subOrder) {
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

            private Builder() {
            } 

            private Builder(Coupons model) {
                this.canPromFee = model.canPromFee;
                this.couponDesc = model.couponDesc;
                this.couponName = model.couponName;
                this.couponOptionNo = model.couponOptionNo;
                this.selected = model.selected;
            } 

            /**
             * <p>可支付金额。</p>
             * 
             * <strong>example:</strong>
             * <p>9.99</p>
             */
            public Builder canPromFee(Double canPromFee) {
                this.canPromFee = canPromFee;
                return this;
            }

            /**
             * <p>Coupon Description</p>
             * 
             * <strong>example:</strong>
             * <p>10元优惠券（有效期至2024年9月8日）</p>
             */
            public Builder couponDesc(String couponDesc) {
                this.couponDesc = couponDesc;
                return this;
            }

            /**
             * <p>Coupon Name</p>
             * 
             * <strong>example:</strong>
             * <p>10元优惠券</p>
             */
            public Builder couponName(String couponName) {
                this.couponName = couponName;
                return this;
            }

            /**
             * <p>Coupon OptionNo</p>
             * 
             * <strong>example:</strong>
             * <p>50008800000xxxx</p>
             */
            public Builder couponOptionNo(String couponOptionNo) {
                this.couponOptionNo = couponOptionNo;
                return this;
            }

            /**
             * <p>是否选中。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
        private java.util.List<Coupons> coupons;

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
        public java.util.List<Coupons> getCoupons() {
            return this.coupons;
        }

        public static final class Builder {
            private Order order; 
            private String inquiryType; 
            private SubOrders subOrders; 
            private java.util.List<Coupons> coupons; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.order = model.order;
                this.inquiryType = model.inquiryType;
                this.subOrders = model.subOrders;
                this.coupons = model.coupons;
            } 

            /**
             * <p>订单信息。</p>
             */
            public Builder order(Order order) {
                this.order = order;
                return this;
            }

            /**
             * <p>询价类型，可选值：</p>
             * <ol>
             * <li>Buy：新购询价。</li>
             * <li>ModificationBuy：变配询价。</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>Buy</p>
             */
            public Builder inquiryType(String inquiryType) {
                this.inquiryType = inquiryType;
                return this;
            }

            /**
             * <p>订单子项。</p>
             */
            public Builder subOrders(SubOrders subOrders) {
                this.subOrders = subOrders;
                return this;
            }

            /**
             * <p>优惠券。</p>
             */
            public Builder coupons(java.util.List<Coupons> coupons) {
                this.coupons = coupons;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
