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
 * {@link CreateOrderWithDesignatedTbUidRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderWithDesignatedTbUidRequest</p>
 */
public class CreateOrderWithDesignatedTbUidRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuyerMessages")
    private String buyerMessages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryInfo")
    private String deliveryInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderExpireTime")
    private Long orderExpireTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderItems;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutTradeId")
    private String outTradeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tbAccountType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbUserId")
    private Long tbUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    private CreateOrderWithDesignatedTbUidRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.buyerMessages = builder.buyerMessages;
        this.deliveryAddress = builder.deliveryAddress;
        this.deliveryInfo = builder.deliveryInfo;
        this.extInfo = builder.extInfo;
        this.orderExpireTime = builder.orderExpireTime;
        this.orderItems = builder.orderItems;
        this.outTradeId = builder.outTradeId;
        this.tbAccountType = builder.tbAccountType;
        this.tbUserId = builder.tbUserId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderWithDesignatedTbUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return buyerMessages
     */
    public String getBuyerMessages() {
        return this.buyerMessages;
    }

    /**
     * @return deliveryAddress
     */
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /**
     * @return deliveryInfo
     */
    public String getDeliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return orderExpireTime
     */
    public Long getOrderExpireTime() {
        return this.orderExpireTime;
    }

    /**
     * @return orderItems
     */
    public String getOrderItems() {
        return this.orderItems;
    }

    /**
     * @return outTradeId
     */
    public String getOutTradeId() {
        return this.outTradeId;
    }

    /**
     * @return tbAccountType
     */
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    /**
     * @return tbUserId
     */
    public Long getTbUserId() {
        return this.tbUserId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static final class Builder extends Request.Builder<CreateOrderWithDesignatedTbUidRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String buyerMessages; 
        private String deliveryAddress; 
        private String deliveryInfo; 
        private String extInfo; 
        private Long orderExpireTime; 
        private String orderItems; 
        private String outTradeId; 
        private String tbAccountType; 
        private Long tbUserId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderWithDesignatedTbUidRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.buyerMessages = request.buyerMessages;
            this.deliveryAddress = request.deliveryAddress;
            this.deliveryInfo = request.deliveryInfo;
            this.extInfo = request.extInfo;
            this.orderExpireTime = request.orderExpireTime;
            this.orderItems = request.orderItems;
            this.outTradeId = request.outTradeId;
            this.tbAccountType = request.tbAccountType;
            this.tbUserId = request.tbUserId;
            this.thirdPartyUserId = request.thirdPartyUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******05</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BuyerMessages.
         */
        public Builder buyerMessages(String buyerMessages) {
            this.putBodyParameter("BuyerMessages", buyerMessages);
            this.buyerMessages = buyerMessages;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deliveryAddress(String deliveryAddress) {
            this.putBodyParameter("DeliveryAddress", deliveryAddress);
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        /**
         * DeliveryInfo.
         */
        public Builder deliveryInfo(String deliveryInfo) {
            this.putBodyParameter("DeliveryInfo", deliveryInfo);
            this.deliveryInfo = deliveryInfo;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * OrderExpireTime.
         */
        public Builder orderExpireTime(Long orderExpireTime) {
            this.putBodyParameter("OrderExpireTime", orderExpireTime);
            this.orderExpireTime = orderExpireTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;lmItemId&quot;:&quot;10028102-655199865844&quot;,&quot;number&quot;:1,&quot;skuId&quot;: 4900752886354}]</p>
         */
        public Builder orderItems(String orderItems) {
            this.putBodyParameter("OrderItems", orderItems);
            this.orderItems = orderItems;
            return this;
        }

        /**
         * OutTradeId.
         */
        public Builder outTradeId(String outTradeId) {
            this.putBodyParameter("OutTradeId", outTradeId);
            this.outTradeId = outTradeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ANONY</p>
         */
        public Builder tbAccountType(String tbAccountType) {
            this.putBodyParameter("TbAccountType", tbAccountType);
            this.tbAccountType = tbAccountType;
            return this;
        }

        /**
         * TbUserId.
         */
        public Builder tbUserId(Long tbUserId) {
            this.putBodyParameter("TbUserId", tbUserId);
            this.tbUserId = tbUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>321******211</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putBodyParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public CreateOrderWithDesignatedTbUidRequest build() {
            return new CreateOrderWithDesignatedTbUidRequest(this);
        } 

    } 

}
