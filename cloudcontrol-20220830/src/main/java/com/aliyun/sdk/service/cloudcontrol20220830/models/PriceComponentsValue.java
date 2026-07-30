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
 * {@link PriceComponentsValue} extends {@link TeaModel}
 *
 * <p>PriceComponentsValue</p>
 */
public class PriceComponentsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("tradePrice")
    private Float tradePrice;

    @com.aliyun.core.annotation.NameInMap("originalPrice")
    private Float originalPrice;

    @com.aliyun.core.annotation.NameInMap("moduleSum")
    private Float moduleSum;

    @com.aliyun.core.annotation.NameInMap("effectiveModuleSum")
    private Float effectiveModuleSum;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Float quantity;

    @com.aliyun.core.annotation.NameInMap("pricingUnit")
    private String pricingUnit;

    @com.aliyun.core.annotation.NameInMap("modules")
    private java.util.List<Modules> modules;

    @com.aliyun.core.annotation.NameInMap("usageCharges")
    private java.util.List<UsageCharges> usageCharges;

    @com.aliyun.core.annotation.NameInMap("chargeComposition")
    private String chargeComposition;

    private PriceComponentsValue(Builder builder) {
        this.currency = builder.currency;
        this.tradePrice = builder.tradePrice;
        this.originalPrice = builder.originalPrice;
        this.moduleSum = builder.moduleSum;
        this.effectiveModuleSum = builder.effectiveModuleSum;
        this.quantity = builder.quantity;
        this.pricingUnit = builder.pricingUnit;
        this.modules = builder.modules;
        this.usageCharges = builder.usageCharges;
        this.chargeComposition = builder.chargeComposition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PriceComponentsValue create() {
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
     * @return tradePrice
     */
    public Float getTradePrice() {
        return this.tradePrice;
    }

    /**
     * @return originalPrice
     */
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * @return moduleSum
     */
    public Float getModuleSum() {
        return this.moduleSum;
    }

    /**
     * @return effectiveModuleSum
     */
    public Float getEffectiveModuleSum() {
        return this.effectiveModuleSum;
    }

    /**
     * @return quantity
     */
    public Float getQuantity() {
        return this.quantity;
    }

    /**
     * @return pricingUnit
     */
    public String getPricingUnit() {
        return this.pricingUnit;
    }

    /**
     * @return modules
     */
    public java.util.List<Modules> getModules() {
        return this.modules;
    }

    /**
     * @return usageCharges
     */
    public java.util.List<UsageCharges> getUsageCharges() {
        return this.usageCharges;
    }

    /**
     * @return chargeComposition
     */
    public String getChargeComposition() {
        return this.chargeComposition;
    }

    public static final class Builder {
        private String currency; 
        private Float tradePrice; 
        private Float originalPrice; 
        private Float moduleSum; 
        private Float effectiveModuleSum; 
        private Float quantity; 
        private String pricingUnit; 
        private java.util.List<Modules> modules; 
        private java.util.List<UsageCharges> usageCharges; 
        private String chargeComposition; 

        private Builder() {
        } 

        private Builder(PriceComponentsValue model) {
            this.currency = model.currency;
            this.tradePrice = model.tradePrice;
            this.originalPrice = model.originalPrice;
            this.moduleSum = model.moduleSum;
            this.effectiveModuleSum = model.effectiveModuleSum;
            this.quantity = model.quantity;
            this.pricingUnit = model.pricingUnit;
            this.modules = model.modules;
            this.usageCharges = model.usageCharges;
            this.chargeComposition = model.chargeComposition;
        } 

        /**
         * currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
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
         * originalPrice.
         */
        public Builder originalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
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
         * effectiveModuleSum.
         */
        public Builder effectiveModuleSum(Float effectiveModuleSum) {
            this.effectiveModuleSum = effectiveModuleSum;
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
         * pricingUnit.
         */
        public Builder pricingUnit(String pricingUnit) {
            this.pricingUnit = pricingUnit;
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
         * usageCharges.
         */
        public Builder usageCharges(java.util.List<UsageCharges> usageCharges) {
            this.usageCharges = usageCharges;
            return this;
        }

        /**
         * chargeComposition.
         */
        public Builder chargeComposition(String chargeComposition) {
            this.chargeComposition = chargeComposition;
            return this;
        }

        public PriceComponentsValue build() {
            return new PriceComponentsValue(this);
        } 

    } 

    /**
     * 
     * {@link PriceComponentsValue} extends {@link TeaModel}
     *
     * <p>PriceComponentsValue</p>
     */
    public static class Modules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("moduleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("costAfterDiscount")
        private Float costAfterDiscount;

        @com.aliyun.core.annotation.NameInMap("originalCost")
        private Float originalCost;

        @com.aliyun.core.annotation.NameInMap("invoiceDiscount")
        private Float invoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("unitPrice")
        private Float unitPrice;

        @com.aliyun.core.annotation.NameInMap("billingMode")
        private String billingMode;

        @com.aliyun.core.annotation.NameInMap("usageUnit")
        private String usageUnit;

        @com.aliyun.core.annotation.NameInMap("quantityUsedForQuote")
        private Float quantityUsedForQuote;

        private Modules(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.costAfterDiscount = builder.costAfterDiscount;
            this.originalCost = builder.originalCost;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.unitPrice = builder.unitPrice;
            this.billingMode = builder.billingMode;
            this.usageUnit = builder.usageUnit;
            this.quantityUsedForQuote = builder.quantityUsedForQuote;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modules create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return costAfterDiscount
         */
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        /**
         * @return originalCost
         */
        public Float getOriginalCost() {
            return this.originalCost;
        }

        /**
         * @return invoiceDiscount
         */
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        /**
         * @return unitPrice
         */
        public Float getUnitPrice() {
            return this.unitPrice;
        }

        /**
         * @return billingMode
         */
        public String getBillingMode() {
            return this.billingMode;
        }

        /**
         * @return usageUnit
         */
        public String getUsageUnit() {
            return this.usageUnit;
        }

        /**
         * @return quantityUsedForQuote
         */
        public Float getQuantityUsedForQuote() {
            return this.quantityUsedForQuote;
        }

        public static final class Builder {
            private String moduleCode; 
            private Float costAfterDiscount; 
            private Float originalCost; 
            private Float invoiceDiscount; 
            private Float unitPrice; 
            private String billingMode; 
            private String usageUnit; 
            private Float quantityUsedForQuote; 

            private Builder() {
            } 

            private Builder(Modules model) {
                this.moduleCode = model.moduleCode;
                this.costAfterDiscount = model.costAfterDiscount;
                this.originalCost = model.originalCost;
                this.invoiceDiscount = model.invoiceDiscount;
                this.unitPrice = model.unitPrice;
                this.billingMode = model.billingMode;
                this.usageUnit = model.usageUnit;
                this.quantityUsedForQuote = model.quantityUsedForQuote;
            } 

            /**
             * moduleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
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
             * originalCost.
             */
            public Builder originalCost(Float originalCost) {
                this.originalCost = originalCost;
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
             * unitPrice.
             */
            public Builder unitPrice(Float unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            /**
             * billingMode.
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * usageUnit.
             */
            public Builder usageUnit(String usageUnit) {
                this.usageUnit = usageUnit;
                return this;
            }

            /**
             * quantityUsedForQuote.
             */
            public Builder quantityUsedForQuote(Float quantityUsedForQuote) {
                this.quantityUsedForQuote = quantityUsedForQuote;
                return this;
            }

            public Modules build() {
                return new Modules(this);
            } 

        } 

    }
    /**
     * 
     * {@link PriceComponentsValue} extends {@link TeaModel}
     *
     * <p>PriceComponentsValue</p>
     */
    public static class UsageCharges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("moduleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("pricePerUnit")
        private Float pricePerUnit;

        @com.aliyun.core.annotation.NameInMap("originalPricePerUnit")
        private Float originalPricePerUnit;

        @com.aliyun.core.annotation.NameInMap("assumedQuantity")
        private Float assumedQuantity;

        @com.aliyun.core.annotation.NameInMap("assumedQuantityCost")
        private Float assumedQuantityCost;

        private UsageCharges(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.unit = builder.unit;
            this.pricePerUnit = builder.pricePerUnit;
            this.originalPricePerUnit = builder.originalPricePerUnit;
            this.assumedQuantity = builder.assumedQuantity;
            this.assumedQuantityCost = builder.assumedQuantityCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageCharges create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return pricePerUnit
         */
        public Float getPricePerUnit() {
            return this.pricePerUnit;
        }

        /**
         * @return originalPricePerUnit
         */
        public Float getOriginalPricePerUnit() {
            return this.originalPricePerUnit;
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

        public static final class Builder {
            private String moduleCode; 
            private String unit; 
            private Float pricePerUnit; 
            private Float originalPricePerUnit; 
            private Float assumedQuantity; 
            private Float assumedQuantityCost; 

            private Builder() {
            } 

            private Builder(UsageCharges model) {
                this.moduleCode = model.moduleCode;
                this.unit = model.unit;
                this.pricePerUnit = model.pricePerUnit;
                this.originalPricePerUnit = model.originalPricePerUnit;
                this.assumedQuantity = model.assumedQuantity;
                this.assumedQuantityCost = model.assumedQuantityCost;
            } 

            /**
             * moduleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
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
             * originalPricePerUnit.
             */
            public Builder originalPricePerUnit(Float originalPricePerUnit) {
                this.originalPricePerUnit = originalPricePerUnit;
                return this;
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

            public UsageCharges build() {
                return new UsageCharges(this);
            } 

        } 

    }
}
