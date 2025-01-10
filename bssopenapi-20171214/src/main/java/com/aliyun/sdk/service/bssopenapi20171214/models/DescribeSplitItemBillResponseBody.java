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
 * {@link DescribeSplitItemBillResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSplitItemBillResponseBody</p>
 */
public class DescribeSplitItemBillResponseBody extends TeaModel {
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

    private DescribeSplitItemBillResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSplitItemBillResponseBody create() {
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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSplitItemBillResponseBody build() {
            return new DescribeSplitItemBillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSplitItemBillResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSplitItemBillResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdjustAmount")
        private Float adjustAmount;

        @com.aliyun.core.annotation.NameInMap("AfterDiscountAmount")
        private String afterDiscountAmount;

        @com.aliyun.core.annotation.NameInMap("BillAccountID")
        private String billAccountID;

        @com.aliyun.core.annotation.NameInMap("BillAccountName")
        private String billAccountName;

        @com.aliyun.core.annotation.NameInMap("BillingDate")
        private String billingDate;

        @com.aliyun.core.annotation.NameInMap("BillingItem")
        private String billingItem;

        @com.aliyun.core.annotation.NameInMap("BillingItemCode")
        private String billingItemCode;

        @com.aliyun.core.annotation.NameInMap("BillingType")
        private String billingType;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("CashAmount")
        private Float cashAmount;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CostUnit")
        private String costUnit;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DeductedByCashCoupons")
        private Float deductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("DeductedByCoupons")
        private Float deductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("DeductedByPrepaidCard")
        private Float deductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("DeductedByResourcePackage")
        private String deductedByResourcePackage;

        @com.aliyun.core.annotation.NameInMap("InstanceConfig")
        private String instanceConfig;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("InternetIP")
        private String internetIP;

        @com.aliyun.core.annotation.NameInMap("IntranetIP")
        private String intranetIP;

        @com.aliyun.core.annotation.NameInMap("InvoiceDiscount")
        private Float invoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ListPrice")
        private String listPrice;

        @com.aliyun.core.annotation.NameInMap("ListPriceUnit")
        private String listPriceUnit;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("OutstandingAmount")
        private Float outstandingAmount;

        @com.aliyun.core.annotation.NameInMap("OwnerID")
        private String ownerID;

        @com.aliyun.core.annotation.NameInMap("PaymentAmount")
        private Float paymentAmount;

        @com.aliyun.core.annotation.NameInMap("PipCode")
        private String pipCode;

        @com.aliyun.core.annotation.NameInMap("PretaxAmount")
        private Float pretaxAmount;

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

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("ServicePeriod")
        private String servicePeriod;

        @com.aliyun.core.annotation.NameInMap("ServicePeriodUnit")
        private String servicePeriodUnit;

        @com.aliyun.core.annotation.NameInMap("SplitAccountID")
        private String splitAccountID;

        @com.aliyun.core.annotation.NameInMap("SplitAccountName")
        private String splitAccountName;

        @com.aliyun.core.annotation.NameInMap("SplitBillingCycle")
        private String splitBillingCycle;

        @com.aliyun.core.annotation.NameInMap("SplitBillingDate")
        private String splitBillingDate;

        @com.aliyun.core.annotation.NameInMap("SplitCommodityCode")
        private String splitCommodityCode;

        @com.aliyun.core.annotation.NameInMap("SplitItemID")
        private String splitItemID;

        @com.aliyun.core.annotation.NameInMap("SplitItemName")
        private String splitItemName;

        @com.aliyun.core.annotation.NameInMap("SplitProductDetail")
        private String splitProductDetail;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        @com.aliyun.core.annotation.NameInMap("UsageUnit")
        private String usageUnit;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private Items(Builder builder) {
            this.adjustAmount = builder.adjustAmount;
            this.afterDiscountAmount = builder.afterDiscountAmount;
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
            this.splitAccountID = builder.splitAccountID;
            this.splitAccountName = builder.splitAccountName;
            this.splitBillingCycle = builder.splitBillingCycle;
            this.splitBillingDate = builder.splitBillingDate;
            this.splitCommodityCode = builder.splitCommodityCode;
            this.splitItemID = builder.splitItemID;
            this.splitItemName = builder.splitItemName;
            this.splitProductDetail = builder.splitProductDetail;
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
         * @return afterDiscountAmount
         */
        public String getAfterDiscountAmount() {
            return this.afterDiscountAmount;
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
         * @return splitAccountID
         */
        public String getSplitAccountID() {
            return this.splitAccountID;
        }

        /**
         * @return splitAccountName
         */
        public String getSplitAccountName() {
            return this.splitAccountName;
        }

        /**
         * @return splitBillingCycle
         */
        public String getSplitBillingCycle() {
            return this.splitBillingCycle;
        }

        /**
         * @return splitBillingDate
         */
        public String getSplitBillingDate() {
            return this.splitBillingDate;
        }

        /**
         * @return splitCommodityCode
         */
        public String getSplitCommodityCode() {
            return this.splitCommodityCode;
        }

        /**
         * @return splitItemID
         */
        public String getSplitItemID() {
            return this.splitItemID;
        }

        /**
         * @return splitItemName
         */
        public String getSplitItemName() {
            return this.splitItemName;
        }

        /**
         * @return splitProductDetail
         */
        public String getSplitProductDetail() {
            return this.splitProductDetail;
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
            private String afterDiscountAmount; 
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
            private String splitAccountID; 
            private String splitAccountName; 
            private String splitBillingCycle; 
            private String splitBillingDate; 
            private String splitCommodityCode; 
            private String splitItemID; 
            private String splitItemName; 
            private String splitProductDetail; 
            private String subscriptionType; 
            private String tag; 
            private String usage; 
            private String usageUnit; 
            private String zone; 

            /**
             * <p>The amount deducted with credit refund.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder adjustAmount(Float adjustAmount) {
                this.adjustAmount = adjustAmount;
                return this;
            }

            /**
             * AfterDiscountAmount.
             */
            public Builder afterDiscountAmount(String afterDiscountAmount) {
                this.afterDiscountAmount = afterDiscountAmount;
                return this;
            }

            /**
             * <p>The ID of the account to which the bill belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>185xxxx3489</p>
             */
            public Builder billAccountID(String billAccountID) {
                this.billAccountID = billAccountID;
                return this;
            }

            /**
             * <p>The name of the account to which the bill belongs.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
             */
            public Builder billAccountName(String billAccountName) {
                this.billAccountName = billAccountName;
                return this;
            }

            /**
             * <p>The billing date. Format: YYYY-MM-DD. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-20</p>
             */
            public Builder billingDate(String billingDate) {
                this.billingDate = billingDate;
                return this;
            }

            /**
             * <p>The billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>Bandwidth</p>
             */
            public Builder billingItem(String billingItem) {
                this.billingItem = billingItem;
                return this;
            }

            /**
             * <p>The code of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>disk</p>
             */
            public Builder billingItemCode(String billingItemCode) {
                this.billingItemCode = billingItemCode;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>Other</p>
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * <p>The type of the business.</p>
             * 
             * <strong>example:</strong>
             * <p>trusteeship</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The amount paid in cash. The amount deducted with credit refund is not included.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cashAmount(Float cashAmount) {
                this.cashAmount = cashAmount;
                return this;
            }

            /**
             * <p>The code of the commodity. The code is the same as that displayed in the Split Bill module of the User Center console.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>Not allocated</p>
             */
            public Builder costUnit(String costUnit) {
                this.costUnit = costUnit;
                return this;
            }

            /**
             * <p>The type of currency. Valid values: CNY, USD, and JPY.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The amount deducted with vouchers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deductedByCashCoupons(Float deductedByCashCoupons) {
                this.deductedByCashCoupons = deductedByCashCoupons;
                return this;
            }

            /**
             * <p>The amount deducted with coupons.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deductedByCoupons(Float deductedByCoupons) {
                this.deductedByCoupons = deductedByCoupons;
                return this;
            }

            /**
             * <p>The amount deducted with prepaid cards.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deductedByPrepaidCard(Float deductedByPrepaidCard) {
                this.deductedByPrepaidCard = deductedByPrepaidCard;
                return this;
            }

            /**
             * <p>The amount deducted with resource plans.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deductedByResourcePackage(String deductedByResourcePackage) {
                this.deductedByResourcePackage = deductedByResourcePackage;
                return this;
            }

            /**
             * <p>The configurations of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU:12</p>
             */
            public Builder instanceConfig(String instanceConfig) {
                this.instanceConfig = instanceConfig;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-kjhdskjgshfdlkjfdh</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.sn1ne.3xlarge</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>34.xx.x.x</p>
             */
            public Builder internetIP(String internetIP) {
                this.internetIP = internetIP;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.xx.xx.xx</p>
             */
            public Builder intranetIP(String intranetIP) {
                this.intranetIP = intranetIP;
                return this;
            }

            /**
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * <p>The type of the bill. Valid values: SubscriptionOrder: the subscription bill. PayAsYouGoBill: the pay-as-you-go bill. Refund: the refund. Adjustment: the adjustment bill.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGoBill</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The name of the split item.</p>
             * 
             * <strong>example:</strong>
             * <p>iZ28bycvyb4Z</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The unit price.</p>
             * 
             * <strong>example:</strong>
             * <p>0.12</p>
             */
            public Builder listPrice(String listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * <p>The unit of the unit price.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY/GB</p>
             */
            public Builder listPriceUnit(String listPriceUnit) {
                this.listPriceUnit = listPriceUnit;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>nick</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The amount that is unsettled.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder outstandingAmount(Float outstandingAmount) {
                this.outstandingAmount = outstandingAmount;
                return this;
            }

            /**
             * <p>The ID of the account that owns the resource. This parameter is returned in multi-account scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>169***013</p>
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * <p>The amount paid in cash. The amount deducted with credit refund is included.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder paymentAmount(Float paymentAmount) {
                this.paymentAmount = paymentAmount;
                return this;
            }

            /**
             * <p>The code of the service. The code is the same as that displayed in the Split Bill module of the User Center console.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder pipCode(String pipCode) {
                this.pipCode = pipCode;
                return this;
            }

            /**
             * <p>The pretax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxAmount(Float pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The pretax gross amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxGrossAmount(Float pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * <p>The code of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The details of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraDB RDS</p>
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraDB RDS</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>Default resource group</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The duration of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder servicePeriod(String servicePeriod) {
                this.servicePeriod = servicePeriod;
                return this;
            }

            /**
             * <p>The unit of the service duration.</p>
             * 
             * <strong>example:</strong>
             * <p>Hour</p>
             */
            public Builder servicePeriodUnit(String servicePeriodUnit) {
                this.servicePeriodUnit = servicePeriodUnit;
                return this;
            }

            /**
             * <p>The ID of the account to which the split bill belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12**122</p>
             */
            public Builder splitAccountID(String splitAccountID) {
                this.splitAccountID = splitAccountID;
                return this;
            }

            /**
             * <p>The name of the account to which the split item belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test**1122</p>
             */
            public Builder splitAccountName(String splitAccountName) {
                this.splitAccountName = splitAccountName;
                return this;
            }

            /**
             * <p>The billing cycle in which the bill is split.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06</p>
             */
            public Builder splitBillingCycle(String splitBillingCycle) {
                this.splitBillingCycle = splitBillingCycle;
                return this;
            }

            /**
             * <p>The day on which the bill is split.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-01</p>
             */
            public Builder splitBillingDate(String splitBillingDate) {
                this.splitBillingDate = splitBillingDate;
                return this;
            }

            /**
             * <p>The code of the split item.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder splitCommodityCode(String splitCommodityCode) {
                this.splitCommodityCode = splitCommodityCode;
                return this;
            }

            /**
             * <p>The ID of the split item.</p>
             * 
             * <strong>example:</strong>
             * <p>i-28bycvyb4</p>
             */
            public Builder splitItemID(String splitItemID) {
                this.splitItemID = splitItemID;
                return this;
            }

            /**
             * <p>The name of the split item.</p>
             * 
             * <strong>example:</strong>
             * <p>iZ28bycvyb4Z</p>
             */
            public Builder splitItemName(String splitItemName) {
                this.splitItemName = splitItemName;
                return this;
            }

            /**
             * <p>The details of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraDB RDS</p>
             */
            public Builder splitProductDetail(String splitProductDetail) {
                this.splitProductDetail = splitProductDetail;
                return this;
            }

            /**
             * <p>The billing method. Valid values: Subscription: the subscription billing method. PayAsYouGo: the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * <p>The tag of the resource. If tags added to resources change, the bills generated during the period in which resources and tags are associated are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>key:testKey value:testValue; key:testKey1 value:testValues1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The amount of resource usage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * <p>The unit of usage.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder usageUnit(String usageUnit) {
                this.usageUnit = usageUnit;
                return this;
            }

            /**
             * <p>The zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Qingdao Zone B</p>
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
    /**
     * 
     * {@link DescribeSplitItemBillResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSplitItemBillResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountID")
        private String accountID;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("BillingCycle")
        private String billingCycle;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

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
        public java.util.List<Items> getItems() {
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
            private java.util.List<Items> items; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * <p>The ID of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>185xxxx3489</p>
             */
            public Builder accountID(String accountID) {
                this.accountID = accountID;
                return this;
            }

            /**
             * <p>The ID of the account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The billing cycle. Format: YYYY-MM.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03</p>
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * <p>The details of the bill.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The maximum number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token used for the next query. If this parameter is empty, all the results are returned. When you perform the next query, you must set the NextToken parameter to this value.</p>
             * 
             * <strong>example:</strong>
             * <p>CAESEgoQCg4K</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
