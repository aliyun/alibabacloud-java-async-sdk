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
    @com.aliyun.core.annotation.NameInMap("price")
    private Price price;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetApiPriceResponseBody(Builder builder) {
        this.price = builder.price;
        this.requestId = builder.requestId;
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

    public static final class Builder {
        private Price price; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApiPriceResponseBody model) {
            this.price = model.price;
            this.requestId = model.requestId;
        } 

        /**
         * price.
         */
        public Builder price(Price price) {
            this.price = price;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
             * billingMode.
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
             * invoiceDiscount.
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
             * quantityUsedForQuote.
             */
            public Builder quantityUsedForQuote(Float quantityUsedForQuote) {
                this.quantityUsedForQuote = quantityUsedForQuote;
                return this;
            }

            /**
             * unitPrice.
             */
            public Builder unitPrice(Float unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            /**
             * usageUnit.
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
             * assumedQuantity.
             */
            public Builder assumedQuantity(Float assumedQuantity) {
                this.assumedQuantity = assumedQuantity;
                return this;
            }

            /**
             * assumedQuantityCost.
             */
            public Builder assumedQuantityCost(Float assumedQuantityCost) {
                this.assumedQuantityCost = assumedQuantityCost;
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
             * originalPricePerUnit.
             */
            public Builder originalPricePerUnit(Float originalPricePerUnit) {
                this.originalPricePerUnit = originalPricePerUnit;
                return this;
            }

            /**
             * pricePerUnit.
             */
            public Builder pricePerUnit(Float pricePerUnit) {
                this.pricePerUnit = pricePerUnit;
                return this;
            }

            /**
             * unit.
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
             * chargeComposition.
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
             * originalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * pricingUnit.
             */
            public Builder pricingUnit(String pricingUnit) {
                this.pricingUnit = pricingUnit;
                return this;
            }

            /**
             * quantity.
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
             * usageCharges.
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
             * assumedQuantity.
             */
            public Builder assumedQuantity(Float assumedQuantity) {
                this.assumedQuantity = assumedQuantity;
                return this;
            }

            /**
             * assumedQuantityCost.
             */
            public Builder assumedQuantityCost(Float assumedQuantityCost) {
                this.assumedQuantityCost = assumedQuantityCost;
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
             * originalPricePerUnit.
             */
            public Builder originalPricePerUnit(Float originalPricePerUnit) {
                this.originalPricePerUnit = originalPricePerUnit;
                return this;
            }

            /**
             * pricePerUnit.
             */
            public Builder pricePerUnit(Float pricePerUnit) {
                this.pricePerUnit = pricePerUnit;
                return this;
            }

            /**
             * unit.
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
             * billingUnit.
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
             * chargeComposition.
             */
            public Builder chargeComposition(String chargeComposition) {
                this.chargeComposition = chargeComposition;
                return this;
            }

            /**
             * components.
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
             * discountAmount.
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * originalAmount.
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
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * totalAmount.
             */
            public Builder totalAmount(Float totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * upstreamRequestId.
             */
            public Builder upstreamRequestId(String upstreamRequestId) {
                this.upstreamRequestId = upstreamRequestId;
                return this;
            }

            /**
             * usageCharges.
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
