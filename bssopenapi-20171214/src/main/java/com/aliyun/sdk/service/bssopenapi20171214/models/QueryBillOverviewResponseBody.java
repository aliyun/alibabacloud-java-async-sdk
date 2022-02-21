// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBillOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBillOverviewResponseBody</p>
 */
public class QueryBillOverviewResponseBody extends TeaModel {
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

    private QueryBillOverviewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBillOverviewResponseBody create() {
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

        public QueryBillOverviewResponseBody build() {
            return new QueryBillOverviewResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("AdjustAmount")
        private Float adjustAmount;

        @NameInMap("AfterTaxAmount")
        private Float afterTaxAmount;

        @NameInMap("BillAccountID")
        private String billAccountID;

        @NameInMap("BillAccountName")
        private String billAccountName;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CashAmount")
        private Float cashAmount;

        @NameInMap("CommodityCode")
        private String commodityCode;

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

        @NameInMap("OwnerID")
        private String ownerID;

        @NameInMap("PaymentAmount")
        private Float paymentAmount;

        @NameInMap("PaymentCurrency")
        private String paymentCurrency;

        @NameInMap("PipCode")
        private String pipCode;

        @NameInMap("PretaxAmount")
        private Float pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        private Float pretaxAmountLocal;

        @NameInMap("PretaxGrossAmount")
        private Float pretaxGrossAmount;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductDetail")
        private String productDetail;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("RoundDownDiscount")
        private String roundDownDiscount;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        @NameInMap("Tax")
        private Float tax;

        private Item(Builder builder) {
            this.adjustAmount = builder.adjustAmount;
            this.afterTaxAmount = builder.afterTaxAmount;
            this.billAccountID = builder.billAccountID;
            this.billAccountName = builder.billAccountName;
            this.bizType = builder.bizType;
            this.cashAmount = builder.cashAmount;
            this.commodityCode = builder.commodityCode;
            this.currency = builder.currency;
            this.deductedByCashCoupons = builder.deductedByCashCoupons;
            this.deductedByCoupons = builder.deductedByCoupons;
            this.deductedByPrepaidCard = builder.deductedByPrepaidCard;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.item = builder.item;
            this.outstandingAmount = builder.outstandingAmount;
            this.ownerID = builder.ownerID;
            this.paymentAmount = builder.paymentAmount;
            this.paymentCurrency = builder.paymentCurrency;
            this.pipCode = builder.pipCode;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxAmountLocal = builder.pretaxAmountLocal;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productDetail = builder.productDetail;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.roundDownDiscount = builder.roundDownDiscount;
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
         * @return adjustAmount
         */
        public Float getAdjustAmount() {
            return this.adjustAmount;
        }

        /**
         * @return afterTaxAmount
         */
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        /**
         * @return billAccountID
         */
        public String getBillAccountID() {
            return this.billAccountID;
        }

        /**
         * @return billAccountName
         */
        public String getBillAccountName() {
            return this.billAccountName;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return cashAmount
         */
        public Float getCashAmount() {
            return this.cashAmount;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
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
         * @return ownerID
         */
        public String getOwnerID() {
            return this.ownerID;
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
         * @return pipCode
         */
        public String getPipCode() {
            return this.pipCode;
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
         * @return productDetail
         */
        public String getProductDetail() {
            return this.productDetail;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return roundDownDiscount
         */
        public String getRoundDownDiscount() {
            return this.roundDownDiscount;
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
            private Float adjustAmount; 
            private Float afterTaxAmount; 
            private String billAccountID; 
            private String billAccountName; 
            private String bizType; 
            private Float cashAmount; 
            private String commodityCode; 
            private String currency; 
            private Float deductedByCashCoupons; 
            private Float deductedByCoupons; 
            private Float deductedByPrepaidCard; 
            private Float invoiceDiscount; 
            private String item; 
            private Float outstandingAmount; 
            private String ownerID; 
            private Float paymentAmount; 
            private String paymentCurrency; 
            private String pipCode; 
            private Float pretaxAmount; 
            private Float pretaxAmountLocal; 
            private Float pretaxGrossAmount; 
            private String productCode; 
            private String productDetail; 
            private String productName; 
            private String productType; 
            private String roundDownDiscount; 
            private String subscriptionType; 
            private Float tax; 

            /**
             * AdjustAmount.
             */
            public Builder adjustAmount(Float adjustAmount) {
                this.adjustAmount = adjustAmount;
                return this;
            }

            /**
             * AfterTaxAmount.
             */
            public Builder afterTaxAmount(Float afterTaxAmount) {
                this.afterTaxAmount = afterTaxAmount;
                return this;
            }

            /**
             * BillAccountID.
             */
            public Builder billAccountID(String billAccountID) {
                this.billAccountID = billAccountID;
                return this;
            }

            /**
             * BillAccountName.
             */
            public Builder billAccountName(String billAccountName) {
                this.billAccountName = billAccountName;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * CashAmount.
             */
            public Builder cashAmount(Float cashAmount) {
                this.cashAmount = cashAmount;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
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
             * OwnerID.
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
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
             * PipCode.
             */
            public Builder pipCode(String pipCode) {
                this.pipCode = pipCode;
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
             * ProductDetail.
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
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
             * RoundDownDiscount.
             */
            public Builder roundDownDiscount(String roundDownDiscount) {
                this.roundDownDiscount = roundDownDiscount;
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
        @NameInMap("AccountID")
        private String accountID;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("BillingCycle")
        private String billingCycle;

        @NameInMap("Items")
        private Items items;

        private Data(Builder builder) {
            this.accountID = builder.accountID;
            this.accountName = builder.accountName;
            this.billingCycle = builder.billingCycle;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountID
         */
        public String getAccountID() {
            return this.accountID;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
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

        public static final class Builder {
            private String accountID; 
            private String accountName; 
            private String billingCycle; 
            private Items items; 

            /**
             * AccountID.
             */
            public Builder accountID(String accountID) {
                this.accountID = accountID;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
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
             * Items.
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
