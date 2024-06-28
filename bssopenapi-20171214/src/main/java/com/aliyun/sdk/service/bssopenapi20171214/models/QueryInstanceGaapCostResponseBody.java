// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceGaapCostResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInstanceGaapCostResponseBody</p>
 */
public class QueryInstanceGaapCostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryInstanceGaapCostResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceGaapCostResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryInstanceGaapCostResponseBody build() {
            return new QueryInstanceGaapCostResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountingUnit")
        private String accountingUnit;

        @com.aliyun.core.annotation.NameInMap("BillType")
        private String billType;

        @com.aliyun.core.annotation.NameInMap("BillingCycle")
        private String billingCycle;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DeductedByCashCoupons")
        private String deductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("DeductedByCoupons")
        private String deductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("DeductedByPrepaidCard")
        private String deductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("GaapDeductedByCashCoupons")
        private String gaapDeductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("GaapDeductedByCoupons")
        private String gaapDeductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("GaapDeductedByPrepaidCard")
        private String gaapDeductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("GaapPaymentAmount")
        private String gaapPaymentAmount;

        @com.aliyun.core.annotation.NameInMap("GaapPretaxAmount")
        private String gaapPretaxAmount;

        @com.aliyun.core.annotation.NameInMap("GaapPretaxAmountLocal")
        private String gaapPretaxAmountLocal;

        @com.aliyun.core.annotation.NameInMap("GaapPretaxGrossAmount")
        private String gaapPretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("GaapPricingDiscount")
        private String gaapPricingDiscount;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("MonthGaapDeductedByCashCoupons")
        private String monthGaapDeductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("MonthGaapDeductedByCoupons")
        private String monthGaapDeductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("MonthGaapDeductedByPrepaidCard")
        private String monthGaapDeductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("MonthGaapPaymentAmount")
        private String monthGaapPaymentAmount;

        @com.aliyun.core.annotation.NameInMap("MonthGaapPretaxAmount")
        private String monthGaapPretaxAmount;

        @com.aliyun.core.annotation.NameInMap("MonthGaapPretaxAmountLocal")
        private String monthGaapPretaxAmountLocal;

        @com.aliyun.core.annotation.NameInMap("MonthGaapPretaxGrossAmount")
        private String monthGaapPretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("MonthGaapPricingDiscount")
        private String monthGaapPricingDiscount;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("OwnerID")
        private String ownerID;

        @com.aliyun.core.annotation.NameInMap("PayTime")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("PayerAccount")
        private String payerAccount;

        @com.aliyun.core.annotation.NameInMap("PaymentAmount")
        private String paymentAmount;

        @com.aliyun.core.annotation.NameInMap("PaymentCurrency")
        private String paymentCurrency;

        @com.aliyun.core.annotation.NameInMap("PretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("PretaxAmountLocal")
        private String pretaxAmountLocal;

        @com.aliyun.core.annotation.NameInMap("PretaxGrossAmount")
        private String pretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("PricingDiscount")
        private String pricingDiscount;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("SubOrderId")
        private String subOrderId;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("UnallocatedDeductedByCashCoupons")
        private String unallocatedDeductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("UnallocatedDeductedByCoupons")
        private String unallocatedDeductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("UnallocatedDeductedByPrepaidCard")
        private String unallocatedDeductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("UnallocatedPaymentAmount")
        private String unallocatedPaymentAmount;

        @com.aliyun.core.annotation.NameInMap("UnallocatedPretaxAmount")
        private String unallocatedPretaxAmount;

        @com.aliyun.core.annotation.NameInMap("UnallocatedPretaxAmountLocal")
        private String unallocatedPretaxAmountLocal;

        @com.aliyun.core.annotation.NameInMap("UnallocatedPretaxGrossAmount")
        private String unallocatedPretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("UnallocatedPricingDiscount")
        private String unallocatedPricingDiscount;

        @com.aliyun.core.annotation.NameInMap("UsageEndDate")
        private String usageEndDate;

        @com.aliyun.core.annotation.NameInMap("UsageStartDate")
        private String usageStartDate;

        private Module(Builder builder) {
            this.accountingUnit = builder.accountingUnit;
            this.billType = builder.billType;
            this.billingCycle = builder.billingCycle;
            this.currency = builder.currency;
            this.deductedByCashCoupons = builder.deductedByCashCoupons;
            this.deductedByCoupons = builder.deductedByCoupons;
            this.deductedByPrepaidCard = builder.deductedByPrepaidCard;
            this.gaapDeductedByCashCoupons = builder.gaapDeductedByCashCoupons;
            this.gaapDeductedByCoupons = builder.gaapDeductedByCoupons;
            this.gaapDeductedByPrepaidCard = builder.gaapDeductedByPrepaidCard;
            this.gaapPaymentAmount = builder.gaapPaymentAmount;
            this.gaapPretaxAmount = builder.gaapPretaxAmount;
            this.gaapPretaxAmountLocal = builder.gaapPretaxAmountLocal;
            this.gaapPretaxGrossAmount = builder.gaapPretaxGrossAmount;
            this.gaapPricingDiscount = builder.gaapPricingDiscount;
            this.instanceID = builder.instanceID;
            this.monthGaapDeductedByCashCoupons = builder.monthGaapDeductedByCashCoupons;
            this.monthGaapDeductedByCoupons = builder.monthGaapDeductedByCoupons;
            this.monthGaapDeductedByPrepaidCard = builder.monthGaapDeductedByPrepaidCard;
            this.monthGaapPaymentAmount = builder.monthGaapPaymentAmount;
            this.monthGaapPretaxAmount = builder.monthGaapPretaxAmount;
            this.monthGaapPretaxAmountLocal = builder.monthGaapPretaxAmountLocal;
            this.monthGaapPretaxGrossAmount = builder.monthGaapPretaxGrossAmount;
            this.monthGaapPricingDiscount = builder.monthGaapPricingDiscount;
            this.orderId = builder.orderId;
            this.orderType = builder.orderType;
            this.ownerID = builder.ownerID;
            this.payTime = builder.payTime;
            this.payerAccount = builder.payerAccount;
            this.paymentAmount = builder.paymentAmount;
            this.paymentCurrency = builder.paymentCurrency;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxAmountLocal = builder.pretaxAmountLocal;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.pricingDiscount = builder.pricingDiscount;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
            this.region = builder.region;
            this.resourceGroup = builder.resourceGroup;
            this.subOrderId = builder.subOrderId;
            this.subscriptionType = builder.subscriptionType;
            this.tag = builder.tag;
            this.unallocatedDeductedByCashCoupons = builder.unallocatedDeductedByCashCoupons;
            this.unallocatedDeductedByCoupons = builder.unallocatedDeductedByCoupons;
            this.unallocatedDeductedByPrepaidCard = builder.unallocatedDeductedByPrepaidCard;
            this.unallocatedPaymentAmount = builder.unallocatedPaymentAmount;
            this.unallocatedPretaxAmount = builder.unallocatedPretaxAmount;
            this.unallocatedPretaxAmountLocal = builder.unallocatedPretaxAmountLocal;
            this.unallocatedPretaxGrossAmount = builder.unallocatedPretaxGrossAmount;
            this.unallocatedPricingDiscount = builder.unallocatedPricingDiscount;
            this.usageEndDate = builder.usageEndDate;
            this.usageStartDate = builder.usageStartDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return accountingUnit
         */
        public String getAccountingUnit() {
            return this.accountingUnit;
        }

        /**
         * @return billType
         */
        public String getBillType() {
            return this.billType;
        }

        /**
         * @return billingCycle
         */
        public String getBillingCycle() {
            return this.billingCycle;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return deductedByCashCoupons
         */
        public String getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        /**
         * @return deductedByCoupons
         */
        public String getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        /**
         * @return deductedByPrepaidCard
         */
        public String getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        /**
         * @return gaapDeductedByCashCoupons
         */
        public String getGaapDeductedByCashCoupons() {
            return this.gaapDeductedByCashCoupons;
        }

        /**
         * @return gaapDeductedByCoupons
         */
        public String getGaapDeductedByCoupons() {
            return this.gaapDeductedByCoupons;
        }

        /**
         * @return gaapDeductedByPrepaidCard
         */
        public String getGaapDeductedByPrepaidCard() {
            return this.gaapDeductedByPrepaidCard;
        }

        /**
         * @return gaapPaymentAmount
         */
        public String getGaapPaymentAmount() {
            return this.gaapPaymentAmount;
        }

        /**
         * @return gaapPretaxAmount
         */
        public String getGaapPretaxAmount() {
            return this.gaapPretaxAmount;
        }

        /**
         * @return gaapPretaxAmountLocal
         */
        public String getGaapPretaxAmountLocal() {
            return this.gaapPretaxAmountLocal;
        }

        /**
         * @return gaapPretaxGrossAmount
         */
        public String getGaapPretaxGrossAmount() {
            return this.gaapPretaxGrossAmount;
        }

        /**
         * @return gaapPricingDiscount
         */
        public String getGaapPricingDiscount() {
            return this.gaapPricingDiscount;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return monthGaapDeductedByCashCoupons
         */
        public String getMonthGaapDeductedByCashCoupons() {
            return this.monthGaapDeductedByCashCoupons;
        }

        /**
         * @return monthGaapDeductedByCoupons
         */
        public String getMonthGaapDeductedByCoupons() {
            return this.monthGaapDeductedByCoupons;
        }

        /**
         * @return monthGaapDeductedByPrepaidCard
         */
        public String getMonthGaapDeductedByPrepaidCard() {
            return this.monthGaapDeductedByPrepaidCard;
        }

        /**
         * @return monthGaapPaymentAmount
         */
        public String getMonthGaapPaymentAmount() {
            return this.monthGaapPaymentAmount;
        }

        /**
         * @return monthGaapPretaxAmount
         */
        public String getMonthGaapPretaxAmount() {
            return this.monthGaapPretaxAmount;
        }

        /**
         * @return monthGaapPretaxAmountLocal
         */
        public String getMonthGaapPretaxAmountLocal() {
            return this.monthGaapPretaxAmountLocal;
        }

        /**
         * @return monthGaapPretaxGrossAmount
         */
        public String getMonthGaapPretaxGrossAmount() {
            return this.monthGaapPretaxGrossAmount;
        }

        /**
         * @return monthGaapPricingDiscount
         */
        public String getMonthGaapPricingDiscount() {
            return this.monthGaapPricingDiscount;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return ownerID
         */
        public String getOwnerID() {
            return this.ownerID;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return payerAccount
         */
        public String getPayerAccount() {
            return this.payerAccount;
        }

        /**
         * @return paymentAmount
         */
        public String getPaymentAmount() {
            return this.paymentAmount;
        }

        /**
         * @return paymentCurrency
         */
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return pretaxAmountLocal
         */
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        /**
         * @return pretaxGrossAmount
         */
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        /**
         * @return pricingDiscount
         */
        public String getPricingDiscount() {
            return this.pricingDiscount;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return subOrderId
         */
        public String getSubOrderId() {
            return this.subOrderId;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return unallocatedDeductedByCashCoupons
         */
        public String getUnallocatedDeductedByCashCoupons() {
            return this.unallocatedDeductedByCashCoupons;
        }

        /**
         * @return unallocatedDeductedByCoupons
         */
        public String getUnallocatedDeductedByCoupons() {
            return this.unallocatedDeductedByCoupons;
        }

        /**
         * @return unallocatedDeductedByPrepaidCard
         */
        public String getUnallocatedDeductedByPrepaidCard() {
            return this.unallocatedDeductedByPrepaidCard;
        }

        /**
         * @return unallocatedPaymentAmount
         */
        public String getUnallocatedPaymentAmount() {
            return this.unallocatedPaymentAmount;
        }

        /**
         * @return unallocatedPretaxAmount
         */
        public String getUnallocatedPretaxAmount() {
            return this.unallocatedPretaxAmount;
        }

        /**
         * @return unallocatedPretaxAmountLocal
         */
        public String getUnallocatedPretaxAmountLocal() {
            return this.unallocatedPretaxAmountLocal;
        }

        /**
         * @return unallocatedPretaxGrossAmount
         */
        public String getUnallocatedPretaxGrossAmount() {
            return this.unallocatedPretaxGrossAmount;
        }

        /**
         * @return unallocatedPricingDiscount
         */
        public String getUnallocatedPricingDiscount() {
            return this.unallocatedPricingDiscount;
        }

        /**
         * @return usageEndDate
         */
        public String getUsageEndDate() {
            return this.usageEndDate;
        }

        /**
         * @return usageStartDate
         */
        public String getUsageStartDate() {
            return this.usageStartDate;
        }

        public static final class Builder {
            private String accountingUnit; 
            private String billType; 
            private String billingCycle; 
            private String currency; 
            private String deductedByCashCoupons; 
            private String deductedByCoupons; 
            private String deductedByPrepaidCard; 
            private String gaapDeductedByCashCoupons; 
            private String gaapDeductedByCoupons; 
            private String gaapDeductedByPrepaidCard; 
            private String gaapPaymentAmount; 
            private String gaapPretaxAmount; 
            private String gaapPretaxAmountLocal; 
            private String gaapPretaxGrossAmount; 
            private String gaapPricingDiscount; 
            private String instanceID; 
            private String monthGaapDeductedByCashCoupons; 
            private String monthGaapDeductedByCoupons; 
            private String monthGaapDeductedByPrepaidCard; 
            private String monthGaapPaymentAmount; 
            private String monthGaapPretaxAmount; 
            private String monthGaapPretaxAmountLocal; 
            private String monthGaapPretaxGrossAmount; 
            private String monthGaapPricingDiscount; 
            private String orderId; 
            private String orderType; 
            private String ownerID; 
            private String payTime; 
            private String payerAccount; 
            private String paymentAmount; 
            private String paymentCurrency; 
            private String pretaxAmount; 
            private String pretaxAmountLocal; 
            private String pretaxGrossAmount; 
            private String pricingDiscount; 
            private String productCode; 
            private String productType; 
            private String region; 
            private String resourceGroup; 
            private String subOrderId; 
            private String subscriptionType; 
            private String tag; 
            private String unallocatedDeductedByCashCoupons; 
            private String unallocatedDeductedByCoupons; 
            private String unallocatedDeductedByPrepaidCard; 
            private String unallocatedPaymentAmount; 
            private String unallocatedPretaxAmount; 
            private String unallocatedPretaxAmountLocal; 
            private String unallocatedPretaxGrossAmount; 
            private String unallocatedPricingDiscount; 
            private String usageEndDate; 
            private String usageStartDate; 

            /**
             * AccountingUnit.
             */
            public Builder accountingUnit(String accountingUnit) {
                this.accountingUnit = accountingUnit;
                return this;
            }

            /**
             * BillType.
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * BillingCycle.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DeductedByCashCoupons.
             */
            public Builder deductedByCashCoupons(String deductedByCashCoupons) {
                this.deductedByCashCoupons = deductedByCashCoupons;
                return this;
            }

            /**
             * DeductedByCoupons.
             */
            public Builder deductedByCoupons(String deductedByCoupons) {
                this.deductedByCoupons = deductedByCoupons;
                return this;
            }

            /**
             * DeductedByPrepaidCard.
             */
            public Builder deductedByPrepaidCard(String deductedByPrepaidCard) {
                this.deductedByPrepaidCard = deductedByPrepaidCard;
                return this;
            }

            /**
             * GaapDeductedByCashCoupons.
             */
            public Builder gaapDeductedByCashCoupons(String gaapDeductedByCashCoupons) {
                this.gaapDeductedByCashCoupons = gaapDeductedByCashCoupons;
                return this;
            }

            /**
             * GaapDeductedByCoupons.
             */
            public Builder gaapDeductedByCoupons(String gaapDeductedByCoupons) {
                this.gaapDeductedByCoupons = gaapDeductedByCoupons;
                return this;
            }

            /**
             * GaapDeductedByPrepaidCard.
             */
            public Builder gaapDeductedByPrepaidCard(String gaapDeductedByPrepaidCard) {
                this.gaapDeductedByPrepaidCard = gaapDeductedByPrepaidCard;
                return this;
            }

            /**
             * GaapPaymentAmount.
             */
            public Builder gaapPaymentAmount(String gaapPaymentAmount) {
                this.gaapPaymentAmount = gaapPaymentAmount;
                return this;
            }

            /**
             * GaapPretaxAmount.
             */
            public Builder gaapPretaxAmount(String gaapPretaxAmount) {
                this.gaapPretaxAmount = gaapPretaxAmount;
                return this;
            }

            /**
             * GaapPretaxAmountLocal.
             */
            public Builder gaapPretaxAmountLocal(String gaapPretaxAmountLocal) {
                this.gaapPretaxAmountLocal = gaapPretaxAmountLocal;
                return this;
            }

            /**
             * GaapPretaxGrossAmount.
             */
            public Builder gaapPretaxGrossAmount(String gaapPretaxGrossAmount) {
                this.gaapPretaxGrossAmount = gaapPretaxGrossAmount;
                return this;
            }

            /**
             * GaapPricingDiscount.
             */
            public Builder gaapPricingDiscount(String gaapPricingDiscount) {
                this.gaapPricingDiscount = gaapPricingDiscount;
                return this;
            }

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * MonthGaapDeductedByCashCoupons.
             */
            public Builder monthGaapDeductedByCashCoupons(String monthGaapDeductedByCashCoupons) {
                this.monthGaapDeductedByCashCoupons = monthGaapDeductedByCashCoupons;
                return this;
            }

            /**
             * MonthGaapDeductedByCoupons.
             */
            public Builder monthGaapDeductedByCoupons(String monthGaapDeductedByCoupons) {
                this.monthGaapDeductedByCoupons = monthGaapDeductedByCoupons;
                return this;
            }

            /**
             * MonthGaapDeductedByPrepaidCard.
             */
            public Builder monthGaapDeductedByPrepaidCard(String monthGaapDeductedByPrepaidCard) {
                this.monthGaapDeductedByPrepaidCard = monthGaapDeductedByPrepaidCard;
                return this;
            }

            /**
             * MonthGaapPaymentAmount.
             */
            public Builder monthGaapPaymentAmount(String monthGaapPaymentAmount) {
                this.monthGaapPaymentAmount = monthGaapPaymentAmount;
                return this;
            }

            /**
             * MonthGaapPretaxAmount.
             */
            public Builder monthGaapPretaxAmount(String monthGaapPretaxAmount) {
                this.monthGaapPretaxAmount = monthGaapPretaxAmount;
                return this;
            }

            /**
             * MonthGaapPretaxAmountLocal.
             */
            public Builder monthGaapPretaxAmountLocal(String monthGaapPretaxAmountLocal) {
                this.monthGaapPretaxAmountLocal = monthGaapPretaxAmountLocal;
                return this;
            }

            /**
             * MonthGaapPretaxGrossAmount.
             */
            public Builder monthGaapPretaxGrossAmount(String monthGaapPretaxGrossAmount) {
                this.monthGaapPretaxGrossAmount = monthGaapPretaxGrossAmount;
                return this;
            }

            /**
             * MonthGaapPricingDiscount.
             */
            public Builder monthGaapPricingDiscount(String monthGaapPricingDiscount) {
                this.monthGaapPricingDiscount = monthGaapPricingDiscount;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * OwnerID.
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * PayTime.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * PayerAccount.
             */
            public Builder payerAccount(String payerAccount) {
                this.payerAccount = payerAccount;
                return this;
            }

            /**
             * PaymentAmount.
             */
            public Builder paymentAmount(String paymentAmount) {
                this.paymentAmount = paymentAmount;
                return this;
            }

            /**
             * PaymentCurrency.
             */
            public Builder paymentCurrency(String paymentCurrency) {
                this.paymentCurrency = paymentCurrency;
                return this;
            }

            /**
             * PretaxAmount.
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * PretaxAmountLocal.
             */
            public Builder pretaxAmountLocal(String pretaxAmountLocal) {
                this.pretaxAmountLocal = pretaxAmountLocal;
                return this;
            }

            /**
             * PretaxGrossAmount.
             */
            public Builder pretaxGrossAmount(String pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * PricingDiscount.
             */
            public Builder pricingDiscount(String pricingDiscount) {
                this.pricingDiscount = pricingDiscount;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * SubOrderId.
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * SubscriptionType.
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * UnallocatedDeductedByCashCoupons.
             */
            public Builder unallocatedDeductedByCashCoupons(String unallocatedDeductedByCashCoupons) {
                this.unallocatedDeductedByCashCoupons = unallocatedDeductedByCashCoupons;
                return this;
            }

            /**
             * UnallocatedDeductedByCoupons.
             */
            public Builder unallocatedDeductedByCoupons(String unallocatedDeductedByCoupons) {
                this.unallocatedDeductedByCoupons = unallocatedDeductedByCoupons;
                return this;
            }

            /**
             * UnallocatedDeductedByPrepaidCard.
             */
            public Builder unallocatedDeductedByPrepaidCard(String unallocatedDeductedByPrepaidCard) {
                this.unallocatedDeductedByPrepaidCard = unallocatedDeductedByPrepaidCard;
                return this;
            }

            /**
             * UnallocatedPaymentAmount.
             */
            public Builder unallocatedPaymentAmount(String unallocatedPaymentAmount) {
                this.unallocatedPaymentAmount = unallocatedPaymentAmount;
                return this;
            }

            /**
             * UnallocatedPretaxAmount.
             */
            public Builder unallocatedPretaxAmount(String unallocatedPretaxAmount) {
                this.unallocatedPretaxAmount = unallocatedPretaxAmount;
                return this;
            }

            /**
             * UnallocatedPretaxAmountLocal.
             */
            public Builder unallocatedPretaxAmountLocal(String unallocatedPretaxAmountLocal) {
                this.unallocatedPretaxAmountLocal = unallocatedPretaxAmountLocal;
                return this;
            }

            /**
             * UnallocatedPretaxGrossAmount.
             */
            public Builder unallocatedPretaxGrossAmount(String unallocatedPretaxGrossAmount) {
                this.unallocatedPretaxGrossAmount = unallocatedPretaxGrossAmount;
                return this;
            }

            /**
             * UnallocatedPricingDiscount.
             */
            public Builder unallocatedPricingDiscount(String unallocatedPricingDiscount) {
                this.unallocatedPricingDiscount = unallocatedPricingDiscount;
                return this;
            }

            /**
             * UsageEndDate.
             */
            public Builder usageEndDate(String usageEndDate) {
                this.usageEndDate = usageEndDate;
                return this;
            }

            /**
             * UsageStartDate.
             */
            public Builder usageStartDate(String usageStartDate) {
                this.usageStartDate = usageStartDate;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
    public static class Modules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Module")
        private java.util.List < Module> module;

        private Modules(Builder builder) {
            this.module = builder.module;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modules create() {
            return builder().build();
        }

        /**
         * @return module
         */
        public java.util.List < Module> getModule() {
            return this.module;
        }

        public static final class Builder {
            private java.util.List < Module> module; 

            /**
             * Module.
             */
            public Builder module(java.util.List < Module> module) {
                this.module = module;
                return this;
            }

            public Modules build() {
                return new Modules(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("Modules")
        private Modules modules;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.hostId = builder.hostId;
            this.modules = builder.modules;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return modules
         */
        public Modules getModules() {
            return this.modules;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String hostId; 
            private Modules modules; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * Modules.
             */
            public Builder modules(Modules modules) {
                this.modules = modules;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
