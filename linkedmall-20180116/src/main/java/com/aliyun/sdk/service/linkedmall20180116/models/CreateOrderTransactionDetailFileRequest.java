// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link CreateOrderTransactionDetailFileRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderTransactionDetailFileRequest</p>
 */
public class CreateOrderTransactionDetailFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    private String channelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateEndTime")
    private String createEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateStartTime")
    private String createStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemId")
    private String itemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LmShopId")
    private String lmShopId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private String orderStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PayStatus")
    private String payStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaymentEndTime")
    private String paymentEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaymentStartTime")
    private String paymentStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PoCode")
    private String poCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundEndTime")
    private String refundEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundStartTime")
    private String refundStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SellerId")
    private String sellerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SellerName")
    private String sellerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SettlementNode")
    private String settlementNode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopName")
    private String shopName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbMainOrderId")
    private String tbMainOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantName")
    private String tenantName;

    private CreateOrderTransactionDetailFileRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizName = builder.bizName;
        this.channelName = builder.channelName;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.itemId = builder.itemId;
        this.lmShopId = builder.lmShopId;
        this.orderStatus = builder.orderStatus;
        this.payStatus = builder.payStatus;
        this.paymentEndTime = builder.paymentEndTime;
        this.paymentStartTime = builder.paymentStartTime;
        this.poCode = builder.poCode;
        this.refundEndTime = builder.refundEndTime;
        this.refundStartTime = builder.refundStartTime;
        this.sellerId = builder.sellerId;
        this.sellerName = builder.sellerName;
        this.settlementNode = builder.settlementNode;
        this.shopName = builder.shopName;
        this.tbMainOrderId = builder.tbMainOrderId;
        this.tenantId = builder.tenantId;
        this.tenantName = builder.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderTransactionDetailFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return lmShopId
     */
    public String getLmShopId() {
        return this.lmShopId;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @return payStatus
     */
    public String getPayStatus() {
        return this.payStatus;
    }

    /**
     * @return paymentEndTime
     */
    public String getPaymentEndTime() {
        return this.paymentEndTime;
    }

    /**
     * @return paymentStartTime
     */
    public String getPaymentStartTime() {
        return this.paymentStartTime;
    }

    /**
     * @return poCode
     */
    public String getPoCode() {
        return this.poCode;
    }

    /**
     * @return refundEndTime
     */
    public String getRefundEndTime() {
        return this.refundEndTime;
    }

    /**
     * @return refundStartTime
     */
    public String getRefundStartTime() {
        return this.refundStartTime;
    }

    /**
     * @return sellerId
     */
    public String getSellerId() {
        return this.sellerId;
    }

    /**
     * @return sellerName
     */
    public String getSellerName() {
        return this.sellerName;
    }

    /**
     * @return settlementNode
     */
    public String getSettlementNode() {
        return this.settlementNode;
    }

    /**
     * @return shopName
     */
    public String getShopName() {
        return this.shopName;
    }

    /**
     * @return tbMainOrderId
     */
    public String getTbMainOrderId() {
        return this.tbMainOrderId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    public static final class Builder extends Request.Builder<CreateOrderTransactionDetailFileRequest, Builder> {
        private String bizId; 
        private String bizName; 
        private String channelName; 
        private String createEndTime; 
        private String createStartTime; 
        private String itemId; 
        private String lmShopId; 
        private String orderStatus; 
        private String payStatus; 
        private String paymentEndTime; 
        private String paymentStartTime; 
        private String poCode; 
        private String refundEndTime; 
        private String refundStartTime; 
        private String sellerId; 
        private String sellerName; 
        private String settlementNode; 
        private String shopName; 
        private String tbMainOrderId; 
        private String tenantId; 
        private String tenantName; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderTransactionDetailFileRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizName = request.bizName;
            this.channelName = request.channelName;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.itemId = request.itemId;
            this.lmShopId = request.lmShopId;
            this.orderStatus = request.orderStatus;
            this.payStatus = request.payStatus;
            this.paymentEndTime = request.paymentEndTime;
            this.paymentStartTime = request.paymentStartTime;
            this.poCode = request.poCode;
            this.refundEndTime = request.refundEndTime;
            this.refundStartTime = request.refundStartTime;
            this.sellerId = request.sellerId;
            this.sellerName = request.sellerName;
            this.settlementNode = request.settlementNode;
            this.shopName = request.shopName;
            this.tbMainOrderId = request.tbMainOrderId;
            this.tenantId = request.tenantId;
            this.tenantName = request.tenantName;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * ChannelName.
         */
        public Builder channelName(String channelName) {
            this.putBodyParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * CreateEndTime.
         */
        public Builder createEndTime(String createEndTime) {
            this.putBodyParameter("CreateEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * CreateStartTime.
         */
        public Builder createStartTime(String createStartTime) {
            this.putBodyParameter("CreateStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.putBodyParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * LmShopId.
         */
        public Builder lmShopId(String lmShopId) {
            this.putBodyParameter("LmShopId", lmShopId);
            this.lmShopId = lmShopId;
            return this;
        }

        /**
         * OrderStatus.
         */
        public Builder orderStatus(String orderStatus) {
            this.putBodyParameter("OrderStatus", orderStatus);
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * PayStatus.
         */
        public Builder payStatus(String payStatus) {
            this.putBodyParameter("PayStatus", payStatus);
            this.payStatus = payStatus;
            return this;
        }

        /**
         * PaymentEndTime.
         */
        public Builder paymentEndTime(String paymentEndTime) {
            this.putBodyParameter("PaymentEndTime", paymentEndTime);
            this.paymentEndTime = paymentEndTime;
            return this;
        }

        /**
         * PaymentStartTime.
         */
        public Builder paymentStartTime(String paymentStartTime) {
            this.putBodyParameter("PaymentStartTime", paymentStartTime);
            this.paymentStartTime = paymentStartTime;
            return this;
        }

        /**
         * PoCode.
         */
        public Builder poCode(String poCode) {
            this.putBodyParameter("PoCode", poCode);
            this.poCode = poCode;
            return this;
        }

        /**
         * RefundEndTime.
         */
        public Builder refundEndTime(String refundEndTime) {
            this.putBodyParameter("RefundEndTime", refundEndTime);
            this.refundEndTime = refundEndTime;
            return this;
        }

        /**
         * RefundStartTime.
         */
        public Builder refundStartTime(String refundStartTime) {
            this.putBodyParameter("RefundStartTime", refundStartTime);
            this.refundStartTime = refundStartTime;
            return this;
        }

        /**
         * SellerId.
         */
        public Builder sellerId(String sellerId) {
            this.putBodyParameter("SellerId", sellerId);
            this.sellerId = sellerId;
            return this;
        }

        /**
         * SellerName.
         */
        public Builder sellerName(String sellerName) {
            this.putBodyParameter("SellerName", sellerName);
            this.sellerName = sellerName;
            return this;
        }

        /**
         * SettlementNode.
         */
        public Builder settlementNode(String settlementNode) {
            this.putBodyParameter("SettlementNode", settlementNode);
            this.settlementNode = settlementNode;
            return this;
        }

        /**
         * ShopName.
         */
        public Builder shopName(String shopName) {
            this.putBodyParameter("ShopName", shopName);
            this.shopName = shopName;
            return this;
        }

        /**
         * TbMainOrderId.
         */
        public Builder tbMainOrderId(String tbMainOrderId) {
            this.putBodyParameter("TbMainOrderId", tbMainOrderId);
            this.tbMainOrderId = tbMainOrderId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TenantName.
         */
        public Builder tenantName(String tenantName) {
            this.putBodyParameter("TenantName", tenantName);
            this.tenantName = tenantName;
            return this;
        }

        @Override
        public CreateOrderTransactionDetailFileRequest build() {
            return new CreateOrderTransactionDetailFileRequest(this);
        } 

    } 

}
