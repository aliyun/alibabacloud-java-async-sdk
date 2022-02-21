// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySettlementBillResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySettlementBillResponseBody</p>
 */
public class QuerySettlementBillResponseBody extends TeaModel {
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

    private QuerySettlementBillResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySettlementBillResponseBody create() {
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

        public QuerySettlementBillResponseBody build() {
            return new QuerySettlementBillResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("AccountDiscount")
        private Float accountDiscount;

        @NameInMap("AfterTaxAmount")
        private Float afterTaxAmount;

        @NameInMap("BillID")
        private String billID;

        @NameInMap("ChargeDiscount")
        private Float chargeDiscount;

        @NameInMap("ClearedTime")
        private String clearedTime;

        @NameInMap("Config")
        private String config;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DeductedByCashCoupons")
        private Float deductedByCashCoupons;

        @NameInMap("DeductedByCoupons")
        private Float deductedByCoupons;

        @NameInMap("DeductedByPrepaidCard")
        private Float deductedByPrepaidCard;

        @NameInMap("InvoiceNo")
        private String invoiceNo;

        @NameInMap("Item")
        private String item;

        @NameInMap("LinkedCustomerOrderID")
        private String linkedCustomerOrderID;

        @NameInMap("MybankPaymentAmount")
        private Float mybankPaymentAmount;

        @NameInMap("OrderID")
        private String orderID;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("OriginalOrderID")
        private String originalOrderID;

        @NameInMap("OutstandingAmount")
        private Float outstandingAmount;

        @NameInMap("OwnerID")
        private String ownerID;

        @NameInMap("PayerAccount")
        private String payerAccount;

        @NameInMap("PaymentAmount")
        private Float paymentAmount;

        @NameInMap("PaymentCurrency")
        private String paymentCurrency;

        @NameInMap("PaymentTime")
        private String paymentTime;

        @NameInMap("PretaxAmount")
        private Float pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        private Float pretaxAmountLocal;

        @NameInMap("PretaxGrossAmount")
        private Float pretaxGrossAmount;

        @NameInMap("PreviousBillingCycleBalance")
        private Float previousBillingCycleBalance;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("Promotion")
        private String promotion;

        @NameInMap("Quantity")
        private String quantity;

        @NameInMap("RecordID")
        private String recordID;

        @NameInMap("Region")
        private String region;

        @NameInMap("Seller")
        private String seller;

        @NameInMap("SolutionID")
        private String solutionID;

        @NameInMap("SolutionName")
        private String solutionName;

        @NameInMap("Status")
        private String status;

        @NameInMap("SuborderID")
        private String suborderID;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        @NameInMap("Tax")
        private Float tax;

        @NameInMap("UsageEndTime")
        private String usageEndTime;

        @NameInMap("UsageStartTime")
        private String usageStartTime;

        private Item(Builder builder) {
            this.accountDiscount = builder.accountDiscount;
            this.afterTaxAmount = builder.afterTaxAmount;
            this.billID = builder.billID;
            this.chargeDiscount = builder.chargeDiscount;
            this.clearedTime = builder.clearedTime;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.currency = builder.currency;
            this.deductedByCashCoupons = builder.deductedByCashCoupons;
            this.deductedByCoupons = builder.deductedByCoupons;
            this.deductedByPrepaidCard = builder.deductedByPrepaidCard;
            this.invoiceNo = builder.invoiceNo;
            this.item = builder.item;
            this.linkedCustomerOrderID = builder.linkedCustomerOrderID;
            this.mybankPaymentAmount = builder.mybankPaymentAmount;
            this.orderID = builder.orderID;
            this.orderType = builder.orderType;
            this.originalOrderID = builder.originalOrderID;
            this.outstandingAmount = builder.outstandingAmount;
            this.ownerID = builder.ownerID;
            this.payerAccount = builder.payerAccount;
            this.paymentAmount = builder.paymentAmount;
            this.paymentCurrency = builder.paymentCurrency;
            this.paymentTime = builder.paymentTime;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxAmountLocal = builder.pretaxAmountLocal;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.previousBillingCycleBalance = builder.previousBillingCycleBalance;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
            this.promotion = builder.promotion;
            this.quantity = builder.quantity;
            this.recordID = builder.recordID;
            this.region = builder.region;
            this.seller = builder.seller;
            this.solutionID = builder.solutionID;
            this.solutionName = builder.solutionName;
            this.status = builder.status;
            this.suborderID = builder.suborderID;
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
         * @return accountDiscount
         */
        public Float getAccountDiscount() {
            return this.accountDiscount;
        }

        /**
         * @return afterTaxAmount
         */
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        /**
         * @return billID
         */
        public String getBillID() {
            return this.billID;
        }

        /**
         * @return chargeDiscount
         */
        public Float getChargeDiscount() {
            return this.chargeDiscount;
        }

        /**
         * @return clearedTime
         */
        public String getClearedTime() {
            return this.clearedTime;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return invoiceNo
         */
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return linkedCustomerOrderID
         */
        public String getLinkedCustomerOrderID() {
            return this.linkedCustomerOrderID;
        }

        /**
         * @return mybankPaymentAmount
         */
        public Float getMybankPaymentAmount() {
            return this.mybankPaymentAmount;
        }

        /**
         * @return orderID
         */
        public String getOrderID() {
            return this.orderID;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return originalOrderID
         */
        public String getOriginalOrderID() {
            return this.originalOrderID;
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
         * @return payerAccount
         */
        public String getPayerAccount() {
            return this.payerAccount;
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
         * @return previousBillingCycleBalance
         */
        public Float getPreviousBillingCycleBalance() {
            return this.previousBillingCycleBalance;
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
         * @return promotion
         */
        public String getPromotion() {
            return this.promotion;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        /**
         * @return recordID
         */
        public String getRecordID() {
            return this.recordID;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return seller
         */
        public String getSeller() {
            return this.seller;
        }

        /**
         * @return solutionID
         */
        public String getSolutionID() {
            return this.solutionID;
        }

        /**
         * @return solutionName
         */
        public String getSolutionName() {
            return this.solutionName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return suborderID
         */
        public String getSuborderID() {
            return this.suborderID;
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
            private Float accountDiscount; 
            private Float afterTaxAmount; 
            private String billID; 
            private Float chargeDiscount; 
            private String clearedTime; 
            private String config; 
            private String createTime; 
            private String currency; 
            private Float deductedByCashCoupons; 
            private Float deductedByCoupons; 
            private Float deductedByPrepaidCard; 
            private String invoiceNo; 
            private String item; 
            private String linkedCustomerOrderID; 
            private Float mybankPaymentAmount; 
            private String orderID; 
            private String orderType; 
            private String originalOrderID; 
            private Float outstandingAmount; 
            private String ownerID; 
            private String payerAccount; 
            private Float paymentAmount; 
            private String paymentCurrency; 
            private String paymentTime; 
            private Float pretaxAmount; 
            private Float pretaxAmountLocal; 
            private Float pretaxGrossAmount; 
            private Float previousBillingCycleBalance; 
            private String productCode; 
            private String productType; 
            private String promotion; 
            private String quantity; 
            private String recordID; 
            private String region; 
            private String seller; 
            private String solutionID; 
            private String solutionName; 
            private String status; 
            private String suborderID; 
            private String subscriptionType; 
            private Float tax; 
            private String usageEndTime; 
            private String usageStartTime; 

            /**
             * AccountDiscount.
             */
            public Builder accountDiscount(Float accountDiscount) {
                this.accountDiscount = accountDiscount;
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
             * BillID.
             */
            public Builder billID(String billID) {
                this.billID = billID;
                return this;
            }

            /**
             * ChargeDiscount.
             */
            public Builder chargeDiscount(Float chargeDiscount) {
                this.chargeDiscount = chargeDiscount;
                return this;
            }

            /**
             * ClearedTime.
             */
            public Builder clearedTime(String clearedTime) {
                this.clearedTime = clearedTime;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * InvoiceNo.
             */
            public Builder invoiceNo(String invoiceNo) {
                this.invoiceNo = invoiceNo;
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
             * LinkedCustomerOrderID.
             */
            public Builder linkedCustomerOrderID(String linkedCustomerOrderID) {
                this.linkedCustomerOrderID = linkedCustomerOrderID;
                return this;
            }

            /**
             * MybankPaymentAmount.
             */
            public Builder mybankPaymentAmount(Float mybankPaymentAmount) {
                this.mybankPaymentAmount = mybankPaymentAmount;
                return this;
            }

            /**
             * OrderID.
             */
            public Builder orderID(String orderID) {
                this.orderID = orderID;
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
             * OriginalOrderID.
             */
            public Builder originalOrderID(String originalOrderID) {
                this.originalOrderID = originalOrderID;
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
             * PayerAccount.
             */
            public Builder payerAccount(String payerAccount) {
                this.payerAccount = payerAccount;
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
             * PreviousBillingCycleBalance.
             */
            public Builder previousBillingCycleBalance(Float previousBillingCycleBalance) {
                this.previousBillingCycleBalance = previousBillingCycleBalance;
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
             * Promotion.
             */
            public Builder promotion(String promotion) {
                this.promotion = promotion;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Seller.
             */
            public Builder seller(String seller) {
                this.seller = seller;
                return this;
            }

            /**
             * SolutionID.
             */
            public Builder solutionID(String solutionID) {
                this.solutionID = solutionID;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SuborderID.
             */
            public Builder suborderID(String suborderID) {
                this.suborderID = suborderID;
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

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
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
            private String billingCycle; 
            private Items items; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

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
