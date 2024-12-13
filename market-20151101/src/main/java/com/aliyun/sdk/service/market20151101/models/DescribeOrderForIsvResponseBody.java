// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOrderForIsvResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrderForIsvResponseBody</p>
 */
public class DescribeOrderForIsvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountQuantity")
    private Long accountQuantity;

    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("Components")
    private Object components;

    @com.aliyun.core.annotation.NameInMap("CouponPrice")
    private Float couponPrice;

    @com.aliyun.core.annotation.NameInMap("CreatedOn")
    private Long createdOn;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private String orderStatus;

    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.NameInMap("OriginalPrice")
    private Float originalPrice;

    @com.aliyun.core.annotation.NameInMap("PaidOn")
    private Long paidOn;

    @com.aliyun.core.annotation.NameInMap("PayStatus")
    private String payStatus;

    @com.aliyun.core.annotation.NameInMap("PaymentPrice")
    private Float paymentPrice;

    @com.aliyun.core.annotation.NameInMap("PeriodType")
    private String periodType;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("ProductSkuCode")
    private String productSkuCode;

    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPrice")
    private Float totalPrice;

    private DescribeOrderForIsvResponseBody(Builder builder) {
        this.accountQuantity = builder.accountQuantity;
        this.aliUid = builder.aliUid;
        this.components = builder.components;
        this.couponPrice = builder.couponPrice;
        this.createdOn = builder.createdOn;
        this.instanceIds = builder.instanceIds;
        this.orderId = builder.orderId;
        this.orderStatus = builder.orderStatus;
        this.orderType = builder.orderType;
        this.originalPrice = builder.originalPrice;
        this.paidOn = builder.paidOn;
        this.payStatus = builder.payStatus;
        this.paymentPrice = builder.paymentPrice;
        this.periodType = builder.periodType;
        this.productCode = builder.productCode;
        this.productName = builder.productName;
        this.productSkuCode = builder.productSkuCode;
        this.quantity = builder.quantity;
        this.requestId = builder.requestId;
        this.totalPrice = builder.totalPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrderForIsvResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountQuantity
     */
    public Long getAccountQuantity() {
        return this.accountQuantity;
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return components
     */
    public Object getComponents() {
        return this.components;
    }

    /**
     * @return couponPrice
     */
    public Float getCouponPrice() {
        return this.couponPrice;
    }

    /**
     * @return createdOn
     */
    public Long getCreatedOn() {
        return this.createdOn;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
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
     * @return originalPrice
     */
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * @return paidOn
     */
    public Long getPaidOn() {
        return this.paidOn;
    }

    /**
     * @return payStatus
     */
    public String getPayStatus() {
        return this.payStatus;
    }

    /**
     * @return paymentPrice
     */
    public Float getPaymentPrice() {
        return this.paymentPrice;
    }

    /**
     * @return periodType
     */
    public String getPeriodType() {
        return this.periodType;
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
     * @return productSkuCode
     */
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalPrice
     */
    public Float getTotalPrice() {
        return this.totalPrice;
    }

    public static final class Builder {
        private Long accountQuantity; 
        private Long aliUid; 
        private Object components; 
        private Float couponPrice; 
        private Long createdOn; 
        private java.util.List < String > instanceIds; 
        private Long orderId; 
        private String orderStatus; 
        private String orderType; 
        private Float originalPrice; 
        private Long paidOn; 
        private String payStatus; 
        private Float paymentPrice; 
        private String periodType; 
        private String productCode; 
        private String productName; 
        private String productSkuCode; 
        private Integer quantity; 
        private String requestId; 
        private Float totalPrice; 

        /**
         * AccountQuantity.
         */
        public Builder accountQuantity(Long accountQuantity) {
            this.accountQuantity = accountQuantity;
            return this;
        }

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * Components.
         */
        public Builder components(Object components) {
            this.components = components;
            return this;
        }

        /**
         * CouponPrice.
         */
        public Builder couponPrice(Float couponPrice) {
            this.couponPrice = couponPrice;
            return this;
        }

        /**
         * CreatedOn.
         */
        public Builder createdOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * <p>List</p>
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.instanceIds = instanceIds;
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
         * OriginalPrice.
         */
        public Builder originalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * PaidOn.
         */
        public Builder paidOn(Long paidOn) {
            this.paidOn = paidOn;
            return this;
        }

        /**
         * PayStatus.
         */
        public Builder payStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }

        /**
         * PaymentPrice.
         */
        public Builder paymentPrice(Float paymentPrice) {
            this.paymentPrice = paymentPrice;
            return this;
        }

        /**
         * PeriodType.
         */
        public Builder periodType(String periodType) {
            this.periodType = periodType;
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
         * ProductSkuCode.
         */
        public Builder productSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
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
         * TotalPrice.
         */
        public Builder totalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public DescribeOrderForIsvResponseBody build() {
            return new DescribeOrderForIsvResponseBody(this);
        } 

    } 

}
