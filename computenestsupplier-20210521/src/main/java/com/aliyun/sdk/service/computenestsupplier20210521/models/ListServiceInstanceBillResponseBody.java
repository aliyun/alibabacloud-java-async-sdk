// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListServiceInstanceBillResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceBillResponseBody</p>
 */
public class ListServiceInstanceBillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Item")
    private java.util.List<Item> item;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListServiceInstanceBillResponseBody(Builder builder) {
        this.item = builder.item;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceBillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return item
     */
    public java.util.List<Item> getItem() {
        return this.item;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Item> item; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListServiceInstanceBillResponseBody model) {
            this.item = model.item;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The billing information of the backup schedule.</p>
         */
        public Builder item(java.util.List<Item> item) {
            this.item = item;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B68C6D1-0C22-53F7-997C-F95D109C31AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceInstanceBillResponseBody build() {
            return new ListServiceInstanceBillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceBillResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceBillResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingCycle")
        private String billingCycle;

        @com.aliyun.core.annotation.NameInMap("BillingDate")
        private String billingDate;

        @com.aliyun.core.annotation.NameInMap("BillingItem")
        private String billingItem;

        @com.aliyun.core.annotation.NameInMap("BillingItemCode")
        private String billingItemCode;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DeductedByResourcePackage")
        private String deductedByResourcePackage;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InvoiceDiscount")
        private String invoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("ListPrice")
        private String listPrice;

        @com.aliyun.core.annotation.NameInMap("ListPriceUnit")
        private String listPriceUnit;

        @com.aliyun.core.annotation.NameInMap("PretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("PretaxGrossAmount")
        private String pretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductDetail")
        private String productDetail;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
        private String serviceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SplitBillingCycle")
        private String splitBillingCycle;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        @com.aliyun.core.annotation.NameInMap("UsageUnit")
        private String usageUnit;

        private Item(Builder builder) {
            this.billingCycle = builder.billingCycle;
            this.billingDate = builder.billingDate;
            this.billingItem = builder.billingItem;
            this.billingItemCode = builder.billingItemCode;
            this.currency = builder.currency;
            this.deductedByResourcePackage = builder.deductedByResourcePackage;
            this.instanceID = builder.instanceID;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.listPrice = builder.listPrice;
            this.listPriceUnit = builder.listPriceUnit;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productDetail = builder.productDetail;
            this.productName = builder.productName;
            this.serviceInstanceId = builder.serviceInstanceId;
            this.splitBillingCycle = builder.splitBillingCycle;
            this.subscriptionType = builder.subscriptionType;
            this.usage = builder.usage;
            this.usageUnit = builder.usageUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return billingCycle
         */
        public String getBillingCycle() {
            return this.billingCycle;
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
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return deductedByResourcePackage
         */
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return invoiceDiscount
         */
        public String getInvoiceDiscount() {
            return this.invoiceDiscount;
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
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return pretaxGrossAmount
         */
        public String getPretaxGrossAmount() {
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
         * @return serviceInstanceId
         */
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        /**
         * @return splitBillingCycle
         */
        public String getSplitBillingCycle() {
            return this.splitBillingCycle;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
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

        public static final class Builder {
            private String billingCycle; 
            private String billingDate; 
            private String billingItem; 
            private String billingItemCode; 
            private String currency; 
            private String deductedByResourcePackage; 
            private String instanceID; 
            private String invoiceDiscount; 
            private String listPrice; 
            private String listPriceUnit; 
            private String pretaxAmount; 
            private String pretaxGrossAmount; 
            private String productCode; 
            private String productDetail; 
            private String productName; 
            private String serviceInstanceId; 
            private String splitBillingCycle; 
            private String subscriptionType; 
            private String usage; 
            private String usageUnit; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.billingCycle = model.billingCycle;
                this.billingDate = model.billingDate;
                this.billingItem = model.billingItem;
                this.billingItemCode = model.billingItemCode;
                this.currency = model.currency;
                this.deductedByResourcePackage = model.deductedByResourcePackage;
                this.instanceID = model.instanceID;
                this.invoiceDiscount = model.invoiceDiscount;
                this.listPrice = model.listPrice;
                this.listPriceUnit = model.listPriceUnit;
                this.pretaxAmount = model.pretaxAmount;
                this.pretaxGrossAmount = model.pretaxGrossAmount;
                this.productCode = model.productCode;
                this.productDetail = model.productDetail;
                this.productName = model.productName;
                this.serviceInstanceId = model.serviceInstanceId;
                this.splitBillingCycle = model.splitBillingCycle;
                this.subscriptionType = model.subscriptionType;
                this.usage = model.usage;
                this.usageUnit = model.usageUnit;
            } 

            /**
             * <p>The billing cycle. Format: YYYY-MM.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12</p>
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * <p>The billing date. This parameter is required only if the <strong>Granularity</strong> parameter is set to DAILY. Format: YYYY-MM-DD.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-05</p>
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
             * <p>The currency unit.</p>
             * <ul>
             * <li>China site: <strong>CNY</strong>.</li>
             * <li>International site: <strong>USD</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
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
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-wz9k051l23j3o3xa9</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder invoiceDiscount(String invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
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
             * <p>The pretax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The pretax gross amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxGrossAmount(String pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * <p>The code of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The details of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * <p>The name of the cloud service or the name of the service-linked role with which the cloud service is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>Service instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>si-bc5d6ac7022647d3a3bd</p>
             */
            public Builder serviceInstanceId(String serviceInstanceId) {
                this.serviceInstanceId = serviceInstanceId;
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
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>Subscription: the subscription billing method.</li>
             * <li>PayAsYouGo: the pay-as-you-go billing method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Subscription</p>
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * <p>The amount of resource usage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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

            public Item build() {
                return new Item(this);
            } 

        } 

    }
}
