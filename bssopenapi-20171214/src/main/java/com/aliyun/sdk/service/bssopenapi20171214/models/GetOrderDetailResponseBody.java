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
             * AfterTaxAmount.
             */
            public Builder afterTaxAmount(String afterTaxAmount) {
                this.afterTaxAmount = afterTaxAmount;
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
             * InstanceIDs.
             */
            public Builder instanceIDs(String instanceIDs) {
                this.instanceIDs = instanceIDs;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrderSubType.
             */
            public Builder orderSubType(String orderSubType) {
                this.orderSubType = orderSubType;
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
             * OriginalConfig.
             */
            public Builder originalConfig(String originalConfig) {
                this.originalConfig = originalConfig;
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
             * PaymentStatus.
             */
            public Builder paymentStatus(String paymentStatus) {
                this.paymentStatus = paymentStatus;
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
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * PretaxAmountLocal.
             */
            public Builder pretaxAmountLocal(String pretaxAmountLocal) {
                this.pretaxAmountLocal = pretaxAmountLocal;
                return this;
            }

            /**
             * PretaxGrossAmount.
             */
            public Builder pretaxGrossAmount(String pretaxGrossAmount) {
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
             * Quantity.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
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
             * RelatedOrderId.
             */
            public Builder relatedOrderId(String relatedOrderId) {
                this.relatedOrderId = relatedOrderId;
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
            public Builder tax(String tax) {
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
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * OrderList.
             */
            public Builder orderList(OrderList orderList) {
                this.orderList = orderList;
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
