// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link GetCustomerOrderListResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomerOrderListResponseBody</p>
 */
public class GetCustomerOrderListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

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

    private GetCustomerOrderListResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerOrderListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(GetCustomerOrderListResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetCustomerOrderListResponseBody build() {
            return new GetCustomerOrderListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomerOrderListResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomerOrderListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AmountDiscount")
        private Double amountDiscount;

        @com.aliyun.core.annotation.NameInMap("AmountDue")
        private Double amountDue;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("CustomerAccount")
        private String customerAccount;

        @com.aliyun.core.annotation.NameInMap("CustomerClassification")
        private String customerClassification;

        @com.aliyun.core.annotation.NameInMap("CustomerUid")
        private Long customerUid;

        @com.aliyun.core.annotation.NameInMap("DeductedAmountByCoupons")
        private Double deductedAmountByCoupons;

        @com.aliyun.core.annotation.NameInMap("DiscountedPrice")
        private Double discountedPrice;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("PaidAt")
        private String paidAt;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RamAccountForCustomerManagers")
        private java.util.List<String> ramAccountForCustomerManagers;

        private Data(Builder builder) {
            this.amountDiscount = builder.amountDiscount;
            this.amountDue = builder.amountDue;
            this.createdAt = builder.createdAt;
            this.customerAccount = builder.customerAccount;
            this.customerClassification = builder.customerClassification;
            this.customerUid = builder.customerUid;
            this.deductedAmountByCoupons = builder.deductedAmountByCoupons;
            this.discountedPrice = builder.discountedPrice;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.orderType = builder.orderType;
            this.paidAt = builder.paidAt;
            this.payType = builder.payType;
            this.price = builder.price;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.projectId = builder.projectId;
            this.ramAccountForCustomerManagers = builder.ramAccountForCustomerManagers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return amountDiscount
         */
        public Double getAmountDiscount() {
            return this.amountDiscount;
        }

        /**
         * @return amountDue
         */
        public Double getAmountDue() {
            return this.amountDue;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return customerAccount
         */
        public String getCustomerAccount() {
            return this.customerAccount;
        }

        /**
         * @return customerClassification
         */
        public String getCustomerClassification() {
            return this.customerClassification;
        }

        /**
         * @return customerUid
         */
        public Long getCustomerUid() {
            return this.customerUid;
        }

        /**
         * @return deductedAmountByCoupons
         */
        public Double getDeductedAmountByCoupons() {
            return this.deductedAmountByCoupons;
        }

        /**
         * @return discountedPrice
         */
        public Double getDiscountedPrice() {
            return this.discountedPrice;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
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
         * @return paidAt
         */
        public String getPaidAt() {
            return this.paidAt;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return ramAccountForCustomerManagers
         */
        public java.util.List<String> getRamAccountForCustomerManagers() {
            return this.ramAccountForCustomerManagers;
        }

        public static final class Builder {
            private Double amountDiscount; 
            private Double amountDue; 
            private String createdAt; 
            private String customerAccount; 
            private String customerClassification; 
            private Long customerUid; 
            private Double deductedAmountByCoupons; 
            private Double discountedPrice; 
            private Long orderId; 
            private Integer orderStatus; 
            private String orderType; 
            private String paidAt; 
            private Integer payType; 
            private Double price; 
            private String productCode; 
            private String productName; 
            private Long projectId; 
            private java.util.List<String> ramAccountForCustomerManagers; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.amountDiscount = model.amountDiscount;
                this.amountDue = model.amountDue;
                this.createdAt = model.createdAt;
                this.customerAccount = model.customerAccount;
                this.customerClassification = model.customerClassification;
                this.customerUid = model.customerUid;
                this.deductedAmountByCoupons = model.deductedAmountByCoupons;
                this.discountedPrice = model.discountedPrice;
                this.orderId = model.orderId;
                this.orderStatus = model.orderStatus;
                this.orderType = model.orderType;
                this.paidAt = model.paidAt;
                this.payType = model.payType;
                this.price = model.price;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.projectId = model.projectId;
                this.ramAccountForCustomerManagers = model.ramAccountForCustomerManagers;
            } 

            /**
             * AmountDiscount.
             */
            public Builder amountDiscount(Double amountDiscount) {
                this.amountDiscount = amountDiscount;
                return this;
            }

            /**
             * AmountDue.
             */
            public Builder amountDue(Double amountDue) {
                this.amountDue = amountDue;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * CustomerAccount.
             */
            public Builder customerAccount(String customerAccount) {
                this.customerAccount = customerAccount;
                return this;
            }

            /**
             * CustomerClassification.
             */
            public Builder customerClassification(String customerClassification) {
                this.customerClassification = customerClassification;
                return this;
            }

            /**
             * CustomerUid.
             */
            public Builder customerUid(Long customerUid) {
                this.customerUid = customerUid;
                return this;
            }

            /**
             * DeductedAmountByCoupons.
             */
            public Builder deductedAmountByCoupons(Double deductedAmountByCoupons) {
                this.deductedAmountByCoupons = deductedAmountByCoupons;
                return this;
            }

            /**
             * DiscountedPrice.
             */
            public Builder discountedPrice(Double discountedPrice) {
                this.discountedPrice = discountedPrice;
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
             * PaidAt.
             */
            public Builder paidAt(String paidAt) {
                this.paidAt = paidAt;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Double price) {
                this.price = price;
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
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * RamAccountForCustomerManagers.
             */
            public Builder ramAccountForCustomerManagers(java.util.List<String> ramAccountForCustomerManagers) {
                this.ramAccountForCustomerManagers = ramAccountForCustomerManagers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
