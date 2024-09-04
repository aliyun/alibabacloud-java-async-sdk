// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomerOrdersResponseBody</p>
 */
public class GetCustomerOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetCustomerOrdersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.msg = builder.msg;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerOrdersResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String msg; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

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
        public Builder data(java.util.List < Data> data) {
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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Id of the request
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetCustomerOrdersResponseBody build() {
            return new GetCustomerOrdersResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerAccount")
        private String customerAccount;

        @com.aliyun.core.annotation.NameInMap("CustomerManager")
        private String customerManager;

        @com.aliyun.core.annotation.NameInMap("CustomerNo")
        private Long customerNo;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("OrderSource")
        private String orderSource;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("OriginalCost")
        private Double originalCost;

        @com.aliyun.core.annotation.NameInMap("PaymentMethod")
        private String paymentMethod;

        @com.aliyun.core.annotation.NameInMap("PaymentTime")
        private String paymentTime;

        @com.aliyun.core.annotation.NameInMap("PretaxCost")
        private Double pretaxCost;

        @com.aliyun.core.annotation.NameInMap("ProductDetail")
        private String productDetail;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("TimeToOrder")
        private String timeToOrder;

        private Data(Builder builder) {
            this.customerAccount = builder.customerAccount;
            this.customerManager = builder.customerManager;
            this.customerNo = builder.customerNo;
            this.orderId = builder.orderId;
            this.orderSource = builder.orderSource;
            this.orderStatus = builder.orderStatus;
            this.orderType = builder.orderType;
            this.originalCost = builder.originalCost;
            this.paymentMethod = builder.paymentMethod;
            this.paymentTime = builder.paymentTime;
            this.pretaxCost = builder.pretaxCost;
            this.productDetail = builder.productDetail;
            this.productType = builder.productType;
            this.timeToOrder = builder.timeToOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customerAccount
         */
        public String getCustomerAccount() {
            return this.customerAccount;
        }

        /**
         * @return customerManager
         */
        public String getCustomerManager() {
            return this.customerManager;
        }

        /**
         * @return customerNo
         */
        public Long getCustomerNo() {
            return this.customerNo;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderSource
         */
        public String getOrderSource() {
            return this.orderSource;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return originalCost
         */
        public Double getOriginalCost() {
            return this.originalCost;
        }

        /**
         * @return paymentMethod
         */
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        /**
         * @return paymentTime
         */
        public String getPaymentTime() {
            return this.paymentTime;
        }

        /**
         * @return pretaxCost
         */
        public Double getPretaxCost() {
            return this.pretaxCost;
        }

        /**
         * @return productDetail
         */
        public String getProductDetail() {
            return this.productDetail;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return timeToOrder
         */
        public String getTimeToOrder() {
            return this.timeToOrder;
        }

        public static final class Builder {
            private String customerAccount; 
            private String customerManager; 
            private Long customerNo; 
            private Long orderId; 
            private String orderSource; 
            private Integer orderStatus; 
            private String orderType; 
            private Double originalCost; 
            private String paymentMethod; 
            private String paymentTime; 
            private Double pretaxCost; 
            private String productDetail; 
            private String productType; 
            private String timeToOrder; 

            /**
             * CustomerAccount.
             */
            public Builder customerAccount(String customerAccount) {
                this.customerAccount = customerAccount;
                return this;
            }

            /**
             * CustomerManager.
             */
            public Builder customerManager(String customerManager) {
                this.customerManager = customerManager;
                return this;
            }

            /**
             * CustomerNo.
             */
            public Builder customerNo(Long customerNo) {
                this.customerNo = customerNo;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrderSource.
             */
            public Builder orderSource(String orderSource) {
                this.orderSource = orderSource;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
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
             * OriginalCost.
             */
            public Builder originalCost(Double originalCost) {
                this.originalCost = originalCost;
                return this;
            }

            /**
             * PaymentMethod.
             */
            public Builder paymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
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
             * PretaxCost.
             */
            public Builder pretaxCost(Double pretaxCost) {
                this.pretaxCost = pretaxCost;
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
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * TimeToOrder.
             */
            public Builder timeToOrder(String timeToOrder) {
                this.timeToOrder = timeToOrder;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
