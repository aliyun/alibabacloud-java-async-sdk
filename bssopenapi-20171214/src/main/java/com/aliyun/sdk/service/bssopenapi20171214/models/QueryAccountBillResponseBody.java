// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountBillResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountBillResponseBody</p>
 */
public class QueryAccountBillResponseBody extends TeaModel {
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

    private QueryAccountBillResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountBillResponseBody create() {
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

        public QueryAccountBillResponseBody build() {
            return new QueryAccountBillResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("AdjustAmount")
        private Float adjustAmount;

        @NameInMap("BillAccountID")
        private String billAccountID;

        @NameInMap("BillAccountName")
        private String billAccountName;

        @NameInMap("BillingDate")
        private String billingDate;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CashAmount")
        private Float cashAmount;

        @NameInMap("CostUnit")
        private String costUnit;

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

        @NameInMap("OutstandingAmount")
        private Float outstandingAmount;

        @NameInMap("OwnerID")
        private String ownerID;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("PaymentAmount")
        private Float paymentAmount;

        @NameInMap("PipCode")
        private String pipCode;

        @NameInMap("PretaxAmount")
        private Float pretaxAmount;

        @NameInMap("PretaxGrossAmount")
        private Float pretaxGrossAmount;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        private Item(Builder builder) {
            this.adjustAmount = builder.adjustAmount;
            this.billAccountID = builder.billAccountID;
            this.billAccountName = builder.billAccountName;
            this.billingDate = builder.billingDate;
            this.bizType = builder.bizType;
            this.cashAmount = builder.cashAmount;
            this.costUnit = builder.costUnit;
            this.currency = builder.currency;
            this.deductedByCashCoupons = builder.deductedByCashCoupons;
            this.deductedByCoupons = builder.deductedByCoupons;
            this.deductedByPrepaidCard = builder.deductedByPrepaidCard;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.outstandingAmount = builder.outstandingAmount;
            this.ownerID = builder.ownerID;
            this.ownerName = builder.ownerName;
            this.paymentAmount = builder.paymentAmount;
            this.pipCode = builder.pipCode;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.subscriptionType = builder.subscriptionType;
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
         * @return billingDate
         */
        public String getBillingDate() {
            return this.billingDate;
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
         * @return costUnit
         */
        public String getCostUnit() {
            return this.costUnit;
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
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return paymentAmount
         */
        public Float getPaymentAmount() {
            return this.paymentAmount;
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
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public static final class Builder {
            private Float adjustAmount; 
            private String billAccountID; 
            private String billAccountName; 
            private String billingDate; 
            private String bizType; 
            private Float cashAmount; 
            private String costUnit; 
            private String currency; 
            private Float deductedByCashCoupons; 
            private Float deductedByCoupons; 
            private Float deductedByPrepaidCard; 
            private Float invoiceDiscount; 
            private Float outstandingAmount; 
            private String ownerID; 
            private String ownerName; 
            private Float paymentAmount; 
            private String pipCode; 
            private Float pretaxAmount; 
            private Float pretaxGrossAmount; 
            private String productCode; 
            private String productName; 
            private String subscriptionType; 

            /**
             * AdjustAmount.
             */
            public Builder adjustAmount(Float adjustAmount) {
                this.adjustAmount = adjustAmount;
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
             * BillingDate.
             */
            public Builder billingDate(String billingDate) {
                this.billingDate = billingDate;
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
             * CostUnit.
             */
            public Builder costUnit(String costUnit) {
                this.costUnit = costUnit;
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
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
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
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * SubscriptionType.
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
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

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.accountID = builder.accountID;
            this.accountName = builder.accountName;
            this.billingCycle = builder.billingCycle;
            this.items = builder.items;
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
            private String accountID; 
            private String accountName; 
            private String billingCycle; 
            private Items items; 
            private Integer pageNum; 
            private Integer pageSize; 
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
