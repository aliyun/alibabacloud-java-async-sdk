// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderDetailResponseBody</p>
 */
public class GetOrderDetailResponseBody extends TeaModel {
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

    private GetOrderDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderDetailResponseBody create() {
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

        public GetOrderDetailResponseBody build() {
            return new GetOrderDetailResponseBody(this);
        } 

    } 

    public static class Order extends TeaModel {
        @NameInMap("AfterTaxAmount")
        private String afterTaxAmount;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("Config")
        private String config;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("ExtendInfos")
        private java.util.Map < String, String > extendInfos;

        @NameInMap("InstanceIDs")
        private String instanceIDs;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("OrderSubType")
        private String orderSubType;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("OriginalConfig")
        private String originalConfig;

        @NameInMap("PaymentCurrency")
        private String paymentCurrency;

        @NameInMap("PaymentStatus")
        private String paymentStatus;

        @NameInMap("PaymentTime")
        private String paymentTime;

        @NameInMap("PretaxAmount")
        private String pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        private String pretaxAmountLocal;

        @NameInMap("PretaxGrossAmount")
        private String pretaxGrossAmount;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("Quantity")
        private String quantity;

        @NameInMap("Region")
        private String region;

        @NameInMap("RelatedOrderId")
        private String relatedOrderId;

        @NameInMap("SubOrderId")
        private String subOrderId;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        @NameInMap("Tax")
        private String tax;

        @NameInMap("UsageEndTime")
        private String usageEndTime;

        @NameInMap("UsageStartTime")
        private String usageStartTime;

        private Order(Builder builder) {
            this.afterTaxAmount = builder.afterTaxAmount;
            this.commodityCode = builder.commodityCode;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.currency = builder.currency;
            this.extendInfos = builder.extendInfos;
            this.instanceIDs = builder.instanceIDs;
            this.operator = builder.operator;
            this.orderId = builder.orderId;
            this.orderSubType = builder.orderSubType;
            this.orderType = builder.orderType;
            this.originalConfig = builder.originalConfig;
            this.paymentCurrency = builder.paymentCurrency;
            this.paymentStatus = builder.paymentStatus;
            this.paymentTime = builder.paymentTime;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxAmountLocal = builder.pretaxAmountLocal;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
            this.quantity = builder.quantity;
            this.region = builder.region;
            this.relatedOrderId = builder.relatedOrderId;
            this.subOrderId = builder.subOrderId;
            this.subscriptionType = builder.subscriptionType;
            this.tax = builder.tax;
            this.usageEndTime = builder.usageEndTime;
            this.usageStartTime = builder.usageStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return afterTaxAmount
         */
        public String getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
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
         * @return extendInfos
         */
        public java.util.Map < String, String > getExtendInfos() {
            return this.extendInfos;
        }

        /**
         * @return instanceIDs
         */
        public String getInstanceIDs() {
            return this.instanceIDs;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderSubType
         */
        public String getOrderSubType() {
            return this.orderSubType;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return originalConfig
         */
        public String getOriginalConfig() {
            return this.originalConfig;
        }

        /**
         * @return paymentCurrency
         */
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        /**
         * @return paymentStatus
         */
        public String getPaymentStatus() {
            return this.paymentStatus;
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
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return relatedOrderId
         */
        public String getRelatedOrderId() {
            return this.relatedOrderId;
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
        public String getTax() {
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
            private String afterTaxAmount; 
            private String commodityCode; 
            private String config; 
            private String createTime; 
            private String currency; 
            private java.util.Map < String, String > extendInfos; 
            private String instanceIDs; 
            private String operator; 
            private String orderId; 
            private String orderSubType; 
            private String orderType; 
            private String originalConfig; 
            private String paymentCurrency; 
            private String paymentStatus; 
            private String paymentTime; 
            private String pretaxAmount; 
            private String pretaxAmountLocal; 
            private String pretaxGrossAmount; 
            private String productCode; 
            private String productType; 
            private String quantity; 
            private String region; 
            private String relatedOrderId; 
            private String subOrderId; 
            private String subscriptionType; 
            private String tax; 
            private String usageEndTime; 
            private String usageStartTime; 

            /**
             * The after-tax amount of the order.
             */
            public Builder afterTaxAmount(String afterTaxAmount) {
                this.afterTaxAmount = afterTaxAmount;
                return this;
            }

            /**
             * The service code.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The configurations of the main service.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The time when the order was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * ExtendInfos.
             */
            public Builder extendInfos(java.util.Map < String, String > extendInfos) {
                this.extendInfos = extendInfos;
                return this;
            }

            /**
             * The instance IDs.
             */
            public Builder instanceIDs(String instanceIDs) {
                this.instanceIDs = instanceIDs;
                return this;
            }

            /**
             * The ID of the Resource Access Management (RAM) user who performs operations on the order. If no RAM user is involved, leave this parameter blank.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The ID of the order.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The type of the suborder. Valid values:
             * <p>
             * 
             * *   ProductSubOrder: the service suborder
             * *   RefundSubOrder: the refund suborder
             */
            public Builder orderSubType(String orderSubType) {
                this.orderSubType = orderSubType;
                return this;
            }

            /**
             * The type of the order. Valid values:
             * <p>
             * 
             * *   New: purchases an instance.
             * *   Renew: renews an instance.
             * *   Upgrade: upgrades the configurations of an instance.
             * *   Refund: applies for a refund.
             * *   Convert: switches the billing method.
             * *   Downgrade: downgrades the configurations of an instance.
             * *   ResizeDisk: resizes the disk.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The module information without standardized conversion.
             */
            public Builder originalConfig(String originalConfig) {
                this.originalConfig = originalConfig;
                return this;
            }

            /**
             * The currency of payment.
             */
            public Builder paymentCurrency(String paymentCurrency) {
                this.paymentCurrency = paymentCurrency;
                return this;
            }

            /**
             * The status of payment. Valid values:
             * <p>
             * 
             * *   Unpaid: The order is not paid.
             * *   Paid: The order is paid.
             * *   Cancelled: The order is canceled.
             */
            public Builder paymentStatus(String paymentStatus) {
                this.paymentStatus = paymentStatus;
                return this;
            }

            /**
             * The time of payment.
             */
            public Builder paymentTime(String paymentTime) {
                this.paymentTime = paymentTime;
                return this;
            }

            /**
             * The pretax amount of the order.
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * The pretax amount of the order in local currency.
             */
            public Builder pretaxAmountLocal(String pretaxAmountLocal) {
                this.pretaxAmountLocal = pretaxAmountLocal;
                return this;
            }

            /**
             * The pretax gross amount of the order.
             */
            public Builder pretaxGrossAmount(String pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * The code of the main service.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The type of the main service.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * The number of main services.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
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
             * The ID of the associated order.
             */
            public Builder relatedOrderId(String relatedOrderId) {
                this.relatedOrderId = relatedOrderId;
                return this;
            }

            /**
             * The ID of the suborder.
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * The billing method. Valid values:
             * <p>
             * 
             * *   Subscription: subscription
             * *   PayAsYouGo: pay-as-you-go
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * The tax of the order.
             */
            public Builder tax(String tax) {
                this.tax = tax;
                return this;
            }

            /**
             * The time when the service ends.
             */
            public Builder usageEndTime(String usageEndTime) {
                this.usageEndTime = usageEndTime;
                return this;
            }

            /**
             * The time when the service starts.
             */
            public Builder usageStartTime(String usageStartTime) {
                this.usageStartTime = usageStartTime;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    public static class OrderList extends TeaModel {
        @NameInMap("Order")
        private java.util.List < Order> order;

        private OrderList(Builder builder) {
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public java.util.List < Order> getOrder() {
            return this.order;
        }

        public static final class Builder {
            private java.util.List < Order> order; 

            /**
             * Order.
             */
            public Builder order(java.util.List < Order> order) {
                this.order = order;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("HostName")
        private String hostName;

        @NameInMap("OrderList")
        private OrderList orderList;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.hostName = builder.hostName;
            this.orderList = builder.orderList;
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
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return orderList
         */
        public OrderList getOrderList() {
            return this.orderList;
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
            private String hostName; 
            private OrderList orderList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The hostname.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The details of the order.
             */
            public Builder orderList(OrderList orderList) {
                this.orderList = orderList;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
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
