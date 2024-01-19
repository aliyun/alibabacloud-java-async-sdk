// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOutDiscountOrderWithDesignatedTbUidRequest} extends {@link RequestModel}
 *
 * <p>CreateOutDiscountOrderWithDesignatedTbUidRequest</p>
 */
public class CreateOutDiscountOrderWithDesignatedTbUidRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("BuyerMessages")
    private String buyerMessages;

    @Body
    @NameInMap("DeliveryAddress")
    @Validation(required = true)
    private String deliveryAddress;

    @Body
    @NameInMap("DeliveryInfo")
    private String deliveryInfo;

    @Body
    @NameInMap("ExtInfo")
    private String extInfo;

    @Body
    @NameInMap("OrderExpireTime")
    private Long orderExpireTime;

    @Body
    @NameInMap("OrderItems")
    @Validation(required = true)
    private String orderItems;

    @Body
    @NameInMap("OutDiscountInfos")
    private String outDiscountInfos;

    @Body
    @NameInMap("OutTradeId")
    private String outTradeId;

    @Body
    @NameInMap("TbAccountType")
    @Validation(required = true)
    private String tbAccountType;

    @Body
    @NameInMap("TbUserId")
    private Long tbUserId;

    @Body
    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    private String thirdPartyUserId;

    private CreateOutDiscountOrderWithDesignatedTbUidRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.buyerMessages = builder.buyerMessages;
        this.deliveryAddress = builder.deliveryAddress;
        this.deliveryInfo = builder.deliveryInfo;
        this.extInfo = builder.extInfo;
        this.orderExpireTime = builder.orderExpireTime;
        this.orderItems = builder.orderItems;
        this.outDiscountInfos = builder.outDiscountInfos;
        this.outTradeId = builder.outTradeId;
        this.tbAccountType = builder.tbAccountType;
        this.tbUserId = builder.tbUserId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOutDiscountOrderWithDesignatedTbUidRequest create() {
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
     * @return outDiscountInfos
     */
    public String getOutDiscountInfos() {
        return this.outDiscountInfos;
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

    public static final class Builder extends Request.Builder<CreateOutDiscountOrderWithDesignatedTbUidRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String buyerMessages; 
        private String deliveryAddress; 
        private String deliveryInfo; 
        private String extInfo; 
        private Long orderExpireTime; 
        private String orderItems; 
        private String outDiscountInfos; 
        private String outTradeId; 
        private String tbAccountType; 
        private Long tbUserId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOutDiscountOrderWithDesignatedTbUidRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.buyerMessages = request.buyerMessages;
            this.deliveryAddress = request.deliveryAddress;
            this.deliveryInfo = request.deliveryInfo;
            this.extInfo = request.extInfo;
            this.orderExpireTime = request.orderExpireTime;
            this.orderItems = request.orderItems;
            this.outDiscountInfos = request.outDiscountInfos;
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
         * BizId.
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
         * DeliveryAddress.
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
         * OrderItems.
         */
        public Builder orderItems(String orderItems) {
            this.putBodyParameter("OrderItems", orderItems);
            this.orderItems = orderItems;
            return this;
        }

        /**
         * OutDiscountInfos.
         */
        public Builder outDiscountInfos(String outDiscountInfos) {
            this.putBodyParameter("OutDiscountInfos", outDiscountInfos);
            this.outDiscountInfos = outDiscountInfos;
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
         * TbAccountType.
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
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putBodyParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public CreateOutDiscountOrderWithDesignatedTbUidRequest build() {
            return new CreateOutDiscountOrderWithDesignatedTbUidRequest(this);
        } 

    } 

}
