// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetCustomerOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomerOrdersResponseBody</p>
 */
public class GetCustomerOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String msg; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(GetCustomerOrdersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.msg = model.msg;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message. The value is the same as the Code parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The message. The value is the same as the Code parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>23309219-4A34-589D-A3E0-9B2A3BFFD24F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>200: OK.</li>
         * <li>201: Parameter error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetCustomerOrdersResponseBody build() {
            return new GetCustomerOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomerOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomerOrdersResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.customerAccount = model.customerAccount;
                this.customerManager = model.customerManager;
                this.customerNo = model.customerNo;
                this.orderId = model.orderId;
                this.orderSource = model.orderSource;
                this.orderStatus = model.orderStatus;
                this.orderType = model.orderType;
                this.originalCost = model.originalCost;
                this.paymentMethod = model.paymentMethod;
                this.paymentTime = model.paymentTime;
                this.pretaxCost = model.pretaxCost;
                this.productDetail = model.productDetail;
                this.productType = model.productType;
                this.timeToOrder = model.timeToOrder;
            } 

            /**
             * <p>The customer account.</p>
             * 
             * <strong>example:</strong>
             * <p>test_123</p>
             */
            public Builder customerAccount(String customerAccount) {
                this.customerAccount = customerAccount;
                return this;
            }

            /**
             * <p>The account manager.</p>
             * 
             * <strong>example:</strong>
             * <p>myBd</p>
             */
            public Builder customerManager(String customerManager) {
                this.customerManager = customerManager;
                return this;
            }

            /**
             * <p>The customer UID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder customerNo(Long customerNo) {
                this.customerNo = customerNo;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>236414227150922</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The order source. Valid values:</p>
             * <ul>
             * <li>0: Regular customer.</li>
             * <li>1: Enterprise customer.</li>
             * <li>2: Tier-2 distributor.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder orderSource(String orderSource) {
                this.orderSource = orderSource;
                return this;
            }

            /**
             * <p>The order status. Valid values:</p>
             * <ul>
             * <li>1: Unpaid.</li>
             * <li>2: Canceled.</li>
             * <li>3: Paid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * <p>The order type. Valid values:</p>
             * <ul>
             * <li>BUY: New purchase.</li>
             * <li>UPGRADE: Upgrade.</li>
             * <li>DOWNGRADE: Downgrade.</li>
             * <li>RENEW: Renewal.</li>
             * <li>REFUND: Refund.</li>
             * <li>OTHERS: Others.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUY</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The original order price.</p>
             * 
             * <strong>example:</strong>
             * <p>3.92</p>
             */
            public Builder originalCost(Double originalCost) {
                this.originalCost = originalCost;
                return this;
            }

            /**
             * <p>The payment method.</p>
             * 
             * <strong>example:</strong>
             * <p>3:32</p>
             */
            public Builder paymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }

            /**
             * <p>The payment time. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-13 13:02:02</p>
             */
            public Builder paymentTime(String paymentTime) {
                this.paymentTime = paymentTime;
                return this;
            }

            /**
             * <p>The payable amount.</p>
             * 
             * <strong>example:</strong>
             * <p>3.92</p>
             */
            public Builder pretaxCost(Double pretaxCost) {
                this.pretaxCost = pretaxCost;
                return this;
            }

            /**
             * <p>The product details.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * <p>The product detail code.</p>
             * 
             * <strong>example:</strong>
             * <p>snapshot</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The order placement time. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-13 13:02:02</p>
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
