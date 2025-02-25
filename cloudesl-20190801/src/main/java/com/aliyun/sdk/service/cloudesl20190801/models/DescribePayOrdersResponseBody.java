// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePayOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePayOrdersResponseBody</p>
 */
public class DescribePayOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PayOrders")
    private PayOrders payOrders;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePayOrdersResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.payOrders = builder.payOrders;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePayOrdersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return payOrders
     */
    public PayOrders getPayOrders() {
        return this.payOrders;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private PayOrders payOrders; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * PayOrders.
         */
        public Builder payOrders(PayOrders payOrders) {
            this.payOrders = payOrders;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePayOrdersResponseBody build() {
            return new DescribePayOrdersResponseBody(this);
        } 

    } 

    public static class PayOrderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("DetailName")
        private String detailName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtPay")
        private String gmtPay;

        @com.aliyun.core.annotation.NameInMap("IsAccepted")
        private Boolean isAccepted;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private String orderStatus;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("PayAmount")
        private Float payAmount;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        private PayOrderInfo(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.detailName = builder.detailName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtPay = builder.gmtPay;
            this.isAccepted = builder.isAccepted;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.orderType = builder.orderType;
            this.originalAmount = builder.originalAmount;
            this.payAmount = builder.payAmount;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PayOrderInfo create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return detailName
         */
        public String getDetailName() {
            return this.detailName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtPay
         */
        public String getGmtPay() {
            return this.gmtPay;
        }

        /**
         * @return isAccepted
         */
        public Boolean getIsAccepted() {
            return this.isAccepted;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return payAmount
         */
        public Float getPayAmount() {
            return this.payAmount;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private String commodityCode; 
            private String commodityName; 
            private String detailName; 
            private String gmtCreate; 
            private String gmtPay; 
            private Boolean isAccepted; 
            private String orderId; 
            private String orderStatus; 
            private String orderType; 
            private Float originalAmount; 
            private Float payAmount; 
            private Integer quantity; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * DetailName.
             */
            public Builder detailName(String detailName) {
                this.detailName = detailName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtPay.
             */
            public Builder gmtPay(String gmtPay) {
                this.gmtPay = gmtPay;
                return this;
            }

            /**
             * IsAccepted.
             */
            public Builder isAccepted(Boolean isAccepted) {
                this.isAccepted = isAccepted;
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
             * OrderStatus.
             */
            public Builder orderStatus(String orderStatus) {
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
             * OriginalAmount.
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * PayAmount.
             */
            public Builder payAmount(Float payAmount) {
                this.payAmount = payAmount;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            public PayOrderInfo build() {
                return new PayOrderInfo(this);
            } 

        } 

    }
    public static class PayOrders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PayOrderInfo")
        private java.util.List < PayOrderInfo> payOrderInfo;

        private PayOrders(Builder builder) {
            this.payOrderInfo = builder.payOrderInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PayOrders create() {
            return builder().build();
        }

        /**
         * @return payOrderInfo
         */
        public java.util.List < PayOrderInfo> getPayOrderInfo() {
            return this.payOrderInfo;
        }

        public static final class Builder {
            private java.util.List < PayOrderInfo> payOrderInfo; 

            /**
             * PayOrderInfo.
             */
            public Builder payOrderInfo(java.util.List < PayOrderInfo> payOrderInfo) {
                this.payOrderInfo = payOrderInfo;
                return this;
            }

            public PayOrders build() {
                return new PayOrders(this);
            } 

        } 

    }
}
