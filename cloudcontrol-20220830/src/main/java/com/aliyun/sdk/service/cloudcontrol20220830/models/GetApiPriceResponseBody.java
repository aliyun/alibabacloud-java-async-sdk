// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link GetApiPriceResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiPriceResponseBody</p>
 */
public class GetApiPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("price")
    private Price price;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetApiPriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.price = builder.price;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Price price; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetApiPriceResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.price = model.price;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The pricing result code. Valid values: Success, PricingNotRequired, PricingNotSupported, or an upstream pricing failure code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The server-side pricing result description. The language is specified by the language parameter in the request body and defaults to Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>Pricing succeeded</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pricing data. This field is omitted for PricingNotRequired and PricingNotSupported results that do not include pricing.</p>
         */
        public Builder price(Price price) {
            this.price = price;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether a valid pricing result is obtained. The value is true for normal pricing and when no pricing inquiry is required, and false when pricing is not supported or the pricing inquiry fails.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetApiPriceResponseBody build() {
            return new GetApiPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiPriceResponseBody</p>
     */
    public static class Modules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMode")
        private String billingMode;

        @com.aliyun.core.annotation.NameInMap("costAfterDiscount")
        private Float costAfterDiscount;

        @com.aliyun.core.annotation.NameInMap("invoiceDiscount")
        private Float invoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("moduleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("originalCost")
        private Float originalCost;

        @com.aliyun.core.annotation.NameInMap("quantityUsedForQuote")
        private Float quantityUsedForQuote;

        @com.aliyun.core.annotation.NameInMap("unitPrice")
        private Float unitPrice;

        @com.aliyun.core.annotation.NameInMap("usageUnit")
        private String usageUnit;

        private Modules(Builder builder) {
            this.billingMode = builder.billingMode;
            this.costAfterDiscount = builder.costAfterDiscount;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.moduleCode = builder.moduleCode;
            this.originalCost = builder.originalCost;
            this.quantityUsedForQuote = builder.quantityUsedForQuote;
            this.unitPrice = builder.unitPrice;
            this.usageUnit = builder.usageUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modules create() {
            return builder().build();
        }

        /**
         * @return billingMode
         */
        public String getBillingMode() {
            return this.billingMode;
        }

        /**
         * @return costAfterDiscount
         */
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        /**
         * @return invoiceDiscount
         */
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return originalCost
         */
        public Float getOriginalCost() {
            return this.originalCost;
        }

        /**
         * @return quantityUsedForQuote
         */
        public Float getQuantityUsedForQuote() {
            return this.quantityUsedForQuote;
        }

        /**
         * @return unitPrice
         */
        public Float getUnitPrice() {
            return this.unitPrice;
        }

        /**
         * @return usageUnit
         */
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public static final class Builder {
            private String billingMode; 
            private Float costAfterDiscount; 
            private Float invoiceDiscount; 
            private String moduleCode; 
            private Float originalCost; 
            private Float quantityUsedForQuote; 
            private Float unitPrice; 
            private String usageUnit; 

            private Builder() {
            } 

            private Builder(Modules model) {
                this.billingMode = model.billingMode;
                this.costAfterDiscount = model.costAfterDiscount;
                this.invoiceDiscount = model.invoiceDiscount;
                this.moduleCode = model.moduleCode;
                this.originalCost = model.originalCost;
                this.quantityUsedForQuote = model.quantityUsedForQuote;
                this.unitPrice = model.unitPrice;
                this.usageUnit = model.usageUnit;
            } 

            /**
             * <p>The billing dimension of this module, which is always explicitly output. Valid values: \&quot;recurring\&quot; for time-based fees, which are included in moduleSum and totalAmount; \&quot;usage\&quot; for usage-based fees, where costAfterDiscount is the usage unit price (CNY/usageUnit) and is not included in moduleSum, and the unit price is also provided in usageCharges.</p>
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * costAfterDiscount.
             */
            public Builder costAfterDiscount(Float costAfterDiscount) {
                this.costAfterDiscount = costAfterDiscount;
                return this;
            }

            /**
             * <p>The discount amount for this module. The value is calculated as invoiceDiscount = originalCost - costAfterDiscount and is precisely provided by the upstream BSS. Manual subtraction in tax-inclusive scenarios may cause precision loss.</p>
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * moduleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * originalCost.
             */
            public Builder originalCost(Float originalCost) {
                this.originalCost = originalCost;
                return this;
            }

            /**
             * <p>The estimated usage used for pricing this module. This field has a value only when the caller passes a usage greater than 1 through PricingContext. In this case, costAfterDiscount is the total cost for this usage rather than the unit price. Refer to usageCharges[].pricePerUnit for the normalized unit price. This field is empty when no estimated usage is passed.</p>
             */
            public Builder quantityUsedForQuote(Float quantityUsedForQuote) {
                this.quantityUsedForQuote = quantityUsedForQuote;
                return this;
            }

            /**
             * <p>The unit price of this module per billing unit, such as CNY/hour, CNY/month, or CNY/unit. This is used to explain the composition of costAfterDiscount in multi-quantity or multi-period scenarios.</p>
             */
            public Builder unitPrice(Float unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            /**
             * <p>The usage unit, such as GB or CU. This field has a value when billingMode is \&quot;usage\&quot; and indicates the dimension of costAfterDiscount.</p>
             */
            public Builder usageUnit(String usageUnit) {
                this.usageUnit = usageUnit;
                return this;
            }

            public Modules build() {
                return new Modules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiPriceResponseBody</p>
     */
    public static class UsageCharges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assumedQuantity")
        private Float assumedQuantity;

        @com.aliyun.core.annotation.NameInMap("assumedQuantityCost")
        private Float assumedQuantityCost;

        @com.aliyun.core.annotation.NameInMap("moduleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("originalPricePerUnit")
        private Float originalPricePerUnit;

        @com.aliyun.core.annotation.NameInMap("pricePerUnit")
        private Float pricePerUnit;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private UsageCharges(Builder builder) {
            this.assumedQuantity = builder.assumedQuantity;
            this.assumedQuantityCost = builder.assumedQuantityCost;
            this.moduleCode = builder.moduleCode;
            this.originalPricePerUnit = builder.originalPricePerUnit;
            this.pricePerUnit = builder.pricePerUnit;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageCharges create() {
            return builder().build();
        }

        /**
         * @return assumedQuantity
         */
        public Float getAssumedQuantity() {
            return this.assumedQuantity;
        }

        /**
         * @return assumedQuantityCost
         */
        public Float getAssumedQuantityCost() {
            return this.assumedQuantityCost;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return originalPricePerUnit
         */
        public Float getOriginalPricePerUnit() {
            return this.originalPricePerUnit;
        }

        /**
         * @return pricePerUnit
         */
        public Float getPricePerUnit() {
            return this.pricePerUnit;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Float assumedQuantity; 
            private Float assumedQuantityCost; 
            private String moduleCode; 
            private Float originalPricePerUnit; 
            private Float pricePerUnit; 
            private String unit; 

            private Builder() {
            } 

            private Builder(UsageCharges model) {
                this.assumedQuantity = model.assumedQuantity;
                this.assumedQuantityCost = model.assumedQuantityCost;
                this.moduleCode = model.moduleCode;
                this.originalPricePerUnit = model.originalPricePerUnit;
                this.pricePerUnit = model.pricePerUnit;
                this.unit = model.unit;
            } 

            /**
             * <p>The estimated usage passed by the caller through PricingContext. This field has a value only when it is greater than 1. In this case, this entry also provides the assumedQuantityCost calculated based on this assumed usage.</p>
             */
            public Builder assumedQuantity(Float assumedQuantity) {
                this.assumedQuantity = assumedQuantity;
                return this;
            }

            /**
             * <p>The module cost calculated based on assumedQuantity, which equals pricePerUnit × assumedQuantity. This cost is not included in totalAmount because it is based on the assumed usage reported by the caller and is not a cost necessarily incurred by this call.</p>
             */
            public Builder assumedQuantityCost(Float assumedQuantityCost) {
                this.assumedQuantityCost = assumedQuantityCost;
                return this;
            }

            /**
             * <p>The billing module code, such as TrafficOut or NatCu. This corresponds to the moduleCode in modules.</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The original unit price before discounts, in CNY/unit, which is also normalized. This field is empty when not provided by the upstream. The difference between this value and pricePerUnit is the unit price discount for this module.</p>
             */
            public Builder originalPricePerUnit(Float originalPricePerUnit) {
                this.originalPricePerUnit = originalPricePerUnit;
                return this;
            }

            /**
             * <p>The discounted unit price, in CNY/unit. The actual cost equals pricePerUnit × actual usage. Because the usage is unknown during pricing, it is not included in totalAmount. If the caller passed an estimated usage, the total returned by the upstream is normalized back to the unit price based on that usage.</p>
             */
            public Builder pricePerUnit(Float pricePerUnit) {
                this.pricePerUnit = pricePerUnit;
                return this;
            }

            /**
             * <p>The usage unit, such as GB, CU, or 10,000 requests. This comes from the module-level billing.unit annotation in the mapping. The dimension of pricePerUnit is CNY/unit.</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public UsageCharges build() {
                return new UsageCharges(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiPriceResponseBody</p>
     */
    public static class PriceSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chargeComposition")
        private String chargeComposition;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("effectiveModuleSum")
        private Float effectiveModuleSum;

        @com.aliyun.core.annotation.NameInMap("moduleSum")
        private Float moduleSum;

        @com.aliyun.core.annotation.NameInMap("modules")
        private java.util.List<Modules> modules;

        @com.aliyun.core.annotation.NameInMap("originalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("pricingUnit")
        private String pricingUnit;

        @com.aliyun.core.annotation.NameInMap("quantity")
        private Float quantity;

        @com.aliyun.core.annotation.NameInMap("tradePrice")
        private Float tradePrice;

        @com.aliyun.core.annotation.NameInMap("usageCharges")
        private java.util.List<UsageCharges> usageCharges;

        private PriceSummary(Builder builder) {
            this.chargeComposition = builder.chargeComposition;
            this.currency = builder.currency;
            this.effectiveModuleSum = builder.effectiveModuleSum;
            this.moduleSum = builder.moduleSum;
            this.modules = builder.modules;
            this.originalPrice = builder.originalPrice;
            this.pricingUnit = builder.pricingUnit;
            this.quantity = builder.quantity;
            this.tradePrice = builder.tradePrice;
            this.usageCharges = builder.usageCharges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceSummary create() {
            return builder().build();
        }

        /**
         * @return chargeComposition
         */
        public String getChargeComposition() {
            return this.chargeComposition;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return effectiveModuleSum
         */
        public Float getEffectiveModuleSum() {
            return this.effectiveModuleSum;
        }

        /**
         * @return moduleSum
         */
        public Float getModuleSum() {
            return this.moduleSum;
        }

        /**
         * @return modules
         */
        public java.util.List<Modules> getModules() {
            return this.modules;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return pricingUnit
         */
        public String getPricingUnit() {
            return this.pricingUnit;
        }

        /**
         * @return quantity
         */
        public Float getQuantity() {
            return this.quantity;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        /**
         * @return usageCharges
         */
        public java.util.List<UsageCharges> getUsageCharges() {
            return this.usageCharges;
        }

        public static final class Builder {
            private String chargeComposition; 
            private String currency; 
            private Float effectiveModuleSum; 
            private Float moduleSum; 
            private java.util.List<Modules> modules; 
            private Float originalPrice; 
            private String pricingUnit; 
            private Float quantity; 
            private Float tradePrice; 
            private java.util.List<UsageCharges> usageCharges; 

            private Builder() {
            } 

            private Builder(PriceSummary model) {
                this.chargeComposition = model.chargeComposition;
                this.currency = model.currency;
                this.effectiveModuleSum = model.effectiveModuleSum;
                this.moduleSum = model.moduleSum;
                this.modules = model.modules;
                this.originalPrice = model.originalPrice;
                this.pricingUnit = model.pricingUnit;
                this.quantity = model.quantity;
                this.tradePrice = model.tradePrice;
                this.usageCharges = model.usageCharges;
            } 

            /**
             * <p>The billing composition. Valid values: recurring_only (all time-based fees), usage_only (all usage-based fees, where a totalAmount of 0 indicates no fixed fees rather than free of charge, and actual costs depend on the unit price and actual usage in usageCharges), or mixed (both, which should be displayed separately). This allows the caller to choose the display text without iterating through modules to determine the composition.</p>
             */
            public Builder chargeComposition(String chargeComposition) {
                this.chargeComposition = chargeComposition;
                return this;
            }

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * effectiveModuleSum.
             */
            public Builder effectiveModuleSum(Float effectiveModuleSum) {
                this.effectiveModuleSum = effectiveModuleSum;
                return this;
            }

            /**
             * moduleSum.
             */
            public Builder moduleSum(Float moduleSum) {
                this.moduleSum = moduleSum;
                return this;
            }

            /**
             * modules.
             */
            public Builder modules(java.util.List<Modules> modules) {
                this.modules = modules;
                return this;
            }

            /**
             * <p>The total original price before discounts for this pricing inquiry. When originalPrice differs from tradePrice or moduleSum, it indicates that a discount was applied, such as a first-purchase discount or a promotional campaign.</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The billing cycle unit, such as \&quot;Hour\&quot;, \&quot;1 Month\&quot;, \&quot;12 Month\&quot;, or \&quot;GB·Month\&quot;, which indicates the time dimension of moduleSum. This field is not returned in the BSS response and must be explicitly declared by the mapping maintainer in pricingTarget.pricingUnit. It is optional for subscription scenarios because the CLI infers it from Period and PeriodUnit. However, it is required for pay-as-you-go scenarios in the mapping; otherwise, the amount has no dimension.</p>
             */
            public Builder pricingUnit(String pricingUnit) {
                this.pricingUnit = pricingUnit;
                return this;
            }

            /**
             * <p>The pricing quantity from OpenAPI input parameters, such as Amount in ECS RunInstances. The moduleSum is the unit price per instance, and effectiveModuleSum = moduleSum × quantity is the total price. The caller should present the actual total price for N instances to the user based on this value to avoid mistaking the unit price for the total price.</p>
             */
            public Builder quantity(Float quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * tradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            /**
             * <p>The list of unit prices for pay-as-you-go, usage-based modules, such as CNY/GB or CNY/CU. The amounts for these modules are not included in moduleSum or effectiveModuleSum. This field is empty when there are no usage-based modules.</p>
             */
            public Builder usageCharges(java.util.List<UsageCharges> usageCharges) {
                this.usageCharges = usageCharges;
                return this;
            }

            public PriceSummary build() {
                return new PriceSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiPriceResponseBody</p>
     */
    public static class PriceUsageCharges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assumedQuantity")
        private Float assumedQuantity;

        @com.aliyun.core.annotation.NameInMap("assumedQuantityCost")
        private Float assumedQuantityCost;

        @com.aliyun.core.annotation.NameInMap("moduleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("originalPricePerUnit")
        private Float originalPricePerUnit;

        @com.aliyun.core.annotation.NameInMap("pricePerUnit")
        private Float pricePerUnit;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private PriceUsageCharges(Builder builder) {
            this.assumedQuantity = builder.assumedQuantity;
            this.assumedQuantityCost = builder.assumedQuantityCost;
            this.moduleCode = builder.moduleCode;
            this.originalPricePerUnit = builder.originalPricePerUnit;
            this.pricePerUnit = builder.pricePerUnit;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceUsageCharges create() {
            return builder().build();
        }

        /**
         * @return assumedQuantity
         */
        public Float getAssumedQuantity() {
            return this.assumedQuantity;
        }

        /**
         * @return assumedQuantityCost
         */
        public Float getAssumedQuantityCost() {
            return this.assumedQuantityCost;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return originalPricePerUnit
         */
        public Float getOriginalPricePerUnit() {
            return this.originalPricePerUnit;
        }

        /**
         * @return pricePerUnit
         */
        public Float getPricePerUnit() {
            return this.pricePerUnit;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Float assumedQuantity; 
            private Float assumedQuantityCost; 
            private String moduleCode; 
            private Float originalPricePerUnit; 
            private Float pricePerUnit; 
            private String unit; 

            private Builder() {
            } 

            private Builder(PriceUsageCharges model) {
                this.assumedQuantity = model.assumedQuantity;
                this.assumedQuantityCost = model.assumedQuantityCost;
                this.moduleCode = model.moduleCode;
                this.originalPricePerUnit = model.originalPricePerUnit;
                this.pricePerUnit = model.pricePerUnit;
                this.unit = model.unit;
            } 

            /**
             * <p>The estimated usage passed by the caller through PricingContext. This field has a value only when it is greater than 1. In this case, this entry also provides the assumedQuantityCost calculated based on this assumed usage.</p>
             */
            public Builder assumedQuantity(Float assumedQuantity) {
                this.assumedQuantity = assumedQuantity;
                return this;
            }

            /**
             * <p>The module cost calculated based on assumedQuantity, which equals pricePerUnit × assumedQuantity. This cost is not included in totalAmount because it is based on the assumed usage reported by the caller and is not a cost necessarily incurred by this call.</p>
             */
            public Builder assumedQuantityCost(Float assumedQuantityCost) {
                this.assumedQuantityCost = assumedQuantityCost;
                return this;
            }

            /**
             * <p>The billing module code, such as TrafficOut or NatCu. This corresponds to the moduleCode in modules.</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The original unit price before discounts, in CNY/unit, which is also normalized. This field is empty when not provided by the upstream. The difference between this value and pricePerUnit is the unit price discount for this module.</p>
             */
            public Builder originalPricePerUnit(Float originalPricePerUnit) {
                this.originalPricePerUnit = originalPricePerUnit;
                return this;
            }

            /**
             * <p>The discounted unit price, in CNY/unit. The actual cost equals pricePerUnit × actual usage. Because the usage is unknown during pricing, it is not included in totalAmount. If the caller passed an estimated usage, the total returned by the upstream is normalized back to the unit price based on that usage.</p>
             */
            public Builder pricePerUnit(Float pricePerUnit) {
                this.pricePerUnit = pricePerUnit;
                return this;
            }

            /**
             * <p>The usage unit, such as GB, CU, or 10,000 requests. This comes from the module-level billing.unit annotation in the mapping. The dimension of pricePerUnit is CNY/unit.</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public PriceUsageCharges build() {
                return new PriceUsageCharges(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApiPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiPriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingUnit")
        private String billingUnit;

        @com.aliyun.core.annotation.NameInMap("calculatedAmount")
        private Float calculatedAmount;

        @com.aliyun.core.annotation.NameInMap("chargeComposition")
        private String chargeComposition;

        @com.aliyun.core.annotation.NameInMap("components")
        private java.util.Map<String, PriceComponentsValue> components;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("discountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("originalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("priceSummary")
        private PriceSummary priceSummary;

        @com.aliyun.core.annotation.NameInMap("pricingMode")
        private String pricingMode;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("totalAmount")
        private Float totalAmount;

        @com.aliyun.core.annotation.NameInMap("upstreamRequestId")
        private String upstreamRequestId;

        @com.aliyun.core.annotation.NameInMap("usageCharges")
        private java.util.List<PriceUsageCharges> usageCharges;

        private Price(Builder builder) {
            this.billingUnit = builder.billingUnit;
            this.calculatedAmount = builder.calculatedAmount;
            this.chargeComposition = builder.chargeComposition;
            this.components = builder.components;
            this.currency = builder.currency;
            this.discountAmount = builder.discountAmount;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.originalAmount = builder.originalAmount;
            this.priceSummary = builder.priceSummary;
            this.pricingMode = builder.pricingMode;
            this.success = builder.success;
            this.totalAmount = builder.totalAmount;
            this.upstreamRequestId = builder.upstreamRequestId;
            this.usageCharges = builder.usageCharges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Price create() {
            return builder().build();
        }

        /**
         * @return billingUnit
         */
        public String getBillingUnit() {
            return this.billingUnit;
        }

        /**
         * @return calculatedAmount
         */
        public Float getCalculatedAmount() {
            return this.calculatedAmount;
        }

        /**
         * @return chargeComposition
         */
        public String getChargeComposition() {
            return this.chargeComposition;
        }

        /**
         * @return components
         */
        public java.util.Map<String, PriceComponentsValue> getComponents() {
            return this.components;
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
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return priceSummary
         */
        public PriceSummary getPriceSummary() {
            return this.priceSummary;
        }

        /**
         * @return pricingMode
         */
        public String getPricingMode() {
            return this.pricingMode;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return totalAmount
         */
        public Float getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return upstreamRequestId
         */
        public String getUpstreamRequestId() {
            return this.upstreamRequestId;
        }

        /**
         * @return usageCharges
         */
        public java.util.List<PriceUsageCharges> getUsageCharges() {
            return this.usageCharges;
        }

        public static final class Builder {
            private String billingUnit; 
            private Float calculatedAmount; 
            private String chargeComposition; 
            private java.util.Map<String, PriceComponentsValue> components; 
            private String currency; 
            private Float discountAmount; 
            private String errorCode; 
            private String errorMessage; 
            private Float originalAmount; 
            private PriceSummary priceSummary; 
            private String pricingMode; 
            private Boolean success; 
            private Float totalAmount; 
            private String upstreamRequestId; 
            private java.util.List<PriceUsageCharges> usageCharges; 

            private Builder() {
            } 

            private Builder(Price model) {
                this.billingUnit = model.billingUnit;
                this.calculatedAmount = model.calculatedAmount;
                this.chargeComposition = model.chargeComposition;
                this.components = model.components;
                this.currency = model.currency;
                this.discountAmount = model.discountAmount;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.originalAmount = model.originalAmount;
                this.priceSummary = model.priceSummary;
                this.pricingMode = model.pricingMode;
                this.success = model.success;
                this.totalAmount = model.totalAmount;
                this.upstreamRequestId = model.upstreamRequestId;
                this.usageCharges = model.usageCharges;
            } 

            /**
             * <p>The common billing dimension for fixed fees, including totalAmount, originalAmount, and discountAmount. This is a canonical field, such as \&quot;Hour\&quot; or \&quot;1 Month\&quot;, derived from the pricingUnit declared in the mapping. It is empty if not declared. This field describes only the dimension for fixed fees. The pay-as-you-go billing method components each have their own unit (see usageCharges[].unit).</p>
             */
            public Builder billingUnit(String billingUnit) {
                this.billingUnit = billingUnit;
                return this;
            }

            /**
             * calculatedAmount.
             */
            public Builder calculatedAmount(Float calculatedAmount) {
                this.calculatedAmount = calculatedAmount;
                return this;
            }

            /**
             * <p>The billing composition. This is a canonical field. Valid values: recurring_only (all time-based fees), usage_only (all usage-based fees, where a totalAmount of 0 indicates no fixed fees rather than free of charge, and actual costs depend on the unit price and actual usage in usageCharges), or mixed (both, which should be displayed separately as \&quot;X CNY/hour + Y CNY/GB\&quot;). This allows the caller to choose the display text without iterating through modules to determine the composition.</p>
             */
            public Builder chargeComposition(String chargeComposition) {
                this.chargeComposition = chargeComposition;
                return this;
            }

            /**
             * <p>The details of each pricing call in composite or delta mode. The key is the priceCall ID, such as prepaid, postpaid, or a custom ID. This field is empty in single mode. The calculatedAmount is the aggregated result of each component based on the priceCalculation expression. The components field exposes the line items so that the caller can view the composition, such as instance fees versus storage fees.</p>
             */
            public Builder components(java.util.Map<String, PriceComponentsValue> components) {
                this.components = components;
                return this;
            }

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The total discount amount for fixed fees. This is a canonical field calculated as originalAmount - totalAmount. It includes only discounts for fixed fees and excludes the pay-as-you-go billing method. The value is 0 when there is no discount and empty when the original price is missing.</p>
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>The error code when upstream pricing fails, such as InvalidParameter or COMMODITY.INVALID_COMPONENT. This field is empty when success is true.</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error description when upstream pricing fails. This facilitates self-troubleshooting of specific parameter issues by the caller. This field is empty when success is true.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The total original price before discounts for fixed fees. This is a canonical field with the same scope as totalAmount. It includes only fixed fees and excludes the pay-as-you-go billing method. Refer to usageCharges[].originalPricePerUnit for the pre-discount unit price of the pay-as-you-go billing method. The difference between this value and totalAmount is the total discount for this inquiry. This field is empty when the upstream does not provide original price information.</p>
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * priceSummary.
             */
            public Builder priceSummary(PriceSummary priceSummary) {
                this.priceSummary = priceSummary;
                return this;
            }

            /**
             * pricingMode.
             */
            public Builder pricingMode(String pricingMode) {
                this.pricingMode = pricingMode;
                return this;
            }

            /**
             * <p>Indicates whether a valid pricing result is obtained. The value is true for normal pricing and when no pricing inquiry is required, and false when pricing is not supported or the pricing inquiry fails.</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The periodic payable amount for fixed fees in this pricing inquiry (canonical field). For the unit of measurement, see billingUnit. <strong>This field includes only fixed fees</strong>. Usage-based charges (such as traffic in CNY/GB or CUs in CNY/CU) have different units of measurement and cannot be added to this field. For the unit prices of usage-based charges, see usageCharges. To check whether both types of charges exist, see chargeComposition. In single mode, this value is derived from priceSummary.effectiveModuleSum (falling back to tradePrice if missing). In composite or delta mode, this value is derived from calculatedAmount. This field always has a value when success is true.</p>
             */
            public Builder totalAmount(Float totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * <p>The request ID of the upstream pricing API (such as the RequestId of BSS GetSubscriptionPrice). This field is populated regardless of whether the request succeeds or fails, and is used for audit reconciliation and upstream log tracing.</p>
             */
            public Builder upstreamRequestId(String upstreamRequestId) {
                this.upstreamRequestId = upstreamRequestId;
                return this;
            }

            /**
             * <p>The list of unit prices for usage-based billing modules (canonical field). Modules billed by actual usage, such as traffic and NAT CUs, have different units of measurement (such as CNY/GB or CNY/CU) from billingUnit and are not included in totalAmount. This field provides the unit price for each item. In single mode, the values are derived from priceSummary. In composite or delta mode, the values are concatenated from each component in the order of priceCall. This field is empty when the mapping contains no usage-based modules.</p>
             */
            public Builder usageCharges(java.util.List<PriceUsageCharges> usageCharges) {
                this.usageCharges = usageCharges;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
}
