// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonthlyBillResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMonthlyBillResponseBody</p>
 */
public class QueryMonthlyBillResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryMonthlyBillResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlyBillResponseBody create() {
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

        public QueryMonthlyBillResponseBody build() {
            return new QueryMonthlyBillResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("AfterTaxAmount")
        private Float afterTaxAmount;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DeductedByCashCoupons")
        private Float deductedByCashCoupons;

        @NameInMap("DeductedByCoupons")
        private Float deductedByCoupons;

        @NameInMap("DeductedByPrepaidCard")
        private Float deductedByPrepaidCard;

        @NameInMap("InvoiceDiscount")
        private Float invoiceDiscount;

        @NameInMap("Item")
        private String item;

        @NameInMap("OutstandingAmount")
        private Float outstandingAmount;

        @NameInMap("PaymentAmount")
        private Float paymentAmount;

        @NameInMap("PaymentCurrency")
        private String paymentCurrency;

        @NameInMap("PretaxAmount")
        private Float pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        private Float pretaxAmountLocal;

        @NameInMap("PretaxGrossAmount")
        private Float pretaxGrossAmount;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("SolutionCode")
        private String solutionCode;

        @NameInMap("SolutionName")
        private String solutionName;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        @NameInMap("Tax")
        private Float tax;

        private Item(Builder builder) {
            this.afterTaxAmount = builder.afterTaxAmount;
            this.currency = builder.currency;
            this.deductedByCashCoupons = builder.deductedByCashCoupons;
            this.deductedByCoupons = builder.deductedByCoupons;
            this.deductedByPrepaidCard = builder.deductedByPrepaidCard;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.item = builder.item;
            this.outstandingAmount = builder.outstandingAmount;
            this.paymentAmount = builder.paymentAmount;
            this.paymentCurrency = builder.paymentCurrency;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxAmountLocal = builder.pretaxAmountLocal;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
            this.solutionCode = builder.solutionCode;
            this.solutionName = builder.solutionName;
            this.subscriptionType = builder.subscriptionType;
            this.tax = builder.tax;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return afterTaxAmount
         */
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
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
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        /**
         * @return deductedByCoupons
         */
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        /**
         * @return deductedByPrepaidCard
         */
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        /**
         * @return invoiceDiscount
         */
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return outstandingAmount
         */
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        /**
         * @return paymentAmount
         */
        public Float getPaymentAmount() {
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
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return pretaxAmountLocal
         */
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        /**
         * @return pretaxGrossAmount
         */
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
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
         * @return solutionCode
         */
        public String getSolutionCode() {
            return this.solutionCode;
        }

        /**
         * @return solutionName
         */
        public String getSolutionName() {
            return this.solutionName;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        /**
         * @return tax
         */
        public Float getTax() {
            return this.tax;
        }

        public static final class Builder {
            private Float afterTaxAmount; 
            private String currency; 
            private Float deductedByCashCoupons; 
            private Float deductedByCoupons; 
            private Float deductedByPrepaidCard; 
            private Float invoiceDiscount; 
            private String item; 
            private Float outstandingAmount; 
            private Float paymentAmount; 
            private String paymentCurrency; 
            private Float pretaxAmount; 
            private Float pretaxAmountLocal; 
            private Float pretaxGrossAmount; 
            private String productCode; 
            private String productType; 
            private String solutionCode; 
            private String solutionName; 
            private String subscriptionType; 
            private Float tax; 

            /**
             * AfterTaxAmount.
             */
            public Builder afterTaxAmount(Float afterTaxAmount) {
                this.afterTaxAmount = afterTaxAmount;
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
            public Builder deductedByCashCoupons(Float deductedByCashCoupons) {
                this.deductedByCashCoupons = deductedByCashCoupons;
                return this;
            }

            /**
             * DeductedByCoupons.
             */
            public Builder deductedByCoupons(Float deductedByCoupons) {
                this.deductedByCoupons = deductedByCoupons;
                return this;
            }

            /**
             * DeductedByPrepaidCard.
             */
            public Builder deductedByPrepaidCard(Float deductedByPrepaidCard) {
                this.deductedByPrepaidCard = deductedByPrepaidCard;
                return this;
            }

            /**
             * InvoiceDiscount.
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * Item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * OutstandingAmount.
             */
            public Builder outstandingAmount(Float outstandingAmount) {
                this.outstandingAmount = outstandingAmount;
                return this;
            }

            /**
             * PaymentAmount.
             */
            public Builder paymentAmount(Float paymentAmount) {
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
            public Builder pretaxAmount(Float pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * PretaxAmountLocal.
             */
            public Builder pretaxAmountLocal(Float pretaxAmountLocal) {
                this.pretaxAmountLocal = pretaxAmountLocal;
                return this;
            }

            /**
             * PretaxGrossAmount.
             */
            public Builder pretaxGrossAmount(Float pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
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
             * SolutionCode.
             */
            public Builder solutionCode(String solutionCode) {
                this.solutionCode = solutionCode;
                return this;
            }

            /**
             * SolutionName.
             */
            public Builder solutionName(String solutionName) {
                this.solutionName = solutionName;
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
             * Tax.
             */
            public Builder tax(Float tax) {
                this.tax = tax;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BillingCycle")
        private String billingCycle;

        @NameInMap("Items")
        private Items items;

        @NameInMap("NewInvoiceAmount")
        private Float newInvoiceAmount;

        @NameInMap("OutstandingAmount")
        private Float outstandingAmount;

        @NameInMap("TotalOutstandingAmount")
        private Float totalOutstandingAmount;

        private Data(Builder builder) {
            this.billingCycle = builder.billingCycle;
            this.items = builder.items;
            this.newInvoiceAmount = builder.newInvoiceAmount;
            this.outstandingAmount = builder.outstandingAmount;
            this.totalOutstandingAmount = builder.totalOutstandingAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return billingCycle
         */
        public String getBillingCycle() {
            return this.billingCycle;
        }

        /**
         * @return items
         */
        public Items getItems() {
            return this.items;
        }

        /**
         * @return newInvoiceAmount
         */
        public Float getNewInvoiceAmount() {
            return this.newInvoiceAmount;
        }

        /**
         * @return outstandingAmount
         */
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        /**
         * @return totalOutstandingAmount
         */
        public Float getTotalOutstandingAmount() {
            return this.totalOutstandingAmount;
        }

        public static final class Builder {
            private String billingCycle; 
            private Items items; 
            private Float newInvoiceAmount; 
            private Float outstandingAmount; 
            private Float totalOutstandingAmount; 

            /**
             * BillingCycle.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            /**
             * NewInvoiceAmount.
             */
            public Builder newInvoiceAmount(Float newInvoiceAmount) {
                this.newInvoiceAmount = newInvoiceAmount;
                return this;
            }

            /**
             * OutstandingAmount.
             */
            public Builder outstandingAmount(Float outstandingAmount) {
                this.outstandingAmount = outstandingAmount;
                return this;
            }

            /**
             * TotalOutstandingAmount.
             */
            public Builder totalOutstandingAmount(Float totalOutstandingAmount) {
                this.totalOutstandingAmount = totalOutstandingAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
