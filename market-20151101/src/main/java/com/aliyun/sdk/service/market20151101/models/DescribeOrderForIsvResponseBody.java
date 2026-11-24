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
    private java.util.List<String> instanceIds;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getInstanceIds() {
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
        private java.util.List<String> instanceIds; 
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

        private Builder() {
        } 

        private Builder(DescribeOrderForIsvResponseBody model) {
            this.accountQuantity = model.accountQuantity;
            this.aliUid = model.aliUid;
            this.components = model.components;
            this.couponPrice = model.couponPrice;
            this.createdOn = model.createdOn;
            this.instanceIds = model.instanceIds;
            this.orderId = model.orderId;
            this.orderStatus = model.orderStatus;
            this.orderType = model.orderType;
            this.originalPrice = model.originalPrice;
            this.paidOn = model.paidOn;
            this.payStatus = model.payStatus;
            this.paymentPrice = model.paymentPrice;
            this.periodType = model.periodType;
            this.productCode = model.productCode;
            this.productName = model.productName;
            this.productSkuCode = model.productSkuCode;
            this.quantity = model.quantity;
            this.requestId = model.requestId;
            this.totalPrice = model.totalPrice;
        } 

        /**
         * <p>The number of accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder accountQuantity(Long accountQuantity) {
            this.accountQuantity = accountQuantity;
            return this;
        }

        /**
         * <p>The unique identifier of the Alibaba Cloud user (aliyunPK).</p>
         * 
         * <strong>example:</strong>
         * <p>190311111111****</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The order module information. The metric description for the parameters in the example is as follows:</p>
         * <ul>
         * <li>package_quantity: the number of usage times (a module specific to API products)</li>
         * <li>package_version: the version</li>
         * <li>ord_time: the duration</li>
         * <li>order_num: the quantity</li>
         * <li>code: the module code</li>
         * <li>globarKey: the module key</li>
         * <li>name: the module name</li>
         * <li>value: the module value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;package_version&quot;:{&quot;code&quot;:&quot;package_version&quot;,&quot;globarKey&quot;:&quot;cmgj0<em><em><strong><strong>8_package_version_package_version_yuncode4176</strong></strong></em>1&quot;,&quot;name&quot;:&quot;0.01&quot;,&quot;value&quot;:&quot;yuncode4176</em><strong><strong>1&quot;},&quot;ord_time&quot;:{&quot;code&quot;:&quot;ord_time&quot;,&quot;globarKey&quot;:&quot;cmgj0</strong></strong><strong>8_ord_time_ord_time_1:Month&quot;,&quot;name&quot;:&quot;1 month&quot;,&quot;value&quot;:&quot;1:Month&quot;},&quot;order_num&quot;:{&quot;code&quot;:&quot;order_num&quot;,&quot;globarKey&quot;:&quot;cmgj0</strong>****8_order_num_order_num_1&quot;,&quot;name&quot;:&quot;1&quot;,&quot;value&quot;:&quot;1&quot;}}</p>
         */
        public Builder components(Object components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The amount of vouchers used, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder couponPrice(Float couponPrice) {
            this.couponPrice = couponPrice;
            return this;
        }

        /**
         * <p>The time when the order was placed.</p>
         * 
         * <strong>example:</strong>
         * <p>1531191564000</p>
         */
        public Builder createdOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * <p>List</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202211111111111</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The order status. Valid values:</p>
         * <ul>
         * <li>NORMAL: Normal.</li>
         * <li>REFUND: Refunded.</li>
         * <li>DELETE: Voided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * <p>The order type. Valid values:</p>
         * <ul>
         * <li>NEW: New purchase order.</li>
         * <li>RENEW: Renewal order.</li>
         * <li>TRIAL: Trial order.</li>
         * <li>UPGRADE: Upgrade order.</li>
         * <li>DOWNGRADE: Downgrade order.</li>
         * <li>PURCHASE: Conversion order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NEW</p>
         */
        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The original price of the order, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        public Builder originalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * <p>The payment time.</p>
         * 
         * <strong>example:</strong>
         * <p>1531191675000</p>
         */
        public Builder paidOn(Long paidOn) {
            this.paidOn = paidOn;
            return this;
        }

        /**
         * <p>The payment status. Valid values:</p>
         * <ul>
         * <li>PAID: Paid.</li>
         * <li>UNPAID: Unpaid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAID</p>
         */
        public Builder payStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }

        /**
         * <p>The actual payment amount, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder paymentPrice(Float paymentPrice) {
            this.paymentPrice = paymentPrice;
            return this;
        }

        /**
         * <p>The time unit for prepaid orders. Valid values:</p>
         * <ul>
         * <li>MONTH: one month</li>
         * <li>SEASON: one quarter</li>
         * <li>HALFYEAR: half a year</li>
         * <li>YEAR: one year</li>
         * <li>TWOYEARS: two years</li>
         * <li>ONCE: one-time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MONTH</p>
         */
        public Builder periodType(String periodType) {
            this.periodType = periodType;
            return this;
        }

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj02****</p>
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The name of the subscribed product.</p>
         * 
         * <strong>example:</strong>
         * <p>SaaS service product</p>
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * <p>The SKU code of the subscribed product.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj02****-prepay</p>
         */
        public Builder productSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }

        /**
         * <p>The quantity of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The request ID. This ID is used for troubleshooting when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF60BEC-<strong><strong>-</strong></strong>-****-270359FB54A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total receivable amount of the order, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
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
