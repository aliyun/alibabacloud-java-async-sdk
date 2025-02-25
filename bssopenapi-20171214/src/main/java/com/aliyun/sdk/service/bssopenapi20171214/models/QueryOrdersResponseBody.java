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
 * {@link QueryOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrdersResponseBody</p>
 */
public class QueryOrdersResponseBody extends TeaModel {
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

    private QueryOrdersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrdersResponseBody create() {
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
         * <p>The message returned.</p>
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
         * <p>61293E7A-3406-4447-8620-EC88B0AA66AD</p>
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

        public QueryOrdersResponseBody build() {
            return new QueryOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrdersResponseBody</p>
     */
    public static class Order extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterTaxAmount")
        private String afterTaxAmount;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("PaymentCurrency")
        private String paymentCurrency;

        @com.aliyun.core.annotation.NameInMap("PaymentStatus")
        private String paymentStatus;

        @com.aliyun.core.annotation.NameInMap("PaymentTime")
        private String paymentTime;

        @com.aliyun.core.annotation.NameInMap("PretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("PretaxAmountLocal")
        private String pretaxAmountLocal;

        @com.aliyun.core.annotation.NameInMap("PretaxGrossAmount")
        private String pretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RelatedOrderId")
        private String relatedOrderId;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        @com.aliyun.core.annotation.NameInMap("Tax")
        private String tax;

        private Order(Builder builder) {
            this.afterTaxAmount = builder.afterTaxAmount;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.currency = builder.currency;
            this.orderId = builder.orderId;
            this.orderType = builder.orderType;
            this.paymentCurrency = builder.paymentCurrency;
            this.paymentStatus = builder.paymentStatus;
            this.paymentTime = builder.paymentTime;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxAmountLocal = builder.pretaxAmountLocal;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
            this.relatedOrderId = builder.relatedOrderId;
            this.subscriptionType = builder.subscriptionType;
            this.tax = builder.tax;
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
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
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
         * @return relatedOrderId
         */
        public String getRelatedOrderId() {
            return this.relatedOrderId;
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

        public static final class Builder {
            private String afterTaxAmount; 
            private String commodityCode; 
            private String createTime; 
            private String currency; 
            private String orderId; 
            private String orderType; 
            private String paymentCurrency; 
            private String paymentStatus; 
            private String paymentTime; 
            private String pretaxAmount; 
            private String pretaxAmountLocal; 
            private String pretaxGrossAmount; 
            private String productCode; 
            private String productType; 
            private String relatedOrderId; 
            private String subscriptionType; 
            private String tax; 

            /**
             * <p>The aftertax amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder afterTaxAmount(String afterTaxAmount) {
                this.afterTaxAmount = afterTaxAmount;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The time when the order was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-08T09:41:30Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The ID of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>34532532</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The type of the order. Valid values:</p>
             * <ul>
             * <li>New: purchases an instance.</li>
             * <li>Renew: renews an instance.</li>
             * <li>Upgrade: upgrades the configurations of an instance.</li>
             * <li>Refund: applies for a refund.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>New</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The currency of payment.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder paymentCurrency(String paymentCurrency) {
                this.paymentCurrency = paymentCurrency;
                return this;
            }

            /**
             * <p>The status of payment. Valid values for a non-refund order:</p>
             * <ul>
             * <li>Unpaid: The order is not paid.</li>
             * <li>Paid: The order is paid.</li>
             * <li>Cancelled: The order is canceled.</li>
             * </ul>
             * <blockquote>
             * <p>: The value is NULL for a refund order.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Paid</p>
             */
            public Builder paymentStatus(String paymentStatus) {
                this.paymentStatus = paymentStatus;
                return this;
            }

            /**
             * <p>The time of payment.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-08T09:41:30Z</p>
             */
            public Builder paymentTime(String paymentTime) {
                this.paymentTime = paymentTime;
                return this;
            }

            /**
             * <p>The pretax amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The pretax amount of the order in local currency.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxAmountLocal(String pretaxAmountLocal) {
                this.pretaxAmountLocal = pretaxAmountLocal;
                return this;
            }

            /**
             * <p>The pretax gross amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxGrossAmount(String pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * <p>The code of the main service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The type of the main service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the associated order.</p>
             * 
             * <strong>example:</strong>
             * <p>234535345345342</p>
             */
            public Builder relatedOrderId(String relatedOrderId) {
                this.relatedOrderId = relatedOrderId;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>Subscription: subscription</li>
             * <li>PayAsYouGo: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * <p>The tax of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tax(String tax) {
                this.tax = tax;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrdersResponseBody</p>
     */
    public static class OrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private java.util.List<Order> order;

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
        public java.util.List<Order> getOrder() {
            return this.order;
        }

        public static final class Builder {
            private java.util.List<Order> order; 

            /**
             * Order.
             */
            public Builder order(java.util.List<Order> order) {
                this.order = order;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrdersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("OrderList")
        private OrderList orderList;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The orders returned.</p>
             */
            public Builder orderList(OrderList orderList) {
                this.orderList = orderList;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
