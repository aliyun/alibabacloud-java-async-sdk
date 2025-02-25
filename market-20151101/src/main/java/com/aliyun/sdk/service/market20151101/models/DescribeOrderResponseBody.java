// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrderResponseBody</p>
 */
public class DescribeOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountQuantity")
    private Long accountQuantity;

    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.Map<String, ?> components;

    @com.aliyun.core.annotation.NameInMap("CouponPrice")
    private Float couponPrice;

    @com.aliyun.core.annotation.NameInMap("CreatedOn")
    private Long createdOn;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private InstanceIds instanceIds;

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

    @com.aliyun.core.annotation.NameInMap("SupplierCompanyName")
    private String supplierCompanyName;

    @com.aliyun.core.annotation.NameInMap("SupplierTelephones")
    private SupplierTelephones supplierTelephones;

    @com.aliyun.core.annotation.NameInMap("TotalPrice")
    private Float totalPrice;

    private DescribeOrderResponseBody(Builder builder) {
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
        this.supplierCompanyName = builder.supplierCompanyName;
        this.supplierTelephones = builder.supplierTelephones;
        this.totalPrice = builder.totalPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrderResponseBody create() {
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
    public java.util.Map<String, ?> getComponents() {
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
    public InstanceIds getInstanceIds() {
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
     * @return supplierCompanyName
     */
    public String getSupplierCompanyName() {
        return this.supplierCompanyName;
    }

    /**
     * @return supplierTelephones
     */
    public SupplierTelephones getSupplierTelephones() {
        return this.supplierTelephones;
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
        private java.util.Map<String, ?> components; 
        private Float couponPrice; 
        private Long createdOn; 
        private InstanceIds instanceIds; 
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
        private String supplierCompanyName; 
        private SupplierTelephones supplierTelephones; 
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
        public Builder components(java.util.Map<String, ?> components) {
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
         * InstanceIds.
         */
        public Builder instanceIds(InstanceIds instanceIds) {
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
         * SupplierCompanyName.
         */
        public Builder supplierCompanyName(String supplierCompanyName) {
            this.supplierCompanyName = supplierCompanyName;
            return this;
        }

        /**
         * SupplierTelephones.
         */
        public Builder supplierTelephones(SupplierTelephones supplierTelephones) {
            this.supplierTelephones = supplierTelephones;
            return this;
        }

        /**
         * TotalPrice.
         */
        public Builder totalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public DescribeOrderResponseBody build() {
            return new DescribeOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOrderResponseBody</p>
     */
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOrderResponseBody</p>
     */
    public static class SupplierTelephones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Telephone")
        private java.util.List<String> telephone;

        private SupplierTelephones(Builder builder) {
            this.telephone = builder.telephone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupplierTelephones create() {
            return builder().build();
        }

        /**
         * @return telephone
         */
        public java.util.List<String> getTelephone() {
            return this.telephone;
        }

        public static final class Builder {
            private java.util.List<String> telephone; 

            /**
             * Telephone.
             */
            public Builder telephone(java.util.List<String> telephone) {
                this.telephone = telephone;
                return this;
            }

            public SupplierTelephones build() {
                return new SupplierTelephones(this);
            } 

        } 

    }
}
