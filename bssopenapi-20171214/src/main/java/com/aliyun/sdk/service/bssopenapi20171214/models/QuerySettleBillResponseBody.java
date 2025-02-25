// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QuerySettleBillResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySettleBillResponseBody</p>
 */
public class QuerySettleBillResponseBody extends TeaModel {
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

    private QuerySettleBillResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySettleBillResponseBody create() {
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

        public QuerySettleBillResponseBody build() {
            return new QuerySettleBillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySettleBillResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySettleBillResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdjustAmount")
        private Float adjustAmount;

        @com.aliyun.core.annotation.NameInMap("AfterTaxAmount")
        private Float afterTaxAmount;

        @com.aliyun.core.annotation.NameInMap("BillAccountID")
        private String billAccountID;

        @com.aliyun.core.annotation.NameInMap("BillAccountName")
        private String billAccountName;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("CashAmount")
        private Float cashAmount;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DeductedByCashCoupons")
        private Float deductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("DeductedByCoupons")
        private Float deductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("DeductedByPrepaidCard")
        private Float deductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("InvoiceDiscount")
        private Float invoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("OutstandingAmount")
        private Float outstandingAmount;

        @com.aliyun.core.annotation.NameInMap("OwnerID")
        private String ownerID;

        @com.aliyun.core.annotation.NameInMap("PaymentAmount")
        private Float paymentAmount;

        @com.aliyun.core.annotation.NameInMap("PaymentCurrency")
        private String paymentCurrency;

        @com.aliyun.core.annotation.NameInMap("PaymentTime")
        private String paymentTime;

        @com.aliyun.core.annotation.NameInMap("PaymentTransactionID")
        private String paymentTransactionID;

        @com.aliyun.core.annotation.NameInMap("PipCode")
        private String pipCode;

        @com.aliyun.core.annotation.NameInMap("PretaxAmount")
        private Float pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("PretaxAmountLocal")
        private Float pretaxAmountLocal;

        @com.aliyun.core.annotation.NameInMap("PretaxGrossAmount")
        private Float pretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductDetail")
        private String productDetail;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RecordID")
        private String recordID;

        @com.aliyun.core.annotation.NameInMap("RoundDownDiscount")
        private String roundDownDiscount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubOrderId")
        private String subOrderId;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        @com.aliyun.core.annotation.NameInMap("Tax")
        private Float tax;

        @com.aliyun.core.annotation.NameInMap("UsageEndTime")
        private String usageEndTime;

        @com.aliyun.core.annotation.NameInMap("UsageStartTime")
        private String usageStartTime;

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
            this.paymentTime = builder.paymentTime;
            this.paymentTransactionID = builder.paymentTransactionID;
            this.pipCode = builder.pipCode;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxAmountLocal = builder.pretaxAmountLocal;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productDetail = builder.productDetail;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.recordID = builder.recordID;
            this.roundDownDiscount = builder.roundDownDiscount;
            this.status = builder.status;
            this.subOrderId = builder.subOrderId;
            this.subscriptionType = builder.subscriptionType;
            this.tax = builder.tax;
            this.usageEndTime = builder.usageEndTime;
            this.usageStartTime = builder.usageStartTime;
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
         * @return paymentTime
         */
        public String getPaymentTime() {
            return this.paymentTime;
        }

        /**
         * @return paymentTransactionID
         */
        public String getPaymentTransactionID() {
            return this.paymentTransactionID;
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
         * @return recordID
         */
        public String getRecordID() {
            return this.recordID;
        }

        /**
         * @return roundDownDiscount
         */
        public String getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return tax
         */
        public Float getTax() {
            return this.tax;
        }

        /**
         * @return usageEndTime
         */
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        /**
         * @return usageStartTime
         */
        public String getUsageStartTime() {
            return this.usageStartTime;
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
            private String paymentTime; 
            private String paymentTransactionID; 
            private String pipCode; 
            private Float pretaxAmount; 
            private Float pretaxAmountLocal; 
            private Float pretaxGrossAmount; 
            private String productCode; 
            private String productDetail; 
            private String productName; 
            private String productType; 
            private String recordID; 
            private String roundDownDiscount; 
            private String status; 
            private String subOrderId; 
            private String subscriptionType; 
            private Float tax; 
            private String usageEndTime; 
            private String usageStartTime; 

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
             * PaymentTime.
             */
            public Builder paymentTime(String paymentTime) {
                this.paymentTime = paymentTime;
                return this;
            }

            /**
             * PaymentTransactionID.
             */
            public Builder paymentTransactionID(String paymentTransactionID) {
                this.paymentTransactionID = paymentTransactionID;
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
             * RecordID.
             */
            public Builder recordID(String recordID) {
                this.recordID = recordID;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * Tax.
             */
            public Builder tax(Float tax) {
                this.tax = tax;
                return this;
            }

            /**
             * UsageEndTime.
             */
            public Builder usageEndTime(String usageEndTime) {
                this.usageEndTime = usageEndTime;
                return this;
            }

            /**
             * UsageStartTime.
             */
            public Builder usageStartTime(String usageStartTime) {
                this.usageStartTime = usageStartTime;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySettleBillResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySettleBillResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

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
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySettleBillResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySettleBillResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountID")
        private String accountID;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("BillingCycle")
        private String billingCycle;

        @com.aliyun.core.annotation.NameInMap("Items")
        private Items items;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.accountID = builder.accountID;
            this.accountName = builder.accountName;
            this.billingCycle = builder.billingCycle;
            this.items = builder.items;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
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

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String accountID; 
            private String accountName; 
            private String billingCycle; 
            private Items items; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

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

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
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
