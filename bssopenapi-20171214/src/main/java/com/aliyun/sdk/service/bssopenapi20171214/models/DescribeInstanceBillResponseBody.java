// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceBillResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceBillResponseBody</p>
 */
public class DescribeInstanceBillResponseBody extends TeaModel {
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

    private DescribeInstanceBillResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceBillResponseBody create() {
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

        public DescribeInstanceBillResponseBody build() {
            return new DescribeInstanceBillResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AdjustAmount")
        private Float adjustAmount;

        @NameInMap("BillAccountID")
        private String billAccountID;

        @NameInMap("BillAccountName")
        private String billAccountName;

        @NameInMap("BillingDate")
        private String billingDate;

        @NameInMap("BillingItem")
        private String billingItem;

        @NameInMap("BillingItemCode")
        private String billingItemCode;

        @NameInMap("BillingType")
        private String billingType;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CashAmount")
        private Float cashAmount;

        @NameInMap("CommodityCode")
        private String commodityCode;

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

        @NameInMap("DeductedByResourcePackage")
        private String deductedByResourcePackage;

        @NameInMap("InstanceConfig")
        private String instanceConfig;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("InternetIP")
        private String internetIP;

        @NameInMap("IntranetIP")
        private String intranetIP;

        @NameInMap("InvoiceDiscount")
        private Float invoiceDiscount;

        @NameInMap("Item")
        private String item;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("ListPrice")
        private String listPrice;

        @NameInMap("ListPriceUnit")
        private String listPriceUnit;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("OutstandingAmount")
        private Float outstandingAmount;

        @NameInMap("OwnerID")
        private String ownerID;

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

        @NameInMap("ProductDetail")
        private String productDetail;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourceGroup")
        private String resourceGroup;

        @NameInMap("ServicePeriod")
        private String servicePeriod;

        @NameInMap("ServicePeriodUnit")
        private String servicePeriodUnit;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Usage")
        private String usage;

        @NameInMap("UsageUnit")
        private String usageUnit;

        @NameInMap("Zone")
        private String zone;

        private Items(Builder builder) {
            this.adjustAmount = builder.adjustAmount;
            this.billAccountID = builder.billAccountID;
            this.billAccountName = builder.billAccountName;
            this.billingDate = builder.billingDate;
            this.billingItem = builder.billingItem;
            this.billingItemCode = builder.billingItemCode;
            this.billingType = builder.billingType;
            this.bizType = builder.bizType;
            this.cashAmount = builder.cashAmount;
            this.commodityCode = builder.commodityCode;
            this.costUnit = builder.costUnit;
            this.currency = builder.currency;
            this.deductedByCashCoupons = builder.deductedByCashCoupons;
            this.deductedByCoupons = builder.deductedByCoupons;
            this.deductedByPrepaidCard = builder.deductedByPrepaidCard;
            this.deductedByResourcePackage = builder.deductedByResourcePackage;
            this.instanceConfig = builder.instanceConfig;
            this.instanceID = builder.instanceID;
            this.instanceSpec = builder.instanceSpec;
            this.internetIP = builder.internetIP;
            this.intranetIP = builder.intranetIP;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.item = builder.item;
            this.itemName = builder.itemName;
            this.listPrice = builder.listPrice;
            this.listPriceUnit = builder.listPriceUnit;
            this.nickName = builder.nickName;
            this.outstandingAmount = builder.outstandingAmount;
            this.ownerID = builder.ownerID;
            this.paymentAmount = builder.paymentAmount;
            this.pipCode = builder.pipCode;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productDetail = builder.productDetail;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.region = builder.region;
            this.resourceGroup = builder.resourceGroup;
            this.servicePeriod = builder.servicePeriod;
            this.servicePeriodUnit = builder.servicePeriodUnit;
            this.subscriptionType = builder.subscriptionType;
            this.tag = builder.tag;
            this.usage = builder.usage;
            this.usageUnit = builder.usageUnit;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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
         * @return billingItem
         */
        public String getBillingItem() {
            return this.billingItem;
        }

        /**
         * @return billingItemCode
         */
        public String getBillingItemCode() {
            return this.billingItemCode;
        }

        /**
         * @return billingType
         */
        public String getBillingType() {
            return this.billingType;
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
         * @return deductedByResourcePackage
         */
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        /**
         * @return instanceConfig
         */
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return internetIP
         */
        public String getInternetIP() {
            return this.internetIP;
        }

        /**
         * @return intranetIP
         */
        public String getIntranetIP() {
            return this.intranetIP;
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
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return listPrice
         */
        public String getListPrice() {
            return this.listPrice;
        }

        /**
         * @return listPriceUnit
         */
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
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
         * @return servicePeriod
         */
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        /**
         * @return servicePeriodUnit
         */
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
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
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        /**
         * @return usageUnit
         */
        public String getUsageUnit() {
            return this.usageUnit;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private Float adjustAmount; 
            private String billAccountID; 
            private String billAccountName; 
            private String billingDate; 
            private String billingItem; 
            private String billingItemCode; 
            private String billingType; 
            private String bizType; 
            private Float cashAmount; 
            private String commodityCode; 
            private String costUnit; 
            private String currency; 
            private Float deductedByCashCoupons; 
            private Float deductedByCoupons; 
            private Float deductedByPrepaidCard; 
            private String deductedByResourcePackage; 
            private String instanceConfig; 
            private String instanceID; 
            private String instanceSpec; 
            private String internetIP; 
            private String intranetIP; 
            private Float invoiceDiscount; 
            private String item; 
            private String itemName; 
            private String listPrice; 
            private String listPriceUnit; 
            private String nickName; 
            private Float outstandingAmount; 
            private String ownerID; 
            private Float paymentAmount; 
            private String pipCode; 
            private Float pretaxAmount; 
            private Float pretaxGrossAmount; 
            private String productCode; 
            private String productDetail; 
            private String productName; 
            private String productType; 
            private String region; 
            private String resourceGroup; 
            private String servicePeriod; 
            private String servicePeriodUnit; 
            private String subscriptionType; 
            private String tag; 
            private String usage; 
            private String usageUnit; 
            private String zone; 

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
             * BillingItem.
             */
            public Builder billingItem(String billingItem) {
                this.billingItem = billingItem;
                return this;
            }

            /**
             * BillingItemCode.
             */
            public Builder billingItemCode(String billingItemCode) {
                this.billingItemCode = billingItemCode;
                return this;
            }

            /**
             * BillingType.
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
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
             * DeductedByResourcePackage.
             */
            public Builder deductedByResourcePackage(String deductedByResourcePackage) {
                this.deductedByResourcePackage = deductedByResourcePackage;
                return this;
            }

            /**
             * InstanceConfig.
             */
            public Builder instanceConfig(String instanceConfig) {
                this.instanceConfig = instanceConfig;
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
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * InternetIP.
             */
            public Builder internetIP(String internetIP) {
                this.internetIP = internetIP;
                return this;
            }

            /**
             * IntranetIP.
             */
            public Builder intranetIP(String intranetIP) {
                this.intranetIP = intranetIP;
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
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ListPrice.
             */
            public Builder listPrice(String listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * ListPriceUnit.
             */
            public Builder listPriceUnit(String listPriceUnit) {
                this.listPriceUnit = listPriceUnit;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
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
             * ServicePeriod.
             */
            public Builder servicePeriod(String servicePeriod) {
                this.servicePeriod = servicePeriod;
                return this;
            }

            /**
             * ServicePeriodUnit.
             */
            public Builder servicePeriodUnit(String servicePeriodUnit) {
                this.servicePeriodUnit = servicePeriodUnit;
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
             * Usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * UsageUnit.
             */
            public Builder usageUnit(String usageUnit) {
                this.usageUnit = usageUnit;
                return this;
            }

            /**
             * Zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
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
        private java.util.List < Items> items;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
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
        public java.util.List < Items> getItems() {
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
            private java.util.List < Items> items; 
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
            public Builder items(java.util.List < Items> items) {
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
