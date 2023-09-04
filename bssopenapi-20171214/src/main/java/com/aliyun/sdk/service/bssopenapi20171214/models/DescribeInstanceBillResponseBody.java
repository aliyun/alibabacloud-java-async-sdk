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
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
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
             * The amount deducted with credit refund.
             */
            public Builder adjustAmount(Float adjustAmount) {
                this.adjustAmount = adjustAmount;
                return this;
            }

            /**
             * The ID of the account to which the bill belongs.
             */
            public Builder billAccountID(String billAccountID) {
                this.billAccountID = billAccountID;
                return this;
            }

            /**
             * The name of the account to which the bill belongs.
             */
            public Builder billAccountName(String billAccountName) {
                this.billAccountName = billAccountName;
                return this;
            }

            /**
             * The billing date. This parameter is returned only if the Granularity parameter is set to DAILY. Format: YYYY-MM-DD.
             */
            public Builder billingDate(String billingDate) {
                this.billingDate = billingDate;
                return this;
            }

            /**
             * The billable item. A value is returned only if the IsBillingItem parameter is set to true.
             */
            public Builder billingItem(String billingItem) {
                this.billingItem = billingItem;
                return this;
            }

            /**
             * The code of the billable item.
             */
            public Builder billingItemCode(String billingItemCode) {
                this.billingItemCode = billingItemCode;
                return this;
            }

            /**
             * The billing method.
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * The type of business.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The amount paid in cash. The amount deducted with credit refund is not included.
             */
            public Builder cashAmount(Float cashAmount) {
                this.cashAmount = cashAmount;
                return this;
            }

            /**
             * The code of the commodity. The code is the same as that in Cost Center.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The cost center.
             */
            public Builder costUnit(String costUnit) {
                this.costUnit = costUnit;
                return this;
            }

            /**
             * The type of currency. Valid values:
             * <p>
             * 
             * *   CNY
             * *   USD
             * *   JPY
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The amount deducted with vouchers.
             */
            public Builder deductedByCashCoupons(Float deductedByCashCoupons) {
                this.deductedByCashCoupons = deductedByCashCoupons;
                return this;
            }

            /**
             * The amount deducted with coupons.
             */
            public Builder deductedByCoupons(Float deductedByCoupons) {
                this.deductedByCoupons = deductedByCoupons;
                return this;
            }

            /**
             * The amount deducted with prepaid cards.
             */
            public Builder deductedByPrepaidCard(Float deductedByPrepaidCard) {
                this.deductedByPrepaidCard = deductedByPrepaidCard;
                return this;
            }

            /**
             * The amount deducted with resource plans. This parameter is valid only when the isBillingItem parameter is set to true.
             */
            public Builder deductedByResourcePackage(String deductedByResourcePackage) {
                this.deductedByResourcePackage = deductedByResourcePackage;
                return this;
            }

            /**
             * The configurations of the instance.
             */
            public Builder instanceConfig(String instanceConfig) {
                this.instanceConfig = instanceConfig;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the instance.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder internetIP(String internetIP) {
                this.internetIP = internetIP;
                return this;
            }

            /**
             * The private IP address.
             */
            public Builder intranetIP(String intranetIP) {
                this.intranetIP = intranetIP;
                return this;
            }

            /**
             * The discount amount.
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * The type of the bill.
             * <p>
             * 
             * *   SubscriptionOrder: the subscription bill.
             * *   PayAsYouGoBill: the pay-as-you-go bill,
             * *   Refund: the refund.
             * *   Adjustment: the adjustment bill.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The name of the project.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * The unit price of the service. This parameter is valid only when the isBillingItem parameter is set to true.
             */
            public Builder listPrice(String listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * The unit of the unit price. This parameter is valid only when the isBillingItem parameter is set to true.
             */
            public Builder listPriceUnit(String listPriceUnit) {
                this.listPriceUnit = listPriceUnit;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The unsettled amount.
             */
            public Builder outstandingAmount(Float outstandingAmount) {
                this.outstandingAmount = outstandingAmount;
                return this;
            }

            /**
             * The ID of the account that owns the resource. This parameter is returned in multi-account payment scenario.
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * The amount paid in cash. The amount deducted with credit refund is not included.
             */
            public Builder paymentAmount(Float paymentAmount) {
                this.paymentAmount = paymentAmount;
                return this;
            }

            /**
             * The code of the service. The code is the same as that in Cost Center.
             */
            public Builder pipCode(String pipCode) {
                this.pipCode = pipCode;
                return this;
            }

            /**
             * The pretax amount.
             */
            public Builder pretaxAmount(Float pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * The pretax gross amount.
             */
            public Builder pretaxGrossAmount(Float pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * The code of the service.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The details of the service.
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * The type of the service.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * The service duration.
             */
            public Builder servicePeriod(String servicePeriod) {
                this.servicePeriod = servicePeriod;
                return this;
            }

            /**
             * The unit of the service duration.
             */
            public Builder servicePeriodUnit(String servicePeriodUnit) {
                this.servicePeriodUnit = servicePeriodUnit;
                return this;
            }

            /**
             * The billing method. Valid values:
             * <p>
             * 
             * *   Subscription: the subscription billing method.
             * *   PayAsYouGo: the pay-as-you-go billing method.
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * The tag of the resource.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The usage of the service. This parameter is valid only when the isBillingItem parameter is set to true. The usage is the total usage in all bills in the billing cycle, not the amount that you purchase. For example, if 1 GB of storage is used and bills are generated every hour, the usage is 1 GB per hour. In this case, the usage is 24 GB per day.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * The unit of usage. This parameter is valid only when the isBillingItem parameter is set to true.
             */
            public Builder usageUnit(String usageUnit) {
                this.usageUnit = usageUnit;
                return this;
            }

            /**
             * The ID of the zone.
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
             * The ID of the account.
             */
            public Builder accountID(String accountID) {
                this.accountID = accountID;
                return this;
            }

            /**
             * The name of the account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The billing cycle in the YYYY-MM format.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * The details of the bill.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The maximum number of entries returned.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The position where the query stopped. If this parameter is left empty, all the results are returned. If you perform another call, you must set the NextToken parameter to the value of this parameter.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of returned entries.
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
